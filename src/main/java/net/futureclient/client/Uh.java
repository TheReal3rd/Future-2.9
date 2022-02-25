package net.futureclient.client;

import java.awt.Color;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import net.futureclient.client.K;
import net.futureclient.client.Y;
import net.futureclient.client.aj;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.GL11;

public class Uh {
    private static ScaledResolution f$d;
    private static final Minecraft f$g;

    public Uh() {
        Uh uh;
    }

    static {
        f$g = Minecraft.getMinecraft();
        f$d = new ScaledResolution(f$g);
    }

    public static void f$K() {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
    }

    public static void f$K(AxisAlignedBB axisAlignedBB) {
        if (axisAlignedBB == null) {
            return;
        }
        GL11.glBegin((int)3);
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB3 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB4 = axisAlignedBB;
        AxisAlignedBB axisAlignedBB5 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB5.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB6 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB5.maxX, (double)axisAlignedBB6.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB6.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB4.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB4.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glEnd();
        GL11.glBegin((int)3);
        GL11.glVertex3d((double)axisAlignedBB4.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB7 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB4.maxX, (double)axisAlignedBB7.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB7.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB3.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB3.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)axisAlignedBB3.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB8 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB8.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB8.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
    }

    public static void f$e() {
        GL11.glEnable((int)2896);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glDepthMask((boolean)true);
        GL11.glCullFace((int)1029);
        GL11.glPopMatrix();
        GL11.glPopAttrib();
    }

    public static void f$e(float f, float f2, float f3, float f4, int n, int n2) {
        Uh.f$K();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        Uh.f$E(f *= 2.0f, (f2 *= 2.0f) + 1.0f, (f4 *= 2.0f) - 2.0f, n);
        Uh.f$E((f3 *= 2.0f) - 1.0f, f2 + 1.0f, f4 - 2.0f, n);
        Uh.f$a(f + 2.0f, f3 - 3.0f, f2, n);
        Uh.f$a(f + 2.0f, f3 - 3.0f, f4 - 1.0f, n);
        Uh.f$a(f + 1.0f, f + 1.0f, f2 + 1.0f, n);
        Uh.f$a(f3 - 2.0f, f3 - 2.0f, f2 + 1.0f, n);
        Uh.f$a(f3 - 2.0f, f3 - 2.0f, f4 - 2.0f, n);
        Uh.f$a(f + 1.0f, f + 1.0f, f4 - 2.0f, n);
        Uh.f$E(f + 1.0f, f2 + 1.0f, f3 - 1.0f, f4 - 1.0f, n2);
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        Uh.f$a();
    }

