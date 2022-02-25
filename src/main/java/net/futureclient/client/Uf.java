package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.Ba;
import net.futureclient.client.If;
import net.futureclient.client.JD;
import net.futureclient.client.MF;
import net.futureclient.client.eF;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.minecraft.client.Minecraft;

public class Uf
extends Ba {
    private s f$e;
    private ka<eF> f$a;
    private s f$K;
    private ka<MF> f$C;
    private float f$d;
    private boolean f$M;
    private float f$i;
    private int f$g;
    private s f$I;
    private Random f$b;
    private float f$j;

    public static float f$a(Uf uf) {
        return uf.f$j;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static float f$E(Uf uf) {
        return uf.f$i;
    }

    public static s f$a(Uf uf) {
        return uf.f$e;
    }

    public static boolean f$E(Uf uf, boolean bl) {
        uf.f$M = bl;
        return uf.f$M;
    }

    public static boolean f$a(Uf uf) {
        return uf.f$M;
    }

    private boolean f$e() {
        return !Uf.f$d.gameSettings.keyBindAttack.isKeyDown() && !Uf.f$d.gameSettings.keyBindUseItem.isKeyDown();
    }

    public static float f$E(Uf uf, float f) {
        uf.f$d = f;
        return uf.f$d;
    }

    public static Random f$E(Uf uf) {
        return uf.f$b;
    }

    public static float f$e(Uf uf) {
        return uf.f$d;
    }

    public static ka f$E(Uf uf) {
        return uf.f$C;
    }

    public Uf() {
        Uf uf;
        String[] stringArray = new String[6];
        stringArray[0] = "AntiAim";
        stringArray[1] = "AA";
        stringArray[2] = "Retard";
        stringArray[3] = "Derp";
        stringArray[4] = "Retar";
        stringArray[5] = "Retad";
        super("AntiAim", stringArray, true, -14303062, JD.f$b);
        Uf uf2 = uf;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Pitch";
        stringArray2[1] = "p";
        uf2.f$a = new ka<eF>(eF.f$C, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Yaw";
        stringArray3[1] = "ry";
        uf.f$C = new ka<MF>(MF.f$I, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Yaw Add";
        stringArray4[1] = "yawadd";
        stringArray4[2] = "ya";
        uf.f$e = new s((Number)Float.valueOf(0.0f), (Number)Float.valueOf(-180.0f), (Number)Float.valueOf(180.0f), 0.1, stringArray4);
        String[] stringArray5 = new String[6];
        stringArray5[0] = "Spin Speed";
        stringArray5[1] = "spinspeed";
        stringArray5[2] = "speed";
        stringArray5[3] = "ss";
        stringArray5[4] = "spin";
        stringArray5[5] = "spin-speed";
        uf.f$I = new s((Number)Float.valueOf(40.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(40.0f), 1, stringArray5);
        String[] stringArray6 = new String[7];
        stringArray6[0] = "Flip Ticks";
        stringArray6[1] = "flipticks";
        stringArray6[2] = "flipspeed";
        stringArray6[3] = "ft";
        stringArray6[4] = "flip";
        stringArray6[5] = "flip-speed";
        stringArray6[6] = "flip-tick";
        uf.f$K = new s((Number)Float.valueOf(2.0f), (Number)Float.valueOf(2.0f), (Number)Float.valueOf(20.0f), 1, stringArray6);
        uf.f$b = new Random();
        uf.f$E(uf.f$a, uf.f$C, uf.f$e, uf.f$I, uf.f$K);
        uf.f$E(new If(uf));
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static int f$E(Uf uf, int n) {
        uf.f$g = n;
        return uf.f$g;
    }

    public static float f$e(Uf uf, float f) {
        uf.f$j = f;
        return uf.f$j;
    }

    public static s f$E(Uf uf) {
        return uf.f$K;
    }

    public static int f$E(Uf uf) {
        return uf.f$g;
    }

    public static ka f$a(Uf uf) {
        return uf.f$a;
    }

    public static s f$e(Uf uf) {
        return uf.f$I;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static float f$a(Uf uf, float f) {
        uf.f$i = f;
        return uf.f$i;
    }

    public static boolean f$E(Uf uf) {
        return uf.f$e();
    }

    public static Minecraft f$e() {
        return f$d;
    }
}
package net.futureclient.client;

import java.util.HashMap;
import net.futureclient.client.Ae;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.La;
import net.futureclient.client.Qf;
import net.futureclient.client.Xe;
import net.futureclient.client.fF;
import net.futureclient.client.qD;
import net.futureclient.client.qf;
import net.futureclient.client.sF;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class UF
extends Ba {
    private String[] f$C;
    private String[] f$I;
    private String[] f$i;
    private z<Boolean> f$m;
    private String[] f$d;
    private z<Boolean> f$H;
    private Bh f$A;
    private z<Boolean> f$J;
    private Bh f$a;
    private Bh f$B;
    private HashMap<String, Integer> f$l;
    private String[] f$b;
    private HashMap<String, Integer> f$c;
    private String[] f$e;
    private z<Boolean> f$D;
    private z<Boolean> f$F;
    private HashMap<String, Integer> f$L;
    private String[] f$j;
    private String[] f$M;
    private String[] f$K;
    private String[] f$g;
    private z<Boolean> f$E;
    private z<Boolean> f$k;

    public static String[] f$A(UF uF) {
        return uF.f$b;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static void f$E(UF uF, String string) {
        uF.f$e(string);
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Bh f$E(UF uF) {
        return uF.f$a;
    }

    public static Bh f$e(UF uF) {
        return uF.f$A;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static String[] f$a(UF uF) {
        return uF.f$g;
    }

    private void f$e(String string) {
        if (0.f$D.f$E().booleanValue()) {
            La.f$E().f$E(string);
            return;
        }
        UF.f$d.player.sendChatMessage(new StringBuilder().insert(0, "> ").append(string).toString());
    }

    public static z f$A(UF uF) {
        return uF.f$k;
    }

    public static String[] f$B(UF uF) {
        return uF.f$i;
    }

    public static String[] f$E(UF uF) {
        return uF.f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static String[] f$C(UF uF) {
        return uF.f$e;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static String[] f$K(UF uF) {
        return uF.f$j;
    }

    public static Bh f$a(UF uF) {
        return uF.f$B;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static z f$B(UF uF) {
        return uF.f$E;
    }

    public static z f$E(UF uF) {
        return uF.f$H;
    }

    public static String[] f$M(UF uF) {
        return uF.f$C;
    }

    @Override
    public void f$B() {
        UF uF;
        UF uF2 = uF;
        uF2.f$l.clear();
        uF2.f$L.clear();
        uF2.f$c.clear();
        super.f$B();
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static String[] f$h(UF uF) {
        return uF.f$K;
    }

    public static HashMap f$e(UF uF) {
        return uF.f$l;
    }

    public static z f$e(UF uF) {
        return uF.f$J;
    }

    public static z f$K(UF uF) {
        return uF.f$F;
    }

    public static HashMap f$E(UF uF) {
        return uF.f$c;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    @Override
    public void f$K() {
        UF uF;
        UF uF2 = uF;
        uF2.f$l.clear();
        uF2.f$L.clear();
        uF2.f$c.clear();
        super.f$K();
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static HashMap f$a(UF uF) {
        return uF.f$L;
    }

    public UF() {
        UF uF;
        String[] stringArray = new String[4];
        stringArray[0] = "Announcer";
        stringArray[1] = "Anounce";
        stringArray[2] = "Greeter";
        stringArray[3] = "Greet";
        super("Announcer", stringArray, true, -4191950, JD.f$b);
        UF uF2 = uF;
        String[] stringArray2 = new String[1];
        stringArray2[0] = "Join";
        uF2.f$k = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[1];
        stringArray3[0] = "Leave";
        uF.f$F = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[1];
        stringArray4[0] = "Place";
        uF.f$J = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[1];
        stringArray5[0] = "Break";
        uF.f$E = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[1];
        stringArray6[0] = "Food";
        uF.f$H = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[6];
        stringArray7[0] = "WorldTime";
        stringArray7[1] = "World";
        stringArray7[2] = "WorldTimer";
        stringArray7[3] = "TimeData";
        stringArray7[4] = "Night";
        stringArray7[5] = "Time";
        uF.f$m = new z<Boolean>(true, stringArray7);
        String[] stringArray8 = new String[4];
        stringArray8[0] = "ClientSideOnly";
        stringArray8[1] = "ClientSide";
        stringArray8[2] = "cso";
        stringArray8[3] = "cs";
        uF.f$D = new z<Boolean>(false, stringArray8);
        UF uF3 = uF;
        uF3.f$l = new HashMap();
        uF3.f$L = new HashMap();
        uF3.f$c = new HashMap();
        uF3.f$A = new Bh();
        uF.f$B = new Bh();
        uF.f$a = new Bh();
        uF.f$E(uF.f$k, uF.f$F, uF.f$H, uF.f$J, uF.f$E, uF.f$m, uF.f$D);
        String[] stringArray9 = new String[7];
        stringArray9[0] = "See you later, ";
        stringArray9[1] = "Catch ya later, ";
        stringArray9[2] = "See you next time, ";
        stringArray9[3] = "Farewell, ";
        stringArray9[4] = "Bye, ";
        stringArray9[5] = "Good bye, ";
        stringArray9[6] = "Later, ";
        uF.f$e = stringArray9;
        String[] stringArray10 = new String[7];
        stringArray10[0] = "Good to see you, ";
        stringArray10[1] = "Greetings, ";
        stringArray10[2] = "Hello, ";
        stringArray10[3] = "Howdy, ";
        stringArray10[4] = "Hey, ";
        stringArray10[5] = "Good evening, ";
        stringArray10[6] = "Welcome to SERVERIP1D5A9E, ";
        uF.f$C = stringArray10;
        String[] stringArray11 = new String[6];
        stringArray11[0] = "Good morning!";
        stringArray11[1] = "Top of the morning to you!";
        stringArray11[2] = "Good day!";
        stringArray11[3] = "You survived another night!";
        stringArray11[4] = "Good morning everyone!";
        stringArray11[5] = "The sun is rising in the east, hurrah, hurrah!";
        uF.f$I = stringArray11;
        String[] stringArray12 = new String[5];
        stringArray12[0] = "Let's go tanning!";
        stringArray12[1] = "Let's go to the beach!";
        stringArray12[2] = "Grab your sunglasses!";
        stringArray12[3] = "Enjoy the sun outside! It is currently very bright!";
        stringArray12[4] = "It's the brightest time of the day!";
        uF.f$K = stringArray12;
        String[] stringArray13 = new String[5];
        stringArray13[0] = "Good afternoon!";
        stringArray13[1] = "Let's grab lunch!";
        stringArray13[2] = "Lunch time, kids!";
        stringArray13[3] = "Good afternoon everyone!";
        stringArray13[4] = "IT'S HIGH NOON!";
        uF.f$b = stringArray13;
        String[] stringArray14 = new String[3];
        stringArray14[0] = "Happy hour!";
        stringArray14[1] = "Let's get crunk!";
        stringArray14[2] = "Enjoy the sunset everyone!";
        uF.f$j = stringArray14;
        String[] stringArray15 = new String[4];
        stringArray15[0] = "Let's get comfy!";
        stringArray15[1] = "Netflix and chill!";
        stringArray15[2] = "You survived another day!";
        stringArray15[3] = "Time to go to bed kids!";
        uF.f$i = stringArray15;
        String[] stringArray16 = new String[1];
        stringArray16[0] = "Sunset has now ended! You may eat your lunch now if you are a muslim.";
        uF.f$M = stringArray16;
        String[] stringArray17 = new String[2];
        stringArray17[0] = "It's so dark outside...";
        stringArray17[1] = "It's the opposite of noon!";
        uF.f$g = stringArray17;
        String[] stringArray18 = new String[3];
        stringArray18[0] = "Good bye, zombies!";
        stringArray18[1] = "Monsters are now burning!";
        stringArray18[2] = "Burn baby, burn!";
        uF.f$d = stringArray18;
        uF.f$E(new Ae(uF), new qf(uF), new Xe(uF), new Qf(uF), new sF(uF), new fF(uF), new qD(uF));
    }

    public static z f$a(UF uF) {
        return uF.f$m;
    }

    public static String[] f$e(UF uF) {
        return uF.f$M;
    }

    public static String[] f$H(UF uF) {
        return uF.f$I;
    }

    public static Minecraft f$M() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.DD;
import net.futureclient.client.Ha;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.CPacketKeepAlive;

public class uF
extends Ha<ve> {
    public final DD f$d;

    public uF(DD dD) {
        0.f$d = dD;
    }

    @Override
    public void f$E(ve ve2) {
        if (ve2.f$E() instanceof CPacketKeepAlive) {
            CPacketKeepAlive cPacketKeepAlive = (CPacketKeepAlive)ve2.f$E();
            if (!DD.f$E(0.f$d).contains(cPacketKeepAlive)) {
                DD.f$E(0.f$d).add(cPacketKeepAlive);
                ve2.f$E(true);
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Ie;
import net.futureclient.client.iD;

public class uf
extends Ha<iD> {
    public final Ie f$d;

    public uf(Ie ie) {
        0.f$d = ie;
    }

    @Override
    public void f$E(iD iD2) {
        iD2.f$E(true);
    }
}
