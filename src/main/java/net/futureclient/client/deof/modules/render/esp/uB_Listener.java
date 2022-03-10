package net.futureclient.client.deof.modules.render.esp;

public class uB_Listener {
}
/*
package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.C;
import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.Pg;
import net.futureclient.client.Uh;
import net.futureclient.client.Xc;
import net.futureclient.client.Y;
import net.futureclient.client.fg;
import net.futureclient.client.i;
import net.futureclient.client.kH;
import net.futureclient.client.mb;
import net.futureclient.client.wD;
import net.futureclient.client.zA;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.Level;
import org.lwjgl.opengl.GL11;

public class uB
extends Ha<fg> {
    public final zA f$d;

    public uB(zA zA2) {
        0.f$d = zA2;
    }

    @Override
    public void f$E(fg fg2) {
        if (zA.f$E(0.f$d).f$E() == mb.f$i) {
            Object object = zA.f$r().getRenderViewEntity() == null ? zA.f$y().player : zA.f$s().getRenderViewEntity();
            try {
                Vec3d vec3d;
                Object object2;
                uB uB2;
                zA.f$i = false;
                if (zA.f$E(0.f$d) != null) {
                    zA.f$E(0.f$d).framebufferClear();
                }
                if (zA.f$E(0.f$d) == null) {
                    uB uB2 = 0;
                    uB2 = uB2;
                    zA.f$E(uB3.f$d, new Framebuffer(zA.f$S().displayWidth, zA.f$N().displayHeight, false));
                } else {
                    if (zA.f$E((zA)0.f$d).framebufferWidth != zA.f$X().displayWidth || zA.f$E((zA)0.f$d).framebufferHeight != zA.f$u().displayHeight) {
                        uB uB4 = 0;
                        zA.f$E(uB4.f$d).unbindFramebuffer();
                        zA.f$E(uB4.f$d, new Framebuffer(zA.f$V().displayWidth, zA.f$q().displayHeight, false));
                        if (zA.f$E(uB4.f$d) != null) {
                            uB uB5 = 0;
                            zA.f$E(uB5.f$d).f$e();
                            zA.f$E(uB5.f$d, new Xc(zA.f$E((zA)0.f$d).framebufferTexture, zA.f$x().displayWidth, zA.f$p().displayHeight, zA.f$n().displayWidth / 2, zA.f$o().displayHeight / 2, 1.0f, 3));
                        }
                    }
                    uB2 = 0;
                }
                if (zA.f$E(uB2.f$d) == null) {
                    zA.f$E(0.f$d, new Xc(zA.f$E((zA)0.f$d).framebufferTexture, zA.f$w().displayWidth, zA.f$v().displayHeight, zA.f$W().displayWidth / 2, zA.f$Y().displayHeight / 2, 1.0f, 3));
                }
                zA.f$E(0.f$d).f$E(1.0f);
                float f = ((Y)zA.f$t()).getTimer().renderPartialTicks;
                ((i)zA.f$P().entityRenderer).invokeSetupCameraTransform(f, 0);
                RenderHelper.enableStandardItemLighting();
                object = Uh.f$E((Entity)object);
                EntityPlayerSP entityPlayerSP = object;
                double d = entityPlayerSP.x;
                double d2 = entityPlayerSP.y;
                double d3 = entityPlayerSP.z;
                zA.f$E(0.f$d).bindFramebuffer(false);
                GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
                GL11.glClear((int)16640);
                object = Pg.f$a().iterator();
                block3: while (true) {
                    Object object3 = object;
                    while (object3.hasNext()) {
                        object2 = (Entity)object.next();
                        if (!zA.f$E(0.f$d, (Entity)object2)) continue block3;
                        if (object2 instanceof EntityPlayer && kH.f$E().f$E().f$E(object2.getName())) {
                            object3 = object;
                            continue;
                        }
                        zA.f$Q().entityRenderer.disableLightmap();
                        RenderHelper.disableStandardItemLighting();
                        vec3d = Uh.f$E((Entity)object2);
                        double d4 = vec3d.x;
                        double d5 = vec3d.y;
                        double d6 = vec3d.z;
                        GL11.glPushMatrix();
                        Render render = zA.f$U().getRenderManager().getEntityRenderObject((Entity)object2);
                        if (render != null) {
                            zA.f$j = false;
                            ((C)zA.f$J().getRenderItem()).setNotRenderingEffectsInGUI(false);
                            zA.f$b = false;
                            render.doRender((Entity)object2, d4 - d, d5 - d2, d6 - d3, 0.0f, f);
                            zA.f$b = true;
                            ((C)zA.f$d().getRenderItem()).setNotRenderingEffectsInGUI(true);
                            zA.f$j = true;
                        }
                        GL11.glPopMatrix();
                        object3 = object;
                    }
                    break;
                }
                zA.f$l().entityRenderer.disableLightmap();
                RenderHelper.disableStandardItemLighting();
                zA.f$k().entityRenderer.setupOverlayRendering();
                zA.f$E(0.f$d).f$E();
                zA.f$E(0.f$d).unbindFramebuffer();
                zA.f$b().getFramebuffer().bindFramebuffer(true);
                GL11.glPushMatrix();
                object = (wD)kH.f$E().f$E().f$E(wD.class);
                if (object != null) {
                    GL11.glColor3f((float)((float)((wD)object).f$a.getRed() / 255.0f), (float)((float)((wD)object).f$a.getGreen() / 255.0f), (float)((float)((wD)object).f$a.getBlue() / 255.0f));
                }
                GlStateManager.bindTexture((int)zA.f$E(0.f$d).f$E());
                GL11.glBegin((int)9);
                GL11.glTexCoord2d((double)0.0, (double)1.0);
                GL11.glVertex2d((double)0.0, (double)0.0);
                GL11.glTexCoord2d((double)0.0, (double)0.0);
                GL11.glVertex2d((double)0.0, (double)zA.f$F().displayHeight);
                GL11.glTexCoord2d((double)1.0, (double)0.0);
                GL11.glVertex2d((double)zA.f$G().displayWidth, (double)zA.f$D().displayHeight);
                GL11.glTexCoord2d((double)1.0, (double)0.0);
                GL11.glVertex2d((double)zA.f$g().displayWidth, (double)zA.f$m().displayHeight);
                GL11.glTexCoord2d((double)1.0, (double)1.0);
                GL11.glVertex2d((double)zA.f$f().displayWidth, (double)0.0);
                GL11.glTexCoord2d((double)0.0, (double)1.0);
                GL11.glVertex2d((double)0.0, (double)0.0);
                GL11.glEnd();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glPopMatrix();
                ((i)zA.f$L().entityRenderer).invokeSetupCameraTransform(f, 0);
                RenderHelper.enableStandardItemLighting();
                zA.f$E(0.f$d).bindFramebuffer(false);
                GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
                GL11.glClear((int)16640);
                object2 = Pg.f$E().iterator();
                Iterator<Object> iterator = object2;
                while (true) {
                    if (!iterator.hasNext()) {
                        zA.f$M().entityRenderer.disableLightmap();
                        RenderHelper.disableStandardItemLighting();
                        zA.f$C().entityRenderer.setupOverlayRendering();
                        zA.f$E(0.f$d).f$E();
                        uB uB6 = 0;
                        zA.f$E(uB6.f$d).unbindFramebuffer();
                        zA.f$H().getFramebuffer().bindFramebuffer(true);
                        GL11.glPushMatrix();
                        GL11.glColor3f((float)0.27f, (float)0.7f, (float)1.0f);
                        GlStateManager.bindTexture((int)zA.f$E(uB6.f$d).f$E());
                        GL11.glBegin((int)9);
                        GL11.glTexCoord2d((double)0.0, (double)1.0);
                        GL11.glVertex2d((double)0.0, (double)0.0);
                        GL11.glTexCoord2d((double)0.0, (double)0.0);
                        GL11.glVertex2d((double)0.0, (double)zA.f$h().displayHeight);
                        GL11.glTexCoord2d((double)1.0, (double)0.0);
                        GL11.glVertex2d((double)zA.f$A().displayWidth, (double)zA.f$K().displayHeight);
                        GL11.glTexCoord2d((double)1.0, (double)0.0);
                        GL11.glVertex2d((double)zA.f$B().displayWidth, (double)zA.f$e().displayHeight);
                        GL11.glTexCoord2d((double)1.0, (double)1.0);
                        GL11.glVertex2d((double)zA.f$a().displayWidth, (double)0.0);
                        GL11.glTexCoord2d((double)0.0, (double)1.0);
                        GL11.glVertex2d((double)0.0, (double)0.0);
                        GL11.glEnd();
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                        GL11.glPopMatrix();
                        zA.f$i = true;
                        return;
                    }
                    vec3d = (EntityPlayer)object2.next();
                    if (!zA.f$E(0.f$d, (Entity)vec3d)) {
                        iterator = object2;
                        continue;
                    }
                    zA.f$i().entityRenderer.disableLightmap();
                    RenderHelper.disableStandardItemLighting();
                    Vec3d vec3d2 = Uh.f$E((Entity)vec3d);
                    double d7 = vec3d2.x;
                    double d8 = vec3d2.y;
                    double d9 = vec3d2.z;
                    GL11.glPushMatrix();
                    object = zA.f$c().getRenderManager().getEntityRenderObject((Entity)vec3d);
                    if (object != null && kH.f$E().f$E().f$E(vec3d.getName())) {
                        zA.f$j = false;
                        ((C)zA.f$I().getRenderItem()).setNotRenderingEffectsInGUI(false);
                        zA.f$b = false;
                        object.doRender((Entity)vec3d, d7 - d, d8 - d2, d9 - d3, 0.0f, f);
                        zA.f$b = true;
                        ((C)zA.f$j().getRenderItem()).setNotRenderingEffectsInGUI(true);
                        zA.f$j = true;
                    }
                    GL11.glPopMatrix();
                    iterator = object2;
                }
            }
            catch (Exception exception) {
                La.f$E().f$E(Level.ERROR, "Shader ESP is causing a crash.");
                exception.printStackTrace();
            }
        }
    }
}
 */