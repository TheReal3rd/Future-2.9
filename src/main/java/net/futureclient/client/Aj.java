package net.futureclient.client;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.futureclient.client.lH;

public class Aj
implements JsonDeserializer<Map<String, String>> {
    public Map<String, String> f$E(JsonElement jsonElement, Type object, JsonDeserializationContext object2) {
        object = new HashMap();
        object2 = jsonElement.getAsJsonArray().iterator();
        while (object2.hasNext()) {
            Iterator iterator = ((JsonElement)object2.next()).getAsJsonObject().entrySet().iterator();
            if (!iterator.hasNext()) continue;
            iterator = (Map.Entry)iterator.next();
            object.put(iterator.getKey(), ((JsonElement)iterator.getValue()).getAsString());
        }
        return object;
    }

    public Aj(lH lH2) {
        0();
    }

    private Aj() {
        Aj aj;
    }
}
package net.futureclient.client;

import java.awt.Color;
import java.awt.Point;
import net.futureclient.client.Uh;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class aj {
    public static float f$d;

    public static Point f$E() {
        int n;
        Minecraft minecraft = Minecraft.getMinecraft();
        int n2 = minecraft.gameSettings.guiScale;
        if (n2 == 0) {
            n2 = 1000;
        }
        int n3 = n = 0;
        while (n3 < n2 && minecraft.displayWidth / (n + 1) >= 320 && minecraft.displayHeight / (n + 1) >= 240) {
            n3 = ++n;
        }
        return new Point(Mouse.getX() / n, minecraft.displayHeight / n - Mouse.getY() / n - 1);
    }

    public static void f$E(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public static void f$E(int n, int n2, double d3, double d2, int n32) {
        int n32;
        double d3;
        int n4;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2884);
        GL11.glBlendFunc((int)770, (int)771);
        double d4 = Math.PI * 2 / (double)n32 / 4.0;
        double d5 = d3 - 0.5;
        double d6 = d3 + 0.5;
        GL11.glBegin((int)8);
        int n5 = n4 = 0;
        while (n5 <= n32) {
            d3 = (double)n4 * 2.0 * Math.PI / (double)n32;
            GL11.glVertex2d((double)(d2 * Math.cos(d3) + (double)n), (double)(d2 * Math.sin(d3) + (double)n2));
            GL11.glVertex2d((double)(d5 * Math.cos(d3) + (double)n), (double)(d5 * Math.sin(d3) + (double)n2));
            GL11.glVertex2d((double)(d2 * Math.cos(d3) + (double)n), (double)(d2 * Math.sin(d3) + (double)n2));
            GL11.glVertex2d((double)(d5 * Math.cos(d3 + 3.0 * d4) + (double)n), (double)(d5 * Math.sin(d3 + 3.0 * d4) + (double)n2));
            n5 = ++n4;
        }
        GL11.glEnd();
        GL11.glBegin((int)7);
        d4 = Math.PI * 2 / (double)n32 / 4.0;
        int n6 = n4 = 0;
        while (n6 < n32) {
            d3 = (double)n4 * 2.0 * Math.PI / (double)n32;
            GL11.glVertex2d((double)(d5 * Math.cos(d3) + (double)n), (double)(d5 * Math.sin(d3) + (double)n2));
            GL11.glVertex2d((double)(d6 * Math.cos(d3 + d4) + (double)n), (double)(d6 * Math.sin(d3 + d4) + (double)n2));
            GL11.glVertex2d((double)(d6 * Math.cos(d3 + 2.0 * d4) + (double)n), (double)(d6 * Math.sin(d3 + 2.0 * d4) + (double)n2));
            GL11.glVertex2d((double)(d5 * Math.cos(d3 + 3.0 * d4) + (double)n), (double)(d5 * Math.sin(d3 + 3.0 * d4) + (double)n2));
            n6 = ++n4;
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2884);
    }

    public static void f$E(double d, double d2, double d3, double d4, int n2) {
        float f = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float n2 = (float)(n2 & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)f2, (float)f3, (float)n2, (float)f);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    public aj() {
        aj aj2;
    }

    public static void f$E(AxisAlignedBB axisAlignedBB, Color color) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        aj.f$E(axisAlignedBB);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void f$E(float f, float f2, ResourceLocation resourceLocation) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation);
        GlStateManager.enableBlend();
        GL11.glEnable((int)2848);
        GlStateManager.enableRescaleNormal();
        GlStateManager.enableAlpha();
        GlStateManager.alphaFunc((int)516, (float)0.1f);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc((int)770, (int)771);
        GL11.glTranslatef((float)f, (float)f2, (float)0.0f);
        aj.f$E(0, 0, 0.0f, 0.0f, 12, 12, 12, 12, 12.0f, 12.0f);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableLighting();
        GlStateManager.disableRescaleNormal();
        GL11.glDisable((int)2848);
        GlStateManager.disableBlend();
        GL11.glPopMatrix();
    }

    public static String f$E(String string) {
        return new StringBuilder().insert(0, String.valueOf(Character.toUpperCase(string.charAt(0)))).append(string.substring(1)).toString();
    }

    public static void f$E(AxisAlignedBB axisAlignedBB) {
        if (axisAlignedBB == null) {
            return;
        }
        GL11.glBegin((int)7);
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB3 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB4 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB5 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB6 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB7 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB8 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB9 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB10 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB11 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB12 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB13 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB13.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB14 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB13.minX, (double)axisAlignedBB14.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB14.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB13.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB13.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB13.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB12.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB12.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB12.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB15 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB11.maxX, (double)axisAlignedBB15.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB15.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB11.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB11.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB11.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB11.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB10.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB10.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB10.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB9.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB9.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB9.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB16 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB8.maxX, (double)axisAlignedBB16.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB16.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB8.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB8.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB8.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB7.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB7.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB7.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB17 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB6.maxX, (double)axisAlignedBB17.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB17.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB6.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB6.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB6.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB5.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB5.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB5.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB18 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB4.minX, (double)axisAlignedBB18.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB18.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB4.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB4.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB4.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB3.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB3.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB3.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        AxisAlignedBB axisAlignedBB19 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB19.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB19.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
    }

    public static void f$E(double d, double d2, double d3, double d4, float f, int n, int n22) {
        aj.f$E(d, d2, d3, d4, n22);
        float n22 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        n = (float)(n & 0xFF) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)f2, (float)f3, (float)n, (float)n22);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
    }

    public static void f$E(AxisAlignedBB axisAlignedBB, float f, Color color) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)f);
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        Uh.f$K(axisAlignedBB);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void f$E(int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, float f3, float f4) {
        Gui.drawScaledCustomSizeModalRect((int)n, (int)n2, (float)f, (float)f2, (int)n3, (int)n4, (int)n5, (int)n6, (float)f3, (float)f4);
    }

    public static void f$E(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Color color) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        aj.f$E(color);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)f7, (double)f8);
        GL11.glVertex2d((double)f5, (double)f6);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glVertex2d((double)f5, (double)f6);
        GL11.glVertex2d((double)f7, (double)f8);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    public static void f$E(float f, float f2, ResourceLocation resourceLocation, int n, int n2) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation);
        GlStateManager.enableBlend();
        GL11.glEnable((int)2848);
        GlStateManager.enableRescaleNormal();
        GlStateManager.enableAlpha();
        GlStateManager.alphaFunc((int)516, (float)0.1f);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc((int)770, (int)771);
        GL11.glTranslatef((float)f, (float)f2, (float)0.0f);
        int n3 = n;
        int n4 = n2;
        aj.f$E(0, 0, 0.0f, 0.0f, n3, n2, n3, n4, n, n4);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableLighting();
        GlStateManager.disableRescaleNormal();
        GL11.glDisable((int)2848);
        GlStateManager.disableBlend();
    }

    static {
        f$d = 0.0f;
    }

    public static int f$E(String string, int n, int n2, int n3) {
        return Minecraft.getMinecraft().fontRenderer.drawString(string, (float)n, (float)n2, n3, false);
    }
}
