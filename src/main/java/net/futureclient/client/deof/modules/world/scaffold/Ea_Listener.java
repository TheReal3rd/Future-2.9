package net.futureclient.client.deof.modules.world.scaffold;

public class Ea_Listener {
}
/*
package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.CG;
import net.futureclient.client.Ca;
import net.futureclient.client.Ha;
import net.futureclient.client.Ka;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.TH;
import net.futureclient.client.Y;
import net.futureclient.client.kH;
import net.futureclient.client.oI;
import net.futureclient.client.ra;
import net.futureclient.client.s;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemSlab;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;

public class Ea
extends Ha<Pf> {
    public final Ca f$d;

    public Ea(Ca ca) {
        0.f$d = ca;
    }

    @Override
    public void f$E(Pf pf) {
        if (((Boolean)Ca.f$a(0.f$d).f$E()).booleanValue() && Ca.f$a(0.f$d).f$E(150L) && Ca.f$X().player.field_70122_E) {
            Ca.f$V().player.field_70179_y = 0.0;
            Ca.f$u().player.field_70159_w = 0.0;
            Ca.f$a(0.f$d).f$a();
        }
        switch (pf.f$E()) {
            case f$M: {
                Object object;
                while (false) {
                }
                int n2 = Ca.f$E(0.f$d);
                0.f$d.f$L = null;
                0.f$d.f$B = -1;
                if (Ca.f$q().player.isSneaking() || n2 == -1) break;
                double d = Math.cos(Math.toRadians(Ca.f$x().player.field_70177_z + 90.0f));
                double d2 = Math.sin(Math.toRadians(Ca.f$p().player.field_70177_z + 90.0f));
                double d3 = (double)Ca.f$n().player.movementInput.moveForward * 0.4 * d;
                double d4 = d3 + (double)Ca.f$o().player.movementInput.moveStrafe * 0.4 * d2;
                double d5 = (double)Ca.f$w().player.movementInput.moveForward * 0.4 * d2 - (double)Ca.f$v().player.movementInput.moveStrafe * 0.4 * d;
                Ea ea = 0;
                Ca.f$E(ea.f$d, !((Ka)((Object)Ca.f$E(ea.f$d).f$E())).equals((Object)Ka.f$g));
                d4 = Ca.f$W().player.field_70165_t + (Ca.f$E(0.f$d) ? d4 : 0.0);
                double d6 = Ca.f$Y().player.field_70163_u - (Ca.f$t().player.field_71071_by.getStackInSlot(n2).getItem() instanceof ItemSlab ? 0.5 : 1.0);
                d5 = Ca.f$P().player.field_70161_v + (Ca.f$E(0.f$d) ? d5 : 0.0);
                BlockPos blockPos2 = new BlockPos(d4, d6, d5);
                ra ra2 = (ra)kH.f$E().f$E().f$E(ra.class);
                if (ra2 != null && ra2.f$E()) {
                    object = new ArrayList<BlockPos>();
                    ra2 = new BlockPos(Ca.f$Q().player.func_174791_d());
                    boolean bl = object.add(ra2.add((double)0.7f * d + 0.0 * d2, 2.0, (double)0.7f * d2 - 0.0 * d));
                    Object object2 = object;
                    object.add(ra2.add(1.5 * d + 0.0 * d2, 0.0, 1.5 * d2 - 0.0 * d));
                    object2.add(ra2.add(1.5 * d + 0.0 * d2, 1.0, 1.5 * d2 - 0.0 * d));
                    object.add(ra2.add((double)0.7f * d - (double)0.7f * d2, 0.0, (double)0.7f * d2 + (double)0.7f * d));
                    object.add(ra2.add((double)0.7f * d - (double)0.7f * d2, 1.0, (double)0.7f * d2 + (double)0.7f * d));
                    object.add(ra2.add((double)0.7f * d + (double)0.7f * d2, 0.0, (double)0.7f * d2 - (double)0.7f * d));
                    object.add(ra2.add((double)0.7f * d + (double)0.7f * d2, 1.0, (double)0.7f * d2 - (double)0.7f * d));
                    blockPos2 = object2.stream().filter(blockPos -> Ca.f$E(0.f$d).contains(Ca.f$a().world.func_180495_p(blockPos).getBlock())).findFirst().orElse(blockPos2);
                }
                if (Ca.f$U().world.func_180495_p(blockPos2).func_185904_a().isReplaceable()) {
                    Ea ea2 = 0;
                    Ea ea3 = 0;
                    ea2.f$d.f$L = Ca.f$E(ea3.f$d, blockPos2);
                    ea2.f$d.f$B = n2;
                    if (ea3.f$d.f$L == null) break;
                    object = TH.f$E(0.f$d.f$L.f$g, 0.f$d.f$L.f$d);
                    Pf pf2 = pf;
                    pf2.f$a(Ca.f$a(0.f$d, (float)object[0]));
                    pf2.f$E(Ca.f$E(0.f$d, TH.f$E((float)object[1])));
                    return;
                }
                if (Ca.f$E(0.f$d).f$a(((s)Ca.f$E(0.f$d)).f$E().floatValue() * 5.0f)) break;
                Pf pf3 = pf;
                pf3.f$a(Ca.f$a(0.f$d));
                pf3.f$E(Ca.f$E(0.f$d));
                return;
            }
            case f$g: {
                boolean bl;
                if (0.f$d.f$L == null || !Ca.f$E(0.f$d).f$a(((s)Ca.f$E(0.f$d)).f$E().floatValue()) || 0.f$d.f$B == -1) break;
                Ea ea = 0;
                RayTraceResult rayTraceResult = oI.f$E(Ca.f$E(0.f$d), Ca.f$a(ea.f$d));
                if (((Boolean)Ca.f$E(ea.f$d).f$E()).booleanValue()) {
                    ((Y)Ca.f$J()).setRightClickDelayTimer(3);
                    if (Ca.f$d().player.movementInput.jump && !Pg.f$e()) {
                        ((Y)Ca.f$l()).setRightClickDelayTimer(0);
                        Ca.f$k().player.func_70664_aZ();
                        pf.f$E(0.0);
                    }
                }
                boolean bl2 = Ca.f$b().player.field_71071_by.currentItem != 0.f$d.f$B;
                boolean bl3 = Ca.f$F().player.func_70051_ag();
                int n3 = Ca.f$G().player.field_71071_by.currentItem;
                boolean bl4 = bl = !CG.f$E(0.f$d.f$L.f$g);
                if (bl2) {
                    Ca.f$D().player.field_71071_by.currentItem = 0.f$d.f$B;
                    Ca.f$g().player.connection.sendPacket((Packet)new CPacketHeldItemChange(0.f$d.f$B));
                }
                if (bl3) {
                    Ca.f$f().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ca.f$m().player, CPacketEntityAction.Action.STOP_SPRINTING));
                }
                if (bl) {
                    Ca.f$i().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ca.f$L().player, CPacketEntityAction.Action.START_SNEAKING));
                }
                Ca.f$j().playerController.processRightClickBlock(Ca.f$c().player, Ca.f$I().world, 0.f$d.f$L.f$g, 0.f$d.f$L.f$d, rayTraceResult.hitVec, EnumHand.MAIN_HAND);
                Ca.f$M().player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
                if (bl) {
                    Ca.f$H().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ca.f$C().player, CPacketEntityAction.Action.STOP_SNEAKING));
                }
                if (bl3) {
                    Ca.f$A().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ca.f$h().player, CPacketEntityAction.Action.START_SPRINTING));
                }
                if (bl2) {
                    Ca.f$K().player.field_71071_by.currentItem = n3;
                    Ca.f$e().player.connection.sendPacket((Packet)new CPacketHeldItemChange(Ca.f$B().player.field_71071_by.currentItem));
                }
                Ca.f$E(0.f$d).f$a();
            }
        }
    }
}
 */