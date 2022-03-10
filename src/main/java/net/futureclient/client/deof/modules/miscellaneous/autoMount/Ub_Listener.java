package net.futureclient.client.deof.modules.miscellaneous.autoMount;

public class Ub_Listener {
}
/*
package net.futureclient.client;

import java.util.Comparator;
import java.util.Random;
import net.futureclient.client.HE;
import net.futureclient.client.Ha;
import net.futureclient.client.Lc;
import net.futureclient.client.Pf;
import net.futureclient.client.TH;
import net.futureclient.client.kH;
import net.futureclient.client.s;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySkeletonHorse;

public class Ub
extends Ha<Pf> {
    public final Lc f$d;

    public Ub(Lc lc) {
        0.f$d = lc;
    }

    @Override
    public void f$E(Pf pf) {
        Object object = (HE)kH.f$E().f$E().f$E(HE.class);
        if (object != null && ((HE)object).f$j) {
            return;
        }
        switch (pf.f$E()) {
            case f$M: {
                while (false) {
                }
                Lc.f$E(0.f$d, Lc.f$a().world.field_72996_f.stream().filter(entity -> Lc.f$E(0.f$d, entity) && (entity instanceof EntityBoat && (Boolean)Lc.f$A(0.f$d).f$E() != false || entity instanceof EntityHorse && (Boolean)Lc.f$K(0.f$d).f$E() != false || entity instanceof EntitySkeletonHorse && (Boolean)Lc.f$B(0.f$d).f$E() != false || (entity instanceof EntityDonkey || entity instanceof EntityMule) && (Boolean)Lc.f$e(0.f$d).f$E() != false || entity instanceof EntityLlama && (Boolean)Lc.f$a(0.f$d).f$E() != false || entity instanceof EntityPig && (Boolean)Lc.f$E(0.f$d).f$E() != false && ((EntityPig)entity).getSaddled())).min(Comparator.comparing(entity -> Float.valueOf(entity.getDistance((Entity)Lc.f$E().player)))).orElse(null));
                if (Lc.f$E(0.f$d) == null) {
                    return;
                }
                float[] fArray = TH.f$E(Lc.f$E(0.f$d), null);
                object = fArray;
                Pf pf2 = pf;
                pf2.f$a((float)(object[0] + new Random().nextFloat() * 2.0f - 1.0f));
                pf2.f$E(TH.f$E(fArray[1] + new Random().nextFloat() * 2.0f - 1.0f));
                return;
            }
            case f$g: {
                if (Lc.f$E(0.f$d) == null) {
                    return;
                }
                if (!Lc.f$E(0.f$d).f$a(((s)Lc.f$E(0.f$d)).f$E().floatValue() * 1000.0f)) break;
                Ub ub = 0;
                Lc.f$E(0.f$d, Lc.f$E(ub.f$d));
                Lc.f$E(ub.f$d).f$a();
            }
        }
    }
}
 */