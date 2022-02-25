package net.futureclient.client;

import net.futureclient.client.BG;
import net.futureclient.client.Ba;
import net.futureclient.client.CB;
import net.futureclient.client.Ec;
import net.futureclient.client.Ih;
import net.futureclient.client.JD;
import net.futureclient.client.Kh;
import net.futureclient.client.Vc;
import net.futureclient.client.ad;
import net.futureclient.client.ji;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.yc;
import net.minecraft.client.Minecraft;

public class RA
extends Ba {
    private ka<ji> f$g;
    private Kh f$M;
    private ji f$d;

    public static ji f$E(RA rA) {
        return rA.f$d;
    }

    public RA() {
        RA rA;
        String[] stringArray = new String[7];
        stringArray[0] = "Translate";
        stringArray[1] = "Translator";
        stringArray[2] = "trans";
        stringArray[3] = "Lanugage";
        stringArray[4] = "Language";
        stringArray[5] = "Lang";
        stringArray[6] = "Linguo";
        super("Translate", stringArray, true, -6692885, JD.f$b);
        RA rA2 = rA;
        rA2.f$M = new Kh(new Ih());
        String[] stringArray2 = new String[5];
        stringArray2[0] = "Lang";
        stringArray2[1] = "Lanugage";
        stringArray2[2] = "Linguo";
        stringArray2[3] = "Language";
        stringArray2[4] = "L";
        rA2.f$g = new ka<ji>(ji.f$Ya, stringArray2);
        rA.f$E(rA.f$g);
        BG.f$a("trnsl.1.1.20170518T111332Z.58a1bdbd6f594a69.53b43d8829fb0d32cc1b8fa36cef007dac7717c4");
        new Ec(rA, "yandexapikey.txt");
        String[] stringArray3 = new String[4];
        stringArray3[0] = "TranslateKey";
        stringArray3[1] = "TransKey";
        stringArray3[2] = "YandexKey";
        stringArray3[3] = "YandKey";
        kH.f$E().f$E().f$a(new Vc(rA, stringArray3));
        rA.f$E(new CB(rA), new ad(rA), new yc(rA));
    }

    public static ka f$E(RA rA) {
        return rA.f$g;
    }

    public static Kh f$E(RA rA) {
        return rA.f$M;
    }

    public static ji f$E(RA rA, ji ji2) {
        rA.f$d = ji2;
        return rA.f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }
}
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

    /*
     * Enabled aggressive block sorting
     */
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
package net.futureclient.client;

