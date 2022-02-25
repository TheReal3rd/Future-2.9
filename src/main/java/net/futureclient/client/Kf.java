package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.EntityLivingBase;

public class Kf
extends RF {
    private RenderLivingBase<?> f$M;
    private ModelBase f$d;
    private EntityLivingBase f$g;

    public RenderLivingBase<?> f$E() {
        Kf kf;
        return kf.f$M;
    }

    public Kf(RenderLivingBase<?> renderLivingBase, EntityLivingBase entityLivingBase, ModelBase modelBase) {
        Kf kf = 0;
        0.f$M = renderLivingBase;
        kf.f$g = entityLivingBase;
        kf.f$d = modelBase;
    }

    public ModelBase f$E() {
        Kf kf;
        return kf.f$d;
    }

    public EntityLivingBase f$E() {
        Kf kf;
        return kf.f$g;
    }
}
package net.futureclient.client;

import java.awt.Color;
import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.aj;
import net.futureclient.client.hF;
import net.futureclient.client.iE;
import net.futureclient.client.kH;
import net.futureclient.client.sE;
import net.futureclient.client.wD;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;

public class KF
extends Ha<sE> {
    public final hF f$d;

    public KF(hF hF2) {
        0.f$d = hF2;
    }

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)1048575);
        if (hF.f$E(0.f$d) != null) {
            double d = (double)iE.f$E((iE)hF.f$E(0.f$d)).func_177958_n() - ((K)hF.f$h().getRenderManager()).getRenderPosX();
            double d2 = (double)iE.f$E((iE)hF.f$E(0.f$d)).func_177956_o() - ((K)hF.f$A().getRenderManager()).getRenderPosY();
            double d3 = (double)iE.f$E((iE)hF.f$E(0.f$d)).func_177952_p() - ((K)hF.f$K().getRenderManager()).getRenderPosZ();
            BlockPos blockPos = new BlockPos(iE.f$E((iE)hF.f$E(0.f$d)).func_177958_n(), iE.f$E((iE)hF.f$E(0.f$d)).func_177956_o(), iE.f$E((iE)hF.f$E(0.f$d)).func_177952_p());
            blockPos = hF.f$B().world.func_180495_p(blockPos).func_185900_c((IBlockAccess)hF.f$e().world, blockPos);
            Object object = (wD)kH.f$E().f$E().f$E(wD.class);
            object = new Color((float)((wD)object).f$a.getRed() / 255.0f, (float)((wD)object).f$a.getGreen() / 255.0f, (float)((wD)object).f$a.getBlue() / 255.0f, 0.9f);
            Uh.f$B();
            aj.f$E(new AxisAlignedBB(d + blockPos.minX, d2 + blockPos.minY, d3 + blockPos.minZ, d + blockPos.maxX, d2 + blockPos.maxY, d3 + blockPos.maxZ), 1.5f, (Color)object);
            Uh.f$e();
            object = new Color((float)((Color)object).getRed() / 255.0f, (float)((Color)object).getGreen() / 255.0f, (float)((Color)object).getBlue() / 255.0f, 0.3f);
            Uh.f$B();
            aj.f$E(new AxisAlignedBB(d + blockPos.minX, d2 + blockPos.minY, d3 + blockPos.minZ, d + blockPos.maxX, d2 + blockPos.maxY, d3 + blockPos.maxZ), (Color)object);
            Uh.f$e();
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }
}
package net.futureclient.client;

public enum kF {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kF() {
        kF kF2;
    }
}
package net.futureclient.client;

import net.futureclient.client.kF;

public class kf {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            kf.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            kf.f$d[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
