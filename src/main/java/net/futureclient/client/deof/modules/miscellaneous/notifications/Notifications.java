package net.futureclient.client.deof.modules.miscellaneous.notifications;

public class Notifications {
}
/*
package net.futureclient.client;

import java.util.ArrayList;
import java.util.Iterator;
import net.futureclient.client.Ba;
import net.futureclient.client.Cb;
import net.futureclient.client.JD;
import net.futureclient.client.Oc;
import net.futureclient.client.Pg;
import net.futureclient.client.Vh;
import net.futureclient.client.gC;
import net.futureclient.client.gG;
import net.futureclient.client.hB;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.sb;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class DC
extends Ba {
    private gG f$I;
    public z<Boolean> f$l;
    private static int f$d;
    private ArrayList<EntityPlayer> f$g;
    private gG f$B;
    private gG f$C;
    public z<Boolean> f$L;
    private gG f$A;
    private gG f$e;
    private static boolean f$i;
    public z<Boolean> f$E;
    public z<Boolean> f$m;
    public z<Boolean> f$D;
    public z<Boolean> f$J;
    private static boolean f$M;
    private gG f$a;
    public z<Boolean> f$F;
    public z<Boolean> f$H;
    private static boolean f$K;
    private gG f$c;
    private static boolean f$b;
    private static boolean f$j;
    private ka<gC> f$k;

    public static Minecraft f$A() {
        return f$d;
    }

    public static boolean f$e(boolean bl) {
        f$j = bl;
        return f$j;
    }

    public DC() {
        DC dC;
        String[] stringArray = new String[4];
        stringArray[0] = "Notifications";
        stringArray[1] = "Notifcations";
        stringArray[2] = "Notify";
        stringArray[3] = "Notif";
        super("Notifications", stringArray, true, -5692121, JD.f$b);
        DC dC2 = dC;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Mode";
        stringArray2[1] = "Mod";
        stringArray2[2] = "Method";
        stringArray2[3] = "Time";
        dC2.f$k = new ka<gC>(gC.f$M, stringArray2);
        String[] stringArray3 = new String[1];
        stringArray3[0] = "Queue";
        dC.f$F = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[1];
        stringArray4[0] = "Kick";
        dC.f$J = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[1];
        stringArray5[0] = "PM";
        dC.f$E = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[1];
        stringArray6[0] = "Name";
        dC.f$H = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[1];
        stringArray7[0] = "Stuck";
        dC.f$m = new z<Boolean>(true, stringArray7);
        String[] stringArray8 = new String[1];
        stringArray8[0] = "Damage";
        dC.f$D = new z<Boolean>(true, stringArray8);
        String[] stringArray9 = new String[1];
        stringArray9[0] = "Nearby";
        dC.f$l = new z<Boolean>(true, stringArray9);
        String[] stringArray10 = new String[6];
        stringArray10[0] = "Show Friends";
        stringArray10[1] = "ShowFriends";
        stringArray10[2] = "HideFriends";
        stringArray10[3] = "ShowFriends";
        stringArray10[4] = "HF";
        stringArray10[5] = "SF";
        dC.f$L = new z<Boolean>(true, stringArray10);
        DC dC3 = dC;
        dC3.f$c = new gG();
        dC3.f$A = new gG();
        dC3.f$B = new gG();
        dC3.f$a = new gG();
        dC3.f$C = new gG();
        dC3.f$e = new gG();
        dC.f$I = new gG();
        dC.f$g = new ArrayList();
        dC.f$E(dC.f$k, dC.f$F, dC.f$J, dC.f$E, dC.f$H, dC.f$m, dC.f$D, dC.f$l, dC.f$L);
        dC.f$E(new Oc(dC), new Cb(dC), new sb(dC), new hB(dC));
    }

    public static boolean f$K(boolean bl) {
        f$K = bl;
        return f$K;
    }

    public static gG f$A(DC dC) {
        return dC.f$e;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static gG f$e(DC dC) {
        return dC.f$a;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static boolean f$E(boolean bl) {
        f$M = bl;
        return f$M;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static boolean f$A() {
        return f$i;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static int f$E(int n) {
        f$d = n;
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static gG f$B(DC dC) {
        return dC.f$c;
    }

    public static int f$e() {
        return f$d++;
    }

    static {
        f$M = false;
        f$d = 0;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static gG f$E(DC dC) {
        return dC.f$A;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static gG f$h(DC dC) {
        return dC.f$C;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static boolean f$h() {
        return f$j;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static ka f$E(DC dC) {
        return dC.f$k;
    }

    @Override
    public void f$K() {
        DC dC;
        if (kH.f$E().f$E() == null) {
            kH.f$E().f$E(new Vh());
        }
        f$K = false;
        f$b = false;
        f$j = false;
        f$i = false;
        f$M = false;
        dC.f$g.clear();
        if (DC.f$d.player != null && dC.f$l.f$E().booleanValue()) {
            Iterator iterator = DC.f$d.world.field_73010_i.iterator();
            while (iterator.hasNext()) {
                EntityPlayer entityPlayer = (EntityPlayer)((Entity)iterator.next());
                if (!Pg.f$E((Entity)entityPlayer) || dC.f$g.contains(entityPlayer) || !dC.f$L.f$E().booleanValue() && kH.f$E().f$E().f$E(entityPlayer.getName()) || entityPlayer.getName().equals(DC.f$d.player.func_70005_c_()) || entityPlayer instanceof EntityPlayerSP) continue;
                dC.f$g.add(entityPlayer);
            }
        }
        super.f$K();
    }

    public static boolean f$B(boolean bl) {
        f$b = bl;
        return f$b;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static boolean f$a(boolean bl) {
        f$i = bl;
        return f$i;
    }

    @Override
    public void f$B() {
        DC dC;
        if (kH.f$E().f$E() != null) {
            kH.f$E().f$E().f$d.remove(kH.f$E().f$E().f$g);
            kH.f$E().f$E((Vh)null);
        }
        f$K = false;
        f$b = false;
        f$j = false;
        f$i = false;
        f$M = false;
        DC dC2 = dC;
        dC2.f$g.clear();
        super.f$B();
    }

    public static ArrayList f$E(DC dC) {
        return dC.f$g;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static boolean f$e() {
        return f$K;
    }

    public static boolean f$K() {
        return f$M;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static int f$a() {
        return f$d;
    }

    public static gG f$K(DC dC) {
        return dC.f$I;
    }

    public static boolean f$B() {
        return f$b;
    }

    public static gG f$a(DC dC) {
        return dC.f$B;
    }
}
 */