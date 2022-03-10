package net.futureclient.client.deof.modules.miscellaneous.noteTuner;

public class WA_Listener {
}
/*
package net.futureclient.client;

import java.util.concurrent.atomic.AtomicInteger;
import net.futureclient.client.HG;
import net.futureclient.client.Ha;
import net.futureclient.client.MB;
import net.futureclient.client.jf;
import net.minecraft.network.play.server.SPacketBlockAction;
import net.minecraft.util.math.BlockPos;

public class WA
extends Ha<jf> {
    public final MB f$d;

    @Override
    public void f$E(jf jf2) {
        if (jf2.f$E() instanceof SPacketBlockAction && MB.f$e(0.f$d) == 0 && MB.f$a(0.f$d) != null) {
            int n;
            SPacketBlockAction sPacketBlockAction = (SPacketBlockAction)jf2.f$E();
            BlockPos[] blockPosArray = HG.values()[sPacketBlockAction.getData1()];
            int n2 = sPacketBlockAction.getData2();
            blockPosArray = (BlockPos[])MB.f$a(0.f$d).get(blockPosArray);
            int n3 = n = 0;
            while (n3 < 25) {
                BlockPos blockPos = blockPosArray[n];
                if (sPacketBlockAction.getBlockPosition().equals((Object)blockPos)) {
                    if (((AtomicInteger)MB.f$E(0.f$d).get(blockPos)).intValue() == -1) {
                        int n4 = n - n2;
                        if (n4 < 0) {
                            n4 += 25;
                        }
                        ((AtomicInteger)MB.f$E(0.f$d).get(blockPos)).set(n4);
                        if (n4 != 0) {
                            MB.f$E(0.f$d, false);
                        }
                    }
                    if (!MB.f$e(0.f$d).equals((Object)sPacketBlockAction.getBlockPosition()) || MB.f$a(0.f$d) < MB.f$E(0.f$d).values().size()) break;
                    MB.f$a(0.f$d, 1);
                    return;
                }
                n3 = ++n;
            }
        }
    }

    public WA(MB mB) {
        0.f$d = mB;
    }
}
 */