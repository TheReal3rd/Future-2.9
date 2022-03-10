package net.futureclient.client.deof.modules.movement.fakeLag;

public class oB_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.jc;
import net.futureclient.client.kH;
import net.futureclient.client.sE;
import net.futureclient.client.wD;
import org.lwjgl.opengl.GL11;

public class oB
extends Ha<sE> {
    public final jc f$d;

    public oB(jc jc2) {
        0.f$d = jc2;
    }

    @Override
    public void f$E(sE sE2) {
        if (sE2.f$E().equals((Object)YE.f$g) || !((Boolean)jc.f$E(0.f$d).f$E()).booleanValue() || jc.f$E(0.f$d) == null) {
            return;
        }
        GL11.glPushMatrix();
        Uh.f$B();
        GL11.glLineWidth((float)1.6f);
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        GL11.glColor4f((float)((float)wD2.f$a.getRed() / 255.0f), (float)((float)wD2.f$a.getGreen() / 255.0f), (float)((float)wD2.f$a.getBlue() / 255.0f), (float)0.5f);
        GL11.glBegin((int)3);
        jc.f$E(0.f$d).f$E().forEach(oI -> {
            double d = oI.f$M - ((K)jc.f$B().getRenderManager()).getRenderPosX();
            double d2 = oI.f$g - (double)jc.f$e().player.field_70131_O + 2.0 - ((K)jc.f$a().getRenderManager()).getRenderPosY();
            double d3 = oI.f$d - ((K)jc.f$E().getRenderManager()).getRenderPosZ();
            GL11.glVertex3d((double)d, (double)d2, (double)d3);
        });
        GL11.glEnd();
        Uh.f$e();
        GL11.glPopMatrix();
    }
}
 */