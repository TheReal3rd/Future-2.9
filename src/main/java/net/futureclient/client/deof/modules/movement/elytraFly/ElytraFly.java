package net.futureclient.client.deof.modules.movement.elytraFly;

public class ElytraFly {
}
/*
package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.db;
import net.futureclient.client.ed;
import net.futureclient.client.ka;
import net.futureclient.client.mc;
import net.futureclient.client.oc;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;

public class BB
extends Ba {
    public z<Boolean> f$A;
    private static final double f$M = 2.0E-4;
    public z<Boolean> f$l;
    private final Random f$d;
    public z<Boolean> f$B;
    private Bh f$H;
    private double f$j;
    public z<Boolean> f$e;
    public z<Boolean> f$L;
    public z<Boolean> f$a;
    private s f$K;
    public ka<mc> f$D;
    private static final int f$g = 16;
    public z<Boolean> f$c;
    private int f$i;
    private boolean f$b;
    private s f$I;
    public z<Boolean> f$C;
    private Bh f$m;

    public static Minecraft f$Ea() {
        return f$d;
    }

    public static boolean f$E(BB bB, boolean bl) {
        bB.f$b = bl;
        return bB.f$b;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$Z() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$S() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$R() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$V() {
        return f$d;
    }

    public static Minecraft f$q() {
        return f$d;
    }

    @Override
    public void f$K() {
        BB bB;
        if (((Minecraft)BB.f$d).player != null && ((mc)((Object)bB.f$D.f$E())).equals((Object)mc.f$M) && ((Minecraft)BB.f$d).player.func_184582_a(EntityEquipmentSlot.CHEST).getItem() == Items.ELYTRA) {
            BB.f$d.player.field_70179_y = 0.0;
            BB.f$d.player.field_70181_x = 0.0;
            BB.f$d.player.field_70159_w = 0.0;
        }
        BB bB2 = bB;
        super.f$K();
        bB2.f$m.f$a();
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static int f$E(BB bB, int n) {
        bB.f$i = n;
        return bB.f$i;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static int f$E(BB bB) {
        return bB.f$i;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public BB() {
        BB bB;
        String[] stringArray = new String[5];
        stringArray[0] = "ElytraFly";
        stringArray[1] = "Elytra";
        stringArray[2] = "Elytracontrol";
        stringArray[3] = "Elytra+";
        stringArray[4] = "Elytraplus";
        super("ElytraFly", stringArray, true, -13131319, JD.f$j);
        BB bB2 = bB;
        BB bB3 = bB;
        bB2.f$H = new Bh();
        bB3.f$m = new Bh();
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Mode";
        stringArray2[1] = "Type";
        stringArray2[2] = "Method";
        stringArray2[3] = "FlyMethod";
        bB2.f$D = new ka<mc>(mc.f$j, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "StopInWater";
        stringArray3[1] = "siw";
        stringArray3[2] = "Stop";
        stringArray3[3] = "waterstop";
        bB.f$l = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "InstantFly";
        stringArray4[1] = "Instafly";
        stringArray4[2] = "if";
        bB.f$L = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[6];
        stringArray5[0] = "StopOnGround";
        stringArray5[1] = "StopONG";
        stringArray5[2] = "stopground";
        stringArray5[3] = "OnGround";
        stringArray5[4] = "OnGroundStop";
        stringArray5[5] = "sog";
        bB.f$c = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[5];
        stringArray6[0] = "AutoAccelerate";
        stringArray6[1] = "AutoSpeed";
        stringArray6[2] = "SpeedUp";
        stringArray6[3] = "AutoSpeedUp";
        stringArray6[4] = "Accelerate";
        bB.f$A = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "AntiKick";
        stringArray7[1] = "NoKick";
        stringArray7[2] = "CircleStrafer";
        stringArray7[3] = "Strafer";
        bB.f$B = new z<Boolean>(true, stringArray7);
        String[] stringArray8 = new String[3];
        stringArray8[0] = "Vertical";
        stringArray8[1] = "y";
        stringArray8[2] = "v";
        bB.f$a = new z<Boolean>(true, stringArray8);
        String[] stringArray9 = new String[8];
        stringArray9[0] = "Inf Durability";
        stringArray9[1] = "InfiniteDurability";
        stringArray9[2] = "Durability";
        stringArray9[3] = "NoDurability";
        stringArray9[4] = "NoDura";
        stringArray9[5] = "InfDura";
        stringArray9[6] = "InfDurability";
        stringArray9[7] = "InfiniteDura";
        bB.f$C = new z<Boolean>(true, stringArray9);
        String[] stringArray10 = new String[5];
        stringArray10[0] = "NCP Strict";
        stringArray10[1] = "NCPStrict";
        stringArray10[2] = "ncp";
        stringArray10[3] = "strict";
        stringArray10[4] = "ncps";
        bB.f$e = new z<Boolean>(false, stringArray10);
        String[] stringArray11 = new String[3];
        stringArray11[0] = "Speed";
        stringArray11[1] = "spd";
        stringArray11[2] = "s";
        bB.f$I = new s((Number)2.5, (Number)0.1, (Number)50.0, stringArray11);
        String[] stringArray12 = new String[5];
        stringArray12[0] = "VSpeed";
        stringArray12[1] = "verticalspeed";
        stringArray12[2] = "vspd";
        stringArray12[3] = "vs";
        stringArray12[4] = "yspeed";
        bB.f$K = new s((Number)1.0, (Number)0.1, (Number)10.0, stringArray12);
        bB.f$d = new Random();
        bB.f$E(bB.f$D, bB.f$c, bB.f$l, bB.f$L, bB.f$A, bB.f$B, bB.f$C, bB.f$e, bB.f$a, bB.f$I, bB.f$K);
        bB.f$E(new db(bB), new oc(bB), new ed(bB));
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$ba() {
        return f$d;
    }

    @Override
    public void f$B() {
        BB bB;
        BB bB2 = bB;
        super.f$B();
        bB2.f$b = true;
        bB2.f$i = 0;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static double f$E(BB bB, double d) {
        bB.f$j = d;
        return bB.f$j;
    }

    public static Minecraft f$s() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static s f$E(BB bB) {
        return bB.f$K;
    }

    public static Minecraft f$y() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static Minecraft f$X() {
        return f$d;
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$O() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$z() {
        return f$d;
    }

    public static Minecraft f$N() {
        return f$d;
    }

    public static Minecraft f$r() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static s f$a(BB bB) {
        return bB.f$I;
    }

    public static Minecraft f$La() {
        return f$d;
    }

    public static Minecraft f$T() {
        return f$d;
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static Bh f$E(BB bB) {
        return bB.f$H;
    }

    public static boolean f$E(BB bB) {
        return bB.f$b;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$ga() {
        return f$d;
    }

    public static Random f$E(BB bB) {
        return bB.f$d;
    }

    public static double f$E(BB bB) {
        return bB.f$j;
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }
}
 */