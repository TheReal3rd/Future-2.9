package net.futureclient.client.deof.modules.movement.flight;

public class Flight {
}
/*
package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.BA;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.Pg;
import net.futureclient.client.Rd;
import net.futureclient.client.XA;
import net.futureclient.client.cB;
import net.futureclient.client.cd;
import net.futureclient.client.hd;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class KC
extends Ba {
    private z<Boolean> f$L;
    private ka<BA> f$K;
    private int f$g;
    private s f$C;
    private boolean f$M;
    private z<Boolean> f$A;
    private s f$I;
    private s f$a;
    private Bh f$b;
    private z<Boolean> f$c;
    private final Random f$d;
    private double f$i;
    private z<Boolean> f$D;
    private s f$B;
    private s f$e;
    private z<Boolean> f$l;
    private int f$j;

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Bh f$E(KC kC) {
        return kC.f$b;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$X() {
        return f$d;
    }

    public static z f$a(KC kC) {
        return kC.f$D;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static int f$E(KC kC, int n) {
        kC.f$g = n;
        return kC.f$g;
    }

    public static Minecraft f$q() {
        return f$d;
    }

    @Override
    public void f$K() {
        KC kC;
        super.f$K();
        if (((Minecraft)KC.f$d).player != null) {
            KC kC2 = kC;
            kC2.f$i = KC.f$d.player.field_70163_u - 1.0;
            kC2.f$M = false;
        }
        if (kC.f$l.f$E().booleanValue()) {
            Pg.f$e();
        }
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static int f$a(KC kC, int n) {
        kC.f$j = n;
        return kC.f$j;
    }

    public static s f$E(KC kC) {
        return kC.f$I;
    }

    public static Minecraft f$N() {
        return f$d;
    }

    public static Minecraft f$s() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    @Override
    public void f$B() {
        KC kC;
        KC kC2 = kC;
        super.f$B();
        if (kC2.f$K.f$E() == BA.f$M && ((Minecraft)KC.f$d).player != null) {
            kC.f$j = 0;
            KC.f$d.player.field_70747_aH = 0.02f;
        }
    }

    public static Minecraft f$r() {
        return f$d;
    }

    public static Minecraft f$y() {
        return f$d;
    }

    public KC() {
        KC kC;
        String[] stringArray = new String[2];
        stringArray[0] = "Flight";
        stringArray[1] = "Fly";
        super("Flight", stringArray, true, -4545358, JD.f$j);
        KC kC2 = kC;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Animation";
        stringArray2[1] = "ani";
        kC2.f$D = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Damage";
        stringArray3[1] = "d";
        stringArray3[2] = "dmg";
        kC.f$l = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[2];
        stringArray4[0] = "Glide";
        stringArray4[1] = "g";
        kC.f$L = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[5];
        stringArray5[0] = "Anti Fall Damage";
        stringArray5[1] = "Anti-Fall-Damage";
        stringArray5[2] = "AntiFallDamage";
        stringArray5[3] = "NoFallDamage";
        stringArray5[4] = "NoFall";
        kC.f$c = new z<Boolean>(false, stringArray5);
        String[] stringArray6 = new String[4];
        stringArray6[0] = "Anti Kick";
        stringArray6[1] = "Anti-Kick";
        stringArray6[2] = "ak";
        stringArray6[3] = "antikick";
        kC.f$A = new z<Boolean>(false, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "GlideSpeed";
        stringArray7[1] = "Glide-Speed";
        stringArray7[2] = "gs";
        stringArray7[3] = "glidespeed";
        kC.f$B = new s((Number)0.03126, (Number)-2.0, (Number)2.0, 0.05, stringArray7);
        String[] stringArray8 = new String[3];
        stringArray8[0] = "Speed";
        stringArray8[1] = "spd";
        stringArray8[2] = "s";
        kC.f$a = new s((Number)2.5, (Number)0.1, (Number)10.0, stringArray8);
        String[] stringArray9 = new String[3];
        stringArray9[0] = "AACY";
        stringArray9[1] = "y";
        stringArray9[2] = "aac";
        kC.f$C = new s((Number)0.83, (Number)0.0, (Number)10.0, 0.01, stringArray9);
        String[] stringArray10 = new String[5];
        stringArray10[0] = "GommeDown";
        stringArray10[1] = "Down";
        stringArray10[2] = "DownAmount";
        stringArray10[3] = "GoDown";
        stringArray10[4] = "downvalue";
        kC.f$e = new s((Number)1.0, (Number)0.0, (Number)2.0, 0.1, stringArray10);
        String[] stringArray11 = new String[3];
        stringArray11[0] = "GommeSpeed";
        stringArray11[1] = "GomSped";
        stringArray11[2] = "GommeSped";
        kC.f$I = new s((Number)0.4, (Number)0.0, (Number)1.0, 0.1, stringArray11);
        String[] stringArray12 = new String[3];
        stringArray12[0] = "Mode";
        stringArray12[1] = "Type";
        stringArray12[2] = "fly";
        kC.f$K = new ka<BA>(BA.f$K, stringArray12);
        kC.f$b = new Bh();
        kC.f$d = new Random();
        kC.f$E(kC.f$l, kC.f$K, kC.f$B, kC.f$D, kC.f$L, kC.f$a, kC.f$C, kC.f$I, kC.f$e, kC.f$c, kC.f$A);
        kC.f$E(new hd(kC), new cd(kC), new Rd(kC), new XA(kC), new cB(kC));
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static boolean f$E(KC kC, boolean bl) {
        kC.f$M = bl;
        return kC.f$M;
    }

    public static double f$E(KC kC, double d) {
        kC.f$i = d;
        return kC.f$i;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static double f$E(KC kC) {
        return kC.f$i;
    }

    public static ka f$E(KC kC) {
        return kC.f$K;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$V() {
        return f$d;
    }

    public static int f$E(KC kC) {
        return kC.f$g;
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static boolean f$E(KC kC) {
        return kC.f$M;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public static s f$B(KC kC) {
        return kC.f$C;
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Random f$E(KC kC) {
        return kC.f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static s f$e(KC kC) {
        return kC.f$e;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$S() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static z f$B(KC kC) {
        KC kC2;
        return kC2.f$L;
    }

    public static int f$a(KC kC) {
        return kC.f$j;
    }

    public static z f$e(KC kC) {
        return kC.f$A;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static s f$K(KC kC) {
        return kC.f$B;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static s f$a(KC kC) {
        return kC.f$a;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    public static z f$E(KC kC) {
        return kC.f$c;
    }

    public static Minecraft f$t() {
        return f$d;
    }
}
 */