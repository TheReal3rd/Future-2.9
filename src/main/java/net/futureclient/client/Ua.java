package net.futureclient.client;

import net.futureclient.client.kF;
import net.futureclient.client.pa;

public class Ua {
    public static final int[] f$g;
    public static final int[] f$d;

    static {
        f$d = new int[pa.values().length];
        try {
            Ua.f$d[pa.f$j.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ua.f$d[pa.f$i.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ua.f$d[pa.f$M.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ua.f$d[pa.f$g.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[kF.values().length];
        try {
            Ua.f$g[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ua.f$g[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import java.util.List;
import net.futureclient.client.AA;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.CG;
import net.futureclient.client.Cc;
import net.futureclient.client.FC;
import net.futureclient.client.JD;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.ZA;
import net.futureclient.client.dd;
import net.futureclient.client.ic;
import net.futureclient.client.kC;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.lc;
import net.futureclient.client.q;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.futureclient.client.zc;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public class uA
extends Ba {
    private int f$B;
    private int f$c;
    private int f$C;
    private double f$l;
    private boolean f$I;
    private double f$L;
    private s f$b;
    private z<Boolean> f$j;
    private boolean f$M;
    private int f$e;
    private int f$A;
    private z<Boolean> f$i;
    private int f$a;
    private Bh f$d;
    private boolean f$g;
    public ka<dd> f$K;

    public static Minecraft f$ra() {
        return f$d;
    }

    public static boolean f$E(uA uA2, boolean bl) {
        uA2.f$g = bl;
        return uA2.f$g;
    }

    public static Minecraft f$vC() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static int f$K(uA uA2, int n) {
        uA2.f$a = n;
        return uA2.f$a;
    }

    public static Minecraft f$Ba() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$r() {
        return f$d;
    }

    public static Minecraft f$Oa() {
        return f$d;
    }

    public static double f$a(uA uA2) {
        return uA2.f$l;
    }

    public static Minecraft f$ea() {
        return f$d;
    }

    public static Minecraft f$FA() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static boolean f$e(uA uA2) {
        return uA2.f$e();
    }

    public static Minecraft f$sa() {
        return f$d;
    }

    public static Minecraft f$O() {
        return f$d;
    }

    public static Minecraft f$z() {
        return f$d;
    }

    public static Minecraft f$Jd() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    private boolean f$K() {
        return !uA.f$d.player.field_70123_F && ((Minecraft)uA.f$d).player.func_71024_bL().getFoodLevel() > 6 && uA.f$d.player.field_191988_bg > 0.0f;
    }

    public static Minecraft f$Id() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$Dc() {
        return f$d;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static boolean f$B(uA uA2) {
        return uA2.f$g;
    }

    public static int f$K(uA uA2) {
        uA uA3;
        return uA3.f$A;
    }

    public static int f$E(uA uA2, int n) {
        uA2.f$c = n;
        return uA2.f$c;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$Ed() {
        return f$d;
    }

    public static Minecraft f$wa() {
        return f$d;
    }

    public static Minecraft f$S() {
        return f$d;
    }

    public static boolean f$E(uA uA2) {
        return uA2.f$M;
    }

    public static Minecraft f$Ka() {
        return f$d;
    }

    public static Minecraft f$Ha() {
        return f$d;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$Pa() {
        return f$d;
    }

    public static Minecraft f$la() {
        return f$d;
    }

    public static Minecraft f$aa() {
        return f$d;
    }

    private boolean f$e() {
        return !uA.f$d.player.movementInput.forwardKeyDown && !uA.f$d.player.movementInput.backKeyDown && !uA.f$d.player.movementInput.rightKeyDown && !uA.f$d.player.movementInput.leftKeyDown;
    }

    public static Minecraft f$cb() {
        return f$d;
    }

    public static Minecraft f$XC() {
        return f$d;
    }

    public static Minecraft f$Ya() {
        return f$d;
    }

    public static Minecraft f$X() {
        return f$d;
    }

    public static boolean f$a(uA uA2) {
        return uA2.f$B();
    }

    public static Minecraft f$Ia() {
        return f$d;
    }

    public static boolean f$a(uA uA2, boolean bl) {
        uA2.f$I = bl;
        return uA2.f$I;
    }

    public static double f$E(uA uA2, double d) {
        uA2.f$L = d;
        return uA2.f$L;
    }

    public static Minecraft f$Va() {
        return f$d;
    }

    public static Minecraft f$Ra() {
        return f$d;
    }

    public static Minecraft f$ca() {
        return f$d;
    }

    public static boolean f$K(uA uA2) {
        return uA2.f$I;
    }

    public static Minecraft f$Ma() {
        return f$d;
    }

    public static Minecraft f$na() {
        return f$d;
    }

    public static int f$M(uA uA2) {
        return uA2.f$e;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static Minecraft f$fa() {
        return f$d;
    }

    public static z f$E(uA uA2) {
        return uA2.f$i;
    }

    public static Minecraft f$Ea() {
        return f$d;
    }

    public static Minecraft f$ja() {
        return f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static z f$a(uA uA2) {
        return uA2.f$j;
    }

    @Override
    public void f$B() {
        uA uA2;
        ic ic2 = (ic)kH.f$E().f$E().f$E(ic.class);
        if (ic2 != null && !ic2.f$E()) {
            ((q)((Y)((Object)f$d)).getTimer()).f$E(1.0f);
        }
        super.f$B();
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$s() {
        return f$d;
    }

    public static Minecraft f$ec() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$Hc() {
        return f$d;
    }

    @Override
    public void f$K() {
        uA uA2;
        super.f$K();
        if (((Minecraft)uA.f$d).player != null) {
            uA2.f$l = Pg.f$a();
        }
        uA uA3 = uA2;
        uA uA4 = uA2;
        uA uA5 = uA2;
        uA5.f$c = 2;
        uA5.f$L = 0.0;
        uA4.f$A = 4;
        uA4.f$B = 1;
        uA3.f$C = 1;
        uA3.f$a = 2;
        uA2.f$e = 4;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$ia() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$KC() {
        return f$d;
    }

    public static Minecraft f$hb() {
        return f$d;
    }

    public static Minecraft f$Z() {
        return f$d;
    }

    public static Minecraft f$ba() {
        return f$d;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$UC() {
        return f$d;
    }

    public static int f$B(uA uA2) {
        return ++uA2.f$A;
    }

    public static Minecraft f$Wa() {
        return f$d;
    }

    public static Minecraft f$R() {
        return f$d;
    }

    public static Minecraft f$Qd() {
        return f$d;
    }

    public static int f$h(uA uA2) {
        return uA2.f$B;
    }

    public static int f$a(uA uA2, int n) {
        uA2.f$C = n;
        return uA2.f$C;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static int f$a(uA uA2) {
        return ++uA2.f$C;
    }

    public static Minecraft f$Ca() {
        return f$d;
    }

    public static Minecraft f$Jb() {
        return f$d;
    }

    public static Minecraft f$qA() {
        return f$d;
    }

    public static int f$e(uA uA2) {
        return uA2.f$C;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$hc() {
        return f$d;
    }

    public static Minecraft f$Xb() {
        return f$d;
    }

    public static Minecraft f$yA() {
        return f$d;
    }

    public static Minecraft f$Nc() {
        return f$d;
    }

    public static Minecraft f$ka() {
        return f$d;
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$pd() {
        return f$d;
    }

    public static Minecraft f$Da() {
        return f$d;
    }

    public static Minecraft f$Na() {
        return f$d;
    }

    public static Minecraft f$za() {
        return f$d;
    }

    public static Minecraft f$aC() {
        return f$d;
    }

    public static Minecraft f$qd() {
        return f$d;
    }

    public static Minecraft f$Xa() {
        return f$d;
    }

    public static int f$e(uA uA2, int n) {
        uA2.f$A = n;
        return uA2.f$A;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$ya() {
        return f$d;
    }

    public static double f$a(uA uA2, double d) {
        uA2.f$l = d;
        return uA2.f$l;
    }

    public static Minecraft f$T() {
        return f$d;
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static Minecraft f$qb() {
        return f$d;
    }

    public static Minecraft f$Sd() {
        return f$d;
    }

    public static Minecraft f$xa() {
        return f$d;
    }

    public static s f$E(uA uA2) {
        return uA2.f$b;
    }

    public static double f$E(uA uA2) {
        return uA2.f$L;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$qa() {
        return f$d;
    }

    public static Minecraft f$y() {
        return f$d;
    }

    private boolean f$B() {
        lc lc2 = (lc)kH.f$E().f$E().f$E(lc.class);
        boolean bl = false;
        List list = ((Minecraft)uA.f$d).world.func_184144_a((Entity)((Minecraft)uA.f$d).player, ((Minecraft)uA.f$d).player.func_174813_aQ().grow(0.1, 0.0, 0.1));
        if (lc2 != null && lc2.f$E() && !list.isEmpty()) {
            bl = true;
        }
        return uA.f$d.player.field_70122_E && !bl && !CG.f$E() && !CG.f$E(true);
    }

    public static int f$C(uA uA2) {
        return ++uA2.f$e;
    }

    public static Minecraft f$V() {
        return f$d;
    }

    public static Minecraft f$Ua() {
        return f$d;
    }

    public static Minecraft f$ta() {
        return f$d;
    }

    public static Minecraft f$Ja() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$Sb() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$Qa() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static boolean f$e(uA uA2, boolean bl) {
        uA2.f$M = bl;
        return uA2.f$M;
    }

    public static Minecraft f$jc() {
        return f$d;
    }

    public static Minecraft f$q() {
        return f$d;
    }

    public static int f$E(uA uA2) {
        return uA2.f$c;
    }

    public static Minecraft f$jB() {
        return f$d;
    }

    public static Minecraft f$pa() {
        return f$d;
    }

    public static Minecraft f$oa() {
        return f$d;
    }

    public static int f$B(uA uA2, int n) {
        uA2.f$B = n;
        return uA2.f$B;
    }

    public static Minecraft f$va() {
        return f$d;
    }

    public static Minecraft f$Fa() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public uA() {
        uA uA2;
        String[] stringArray = new String[3];
        stringArray[0] = "Speed";
        stringArray[1] = "Sped";
        stringArray[2] = "fastrun";
        super("Speed", stringArray, true, -13131324, JD.f$j);
        uA2.f$I = false;
        uA uA3 = uA2;
        String[] stringArray2 = new String[6];
        stringArray2[0] = "Mode";
        stringArray2[1] = "m";
        stringArray2[2] = "NCP";
        stringArray2[3] = "AAC";
        stringArray2[4] = "NCPSpeed";
        stringArray2[5] = "NCPMode";
        uA3.f$K = new ka<dd>(dd.f$i, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Speed";
        stringArray3[1] = "spd";
        stringArray3[2] = "s";
        uA2.f$b = new s((Number)4.0, (Number)0.1, (Number)10.0, stringArray3);
        String[] stringArray4 = new String[5];
        stringArray4[0] = "SpeedInWater";
        stringArray4[1] = "Water";
        stringArray4[2] = "waterspeed";
        stringArray4[3] = "watermove";
        stringArray4[4] = "stopinwater";
        uA2.f$j = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[4];
        stringArray5[0] = "UseTimer";
        stringArray5[1] = "Timer";
        stringArray5[2] = "TimerSpeed";
        stringArray5[3] = "UseTim";
        uA2.f$i = new z<Boolean>(true, stringArray5);
        uA2.f$d = new Bh();
        uA2.f$E(uA2.f$K, uA2.f$b, uA2.f$j, uA2.f$i);
        uA2.f$E(new Cc(uA2), new kC(uA2), new ZA(uA2), new zc(uA2), new AA(uA2), new FC(uA2));
    }

    public static Minecraft f$ua() {
        return f$d;
    }

    public static Minecraft f$oC() {
        return f$d;
    }

    public static Minecraft f$OB() {
        return f$d;
    }

    public static Minecraft f$N() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$LC() {
        return f$d;
    }

    public static int f$A(uA uA2, int n) {
        uA2.f$e = n;
        return uA2.f$e;
    }

    public static Minecraft f$gc() {
        return f$d;
    }

    public static int f$H(uA uA2) {
        return uA2.f$a;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$ga() {
        return f$d;
    }

    public static Minecraft f$ha() {
        return f$d;
    }

    public static Minecraft f$PC() {
        return f$d;
    }

    public static Minecraft f$pB() {
        return f$d;
    }

    public static Minecraft f$ma() {
        return f$d;
    }

    public static Minecraft f$Aa() {
        return f$d;
    }

    public static Bh f$E(uA uA2) {
        return uA2.f$d;
    }

    public static Minecraft f$Za() {
        return f$d;
    }

    public static Minecraft f$Sa() {
        return f$d;
    }

    public static Minecraft f$La() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static int f$A(uA uA2) {
        return ++uA2.f$B;
    }

    public static Minecraft f$da() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$gb() {
        return f$d;
    }

    public static Minecraft f$Ga() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$Ta() {
        return f$d;
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public static Minecraft f$bc() {
        return f$d;
    }

    public static Minecraft f$hA() {
        return f$d;
    }

    public static Minecraft f$eB() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ca;
import net.futureclient.client.Ha;
import net.futureclient.client.M;
import net.futureclient.client.Oa;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.TH;
import net.futureclient.client.Wa;
import net.futureclient.client.kH;
import net.futureclient.client.qF;
import net.futureclient.client.ra;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ua
extends Ha<Pf> {
    public final ra f$d;

    public ua(ra ra2) {
        0.f$d = ra2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(Pf 0) {
        var2_2 = (qF)kH.f$E().f$E().f$E(qF.class);
        if (var2_2.f$E() && var2_2.f$B()) {
            return;
        }
        if (((Ca)kH.f$E().f$E().f$E(Ca.class)).f$L != null) {
            return;
        }
        if (ra.f$ca().playerController == null) {
            return;
        }
        block0 : switch (Wa.f$d[0.f$E().ordinal()]) {
            case 1: {
                while (false) {
                }
                switch (Wa.f$g[((Oa)ra.f$E(0.f$d).f$E()).ordinal()]) {
                    case 1: {
                        v0 = 0;
                        while (false) {
                        }
                        ra.f$a(v0.f$d, false);
                        ra.f$E(0.f$d, ra.f$ka().player.func_174811_aO());
                        ra.f$E(v0.f$d, ra.f$E(0.f$d).equals((Object)EnumFacing.EAST) != false || ra.f$E(0.f$d).equals((Object)EnumFacing.WEST) != false);
                        var2_3 = 5;
                        var4_5 = 5;
                        v1 = var2_3;
                        while (v1 >= -var4_5) {
                            v2 = -var4_5;
                            while (v2 < var4_5) {
                                v3 = -var4_5;
                                while (v3 < var4_5) {
                                    ra.f$E(0.f$d, new BlockPos((int)Math.floor(ra.f$ia().player.field_70165_t) + (ra.f$a(0.f$d) != false ? var5_9 : 0), (int)Math.floor(ra.f$ea().player.field_70163_u) + var2_3, (int)Math.floor(ra.f$Ia().player.field_70161_v) + (ra.f$a(0.f$d) == false ? var6_10 : 0)));
                                    if (ra.f$da().player.func_70092_e(ra.f$Ja().player.field_70165_t + (double)var5_9, ra.f$Ma().player.field_70163_u + (double)var2_3, ra.f$ha().player.field_70161_v + (double)var6_10) <= 16.0) {
                                        var7_12 = ra.f$Ca().world.func_180495_p(ra.f$E(0.f$d)).getBlock();
                                        var3_7 = ra.f$E(0.f$d).f$a(ra.f$E(0.f$d).f$E().floatValue() * 1000.0f) != false && !((double)ra.f$E(0.f$d).func_177956_o() < ra.f$Da().player.field_70163_u) && !((double)ra.f$E(0.f$d).func_177956_o() > ra.f$Ka().player.field_70163_u + 1.0);
                                        var3_7 = var3_7 != false && CG.f$e(ra.f$E(0.f$d)) != false && ra.f$E(0.f$d).contains(var7_12) == false;
                                        v4 = var3_7 = var3_7 != false && (ra.f$ja().world.func_180495_p(ra.f$E(0.f$d)).func_185887_b((World)ra.f$Aa().world, ra.f$E(0.f$d)) != -1.0f || ra.f$fa().playerController.isInCreativeMode() != false);
                                        if (var3_7) {
                                            ra.f$a(0.f$d, true);
                                            var8_13 = TH.f$E(ra.f$E(0.f$d), CG.f$E(ra.f$E(0.f$d)));
                                            v5 = 0;
                                            v5.f$a(var8_13[0]);
                                            v5.f$E(var8_13[1]);
                                            return;
                                        }
                                    }
                                    v3 = ++var6_10;
                                }
                                v2 = ++var5_9;
                            }
                            v1 = --var2_3;
                        }
                        break block0;
                    }
                    case 2: {
                        if (!ra.f$E(0.f$d).f$a(ra.f$E(0.f$d).f$E().floatValue() * 1000.0f)) break block0;
                        var4_6 = Math.cos(Math.toRadians(ra.f$Ba().player.field_70177_z + 90.0f));
                        var6_11 = Math.sin(Math.toRadians(ra.f$ma().player.field_70177_z + 90.0f));
                        var3_8 = new BlockPos(ra.f$Fa().player.field_70165_t + (1.0 * var4_6 + 0.0 * var6_11), ra.f$aa().player.field_70163_u + 1.0, ra.f$Ha().player.field_70161_v + (1.0 * var6_11 - 0.0 * var4_6));
                        var8_14 = ra.f$Ga().world.func_180495_p(var3_8).getBlock();
                        if (ra.f$la().player.field_71071_by.getCurrentItem().getMaxDamage() - ra.f$ba().player.field_71071_by.getCurrentItem().getItemDamage() >= 5) ** GOTO lbl70
                        var9_15 = Pg.f$E(ra.f$Ea().world.func_180495_p(var3_8));
                        if (var9_15 == -1) {
                            return;
                        }
                        if (var9_15 < 9) {
                            ra.f$La().player.field_71071_by.currentItem = var9_15;
                            ((M)ra.f$ga().playerController).invokeSyncCurrentPlayItem();
                            v6 = 0;
                        } else {
                            ra.f$Z().playerController.windowClick(0, var9_15, ra.f$R().player.field_71071_by.currentItem, ClickType.SWAP, (EntityPlayer)ra.f$O().player);
lbl70:
                            // 2 sources

                            v6 = 0;
                        }
                        if (!ra.f$E(v6.f$d).contains(var8_14)) {
                            ra.f$T().player.swingArm(EnumHand.MAIN_HAND);
                            ra.f$z().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$r().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$E(0.f$d).f$a();
                        }
                        var9_16 = new BlockPos(ra.f$y().player.field_70165_t + (1.0 * var4_6 + 0.0 * var6_11), ra.f$s().player.field_70163_u, ra.f$S().player.field_70161_v + (1.0 * var6_11 - 0.0 * var4_6));
                        var3_8 = ra.f$N().world.func_180495_p(var9_16).getBlock();
                        if (!ra.f$E(0.f$d).contains(var3_8)) {
                            ra.f$X().player.swingArm(EnumHand.MAIN_HAND);
                            ra.f$u().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var9_16, EnumFacing.DOWN));
                            ra.f$V().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var9_16, EnumFacing.DOWN));
                            ra.f$E(0.f$d).f$a();
                        }
                        var3_8 = new BlockPos(ra.f$q().player.field_70165_t + (2.0 * var4_6 + 0.0 * var6_11), ra.f$x().player.field_70163_u + 1.0, ra.f$p().player.field_70161_v + (2.0 * var6_11 - 0.0 * var4_6));
                        var8_14 = ra.f$n().world.func_180495_p(var3_8).getBlock();
                        if (!ra.f$E(0.f$d).contains(var8_14)) {
                            ra.f$o().player.swingArm(EnumHand.MAIN_HAND);
                            ra.f$w().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$v().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$E(0.f$d).f$a();
                        }
                        var3_8 = new BlockPos(ra.f$W().player.field_70165_t + (2.0 * var4_6 + 0.0 * var6_11), ra.f$Y().player.field_70163_u, ra.f$t().player.field_70161_v + (2.0 * var6_11 - 0.0 * var4_6));
                        var8_14 = ra.f$P().world.func_180495_p(var3_8).getBlock();
                        if (!ra.f$E(0.f$d).contains(var8_14)) {
                            ra.f$Q().player.swingArm(EnumHand.MAIN_HAND);
                            ra.f$U().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$J().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$E(0.f$d).f$a();
                        }
                        var3_8 = new BlockPos(ra.f$d().player.field_70165_t + (3.0 * var4_6 + 0.0 * var6_11), ra.f$l().player.field_70163_u + 1.0, ra.f$k().player.field_70161_v + (3.0 * var6_11 - 0.0 * var4_6));
                        var8_14 = ra.f$b().world.func_180495_p(var3_8).getBlock();
                        if (!ra.f$E(0.f$d).contains(var8_14)) {
                            ra.f$F().player.swingArm(EnumHand.MAIN_HAND);
                            ra.f$G().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$D().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                            ra.f$E(0.f$d).f$a();
                        }
                        var3_8 = new BlockPos(ra.f$g().player.field_70165_t + (3.0 * var4_6 + 0.0 * var6_11), ra.f$m().player.field_70163_u, ra.f$f().player.field_70161_v + (3.0 * var6_11 - 0.0 * var4_6));
                        var8_14 = ra.f$L().world.func_180495_p(var3_8).getBlock();
                        if (ra.f$E(0.f$d).contains(var8_14)) break block0;
                        ra.f$i().player.swingArm(EnumHand.MAIN_HAND);
                        ra.f$c().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                        ra.f$I().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, var3_8, EnumFacing.DOWN));
                        ra.f$E(0.f$d).f$a();
                    }
                }
                return;
            }
            case 2: {
                if (ra.f$E(0.f$d).f$E() != Oa.f$M || !ra.f$E(0.f$d)) break;
                if (ra.f$j().player.field_71071_by.getCurrentItem().getMaxDamage() - ra.f$M().player.field_71071_by.getCurrentItem().getItemDamage() < 5) {
                    var2_4 = Pg.f$E(ra.f$C().world.func_180495_p(ra.f$E(0.f$d)));
                    if (var2_4 == -1) {
                        return;
                    }
                    if (var2_4 < 9) {
                        ra.f$H().player.field_71071_by.currentItem = var2_4;
                        ((M)ra.f$h().playerController).invokeSyncCurrentPlayItem();
                    } else {
                        ra.f$B().playerController.windowClick(0, var2_4, ra.f$A().player.field_71071_by.currentItem, ClickType.SWAP, (EntityPlayer)ra.f$K().player);
                    }
                }
                ra.f$e().player.swingArm(EnumHand.MAIN_HAND);
                ra.f$a().playerController.onPlayerDamageBlock(ra.f$E(0.f$d), CG.f$E(ra.f$E(0.f$d)));
                if (!((double)((M)ra.f$E().playerController).getCurBlockDamageMP() >= 1.0)) break;
                ra.f$E(0.f$d).f$a();
            }
        }
    }
}
