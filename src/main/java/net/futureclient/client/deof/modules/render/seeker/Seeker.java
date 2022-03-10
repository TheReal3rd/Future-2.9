package net.futureclient.client.deof.modules.render.seeker;

public class Seeker {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.OB;
import net.futureclient.client.Pg;
import net.futureclient.client.Sc;
import net.futureclient.client.Uh;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;

public class vB
extends Ba {
    private s f$d;
    private z<Boolean> f$M;
    private z<Boolean> f$i;
    private z<Boolean> f$g;

    private String f$E(EntityAnimal object) {
        double d;
        double d2 = Math.ceil(object.func_110143_aJ());
        object = d > 18.0 ? "\u00a7a" : (d2 > 16.0 ? "\u00a72" : (d2 > 12.0 ? "\u00a7e" : (d2 > 8.0 ? "\u00a76" : (d2 > 5.0 ? "\u00a7c" : "\u00a74"))));
        return new StringBuilder().insert(0, (String)object).append(d2 > 0.0 ? Integer.valueOf((int)d2) : "dead").toString();
    }

    private boolean f$E(EntityAnimal entityAnimal) {
        return entityAnimal != null && Pg.f$E((Entity)entityAnimal) && entityAnimal.func_110138_aP() == 20.0f;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static String f$E(vB vB2, EntityAnimal entityAnimal) {
        return vB2.f$E(entityAnimal);
    }

    private void f$a(Entity entity, String string, double d, double 022, double d2, float f2) {
        Entity entity2;
        double d3 = 022;
        d3 += entity.isSneaking() ? 0.5 : 0.7;
        Entity entity3 = entity = f$d.getRenderViewEntity() == null ? ((Minecraft)vB.f$d).player : f$d.getRenderViewEntity();
        double d4 = entity3.posX;
        double d5 = entity3.posY;
        double d6 = entity3.posZ;
        Object f2 = Uh.f$E(entity3);
        entity3.posX = f2.x;
        entity3.posY = f2.y;
        entity3.posZ = f2.z;
        f2 = (gF)kH.f$E().f$E().f$E(gF.class);
        double 022 = entity.getDistance(d + vB.f$d.getRenderManager().viewerPosX, 022 + vB.f$d.getRenderManager().viewerPosY, d2 + vB.f$d.getRenderManager().viewerPosZ);
        int n = ((Minecraft)vB.f$d).fontRenderer.getStringWidth(string) / 2;
        int n2 = f2.f$L.f$E(string) / 2;
        OB oB = (OB)kH.f$E().f$E().f$E(OB.class);
        double d7 = 0.0018 + (double)(oB == null ? 0.003f : oB.f$d.f$E().floatValue()) * 022;
        if (022 <= 8.0) {
            d7 = 0.0245;
        }
        GlStateManager.pushMatrix();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)-1500000.0f);
        GlStateManager.disableLighting();
        GlStateManager.translate((float)((float)d), (float)((float)d3 + 1.4f), (float)((float)d2));
        GlStateManager.rotate((float)(-vB.f$d.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)vB.f$d.getRenderManager().playerViewX, (float)(vB.f$d.gameSettings.thirdPersonView == 2 ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((double)(-d7), (double)(-d7), (double)d7);
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        if (f2.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            Uh.f$E((float)(-n2 - 1), (float)(-f2.f$L.f$E()), (float)(n2 + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            entity2 = entity;
            f2.f$L.f$E(string, (double)(-n2), (double)(-(f2.f$L.f$E() - 1)), -1);
        } else {
            GlStateManager.enableBlend();
            Uh.f$E((float)(-n - 1), (float)(-vB.f$d.fontRenderer.FONT_HEIGHT), (float)(n + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            ((Minecraft)vB.f$d).fontRenderer.drawStringWithShadow(string, (float)(-n), (float)(-(vB.f$d.fontRenderer.FONT_HEIGHT - 1)), -1);
            entity2 = entity;
        }
        entity2.posX = d4;
        Entity entity4 = entity;
        entity4.posY = d5;
        entity4.posZ = d6;
        GlStateManager.enableDepth();
        GlStateManager.enableLighting();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.disablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)1500000.0f);
        GlStateManager.popMatrix();
    }

    public static s f$E(vB vB2) {
        return vB2.f$d;
    }

    public static void f$E(vB vB2, Entity entity, String string, double d, double d2, double d3, float f) {
        vB2.f$E(entity, string, d, d2, d3, f);
    }

    public vB() {
        vB vB2;
        String[] stringArray = new String[3];
        stringArray[0] = "Seeker";
        stringArray[1] = "seek";
        stringArray[2] = "hide";
        super("Seeker", stringArray, true, -7285564, JD.f$i);
        vB vB3 = vB2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "BoundingBox";
        stringArray2[1] = "Bound";
        vB3.f$i = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Tracers";
        stringArray3[1] = "Tracer";
        vB2.f$M = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Fill";
        stringArray4[1] = "filling";
        stringArray4[2] = "fillings";
        vB2.f$g = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[4];
        stringArray5[0] = "Width";
        stringArray5[1] = "With";
        stringArray5[2] = "Radius";
        stringArray5[3] = "raidus";
        vB2.f$d = new s((Number)Float.valueOf(0.6f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(10.0f), 0.1, stringArray5);
        vB2.f$E(vB2.f$i, vB2.f$g, vB2.f$M, vB2.f$d);
        vB2.f$E(new Sc(vB2));
    }

    public static z f$e(vB vB2) {
        return vB2.f$i;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static z f$a(vB vB2) {
        return vB2.f$g;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static boolean f$E(vB vB2, EntityAnimal entityAnimal) {
        return vB2.f$E(entityAnimal);
    }

    public static void f$a(vB vB2, Entity entity, String string, double d, double d2, double d3, float f) {
        vB2.f$a(entity, string, d, d2, d3, f);
    }

    public static Minecraft f$E() {
        return f$d;
    }

    private void f$E(Entity entity, String string2, double 032, double 022, double d, float f2) {
        Entity entity2;
        double d2 = 022;
        d2 += entity.isSneaking() ? 0.5 : 0.7;
        Entity entity3 = entity = f$d.getRenderViewEntity() == null ? ((Minecraft)vB.f$d).player : f$d.getRenderViewEntity();
        double d3 = entity3.posX;
        double d4 = entity3.posY;
        double d5 = entity3.posZ;
        Object f2 = Uh.f$E(entity3);
        entity3.posX = f2.x;
        entity3.posY = f2.y;
        entity3.posZ = f2.z;
        double 022 = entity3.getDistance(032 + vB.f$d.getRenderManager().viewerPosX, 022 + vB.f$d.getRenderManager().viewerPosY, d + vB.f$d.getRenderManager().viewerPosZ);
        f2 = (OB)kH.f$E().f$E().f$E(OB.class);
        double d6 = 0.0018 + (double)(f2 == null ? 0.003f : f2.f$d.f$E().floatValue()) * 022;
        if (022 <= 8.0) {
            d6 = 0.0245;
        }
        GlStateManager.pushMatrix();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)-1500000.0f);
        GlStateManager.disableLighting();
        GlStateManager.translate((float)((float)032), (float)((float)d2 + 1.4f), (float)((float)d));
        GlStateManager.rotate((float)(-vB.f$d.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)vB.f$d.getRenderManager().playerViewX, (float)(vB.f$d.gameSettings.thirdPersonView == 2 ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((double)(-d6), (double)(-d6), (double)d6);
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        f2 = (gF)kH.f$E().f$E().f$E(gF.class);
        if (f2 != null && f2.f$c.f$E().booleanValue()) {
            entity2 = entity;
            int 032 = f2.f$L.f$E(string2) / 2;
            GlStateManager.enableBlend();
            Object object = f2;
            Uh.f$E((float)(-032 - 1), (float)(-object.f$L.f$E()), (float)(032 + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            object.f$L.f$E(string2, (double)(-032), (double)(-(f2.f$L.f$E() - 1)), -1);
        } else {
            String string2;
            int 032 = ((Minecraft)vB.f$d).fontRenderer.getStringWidth(string2) / 2;
            GlStateManager.enableBlend();
            Uh.f$E((float)(-032 - 1), (float)(-vB.f$d.fontRenderer.FONT_HEIGHT), (float)(032 + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            ((Minecraft)vB.f$d).fontRenderer.drawStringWithShadow(string2, (float)(-032), (float)(-(vB.f$d.fontRenderer.FONT_HEIGHT - 1)), -1);
            entity2 = entity;
        }
        entity2.posX = d3;
        Entity entity4 = entity;
        entity4.posY = d4;
        entity4.posZ = d5;
        GlStateManager.enableDepth();
        GlStateManager.enableLighting();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.disablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)1500000.0f);
        GlStateManager.popMatrix();
    }

    public static z f$E(vB vB2) {
        return vB2.f$M;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
 */