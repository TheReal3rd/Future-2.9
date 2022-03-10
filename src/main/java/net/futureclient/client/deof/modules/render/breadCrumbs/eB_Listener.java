package net.futureclient.client.deof.modules.render.breadCrumbs;

public class eB_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.Qc;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.kH;
import net.futureclient.client.sE;
import net.futureclient.client.wD;
import org.lwjgl.opengl.GL11;

public class eB
extends Ha<sE> {
    public final Qc f$d;

    public eB(Qc qc) {
        0.f$d = qc;
    }

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        if (!((Boolean)Qc.f$E(0.f$d).f$E()).booleanValue()) {
            return;
        }
        if (Qc.f$E(0.f$d) == null) {
            return;
        }
        Uh.f$B();
        GL11.glLineWidth((float)Qc.f$E(0.f$d).f$E().floatValue());
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        GL11.glColor4f((float)((float)wD2.f$a.getRed() / 255.0f), (float)((float)wD2.f$a.getGreen() / 255.0f), (float)((float)wD2.f$a.getBlue() / 255.0f), (float)0.5f);
        Qc.f$E(0.f$d).forEach(zH -> {
            GL11.glBegin((int)3);
            zH.f$E().forEach(oI -> {
                double d = oI.f$M - ((K)Qc.f$e().getRenderManager()).getRenderPosX();
                double d2 = oI.f$g - ((K)Qc.f$a().getRenderManager()).getRenderPosY();
                double d3 = oI.f$d - ((K)Qc.f$E().getRenderManager()).getRenderPosZ();
                GL11.glVertex3d((double)d, (double)d2, (double)d3);
            });
            GL11.glEnd();
        });
        GL11.glColor4f((float)((float)wD2.f$a.getRed() / 255.0f), (float)((float)wD2.f$a.getGreen() / 255.0f), (float)((float)wD2.f$a.getBlue() / 255.0f), (float)1.0f);
        GL11.glBegin((int)3);
        Qc.f$E(0.f$d).f$E().forEach(oI -> {
            double d = oI.f$M - ((K)Qc.f$A().getRenderManager()).getRenderPosX();
            double d2 = oI.f$g - ((K)Qc.f$K().getRenderManager()).getRenderPosY();
            double d3 = oI.f$d - ((K)Qc.f$B().getRenderManager()).getRenderPosZ();
            GL11.glVertex3d((double)d, (double)d2, (double)d3);
        });
        GL11.glEnd();
        Uh.f$e();
    }
}
 */