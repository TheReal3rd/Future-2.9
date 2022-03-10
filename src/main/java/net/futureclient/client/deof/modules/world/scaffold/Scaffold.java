package net.futureclient.client.deof.modules.world.scaffold;

public class Scaffold {
}
/*
package net.futureclient.client;

import java.util.Arrays;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.Ea;
import net.futureclient.client.Ga;
import net.futureclient.client.JD;
import net.futureclient.client.Ka;
import net.futureclient.client.Rg;
import net.futureclient.client.aa;
import net.futureclient.client.da;
import net.futureclient.client.ka;
import net.futureclient.client.n;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class Ca
extends Ba {
    private float f$g;
    private z<Boolean> f$C;
    private boolean f$d;
    private Bh f$j;
    private List<Block> f$A;
    public int f$B;
    private ka<Ka> f$e;
    private final n f$b;
    private s f$I;
    private final ka<da> f$K;
    private List<Block> f$c;
    public Rg f$L;
    private float f$M;
    private z<Boolean> f$a;
    private Bh f$i;

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static boolean f$E(Ca ca) {
        return ca.f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static float f$E(Ca ca) {
        return ca.f$M;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$X() {
        return f$d;
    }

    public static Minecraft f$q() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$V() {
        return f$d;
    }

    public static float f$a(Ca ca, float f) {
        ca.f$g = f;
        return ca.f$g;
    }

    @Override
    public void f$K() {
        Ca ca;
        ca.f$L = null;
        super.f$K();
    }

    public static float f$E(Ca ca, float f) {
        ca.f$M = f;
        return ca.f$M;
    }

    public static z f$a(Ca ca) {
        return ca.f$C;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static ka f$E(Ca ca) {
        return ca.f$e;
    }

    private Rg f$E(BlockPos blockPos) {
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos.add(0, -1, 0)).getBlock())) {
            return new Rg(blockPos.add(0, -1, 0), EnumFacing.UP);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos.add(-1, 0, 0)).getBlock())) {
            return new Rg(blockPos.add(-1, 0, 0), EnumFacing.EAST);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos.add(1, 0, 0)).getBlock())) {
            return new Rg(blockPos.add(1, 0, 0), EnumFacing.WEST);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos.add(0, 0, -1)).getBlock())) {
            return new Rg(blockPos.add(0, 0, -1), EnumFacing.SOUTH);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos.add(0, 0, 1)).getBlock())) {
            return new Rg(blockPos.add(0, 0, 1), EnumFacing.NORTH);
        }
        BlockPos blockPos2 = blockPos.add(-1, 0, 0);
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(-1, 0, 0)).getBlock())) {
            return new Rg(blockPos2.add(-1, 0, 0), EnumFacing.EAST);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(1, 0, 0)).getBlock())) {
            return new Rg(blockPos2.add(1, 0, 0), EnumFacing.WEST);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(0, 0, -1)).getBlock())) {
            return new Rg(blockPos2.add(0, 0, -1), EnumFacing.SOUTH);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(0, 0, 1)).getBlock())) {
            return new Rg(blockPos2.add(0, 0, 1), EnumFacing.NORTH);
        }
        blockPos2 = blockPos.add(1, 0, 0);
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(-1, 0, 0)).getBlock())) {
            return new Rg(blockPos2.add(-1, 0, 0), EnumFacing.EAST);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(1, 0, 0)).getBlock())) {
            return new Rg(blockPos2.add(1, 0, 0), EnumFacing.WEST);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(0, 0, -1)).getBlock())) {
            return new Rg(blockPos2.add(0, 0, -1), EnumFacing.SOUTH);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(0, 0, 1)).getBlock())) {
            return new Rg(blockPos2.add(0, 0, 1), EnumFacing.NORTH);
        }
        blockPos2 = blockPos.add(0, 0, -1);
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(-1, 0, 0)).getBlock())) {
            return new Rg(blockPos2.add(-1, 0, 0), EnumFacing.EAST);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(1, 0, 0)).getBlock())) {
            return new Rg(blockPos2.add(1, 0, 0), EnumFacing.WEST);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(0, 0, -1)).getBlock())) {
            return new Rg(blockPos2.add(0, 0, -1), EnumFacing.SOUTH);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos2.add(0, 0, 1)).getBlock())) {
            return new Rg(blockPos2.add(0, 0, 1), EnumFacing.NORTH);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p((blockPos = blockPos.add(0, 0, 1)).add(-1, 0, 0)).getBlock())) {
            return new Rg(blockPos.add(-1, 0, 0), EnumFacing.EAST);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos.add(1, 0, 0)).getBlock())) {
            return new Rg(blockPos.add(1, 0, 0), EnumFacing.WEST);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos.add(0, 0, -1)).getBlock())) {
            return new Rg(blockPos.add(0, 0, -1), EnumFacing.SOUTH);
        }
        if (!0.f$c.contains(Ca.f$d.world.func_180495_p(blockPos.add(0, 0, 1)).getBlock())) {
            return new Rg(blockPos.add(0, 0, 1), EnumFacing.NORTH);
        }
        return null;
    }

    public static z f$E(Ca ca) {
        return ca.f$a;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static Rg f$E(Ca ca, BlockPos blockPos) {
        return ca.f$E(blockPos);
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static boolean f$E(Ca ca, boolean bl) {
        ca.f$d = bl;
        return ca.f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static int f$E(Ca ca) {
        return ca.f$a();
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static List f$E(Ca ca) {
        return ca.f$A;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static s f$E(Ca ca) {
        return ca.f$I;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static Bh f$a(Ca ca) {
        return ca.f$i;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    private int f$a() {
        int n2;
        Ca ca;
        ItemStack itemStack = Ca.f$d.player.field_71071_by.getCurrentItem();
        if (itemStack.getCount() != 0 && itemStack.getItem() instanceof ItemBlock && (((da)((Object)ca.f$K.f$E())).equals((Object)da.f$i) || ((da)((Object)ca.f$K.f$E())).equals((Object)da.f$M) && ((List)ca.f$b.f$E()).contains(itemStack.getItem()) || ((da)((Object)ca.f$K.f$E())).equals((Object)da.f$g) && !((List)ca.f$b.f$E()).contains(itemStack.getItem()))) {
            return Ca.f$d.player.field_71071_by.currentItem;
        }
        int n3 = n2 = 36;
        while (n3 < 45) {
            ItemStack itemStack2 = Ca.f$d.player.field_71069_bz.getSlot(n2).getStack();
            if (itemStack2.getItem() instanceof ItemBlock && (((da)((Object)ca.f$K.f$E())).equals((Object)da.f$i) || ((da)((Object)ca.f$K.f$E())).equals((Object)da.f$M) && ((List)ca.f$b.f$E()).contains(itemStack2.getItem()) || ((da)((Object)ca.f$K.f$E())).equals((Object)da.f$g) && !((List)ca.f$b.f$E()).contains(itemStack2.getItem()))) {
                return n2 - 36;
            }
            n3 = ++n2;
        }
        return -1;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public Ca() {
        Ca ca;
        String[] stringArray = new String[4];
        stringArray[0] = "Scaffold";
        stringArray[1] = "ScaffoldWalk";
        stringArray[2] = "Scaffo";
        stringArray[3] = "Tower";
        super("Scaffold", stringArray, true, -6772395, JD.f$M);
        Ca ca2 = ca;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Tower";
        stringArray2[1] = "Tow";
        stringArray2[2] = "t";
        ca2.f$a = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "StopMotion";
        stringArray3[1] = "Motion";
        stringArray3[2] = "AAC";
        stringArray3[3] = "ac";
        ca.f$C = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "Mode";
        stringArray4[1] = "Mod";
        stringArray4[2] = "Type";
        stringArray4[3] = "m";
        ca.f$e = new ka<Ka>(Ka.f$M, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Delay";
        stringArray5[1] = "Del";
        stringArray5[2] = "d";
        ca.f$I = new s((Number)Float.valueOf(75.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(600.0f), 1, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Selection";
        stringArray6[1] = "SelectionMode";
        stringArray6[2] = "s";
        ca.f$K = new ka<da>(da.f$i, stringArray6);
        String[] stringArray7 = new String[7];
        stringArray7[0] = "Items";
        stringArray7[1] = "blocks";
        stringArray7[2] = "whitelist";
        stringArray7[3] = "blacklist";
        stringArray7[4] = "selectable";
        stringArray7[5] = "selectableitems";
        stringArray7[6] = "i";
        ca.f$b = new n(stringArray7);
        Ca ca3 = ca;
        ca3.f$j = new Bh();
        ca3.f$i = new Bh();
        ca3.f$c = Arrays.asList(Blocks.AIR, Blocks.WATER, Blocks.FIRE, Blocks.FLOWING_WATER, Blocks.LAVA, Blocks.FLOWING_LAVA);
        ca.f$A = Arrays.asList(Blocks.LAVA, Blocks.FLOWING_LAVA, Blocks.WATER, Blocks.FLOWING_WATER);
        ca.f$L = null;
        ca.f$E(ca.f$e, ca.f$K, ca.f$b, ca.f$a, ca.f$C, ca.f$I);
        ca.f$E(new Ea(ca), new Ga(ca), new aa(ca));
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Bh f$E(Ca ca) {
        return ca.f$j;
    }

    public static float f$a(Ca ca) {
        return ca.f$g;
    }
}
 */