package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.wc;
import net.futureclient.client.zD;

public class Mc
extends Ha<zD> {
    public final wc f$d;

    public Mc(wc wc2) {
        0.f$d = wc2;
    }

    @Override
    public void f$E(zD zD2) {
        int n = zD2.f$E();
        if (n < 0) {
            zD2.f$E(n);
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Wd;
import net.futureclient.client.rA;

public class MC
extends Ha<Wd> {
    public final rA f$d;

    public MC(rA rA2) {
        0.f$d = rA2;
    }

    @Override
    public void f$E(Wd wd) {
        wd.f$E(true);
    }
}
package net.futureclient.client;

import java.util.List;
import net.futureclient.client.Ha;
import net.futureclient.client.Pg;
import net.futureclient.client.SB;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.kH;
import net.futureclient.client.sE;
import net.futureclient.client.wD;
import net.futureclient.client.wE;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class mC
extends Ha<sE> {
    public final SB f$d;

    public mC(SB sB) {
        0.f$d = sB;
    }

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        boolean bl = GL11.glIsEnabled((int)2896);
        boolean bl2 = GL11.glIsEnabled((int)3042);
        boolean bl3 = GL11.glIsEnabled((int)3553);
        boolean bl4 = GL11.glIsEnabled((int)2929);
        boolean bl5 = GL11.glIsEnabled((int)2848);
        if (bl) {
            GL11.glDisable((int)2896);
        }
        if (!bl2) {
            GL11.glEnable((int)3042);
        }
        GL11.glLineWidth((float)1.0f);
        if (bl3) {
            GL11.glDisable((int)3553);
        }
        if (bl4) {
            GL11.glDisable((int)2929);
        }
        if (!bl5) {
            GL11.glEnable((int)2848);
        }
        GlStateManager.blendFunc((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GL11.glHint((int)3154, (int)4354);
        GlStateManager.depthMask((boolean)false);
        List<EntityPlayer> list = Pg.f$E();
        Object object = SB.f$B().getRenderViewEntity() == null ? SB.f$e().player : SB.f$a().getRenderViewEntity();
        SB.f$E(0.f$d).keySet().removeIf(arg_0 -> mC.f$E(list, (Entity)object, arg_0));
        object = (wD)kH.f$E().f$E().f$E(wD.class);
        wE wE2 = (wE)kH.f$E().f$E().f$E(wE.class);
        list.forEach(arg_0 -> 0.f$E(wE2, (wD)object, arg_0));
        GlStateManager.depthMask((boolean)true);
        if (!bl5) {
            GL11.glDisable((int)2848);
        }
        if (bl4) {
            GL11.glEnable((int)2929);
        }
        if (bl3) {
            GL11.glEnable((int)3553);
        }
        if (!bl2) {
            GL11.glDisable((int)3042);
        }
        if (bl) {
            GL11.glEnable((int)2896);
        }
    }

    private void f$E(wE wE2, wD wD22, EntityPlayer entityPlayer) {
        EntityPlayer entityPlayer2;
        double d;
        EntityPlayer entityPlayer3;
        double d2;
        int n;
        int n2;
        EntityPlayer entityPlayer4;
        float[][] fArray = (float[][])SB.f$E(0.f$d).get(entityPlayer);
        if (fArray == null) {
            return;
        }
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.pushMatrix();
        if (kH.f$E().f$E().f$E(entityPlayer.getName()) || wE2 != null && wE2.f$E() && wE2.f$E(entityPlayer, (EntityPlayer)SB.f$E().player)) {
            GlStateManager.color((float)0.33333334f, (float)0.78431374f, (float)0.78431374f, (float)1.0f);
            entityPlayer4 = entityPlayer;
        } else if (wD22 != null) {
            entityPlayer4 = entityPlayer;
            GlStateManager.color((float)((float)wD22.f$a.getRed() / 255.0f), (float)((float)wD22.f$a.getGreen() / 255.0f), (float)((float)wD22.f$a.getBlue() / 255.0f), (float)1.0f);
        } else {
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            entityPlayer4 = entityPlayer;
        }
        wD wD3 = wD22 = Uh.f$E((Entity)entityPlayer4);
        double d3 = ((Vec3d)wD3).x;
        double d4 = ((Vec3d)wD3).y;
        double d5 = ((Vec3d)wD3).z;
        GlStateManager.translate((double)d3, (double)d4, (double)d5);
        GlStateManager.rotate((float)(-entityPlayer.field_70761_aq), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.translate((double)0.0, (double)0.0, (double)(entityPlayer.func_70093_af() ? -0.235 : 0.0));
        float wD22 = entityPlayer.func_70093_af() ? 0.6f : 0.75f;
        int n3 = n2 = 0;
        while (n3 < 2) {
            float f;
            double d6;
            GlStateManager.pushMatrix();
            if (n2 == 0) {
                d6 = -0.125;
                f = wD22;
            } else {
                d6 = 0.125;
                f = wD22;
            }
            GlStateManager.translate((double)d6, (double)f, (double)0.0);
            int n4 = n = 0;
            while (n4 < 3) {
                if (fArray[3 + n2][n] != 0.0f) {
                    int n5;
                    float f2;
                    int n6;
                    float f3;
                    float f4 = fArray[3 + n2][n] * 57.295776f;
                    if (n == 0) {
                        f3 = 1.0f;
                        n6 = n;
                    } else {
                        f3 = 0.0f;
                        n6 = n;
                    }
                    if (n6 == 1) {
                        f2 = 1.0f;
                        n5 = n;
                    } else {
                        f2 = 0.0f;
                        n5 = n;
                    }
                    GlStateManager.rotate((float)f4, (float)f3, (float)f2, (float)(n5 == 2 ? 1.0f : 0.0f));
                }
                n4 = ++n;
            }
            GlStateManager.glBegin((int)3);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)(-wD22), (double)0.0);
            GlStateManager.glEnd();
            GlStateManager.popMatrix();
            n3 = ++n2;
        }
        GlStateManager.translate((double)0.0, (double)0.0, (double)(entityPlayer.func_70093_af() ? 0.25 : 0.0));
        GlStateManager.pushMatrix();
        if (entityPlayer.func_70093_af()) {
            d2 = -0.05;
            entityPlayer3 = entityPlayer;
        } else {
            d2 = 0.0;
            entityPlayer3 = entityPlayer;
        }
        GlStateManager.translate((double)0.0, (double)d2, (double)(entityPlayer3.func_70093_af() ? -0.01725 : 0.0));
        int n7 = n2 = 0;
        while (n7 < 2) {
            float f;
            double d7;
            GlStateManager.pushMatrix();
            if (n2 == 0) {
                d7 = -0.375;
                f = wD22;
            } else {
                d7 = 0.375;
                f = wD22;
            }
            GlStateManager.translate((double)d7, (double)((double)f + 0.55), (double)0.0);
            int n8 = n = 0;
            while (n8 < 3) {
                if (fArray[1 + n2][n] != 0.0f) {
                    int n9;
                    float f5;
                    int n10;
                    float f6;
                    float f7 = (float)(n == 2 ? -1 : 1) * fArray[1 + n2][n] * 57.295776f;
                    if (n == 0) {
                        f6 = 1.0f;
                        n10 = n;
                    } else {
                        f6 = 0.0f;
                        n10 = n;
                    }
                    if (n10 == 1) {
                        f5 = 1.0f;
                        n9 = n;
                    } else {
                        f5 = 0.0f;
                        n9 = n;
                    }
                    GlStateManager.rotate((float)f7, (float)f6, (float)f5, (float)(n9 == 2 ? 1.0f : 0.0f));
                }
                n8 = ++n;
            }
            GlStateManager.glBegin((int)3);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)-0.5, (double)0.0);
            GlStateManager.glEnd();
            GlStateManager.popMatrix();
            n7 = ++n2;
        }
        GlStateManager.pushMatrix();
        GlStateManager.translate((double)0.0, (double)((double)wD22 + 0.55), (double)0.0);
        if (fArray[0][0] != 0.0f) {
            GlStateManager.rotate((float)(fArray[0][0] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GlStateManager.glBegin((int)3);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.3, (double)0.0);
        GlStateManager.glEnd();
        GlStateManager.popMatrix();
        GlStateManager.popMatrix();
        GlStateManager.rotate((float)(entityPlayer.func_70093_af() ? 25.0f : 0.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        if (entityPlayer.func_70093_af()) {
            d = -0.16175;
            entityPlayer2 = entityPlayer;
        } else {
            d = 0.0;
            entityPlayer2 = entityPlayer;
        }
        GlStateManager.translate((double)0.0, (double)d, (double)(entityPlayer2.func_70093_af() ? -0.48025 : 0.0));
        GlStateManager.pushMatrix();
        GlStateManager.translate((double)0.0, (double)wD22, (double)0.0);
        GlStateManager.glBegin((int)3);
        GL11.glVertex3d((double)-0.125, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.125, (double)0.0, (double)0.0);
        GlStateManager.glEnd();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate((double)0.0, (double)wD22, (double)0.0);
        GlStateManager.glBegin((int)3);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.55, (double)0.0);
        GlStateManager.glEnd();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate((double)0.0, (double)((double)wD22 + 0.55), (double)0.0);
        GlStateManager.glBegin((int)3);
        GL11.glVertex3d((double)-0.375, (double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.375, (double)0.0, (double)0.0);
        GlStateManager.glEnd();
        GlStateManager.popMatrix();
        GlStateManager.popMatrix();
    }

    private static boolean f$E(List list, Entity entity, EntityPlayer entityPlayer) {
        return !list.contains(entityPlayer) || entityPlayer == entity || entityPlayer.isPlayerSleeping() || !Pg.f$E((Entity)entityPlayer);
    }
}
package net.futureclient.client;

public enum mc {
    f$j,
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private mc() {
        mc mc2;
    }
}
