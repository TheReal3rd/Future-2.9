package net.futureclient.client;

public enum BA {
    f$K,
    f$b,
    f$j,
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BA() {
        BA bA;
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.futureclient.client.HF;
import net.futureclient.client.Ha;
import net.futureclient.client.J;
import net.futureclient.client.JD;
import net.futureclient.client.La;
import net.futureclient.client.Q;
import net.futureclient.client.fE;
import net.futureclient.client.if;
import net.futureclient.client.ig;
import net.futureclient.client.kH;
import net.futureclient.client.ma;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Ba
extends ma
implements J {
    private final Ha f$g;
    private boolean f$j;
    public float f$b;
    private JD f$i;
    private final Ha f$d;
    private boolean f$i;
    private int f$M;
    private List<Ha> f$K;

    public void f$a(boolean bl) {
        0.f$i = bl;
    }

    public boolean f$a() {
        Ba ba;
        return ba.f$i;
    }

    @Override
    public boolean f$E() {
        Ba ba;
        return ba.f$j;
    }

    @Override
    public void f$E() {
        Ba ba;
        Ba ba2 = ba;
        ba2.f$E(!ba2.f$j);
    }

    public int f$E() {
        Ba ba;
        return ba.f$M;
    }

    public Ba(String string, String[] stringArray, boolean bl, int n, JD jD) {
        Ba ba = 0;
        super(string, stringArray);
        Ba ba2 = 0;
        0.f$K = new ArrayList<Ha>();
        0.f$M = n;
        ba.f$i = jD;
        ba.f$i = bl;
        ba.f$g = new fE(0);
        0.f$d = new HF(0);
        if (string.equalsIgnoreCase("ClickGui")) {
            Object[] objectArray = new Object[1];
            objectArray[0] = 0.f$E()[0].toLowerCase().replace(" ", "");
            kH.f$E().f$E().f$E(new ig(String.format("%sToggle", objectArray), new if(0), 54));
            return;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = 0.f$E()[0].toLowerCase().replace(" ", "");
        kH.f$E().f$E().f$E(new ig(String.format("%sToggle", objectArray), new if(0), 0));
    }

    public void f$K() {
        Ba ba;
        ba.f$K.forEach(ha -> kH.f$E().f$E().f$a((Ha)ha));
        if (ba.getClass().isAnnotationPresent(Q.class)) {
            Q q = ba.getClass().getAnnotation(Q.class);
            La.f$E().f$E(String.format("&cNOTE: &7%s", q.f$E()));
        }
        kH.f$E().f$E().f$a(ba.f$g);
    }

    public void f$E(Ha ... haArray) {
        Collections.addAll(0.f$K, haArray);
    }

    @Override
    public JD f$E() {
        Ba ba;
        return ba.f$i;
    }

    public static boolean f$E(Ba ba) {
        return ba.f$j;
    }

    public void f$B() {
        Ba ba;
        ba.f$K.forEach(ha -> kH.f$E().f$E().f$E((Ha)ha));
        kH.f$E().f$E().f$a(ba.f$d);
    }

    @Override
    public void f$E(boolean bl) {
        0.f$j = bl;
        if (0.f$j) {
            0.f$K();
            return;
        }
        0.f$B();
    }

    public void f$E(int n) {
        0.f$M = n;
    }
}
package net.futureclient.client;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.Aa;
import net.futureclient.client.Ba;
import net.futureclient.client.Fa;
import net.futureclient.client.JD;
import net.futureclient.client.OC;
import net.futureclient.client.U;
import net.futureclient.client.fa;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.la;
import net.futureclient.client.s;
import net.futureclient.client.tI;
import net.futureclient.client.z;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class ba
extends Ba {
    private ka<Aa> f$I;
    private boolean f$d;
    private final List<Block> f$i;
    private int f$g;
    private final U f$j;
    private int f$M;
    private z<Boolean> f$b;
    public s f$K;

    public static int f$E(ba ba2) {
        return ba2.f$g;
    }

    public static z f$E(ba ba2) {
        return ba2.f$b;
    }

    public static int f$a(ba ba2) {
        return ba2.f$M;
    }

    public static boolean f$E(ba ba2, Block block) {
        return ba2.f$E(block);
    }

    public boolean f$E(Block block2, BlockPos blockPos) {
        EnumFacing enumFacing;
        int n;
        if (((Aa)((Object)0.f$I.f$E())).equals((Object)Aa.f$M)) {
            return ((List)0.f$j.f$E()).contains(block2);
        }
        boolean block2 = 0.f$i.contains(block2);
        boolean bl = false;
        EnumFacing[] enumFacingArray = EnumFacing.Plane.HORIZONTAL.facings();
        int n2 = enumFacingArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            enumFacing = enumFacingArray[n];
            BlockPos blockPos2 = blockPos.add(enumFacing.getOpposite().getDirectionVec());
            IBlockState iBlockState = ba.f$d.world.func_180495_p(blockPos2);
            if (iBlockState.getBlock() instanceof BlockRedstoneTorch && iBlockState.getValue((IProperty)BlockTorch.FACING) == enumFacing.getOpposite()) {
                bl = true;
            }
            n3 = ++n;
        }
        boolean bl2 = false;
        EnumFacing enumFacing2 = EnumFacing.DOWN;
        BlockPos blockPos3 = blockPos.add(enumFacing2.getOpposite().getDirectionVec());
        enumFacing = ba.f$d.world.func_180495_p(blockPos3);
        if (enumFacing.getBlock() instanceof BlockRedstoneTorch && enumFacing.getValue((IProperty)BlockTorch.FACING) != EnumFacing.UP) {
            bl2 = true;
        }
        boolean bl3 = bl;
        boolean bl4 = bl2;
        boolean bl5 = blockPos = 0.f$i.contains(blockPos = ba.f$d.world.func_180495_p(blockPos.add(0, 1, 0)).getBlock()) && !bl4;
        return block2 || blockPos || bl3;
    }

    private boolean f$E(Block block) {
        if (((Aa)((Object)0.f$I.f$E())).equals((Object)Aa.f$M)) {
            return ((List)0.f$j.f$E()).contains(block);
        }
        return 0.f$i.contains(block);
    }

    private List<Block> f$B() {
        ArrayList<Block> arrayList = new ArrayList<Block>();
        boolean bl = arrayList.add(Blocks.EMERALD_ORE);
        ArrayList<Block> arrayList2 = arrayList;
        arrayList.add(Blocks.GOLD_ORE);
        arrayList2.add(Blocks.IRON_ORE);
        arrayList.add(Blocks.COAL_ORE);
        arrayList.add(Blocks.LAPIS_ORE);
        arrayList.add(Blocks.DIAMOND_ORE);
        arrayList.add(Blocks.REDSTONE_ORE);
        arrayList.add(Blocks.LIT_REDSTONE_ORE);
        arrayList.add(Blocks.TNT);
        arrayList.add(Blocks.EMERALD_ORE);
        arrayList.add(Blocks.FURNACE);
        arrayList.add(Blocks.LIT_FURNACE);
        arrayList.add(Blocks.DIAMOND_BLOCK);
        arrayList.add(Blocks.IRON_BLOCK);
        arrayList.add(Blocks.GOLD_BLOCK);
        arrayList.add(Blocks.EMERALD_BLOCK);
        arrayList.add(Blocks.QUARTZ_ORE);
        arrayList.add((Block)Blocks.BEACON);
        arrayList.add(Blocks.MOB_SPAWNER);
        return arrayList2;
    }

    private List<Block> f$e() {
        ArrayList<Block> arrayList = new ArrayList<Block>();
        boolean bl = arrayList.add(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
        ArrayList<Block> arrayList2 = arrayList;
        arrayList.add(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
        arrayList2.add(Blocks.STONE_PRESSURE_PLATE);
        arrayList.add(Blocks.WOODEN_PRESSURE_PLATE);
        arrayList.add(Blocks.STONE_BUTTON);
        arrayList.add(Blocks.WOODEN_BUTTON);
        arrayList.add(Blocks.LEVER);
        arrayList.add(Blocks.COMMAND_BLOCK);
        arrayList.add(Blocks.CHAIN_COMMAND_BLOCK);
        arrayList.add(Blocks.REPEATING_COMMAND_BLOCK);
        arrayList.add((Block)Blocks.DAYLIGHT_DETECTOR);
        arrayList.add((Block)Blocks.DAYLIGHT_DETECTOR_INVERTED);
        arrayList.add(Blocks.DISPENSER);
        arrayList.add(Blocks.DROPPER);
        arrayList.add((Block)Blocks.HOPPER);
        arrayList.add(Blocks.OBSERVER);
        arrayList.add(Blocks.TRAPDOOR);
        arrayList.add(Blocks.IRON_TRAPDOOR);
        arrayList.add(Blocks.REDSTONE_BLOCK);
        arrayList.add(Blocks.REDSTONE_LAMP);
        arrayList.add(Blocks.REDSTONE_TORCH);
        arrayList.add(Blocks.UNLIT_REDSTONE_TORCH);
        arrayList.add((Block)Blocks.REDSTONE_WIRE);
        arrayList.add((Block)Blocks.POWERED_REPEATER);
        arrayList.add((Block)Blocks.UNPOWERED_REPEATER);
        arrayList.add((Block)Blocks.POWERED_COMPARATOR);
        arrayList.add((Block)Blocks.UNPOWERED_COMPARATOR);
        arrayList.add(Blocks.LIT_REDSTONE_LAMP);
        arrayList.add(Blocks.REDSTONE_ORE);
        arrayList.add(Blocks.LIT_REDSTONE_ORE);
        arrayList.add((Block)Blocks.ACACIA_DOOR);
        arrayList.add((Block)Blocks.DARK_OAK_DOOR);
        arrayList.add((Block)Blocks.BIRCH_DOOR);
        arrayList.add((Block)Blocks.JUNGLE_DOOR);
        arrayList.add((Block)Blocks.OAK_DOOR);
        arrayList.add((Block)Blocks.SPRUCE_DOOR);
        arrayList.add((Block)Blocks.DARK_OAK_DOOR);
        arrayList.add((Block)Blocks.IRON_DOOR);
        arrayList.add(Blocks.OAK_FENCE);
        arrayList.add(Blocks.SPRUCE_FENCE);
        arrayList.add(Blocks.BIRCH_FENCE);
        arrayList.add(Blocks.JUNGLE_FENCE);
        arrayList.add(Blocks.DARK_OAK_FENCE);
        arrayList.add(Blocks.ACACIA_FENCE);
        arrayList.add(Blocks.OAK_FENCE_GATE);
        arrayList.add(Blocks.SPRUCE_FENCE_GATE);
        arrayList.add(Blocks.BIRCH_FENCE_GATE);
        arrayList.add(Blocks.JUNGLE_FENCE_GATE);
        arrayList.add(Blocks.DARK_OAK_FENCE_GATE);
        arrayList.add(Blocks.ACACIA_FENCE_GATE);
        arrayList.add(Blocks.JUKEBOX);
        arrayList.add(Blocks.NOTEBLOCK);
        arrayList.add((Block)Blocks.PISTON);
        arrayList.add((Block)Blocks.PISTON_EXTENSION);
        arrayList.add((Block)Blocks.PISTON_HEAD);
        arrayList.add((Block)Blocks.STICKY_PISTON);
        arrayList.add(Blocks.TNT);
        arrayList.add(Blocks.SLIME_BLOCK);
        arrayList.add(Blocks.TRIPWIRE);
        arrayList.add((Block)Blocks.TRIPWIRE_HOOK);
        arrayList.add(Blocks.RAIL);
        arrayList.add(Blocks.ACTIVATOR_RAIL);
        arrayList.add(Blocks.DETECTOR_RAIL);
        arrayList.add(Blocks.GOLDEN_RAIL);
        return arrayList2;
    }

    public static int f$a(ba ba2, int n) {
        ba2.f$M = n;
        return ba2.f$M;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    @Override
    public void f$K() {
        ba ba2;
        ba ba3;
        ba ba4;
        try {
            Field field;
            Class<?> clazz = Class.forName("net.minecraftforge.common.ForgeModContainer", true, ba4.getClass().getClassLoader());
            Field field2 = field = clazz.getDeclaredField("forgeLightPipelineEnabled");
            boolean bl = field.isAccessible();
            field2.setAccessible(true);
            ba4.f$d = field.getBoolean(null);
            field2.set(null, false);
            field2.setAccessible(bl);
            ba3 = ba4;
        }
        catch (Exception exception) {
            ba3 = ba4;
        }
        ba3.f$M = ba4.f$K.f$E().intValue();
        ba4.f$g = ((List)ba4.f$j.f$E()).size();
        ba.f$d.renderChunksMany = false;
        if (ba4.f$b.f$E().booleanValue()) {
            tI.f$a();
            ba2 = ba4;
        } else {
            tI.f$E();
            ba2 = ba4;
        }
        super.f$K();
    }

    public ba() {
        ba ba2;
        String[] stringArray = new String[3];
        stringArray[0] = "Wallhack";
        stringArray[1] = "X-Ray";
        stringArray[2] = "wh";
        super("Wallhack", stringArray, true, -2525659, JD.f$M);
        ba ba3 = ba2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Mode";
        stringArray2[1] = "Type";
        ba3.f$I = new ka<Aa>(Aa.f$M, stringArray2);
        String[] stringArray3 = new String[6];
        stringArray3[0] = "Opacity";
        stringArray3[1] = "Op";
        stringArray3[2] = "Oapcity";
        stringArray3[3] = "Oapcit";
        stringArray3[4] = "Opacit";
        stringArray3[5] = "o";
        ba2.f$K = new s((Number)Float.valueOf(120.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(255.0f), 1, stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "Soft Reload";
        stringArray4[1] = "softreload";
        stringArray4[2] = "soft";
        stringArray4[3] = "sr";
        ba2.f$b = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[2];
        stringArray5[0] = "Blocks";
        stringArray5[1] = "Ores";
        ba2.f$j = new U(ba2.f$B(), stringArray5);
        ba2.f$i = ba2.f$e();
        ba2.f$d = false;
        ba2.f$E(ba2.f$I, ba2.f$K, ba2.f$b, ba2.f$j);
        ba2.f$E(new fa(ba2), new Fa(ba2), new la(ba2));
    }

    public static int f$E(ba ba2, int n) {
        ba2.f$g = n;
        return ba2.f$g;
    }

    public static ka f$E(ba ba2) {
        return ba2.f$I;
    }

    public static U f$E(ba ba2) {
        return ba2.f$j;
    }

    @Override
    public void f$B() {
        ba ba2;
        Object object;
        ba ba3;
        try {
            object = Class.forName("net.minecraftforge.common.ForgeModContainer", true, ba3.getClass().getClassLoader());
            Field field = ((Class)object).getDeclaredField("forgeLightPipelineEnabled");
            boolean bl = field.isAccessible();
            field.setAccessible(true);
            field.set(null, ba3.f$d);
            field.setAccessible(bl);
        }
        catch (Exception exception) {
            // empty catch block
        }
        object = (OC)kH.f$E().f$E().f$E(OC.class);
        if (object != null && !((Ba)object).f$E()) {
            ba.f$d.gameSettings.gammaSetting = 1.0f;
        }
        ba.f$d.renderChunksMany = true;
        if (ba3.f$b.f$E().booleanValue()) {
            tI.f$a();
            ba2 = ba3;
        } else {
            tI.f$E();
            ba2 = ba3;
        }
        super.f$B();
    }
}
package net.futureclient.client;

import net.futureclient.client.Af;
import net.futureclient.client.Ha;
import net.futureclient.client.MA;
import net.futureclient.client.s;
import net.minecraft.entity.player.EnumPlayerModelParts;

public class bA
extends Ha<Af> {
    public final MA f$d;

    @Override
    public void f$E(Af af) {
        if (MA.f$E(0.f$d).f$a(((s)MA.f$E(0.f$d)).f$E().floatValue() * 1000.0f)) {
            int n;
            EnumPlayerModelParts[] enumPlayerModelPartsArray = EnumPlayerModelParts.values();
            int n2 = enumPlayerModelPartsArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                EnumPlayerModelParts enumPlayerModelParts = enumPlayerModelPartsArray[n];
                MA.f$E().gameSettings.setModelPartEnabled(enumPlayerModelParts, ((Boolean)MA.f$E(0.f$d).f$E()).booleanValue() ? Math.random() < 0.5 : !MA.f$a().gameSettings.getModelParts().contains(enumPlayerModelParts));
                n3 = ++n;
            }
            MA.f$E(0.f$d).f$a();
        }
    }

    public bA(MA mA) {
        0.f$d = mA;
    }
}
