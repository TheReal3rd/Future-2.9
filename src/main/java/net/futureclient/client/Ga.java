package net.futureclient.client;

import net.futureclient.client.Ca;
import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.KC;
import net.futureclient.client.kH;

public class Ga
extends Ha<Ee> {
    public final Ca f$d;

    @Override
    public void f$E(Ee ee) {
        KC kC = (KC)kH.f$E().f$E().f$E(KC.class);
        if (kC != null && !kC.f$E() && Ca.f$E().player.field_70122_E) {
            ee.f$a(true);
        }
    }

    public Ga(Ca ca) {
        0.f$d = ca;
    }
}
package net.futureclient.client;

import net.minecraft.client.Minecraft;

public abstract class GA {
    private String[] f$g;
    public Minecraft f$d;

    public String[] f$E() {
        GA gA;
        return gA.f$g;
    }

    public abstract String f$E();

    public GA(String[] stringArray) {
        0.f$d = Minecraft.getMinecraft();
        0.f$g = stringArray;
    }

    public abstract String f$E(String[] var1);

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).insert(0, stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 5 << 4 ^ 1 << 1;
        int n5 = (2 ^ 5) << 4 ^ 4 << 1;
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }
}
package net.futureclient.client;

import java.awt.Color;
import java.util.Iterator;
import net.futureclient.client.Ha;
import net.futureclient.client.Jd;
import net.futureclient.client.Pg;
import net.futureclient.client.Uh;
import net.futureclient.client.VB;
import net.futureclient.client.Wc;
import net.futureclient.client.YE;
import net.futureclient.client.i;
import net.futureclient.client.kH;
import net.futureclient.client.sE;
import net.futureclient.client.vH;
import net.futureclient.client.zA;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class gA
extends Ha<sE> {
    public final VB f$d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(sE sE2) {
        Iterator<Entity> iterator;
        if (!sE2.f$E().equals((Object)YE.f$g)) {
            return;
        }
        EntityPlayerSP entityPlayerSP = VB.f$h().getRenderViewEntity() == null ? VB.f$A().player : VB.f$K().getRenderViewEntity();
        Iterator<Entity> iterator2 = iterator = Pg.f$a().iterator();
        while (iterator2.hasNext()) {
            Color color;
            AxisAlignedBB axisAlignedBB;
            Entity entity = iterator.next();
            if (!VB.f$E(0.f$d, entity)) {
                iterator2 = iterator;
                continue;
            }
            Vec3d vec3d = Uh.f$E(entity);
            double d = vec3d.x;
            double d2 = vec3d.y;
            double d3 = vec3d.z;
            switch ((Jd)((Object)VB.f$a(0.f$d).f$E())) {
                case f$i: {
                    axisAlignedBB = new AxisAlignedBB(d - 0.25, d2 + (double)entity.height - 0.45, d3 - 0.25, d + 0.25, d2 + (double)entity.height + 0.055, d3 + 0.25);
                    break;
                }
                default: {
                    axisAlignedBB = new AxisAlignedBB(d - 0.4, d2, d3 - 0.4, d + 0.4, d2 + (double)entity.height + 0.18, d3 + 0.4);
                }
            }
            Uh.f$B();
            GlStateManager.enableAlpha();
            GlStateManager.enableBlend();
            GlStateManager.pushMatrix();
            GlStateManager.loadIdentity();
            if (kH.f$E().f$E().f$E(entity.getName())) {
                GL11.glColor4f((float)0.33333334f, (float)0.78431374f, (float)0.78431374f, (float)0.55f);
            } else {
                float f;
                float f2 = entityPlayerSP.getDistance(entity);
                if (f2 >= 60.0f) {
                    f = 120.0f;
                } else {
                    float f3 = f2;
                    f = f3 + f3;
                }
                color = new vH(f, 100.0f, 50.0f, 0.55f).f$E();
                GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
            }
            boolean bl = VB.f$B().gameSettings.viewBobbing;
            VB.f$e().gameSettings.viewBobbing = false;
            ((i)VB.f$a().entityRenderer).f$E(sE2.f$E());
            GL11.glLineWidth((float)VB.f$E(0.f$d).f$E().floatValue());
            color = new Vec3d(0.0, 0.0, 1.0).rotatePitch(-((float)Math.toRadians(entityPlayerSP.rotationPitch))).rotateYaw(-((float)Math.toRadians(entityPlayerSP.rotationYaw)));
            GL11.glBegin((int)1);
            zA zA2 = (zA)kH.f$E().f$E().f$E(zA.class);
            if (((Wc)((Object)VB.f$E(0.f$d).f$E())).equals((Object)Wc.f$j) && zA2 != null && !zA2.f$E()) {
                GL11.glVertex3d((double)d, (double)d2, (double)d3);
                GL11.glVertex3d((double)d, (double)((double)entityPlayerSP.getEyeHeight() + d2), (double)d3);
            }
            if (((Boolean)VB.f$E(0.f$d).f$E()).booleanValue()) {
                GL11.glVertex3d((double)((Vec3d)color).x, (double)((double)entityPlayerSP.getEyeHeight() + ((Vec3d)color).y), (double)((Vec3d)color).z);
                switch ((Jd)((Object)VB.f$a(0.f$d).f$E())) {
                    case f$i: {
                        GL11.glVertex3d((double)d, (double)(d2 + (double)entity.height - 0.18), (double)d3);
                        break;
                    }
                    case f$M: {
                        GL11.glVertex3d((double)d, (double)(d2 + (double)(entity.height / 2.0f)), (double)d3);
                        break;
                    }
                    case f$g: {
                        GL11.glVertex3d((double)d, (double)d2, (double)d3);
                        break;
                    }
                }
            }
            GL11.glEnd();
            GL11.glTranslated((double)d, (double)d2, (double)d3);
            GL11.glTranslated((double)(-d), (double)(-d2), (double)(-d3));
            switch ((Wc)((Object)VB.f$E(0.f$d).f$E())) {
                case f$i: {
                    Uh.f$K(axisAlignedBB);
                    break;
                }
                case f$M: {
                    Uh.f$e(axisAlignedBB);
                    break;
                }
            }
            VB.f$E().gameSettings.viewBobbing = bl;
            GlStateManager.popMatrix();
            GlStateManager.disableAlpha();
            GlStateManager.disableBlend();
            Uh.f$e();
            iterator2 = iterator;
        }
        return;
    }

    public gA(VB vB) {
        0.f$d = vB;
    }
}
package net.futureclient.client;

import net.futureclient.client.kF;

public class ga {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            ga.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ga.f$d[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
