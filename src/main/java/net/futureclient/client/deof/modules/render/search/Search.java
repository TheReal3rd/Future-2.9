package net.futureclient.client.deof.modules.render.search;

public class Search {
}
/*
package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.OA;
import net.futureclient.client.OI;
import net.futureclient.client.U;
import net.futureclient.client.iB;
import net.futureclient.client.ld;
import net.futureclient.client.s;
import net.futureclient.client.tI;
import net.futureclient.client.z;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;

public class Gb
extends Ba {
    private int f$d;
    private final s f$i;
    private final z<Boolean> f$b;
    private final z<Boolean> f$I;
    public final CopyOnWriteArrayList<OI> f$g;
    private final z<Boolean> f$K;
    private final z<Boolean> f$j;
    private final U f$M;

    @Override
    public void f$K() {
        Gb gb;
        Gb gb2 = gb;
        super.f$K();
        gb2.f$d = ((List)gb2.f$M.f$E()).size();
        if (gb.f$j.f$E().booleanValue()) {
            tI.f$a();
            return;
        }
        tI.f$E();
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static z f$a(Gb gb) {
        return gb.f$b;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static z f$e(Gb gb) {
        return gb.f$I;
    }

    public static int f$E(Gb gb, IBlockState iBlockState) {
        return gb.f$E(iBlockState);
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    private int f$E(IBlockState iBlockState2) {
        int n = Block.getIdFromBlock((Block)iBlockState2.getBlock());
        if (n == 56) {
            return 9480789;
        }
        if (n == 57) {
            return 9480789;
        }
        if (n == 14) {
            return -1869610923;
        }
        if (n == 41) {
            return -1869610923;
        }
        if (n == 15) {
            return -2140123051;
        }
        if (n == 42) {
            return -2140123051;
        }
        if (n == 16) {
            return 0x20202055;
        }
        if (n == 21) {
            return 3170389;
        }
        if (n == 73) {
            return 0x60000055;
        }
        if (n == 74) {
            return 0x60000055;
        }
        if (n == 129) {
            return 8396885;
        }
        if (n == 98) {
            return 9480789;
        }
        if (n == 354) {
            return 9480789;
        }
        if (n == 49) {
            return 1696715042;
        }
        if (n == 90) {
            return 1696715076;
        }
        if (n == 10) {
            return -7141377;
        }
        if (n == 11) {
            return -7141547;
        }
        if (n == 52) {
            return 8051029;
        }
        if (n == 26) {
            return -16777131;
        }
        if (n == 5) {
            return -1517671851;
        }
        if (n == 17) {
            return -1517671851;
        }
        if (n == 162) {
            return -1517671851;
        }
        if (n == 112) {
            return 16728862;
        }
        int iBlockState2 = iBlockState2.func_185904_a().getMaterialMapColor().colorValue;
        n = iBlockState2 >> 16 & 0xFF;
        int n2 = iBlockState2 >> 8 & 0xFF;
        return (int)Long.parseLong(String.format("%02x%02x%02x%02x", n, n2, iBlockState2 &= 0xFF, 100), 16);
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static int f$E(Gb gb, int n) {
        gb.f$d = n;
        return gb.f$d;
    }

    public Gb() {
        Gb gb;
        String[] stringArray = new String[2];
        stringArray[0] = "Search";
        stringArray[1] = "Find";
        super("Search", stringArray, true, -6750208, JD.f$i);
        Gb gb2 = gb;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "BoundingBox";
        stringArray2[1] = "Bound";
        gb2.f$I = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Tracers";
        stringArray3[1] = "Tracer";
        gb.f$K = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Fill";
        stringArray4[1] = "filling";
        stringArray4[2] = "fillings";
        gb.f$b = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[4];
        stringArray5[0] = "Soft Reload";
        stringArray5[1] = "softreload";
        stringArray5[2] = "soft";
        stringArray5[3] = "sr";
        gb.f$j = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[4];
        stringArray6[0] = "Width";
        stringArray6[1] = "With";
        stringArray6[2] = "Radius";
        stringArray6[3] = "raidus";
        gb.f$i = new s((Number)Float.valueOf(0.6f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(10.0f), 0.1, stringArray6);
        String[] stringArray7 = new String[2];
        stringArray7[0] = "Blocks";
        stringArray7[1] = "Ores";
        gb.f$M = new U(gb.f$e(), stringArray7);
        gb.f$g = new CopyOnWriteArrayList();
        gb.f$E(gb.f$i, gb.f$K, gb.f$I, gb.f$b, gb.f$j, gb.f$M);
        gb.f$E(new ld(gb), new OA(gb), new iB(gb));
    }

    public static int f$E(Gb gb) {
        return gb.f$d;
    }

    public static z f$E(Gb gb) {
        return gb.f$K;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static U f$E(Gb gb) {
        return gb.f$M;
    }

    public static z f$B(Gb gb) {
        return gb.f$j;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    private List<Block> f$e() {
        ArrayList<Block> arrayList = new ArrayList<Block>();
        boolean bl = arrayList.add(Blocks.MOB_SPAWNER);
        ArrayList<Block> arrayList2 = arrayList;
        arrayList.add((Block)Blocks.PORTAL);
        arrayList2.add(Blocks.END_PORTAL_FRAME);
        arrayList.add(Blocks.END_PORTAL);
        arrayList.add(Blocks.DISPENSER);
        arrayList.add(Blocks.DROPPER);
        arrayList.add((Block)Blocks.HOPPER);
        arrayList.add(Blocks.FURNACE);
        arrayList.add(Blocks.LIT_FURNACE);
        arrayList.add((Block)Blocks.CHEST);
        arrayList.add(Blocks.TRAPPED_CHEST);
        arrayList.add(Blocks.ENDER_CHEST);
        arrayList.add(Blocks.WHITE_SHULKER_BOX);
        arrayList.add(Blocks.ORANGE_SHULKER_BOX);
        arrayList.add(Blocks.MAGENTA_SHULKER_BOX);
        arrayList.add(Blocks.LIGHT_BLUE_SHULKER_BOX);
        arrayList.add(Blocks.YELLOW_SHULKER_BOX);
        arrayList.add(Blocks.LIME_SHULKER_BOX);
        arrayList.add(Blocks.PINK_SHULKER_BOX);
        arrayList.add(Blocks.GRAY_SHULKER_BOX);
        arrayList.add(Blocks.SILVER_SHULKER_BOX);
        arrayList.add(Blocks.CYAN_SHULKER_BOX);
        arrayList.add(Blocks.PURPLE_SHULKER_BOX);
        arrayList.add(Blocks.BLUE_SHULKER_BOX);
        arrayList.add(Blocks.BROWN_SHULKER_BOX);
        arrayList.add(Blocks.GREEN_SHULKER_BOX);
        arrayList.add(Blocks.RED_SHULKER_BOX);
        arrayList.add(Blocks.BLACK_SHULKER_BOX);
        return arrayList2;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public U f$E() {
        Gb gb;
        return gb.f$M;
    }

    public static s f$E(Gb gb) {
        return gb.f$i;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    @Override
    public void f$B() {
        Gb gb;
        Gb gb2 = gb;
        gb2.f$g.clear();
        super.f$B();
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }
}
 */