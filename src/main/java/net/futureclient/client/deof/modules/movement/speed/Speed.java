package net.futureclient.client.deof.modules.movement.speed;

public class Speed {
}
/*
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
 */