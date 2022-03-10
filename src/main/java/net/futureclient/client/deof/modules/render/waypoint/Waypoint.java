package net.futureclient.client.deof.modules.render.waypoint;

public class Waypoint {
}
/*
package net.futureclient.client;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.Fd;
import net.futureclient.client.JD;
import net.futureclient.client.KB;
import net.futureclient.client.LC;
import net.futureclient.client.Ld;
import net.futureclient.client.Mb;
import net.futureclient.client.Pd;
import net.futureclient.client.UA;
import net.futureclient.client.UB;
import net.futureclient.client.Uc;
import net.futureclient.client.Uh;
import net.futureclient.client.YA;
import net.futureclient.client.Yb;
import net.futureclient.client.eC;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.sc;
import net.futureclient.client.sd;
import net.futureclient.client.va;
import net.futureclient.client.wG;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.math.Vec3d;

public class yB
extends Ba {
    private va f$g;
    private z<Boolean> f$C;
    public List<va> f$i;
    private ka<KB> f$j;
    private s f$K;
    private z<Boolean> f$I;
    public List<va> f$M;
    private z<Boolean> f$e;
    private DecimalFormat f$d;
    private s f$b;

    public static Minecraft f$F() {
        return f$d;
    }

    public static va f$E(yB yB2, String string) {
        return yB2.f$E(string);
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$V() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public yB() {
        yB yB2;
        String[] stringArray = new String[5];
        stringArray[0] = "Waypoints";
        stringArray[1] = "points";
        stringArray[2] = "wp";
        stringArray[3] = "Waypoint";
        stringArray[4] = "wpoint";
        super("Waypoints", stringArray, false, -16742264, JD.f$i);
        yB yB3 = yB2;
        String[] stringArray2 = new String[5];
        stringArray2[0] = "DeathPoints";
        stringArray2[1] = "DeathPoint";
        stringArray2[2] = "DP";
        stringArray2[3] = "KillSpot";
        stringArray2[4] = "DiePoints";
        yB3.f$C = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[5];
        stringArray3[0] = "LogoutPoints";
        stringArray3[1] = "LogoutSpots";
        stringArray3[2] = "LoginSpots";
        stringArray3[3] = "LogPoints";
        stringArray3[4] = "LogSpts";
        yB2.f$e = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[5];
        stringArray4[0] = "Lines";
        stringArray4[1] = "Line";
        stringArray4[2] = "DrawLiens";
        stringArray4[3] = "DrawLiens";
        stringArray4[4] = "Liens";
        yB2.f$I = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[2];
        stringArray5[0] = "Width";
        stringArray5[1] = "w";
        yB2.f$K = new s((Number)Float.valueOf(1.8f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(5.0f), 0.1, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Scaling";
        stringArray6[1] = "scale";
        stringArray6[2] = "s";
        yB2.f$b = new s((Number)0.003, (Number)0.001, (Number)0.01, 0.001, stringArray6);
        String[] stringArray7 = new String[3];
        stringArray7[0] = "Mode";
        stringArray7[1] = "Type";
        stringArray7[2] = "Method";
        yB2.f$j = new ka<KB>(KB.f$M, stringArray7);
        yB2.f$i = new ArrayList<va>();
        yB2.f$M = new ArrayList<va>();
        yB2.f$d = new DecimalFormat("0.#");
        yB2.f$E(yB2.f$C, yB2.f$e, yB2.f$I, yB2.f$K, yB2.f$b, yB2.f$j);
        String[] stringArray8 = new String[5];
        stringArray8[0] = "Waypoints";
        stringArray8[1] = "points";
        stringArray8[2] = "wp";
        stringArray8[3] = "Waypoint";
        stringArray8[4] = "wpoint";
        kH.f$E().f$E().f$a(new Ld(yB2, stringArray8));
        String[] stringArray9 = new String[7];
        stringArray9[0] = "WaypointsAdd";
        stringArray9[1] = "waypointadd";
        stringArray9[2] = "pointadd";
        stringArray9[3] = "pointsadd";
        stringArray9[4] = "wpadd";
        stringArray9[5] = "wadd";
        stringArray9[6] = "padd";
        kH.f$E().f$E().f$a(new sd(yB2, stringArray9));
        String[] stringArray10 = new String[8];
        stringArray10[0] = "WaypointsRemove";
        stringArray10[1] = "waypointremove";
        stringArray10[2] = "pointremove";
        stringArray10[3] = "pointsremove";
        stringArray10[4] = "wpremove";
        stringArray10[5] = "wrem";
        stringArray10[6] = "wremove";
        stringArray10[7] = "premove";
        kH.f$E().f$E().f$a(new LC(yB2, stringArray10));
        String[] stringArray11 = new String[4];
        stringArray11[0] = "Destination";
        stringArray11[1] = "WaypointDestination";
        stringArray11[2] = "WaypointsDestination";
        stringArray11[3] = "Dest";
        kH.f$E().f$E().f$a(new sc(yB2, stringArray11));
        String[] stringArray12 = new String[7];
        stringArray12[0] = "RemoveDestination";
        stringArray12[1] = "DestinationRemove";
        stringArray12[2] = "RemoveDest";
        stringArray12[3] = "DRemove";
        stringArray12[4] = "DeleteDestination";
        stringArray12[5] = "DelDestination";
        stringArray12[6] = "DelDest";
        kH.f$E().f$E().f$a(new Yb(yB2, stringArray12));
        yB2.f$E(new eC(yB2), new UB(yB2), new Fd(yB2), new YA(yB2), new Mb(yB2), new Pd(yB2));
        new Uc(yB2, "waypoints.txt");
    }

    private void f$a(va object, double d, double d2, double d3, float f, double d4, double d5) {
        int n;
        int n2;
        int n3;
        Object object2 = f$d.getRenderViewEntity() == null ? ((Minecraft)yB.f$d).player : f$d.getRenderViewEntity();
        double d6 = object2.getDistance(d4, ((va)object).f$E(), d5);
        object2 = String.format("%s XYZ %.1f %.1f %.1f", ((va)object).f$E(), d4, ((va)object).f$E(), d5);
        yB yB2 = this;
        d4 = yB2.f$E(0.0018 + yB2.f$b.f$E().doubleValue() * d6, 0.1, this.f$b.f$E().doubleValue() * 100.0);
        GlStateManager.pushMatrix();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)-1500000.0f);
        GlStateManager.disableLighting();
        GlStateManager.translate((float)((float)d), (float)((float)d2 + 1.4f), (float)((float)d3));
        GlStateManager.rotate((float)(-yB.f$d.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)yB.f$d.getRenderManager().playerViewX, (float)(yB.f$d.gameSettings.thirdPersonView == 2 ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((double)(-d4), (double)(-d4), (double)d4);
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
        object = new StringBuilder().insert(0, ((va)object).f$E()).append(" ").append(Math.round(d6)).append("m").toString();
        if (gF2 != null && gF2.f$c.f$E().booleanValue()) {
            gF gF3 = gF2;
            n3 = gF3.f$L.f$E((String)object2) / 2;
            n2 = -gF3.f$L.f$E();
            n = gF3.f$L.f$E((String)object) / 2;
        } else {
            n3 = ((Minecraft)yB.f$d).fontRenderer.getStringWidth((String)object2) / 2;
            n2 = -yB.f$d.fontRenderer.FONT_HEIGHT;
            n = ((Minecraft)yB.f$d).fontRenderer.getStringWidth((String)object) / 2;
        }
        switch (UA.f$d[((KB)((Object)this.f$j.f$E())).ordinal()]) {
            case 1: {
                GlStateManager.enableBlend();
                while (false) {
                }
                Uh.f$E((float)(-n3 - 1), (float)n2, (float)n3 + 1.5f, 1.0f, 1.8f, 0x55000400, 0x33000000);
                GlStateManager.disableBlend();
                if (gF2 != null && gF2.f$c.f$E().booleanValue()) {
                    gF2.f$L.f$E((String)object2, (double)(-n3), (double)(-(gF2.f$L.f$E() - 1)), -5592406);
                    break;
                }
                ((Minecraft)yB.f$d).fontRenderer.drawStringWithShadow((String)object2, (float)(-n3), (float)(-(yB.f$d.fontRenderer.FONT_HEIGHT - 1)), -5592406);
                break;
            }
            case 2: {
                GlStateManager.enableBlend();
                Uh.f$E((float)(-n - 1), (float)n2, (float)n + 1.5f, 1.0f, 1.8f, 0x55000400, 0x33000000);
                GlStateManager.disableBlend();
                if (gF2 != null && gF2.f$c.f$E().booleanValue()) {
                    gF2.f$L.f$E((String)object, (double)(-n), (double)(-(gF2.f$L.f$E() - 1)), -5592406);
                    break;
                }
                ((Minecraft)yB.f$d).fontRenderer.drawStringWithShadow((String)object, (float)(-n), (float)(-(yB.f$d.fontRenderer.FONT_HEIGHT - 1)), -5592406);
            }
        }
        GlStateManager.enableDepth();
        GlStateManager.enableLighting();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.disablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)1500000.0f);
        GlStateManager.popMatrix();
    }

    public static z f$e(yB yB2) {
        return yB2.f$I;
    }

    private va f$E(String string) {
        for (va va2 : 0.f$i) {
            block3: {
                block4: {
                    if (!va2.f$E().equalsIgnoreCase(string)) continue;
                    if (va2.f$e().equals("singleplayer") && f$d.isSingleplayer()) break block3;
                    if (f$d.getCurrentServerData() == null) break block4;
                    if (va2.f$e().equalsIgnoreCase(yB.f$d.getCurrentServerData().serverIP.replaceAll(":", "_"))) break block3;
                }
                if (!f$d.isConnectedToRealms()) continue;
                if (!va2.f$e().equals("realms")) continue;
            }
            return va2;
        }
        return null;
    }

    public static Minecraft f$q() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    private float f$E(va va22) {
        va va3 = va22;
        float va22 = (float)(va3.f$a() - yB.f$d.player.field_70165_t);
        float f = (float)(va3.f$e() - yB.f$d.player.field_70161_v);
        float f2 = va22;
        float f3 = f;
        return wG.f$E(f2 * f2 + f3 * f3);
    }

    private double f$E(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    @Override
    public void f$B() {
        yB yB2;
        ArrayList<va> arrayList = new ArrayList<va>();
        for (va va2 : yB2.f$i) {
            if (va2 == null) continue;
            if (!va2.f$E().contains("_logout_spot")) continue;
            arrayList.add(va2);
        }
        yB2.f$i.removeAll(arrayList);
        super.f$B();
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public va f$E() {
        yB yB2;
        return yB2.f$g;
    }

    public static z f$E(yB yB2) {
        return yB2.f$e;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static float f$E(yB yB2, va va2) {
        return yB2.f$E(va2);
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static z f$a(yB yB2) {
        return yB2.f$C;
    }

    private void f$E(va va2, double d, double d2, double d3, float f, double d4, double d5) {
        Object object = f$d.getRenderViewEntity() == null ? ((Minecraft)yB.f$d).player : f$d.getRenderViewEntity();
        double d6 = object.getDistance(d + yB.f$d.getRenderManager().viewerPosX, d2 + yB.f$d.getRenderManager().viewerPosY, d3 + yB.f$d.getRenderManager().viewerPosZ);
        double d7 = 0.0018 + (double)this.f$b.f$E().floatValue() * d6;
        if (d6 <= 8.0) {
            d7 = 0.0245;
        }
        GlStateManager.pushMatrix();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)-1500000.0f);
        GlStateManager.disableLighting();
        GlStateManager.translate((float)((float)d), (float)((float)d2 + 1.4f), (float)((float)d3));
        GlStateManager.rotate((float)(-yB.f$d.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)yB.f$d.getRenderManager().playerViewX, (float)(yB.f$d.gameSettings.thirdPersonView == 2 ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((double)(-d7), (double)(-d7), (double)d7);
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        object = (gF)kH.f$E().f$E().f$E(gF.class);
        while (false) {
        }
        String string = String.format("%s XYZ %.1f %.1f %.1f", va2.f$E(), d4, va2.f$E(), d5);
        if (object.f$c.f$E().booleanValue()) {
            int n = object.f$L.f$E(string) / 2;
            GlStateManager.enableBlend();
            Object object2 = object;
            Uh.f$E((float)(-n - 1), (float)(-object2.f$L.f$E()), (float)(n + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            object2.f$L.f$E(string, (double)(-n), (double)(-(object.f$L.f$E() - 1)), -5592406);
        } else {
            int n = ((Minecraft)yB.f$d).fontRenderer.getStringWidth(string) / 2;
            Uh.f$E((float)(-n - 1), (float)(-yB.f$d.fontRenderer.FONT_HEIGHT), (float)(n + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            ((Minecraft)yB.f$d).fontRenderer.drawStringWithShadow(string, (float)(-n), (float)(-(yB.f$d.fontRenderer.FONT_HEIGHT - 1)), -5592406);
        }
        GlStateManager.enableDepth();
        GlStateManager.enableLighting();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.disablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)1500000.0f);
        GlStateManager.popMatrix();
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    public static s f$E(yB yB2) {
        return yB2.f$K;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public va f$a(String string) {
        for (va va2 : 0.f$i) {
            if (!va2.f$E().equalsIgnoreCase(string)) continue;
            return va2;
        }
        return null;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static va f$E(yB yB2, va va2) {
        yB2.f$g = va2;
        return yB2.f$g;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static void f$a(yB yB2, va va2, double d, double d2, double d3, float f, double d4, double d5) {
        yB2.f$a(va2, d, d2, d3, f, d4, d5);
    }

    public static void f$E(yB yB2, va va2, double d, double d2, double d3, float f, double d4, double d5) {
        yB2.f$E(va2, d, d2, d3, f, d4, d5);
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Vec3d f$E(yB yB2, double d, double d2, double d3) {
        return yB2.f$E(d, d2, d3);
    }

    private Vec3d f$E(double d, double d2, double d3) {
        EntityPlayerSP entityPlayerSP = f$d.getRenderViewEntity() == null ? ((Minecraft)yB.f$d).player : f$d.getRenderViewEntity();
        Vec3d vec3d = new Vec3d(entityPlayerSP.posX, entityPlayerSP.posY, entityPlayerSP.posZ);
        double d4 = entityPlayerSP.getDistance(d, d2, d3);
        Vec3d vec3d2 = vec3d;
        d = vec3d2.x - 150.0 * (vec3d.x - d) / d4;
        d2 = vec3d2.y - 150.0 * (vec3d.y - d2) / d4;
        d3 = vec3d2.z - 150.0 * (vec3d.z - d3) / d4;
        return new Vec3d(d, d2, d3);
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    private boolean f$E(va va2) {
        for (va va3 : 0.f$i) {
            if (!va3.f$e().equalsIgnoreCase(va2.f$e()) || va3.f$a() != va2.f$a() || va3.f$E() != va2.f$E() || va3.f$e() != va2.f$e() || !va3.f$a().equalsIgnoreCase(va2.f$a())) continue;
            return true;
        }
        return false;
    }

    public static va f$E(yB yB2) {
        return yB2.f$g;
    }

    public static DecimalFormat f$E(yB yB2) {
        return yB2.f$d;
    }

    public static boolean f$E(yB yB2, va va2) {
        return yB2.f$E(va2);
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$w() {
        return f$d;
    }
}
 */