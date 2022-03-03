package net.futureclient.client.deof.modules.combat.smoothAim;

public class SmoothAim {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.tD;
import net.futureclient.client.yd;
import net.futureclient.client.z;
import net.futureclient.client.zE;
import net.minecraft.client.Minecraft;

public class be
extends Ba {
    private z<Boolean> f$C;
    private s f$j;
    private z<Boolean> f$b;
    private s f$M;
    private Bh f$d;
    private z<Boolean> f$K;
    private z<Boolean> f$a;
    private z<Boolean> f$e;
    private z<Boolean> f$I;
    private s f$i;
    private s f$g;
    private ka<tD> f$A;
    private ka<yd> f$B;

    public static s f$E(be be2) {
        return be2.f$i;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static ka f$E(be be2) {
        return be2.f$A;
    }

    public static z f$B(be be2) {
        return be2.f$C;
    }

    public static z f$K(be be2) {
        return be2.f$K;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static s f$a(be be2) {
        return be2.f$j;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Bh f$E(be be2) {
        return be2.f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static s f$e(be be2) {
        return be2.f$M;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static z f$A(be be2) {
        return be2.f$b;
    }

    public static z f$e(be be2) {
        return be2.f$a;
    }

    public static z f$a(be be2) {
        return be2.f$I;
    }

    public static s f$B(be be2) {
        return be2.f$g;
    }

    public static ka f$a(be be2) {
        return be2.f$B;
    }

    public static z f$E(be be2) {
        return be2.f$e;
    }

    public be() {
        be be2;
        String[] stringArray = new String[1];
        stringArray[0] = "SmoothAim";
        super("SmoothAim", stringArray, true, -4615980, JD.f$I);
        be be3 = be2;
        String[] stringArray2 = new String[5];
        stringArray2[0] = "AimType";
        stringArray2[1] = "Aiming";
        stringArray2[2] = "AimMethod";
        stringArray2[3] = "at";
        stringArray2[4] = "bone";
        be3.f$A = new ka<tD>(tD.f$i, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "AimCheck";
        stringArray3[1] = "Check";
        stringArray3[2] = "ac";
        be2.f$B = new ka<yd>(yd.f$M, stringArray3);
        String[] stringArray4 = new String[5];
        stringArray4[0] = "InvisibleCheck";
        stringArray4[1] = "Invisibles";
        stringArray4[2] = "Invis";
        stringArray4[3] = "ic";
        stringArray4[4] = "i";
        be2.f$a = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[5];
        stringArray5[0] = "TeamCheck";
        stringArray5[1] = "Team";
        stringArray5[2] = "AttackTeammates";
        stringArray5[3] = "t";
        stringArray5[4] = "tc";
        be2.f$C = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[5];
        stringArray6[0] = "FriendCheck";
        stringArray6[1] = "Friends";
        stringArray6[2] = "AttackFriends";
        stringArray6[3] = "Betray";
        stringArray6[4] = "f";
        be2.f$e = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[5];
        stringArray7[0] = "RayTrace";
        stringArray7[1] = "Trace";
        stringArray7[2] = "Ray";
        stringArray7[3] = "r";
        stringArray7[4] = "rt";
        be2.f$I = new z<Boolean>(true, stringArray7);
        String[] stringArray8 = new String[4];
        stringArray8[0] = "ProximityCheck";
        stringArray8[1] = "Proximity";
        stringArray8[2] = "pc";
        stringArray8[3] = "p";
        be2.f$K = new z<Boolean>(true, stringArray8);
        String[] stringArray9 = new String[3];
        stringArray9[0] = "WeaponCheck";
        stringArray9[1] = "Weapon";
        stringArray9[2] = "w";
        be2.f$b = new z<Boolean>(true, stringArray9);
        String[] stringArray10 = new String[4];
        stringArray10[0] = "Speed";
        stringArray10[1] = "Sped";
        stringArray10[2] = "AimSpeed";
        stringArray10[3] = "S";
        be2.f$j = new s((Number)50.0, (Number)1.0, (Number)100.0, 1.0, stringArray10);
        String[] stringArray11 = new String[7];
        stringArray11[0] = "Distance";
        stringArray11[1] = "Dist";
        stringArray11[2] = "Far";
        stringArray11[3] = "Close";
        stringArray11[4] = "Length";
        stringArray11[5] = "d";
        stringArray11[6] = "Range";
        be2.f$i = new s((Number)5.0, (Number)0.1, (Number)7.0, 0.1, stringArray11);
        String[] stringArray12 = new String[4];
        stringArray12[0] = "InnerAngle";
        stringArray12[1] = "Inner";
        stringArray12[2] = "In";
        stringArray12[3] = "ia";
        be2.f$M = new s((Number)0.32, (Number)0.0, (Number)40.0, 1.0, stringArray12);
        String[] stringArray13 = new String[4];
        stringArray13[0] = "OuterAngle";
        stringArray13[1] = "Outer";
        stringArray13[2] = "Out";
        stringArray13[3] = "oa";
        be2.f$g = new s((Number)90.0, (Number)0.0, (Number)180.0, 1.0, stringArray13);
        be2.f$d = new Bh();
        be2.f$E(be2.f$A, be2.f$B, be2.f$a, be2.f$C, be2.f$e, be2.f$I, be2.f$K, be2.f$b, be2.f$j, be2.f$i, be2.f$M, be2.f$g);
        be2.f$E(new zE(be2));
    }
}
 */