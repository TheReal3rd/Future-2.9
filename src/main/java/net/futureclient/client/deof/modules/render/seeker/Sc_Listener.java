package net.futureclient.client.deof.modules.render.seeker;

public class Sc_Listener {
}
/*
package net.futureclient.client;

import java.awt.Color;
import net.futureclient.client.Ha;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.aj;
import net.futureclient.client.i;
import net.futureclient.client.kH;
import net.futureclient.client.sE;
import net.futureclient.client.vB;
import net.futureclient.client.wD;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class Sc
extends Ha<sE> {
    public final vB f$d;

    public Sc(vB vB2) {
        0.f$d = vB2;
    }

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        EntityPlayerSP entityPlayerSP = vB.f$K().getRenderViewEntity() == null ? vB.f$B().player : vB.f$e().getRenderViewEntity();
        for (Entity entity : vB.f$a().world.field_72996_f) {
            double d;
            String string;
            double d2;
            double d3;
            double d4;
            Vec3d vec3d;
            EntityFallingBlock entityFallingBlock;
            if (entity != null && entity.isEntityAlive() && (double)entity.getDistance((Entity)entityPlayerSP) > 0.5 && entity instanceof EntityAnimal && vB.f$E(0.f$d, (EntityAnimal)entity)) {
                entityFallingBlock = (EntityAnimal)entity;
                Vec3d vec3d2 = vec3d = Uh.f$E(entity);
                d4 = vec3d2.x;
                d3 = vec3d2.y;
                d2 = vec3d2.z;
                EntityFallingBlock entityFallingBlock2 = entityFallingBlock;
                vB.f$a(0.f$d, (Entity)entityFallingBlock2, vB.f$E(0.f$d, (EntityAnimal)entityFallingBlock2), d4, d3 + 0.5, d2, sE2.f$E());
                wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
                if (((Boolean)vB.f$e(0.f$d).f$E()).booleanValue()) {
                    Uh.f$B();
                    aj.f$E(new AxisAlignedBB(d4 - 0.5, d3, d2 - 0.5, d4 + 0.5, d3 + 1.0, d2 + 0.5), 1.5f, new Color(wD2.f$a.getRGB()));
                    Uh.f$e();
                }
                if (((Boolean)vB.f$a(0.f$d).f$E()).booleanValue()) {
                    Uh.f$B();
                    aj.f$E(new AxisAlignedBB(d4 - 0.5, d3, d2 - 0.5, d4 + 0.5, d3 + 1.0, d2 + 0.5), new Color((float)wD2.f$a.getRed() / 255.0f, (float)wD2.f$a.getGreen() / 255.0f, (float)wD2.f$a.getBlue() / 255.0f, 0.2f));
                    Uh.f$e();
                }
                if (((Boolean)vB.f$E(0.f$d).f$E()).booleanValue()) {
                    Uh.f$B();
                    GlStateManager.color((float)((float)wD2.f$a.getRed() / 255.0f), (float)((float)wD2.f$a.getGreen() / 255.0f), (float)((float)wD2.f$a.getBlue() / 255.0f), (float)1.0f);
                    GL11.glLoadIdentity();
                    GL11.glLineWidth((float)vB.f$E(0.f$d).f$E().floatValue());
                    ((i)vB.f$E().entityRenderer).f$E(sE2.f$E());
                    wD2 = new Vec3d(0.0, 0.0, 1.0).rotatePitch(-((float)Math.toRadians(entityPlayerSP.rotationPitch))).rotateYaw(-((float)Math.toRadians(entityPlayerSP.rotationYaw)));
                    GL11.glBegin((int)1);
                    GL11.glVertex3d((double)((Vec3d)wD2).x, (double)((double)entityPlayerSP.getEyeHeight() + ((Vec3d)wD2).y), (double)((Vec3d)wD2).z);
                    GL11.glVertex3d((double)d4, (double)d3, (double)d2);
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL11.glEnd();
                    Uh.f$e();
                }
            }
            if (entity == null || !entity.isEntityAlive() || !(entity instanceof EntityFallingBlock) || !(entity.getDistance((Entity)entityPlayerSP) > 1.0f)) continue;
            entityFallingBlock = (EntityFallingBlock)entity;
            Vec3d vec3d3 = vec3d = Uh.f$E((Entity)entityFallingBlock);
            d4 = vec3d3.x;
            d3 = vec3d3.y;
            d2 = vec3d3.z;
            EntityFallingBlock entityFallingBlock3 = entityFallingBlock;
            if (entityFallingBlock3.getBlock() == null) {
                string = "Block";
                d = d4;
            } else {
                string = entityFallingBlock.getBlock().getBlock().getLocalizedName();
                d = d4;
            }
            vB.f$E(0.f$d, (Entity)entityFallingBlock3, string, d, d3 + 0.5, d2, sE2.f$E());
        }
    }
}
 */