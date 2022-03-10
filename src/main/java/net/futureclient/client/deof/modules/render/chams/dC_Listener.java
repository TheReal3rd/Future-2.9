package net.futureclient.client.deof.modules.render.chams;

public class dC_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Dd;
import net.futureclient.client.Ff;
import net.futureclient.client.Ha;
import net.futureclient.client.zA;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;

public class dC
extends Ha<Ff> {
    public final Dd f$d;

    @Override
    public void f$E(Ff ff) {
        if (!zA.f$b) {
            return;
        }
        EntityLivingBase entityLivingBase = ff.f$E();
        if (!Dd.f$E(0.f$d, (Entity)entityLivingBase)) {
            return;
        }
        ff.f$E(true);
        boolean bl = GL11.glIsEnabled((int)2896);
        boolean bl2 = GL11.glIsEnabled((int)3042);
        GL11.glPushAttrib((int)1048575);
        GL11.glDisable((int)3008);
        if (!((Boolean)Dd.f$a(0.f$d).f$E()).booleanValue()) {
            GL11.glDisable((int)3553);
        }
        if (bl) {
            GL11.glDisable((int)2896);
        }
        if (!bl2) {
            GL11.glEnable((int)3042);
        }
        GL11.glBlendFunc((int)770, (int)771);
        if (((Boolean)Dd.f$E(0.f$d).f$E()).booleanValue()) {
            GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glDepthMask((boolean)false);
            GL11.glDisable((int)2929);
            OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)240.0f, (float)240.0f);
            Dd.f$E(0.f$d, ff);
        }
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2896);
        if (!((Boolean)Dd.f$a(0.f$d).f$E()).booleanValue()) {
            GL11.glEnable((int)3553);
        }
        GL11.glEnable((int)3008);
        GL11.glPopAttrib();
        GL11.glPushAttrib((int)1048575);
        GL11.glDisable((int)3008);
        if (!((Boolean)Dd.f$a(0.f$d).f$E()).booleanValue()) {
            GL11.glDisable((int)3553);
        }
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)0.0f, (float)1.0f, (float)0.0f, (float)1.0f);
        OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)240.0f, (float)240.0f);
        Dd.f$E(0.f$d, ff);
        if (!bl2) {
            GL11.glDisable((int)3042);
        }
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        if (bl) {
            GL11.glEnable((int)2896);
        }
        if (!((Boolean)Dd.f$a(0.f$d).f$E()).booleanValue()) {
            GL11.glEnable((int)3553);
        }
        GL11.glEnable((int)3008);
        GL11.glPopAttrib();
    }

    public dC(Dd dd) {
        0.f$d = dd;
    }
}
 */