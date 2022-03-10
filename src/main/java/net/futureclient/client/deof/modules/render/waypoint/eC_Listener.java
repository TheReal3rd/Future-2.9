package net.futureclient.client.deof.modules.render.waypoint;

public class eC_Listener {
}
/*
package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.Pg;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.i;
import net.futureclient.client.kH;
import net.futureclient.client.s;
import net.futureclient.client.sE;
import net.futureclient.client.va;
import net.futureclient.client.wD;
import net.futureclient.client.yB;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import org.lwjgl.opengl.GL11;

public class eC
extends Ha<sE> {
    public final yB f$d;

    public eC(yB yB2) {
        0.f$d = yB2;
    }

    @Override
    public void f$E(sE sE2) {
        eC eC2;
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        EntityPlayerSP entityPlayerSP = yB.f$u().getRenderViewEntity() == null ? yB.f$V().player : yB.f$q().getRenderViewEntity();
        0.f$d.f$M = new ArrayList<va>(0.f$d.f$i);
        if (yB.f$x().world.field_73011_w.getDimensionType().equals((Object)DimensionType.OVERWORLD) || yB.f$p().world.field_73011_w.getDimensionType().equals((Object)DimensionType.NETHER)) {
            0.f$d.f$M.removeIf(va2 -> va2.f$a().equals(DimensionType.THE_END.getName()));
            eC2 = 0;
        } else {
            if (yB.f$n().world.field_73011_w.getDimensionType().equals((Object)DimensionType.THE_END)) {
                0.f$d.f$M.removeIf(va2 -> va2.f$a().equals(DimensionType.OVERWORLD.getName()) || va2.f$a().equals(DimensionType.NETHER.getName()));
            }
            eC2 = 0;
        }
        eC2.f$d.f$M.sort(Pg.f$E());
        for (va va3 : 0.f$d.f$M) {
            block14: {
                block15: {
                    if (va3.f$e().equals("singleplayer") && yB.f$o().isSingleplayer()) break block14;
                    if (yB.f$w().getCurrentServerData() == null) break block15;
                    if (va3.f$e().equalsIgnoreCase(yB.f$v().getCurrentServerData().serverIP.replaceAll(":", "_"))) break block14;
                }
                if (!yB.f$W().isConnectedToRealms()) continue;
                if (!va3.f$e().equals("realms")) continue;
            }
            va va4 = va3;
            double d = va4.f$a();
            double d2 = va4.f$e();
            double d3 = va4.f$a();
            double d4 = va4.f$E();
            double d5 = va4.f$e();
            if (yB.f$Y().world.field_73011_w.getDimensionType().equals((Object)DimensionType.NETHER) && va3.f$a().equals(DimensionType.OVERWORLD.getName())) {
                d3 /= 8.0;
                d5 /= 8.0;
                d /= 8.0;
                d2 /= 8.0;
            } else if (yB.f$t().world.field_73011_w.getDimensionType().equals((Object)DimensionType.OVERWORLD) && va3.f$a().equals(DimensionType.NETHER.getName())) {
                d3 *= 8.0;
                d5 *= 8.0;
                d *= 8.0;
                d2 *= 8.0;
            }
            Uh.f$B();
            GlStateManager.pushMatrix();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB((d3 -= ((K)yB.f$P().getRenderManager()).getRenderPosX()) - 0.25, d4 -= ((K)yB.f$Q().getRenderManager()).getRenderPosY(), (d5 -= ((K)yB.f$U().getRenderManager()).getRenderPosZ()) - 0.25, d3 + 0.25, d4 + 2.0, d5 + 0.25);
            wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
            GlStateManager.color((float)((float)wD2.f$a.getRed() / 255.0f), (float)((float)wD2.f$a.getGreen() / 255.0f), (float)((float)wD2.f$a.getBlue() / 255.0f), (float)0.7f);
            GL11.glLoadIdentity();
            GL11.glLineWidth((float)((s)yB.f$E(0.f$d)).f$E().floatValue());
            ((i)yB.f$J().entityRenderer).f$E(sE2.f$E());
            if (((Boolean)yB.f$e(0.f$d).f$E()).booleanValue()) {
                GL11.glBegin((int)1);
                wD2 = new Vec3d(0.0, 0.0, 1.0).rotatePitch(-((float)Math.toRadians(entityPlayerSP.rotationPitch))).rotateYaw(-((float)Math.toRadians(entityPlayerSP.rotationYaw)));
                GL11.glVertex3d((double)((Vec3d)wD2).x, (double)((double)entityPlayerSP.getEyeHeight() + ((Vec3d)wD2).y), (double)((Vec3d)wD2).z);
                GL11.glVertex3d((double)d3, (double)d4, (double)d5);
                GL11.glEnd();
            }
            GL11.glTranslated((double)d3, (double)d4, (double)d5);
            GL11.glTranslated((double)(-d3), (double)(-d4), (double)(-d5));
            Uh.f$K(axisAlignedBB);
            GlStateManager.popMatrix();
            Uh.f$e();
            GlStateManager.pushMatrix();
            wD2 = yB.f$E(0.f$d, d, va3.f$E(), d2);
            eC eC3 = 0;
            if (entityPlayerSP.getDistance(d, va3.f$E(), d2) > 150.0) {
                yB.f$a(eC3.f$d, va3, ((Vec3d)wD2).x - ((K)yB.f$d().getRenderManager()).getRenderPosX(), ((Vec3d)wD2).y - ((K)yB.f$l().getRenderManager()).getRenderPosY() + 0.7, ((Vec3d)wD2).z - ((K)yB.f$k().getRenderManager()).getRenderPosZ(), sE2.f$E(), d, d2);
            } else {
                yB.f$E(eC3.f$d, va3, d3, d4 + 0.7, d5, sE2.f$E(), d, d2);
            }
            GlStateManager.popMatrix();
        }
    }
}
 */