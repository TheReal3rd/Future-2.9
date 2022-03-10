package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.gF;
import net.futureclient.client.q;
import net.minecraft.entity.Entity;

public class FF
extends Ha<ME> {
    public final gF f$d;

    @Override
    public void f$E(ME mE) {
        if (gF.f$E(0.f$d).size() > 20) {
            gF.f$E(0.f$d).poll();
        }
        gF.f$E(0.f$d).add(Pg.f$E((Entity)gF.f$a().player) * (double)((q)((Y)gF.f$E()).getTimer()).f$E());
        double d = 0.0;
        Iterator iterator = gF.f$E(0.f$d).iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            double d2 = (Double)iterator.next();
            d += d2;
            iterator2 = iterator;
        }
        gF.f$E(0.f$d, d / (double)gF.f$E(0.f$d).size());
    }

    public FF(gF gF2) {
        0.f$d = gF2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Kf;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.EntityLivingBase;

public class Ff
extends Kf {
    private float f$g;
    private float f$M;
    private float f$j;
    private float f$i;
    private float f$d;
    private float f$b;

    public Ff(RenderLivingBase<?> renderLivingBase, EntityLivingBase entityLivingBase, ModelBase modelBase, float f, float f2, float f3, float f4, float f5, float f6) {
        Ff ff = 0;
        Ff ff2 = 0;
        Ff ff3 = 0;
        super(renderLivingBase, entityLivingBase, modelBase);
        ff3.f$b = f;
        ff3.f$j = f2;
        ff2.f$i = f3;
        ff2.f$M = f4;
        ff.f$g = f5;
        ff.f$d = f6;
    }

    public float f$B() {
        Ff ff;
        return ff.f$i;
    }

    public float f$K() {
        Ff ff;
        return ff.f$j;
    }

    public float f$e() {
        Ff ff;
        return ff.f$M;
    }

    public float f$E() {
        Ff ff;
        return ff.f$d;
    }

    public float f$A() {
        Ff ff;
        return ff.f$b;
    }

    public float f$a() {
        Ff ff;
        return ff.f$g;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public abstract class ff
extends RF {
    public ff() {
        ff ff2;
    }
}
