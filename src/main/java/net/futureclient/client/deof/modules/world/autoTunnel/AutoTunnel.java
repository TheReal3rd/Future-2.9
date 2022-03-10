package net.futureclient.client.deof.modules.world.autoTunnel;

public class AutoTunnel {
}
/*
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
 */