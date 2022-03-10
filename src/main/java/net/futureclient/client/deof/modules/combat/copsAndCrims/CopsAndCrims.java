package net.futureclient.client.deof.modules.combat.copsAndCrims;

public class CopsAndCrims {
}
/*
package net.futureclient.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Vf;
import net.futureclient.client.hE;
import net.futureclient.client.ka;
import net.futureclient.client.pf;
import net.futureclient.client.s;
import net.futureclient.client.sG;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;

public class wE
extends Ba {
    private int f$l;
    private int f$A;
    private z<Boolean> f$i;
    private z<Boolean> f$d;
    private ka<sG> f$K;
    private z<Boolean> f$g;
    private s f$C;
    private Map<EntityPlayer, List<Vec3d>> f$B;
    private s f$e;
    private ka<Vf> f$b;
    private s f$a;
    private EntityPlayer f$c;
    public z<Boolean> f$j;
    private z<Boolean> f$M;
    private int f$L;
    private s f$I;

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static z f$a(wE wE2) {
        return wE2.f$i;
    }

    public static int f$E(wE wE2) {
        return --wE2.f$l;
    }

    public static z f$B(wE wE2) {
        return wE2.f$M;
    }

    public static s f$E(wE wE2) {
        return wE2.f$a;
    }

    public static ka f$a(wE wE2) {
        return wE2.f$b;
    }

    private String f$E(Entity object) {
        object = Pattern.compile("\u00a7(.).*\u00a7r").matcher(object.getDisplayName().getFormattedText());
        if (((Matcher)object).find()) {
            return ((Matcher)object).group(1);
        }
        return "f";
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static int f$E(wE wE2, int n) {
        wE2.f$L = n;
        return wE2.f$L;
    }

    public static s f$e(wE wE2) {
        return wE2.f$I;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static EntityPlayer f$E(wE wE2, EntityPlayer entityPlayer) {
        wE2.f$c = entityPlayer;
        return wE2.f$c;
    }

    public static z f$E(wE wE2) {
        return wE2.f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static int f$a(wE wE2, int n) {
        wE2.f$l = n;
        return wE2.f$l;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static int f$A(wE wE2) {
        return ++wE2.f$l;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    private double f$E(EntityPlayer entityPlayer) {
        double d = -((Minecraft)wE.f$d).player.func_70032_d((Entity)entityPlayer);
        if (entityPlayer.field_70142_S == entityPlayer.field_70165_t && entityPlayer.field_70137_T == entityPlayer.field_70163_u && entityPlayer.field_70136_U == entityPlayer.field_70161_v) {
            d += 200.0;
        }
        return d -= (double)(entityPlayer.func_70032_d((Entity)((Minecraft)wE.f$d).player) / 5.0f);
    }

    public static Map f$E(wE wE2, Map map) {
        wE2.f$B = map;
        return wE2.f$B;
    }

    public wE() {
        wE wE2;
        String[] stringArray = new String[3];
        stringArray[0] = "CopsAndCrims";
        stringArray[1] = "CAC";
        stringArray[2] = "Aimware";
        super("CopsAndCrims", stringArray, true, -3128823, JD.f$I);
        wE2.f$A = 10;
        wE wE3 = wE2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Delay";
        stringArray2[1] = "Del";
        wE3.f$a = new s((Number)Float.valueOf(7.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(35.0f), 0.1, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "FOV";
        stringArray3[1] = "Fieldofview";
        wE2.f$C = new s((Number)Float.valueOf(180.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(180.0f), 1, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "HRecoil";
        stringArray4[1] = "rcsHorizontal";
        stringArray4[2] = "Horizontal";
        wE2.f$e = new s((Number)Float.valueOf(0.1f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(2.0f), 0.1, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "VRecoil";
        stringArray5[1] = "rcsVertical";
        stringArray5[2] = "Vertical";
        wE2.f$I = new s((Number)Float.valueOf(0.5f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(2.0f), 0.1, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Bone";
        stringArray6[1] = "Targeting";
        stringArray6[2] = "AimPos";
        wE2.f$K = new ka<sG>(sG.f$K, stringArray6);
        String[] stringArray7 = new String[3];
        stringArray7[0] = "ClickType";
        stringArray7[1] = "Type";
        stringArray7[2] = "Hand";
        wE2.f$b = new ka<Vf>(Vf.f$M, stringArray7);
        String[] stringArray8 = new String[4];
        stringArray8[0] = "TeamProtect";
        stringArray8[1] = "TeamKill";
        stringArray8[2] = "AttackTeam";
        stringArray8[3] = "teamdamage";
        wE2.f$j = new z<Boolean>(true, stringArray8);
        String[] stringArray9 = new String[1];
        stringArray9[0] = "NoSpread";
        wE2.f$i = new z<Boolean>(true, stringArray9);
        String[] stringArray10 = new String[5];
        stringArray10[0] = "RCS";
        stringArray10[1] = "RecoilControlSystem";
        stringArray10[2] = "Recoil";
        stringArray10[3] = "RecoilControl";
        stringArray10[4] = "RC";
        wE2.f$M = new z<Boolean>(false, stringArray10);
        String[] stringArray11 = new String[3];
        stringArray11[0] = "SilentAim";
        stringArray11[1] = "Silent";
        stringArray11[2] = "Sailent";
        wE2.f$g = new z<Boolean>(true, stringArray11);
        String[] stringArray12 = new String[4];
        stringArray12[0] = "AutoShoot";
        stringArray12[1] = "AS";
        stringArray12[2] = "Autofire";
        stringArray12[3] = "Autoshot";
        wE2.f$d = new z<Boolean>(true, stringArray12);
        wE2.f$B = new HashMap<EntityPlayer, List<Vec3d>>();
        wE2.f$E(wE2.f$i, wE2.f$M, wE2.f$d, wE2.f$g, wE2.f$b, wE2.f$a, wE2.f$C, wE2.f$K, wE2.f$e, wE2.f$I, wE2.f$j);
        wE2.f$E(new hE(wE2), new pf(wE2));
    }

    public static int f$a(wE wE2) {
        return wE2.f$L;
    }

    public boolean f$E(EntityPlayer entityPlayer, EntityPlayer entityPlayer2) {
        if (entityPlayer.getDisplayName().getFormattedText().contains(new StringBuilder().insert(0, "\u00a7").append(0.f$E((Entity)entityPlayer)).toString())) {
            if (entityPlayer2.getDisplayName().getFormattedText().contains(new StringBuilder().insert(0, "\u00a7").append(0.f$E((Entity)entityPlayer)).toString())) {
                return true;
            }
        }
        return false;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static double f$E(wE wE2, EntityPlayer entityPlayer) {
        return wE2.f$E(entityPlayer);
    }

    public static ka f$E(wE wE2) {
        return wE2.f$K;
    }

    public static z f$e(wE wE2) {
        return wE2.f$g;
    }

    public static Map f$E(wE wE2) {
        return wE2.f$B;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static s f$B(wE wE2) {
        return wE2.f$C;
    }

    public static int f$B(wE wE2) {
        return wE2.f$l;
    }

    public static int f$e(wE wE2) {
        return ++wE2.f$L;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static EntityPlayer f$E(wE wE2) {
        return wE2.f$c;
    }

    public static s f$a(wE wE2) {
        return wE2.f$e;
    }

    public static int f$K(wE wE2) {
        return wE2.f$A;
    }

    public static Minecraft f$j() {
        return f$d;
    }
}
 */
