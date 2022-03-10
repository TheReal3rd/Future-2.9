package net.futureclient.client.deof.modules.world.nuker;

public class Pa_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.M;
import net.futureclient.client.Pf;
import net.futureclient.client.TH;
import net.futureclient.client.ia;
import net.futureclient.client.kF;
import net.futureclient.client.ta;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.state.IBlockState;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class Pa
extends Ha<Pf> {
    public final ta f$d;

    @Override
    public void f$E(Pf pf) {
        0.f$d.f$a(String.format("Nuker \u00a77[\u00a7F%s\u00a77]", ta.f$E(0.f$d).f$E()));
        block0 : switch ((ia)((Object)ta.f$E(0.f$d).f$E())) {
            case f$j:
            case f$i:
            case f$M: {
                while (false) {
                }
                switch (pf.f$E()) {
                    case f$M: {
                        while (false) {
                        }
                        ta.f$E(0.f$d, false);
                        int n = ta.f$E(0.f$d).f$E().intValue();
                        int n2 = n;
                        int n3 = n;
                        while (n3 >= -n2) {
                            int n4 = -n2;
                            while (n4 < n2) {
                                int n5;
                                int n6 = -n2;
                                while (n6 < n2) {
                                    Block block;
                                    IBlockState iBlockState;
                                    int n7;
                                    ta.f$E(0.f$d, new BlockPos((int)Math.floor(ta.f$D().player.field_70165_t) + n5, (int)Math.floor(ta.f$g().player.field_70163_u) + n, (int)Math.floor(ta.f$m().player.field_70161_v) + n7));
                                    if (!(ta.f$c().player.func_70092_e(ta.f$f().player.field_70165_t + (double)n5, ta.f$L().player.field_70163_u + (double)n, ta.f$i().player.field_70161_v + (double)n7) > 16.0) && ta.f$E(0.f$d, iBlockState = ta.f$I().world.func_180495_p(ta.f$E(0.f$d)), block = iBlockState.getBlock())) {
                                        Pa pa = 0;
                                        ta.f$E(pa.f$d, true);
                                        if (!((Boolean)ta.f$a(pa.f$d).f$E()).booleanValue()) {
                                            return;
                                        }
                                        float[] fArray = TH.f$E(ta.f$E(0.f$d), CG.f$E(ta.f$E(0.f$d)));
                                        Pf pf2 = pf;
                                        pf2.f$a(fArray[0]);
                                        pf2.f$E(fArray[1]);
                                        return;
                                    }
                                    n6 = ++n7;
                                }
                                n4 = ++n5;
                            }
                            n3 = --n;
                        }
                        break block0;
                    }
                    case f$g: {
                        if (!ta.f$E(0.f$d)) break block0;
                        ta.f$j().player.swingArm(EnumHand.MAIN_HAND);
                        ta.f$M().playerController.onPlayerDamageBlock(ta.f$E(0.f$d), CG.f$E(ta.f$E(0.f$d)));
                        if (!((double)((M)ta.f$C().playerController).getCurBlockDamageMP() >= 1.0)) break block0;
                        ta.f$a(0.f$d).f$a();
                    }
                }
                return;
            }
            case f$g: {
                int n;
                if (pf.f$E() != kF.f$g || !ta.f$H().player.func_184812_l_()) break;
                int n8 = n = -ta.f$E(0.f$d).f$E().intValue();
                while (n8 <= ta.f$E(0.f$d).f$E().intValue()) {
                    int n9 = ta.f$E(0.f$d).f$E().intValue();
                    while (n9 >= -ta.f$E(0.f$d).f$E().intValue()) {
                        int n10;
                        int n11 = -ta.f$E(0.f$d).f$E().intValue();
                        while (n11 <= ta.f$E(0.f$d).f$E().intValue()) {
                            int n12;
                            int n13 = (int)(ta.f$h().player.field_70165_t + (double)n);
                            int n14 = (int)(ta.f$A().player.field_70163_u + (double)n10);
                            int n15 = (int)(ta.f$K().player.field_70161_v + (double)n12);
                            BlockPos blockPos = new BlockPos(n13, n14, n15);
                            if (!(ta.f$B().world.func_180495_p(blockPos).getBlock() instanceof BlockAir)) {
                                ta.f$e().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
                                ta.f$a().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
                            }
                            n11 = ++n12;
                        }
                        n9 = --n10;
                    }
                    n8 = ++n;
                }
                break;
            }
        }
    }

    public Pa(ta ta2) {
        0.f$d = ta2;
    }
}
 */