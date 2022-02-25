package net.futureclient.client;

import java.awt.TrayIcon;
import net.futureclient.client.DC;
import net.futureclient.client.Eb;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Pg;
import net.futureclient.client.gC;
import net.futureclient.client.kH;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import org.lwjgl.opengl.Display;

public class Oc
extends Ha<ME> {
    public final DC f$d;

    @Override
    public void f$E(ME mE) {
        Oc oc;
        Object object;
        Eb eb;
        block17: {
            block16: {
                block15: {
                    Oc oc2;
                    block7: {
                        block4: {
                            block14: {
                                block13: {
                                    block12: {
                                        block11: {
                                            block5: {
                                                block10: {
                                                    block9: {
                                                        block8: {
                                                            block6: {
                                                                if (Display.isActive()) {
                                                                    DC.f$K(false);
                                                                    DC.f$B(false);
                                                                    DC.f$e(false);
                                                                    DC.f$a(false);
                                                                    DC.f$E(false);
                                                                    return;
                                                                }
                                                                eb = (Eb)kH.f$E().f$E().f$E(Eb.class);
                                                                if (eb == null || !eb.f$E() || !0.f$d.f$m.f$E().booleanValue()) break block4;
                                                                object = DC.f$g().player.func_174811_aO();
                                                                if (DC.f$m().player.func_184187_bx() != null) break block5;
                                                                if (!object.equals((Object)EnumFacing.NORTH) || DC.f$f().player.field_70179_y != 0.0) break block6;
                                                                if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                                                DC.f$e();
                                                                if (DC.f$a() <= 1) break block4;
                                                                DC.f$E(0);
                                                                kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                                                if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                                                DC.f$e(true);
                                                                oc2 = 0;
                                                                break block7;
                                                            }
                                                            if (!object.equals((Object)EnumFacing.SOUTH) || DC.f$L().player.field_70159_w != 0.0 || DC.f$i().player.field_70179_y != 0.0) break block8;
                                                            if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                                            DC.f$e();
                                                            if (DC.f$a() <= 1) break block4;
                                                            DC.f$E(0);
                                                            kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                                            if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                                            DC.f$e(true);
                                                            oc2 = 0;
                                                            break block7;
                                                        }
                                                        if (!object.equals((Object)EnumFacing.EAST) || DC.f$c().player.field_70159_w != 0.0) break block9;
                                                        if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                                        DC.f$e();
                                                        if (DC.f$a() <= 1) break block4;
                                                        DC.f$E(0);
                                                        kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                                        if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                                        DC.f$e(true);
                                                        oc2 = 0;
                                                        break block7;
                                                    }
                                                    if (!object.equals((Object)EnumFacing.WEST) || DC.f$I().player.field_70159_w != 0.0) break block10;
                                                    if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                                    DC.f$e();
                                                    if (DC.f$a() <= 1) break block4;
                                                    DC.f$E(0);
                                                    kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                                    if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                                    DC.f$e(true);
                                                    oc2 = 0;
                                                    break block7;
                                                }
                                                DC.f$e(false);
                                                DC.f$E(0);
                                                oc2 = 0;
                                                break block7;
                                            }
                                            if (!object.equals((Object)EnumFacing.NORTH) || DC.f$j().player.func_184187_bx().motionZ != 0.0) break block11;
                                            if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                            DC.f$e();
                                            if (DC.f$a() <= 1) break block4;
                                            DC.f$E(0);
                                            kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                            if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                            DC.f$e(true);
                                            oc2 = 0;
                                            break block7;
                                        }
                                        if (!object.equals((Object)EnumFacing.SOUTH) || DC.f$M().player.func_184187_bx().motionX != 0.0 || DC.f$C().player.func_184187_bx().motionZ != 0.0) break block12;
                                        if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                        DC.f$e();
                                        if (DC.f$a() <= 1) break block4;
                                        DC.f$E(0);
                                        kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                        if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                        DC.f$e(true);
                                        oc2 = 0;
                                        break block7;
                                    }
                                    if (!object.equals((Object)EnumFacing.EAST) || DC.f$H().player.func_184187_bx().motionX != 0.0) break block13;
                                    if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                    DC.f$e();
                                    if (DC.f$a() <= 1) break block4;
                                    DC.f$E(0);
                                    kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                    if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                    DC.f$e(true);
                                    oc2 = 0;
                                    break block7;
                                }
                                if (!object.equals((Object)EnumFacing.WEST) || DC.f$h().player.func_184187_bx().motionX != 0.0) break block14;
                                if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                DC.f$e();
                                if (DC.f$a() <= 1) break block4;
                                DC.f$E(0);
                                kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                DC.f$e(true);
                                oc2 = 0;
                                break block7;
                            }
                            DC.f$e(false);
                            DC.f$E(0);
                        }
                        oc2 = 0;
                    }
                    if (!oc2.f$d.f$D.f$E().booleanValue() || DC.f$A().player.field_70737_aN == 0) break block15;
                    if (DC.f$A() || !DC.f$A(0.f$d).f$E(10000L)) break block16;
                    kH.f$E().f$E().f$g.displayMessage("Damage received", "You have just taken damage.", TrayIcon.MessageType.NONE);
                    if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block16;
                    DC.f$a(true);
                    oc = 0;
                    break block17;
                }
                DC.f$a(false);
            }
            oc = 0;
        }
        if (oc.f$d.f$l.f$E().booleanValue()) {
            object = DC.f$K().world.field_73010_i.iterator();
            while (object.hasNext()) {
                eb = (EntityPlayer)((Entity)object.next());
                if (!(!Pg.f$E((Entity)eb) || DC.f$E(0.f$d).contains(eb) || !0.f$d.f$L.f$E().booleanValue() && kH.f$E().f$E().f$E(eb.getName()) || eb.getName().equals(DC.f$B().player.func_70005_c_()) || eb instanceof EntityPlayerSP)) {
                    if (DC.f$K() || !DC.f$K(0.f$d).f$E(10000L)) continue;
                    Oc oc3 = 0;
                    DC.f$E(oc3.f$d).add(eb);
                    kH.f$E().f$E().f$g.displayMessage("Player in range", new StringBuilder().insert(0, eb.getName()).append(" came into render distance.").toString(), TrayIcon.MessageType.NONE);
                    if (!((gC)((Object)DC.f$E(oc3.f$d).f$E())).equals((Object)gC.f$M)) continue;
                    DC.f$E(true);
                    continue;
                }
                DC.f$E(false);
            }
        }
    }

    public Oc(DC dC) {
        0.f$d = dC;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.iC;
import net.futureclient.client.ka;
import net.futureclient.client.xC;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.init.MobEffects;

public class OC
extends Ba {
    private ka<xC> f$M;
    private z<Boolean> f$g;
    private Bh f$d;

    public static void f$E(OC oC) {
        super.f$B();
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Bh f$E(OC oC) {
        return oC.f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    @Override
    public void f$B() {
        OC oC;
        if (((Minecraft)OC.f$d).player != null && ((xC)((Object)oC.f$M.f$E())).equals((Object)xC.f$g)) {
            OC.f$d.gameSettings.gammaSetting = 1.0f;
            ((Minecraft)OC.f$d).player.func_184589_d(MobEffects.NIGHT_VISION);
            super.f$B();
        }
        oC.f$d.f$a();
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public OC() {
        OC oC;
        String[] stringArray = new String[4];
        stringArray[0] = "Fullbright";
        stringArray[1] = "fb";
        stringArray[2] = "bright";
        stringArray[3] = "brightness";
        super("Fullbright", stringArray, true, -23445, JD.f$i);
        OC oC2 = oC;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Mode";
        stringArray2[1] = "m";
        stringArray2[2] = "type";
        oC2.f$M = new ka<xC>(xC.f$M, stringArray2);
        String[] stringArray3 = new String[5];
        stringArray3[0] = "Automatic";
        stringArray3[1] = "AutoEnable";
        stringArray3[2] = "Auto";
        stringArray3[3] = "AutoE";
        stringArray3[4] = "AE";
        oC.f$g = new z<Boolean>(false, stringArray3);
        oC.f$d = new Bh();
        oC.f$E(oC.f$M, oC.f$g);
        oC.f$E(new iC(oC));
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static ka f$E(OC oC) {
        return oC.f$M;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static z f$E(OC oC) {
        return oC.f$g;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static void f$a(OC oC) {
        super.f$B();
    }

    @Override
    public void f$K() {
        OC oC;
        if (!oC.f$d.f$E(300L)) {
            oC.f$g.f$E(false);
        }
        super.f$K();
    }
}
package net.futureclient.client;

import net.futureclient.client.kF;

public class oC {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            oC.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.B;
import net.futureclient.client.BB;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.kF;
import net.futureclient.client.mc;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public class oc
extends Ha<Pf> {
    public final BB f$d;

    @Override
    public void f$E(Pf pf) {
        0.f$d.f$a(String.format("ElytraFly \u00a77[\u00a7F%s\u00a77]", 0.f$d.f$D.f$E()));
        if (!BB.f$H().player.field_70122_E || !0.f$d.f$c.f$E().booleanValue()) {
            if (BB.f$h().player.func_184582_a(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
                return;
            }
            if (pf.f$E().equals((Object)kF.f$M) && ((mc)((Object)0.f$d.f$D.f$E())).equals((Object)mc.f$M)) {
                if (0.f$d.f$C.f$E().booleanValue() || !((B)BB.f$A().player).f$E()) {
                    BB.f$B().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)BB.f$K().player, CPacketEntityAction.Action.START_FALL_FLYING));
                }
                if (0.f$d.f$e.f$E().booleanValue() && !BB.f$E(0.f$d) && (Math.abs(pf.f$K()) >= 0.05 || Math.abs(pf.f$E()) >= 0.05)) {
                    double d = 1.0E-8 + 1.0E-8 * (1.0 + (double)BB.f$E(0.f$d).nextInt(1 + (BB.f$E(0.f$d).nextBoolean() ? BB.f$E(0.f$d).nextInt(34) : BB.f$E(0.f$d).nextInt(43))));
                    if (BB.f$e().player.field_70122_E || BB.f$a().player.field_70173_aa % 2 == 0) {
                        Pf pf2 = pf;
                        pf2.f$E(pf2.f$e() + d);
                        return;
                    }
                    Pf pf3 = pf;
                    pf3.f$E(pf3.f$e() - d);
                }
            }
        }
    }

    public oc(BB bB) {
        0.f$d = bB;
    }
}