    public static void f$e(AxisAlignedBB axisAlignedBB) {
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
        AxisAlignedBB axisAlignedBB14 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB.minX, (double)axisAlignedBB14.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB14.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB13.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB13.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB13.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        AxisAlignedBB axisAlignedBB15 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB13.minX, (double)axisAlignedBB15.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB15.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB12.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB12.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB12.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB11.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB11.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB11.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        AxisAlignedBB axisAlignedBB16 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB11.minX, (double)axisAlignedBB16.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB16.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB10.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB10.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB10.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB9.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB9.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB9.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB17 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB9.maxX, (double)axisAlignedBB17.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB17.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB8.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB8.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB8.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB7.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB7.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB7.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB18 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB7.minX, (double)axisAlignedBB18.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB18.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB6.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB6.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB6.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB5.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB5.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB5.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB19 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB5.minX, (double)axisAlignedBB19.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB19.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB4.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB4.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB4.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB3.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB3.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)axisAlignedBB3.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        AxisAlignedBB axisAlignedBB20 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB20.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB20.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
    }

    public static void f$a(float f5, float f2, float f32, int n) {
        float f32;
        if (f2 < f5) {
            float f4 = f5;
            float f5 = f2;
            f2 = f4;
        }
        float f6 = f32;
        Uh.f$E(f5, f6, f2 + 1.0f, f6 + 1.0f, n);
    }

    public static void f$a(AxisAlignedBB axisAlignedBB) {
        BufferBuilder bufferBuilder;
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder2 = bufferBuilder = Tessellator.getInstance().getBuffer();
        bufferBuilder2.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        bufferBuilder2.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
        bufferBuilder.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ);
        tessellator.draw();
    }

    public static void f$a(float f, float f2, float f3, float f4, int n, int n2) {
        Uh.f$K();
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        Uh.f$E(n);
        GL11.glVertex2f((float)f, (float)f4);
        GL11.glVertex2f((float)f3, (float)f4);
        Uh.f$E(n2);
        GL11.glVertex2f((float)f3, (float)f2);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        Uh.f$a();
    }

    public static void f$a(float f, float f2, float f3, float f4, float f5, int n, int n2) {
        Uh.f$K();
        Uh.f$E(n);
        Uh.f$a(f + f5, f2 + f5, f3 - f5, f4 - f5);
        Uh.f$E(n2);
        float f6 = f2;
        Uh.f$a(f + f5, f6, f3 - f5, f6 + f5);
        float f7 = f;
        Uh.f$a(f7, f2, f7 + f5, f4);
        Uh.f$a(f3 - f5, f2, f3, f4);
        Uh.f$a(f + f5, f4 - f5, f3 - f5, f4);
        Uh.f$a();
    }

    public static void f$a() {
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glHint((int)3155, (int)4352);
    }

    public static void f$a(float f, float f2, float f3, float f4) {
        GL11.glBegin((int)7);
        GL11.glVertex2f((float)f, (float)f4);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glVertex2f((float)f3, (float)f2);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glEnd();
    }

    public static void f$a(float f5, float f2, float f32, int n, int n2) {
        float f32;
        if (f2 < f5) {
            float f4 = f5;
            float f5 = f2;
            f2 = f4;
        }
        float f6 = f32;
        Uh.f$a(f5, f6, f2 + 1.0f, f6 + 1.0f, n, n2);
    }

    public static void f$a(Color color) {
        GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
    }

    public static Vec3d f$E(Entity entity, double d, double d2, double d3) {
        return new Vec3d((entity.posX - entity.lastTickPosX) * d, (entity.posY - entity.lastTickPosY) * d2, (entity.posZ - entity.lastTickPosZ) * d3);
    }

    public static void f$E(Rectangle rectangle, int n) {
        Rectangle rectangle2 = rectangle;
        Rectangle rectangle3 = rectangle;
        Uh.f$E((float)rectangle.x, (float)rectangle.y, (float)(rectangle2.x + rectangle2.width), (float)(rectangle3.y + rectangle3.height), n);
    }

    public static Color f$E(Color color, Color color2, float f) {
        float f2 = 1.0f - f;
        float[] fArray = new float[3];
        float[] fArray2 = new float[3];
        color.getColorComponents(fArray);
        color2.getColorComponents(fArray2);
        return new Color(fArray[0] * f + fArray2[0] * f2, fArray[1] * f + fArray2[1] * f2, fArray[2] * f + fArray2[2] * f2);
    }

    public static void f$E(float f, float f2, float f3, float f4, float f5, int n, int n2, int n3) {
        Uh.f$K();
        Uh.f$a(f, f2, f3, f4, n3, n2);
        Uh.f$E(n);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)3);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glVertex2f((float)f, (float)f4);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glVertex2f((float)f3, (float)f2);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        Uh.f$a();
    }

    public static Vec3d f$E(Entity entity, Vec3d vec3d) {
        return Uh.f$E(entity, vec3d.x, vec3d.y, vec3d.z);
    }

    public static void f$E(Rectangle rectangle, float f, int n, int n2) {
        Rectangle rectangle2 = rectangle;
        float f2 = rectangle2.x;
        float f3 = rectangle2.y;
        float f4 = rectangle2.x + rectangle.width;
        float f5 = rectangle2.y + rectangle.height;
        Uh.f$K();
        Uh.f$E(n);
        Uh.f$a(f2 + f, f3 + f, f4 - f, f5 - f);
        Uh.f$E(n2);
        float f6 = f3;
        Uh.f$a(f2 + 1.0f, f6, f4 - 1.0f, f6 + f);
        float f7 = f2;
        Uh.f$a(f7, f3, f7 + f, f5);
        Uh.f$a(f4 - f, f3, f4, f5);
        Uh.f$a(f2 + 1.0f, f5 - f, f4 - 1.0f, f5);
        Uh.f$a();
    }

    public static void f$E(float f, float f2, float f3, float f4, int n, int n2) {
        Uh.f$K();
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        Uh.f$E(n);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glVertex2f((float)f, (float)f4);
        Uh.f$E(n2);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glVertex2f((float)f3, (float)f2);
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        Uh.f$a();
    }

    public static Vec3d f$E(Entity entity, double d) {
        double d2 = d;
        return Uh.f$E(entity, d2, d2, d2);
    }

    public static void f$E(double d, double d2, double d3, double d4, double d5, double d6, float f, int n, int n22) {
        Uh.f$E(d, d2, d3, d4, d5, d6, n22);
        float n22 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        n = (float)(n & 0xFF) / 255.0f;
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.blendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GlStateManager.pushMatrix();
        GlStateManager.color((float)f2, (float)f3, (float)n, (float)n22);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d5, (double)d6);
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d5, (double)d6);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glEnd();
        GlStateManager.popMatrix();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
        GL11.glDisable((int)2848);
    }

    public static void f$E(double d, double d2, double d3, double d4, double d5, double d6, int n2) {
        Tessellator tessellator;
        float f = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n2 & 0xFF) / 255.0f;
        float n2 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        GlStateManager.pushMatrix();
        Tessellator tessellator2 = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator2.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.color((float)f, (float)f2, (float)f3, (float)n2);
        bufferBuilder.begin(6, DefaultVertexFormats.POSITION_TEX_COLOR);
        if ((d2 <= d4 || d >= d5) && (d2 >= d4 || d <= d5)) {
            bufferBuilder.pos(d, d2, 0.0);
            bufferBuilder.pos(d3, d4, 0.0);
            bufferBuilder.pos(d5, d6, 0.0);
            tessellator = tessellator2;
        } else {
            bufferBuilder.pos(d5, d6, 0.0);
            bufferBuilder.pos(d3, d4, 0.0);
            bufferBuilder.pos(d, d2, 0.0);
            tessellator = tessellator2;
        }
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public static void f$E(double d, double d2, double d3, double d4, int n2) {
        float f = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n2 & 0xFF) / 255.0f;
        float n2 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.color((float)f, (float)f2, (float)f3, (float)n2);
        BufferBuilder bufferBuilder2 = bufferBuilder;
        bufferBuilder2.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        bufferBuilder2.pos(d, d4, 0.0);
        bufferBuilder.pos(d3, d4, 0.0);
        bufferBuilder.pos(d3, d2, 0.0);
        bufferBuilder.pos(d, d2, 0.0);
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.disableBlend();
    }

    public static void f$E(double d, double d2, double d3, double d4, float f, int n, int n2, int n3) {
        Uh.f$K();
        GL11.glPushMatrix();
        Uh.f$E(n);
        GL11.glLineWidth((float)1.0f);
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
        Uh.f$E(d, d2, d3, d4, n2, n3);
        Uh.f$a();
    }

    public static void f$E(double d, double d2, double d3, double d4, int n, int n2) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glShadeModel((int)7425);
        GL11.glPushMatrix();
        GL11.glBegin((int)7);
        Uh.f$E(n);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glVertex2d((double)d, (double)d2);
        Uh.f$E(n2);
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glShadeModel((int)7424);
    }

    public static void f$E(float f, int n4, int n2, int n3) {
        float n4 = 0.003921569f * (float)n4;
        n2 = 0.003921569f * (float)n2;
        n3 = 0.003921569f * (float)n3;
        GL11.glColor4f((float)n4, (float)n2, (float)n3, (float)f);
    }

    public static void f$E(Entity entity, int n) {
        GL11.glPushMatrix();
        GL11.glTranslated((double)(entity.posX - ((K)f$g.getRenderManager()).getRenderPosX()), (double)(entity.posY - ((K)f$g.getRenderManager()).getRenderPosY() + (double)(entity.height / 2.0f)), (double)(entity.posZ - ((K)f$g.getRenderManager()).getRenderPosZ()));
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-Uh.f$g.player.field_70177_z), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)Uh.f$g.player.field_70125_A, (float)1.0f, (float)0.0f, (float)0.0f);
        Uh.f$g.entityRenderer.disableLightmap();
        GL11.glDisable((int)2929);
        float f = 0.2f;
        aj.f$E((double)(-entity.width), (double)(-entity.height + f * 3.0f), (double)entity.width, (double)(entity.height - f * 3.0f), 0x55000000 | n);
        GL11.glEnable((int)2929);
        Uh.f$g.entityRenderer.enableLightmap();
        GL11.glPopMatrix();
    }

    public static float[] f$E(int n) {
        float f = (float)(n >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        float f4 = (float)(n >> 24 & 0xFF) / 255.0f;
        return new float[]{f, f2, f3, f4};
    }

    public static String f$E(int n) {
        int n2;
        int n3 = n2;
        return ARBShaderObjects.glGetInfoLogARB((int)n3, (int)ARBShaderObjects.glGetObjectParameteriARB((int)n3, (int)35716));
    }

    public static void f$E(int n) {
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static Color f$E(long l, float f) {
        long l2 = Long.parseLong(Integer.toHexString(Color.HSBtoRGB((float)(System.nanoTime() + l) / 1.0E10f % 1.0f, 1.0f, 1.0f)), 16);
        Color color = new Color((int)l2);
        return new Color((float)color.getRed() / 255.0f * f, (float)color.getGreen() / 255.0f * f, (float)color.getBlue() / 255.0f * f, (float)color.getAlpha() / 255.0f);
    }

    public static void f$E(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public static void f$E(float f) {
        GL11.glDisable((int)3008);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)2884);
        Uh.f$g.entityRenderer.enableLightmap();
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
        GL11.glLineWidth((float)f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void f$E(int n, int n2, int n3, int n4, int n52) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        float f = (float)(n52 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n52 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n52 >> 8 & 0xFF) / 255.0f;
        float n52 = (float)(n52 & 0xFF) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)n52, (float)f);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glLineWidth((float)1.0f);
        GL11.glShadeModel((int)7425);
        switch (n3) {
            case 0: {
                GL11.glBegin((int)2);
                GL11.glVertex2d((double)n, (double)(n2 + n4));
                GL11.glVertex2d((double)(n + n4), (double)(n2 - n4));
                GL11.glVertex2d((double)(n - n4), (double)(n2 - n4));
                GL11.glEnd();
                GL11.glBegin((int)4);
                GL11.glVertex2d((double)n, (double)(n2 + n4));
                GL11.glVertex2d((double)(n + n4), (double)(n2 - n4));
                GL11.glVertex2d((double)(n - n4), (double)(n2 - n4));
                GL11.glEnd();
                break;
            }
            case 1: {
                GL11.glBegin((int)2);
                GL11.glVertex2d((double)n, (double)n2);
                GL11.glVertex2d((double)n, (double)(n2 + n4 / 2));
                GL11.glVertex2d((double)(n + n4 + n4 / 2), (double)n2);
                GL11.glEnd();
                GL11.glBegin((int)4);
                GL11.glVertex2d((double)n, (double)n2);
                GL11.glVertex2d((double)n, (double)(n2 + n4 / 2));
                GL11.glVertex2d((double)(n + n4 + n4 / 2), (double)n2);
                GL11.glEnd();
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                GL11.glBegin((int)2);
                GL11.glVertex2d((double)n, (double)n2);
                GL11.glVertex2d((double)((double)n + (double)n4 * 0.0), (double)(n2 - n4 / 2));
                GL11.glVertex2d((double)((double)n + (double)n4 * 0.0), (double)(n2 + n4 / 2));
                GL11.glEnd();
                GL11.glBegin((int)4);
                GL11.glVertex2d((double)((double)n + (double)n4 * 0.0), (double)(n2 - n4 / 2));
                GL11.glVertex2d((double)n, (double)n2);
                GL11.glVertex2d((double)((double)n + (double)n4 * 0.0), (double)(n2 + n4 / 2));
                GL11.glEnd();
                break;
            }
        }
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void f$E(float f, float f2, double d, Color color) {
        double d2;
        Uh.f$E(color);
        GlStateManager.enableAlpha();
        GlStateManager.enableBlend();
        GL11.glDisable((int)3553);
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager.alphaFunc((int)516, (float)0.001f);
        color = Tessellator.getInstance();
        BufferBuilder bufferBuilder = color.getBuffer();
        double d3 = d2 = 0.0;
        while (d3 < 0.0) {
            double d4 = d2 * 6.984873503E-315 / 0.0;
            double d5 = (d2 - 1.0) * 6.984873503E-315 / 0.0;
            double[] dArray = new double[]{Math.cos(d4) * d, -Math.sin(d4) * d, Math.cos(d5) * d, -Math.sin(d5) * d};
            BufferBuilder bufferBuilder2 = bufferBuilder;
            float f3 = f;
            bufferBuilder.begin(6, DefaultVertexFormats.POSITION_TEX);
            bufferBuilder.pos((double)f3 + dArray[2], (double)f2 + dArray[3], 0.0).endVertex();
            bufferBuilder2.pos((double)f3 + dArray[0], (double)f2 + dArray[1], 0.0).endVertex();
            bufferBuilder2.pos((double)f, (double)f2, 0.0).endVertex();
            color.draw();
            d3 = d2 + 1.0;
        }
        GlStateManager.disableBlend();
        GlStateManager.alphaFunc((int)516, (float)0.1f);
        GlStateManager.disableAlpha();
        GL11.glEnable((int)3553);
    }

    public static Vec3d f$E(Entity entity, float f) {
        return new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ).add(Uh.f$E(entity, (double)f));
    }

    public static void f$E(float f4, float f22, float f3, int n) {
        float f4;
        if (f3 < f22) {
            float f5 = f22;
            float f22 = f3;
            f3 = f5;
        }
        Uh.f$E(f4, f22 + 1.0f, f4 + 1.0f, f3, n);
    }

    public static void f$E(int n, int n2, double d, int n32) {
        d *= 0.0;
        n *= 2;
        n2 *= 2;
        float f = (float)(n32 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n32 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n32 >> 8 & 0xFF) / 255.0f;
        float n32 = (float)(n32 & 0xFF) / 255.0f;
        Uh.f$K();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        GL11.glColor4f((float)f2, (float)f3, (float)n32, (float)f);
        GL11.glBegin((int)6);
        int n4 = n32 = 0;
        while (n4 <= 360) {
            double d2 = Math.sin((double)n32 * 6.984873503E-315 / 0.0) * d;
            double d3 = Math.cos((double)n32 * 6.984873503E-315 / 0.0) * d;
            GL11.glVertex2d((double)((double)n + d2), (double)((double)n2 + d3));
            n4 = ++n32;
        }
        GL11.glEnd();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        Uh.f$a();
    }

    public static ScaledResolution f$E() {
        return f$d;
    }

    public static void f$E(float f, float f2, float f3, int n, int n22) {
        f *= 2.0f;
        f2 *= 2.0f;
        float f4 = (float)(n22 >> 24 & 0xFF) / 255.0f;
        float f5 = (float)(n22 >> 16 & 0xFF) / 255.0f;
        float f6 = (float)(n22 >> 8 & 0xFF) / 255.0f;
        float n22 = (float)(n22 & 0xFF) / 255.0f;
        float f7 = (float)(6.388667265E-315 / (double)n);
        float f8 = (float)Math.cos(f7);
        f7 = (float)Math.sin(f7);
        float f9 = f3 *= 2.0f;
        float f10 = 0.0f;
        Uh.f$K();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        GL11.glColor4f((float)f5, (float)f6, (float)n22, (float)f4);
        GL11.glBegin((int)2);
        int n3 = n22 = 0;
        while (n3 < n) {
            GL11.glVertex2f((float)(f9 + f), (float)(f10 + f2));
            f3 = f9;
            f9 = f8 * f9 - f7 * f10;
            f10 = f7 * f3 + f8 * f10;
            n3 = ++n22;
        }
        GL11.glEnd();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        Uh.f$a();
    }

    public static void f$E(float f, float f2, float f3, float f4, float f5) {
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)1);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glEnd();
        GL11.glEnable((int)3553);
    }

    public static void f$E(float f, float f2, float f3, float f4) {
        Uh.f$d = new ScaledResolution(Uh.f$g);
        int n = f$d.getScaleFactor();
        GL11.glScissor((int)((int)(f * (float)n)), (int)((int)(((float)f$d.getScaledHeight() - f4) * (float)n)), (int)((int)((f3 - f) * (float)n)), (int)((int)((f4 - f2) * (float)n)));
    }

    public static int f$E(String string, int n) throws Exception {
        int n2;
        block4: {
            n2 = 0;
            try {
                n2 = ARBShaderObjects.glCreateShaderObjectARB((int)n);
                if (n2 != 0) break block4;
                return 0;
            }
            catch (Exception exception) {
                ARBShaderObjects.glDeleteObjectARB((int)n2);
                throw exception;
            }
        }
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)string);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        if (ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)35713) == 0) {
            throw new RuntimeException(new StringBuilder().insert(0, "Error creating shader: ").append(Uh.f$E(n2)).toString());
        }
        return n2;
    }

    public static Vec3d f$E(Entity entity) {
        double d = Uh.f$E(entity.posX, entity.lastTickPosX) - ((K)f$g.getRenderManager()).getRenderPosX();
        double d2 = Uh.f$E(entity.posY, entity.lastTickPosY) - ((K)f$g.getRenderManager()).getRenderPosY();
        double d3 = Uh.f$E(entity.posZ, entity.lastTickPosZ) - ((K)f$g.getRenderManager()).getRenderPosZ();
        return new Vec3d(d, d2, d3);
    }

    public static void f$E(AxisAlignedBB axisAlignedBB) {
        BufferBuilder bufferBuilder;
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder2 = bufferBuilder = tessellator.getBuffer();
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        BufferBuilder bufferBuilder3 = bufferBuilder;
        bufferBuilder.begin(3, DefaultVertexFormats.POSITION);
        bufferBuilder3.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        bufferBuilder3.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        bufferBuilder.pos(axisAlignedBB2.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        bufferBuilder2.pos(axisAlignedBB2.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        bufferBuilder2.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        tessellator.draw();
        BufferBuilder bufferBuilder4 = bufferBuilder;
        AxisAlignedBB axisAlignedBB3 = axisAlignedBB;
        BufferBuilder bufferBuilder5 = bufferBuilder;
        bufferBuilder.begin(3, DefaultVertexFormats.POSITION);
        bufferBuilder5.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        bufferBuilder5.pos(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        bufferBuilder.pos(axisAlignedBB3.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        bufferBuilder4.pos(axisAlignedBB3.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        bufferBuilder4.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        tessellator.draw();
        BufferBuilder bufferBuilder6 = bufferBuilder;
        AxisAlignedBB axisAlignedBB4 = axisAlignedBB;
        BufferBuilder bufferBuilder7 = bufferBuilder;
        AxisAlignedBB axisAlignedBB5 = axisAlignedBB;
        BufferBuilder bufferBuilder8 = bufferBuilder;
        bufferBuilder.begin(1, DefaultVertexFormats.POSITION);
        bufferBuilder8.pos(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        bufferBuilder8.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        bufferBuilder.pos(axisAlignedBB5.maxX, axisAlignedBB.minY, axisAlignedBB.minZ).endVertex();
        bufferBuilder7.pos(axisAlignedBB5.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ).endVertex();
        bufferBuilder7.pos(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        bufferBuilder.pos(axisAlignedBB4.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        bufferBuilder6.pos(axisAlignedBB4.minX, axisAlignedBB.minY, axisAlignedBB.maxZ).endVertex();
        bufferBuilder6.pos(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ).endVertex();
        tessellator.draw();
    }

    public static int f$E(int n, int n2, int n3, ByteBuffer byteBuffer, boolean bl, boolean bl2) {
        GL11.glBindTexture((int)3553, (int)n);
        GL11.glTexParameteri((int)3553, (int)10241, (int)(bl ? 9729 : 9728));
        GL11.glTexParameteri((int)3553, (int)10240, (int)(bl ? 9729 : 9728));
        GL11.glTexParameteri((int)3553, (int)10242, (int)(bl2 ? 10497 : 10496));
        GL11.glTexParameteri((int)3553, (int)10243, (int)(bl2 ? 10497 : 10496));
        GL11.glPixelStorei((int)3317, (int)1);
        GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)n2, (int)n3, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
        return n;
    }

    public static void f$E(float f, float f2, float f3, float f4, int n) {
        Uh.f$K();
        Uh.f$E(n);
        Uh.f$a(f, f2, f3, f4);
        Uh.f$a();
    }

    public static void f$E(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Uh.f$K();
        GL11.glColor4f((float)f5, (float)f6, (float)f7, (float)f8);
        Uh.f$a(f, f2, f3, f4);
        Uh.f$a();
    }

    public static void f$E(int n, int n2, float f, double d, float f2, float f3, int n32) {
        float f4 = (float)(n32 >> 24 & 0xFF) / 255.0f;
        float f5 = (float)(n32 >> 16 & 0xFF) / 255.0f;
        float f6 = (float)(n32 >> 8 & 0xFF) / 255.0f;
        float n32 = (float)(n32 & 0xFF) / 255.0f;
        GL11.glPushMatrix();
        GL11.glTranslated((double)n, (double)n2, (double)0.0);
        GL11.glColor4f((float)f5, (float)f6, (float)n32, (float)f4);
        GL11.glLineWidth((float)f);
        if (d > 0.0) {
            GL11.glBegin((int)3);
            int n4 = n2 = 0;
            while ((double)n4 < d) {
                f = (float)((double)n2 * (d * 6.984873503E-315 / (double)f2));
                n32 = (float)(Math.cos(f) * (double)f3);
                f4 = (float)(Math.sin(f) * (double)f3);
                GL11.glVertex2f((float)n32, (float)f4);
                n4 = ++n2;
            }
            GL11.glEnd();
        }
        if (d < 0.0) {
            GL11.glBegin((int)3);
            int n5 = n2 = 0;
            while ((double)n5 > d) {
                f = (float)((double)n2 * (d * 6.984873503E-315 / (double)f2));
                n32 = (float)(Math.cos(f) * (double)(-f3));
                f4 = (float)(Math.sin(f) * (double)(-f3));
                GL11.glVertex2f((float)n32, (float)f4);
                n5 = --n2;
            }
            GL11.glEnd();
        }
        Uh.f$a();
        GL11.glDisable((int)3479);
        GL11.glPopMatrix();
    }

    public static double f$E(double d, double d2) {
        double d3 = d2;
        return d3 + (d - d3) * (double)((Y)Uh.f$g).getTimer().renderPartialTicks;
    }

    public static void f$E(float f, float f2, float f3, float f4, float f5, int n, int n2) {
        Uh.f$K();
        Uh.f$E(f, f2, f3, f4, n);
        Uh.f$E(n2);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)3);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glVertex2f((float)f, (float)f4);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glVertex2f((float)f3, (float)f2);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        Uh.f$a();
    }

    public static void f$B() {
        GL11.glPushAttrib((int)1048575);
        GL11.glPushMatrix();
        GL11.glDisable((int)3008);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4353);
        GL11.glDisable((int)2896);
    }

    public static void f$B(float f, float f2, float f3, float f4, int n, int n2) {
        Uh.f$K();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        Uh.f$E(f *= 2.0f, f2 *= 2.0f, (f4 *= 2.0f) - 1.0f, n2);
        Uh.f$E((f3 *= 2.0f) - 1.0f, f2, f4, n2);
        Uh.f$a(f, f3 - 1.0f, f2, n2);
        Uh.f$a(f, f3 - 2.0f, f4 - 1.0f, n2);
        Uh.f$E(f + 1.0f, f2 + 1.0f, f3 - 1.0f, f4 - 1.0f, n);
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        Uh.f$a();
    }

    public static void f$B(AxisAlignedBB axisAlignedBB) {
        GL11.glBegin((int)1);
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        AxisAlignedBB axisAlignedBB3 = axisAlignedBB;
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB3.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB3.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB.maxY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.minX, (double)axisAlignedBB.minY, (double)axisAlignedBB.minZ);
        GL11.glVertex3d((double)axisAlignedBB2.maxX, (double)axisAlignedBB.minY, (double)axisAlignedBB.maxZ);
        GL11.glEnd();
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.Ba;
import net.futureclient.client.GA;
import net.futureclient.client.J;
import net.futureclient.client.WB;
import net.futureclient.client.ZG;
import net.futureclient.client.gF;
import net.futureclient.client.kB;
import net.futureclient.client.kH;
import net.futureclient.client.lG;
import net.futureclient.client.ma;
import net.futureclient.client.z;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiNewChat;

public class uH
extends GA {
    public uH() {
        uH uH2;
        String[] stringArray = new String[4];
        stringArray[0] = "ShutDown";
        stringArray[1] = "unload";
        stringArray[2] = "SelfDestruct";
        stringArray[3] = "Unhook";
        super(stringArray);
    }

    @Override
    public String f$E(String[] guiNewChat2) {
        uH uH2;
        if (0.f$d.currentScreen instanceof GuiChat || 0.f$d.currentScreen instanceof WB) {
            0.f$d.displayGuiScreen(null);
        }
        kH.f$E().f$E().f$E().forEach(ib -> ib.f$a(new Object[0]));
        guiNewChat2 = (gF)kH.f$E().f$E().f$E(gF.class);
        if (guiNewChat2 != null) {
            guiNewChat2.f$b.cancel();
        }
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            Ba ba;
            if (ma2 instanceof J && (ba = (Ba)ma2).f$E()) {
                ba.f$E();
            }
        });
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E();
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            if (ma2 instanceof J) {
                ma2.f$a().forEach(z2 -> {
                    if (z2 != null) {
                        z2.f$E(null);
                    }
                });
                ma2.f$E().forEach(kB2 -> {
                    if (kB2 != null) {
                        kB2.f$E("");
                    }
                });
                ma ma3 = ma2;
                ma2.f$E("");
                ma3.f$a("");
                ma3.f$E(new String[]{""});
                ma ma4 = ma2;
                ma4.f$a(new ArrayList<z>());
                ma4.f$E(new ArrayList<kB>());
            }
        });
        kH.f$E().f$E().f$E().clear();
        lG.f$E().f$E(ZG.f$g);
        try {
            Thread.sleep(300L);
            Thread.sleep(300L);
            System.gc();
            System.runFinalization();
            System.gc();
            Thread.sleep(150L);
            System.gc();
            System.runFinalization();
            System.gc();
            Thread.sleep(300L);
            System.gc();
            System.runFinalization();
            uH2 = 0;
        }
        catch (Exception guiNewChat2) {
            uH2 = 0;
        }
        GuiNewChat guiNewChat2 = uH2.f$d.ingameGUI.getChatGUI();
        guiNewChat2.deleteChatLine(1337);
        guiNewChat2.getSentMessages().removeIf(string -> string.startsWith(kH.f$E().f$E().f$E()));
        return "";
    }

    @Override
    public String f$E() {
        return null;
    }
}
package net.futureclient.client;

import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import net.futureclient.client.SE;
import net.futureclient.client.bF;
import net.futureclient.client.kH;

public enum uh implements IBaritoneProcess
{
    f$M;

    private static final PathingCommand f$g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private uh() {
        uh uh2;
    }

    public double priority() {
        return 1.0;
    }

    public String displayName0() {
        return new StringBuilder().insert(0, kH.f$m).append(" Pause").toString();
    }

    public boolean isTemporary() {
        return true;
    }

    public void onLostControl() {
    }

    public PathingCommand onTick(boolean bl3, boolean bl2) {
        SE bl3 = new SE(bl3, bl2);
        kH.f$E().f$E().f$E(bl3);
        return f$g;
    }

    static {
        f$g = new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
    }

    public boolean isActive() {
        bF bF2 = new bF();
        kH.f$E().f$E().f$E(bF2);
        return bF2.f$E();
    }
}
