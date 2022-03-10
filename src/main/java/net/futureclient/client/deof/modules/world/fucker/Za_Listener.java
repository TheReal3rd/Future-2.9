package net.futureclient.client.deof.modules.world.fucker;

public class Za_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.Ra;
import net.futureclient.client.TH;
import net.futureclient.client.Ua;
import net.futureclient.client.oI;
import net.futureclient.client.pa;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Za
extends Ha<Pf> {
    public final Ra f$d;

    @Override
    public void f$E(Pf 0) {
        0.f$d.f$a(String.format("Fucker \u00a77[\u00a7F%s\u00a77]", new Object[]{Ra.f$E(0.f$d).f$E()}));
        switch (Ua.f$g[0.f$E().ordinal()]) {
            case 1: {
                v0 = 0;
                while (false) {
                }
                var2_2 = Ra.f$a(v0.f$d);
                if (Ra.f$E(v0.f$d) == null || var2_2 != null && !Ra.f$E(0.f$d).equals((Object)var2_2)) {
                    Ra.f$e(0.f$d, 0.0f);
                }
                if (Ra.f$E(0.f$d) != null && CG.f$E(Ra.f$E(0.f$d)) > (double)(Ra.f$a(0.f$d).f$E().floatValue() * Ra.f$a(0.f$d).f$E().floatValue())) {
                    Ra.f$E(0.f$d, null);
                }
                if (var2_2 != null) ** GOTO lbl23
                if (Ra.f$E(0.f$d) == null) ** GOTO lbl26
                if (Ra.f$F().world.func_175623_d(Ra.f$E(0.f$d))) ** GOTO lbl23
                if (!((pa)Ra.f$E(0.f$d).f$E()).equals((Object)pa.f$g) || Pg.f$E(ItemHoe.class) == null) ** GOTO lbl22
                if (!Ra.f$G().world.func_180495_p(Ra.f$E(0.f$d)).getBlock().equals(Blocks.FARMLAND)) ** GOTO lbl26
                v1 = 0;
                ** GOTO lbl24
lbl22:
                // 1 sources

                if (Ra.f$D().world.func_180495_p(Ra.f$E(0.f$d).offset(EnumFacing.UP)).getBlock().equals(Blocks.AIR) && Pg.f$E(ItemSeeds.class) != null && Pg.f$E(ItemSeedFood.class) != null) ** GOTO lbl26
lbl23:
                // 3 sources

                v1 = 0;
lbl24:
                // 2 sources

                Ra.f$E(v1.f$d, var2_2);
lbl26:
                // 4 sources

                if (Ra.f$E(0.f$d) == null || !((Boolean)Ra.f$e(0.f$d).f$E()).booleanValue()) break;
                var3_3 = TH.f$E(Ra.f$E(0.f$d), CG.f$E(Ra.f$E(0.f$d)));
                v2 = 0;
                v2.f$a(Ra.f$a(0.f$d, var3_3[0]));
                v2.f$E(Ra.f$E(0.f$d, var3_3[1]));
                return;
            }
            case 2: {
                if (Ra.f$E(0.f$d) == null) {
                    return;
                }
                if (Ra.f$a(0.f$d) > 0) {
                    Ra.f$E(0.f$d);
                    return;
                }
                if (((Boolean)Ra.f$a(0.f$d).f$E()).booleanValue()) {
                    if (Ra.f$E(0.f$d) == null || !Ra.f$E(0.f$d).f$a(Ra.f$E(0.f$d).f$E().floatValue() * 1000.0f)) break;
                    v3 = 0;
                    var3_4 = oI.f$E(Ra.f$e(0.f$d), Ra.f$a(v3.f$d));
                    Ra.f$g().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(Ra.f$E(0.f$d), Ra.f$E(0.f$d), EnumHand.MAIN_HAND, (float)var3_4.hitVec.x, (float)var3_4.hitVec.y, (float)var3_4.hitVec.z));
                    Ra.f$m().player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
                    Ra.f$E(v3.f$d).f$a();
                    return;
                }
                if (Ra.f$E(0.f$d) == 0.0f) {
                    Ra.f$f().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, Ra.f$E(0.f$d), Ra.f$E(0.f$d)));
                    if (Ra.f$L().player.field_71075_bZ.isCreativeMode || Ra.f$I().world.func_180495_p(Ra.f$E(0.f$d)).func_185903_a((EntityPlayer)Ra.f$i().player, (World)Ra.f$c().world, Ra.f$E(0.f$d)) >= 1.0f) {
                        Ra.f$e(0.f$d, 0.0f);
                        Ra.f$j().player.swingArm(EnumHand.MAIN_HAND);
                        Ra.f$M().playerController.onPlayerDestroyBlock(Ra.f$E(0.f$d));
                        return;
                    }
                }
                v4 = 0;
                Ra.f$e(v4.f$d, Ra.f$E(v4.f$d) + Ra.f$h().world.func_180495_p(Ra.f$E(0.f$d)).func_185903_a((EntityPlayer)Ra.f$C().player, (World)Ra.f$H().world, Ra.f$E(0.f$d)) * Ra.f$E(0.f$d).f$E().floatValue());
                Ra.f$K().world.func_175715_c(Ra.f$A().player.func_145782_y(), Ra.f$E(0.f$d), (int)(Ra.f$E(0.f$d) * 10.0f) - 1);
                if (Ra.f$E(v4.f$d) >= 1.0f) {
                    Ra.f$B().player.swingArm(EnumHand.MAIN_HAND);
                    Ra.f$e().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, Ra.f$E(0.f$d), Ra.f$E(0.f$d)));
                    Ra.f$a().playerController.onPlayerDestroyBlock(Ra.f$E(0.f$d));
                    Ra.f$E(0.f$d, (byte)4);
                    Ra.f$e(0.f$d, 0.0f);
                    return;
                }
                if (!((Boolean)Ra.f$E(0.f$d).f$E()).booleanValue()) break;
                Ra.f$E().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, Ra.f$E(0.f$d), Ra.f$E(0.f$d)));
            }
        }
    }

    public Za(Ra ra) {
        0.f$d = ra;
    }
}
 */