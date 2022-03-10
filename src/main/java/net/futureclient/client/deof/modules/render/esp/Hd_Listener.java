package net.futureclient.client.deof.modules.render.esp;

import net.futureclient.client.*;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import org.apache.logging.log4j.Level;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class Hd_Listener {
}
/*
package net.futureclient.client;

import java.awt.Color;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import net.futureclient.client.BI;
import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.La;
import net.futureclient.client.PC;
import net.futureclient.client.Pg;
import net.futureclient.client.Uh;
import net.futureclient.client.VH;
import net.futureclient.client.Y;
import net.futureclient.client.YE;
import net.futureclient.client.Ze;
import net.futureclient.client.aj;
import net.futureclient.client.cb;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.mb;
import net.futureclient.client.s;
import net.futureclient.client.sE;
import net.futureclient.client.wD;
import net.futureclient.client.wE;
import net.futureclient.client.zA;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import org.apache.logging.log4j.Level;
import org.lwjgl.opengl.GL11;

public class Hd
extends Ha<sE> {
    public final zA f$d;

    public Hd(zA zA2) {
        0.f$d = zA2;
    }

    private static void f$E(Entity entity, cb cb2) {
        boolean bl;
        Object object = cb2.f$E();
        double d = entity.getDistance(object.x, object.y, object.z);
        double d2 = 0.0028 * d;
        if (d <= 8.0) {
            d2 = 0.0204;
        }
        GL11.glPushMatrix();
        boolean bl2 = GL11.glIsEnabled((int)2896);
        boolean bl3 = GL11.glIsEnabled((int)2929);
        if (bl2) {
            GL11.glDisable((int)2896);
        }
        if (bl3) {
            GL11.glDisable((int)2929);
        }
        GL11.glTranslated((double)(object.x - ((K)zA.f$Ga().getRenderManager()).getRenderPosX()), (double)(object.y - ((K)zA.f$la().getRenderManager()).getRenderPosY()), (double)(object.z - ((K)zA.f$ba().getRenderManager()).getRenderPosZ()));
        GL11.glRotatef((float)(-zA.f$Ea().getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)zA.f$La().getRenderManager().playerViewX, (float)(zA.f$ga().gameSettings.thirdPersonView == 2 ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GL11.glScaled((double)(-d2), (double)(-d2), (double)d2);
        object = (gF)kH.f$E().f$E().f$E(gF.class);
        if (object.f$c.f$E().booleanValue()) {
            bl = bl2;
            object.f$L.f$E(cb2.f$E(), (double)(-(zA.f$R().fontRenderer.getStringWidth(cb2.f$E()) / 2)), (double)(-(zA.f$O().fontRenderer.FONT_HEIGHT - 1)), -1);
        } else {
            zA.f$z().fontRenderer.drawStringWithShadow(cb2.f$E(), (float)(-(zA.f$Z().fontRenderer.getStringWidth(cb2.f$E()) / 2)), (float)(-(zA.f$T().fontRenderer.FONT_HEIGHT - 1)), -1);
            bl = bl2;
        }
        if (bl) {
            GL11.glEnable((int)2896);
        }
        if (bl3) {
            GL11.glEnable((int)2929);
        }
        GL11.glPopMatrix();
    }

@Override
public void f$E(sE sE2) {
    if (!sE2.f$E().equals((Object) YE.f$g)) {
        return;
    }
    EntityPlayerSP entityPlayerSP = zA.f$ta().getRenderViewEntity() == null ? zA.f$sa().player : zA.f$za().getRenderViewEntity();
    try {
        Object object;
        Entity entity;
        Frustum frustum;
        boolean bl = zA.f$Ua().gameSettings.fancyGraphics;
        zA.f$Sa().gameSettings.fancyGraphics = false;
        zA.f$b = false;
        float f = zA.f$na().gameSettings.gammaSetting;
        zA.f$Xa().gameSettings.gammaSetting = 100.0f;
        zA.f$C(0.f$d);
        block1 : switch ((mb)((Object)zA.f$E(0.f$d).f$E())) {
            case f$M: {
                Hd hd = 0;
                zA.f$H(hd.f$d);
                zA.f$h(hd.f$d);
                zA.f$A(hd.f$d);
                zA.f$h(hd.f$d);
                zA.f$K(hd.f$d);
                zA.f$B(hd.f$d);
                zA.f$h(hd.f$d);
                zA.f$e(hd.f$d);
                break;
            }
            case f$g: {
                frustum = Pg.f$a().iterator();
                block11: while (true) {
                    Frustum frustum2 = frustum;
                    while (frustum2.hasNext()) {
                        entity = (Entity)frustum.next();
                        if (!zA.f$a(0.f$d, entity)) continue block11;
                        if (entity instanceof EntityPlayer) {
                            EntityPlayer entityPlayer;
                            int n;
                            EntityPlayer entityPlayer2 = (EntityPlayer)entity;
                            wE wE2 = (wE)kH.f$E().f$E().f$E(wE.class);
                            Ze ze = (Ze)kH.f$E().f$E().f$E(Ze.class);
                            if (!Pg.f$E((Entity)entityPlayer2)) {
                                frustum2 = frustum;
                                continue;
                            }
                            if (kH.f$E().f$E().f$E(entityPlayer2.getName())) {
                                n = -2147418113;
                                entityPlayer = entityPlayer2;
                            } else if (entityPlayer2.field_70737_aN > 0) {
                                n = -2130771968;
                                entityPlayer = entityPlayer2;
                            } else if (wE2 != null && wE2.f$E() && wE2.f$j.f$E().booleanValue() && wE2.f$E(entityPlayer2, (EntityPlayer)zA.f$Pa().player)) {
                                n = -2147418113;
                                entityPlayer = entityPlayer2;
                            } else if (ze != null && ze.f$E() && ze.f$G.f$E().booleanValue() && Pg.f$a((Entity)entityPlayer2)) {
                                n = -2147418113;
                                entityPlayer = entityPlayer2;
                            } else {
                                n = -1711341568;
                                entityPlayer = entityPlayer2;
                            }
                            double d = entityPlayer.field_70142_S + (entityPlayer2.field_70165_t - entityPlayer2.field_70142_S) * (double)sE2.f$E() - ((K)zA.f$ra().getRenderManager()).getRenderPosX();
                            double d2 = entityPlayer2.field_70137_T + (entityPlayer2.field_70163_u - entityPlayer2.field_70137_T) * (double)sE2.f$E() - ((K)zA.f$Na().getRenderManager()).getRenderPosY();
                            double d3 = entityPlayer2.field_70136_U + (entityPlayer2.field_70161_v - entityPlayer2.field_70136_U) * (double)sE2.f$E() - ((K)zA.f$xa().getRenderManager()).getRenderPosZ();
                            GL11.glPolygonOffset((float)-120000.0f, (float)-120000.0f);
                            zA.f$E(0.f$d, (Entity)entityPlayer2, d, d2, d3, n);
                            GL11.glPolygonOffset((float)120000.0f, (float)120000.0f);
                            continue block11;
                        }
                        int n = -1;
                        if ((BI.f$M(entity) || BI.f$C(entity)) && ((Boolean)zA.f$C(0.f$d).f$E()).booleanValue()) {
                            n = -1711341568;
                        }
                        if ((BI.f$I(entity) || BI.f$j(entity)) && ((Boolean)zA.f$H(0.f$d).f$E()).booleanValue()) {
                            n = -16726016;
                        }
                        if (entity instanceof EntityEnderCrystal && ((Boolean)zA.f$h(0.f$d).f$E()).booleanValue()) {
                            n = -1711323905;
                        }
                        double d = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)sE2.f$E() - ((K)zA.f$Qa().getRenderManager()).getRenderPosX();
                        double d4 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)sE2.f$E() - ((K)zA.f$qa().getRenderManager()).getRenderPosY();
                        double d5 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)sE2.f$E() - ((K)zA.f$ua().getRenderManager()).getRenderPosZ();
                        GL11.glPolygonOffset((float)-120000.0f, (float)-120000.0f);
                        zA.f$E(0.f$d, entity, d, d4, d5, n);
                        GL11.glPolygonOffset((float)120000.0f, (float)120000.0f);
                        continue block11;
                    }
                    break block1;
                    break;
                }
            }
        }
        frustum = new Frustum();
        entity = zA.f$oa().getRenderViewEntity() == null ? zA.f$Va().player : zA.f$pa().getRenderViewEntity();
        frustum.setPosition(entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)((Y)zA.f$Ra()).getTimer().renderPartialTicks, entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)((Y)zA.f$Wa()).getTimer().renderPartialTicks, entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)((Y)zA.f$wa()).getTimer().renderPartialTicks);
        if (zA.f$E(0.f$d).f$E() != mb.f$i && ((Boolean)zA.f$A(0.f$d).f$E()).booleanValue()) {
            GL11.glPushMatrix();
            GL11.glPushAttrib((int)1048575);
            boolean bl2 = GL11.glIsEnabled((int)2896);
            boolean bl3 = GL11.glIsEnabled((int)3042);
            boolean bl4 = GL11.glIsEnabled((int)3553);
            boolean bl5 = GL11.glIsEnabled((int)2848);
            if (bl2) {
                GL11.glDisable((int)2896);
            }
            GL11.glBlendFunc((int)770, (int)771);
            if (!bl3) {
                GL11.glEnable((int)3042);
            }
            GL11.glLineWidth((float)(((s)zA.f$E(0.f$d)).f$E().floatValue() / 2.0f));
            if (bl4) {
                GL11.glDisable((int)3553);
            }
            if (!bl5) {
                GL11.glEnable((int)2848);
            }
            wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
            Iterator iterator = zA.f$va().world.func_72910_y().iterator();
            block13: while (true) {
                Iterator iterator2 = iterator;
                while (iterator2.hasNext()) {
                    Entity entity2 = (Entity)iterator.next();
                    if (!(entity2 instanceof EntityItem)) continue block13;
                    AxisAlignedBB axisAlignedBB = entity2.getEntityBoundingBox();
                    if (!frustum.isBoundingBoxInFrustum(axisAlignedBB)) {
                        iterator2 = iterator;
                        continue;
                    }
                    Vec3d vec3d = Uh.f$E(entity2);
                    object = axisAlignedBB.expand(-0.05, 0.0, -0.05).expand(0.05, 0.1, 0.05).offset(-entity2.posX, -entity2.posY, -entity2.posZ).offset(vec3d.x, vec3d.y, vec3d.z);
                    GL11.glColor4d((double)((float)wD2.f$a.getRed() / 255.0f), (double)((float)wD2.f$a.getGreen() / 255.0f), (double)((float)wD2.f$a.getBlue() / 255.0f), (double)(entity2.ticksExisted <= 42 ? (double)((float)(entity2.ticksExisted * 6) / 255.0f) : 1.0));
                    Uh.f$E((AxisAlignedBB)object);
                    continue block13;
                }
                break;
            }
            if (!bl5) {
                GL11.glDisable((int)2848);
            }
            if (bl4) {
                GL11.glEnable((int)3553);
            }
            if (!bl3) {
                GL11.glDisable((int)3042);
            }
            if (bl2) {
                GL11.glEnable((int)2896);
            }
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }
        zA.f$E(0.f$d).removeIf(cb2 -> System.currentTimeMillis() - cb2.f$E() > TimeUnit.SECONDS.toMillis(5L));
        if (((Boolean)zA.f$K(0.f$d).f$E()).booleanValue()) {
            zA.f$E(0.f$d).forEach(arg_0 -> Hd.f$E((Entity)entityPlayerSP, arg_0));
        }
        if (((Boolean)zA.f$B(0.f$d).f$E()).booleanValue()) {
            Iterator iterator;
            Iterator iterator3 = iterator = zA.f$Oa().world.func_72910_y().iterator();
            while (iterator3.hasNext()) {
                boolean bl6;
                Entity entity3 = (Entity)iterator.next();
                UUID uUID = Pg.f$E(entity3);
                if (uUID == null) {
                    iterator3 = iterator;
                    continue;
                }
                String string = VH.f$e(uUID);
                double d = entity3.lastTickPosX + (entity3.posX - entity3.lastTickPosX) * (double)((Y)zA.f$Ta()).getTimer().renderPartialTicks;
                double d6 = entity3.lastTickPosY + (entity3.posY - entity3.lastTickPosY) * (double)((Y)zA.f$ya()).getTimer().renderPartialTicks + (double)entity3.getEyeHeight();
                double d7 = entity3.lastTickPosZ + (entity3.posZ - entity3.lastTickPosZ) * (double)((Y)zA.f$ca()).getTimer().renderPartialTicks;
                double d8 = entityPlayerSP.getDistance(d, d6, d7);
                double d9 = 0.0028 * d8;
                if (d8 <= 8.0) {
                    d9 = 0.0204;
                }
                GL11.glPushMatrix();
                boolean bl7 = GL11.glIsEnabled((int)2896);
                boolean bl8 = GL11.glIsEnabled((int)2929);
                if (bl7) {
                    GL11.glDisable((int)2896);
                }
                if (bl8) {
                    GL11.glDisable((int)2929);
                }
                GL11.glTranslated((double)(d - ((K)zA.f$ka().getRenderManager()).getRenderPosX()), (double)(d6 - ((K)zA.f$ia().getRenderManager()).getRenderPosY()), (double)(d7 - ((K)zA.f$ea().getRenderManager()).getRenderPosZ()));
                GL11.glRotatef((float)(-zA.f$Ia().getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)zA.f$Ja().getRenderManager().playerViewX, (float)(zA.f$Ma().gameSettings.thirdPersonView == 2 ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
                GL11.glScaled((double)(-d9), (double)(-d9), (double)d9);
                gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
                if (gF2.f$c.f$E().booleanValue()) {
                    bl6 = bl7;
                    String string2 = string;
                    gF2.f$L.f$E(string2, (double)(-(zA.f$ha().fontRenderer.getStringWidth(string2) / 2)), (double)(-(zA.f$da().fontRenderer.FONT_HEIGHT - 1)), -1);
                } else {
                    String string3 = string;
                    zA.f$Ka().fontRenderer.drawStringWithShadow(string3, (float)(-(zA.f$Ca().fontRenderer.getStringWidth(string3) / 2)), (float)(-(zA.f$Da().fontRenderer.FONT_HEIGHT - 1)), -1);
                    bl6 = bl7;
                }
                if (bl6) {
                    GL11.glEnable((int)2896);
                }
                if (bl8) {
                    GL11.glEnable((int)2929);
                }
                GL11.glPopMatrix();
                iterator3 = iterator;
            }
        }
        if (((Boolean)zA.f$e(0.f$d).f$E()).booleanValue()) {
            Iterator iterator;
            Iterator iterator4 = iterator = ((CopyOnWriteArrayList)zA.f$E(0.f$d)).iterator();
            while (iterator4.hasNext()) {
                BlockPos blockPos = (BlockPos)iterator.next();
                PC pC = zA.f$E(0.f$d, blockPos);
                if (pC == null) {
                    iterator4 = iterator;
                    ((CopyOnWriteArrayList)zA.f$E(0.f$d)).remove(blockPos);
                    continue;
                }
                BlockPos blockPos2 = zA.f$Aa().player.getPosition();
                if (blockPos.func_185332_f(blockPos2.func_177958_n(), blockPos2.func_177956_o(), blockPos2.func_177952_p()) > 16.0) {
                    iterator4 = iterator;
                    continue;
                }
                AxisAlignedBB axisAlignedBB = zA.f$fa().world.func_180495_p(blockPos).func_185900_c((IBlockAccess)zA.f$ja().world, blockPos).offset((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p());
                if (!frustum.isBoundingBoxInFrustum(axisAlignedBB)) {
                    iterator4 = iterator;
                    continue;
                }
                AxisAlignedBB axisAlignedBB2 = axisAlignedBB.offset(-((K)zA.f$Ba().getRenderManager()).getRenderPosX(), -((K)zA.f$ma().getRenderManager()).getRenderPosY(), -((K)zA.f$Fa().getRenderManager()).getRenderPosZ());
                GL11.glPushMatrix();
                GL11.glPushAttrib((int)1048575);
                int n = 0;
                int n2 = 0;
                boolean bl9 = false;
                switch (pC) {
                    case f$i: {
                        n = 255;
                        break;
                    }
                    case f$M: {
                        n2 = 255;
                        break;
                    }
                    case f$g: {
                        n = 255;
                        n2 = 255;
                        break;
                    }
                }
                object = new Color((float)n / 255.0f, (float)n2 / 255.0f, (float)bl9 / 255.0f, 0.225f);
                Uh.f$B();
                AxisAlignedBB axisAlignedBB3 = axisAlignedBB2;
                aj.f$E(axisAlignedBB3, 1.5f, (Color)object);
                Uh.f$e();
                object = new Color((float)((Color)object).getRed() / 255.0f, (float)((Color)object).getGreen() / 255.0f, (float)((Color)object).getBlue() / 255.0f, 0.075f);
                Uh.f$B();
                aj.f$E(axisAlignedBB3, (Color)object);
                Uh.f$e();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glPopAttrib();
                GL11.glPopMatrix();
                iterator4 = iterator;
            }
        }
        if (((Boolean)zA.f$a(0.f$d).f$E()).booleanValue()) {
            RenderHelper.enableStandardItemLighting();
            Hd hd = 0;
            zA.f$H(hd.f$d);
            zA.f$a(hd.f$d);
            zA.f$A(hd.f$d);
            zA.f$a(hd.f$d);
            zA.f$K(hd.f$d);
            zA.f$B(hd.f$d);
            zA.f$a(hd.f$d);
            zA.f$e(hd.f$d);
            RenderHelper.disableStandardItemLighting();
        }
        if (((Boolean)zA.f$E(0.f$d).f$E()).booleanValue()) {
            Hd hd = 0;
            zA.f$H(hd.f$d);
            zA.f$E(hd.f$d);
            zA.f$A(hd.f$d);
            zA.f$E(hd.f$d);
            zA.f$K(hd.f$d);
            zA.f$B(hd.f$d);
            zA.f$E(hd.f$d);
            zA.f$e(hd.f$d);
        }
        zA.f$b = true;
        zA.f$aa().gameSettings.gammaSetting = f;
        zA.f$Ha().gameSettings.fancyGraphics = bl;
        aj.f$E(new Color(255, 255, 255, 255));
        return;
    }
    catch (Exception exception) {
        La.f$E().f$E(Level.ERROR, "ESP is causing a crash.");
        exception.printStackTrace();
        return;
    }
}
}
 */