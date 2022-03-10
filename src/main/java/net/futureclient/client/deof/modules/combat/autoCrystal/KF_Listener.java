package net.futureclient.client.deof.modules.combat.autoCrystal;

public class KF_Listener {
}
/*
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
 */