package net.futureclient.client.deof.modules.world.fucker;

public class Fucker {
}
/*
package net.futureclient.client;

import java.util.HashSet;
import java.util.LinkedList;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.CG;
import net.futureclient.client.JD;
import net.futureclient.client.Pg;
import net.futureclient.client.Za;
import net.futureclient.client.ka;
import net.futureclient.client.pa;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockDragonEgg;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class Ra
extends Ba {
    private float f$K;
    private s f$e;
    private float f$g;
    private byte f$j;
    private s f$I;
    private s f$C;
    private z<Boolean> f$B;
    private Bh f$M;
    private float f$d;
    private z<Boolean> f$c;
    private EnumFacing f$b;
    private z<Boolean> f$A;
    private BlockPos f$i;
    private ka<pa> f$L;
    private z<Boolean> f$a;

    public static float f$E(Ra ra) {
        return ra.f$K;
    }

    public static byte f$E(Ra ra, byte by) {
        ra.f$j = by;
        return ra.f$j;
    }

    public static s f$E(Ra ra) {
        return ra.f$I;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static z f$E(Ra ra) {
        return ra.f$a;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static float f$E(Ra ra, float f) {
        ra.f$g = f;
        return ra.f$g;
    }

    public static z f$a(Ra ra) {
        return ra.f$B;
    }

    public static EnumFacing f$E(Ra ra) {
        return ra.f$b;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static float f$a(Ra ra, float f) {
        ra.f$d = f;
        return ra.f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static float f$e(Ra ra, float f) {
        ra.f$K = f;
        return ra.f$K;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static float f$a(Ra ra) {
        return ra.f$d;
    }

    public static ka f$E(Ra ra) {
        return ra.f$L;
    }

    public static z f$e(Ra ra) {
        return ra.f$A;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public Ra() {
        Ra ra;
        String[] stringArray = new String[4];
        stringArray[0] = "Fucker";
        stringArray[1] = "BedFucker";
        stringArray[2] = "EggFucker";
        stringArray[3] = "BlockRape";
        super("Fucker", stringArray, true, -2271915, JD.f$M);
        Ra ra2 = ra;
        String[] stringArray2 = new String[7];
        stringArray2[0] = "Mode";
        stringArray2[1] = "Block";
        stringArray2[2] = "Target";
        stringArray2[3] = "Bloach";
        stringArray2[4] = "Blcok";
        stringArray2[5] = "Blok";
        stringArray2[6] = "b";
        ra2.f$L = new ka<pa>(pa.f$j, stringArray2);
        String[] stringArray3 = new String[5];
        stringArray3[0] = "Through Walls";
        stringArray3[1] = "ThroughWalls";
        stringArray3[2] = "RayTrace";
        stringArray3[3] = "RayTracing";
        stringArray3[4] = "NCP";
        ra.f$c = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[8];
        stringArray4[0] = "Rotate";
        stringArray4[1] = "Aiming";
        stringArray4[2] = "Aim";
        stringArray4[3] = "Rotation";
        stringArray4[4] = "Facing";
        stringArray4[5] = "Face";
        stringArray4[6] = "F";
        stringArray4[7] = "Look";
        ra.f$A = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[4];
        stringArray5[0] = "Right Click";
        stringArray5[1] = "RightClick";
        stringArray5[2] = "RightClicking";
        stringArray5[3] = "RClick";
        ra.f$B = new z<Boolean>(false, stringArray5);
        String[] stringArray6 = new String[7];
        stringArray6[0] = "Instant Break";
        stringArray6[1] = "InstantBreak";
        stringArray6[2] = "InstaBreak";
        stringArray6[3] = "IB";
        stringArray6[4] = "FastBreak";
        stringArray6[5] = "Break";
        stringArray6[6] = "IB";
        ra.f$a = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[3];
        stringArray7[0] = "Range";
        stringArray7[1] = "Reach";
        stringArray7[2] = "R";
        ra.f$C = new s((Number)Float.valueOf(4.0f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(6.5f), 0.1, stringArray7);
        String[] stringArray8 = new String[3];
        stringArray8[0] = "StopRange";
        stringArray8[1] = "Stop";
        stringArray8[2] = "SR";
        ra.f$e = new s((Number)Float.valueOf(6.0f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(8.0f), 0.1, stringArray8);
        String[] stringArray9 = new String[3];
        stringArray9[0] = "BreakSpeed";
        stringArray9[1] = "Speed";
        stringArray9[2] = "BS";
        ra.f$I = new s((Number)Float.valueOf(1.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(10.0f), 0.1, stringArray9);
        ra.f$M = new Bh();
        ra.f$E(ra.f$L, ra.f$c, ra.f$A, ra.f$B, ra.f$C, ra.f$e, ra.f$a, ra.f$I);
        ra.f$b = EnumFacing.UP;
        ra.f$j = 0;
        ra.f$E(new Za(ra));
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Bh f$E(Ra ra) {
        return ra.f$M;
    }

    private BlockPos f$E() {
        LinkedList<BlockPos> linkedList = new LinkedList<BlockPos>();
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        linkedList.add(new BlockPos((Entity)Ra.f$d.player));
        block6: while (true) {
            LinkedList<BlockPos> linkedList2 = linkedList;
            while (true) {
                Ra ra;
                if (linkedList2.isEmpty()) {
                    return null;
                }
                BlockPos blockPos = (BlockPos)linkedList.poll();
                if (hashSet.contains(blockPos)) {
                    linkedList2 = linkedList;
                    continue;
                }
                hashSet.add(blockPos);
                if (blockPos == null) continue block6;
                if (CG.f$E(blockPos) > (double)(ra.f$C.f$E().floatValue() * ra.f$C.f$E().floatValue())) {
                    linkedList2 = linkedList;
                    continue;
                }
                switch ((pa)((Object)ra.f$L.f$E())) {
                    case f$j: {
                        if (!(Ra.f$d.world.func_180495_p(blockPos).getBlock() instanceof BlockBed)) break;
                        return blockPos;
                    }
                    case f$i: {
                        if (!(Ra.f$d.world.func_180495_p(blockPos).getBlock() instanceof BlockDragonEgg)) break;
                        return blockPos;
                    }
                    case f$M: {
                        if (!(Ra.f$d.world.func_180495_p(blockPos).getBlock() instanceof BlockCake)) break;
                        return blockPos;
                    }
                    case f$g: {
                        if (!Ra.f$d.world.func_180495_p(blockPos.offset(EnumFacing.UP)).getBlock().equals(Blocks.AIR)) break;
                        if (Pg.f$E(ItemHoe.class) != null) {
                            if (Ra.f$d.world.func_180495_p(blockPos).getBlock().equals(Blocks.DIRT)) return blockPos;
                            if (!Ra.f$d.world.func_180495_p(blockPos).getBlock().equals(Blocks.GRASS)) break;
                            return blockPos;
                        } else {
                            if (!(Pg.f$E(Items.NETHER_WART) != null ? Ra.f$d.world.func_180495_p(blockPos).getBlock().equals(Blocks.SOUL_SAND) : (Pg.f$E(ItemSeeds.class) != null || Pg.f$E(ItemSeedFood.class) != null) && Ra.f$d.world.func_180495_p(blockPos).getBlock().equals(Blocks.FARMLAND))) break;
                            return blockPos;
                        }
                    }
                }
                if (!ra.f$c.f$E().booleanValue() && !CG.f$e(blockPos)) {
                    linkedList2 = linkedList;
                    continue;
                }
                LinkedList<BlockPos> linkedList3 = linkedList;
                linkedList2 = linkedList3;
                linkedList3.add(blockPos.north());
                linkedList.add(blockPos.south());
                linkedList.add(blockPos.west());
                linkedList.add(blockPos.east());
                linkedList.add(blockPos.down());
                linkedList.add(blockPos.up());
            }
            break;
        }
    }

    public static byte f$a(Ra ra) {
        return ra.f$j;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static BlockPos f$E(Ra ra) {
        return ra.f$i;
    }

    public static BlockPos f$E(Ra ra, BlockPos blockPos) {
        ra.f$i = blockPos;
        return ra.f$i;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static byte f$E(Ra ra) {
        ra.f$j = (byte)(ra.f$j - 1);
        return ra.f$j;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static float f$e(Ra ra) {
        return ra.f$g;
    }

    public static s f$a(Ra ra) {
        return ra.f$e;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static BlockPos f$a(Ra ra) {
        return ra.f$E();
    }
}
 */