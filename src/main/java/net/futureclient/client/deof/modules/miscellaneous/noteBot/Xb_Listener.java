package net.futureclient.client.deof.modules.miscellaneous.noteBot;

public class Xb_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.S;
import net.futureclient.client.TH;
import net.futureclient.client.fB;
import net.futureclient.client.mi;
import net.futureclient.client.nG;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.math.BlockPos;

public class Xb
extends Ha<Pf> {
    public final fB f$d;

    public Xb(fB fB2) {
        0.f$d = fB2;
    }

    @Override
    public void f$E(Pf pf) {
        switch (pf.f$E()) {
            case f$M: {
                Xb xb = 0;
                while (false) {
                }
                fB.f$E(xb.f$d).clear();
                if (fB.f$E(xb.f$d) == null) {
                    return;
                }
                Xb xb2 = 0;
                while (fB.f$e(xb2.f$d) < fB.f$E(0.f$d).length) {
                    BlockPos blockPos;
                    S s;
                    S s2 = fB.f$E(0.f$d)[fB.f$e(0.f$d)];
                    if (s2 instanceof mi) {
                        s = (mi)s2;
                        if (fB.f$a(0.f$d) >= ((mi)s).f$E()) {
                            fB.f$E(0.f$d);
                            fB.f$E(0.f$d, 0);
                        }
                        if (fB.f$E(0.f$d).size() > 0) {
                            blockPos = (BlockPos)fB.f$E(0.f$d).get(0);
                            float[] fArray = TH.f$E(blockPos, CG.f$E(blockPos));
                            Pf pf2 = pf;
                            pf2.f$a(fArray[0]);
                            pf2.f$E(fArray[1]);
                        }
                        return;
                    }
                    if (!(s2 instanceof nG)) {
                        xb2 = 0;
                        continue;
                    }
                    s = (nG)s2;
                    blockPos = fB.f$E(0.f$d, (nG)s);
                    if (blockPos != null) {
                        fB.f$E(0.f$d).add(blockPos);
                    }
                    Xb xb3 = 0;
                    xb2 = xb3;
                    fB.f$E(xb3.f$d);
                }
                fB.f$a(0.f$d, 0);
                return;
            }
            case f$g: {
                int n;
                int n2 = n = 0;
                while (n2 < fB.f$E(0.f$d).size()) {
                    BlockPos blockPos = (BlockPos)fB.f$E(0.f$d).get(n);
                    if (n != 0) {
                        BlockPos blockPos2 = blockPos;
                        float[] fArray = TH.f$E(blockPos2, CG.f$E(blockPos2));
                        fB.f$e().player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0], fArray[1], fB.f$B().player.field_70122_E));
                    }
                    BlockPos blockPos3 = blockPos;
                    fB.f$a().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos3, CG.f$E(blockPos3)));
                    BlockPos blockPos4 = blockPos;
                    fB.f$E().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, blockPos4, CG.f$E(blockPos4)));
                    n2 = ++n;
                }
                break;
            }
        }
    }
}
 */