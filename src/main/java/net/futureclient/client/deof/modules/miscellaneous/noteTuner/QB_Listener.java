package net.futureclient.client.deof.modules.miscellaneous.noteTuner;

public class QB_Listener {
}
/*
package net.futureclient.client;

import java.util.concurrent.atomic.AtomicInteger;
import net.futureclient.client.CG;
import net.futureclient.client.HG;
import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.MB;
import net.futureclient.client.Pf;
import net.futureclient.client.TH;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class QB
extends Ha<Pf> {
    public final MB f$d;

    public QB(MB mB) {
        0.f$d = mB;
    }

    @Override
    public void f$E(Pf pf) {
        switch (pf.f$E()) {
            case f$M: {
                QB qB;
                QB qB2 = 0;
                while (false) {
                }
                MB.f$e(qB2.f$d, null);
                if (MB.f$e(qB2.f$d) == 1 && MB.f$a(0.f$d, null) == null) {
                    if (MB.f$E(0.f$d)) {
                        La.f$E().f$E("Finished tuning.");
                        0.f$d.f$E(false);
                        return;
                    }
                    MB.f$E(0.f$d, true);
                    MB.f$a(0.f$d, 0);
                    MB.f$E(0.f$d, 0);
                    return;
                }
                QB qB3 = 0;
                if (MB.f$e(0.f$d) != 0) {
                    QB qB4 = 0;
                    MB.f$e(qB3.f$d, MB.f$a(qB4.f$d, MB.f$a(qB4.f$d)));
                    QB qB5 = 0;
                    MB.f$E(qB5.f$d, MB.f$E(qB5.f$d));
                    qB = 0;
                } else {
                    while (MB.f$a(qB3.f$d) < 250 && MB.f$E(0.f$d) == null) {
                        QB qB6 = 0;
                        MB.f$e(qB6.f$d, ((BlockPos[])MB.f$a(qB6.f$d).get((Object)HG.values()[(int)Math.floor(MB.f$a(0.f$d) / 25)]))[MB.f$a(0.f$d) % 25]);
                        MB.f$E(0.f$d);
                        qB3 = 0;
                    }
                    qB = 0;
                }
                if (MB.f$E(qB.f$d) == null) {
                    return;
                }
                float[] fArray = TH.f$E(MB.f$E(0.f$d), CG.f$E(MB.f$E(0.f$d)));
                Pf pf2 = pf;
                pf2.f$a(fArray[0]);
                pf2.f$E(fArray[1]);
                return;
            }
            case f$g: {
                if (MB.f$e(0.f$d) == 0 && MB.f$E(0.f$d) != null) {
                    MB.f$e().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, MB.f$E(0.f$d), CG.f$E(MB.f$E(0.f$d))));
                    MB.f$a().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, MB.f$E(0.f$d), CG.f$E(MB.f$E(0.f$d))));
                    return;
                }
                if (MB.f$E(0.f$d) == null) break;
                ((AtomicInteger)MB.f$E(0.f$d).get(MB.f$E(0.f$d))).decrementAndGet();
                MB.f$E().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(MB.f$E(0.f$d), CG.f$E(MB.f$E(0.f$d)), EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
            }
        }
    }
}
 */
