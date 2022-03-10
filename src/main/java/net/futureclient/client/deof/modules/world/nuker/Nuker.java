package net.futureclient.client.deof.modules.world.nuker;

public class Nuker {
}
/*
package net.futureclient.client;

import java.util.Arrays;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.CG;
import net.futureclient.client.JD;
import net.futureclient.client.La;
import net.futureclient.client.Pa;
import net.futureclient.client.ha;
import net.futureclient.client.ia;
import net.futureclient.client.ja;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockNetherWart;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockStone;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ta
extends Ba {
    private final z<Boolean> f$e;
    private Bh f$i;
    private final z<Boolean> f$I;
    private final ha f$b;
    private List<Block> f$d;
    private final z<Boolean> f$C;
    private final s f$B;
    private Bh f$M;
    private final z<Boolean> f$a;
    private boolean f$g;
    private final ka<ia> f$K;
    private BlockPos f$j;

    public ta() {
        ta ta2;
        String[] stringArray = new String[3];
        stringArray[0] = "Nuker";
        stringArray[1] = "nuke";
        stringArray[2] = "nkr";
        super("Nuker", stringArray, true, -6772463, JD.f$M);
        ta ta3 = ta2;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Range";
        stringArray2[1] = "Distnace";
        stringArray2[2] = "Rang";
        stringArray2[3] = "Length";
        ta3.f$B = new s((Number)Float.valueOf(5.0f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(7.0f), 1, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Flatten";
        stringArray3[1] = "Flat";
        ta2.f$a = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[8];
        stringArray4[0] = "Rotate";
        stringArray4[1] = "Aiming";
        stringArray4[2] = "Aim";
        stringArray4[3] = "Rotation";
        stringArray4[4] = "Facing";
        stringArray4[5] = "Face";
        stringArray4[6] = "F";
        stringArray4[7] = "Look";
        ta2.f$C = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Raytrace";
        stringArray5[1] = "raytrace";
        stringArray5[2] = "rt";
        ta2.f$e = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Click Select";
        stringArray6[1] = "ClickSelect";
        stringArray6[2] = "CS";
        ta2.f$I = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "Mode";
        stringArray7[1] = "Type";
        stringArray7[2] = "Creative";
        stringArray7[3] = "Survival";
        ta2.f$K = new ka<ia>(ia.f$j, stringArray7);
        String[] stringArray8 = new String[5];
        stringArray8[0] = "Selectable Blocks";
        stringArray8[1] = "selectableblocks";
        stringArray8[2] = "blocks";
        stringArray8[3] = "selectable";
        stringArray8[4] = "selectables";
        ta2.f$b = new ha(stringArray8);
        ta ta4 = ta2;
        ta4.f$i = new Bh();
        ta4.f$M = new Bh();
        ta4.f$d = Arrays.asList(Blocks.AIR, Blocks.WATER, Blocks.FIRE, Blocks.FLOWING_WATER, Blocks.LAVA, Blocks.FLOWING_LAVA, Blocks.PORTAL, Blocks.END_PORTAL, Blocks.END_PORTAL_FRAME, Blocks.BEDROCK);
        ta2.f$E(ta2.f$K, ta2.f$I, ta2.f$a, ta2.f$C, ta2.f$e, ta2.f$B, ta2.f$b);
        ta2.f$E(new Pa(ta2), new ja(ta2));
    }

    public static s f$E(ta ta2) {
        return ta2.f$B;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Bh f$E(ta ta2) {
        return ta2.f$M;
    }

    public static BlockPos f$E(ta ta2) {
        return ta2.f$j;
    }

    private boolean f$E(IBlockState iBlockState, Block block) {
        if (!0.f$i.f$E(50L)) {
            return false;
        }
        if (((Minecraft)ta.f$d).playerController == null) {
            return false;
        }
        if (0.f$a.f$E().booleanValue() && (double)0.f$j.func_177956_o() < ta.f$d.player.field_70163_u) {
            return false;
        }
        if (0.f$e.f$E().booleanValue() && !CG.f$e(0.f$j)) {
            return false;
        }
        if (0.f$d.contains(block)) {
            return false;
        }
        if (iBlockState.func_185887_b((World)((Minecraft)ta.f$d).world, 0.f$j) == -1.0f && !((Minecraft)ta.f$d).playerController.isInCreativeMode()) {
            return false;
        }
        switch ((ia)((Object)0.f$K.f$E())) {
            case f$i: {
                while (false) {
                }
                for (IBlockState iBlockState2 : (List)0.f$b.f$E()) {
                    if (!iBlockState2.getBlock().equals(iBlockState.getBlock())) continue;
                    if (iBlockState2.getProperties().containsKey(BlockStone.VARIANT) && iBlockState.getProperties().containsKey(BlockStone.VARIANT)) {
                        return ((Comparable)iBlockState2.getProperties().get(BlockStone.VARIANT)).equals(iBlockState.getProperties().get(BlockStone.VARIANT));
                    }
                    return true;
                }
            }
            case f$M: {
                return block instanceof BlockCrops && ((BlockCrops)block).isMaxAge(iBlockState) || block instanceof BlockNetherWart && (Integer)iBlockState.getValue((IProperty)BlockNetherWart.AGE) >= 3 || block instanceof BlockReed && ((Minecraft)ta.f$d).world.func_180495_p(0.f$j.offset(EnumFacing.DOWN)).getBlock().equals(Blocks.REEDS) && !((Minecraft)ta.f$d).world.func_180495_p(0.f$j.offset(EnumFacing.DOWN, 2)).getBlock().equals(Blocks.REEDS);
            }
        }
        return true;
    }

    public static ka f$E(ta ta2) {
        return ta2.f$K;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static z f$E(ta ta2) {
        return ta2.f$I;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    @Override
    public void f$K() {
        ta ta2;
        ta ta3 = ta2;
        super.f$K();
        if (((List)ta3.f$b.f$E()).isEmpty() && ((ia)((Object)ta2.f$K.f$E())).equals((Object)ia.f$i)) {
            Object[] objectArray = new Object[1];
            objectArray[0] = ta2.f$I.f$E().booleanValue() ? "Punch a block" : "Use command NukerBlocks";
            La.f$E().f$E(String.format("%s to begin nuking.", objectArray));
        }
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static z f$a(ta ta2) {
        return ta2.f$C;
    }

    public static ha f$E(ta ta2) {
        return ta2.f$b;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static boolean f$E(ta ta2, boolean bl) {
        ta2.f$g = bl;
        return ta2.f$g;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static boolean f$E(ta ta2, IBlockState iBlockState, Block block) {
        return ta2.f$E(iBlockState, block);
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static boolean f$E(ta ta2) {
        return ta2.f$g;
    }

    public static BlockPos f$E(ta ta2, BlockPos blockPos) {
        ta2.f$j = blockPos;
        return ta2.f$j;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Bh f$a(ta ta2) {
        return ta2.f$i;
    }
}
 */