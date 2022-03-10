package net.futureclient.client.deof.modules.render.search;

public class iB_Listener {
}
/*
package net.futureclient.client;

import java.awt.Color;
import java.util.List;
import net.futureclient.client.Gb;
import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.OI;
import net.futureclient.client.Uh;
import net.futureclient.client.Y;
import net.futureclient.client.YE;
import net.futureclient.client.aj;
import net.futureclient.client.i;
import net.futureclient.client.s;
import net.futureclient.client.sE;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;

public class iB
extends Ha<sE> {
    public final Gb f$d;

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        Frustum frustum = new Frustum();
        EntityPlayerSP entityPlayerSP = Gb.f$L().getRenderViewEntity() == null ? Gb.f$i().player : Gb.f$c().getRenderViewEntity();
        frustum.setPosition(entityPlayerSP.lastTickPosX + (entityPlayerSP.posX - entityPlayerSP.lastTickPosX) * (double)((Y)Gb.f$I()).getTimer().renderPartialTicks, entityPlayerSP.lastTickPosY + (entityPlayerSP.posY - entityPlayerSP.lastTickPosY) * (double)((Y)Gb.f$j()).getTimer().renderPartialTicks, entityPlayerSP.lastTickPosZ + (entityPlayerSP.posZ - entityPlayerSP.lastTickPosZ) * (double)((Y)Gb.f$M()).getTimer().renderPartialTicks);
        for (OI oI : 0.f$d.f$g) {
            AxisAlignedBB axisAlignedBB;
            BlockPos blockPos = new BlockPos(oI.f$e(), oI.f$a(), oI.f$E());
            IBlockState iBlockState = Gb.f$C().world.func_180495_p(blockPos);
            if (!(entityPlayerSP.getDistance(oI.f$e(), oI.f$a(), oI.f$E()) <= 256.0) || !((List)Gb.f$E(0.f$d).f$E()).contains(iBlockState.getBlock())) continue;
            iB iB2 = 0;
            int n = Gb.f$E(iB2.f$d, iBlockState);
            float f = (float)(n >> 24 & 0xFF) / 255.0f;
            float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
            float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(n & 0xFF) / 255.0f;
            Color color = new Color(f, f2, f3, f4);
            if ((((Boolean)Gb.f$e(iB2.f$d).f$E()).booleanValue() || ((Boolean)Gb.f$a(0.f$d).f$E()).booleanValue()) && frustum.isBoundingBoxInFrustum(axisAlignedBB = iBlockState.func_185900_c((IBlockAccess)Gb.f$H().world, blockPos).offset((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p()))) {
                AxisAlignedBB axisAlignedBB2 = axisAlignedBB.offset(-((K)Gb.f$h().getRenderManager()).getRenderPosX(), -((K)Gb.f$A().getRenderManager()).getRenderPosY(), -((K)Gb.f$K().getRenderManager()).getRenderPosZ());
                if (((Boolean)Gb.f$e(0.f$d).f$E()).booleanValue()) {
                    Uh.f$B();
                    aj.f$E(axisAlignedBB2, 1.5f, color);
                    Uh.f$e();
                }
                if (((Boolean)Gb.f$a(0.f$d).f$E()).booleanValue()) {
                    Uh.f$B();
                    aj.f$E(axisAlignedBB2, color);
                    Uh.f$e();
                }
            }
            if (!((Boolean)Gb.f$E(0.f$d).f$E()).booleanValue()) continue;
            double d = oI.f$e() - ((K)Gb.f$B().getRenderManager()).getRenderPosX();
            double d2 = oI.f$a() - ((K)Gb.f$e().getRenderManager()).getRenderPosY();
            double d3 = oI.f$E() - ((K)Gb.f$a().getRenderManager()).getRenderPosZ();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            Uh.f$B();
            GL11.glLoadIdentity();
            GL11.glLineWidth((float)((s)Gb.f$E(0.f$d)).f$E().floatValue());
            ((i)Gb.f$E().entityRenderer).f$E(sE2.f$E());
            oI = new Vec3d(0.0, 0.0, 1.0).rotatePitch(-((float)Math.toRadians(entityPlayerSP.rotationPitch))).rotateYaw(-((float)Math.toRadians(entityPlayerSP.rotationYaw)));
            GL11.glBegin((int)1);
            GL11.glVertex3d((double)((Vec3d)oI).x, (double)((double)entityPlayerSP.getEyeHeight() + ((Vec3d)oI).y), (double)((Vec3d)oI).z);
            GL11.glVertex3d((double)(d + 0.5), (double)(d2 + 0.5), (double)(d3 + 0.5));
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glEnd();
            Uh.f$e();
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public iB(Gb gb) {
        0.f$d = gb;
    }
}
 */