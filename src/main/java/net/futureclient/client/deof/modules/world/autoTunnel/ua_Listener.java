package net.futureclient.client.deof.modules.world.autoTunnel;

public class ua_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ca;
import net.futureclient.client.Ha;
import net.futureclient.client.M;
import net.futureclient.client.Oa;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.TH;
import net.futureclient.client.Wa;
import net.futureclient.client.kH;
import net.futureclient.client.qF;
import net.futureclient.client.ra;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ua
extends Ha<Pf> {
    public final ra f$d;

    public ua(ra ra2) {
        0.f$d = ra2;
    }

    @Override
    public void f$E(Pf 0) {
        var2_2 = (qF)kH.f$E().f$E().f$E(qF.class);
        if (var2_2.f$E() && var2_2.f$B()) {
            return;
        }
        if (((Ca)kH.f$E().f$E().f$E(Ca.class)).f$L != null) {
            return;
        }
        if (ra.f$ca().playerController == null) {
            return;
        }
        block0 : switch (Wa.f$d[0.f$E().ordinal()]) {
            case 1: {
                while (false) {
                }
                switch (Wa.f$g[((Oa)ra.f$E(0.f$d).f$E()).ordinal()]) {
                    case 1: {
                        v0 = 0;
                        while (false) {
                        }
                        ra.f$a(v0.f$d, false);
                        ra.f$E(0.f$d, ra.f$ka().player.func_174811_aO());
                        ra.f$E(v0.f$d, ra.f$E(0.f$d).equals((Object)EnumFacing.EAST) != false || ra.f$E(0.f$d).equals((Object)EnumFacing.WEST) != false);
                        var2_3 = 5;
                        var4_5 = 5;
                        v1 = var2_3;
                        while (v1 >= -var4_5) {
                            v2 = -var4_5;
                            while (v2 < var4_5) {
                                v3 = -var4_5;
                                while (v3 < var4_5) {
                                    ra.f$E(0.f$d, new BlockPos((int)Math.floor(ra.f$ia().player.field_70165_t) + (ra.f$a(0.f$d) != false ? var5_9 : 0), (int)Math.floor(ra.f$ea().player.field_70163_u) + var2_3, (int)Math.floor(ra.f$Ia().player.field_70161_v) + (ra.f$a(0.f$d) == false ? var6_10 : 0)));
                                    if (ra.f$da().player.func_70092_e(ra.f$Ja().player.field_70165_t + (double)var5_9, ra.f$Ma().player.field_70163_u + (double)var2_3, ra.f$ha().player.field_70161_v + (double)var6_10) <= 16.0) {
                                        var7_12 = ra.f$Ca().world.func_180495_p(ra.f$E(0.f$d)).getBlock();
                                        var3_7 = ra.f$E(0.f$d).f$a(ra.f$E(0.f$d).f$E().floatValue() * 1000.0f) != false && !((double)ra.f$E(0.f$d).func_177956_o() < ra.f$Da().player.field_70163_u) && !((double)ra.f$E(0.f$d).func_177956_o() > ra.f$Ka().player.field_70163_u + 1.0);
                                        var3_7 = var3_7 != false && CG.f$e(ra.f$E(0.f$d)) != false && ra.f$E(0.f$d).contains(var7_12) == false;
                                        v4 = var3_7 = var3_7 != false && (ra.f$ja().world.func_180495_p(ra.f$E(0.f$d)).func_185887_b((World)ra.f$Aa().world, ra.f$E(0.f$d)) != -1.0f || ra.f$fa().playerController.isInCreativeMode() != false);
                                        if (var3_7) {
                                            ra.f$a(0.f$d, true);
                                            var8_13 = TH.f$E(ra.f$E(0.f$d), CG.f$E(ra.f$E(0.f$d)));
                                            v5 = 0;
                                            v5.f$a(var8_13[0]);
                                            v5.f$E(var8_13[1]);
                                            return;
                                        }
                                    }
                                    v3 = ++var6_10;
                                }
                                v2 = ++var5_9;
                            }
                            v1 = --var2_3;
                        }
                        break block0;
                    }
                    case 2: {
                        if (!ra.f$E(0.f$d).f$a(ra.f$E(0.f$d).f$E().floatValue() * 1000.0f)) break block0;
                        var4_6 = Math.cos(Math.toRadians(ra.f$Ba().player.field_70177_z + 90.0f));
                        var6_11 = Math.sin(Math.toRadians(ra.f$ma().player.field_70177_z + 90.0f));
                        var3_8 = new BlockPos(ra.f$Fa().player.field_70165_t + (1.0 * var4_6 + 0.0 * var6_11), ra.f$aa().player.field_70163_u + 1.0, ra.f$Ha().player.field_70161_v + (1.0 * var6_11 - 0.0 * var4_6));
                        var8_14 = ra.f$Ga().world.func_180495_p(var3_8).getBlock();
                        if (ra.f$la().player.field_71071_by.getCurrentItem().getMaxDamage() - ra.f$ba().player.field_71071_by.getCurrentItem().getItemDamage() >= 5) ** GOTO lbl70
                        var9_15 = Pg.f$E(ra.f$Ea().world.func_180495_p(var3_8));
                        if (var9_15 == -1) {
                            return;
                        }
                        if (var9_15 < 9) {
                            ra.f$La().player.field_71071_by.currentItem = var9_15;
                            ((M)ra.f$ga().playerController).invokeSyncCurrentPlayItem();
                            v6 = 0;
                        } else {
                            ra.f$Z().playerController.windowClick(0, var9_15, ra.f$R().player.field_71071_by.currentItem, ClickType.SWAP, (EntityPlayer)ra.f$O().player);
lbl70:
                            // 2 sources

                            v6 = 0;
                        }
                        if (!ra.f$E(v6.f$d).contains(var8_14)) {
                            ra.f$T().player.swingArm(EnumHand.MAIN_HAND);
                            ra.f$z().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$r().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$E(0.f$d).f$a();
                        }
                        var9_16 = new BlockPos(ra.f$y().player.field_70165_t + (1.0 * var4_6 + 0.0 * var6_11), ra.f$s().player.field_70163_u, ra.f$S().player.field_70161_v + (1.0 * var6_11 - 0.0 * var4_6));
                        var3_8 = ra.f$N().world.func_180495_p(var9_16).getBlock();
                        if (!ra.f$E(0.f$d).contains(var3_8)) {
                            ra.f$X().player.swingArm(EnumHand.MAIN_HAND);
                            ra.f$u().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var9_16, EnumFacing.DOWN));
                            ra.f$V().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var9_16, EnumFacing.DOWN));
                            ra.f$E(0.f$d).f$a();
                        }
                        var3_8 = new BlockPos(ra.f$q().player.field_70165_t + (2.0 * var4_6 + 0.0 * var6_11), ra.f$x().player.field_70163_u + 1.0, ra.f$p().player.field_70161_v + (2.0 * var6_11 - 0.0 * var4_6));
                        var8_14 = ra.f$n().world.func_180495_p(var3_8).getBlock();
                        if (!ra.f$E(0.f$d).contains(var8_14)) {
                            ra.f$o().player.swingArm(EnumHand.MAIN_HAND);
                            ra.f$w().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$v().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$E(0.f$d).f$a();
                        }
                        var3_8 = new BlockPos(ra.f$W().player.field_70165_t + (2.0 * var4_6 + 0.0 * var6_11), ra.f$Y().player.field_70163_u, ra.f$t().player.field_70161_v + (2.0 * var6_11 - 0.0 * var4_6));
                        var8_14 = ra.f$P().world.func_180495_p(var3_8).getBlock();
                        if (!ra.f$E(0.f$d).contains(var8_14)) {
                            ra.f$Q().player.swingArm(EnumHand.MAIN_HAND);
                            ra.f$U().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$J().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$E(0.f$d).f$a();
                        }
                        var3_8 = new BlockPos(ra.f$d().player.field_70165_t + (3.0 * var4_6 + 0.0 * var6_11), ra.f$l().player.field_70163_u + 1.0, ra.f$k().player.field_70161_v + (3.0 * var6_11 - 0.0 * var4_6));
                        var8_14 = ra.f$b().world.func_180495_p(var3_8).getBlock();
                        if (!ra.f$E(0.f$d).contains(var8_14)) {
                            ra.f$F().player.swingArm(EnumHand.MAIN_HAND);
                            ra.f$G().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$D().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$E(0.f$d).f$a();
                        }
                        var3_8 = new BlockPos(ra.f$g().player.field_70165_t + (3.0 * var4_6 + 0.0 * var6_11), ra.f$m().player.field_70163_u, ra.f$f().player.field_70161_v + (3.0 * var6_11 - 0.0 * var4_6));
                        var8_14 = ra.f$L().world.func_180495_p(var3_8).getBlock();
                        if (ra.f$E(0.f$d).contains(var8_14)) break block0;
                        ra.f$i().player.swingArm(EnumHand.MAIN_HAND);
                        ra.f$c().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                        ra.f$I().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                        ra.f$E(0.f$d).f$a();
                    }
                }
                return;
            }
            case 2: {
                if (ra.f$E(0.f$d).f$E() != Oa.f$M || !ra.f$E(0.f$d)) break;
                if (ra.f$j().player.field_71071_by.getCurrentItem().getMaxDamage() - ra.f$M().player.field_71071_by.getCurrentItem().getItemDamage() < 5) {
                    var2_4 = Pg.f$E(ra.f$C().world.func_180495_p(ra.f$E(0.f$d)));
                    if (var2_4 == -1) {
                        return;
                    }
                    if (var2_4 < 9) {
                        ra.f$H().player.field_71071_by.currentItem = var2_4;
                        ((M)ra.f$h().playerController).invokeSyncCurrentPlayItem();
                    } else {
                        ra.f$B().playerController.windowClick(0, var2_4, ra.f$A().player.field_71071_by.currentItem, ClickType.SWAP, (EntityPlayer)ra.f$K().player);
                    }
                }
                ra.f$e().player.swingArm(EnumHand.MAIN_HAND);
                ra.f$a().playerController.onPlayerDamageBlock(ra.f$E(0.f$d), CG.f$E(ra.f$E(0.f$d)));
                if (!((double)((M)ra.f$E().playerController).getCurBlockDamageMP() >= 1.0)) break;
                ra.f$E(0.f$d).f$a();
            }
        }
    }
}
 */