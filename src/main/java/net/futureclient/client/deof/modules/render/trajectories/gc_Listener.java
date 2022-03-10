package net.futureclient.client.deof.modules.render.trajectories;

import net.futureclient.client.*;

public class gc_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ac;
import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.kH;
import net.futureclient.client.sE;
import net.futureclient.client.vF;
import net.futureclient.client.wD;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemLingeringPotion;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemSplashPotion;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class gc
extends Ha<sE> {
    public final Ac f$d;

@Override
public void f$E(sE sE2) {
    block24: {
        float f;
        float f2;
        float f3;
        boolean bl;
        if (!sE2.f$E().equals((Object) YE.f$M)) {
            return;
        }
        if (!Ac.f$E(0.f$d).stream().anyMatch(clazz -> clazz.isInstance(Ac.f$a().player.func_184586_b(EnumHand.MAIN_HAND).getItem()) || clazz.isInstance(Ac.f$E().player.func_184586_b(EnumHand.OFF_HAND).getItem()))) break block24;
        boolean bl2 = Ac.f$Z().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemBow || Ac.f$T().player.func_184586_b(EnumHand.OFF_HAND).getItem() instanceof ItemBow;
        boolean bl3 = bl = Ac.f$z().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemSplashPotion || Ac.f$r().player.func_184586_b(EnumHand.OFF_HAND).getItem() instanceof ItemSplashPotion || Ac.f$y().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemLingeringPotion || Ac.f$s().player.func_184586_b(EnumHand.OFF_HAND).getItem() instanceof ItemLingeringPotion || Ac.f$S().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemExpBottle || Ac.f$N().player.func_184586_b(EnumHand.OFF_HAND).getItem() instanceof ItemExpBottle;
        if (Ac.f$X().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemBow || Ac.f$u().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemSnowball || Ac.f$V().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemEnderPearl || Ac.f$q().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemEgg) {
            bl = false;
        }
        if (Ac.f$x().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemSplashPotion || Ac.f$p().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemLingeringPotion || Ac.f$n().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemSnowball || Ac.f$o().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemEnderPearl || Ac.f$w().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemEgg || Ac.f$v().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemExpBottle) {
            bl2 = false;
        }
        if (bl && (Ac.f$W().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemPotion || Ac.f$Y().player.func_184586_b(EnumHand.OFF_HAND).getItem() instanceof ItemPotion)) {
            Ac.f$a(0.f$d, 0.5f);
            Ac.f$E(0.f$d, 0.05f);
        } else if (bl && (Ac.f$t().player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemExpBottle || Ac.f$P().player.func_184586_b(EnumHand.OFF_HAND).getItem() instanceof ItemExpBottle)) {
            Ac.f$a(0.f$d, 0.7f);
            Ac.f$E(0.f$d, 0.07f);
        } else {
            gc gc2 = 0;
            if (bl2) {
                Ac.f$a(gc2.f$d, 1.5f);
                Ac.f$E(0.f$d, 0.05f);
            } else {
                Ac.f$a(gc2.f$d, 1.5f);
                Ac.f$E(0.f$d, 0.03f);
            }
        }
        vF vF2 = (vF) kH.f$E().f$E().f$E(vF.class);
        if (vF2 != null && vF2.f$E() && vF2.f$M != null && Ac.f$Q().player.func_184607_cu().getItem() instanceof ItemBow && vF2.f$d != 0.0f && vF2.f$g != 0.0f) {
            vF vF3 = vF2;
            f3 = vF3.f$d;
            f2 = vF3.f$g;
        } else {
            f3 = Ac.f$U().player.field_70177_z;
            f2 = Ac.f$J().player.field_70125_A;
        }
        double d = Uh.f$E(Ac.f$d().player.field_70165_t, Ac.f$l().player.field_70142_S) - (double)(MathHelper.cos((float)(f3 / 180.0f * (float)Math.PI)) * 0.16f);
        double d2 = Uh.f$E(Ac.f$k().player.field_70163_u, Ac.f$b().player.field_70137_T) + (double)Ac.f$F().player.func_70047_e() - (double)0.1f;
        double d3 = Uh.f$E(Ac.f$G().player.field_70161_v, Ac.f$D().player.field_70136_U) - (double)(MathHelper.sin((float)(f3 / 180.0f * (float)Math.PI)) * 0.16f);
        double d4 = (double)(-MathHelper.sin((float)(f3 / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(f2 / 180.0f * (float)Math.PI))) * (bl2 ? 1.0 : 0.4);
        double d5 = (double)(-MathHelper.sin((float)((f2 - (float)(bl ? 20 : 0)) / 180.0f * (float)Math.PI))) * (bl2 ? 1.0 : 0.4);
        double d6 = (double)(MathHelper.cos((float)(f3 / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(f2 / 180.0f * (float)Math.PI))) * (bl2 ? 1.0 : 0.4);
        if (!Ac.f$g().player.field_70122_E && !bl2) {
            d5 += Ac.f$m().player.field_70181_x;
        }
        float f4 = (float)(72000 - Ac.f$f().player.func_184605_cv()) / 20.0f;
        f4 = (f4 * f4 + f4 * 2.0f) / 3.0f;
        if (!((double)f >= 0.1)) break block24;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        double d7 = d4;
        double d8 = d5;
        double d9 = d6;
        f3 = MathHelper.sqrt((double)(d7 * d7 + d8 * d8 + d9 * d9));
        d4 /= (double)f3;
        d5 /= (double)f3;
        d6 /= (double)f3;
        d4 *= (double)(bl2 ? f4 * 2.0f : 1.0f) * (double)Ac.f$a(0.f$d);
        d5 *= (double)(bl2 ? f4 * 2.0f : 1.0f) * (double)Ac.f$a(0.f$d);
        d6 *= (double)(bl2 ? f4 * 2.0f : 1.0f) * (double)Ac.f$a(0.f$d);
        GlStateManager.pushMatrix();
        Uh.f$B();
        GlStateManager.enableAlpha();
        GlStateManager.enableBlend();
        GL11.glLineWidth((float)1.5f);
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        GL11.glColor3f((float)((float)wD2.f$a.getRed() / 255.0f), (float)((float)wD2.f$a.getGreen() / 255.0f), (float)((float)wD2.f$a.getBlue() / 255.0f));
        GL11.glBegin((int)3);
        boolean bl4 = false;
        RayTraceResult rayTraceResult = null;
        boolean bl5 = bl4;
        while (!bl5 && d2 > 0.0) {
            double d10;
            block27: {
                block26: {
                    Vec3d vec3d;
                    block25: {
                        vec3d = new Vec3d(d, d2, d3);
                        vF2 = new Vec3d(d + d4, d2 + d5, d3 + d6);
                        RayTraceResult rayTraceResult2 = Ac.f$L().world.func_147447_a(vec3d, (Vec3d)vF2, false, true, false);
                        if (rayTraceResult2 == null) break block25;
                        if (rayTraceResult2.typeOfHit == RayTraceResult.Type.MISS) break block26;
                        rayTraceResult = rayTraceResult2;
                        bl4 = true;
                        d10 = d;
                        break block27;
                    }
                    Entity entity = Ac.f$E(0.f$d, vec3d, (Vec3d)vF2);
                    if (entity != null) {
                        rayTraceResult = new RayTraceResult(entity);
                        bl4 = true;
                    }
                }
                d10 = d;
            }
            d = d10 + d4;
            float f5 = 0.99f;
            d4 *= (double)f5;
            d5 *= (double)f5;
            GL11.glVertex3d((double)(d - ((K)Ac.f$i().getRenderManager()).getRenderPosX()), (double)((d2 += (d5 -= (double)Ac.f$E(0.f$d))) - ((K)Ac.f$c().getRenderManager()).getRenderPosY()), (double)((d3 += (d6 *= (double)f5)) - ((K)Ac.f$I().getRenderManager()).getRenderPosZ()));
            bl5 = bl4;
        }
        GL11.glEnd();
        GlStateManager.disableAlpha();
        GlStateManager.disableBlend();
        Uh.f$e();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        Uh.f$B();
        GlStateManager.enableAlpha();
        GlStateManager.enableBlend();
        GL11.glTranslated((double)(d - ((K)Ac.f$j().getRenderManager()).getRenderPosX()), (double)(d2 - ((K)Ac.f$M().getRenderManager()).getRenderPosY()), (double)(d3 - ((K)Ac.f$C().getRenderManager()).getRenderPosZ()));
        if (rayTraceResult != null && rayTraceResult.typeOfHit == RayTraceResult.Type.BLOCK) {
            switch (rayTraceResult.sideHit.getIndex()) {
                case 1: {
                    GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 2: {
                    GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 3: {
                    GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                    break;
                }
                case 4: {
                    GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    break;
                }
                case 5: {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    break;
                }
            }
            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            Uh.f$a(-0.6f, -0.6f, 0.6f, 0.6f, 0.1f, wD2.f$a.getRGB() + -1728053248, wD2.f$a.getRGB() + -1728053248);
        }
        if (rayTraceResult != null && rayTraceResult.typeOfHit == RayTraceResult.Type.ENTITY) {
            GL11.glTranslated((double)(-((K)Ac.f$H().getRenderManager()).getRenderPosX()), (double)(-((K)Ac.f$h().getRenderManager()).getRenderPosY()), (double)(-((K)Ac.f$A().getRenderManager()).getRenderPosZ()));
            GL11.glColor4f((float)((float)wD2.f$a.getRed() / 255.0f), (float)((float)wD2.f$a.getGreen() / 255.0f), (float)((float)wD2.f$a.getBlue() / 255.0f), (float)0.17f);
            Uh.f$e(rayTraceResult.entityHit.getEntityBoundingBox().grow(0.525, 1.0, 0.525).offset(0.0, -2.0, 0.0));
            GL11.glTranslated((double)((K)Ac.f$K().getRenderManager()).getRenderPosX(), (double)((K)Ac.f$B().getRenderManager()).getRenderPosY(), (double)((K)Ac.f$e().getRenderManager()).getRenderPosZ());
        }
        GlStateManager.disableAlpha();
        GlStateManager.disableBlend();
        Uh.f$e();
        GlStateManager.popMatrix();
    }
}

    public gc(Ac ac) {
        0.f$d = ac;
    }
}
 */