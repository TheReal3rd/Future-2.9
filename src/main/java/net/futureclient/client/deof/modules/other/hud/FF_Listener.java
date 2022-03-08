package net.futureclient.client.deof.modules.other.hud;

public class FF_Listener {
}
/*
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
 */