import java.util.Arrays;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.Oa;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.ua;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class ra
extends Ba {
    private s f$K;
    private List<Block> f$e;
    private s f$j;
    private boolean f$M;
    private s f$b;
    private boolean f$g;
    private EnumFacing f$d;
    private Bh f$C;
    private BlockPos f$I;
    private ka<Oa> f$i;

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$r() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static boolean f$a(ra ra2, boolean bl) {
        ra2.f$M = bl;
        return ra2.f$M;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$ga() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$ea() {
        return f$d;
    }

    public static Minecraft f$La() {
        return f$d;
    }

    public static Minecraft f$Ha() {
        return f$d;
    }

    public static Minecraft f$X() {
        return f$d;
    }

    public static BlockPos f$E(ra ra2) {
        return ra2.f$I;
    }

    public static Minecraft f$Ea() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$Ja() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$ja() {
        return f$d;
    }

    public static Minecraft f$O() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static Minecraft f$R() {
        return f$d;
    }

    public static s f$E(ra ra2) {
        ra ra3;
        return ra3.f$j;
    }

    public static boolean f$E(ra ra2) {
        return ra2.f$M;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$ca() {
        return f$d;
    }

    public static Minecraft f$z() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$S() {
        return f$d;
    }

    public static Minecraft f$Ia() {
        return f$d;
    }

    public static Minecraft f$da() {
        return f$d;
    }

    public static Minecraft f$ha() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static ka f$E(ra ra2) {
        return ra2.f$i;
    }

    public static boolean f$a(ra ra2) {
        return ra2.f$g;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static EnumFacing f$E(ra ra2, EnumFacing enumFacing) {
        ra2.f$d = enumFacing;
        return ra2.f$d;
    }

    public static List f$E(ra ra2) {
        return ra2.f$e;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static Minecraft f$ma() {
        return f$d;
    }

    public static Minecraft f$Da() {
        return f$d;
    }

    public static Minecraft f$y() {
        return f$d;
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public static Minecraft f$Ma() {
        return f$d;
    }

    public static Minecraft f$fa() {
        return f$d;
    }

    public static Minecraft f$Ga() {
        return f$d;
    }

    public static Minecraft f$ba() {
        return f$d;
    }

    public static Minecraft f$Fa() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$Aa() {
        return f$d;
    }

    public static Minecraft f$Ka() {
        return f$d;
    }

    public static Minecraft f$Ca() {
        return f$d;
    }

    public static Minecraft f$la() {
        return f$d;
    }

    public static Minecraft f$Ba() {
        return f$d;
    }

    public static Minecraft f$Z() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Bh f$E(ra ra2) {
        return ra2.f$C;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$aa() {
        return f$d;
    }

    public static Minecraft f$ia() {
        return f$d;
    }

    public ra() {
        ra ra2;
        String[] stringArray = new String[2];
        stringArray[0] = "AutoTunnel";
        stringArray[1] = "AutoTunneler";
        super("AutoTunnel", stringArray, true, -15641289, JD.f$M);
        ra ra3 = ra2;
        ra3.f$C = new Bh();
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Width";
        stringArray2[1] = "TunnelWidth";
        stringArray2[2] = "W";
        ra3.f$K = new s((Number)Float.valueOf(1.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(6.0f), 1, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Height";
        stringArray3[1] = "TunnelHeight";
        stringArray3[2] = "H";
        ra2.f$b = new s((Number)Float.valueOf(2.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(6.0f), 1, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Delay";
        stringArray4[1] = "Del";
        stringArray4[2] = "D";
        ra2.f$j = new s((Number)Float.valueOf(0.2f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), 0.01, stringArray4);
        String[] stringArray5 = new String[2];
        stringArray5[0] = "Mode";
        stringArray5[1] = "Method";
        ra2.f$i = new ka<Oa>(Oa.f$M, stringArray5);
        ra2.f$e = Arrays.asList(Blocks.AIR, Blocks.WATER, Blocks.FIRE, Blocks.FLOWING_WATER, Blocks.LAVA, Blocks.FLOWING_LAVA, Blocks.PORTAL, Blocks.END_PORTAL, Blocks.END_PORTAL_FRAME, Blocks.BEDROCK);
        ra2.f$E(ra2.f$i, ra2.f$j);
        ra2.f$E(new ua(ra2));
    }

    public static EnumFacing f$E(ra ra2) {
        return ra2.f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static Minecraft f$V() {
        return f$d;
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$T() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$N() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$q() {
        return f$d;
    }

    public static BlockPos f$E(ra ra2, BlockPos blockPos) {
        ra2.f$I = blockPos;
        return ra2.f$I;
    }

    public static boolean f$E(ra ra2, boolean bl) {
        ra2.f$g = bl;
        return ra2.f$g;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$ka() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$s() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static Minecraft f$U() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.MC;
import net.futureclient.client.Ob;
import net.futureclient.client.Pb;
import net.futureclient.client.Rb;
import net.futureclient.client.ab;
import net.futureclient.client.bc;
import net.futureclient.client.ka;
import net.futureclient.client.nA;
import net.futureclient.client.pb;
import net.futureclient.client.qA;
import net.futureclient.client.s;
import net.futureclient.client.ub;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import net.minecraft.world.World;

public class rA
extends Ba {
    private Entity f$d;
    private final s f$i;
    private static final MovementInput f$j;
    private final ka<pb> f$M;
    private ab f$g;

    public static Minecraft f$d() {
        return f$d;
    }

    static {
        f$j = new MovementInput();
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public ab f$E() {
        rA rA2;
        return rA2.f$g;
    }

    /*
     * WARNING - void declaration
     */
    public static Entity f$E(rA rA2, Entity entity) {
        void 0;
        0.f$d = 0;
        return 0.f$d;
    }

    public static MovementInput f$E() {
        return f$j;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static s f$E(rA rA2) {
        return rA2.f$i;
    }

    @Override
    public void f$K() {
        rA rA2;
        if (rA.f$d.world == null || rA.f$d.player == null) {
            rA2.f$E(false);
            return;
        }
        ab ab2 = new ab((World)rA.f$d.world, null);
        ab2.func_70606_j(rA.f$d.player.func_110143_aJ());
        ab2.func_110149_m(rA.f$d.player.func_110139_bj());
        ab2.func_184819_a(rA.f$d.player.func_184591_cq());
        ab2.func_174826_a(rA.f$d.player.func_174813_aQ());
        ab2.field_70165_t = rA.f$d.player.field_70165_t;
        ab2.field_70163_u = rA.f$d.player.field_70163_u;
        ab2.field_70161_v = rA.f$d.player.field_70161_v;
        ab2.field_70169_q = rA.f$d.player.field_70169_q;
        ab2.field_70167_r = rA.f$d.player.field_70167_r;
        ab2.field_70166_s = rA.f$d.player.field_70166_s;
        ab2.field_70142_S = rA.f$d.player.field_70142_S;
        ab2.field_70137_T = rA.f$d.player.field_70137_T;
        ab2.field_70136_U = rA.f$d.player.field_70136_U;
        ab2.field_70126_B = ab2.field_70177_z = rA.f$d.player.field_70177_z;
        ab ab3 = ab2;
        ab3.field_70127_C = ab3.field_70125_A = rA.f$d.player.field_70125_A;
        ab ab4 = ab2;
        ab4.field_70758_at = ab4.field_70759_as = rA.f$d.player.field_70759_as;
        ab ab5 = ab2;
        ab5.field_71071_by = rA.f$d.player.field_71071_by;
        ab5.field_71069_bz = rA.f$d.player.field_71069_bz;
        ab5.field_71075_bZ = rA.f$d.player.field_71075_bZ;
        ab5.field_70737_aN = rA.f$d.player.field_70737_aN;
        ab5.field_70738_aO = rA.f$d.player.field_70738_aO;
        ab5.field_70739_aP = rA.f$d.player.field_70739_aP;
        MovementInputFromOptions movementInputFromOptions = new MovementInputFromOptions(rA.f$d.gameSettings);
        movementInputFromOptions.updatePlayerMoveState();
        ab5.movementInput = movementInputFromOptions;
        rA2.f$d = f$d.getRenderViewEntity();
        rA2.f$g = ab2;
        f$d.setRenderViewEntity((Entity)rA2.f$g);
        super.f$K();
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public rA() {
        rA rA2;
        String[] stringArray = new String[3];
        stringArray[0] = "Freecam";
        stringArray[1] = "Reecam";
        stringArray[2] = "camera";
        super("Freecam", stringArray, false, -3217280, JD.f$i);
        rA rA3 = rA2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Speed";
        stringArray2[1] = "camspeed";
        rA3.f$i = new s((Number)1.0, (Number)0.0, (Number)2.0, 0.1, stringArray2);
        rA rA4 = rA2;
        String[] stringArray3 = new String[7];
        stringArray3[0] = "Interact";
        stringArray3[1] = "interact";
        stringArray3[2] = "trace";
        stringArray3[3] = "raytrace";
        stringArray3[4] = "rt";
        stringArray3[5] = "t";
        stringArray3[6] = "i";
        rA4.f$M = new ka<pb>(pb.f$M, stringArray3);
        z[] zArray = new z[2];
        zArray[0] = rA2.f$i;
        zArray[1] = rA2.f$M;
        rA2.f$E(zArray);
        Ha[] haArray = new Ha[8];
        haArray[0] = new Rb(rA2);
        haArray[1] = new bc(rA2);
        haArray[2] = new ub(rA2);
        haArray[3] = new nA(rA2);
        haArray[4] = new Ob(rA2);
        haArray[5] = new Pb(rA2);
        haArray[6] = new qA(rA2);
        haArray[7] = new MC(rA2);
        rA2.f$E(haArray);
        rA2.f$E(false);
    }

    @Override
    public void f$B() {
        rA rA2;
        super.f$B();
        if (rA.f$d.player != null) {
            if (rA.f$d.player.movementInput.getClass() == f$j.getClass()) {
                MovementInputFromOptions movementInputFromOptions = new MovementInputFromOptions(rA.f$d.gameSettings);
                movementInputFromOptions.updatePlayerMoveState();
                rA.f$d.player.movementInput = movementInputFromOptions;
            }
            f$d.setRenderViewEntity(rA2.f$d);
        }
        rA2.f$g = null;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static ab f$E(rA rA2) {
        return rA2.f$g;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static ka f$E(rA rA2) {
        return rA2.f$M;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }
}
