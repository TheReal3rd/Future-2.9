package net.futureclient.client.deof.modules.movement.step;

public class Step {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ab;
import net.futureclient.client.Ba;
import net.futureclient.client.Bd;
import net.futureclient.client.Bh;
import net.futureclient.client.JA;
import net.futureclient.client.JD;
import net.futureclient.client.Sd;
import net.futureclient.client.Y;
import net.futureclient.client.YB;
import net.futureclient.client.dd;
import net.futureclient.client.ic;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.q;
import net.futureclient.client.s;
import net.futureclient.client.uA;
import net.futureclient.client.z;
import net.futureclient.client.zb;
import net.minecraft.client.Minecraft;

public class lc
extends Ba {
    private int f$g;
    private float f$M;
    public z<Boolean> f$e;
    public z<Boolean> f$K;
    public ka<Bd> f$b;
    private boolean f$d;
    private s f$C;
    private double f$i;
    private Bh f$j;
    public z<Boolean> f$I;

    public static boolean f$E(lc lc2) {
        return lc2.f$d;
    }

    private boolean f$e() {
        uA uA2 = (uA)kH.f$E().f$E().f$E(uA.class);
        if (!(uA2 == null || !uA2.f$E() || ((dd)((Object)uA2.f$K.f$E())).equals((Object)dd.f$j) || ((dd)((Object)uA2.f$K.f$E())).equals((Object)dd.f$C) || ((dd)((Object)uA2.f$K.f$E())).equals((Object)dd.f$a) || ((dd)((Object)uA2.f$K.f$E())).equals((Object)dd.f$M) || ((dd)((Object)uA2.f$K.f$E())).equals((Object)dd.f$g))) {
            return false;
        }
        return !lc.f$d.player.func_70090_H() && lc.f$d.player.field_70122_E && !lc.f$d.player.func_70617_f_() && !lc.f$d.player.movementInput.jump && lc.f$d.player.field_70124_G && (double)lc.f$d.player.field_70143_R < 0.1;
    }

    public static float f$E(lc lc2, float f) {
        lc2.f$M = f;
        return lc2.f$M;
    }

    public static int f$a(lc lc2) {
        return lc2.f$g++;
    }

    public static int f$E(lc lc2, int n) {
        lc2.f$g = n;
        return lc2.f$g;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static float f$E(lc lc2) {
        return lc2.f$M;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static boolean f$a(lc lc2) {
        return lc2.f$e();
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static double f$E(lc lc2, double d) {
        lc2.f$i = d;
        return lc2.f$i;
    }

    public lc() {
        lc lc2;
        String[] stringArray = new String[3];
        stringArray[0] = "Step";
        stringArray[1] = "autojump";
        stringArray[2] = "SlideStep";
        super("Step", stringArray, false, -7285557, JD.f$j);
        lc lc3 = lc2;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Height";
        stringArray2[1] = "Stepheight";
        stringArray2[2] = "Step-Height";
        stringArray2[3] = "sh";
        lc3.f$C = new s((Number)Float.valueOf(2.0f), (Number)Float.valueOf(0.8f), (Number)Float.valueOf(10.0f), 0.1, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Reverse";
        stringArray3[1] = "rev";
        lc2.f$e = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "UseTimer";
        stringArray4[1] = "Timer";
        stringArray4[2] = "Time";
        stringArray4[3] = "Timr";
        lc2.f$I = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[5];
        stringArray5[0] = "EntityStep";
        stringArray5[1] = "HorseStep";
        stringArray5[2] = "PigStep";
        stringArray5[3] = "PiggyStep";
        stringArray5[4] = "hstep";
        lc2.f$K = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Mode";
        stringArray6[1] = "Type";
        stringArray6[2] = "Mod";
        lc2.f$b = new ka<Bd>(Bd.f$i, stringArray6);
        lc lc4 = lc2;
        lc4.f$j = new Bh();
        lc4.f$M = 1.0f;
        lc2.f$g = 0;
        lc2.f$E(lc2.f$b, lc2.f$e, lc2.f$I, lc2.f$K, lc2.f$C);
        lc2.f$E(new YB(lc2), new Ab(lc2), new zb(lc2), new JA(lc2), new Sd(lc2));
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Bh f$E(lc lc2) {
        return lc2.f$j;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static double f$E(lc lc2) {
        return lc2.f$i;
    }

    @Override
    public void f$B() {
        lc lc2;
        ic ic2 = (ic)kH.f$E().f$E().f$E(ic.class);
        if (lc.f$d.player != null) {
            if (ic2 != null && !ic2.f$E()) {
                ((q)((Y)f$d).getTimer()).f$E(1.0f);
            }
            if (lc.f$d.player.func_184187_bx() != null) {
                lc.f$d.player.func_184187_bx().stepHeight = 1.0f;
            }
        }
        super.f$B();
    }

    public static s f$E(lc lc2) {
        return lc2.f$C;
    }

    public static int f$E(lc lc2) {
        return lc2.f$g;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static boolean f$E(lc lc2, boolean bl) {
        lc2.f$d = bl;
        return lc2.f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }
}
 */