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
