package net.futureclient.client;

import net.futureclient.client.kF;

public class Pe {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            Pe.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.TH;
import net.futureclient.client.WE;
import net.futureclient.client.cf;
import net.futureclient.client.kF;
import net.futureclient.client.oI;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;

public class pe
extends Ha<Pf> {
    public final WE f$d;

    @Override
    public void f$E(Pf pf) {
        if (pf.f$E() == kF.f$M) {
            pe pe2 = 0;
            WE.f$E(0.f$d, WE.f$a(pe2.f$d));
            cf cf2 = null;
            if (WE.f$E(pe2.f$d) != -1 && (cf2 = WE.f$E(0.f$d, false)) == null) {
                cf2 = WE.f$E(0.f$d, true);
            }
            pe pe3 = 0;
            WE.f$E(pe3.f$d, cf2);
            if (WE.f$E(pe3.f$d) != null) {
                float[] fArray = TH.f$E(cf.f$E((cf)WE.f$E(0.f$d)), cf.f$E((cf)WE.f$E(0.f$d)));
                Pf pf2 = pf;
                pf2.f$a(WE.f$a(0.f$d, fArray[0]));
                pf2.f$E(WE.f$E(0.f$d, fArray[1]));
                return;
            }
        } else if (pf.f$E() == kF.f$g && WE.f$E(0.f$d) != null) {
            boolean bl;
            RayTraceResult rayTraceResult = oI.f$E(WE.f$a(0.f$d), WE.f$E(0.f$d));
            boolean bl2 = WE.f$D().player.field_71071_by.currentItem != WE.f$E(0.f$d);
            int n = WE.f$g().player.field_71071_by.currentItem;
            boolean bl3 = bl = !WE.f$m().player.isSneaking() || !CG.f$E(cf.f$E((cf)WE.f$E(0.f$d)));
            if (bl2) {
                WE.f$f().player.field_71071_by.currentItem = WE.f$E(0.f$d);
                WE.f$L().player.connection.sendPacket((Packet)new CPacketHeldItemChange(WE.f$f().player.field_71071_by.currentItem));
            }
            if (bl) {
                WE.f$c().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)WE.f$i().player, CPacketEntityAction.Action.START_SNEAKING));
            }
            WE.f$M().playerController.processRightClickBlock(WE.f$I().player, WE.f$j().world, cf.f$E((cf)WE.f$E(0.f$d)), cf.f$E((cf)WE.f$E(0.f$d)), rayTraceResult.hitVec, EnumHand.MAIN_HAND);
            WE.f$C().player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
            if (bl) {
                WE.f$h().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)WE.f$H().player, CPacketEntityAction.Action.STOP_SNEAKING));
            }
            if (bl2) {
                WE.f$A().player.field_71071_by.currentItem = n;
                WE.f$K().player.connection.sendPacket((Packet)new CPacketHeldItemChange(WE.f$A().player.field_71071_by.currentItem));
            }
        }
    }

    public pe(WE wE) {
        0.f$d = wE;
    }
}
package net.futureclient.client;

import net.futureclient.client.Af;
import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.Ig;
import net.futureclient.client.JF;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.kH;
import net.futureclient.client.vE;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.input.Mouse;

public class pE
extends Ha<Af> {
    public final Ig f$d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(Af af) {
        boolean bl;
        if (Ig.f$M().currentScreen != null) return;
        if (Ig.f$C().playerController == null) {
            return;
        }
        boolean bl2 = false;
        switch (vE.f$d[((JF)((Object)Ig.f$E(0.f$d).f$E())).ordinal()]) {
            case 1: {
                bl = bl2 = Mouse.isButtonDown((int)0);
                break;
            }
            case 2: {
                if (Ig.f$H().objectMouseOver == null) return;
                if (!(Ig.f$h().objectMouseOver.entityHit instanceof EntityLivingBase)) return;
                if (((Boolean)Ig.f$B(0.f$d).f$E()).booleanValue()) {
                    if (Ig.f$K().player.func_184191_r(Ig.f$A().objectMouseOver.entityHit)) return;
                    if (((Boolean)Ig.f$e(0.f$d).f$E()).booleanValue()) {
                        if (Ig.f$B().objectMouseOver.entityHit.isInvisible()) return;
                    }
                    if (((Boolean)Ig.f$a(0.f$d).f$E()).booleanValue()) {
                        if (kH.f$E().f$E().f$E(Ig.f$e().objectMouseOver.entityHit.getName())) return;
                    }
                }
                boolean bl3 = true;
                bl = bl2 = bl3;
                break;
            }
            case 3: {
                bl2 = true;
            }
            default: {
                bl = bl2;
            }
        }
        if (!bl) return;
        if (((Boolean)Ig.f$E(0.f$d).f$E()).booleanValue()) {
            if (!Pg.f$E()) return;
        }
        if (!Ig.f$E(0.f$d).f$E(Ig.f$E(0.f$d))) return;
        ((Y)Ig.f$a()).setLeftClickCounter(0);
        ((Y)Ig.f$E()).f$E(He.f$i);
        double d = Math.random() * Ig.f$a(0.f$d).f$E().doubleValue() * 2.0 - Ig.f$a(0.f$d).f$E().doubleValue();
        pE pE2 = 0;
        Ig.f$E(pE2.f$d, Math.max(Ig.f$E(pE2.f$d).f$E().doubleValue() + d, 0.5));
        Ig.f$E(0.f$d).f$a();
    }

    public pE(Ig ig) {
        0.f$d = ig;
    }
}
