package net.futureclient.client.deof.modules.miscellaneous.noteTuner;

public class NoteTuner {
}
/*
package net.futureclient.client;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import net.futureclient.client.Ba;
import net.futureclient.client.HG;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.QB;
import net.futureclient.client.WA;
import net.futureclient.client.xh;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

public class MB
extends Ba {
    private Map<BlockPos, AtomicInteger> f$b;
    private Map<HG, BlockPos[]> f$I;
    private BlockPos f$K;
    private int f$i;
    private BlockPos f$j;
    private int f$M;
    private BlockPos f$g;
    private boolean f$d;

    public MB() {
        MB mB;
        String[] stringArray = new String[7];
        stringArray[0] = "NoteTuner";
        stringArray[1] = "NotesTuner";
        stringArray[2] = "AutoTuner";
        stringArray[3] = "AutoTune";
        stringArray[4] = "SongTuner";
        stringArray[5] = "Tuner";
        stringArray[6] = "ATuner";
        super("NoteTuner", stringArray, true, -6692885, JD.f$b);
        Ha[] haArray = new Ha[2];
        haArray[0] = new WA(mB);
        haArray[1] = new QB(mB);
        mB.f$E(haArray);
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static boolean f$E(MB mB, boolean bl) {
        mB.f$d = bl;
        return mB.f$d;
    }

    public static int f$E(MB mB) {
        return mB.f$M++;
    }

    public static BlockPos f$e(MB mB) {
        return mB.f$g;
    }

    private BlockPos f$E(BlockPos blockPos) {
        AtomicInteger atomicInteger;
        BlockPos blockPos2;
        Iterator<Map.Entry<BlockPos, AtomicInteger>> iterator = 0.f$b.entrySet().iterator();
        do {
            if (!iterator.hasNext()) {
                return null;
            }
            Map.Entry<BlockPos, AtomicInteger> entry = iterator.next();
            blockPos2 = entry.getKey();
            atomicInteger = entry.getValue();
        } while (blockPos2 == null || blockPos2.equals((Object)blockPos) || atomicInteger.intValue() <= 0);
        return blockPos2;
    }

    public static boolean f$E(MB mB) {
        return mB.f$d;
    }

    public static int f$a(MB mB, int n) {
        mB.f$i = n;
        return mB.f$i;
    }

    public static int f$a(MB mB) {
        return mB.f$M;
    }

    public static Map f$E(MB mB) {
        return mB.f$b;
    }

    public static Map f$a(MB mB) {
        return mB.f$I;
    }

    public static BlockPos f$a(MB mB, BlockPos blockPos) {
        return mB.f$E(blockPos);
    }

    public static BlockPos f$E(MB mB, BlockPos blockPos) {
        mB.f$j = blockPos;
        return mB.f$j;
    }

    public static BlockPos f$E(MB mB) {
        return mB.f$K;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static BlockPos f$e(MB mB, BlockPos blockPos) {
        mB.f$K = blockPos;
        return mB.f$K;
    }

    public static int f$e(MB mB) {
        return mB.f$i;
    }

    public static BlockPos f$a(MB mB) {
        return mB.f$j;
    }

    @Override
    public void f$K() {
        MB mB;
        super.f$K();
        if (MB.f$d.world == null || MB.f$d.player == null) {
            mB.f$E(false);
            return;
        }
        mB.f$d = true;
        mB.f$I = xh.f$E();
        MB mB2 = mB;
        mB2.f$b = new LinkedHashMap<BlockPos, AtomicInteger>();
        mB.f$I.values().forEach(blockPosArray -> Arrays.asList(blockPosArray).forEach(blockPos -> {
            if (blockPos != null) {
                0.f$g = blockPos;
                0.f$b.put((BlockPos)blockPos, new AtomicInteger(-1));
            }
        }));
        MB mB3 = mB;
        mB3.f$i = 0;
        mB3.f$M = 0;
    }

    public static int f$E(MB mB, int n) {
        mB.f$M = n;
        return mB.f$M;
    }
}
 */