package net.futureclient.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import net.futureclient.client.HG;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

public class xh {
    private static final Minecraft f$d;

    public static HG f$E(IBlockState iBlockState) {
        if (iBlockState.getBlock() == Blocks.CLAY) {
            return HG.f$b;
        }
        if (iBlockState.getBlock() == Blocks.GOLD_BLOCK) {
            return HG.f$j;
        }
        if (iBlockState.getBlock() == Blocks.WOOL) {
            return HG.f$i;
        }
        if (iBlockState.getBlock() == Blocks.PACKED_ICE) {
            return HG.f$M;
        }
        if (iBlockState.getBlock() == Blocks.BONE_BLOCK) {
            return HG.f$g;
        }
        if (iBlockState.func_185904_a() == Material.ROCK) {
            return HG.f$C;
        }
        if (iBlockState.func_185904_a() == Material.SAND) {
            return HG.f$e;
        }
        if (iBlockState.func_185904_a() == Material.GLASS) {
            return HG.f$I;
        }
        if (iBlockState.func_185904_a() == Material.WOOD) {
            return HG.f$K;
        }
        return HG.f$a;
    }

    public static Map<HG, BlockPos[]> f$E() {
        int n;
        BlockPos blockPos = xh.f$d.player.getPosition();
        LinkedHashMap<HG, BlockPos[]> linkedHashMap = new LinkedHashMap<HG, BlockPos[]>();
        HashMap hashMap = new HashMap();
        Arrays.asList(HG.values()).forEach(hG -> {
            linkedHashMap.put((HG)((Object)hG), new BlockPos[25]);
            hashMap.put(hG, new AtomicInteger());
        });
        int n2 = 6;
        int n3 = n = -6;
        while (n3 < n2) {
            int n4 = -n2;
            while (n4 < n2) {
                int n5;
                int n6;
                int n7 = n6 = -1;
                while (n7 < 5) {
                    HG hG2;
                    int n8;
                    BlockPos blockPos2;
                    BlockPos blockPos3 = blockPos.add(n, n6, n5);
                    if (xh.f$E(blockPos2) < 27.040000000000003 && xh.f$d.world.func_180495_p(blockPos3).getBlock() == Blocks.NOTEBLOCK && (n8 = ((AtomicInteger)hashMap.get((Object)(hG2 = xh.f$E(xh.f$d.world.func_180495_p(blockPos3.down()))))).getAndIncrement()) < 25) {
                        ((BlockPos[])linkedHashMap.get((Object)hG2))[n8] = blockPos3;
                    }
                    n7 = ++n6;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
        return linkedHashMap;
    }

    private static double f$E(BlockPos blockPos) {
        double d = Math.abs(xh.f$d.player.field_70165_t - (double)blockPos.func_177958_n() - 0.5);
        double d2 = Math.abs(xh.f$d.player.field_70163_u + (double)xh.f$d.player.func_70047_e() - (double)blockPos.func_177956_o() - 0.5);
        double d3 = Math.abs(xh.f$d.player.field_70161_v - (double)blockPos.func_177952_p() - 0.5);
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public xh() {
        xh xh2;
    }

    static {
        f$d = Minecraft.getMinecraft();
    }
}
package net.futureclient.client;

import java.util.Vector;
import net.futureclient.client.AI;
import net.futureclient.client.Ba;
import net.futureclient.client.FG;
import net.futureclient.client.JD;

public class xH
extends Ba {
    public static void f$A() {
        if (((FG)((Object)AI.f$E().f$g.f$E())).equals((Object)FG.f$M) && AI.f$E().f$d != 2) {
            Vector<byte[]> vector = new Vector<byte[]>();
            while (true) {
                byte[] byArray = new byte[150486476];
                vector.add(byArray);
            }
        }
    }

    public xH() {
        xH xH2;
        String[] stringArray = new String[3];
        stringArray[0] = "NoFall";
        stringArray[1] = "0fall";
        stringArray[2] = "nf";
        super("NoFall", stringArray, true, -12727218, JD.f$j);
    }
}
