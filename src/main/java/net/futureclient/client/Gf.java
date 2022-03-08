package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.Nf;
import net.futureclient.client.XF;
import net.futureclient.client.ae;
import net.futureclient.client.ee;
import net.futureclient.client.fD;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.futureclient.client.zd;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;

public class Gf
extends Ba {
    private final z<Boolean> f$A;
    private final z<Boolean> f$H;
    private final z<Boolean> f$l;
    private final z<Boolean> f$E;
    private final z<Boolean> f$D;
    public static final MovementInput f$h;
    private Boolean f$g;
    private Bh f$C;
    private Bh f$e;
    private final s f$a;
    private Bh f$I;
    private final z<String> f$B;
    private int f$b;
    private Boolean f$M;
    private final z<Boolean> f$c;
    private Boolean f$j;
    private final z<Boolean> f$J;
    private final z<Boolean> f$L;
    private Boolean f$i;
    private final Random f$f;
    private Boolean f$d;
    private final z<Boolean> f$m;
    private final z<Boolean> f$k;
    private Bh f$K;
    private final z<Boolean> f$F;

    public static Random f$E(Gf gf) {
        return gf.f$f;
    }

    public static z f$C(Gf gf) {
        return gf.f$k;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Bh f$e(Gf gf) {
        return gf.f$I;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Boolean f$a(Gf gf, Boolean bl) {
        gf.f$d = bl;
        return gf.f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static s f$E(Gf gf) {
        return gf.f$a;
    }

    public static z f$H(Gf gf) {
        return gf.f$F;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Bh f$B(Gf gf) {
        return gf.f$C;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static z f$A(Gf gf) {
        return gf.f$E;
    }

    public static z f$M(Gf gf) {
        return gf.f$m;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Bh f$a(Gf gf) {
        return gf.f$K;
    }

    public static Boolean f$B(Gf gf, Boolean bl) {
        gf.f$M = bl;
        return gf.f$M;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Bh f$E(Gf gf) {
        return gf.f$e;
    }

    public static z f$E(Gf gf) {
        return gf.f$A;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static int f$E(Gf gf, int n) {
        gf.f$b = n;
        return gf.f$b;
    }

    public static Boolean f$E(Gf gf, Boolean bl) {
        gf.f$j = bl;
        return gf.f$j;
    }

    public static z f$h(Gf gf) {
        return gf.f$J;
    }

    public Gf() {
        Gf gf;
        String[] stringArray = new String[3];
        stringArray[0] = "AntiAFK";
        stringArray[1] = "afk";
        stringArray[2] = "idle";
        super("AntiAFK", stringArray, true, -11532958, JD.f$b);
        Gf gf2 = gf;
        gf2.f$f = new Random();
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Message";
        stringArray2[1] = "PM";
        stringArray2[2] = "Command";
        gf2.f$k = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "TabComplete";
        stringArray3[1] = "tcomplete";
        stringArray3[2] = "tab";
        gf.f$F = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "Rotate";
        stringArray4[1] = "Rot";
        stringArray4[2] = "Rotation";
        stringArray4[3] = "Spin";
        gf.f$J = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Interact";
        stringArray5[1] = "Interaction";
        stringArray5[2] = "Break";
        gf.f$E = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[5];
        stringArray6[0] = "ClipDown";
        stringArray6[1] = "TpDown";
        stringArray6[2] = "Tp";
        stringArray6[3] = "Teleportion";
        stringArray6[4] = "Vclip";
        gf.f$H = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[5];
        stringArray7[0] = "Punch";
        stringArray7[1] = "Pucn";
        stringArray7[2] = "Hit";
        stringArray7[3] = "Attack";
        stringArray7[4] = "Swing";
        gf.f$m = new z<Boolean>(true, stringArray7);
        String[] stringArray8 = new String[3];
        stringArray8[0] = "Jump";
        stringArray8[1] = "Jum";
        stringArray8[2] = "Hop";
        gf.f$D = new z<Boolean>(true, stringArray8);
        String[] stringArray9 = new String[5];
        stringArray9[0] = "Sneak";
        stringArray9[1] = "Snek";
        stringArray9[2] = "Sneake";
        stringArray9[3] = "sn";
        stringArray9[4] = "s";
        gf.f$l = new z<Boolean>(true, stringArray9);
        String[] stringArray10 = new String[3];
        stringArray10[0] = "AutoReply";
        stringArray10[1] = "Reply";
        stringArray10[2] = "AR";
        gf.f$L = new z<Boolean>(true, stringArray10);
        String[] stringArray11 = new String[3];
        stringArray11[0] = "Move";
        stringArray11[1] = "Moving";
        stringArray11[2] = "m";
        gf.f$c = new z<Boolean>(true, stringArray11);
        String[] stringArray12 = new String[4];
        stringArray12[0] = "Move Safely";
        stringArray12[1] = "MoveSafely";
        stringArray12[2] = "MovingSafely";
        stringArray12[3] = "ms";
        gf.f$A = new z<Boolean>(true, stringArray12);
        String[] stringArray13 = new String[4];
        stringArray13[0] = "Reply";
        stringArray13[1] = "ReplyMessage";
        stringArray13[2] = "AFKMessage";
        stringArray13[3] = "AFKReply";
        gf.f$B = new z<String>("/r [Future] I am currently AFK.", stringArray13);
        String[] stringArray14 = new String[2];
        stringArray14[0] = "Delay";
        stringArray14[1] = "d";
        gf.f$a = new s((Number)Float.valueOf(60.0f), (Number)Float.valueOf(5.0f), (Number)Float.valueOf(270.0f), 1, stringArray14);
        Gf gf3 = gf;
        gf3.f$C = new Bh();
        gf3.f$e = new Bh();
        gf.f$I = new Bh();
        gf.f$K = new Bh();
        gf.f$E(gf.f$k, gf.f$F, gf.f$J, gf.f$c, gf.f$A, gf.f$E, gf.f$H, gf.f$m, gf.f$D, gf.f$l, gf.f$L, gf.f$B, gf.f$a);
        gf.f$E(new ee(gf), new fD(gf), new ae(gf), new XF(gf), new zd(gf));
    }

    public static Boolean f$K(Gf gf, Boolean bl) {
        gf.f$i = bl;
        return gf.f$i;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Boolean f$E(Gf gf) {
        return gf.f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Boolean f$B(Gf gf) {
        return gf.f$i;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    static {
        f$h = new Nf(((Minecraft)Gf.f$d).gameSettings);
    }

    public static Boolean f$a(Gf gf) {
        return gf.f$g;
    }

    @Override
    public void f$B() {
        Gf gf;
        Gf gf2 = gf;
        super.f$B();
        gf2.f$j = null;
        gf.f$d = null;
        gf2.f$g = null;
        gf2.f$M = null;
        gf2.f$i = null;
        if (((Minecraft)Gf.f$d).player != null && Gf.f$d.player.movementInput.getClass() == f$h.getClass()) {
            MovementInputFromOptions movementInputFromOptions = new MovementInputFromOptions(((Minecraft)Gf.f$d).gameSettings);
            movementInputFromOptions.updatePlayerMoveState();
            Gf.f$d.player.movementInput = movementInputFromOptions;
        }
    }

    public static Boolean f$e(Gf gf) {
        return gf.f$M;
    }

    public static int f$E(Gf gf) {
        return gf.f$b++;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static z f$a(Gf gf) {
        return gf.f$B;
    }

    public static z f$I(Gf gf) {
        return gf.f$c;
    }

    public static z f$B(Gf gf) {
        return gf.f$D;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    @Override
    public void f$K() {
        Gf gf;
        Gf gf2 = gf;
        gf2.f$C.f$a();
        super.f$K();
    }

    public static z f$j(Gf gf) {
        return gf.f$l;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Boolean f$e(Gf gf, Boolean bl) {
        gf.f$g = bl;
        return gf.f$g;
    }

    public static Boolean f$K(Gf gf) {
        return gf.f$j;
    }

    public static z f$e(Gf gf) {
        return gf.f$L;
    }

    public static int f$a(Gf gf) {
        return gf.f$b;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static z f$K(Gf gf) {
        return gf.f$H;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Hg;
import net.futureclient.client.JD;
import net.futureclient.client.WD;
import net.futureclient.client.ka;
import net.minecraft.client.Minecraft;

public class GF
extends Ba {
    private ka<Hg> f$d;

    public static ka f$E(GF gF) {
        return gF.f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public GF() {
        GF gF;
        String[] stringArray = new String[4];
        stringArray[0] = "ColorSigns";
        stringArray[1] = "SignExploit";
        stringArray[2] = "ColorSign";
        stringArray[3] = "CS";
        super("ColorSigns", stringArray, true, -11106219, JD.f$K);
        GF gF2 = gF;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Mode";
        stringArray2[1] = "Mod";
        stringArray2[2] = "Type";
        stringArray2[3] = "m";
        gF2.f$d = new ka<Hg>(Hg.f$M, stringArray2);
        gF.f$E(gF.f$d);
        gF.f$E(new WD(gF));
    }
}
