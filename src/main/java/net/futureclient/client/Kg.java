package net.futureclient.client;

import net.futureclient.client.RF;

public class Kg
extends RF {
    private float f$a;
    private float f$B;
    private float f$C;
    private float f$d;
    private float f$e;
    private float f$K;
    private float f$g;
    private float f$j;
    private float f$b;
    private float f$I;
    private float f$i;
    private float f$M;

    public void f$K(float f) {
        0.f$a = f;
    }

    public void f$B(float f) {
        0.f$C = f;
    }

    public float f$B() {
        Kg kg;
        return kg.f$i;
    }

    public void f$a(float f) {
        0.f$I = f;
    }

    public void f$A(float f) {
        0.f$B = f;
    }

    public float f$a() {
        Kg kg;
        return kg.f$g;
    }

    public float f$e() {
        Kg kg;
        return kg.f$M;
    }

    public float f$H() {
        Kg kg;
        return kg.f$I;
    }

    public float f$M() {
        Kg kg;
        return kg.f$C;
    }

    public float f$K() {
        Kg kg;
        return kg.f$j;
    }

    public void f$e(float f) {
        0.f$e = f;
    }

    public float f$E() {
        Kg kg;
        return kg.f$d;
    }

    public float f$h() {
        Kg kg;
        return kg.f$K;
    }

    public void f$E(float f) {
        0.f$K = f;
    }

    public float f$C() {
        Kg kg;
        return kg.f$e;
    }

    public float f$A() {
        Kg kg;
        return kg.f$b;
    }

    public float f$I() {
        Kg kg;
        return kg.f$B;
    }

    public float f$j() {
        Kg kg;
        return kg.f$a;
    }

    public Kg(float f, float f2, float f3, float f4, float f5, float f6) {
        0.f$B = 0.f$b = f;
        Kg kg = 0;
        kg.f$a = kg.f$j = f2;
        Kg kg2 = 0;
        kg2.f$C = kg2.f$i = f3;
        Kg kg3 = 0;
        kg3.f$e = kg3.f$M = f4;
        Kg kg4 = 0;
        kg4.f$I = kg4.f$g = f5;
        Kg kg5 = 0;
        kg5.f$K = kg5.f$d = f6;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ah;
import net.futureclient.client.Fg;
import net.futureclient.client.Ha;
import net.futureclient.client.KD;

public class KG
extends Ha<KD> {
    public final Ah f$d;

    @Override
    public void f$E(KD kD) {
        if (kD.f$E() == Fg.f$g) {
            Ah.f$E(0.f$d, kD.f$e(), kD.f$B());
        }
    }

    public KG(Ah ah) {
        0.f$d = ah;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.MD;
import net.futureclient.client.OE;
import net.futureclient.client.Ve;
import net.futureclient.client.s;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

public class kg
extends Ba {
    private BlockPos f$M;
    private s f$i;
    private boolean f$g;
    private int f$d;

    public static Minecraft f$Y() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static boolean f$E(kg kg2, boolean bl) {
        kg2.f$g = bl;
        return kg2.f$g;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static BlockPos f$E(kg kg2, BlockPos blockPos) {
        kg2.f$M = blockPos;
        return kg2.f$M;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public kg() {
        kg kg2;
        String[] stringArray = new String[4];
        stringArray[0] = "ClickTP";
        stringArray[1] = "ClickTeleport";
        stringArray[2] = "Teleport";
        stringArray[3] = "ClickBlink";
        super("ClickTP", stringArray, true, 10485571, JD.f$K);
        kg kg3 = kg2;
        String[] stringArray2 = new String[5];
        stringArray2[0] = "Range";
        stringArray2[1] = "Distance";
        stringArray2[2] = "Length";
        stringArray2[3] = "Far";
        stringArray2[4] = "R";
        kg3.f$i = new s((Number)Float.valueOf(100.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(200.0f), 1, stringArray2);
        kg2.f$E(kg2.f$i);
        kg2.f$E(new MD(kg2), new Ve(kg2), new OE(kg2));
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static boolean f$E(kg kg2) {
        return kg2.f$g;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static int f$a(kg kg2) {
        return kg2.f$d;
    }

    public static int f$E(kg kg2, int n) {
        kg2.f$d = n;
        return kg2.f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static int f$E(kg kg2) {
        return --kg2.f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static s f$E(kg kg2) {
        return kg2.f$i;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static BlockPos f$E(kg kg2) {
        return kg2.f$M;
    }
}
