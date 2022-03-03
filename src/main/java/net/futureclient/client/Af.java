package net.futureclient.client;

import net.futureclient.client.RF;

public class Af
extends RF {
    public Af() {
        Af af;
    }
}
package net.futureclient.client;

import java.util.concurrent.TimeUnit;
import net.futureclient.client.Ha;
import net.futureclient.client.Ie;
import net.futureclient.client.ME;

public class aF
extends Ha<ME> {
    public final Ie f$d;

    public aF(Ie ie) {
        0.f$d = ie;
    }

    @Override
    public void f$E(ME mE) {
        Ie.f$E(0.f$d).entrySet().removeIf(entry -> {
            long l = System.currentTimeMillis();
            return entry.getValue() > TimeUnit.SECONDS.toMillis(30L);
        });
    }
}
package net.futureclient.client;

import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.lE;

public class af
extends Ha<Ee> {
    public final lE f$d;

    public af(lE lE2) {
        0.f$d = lE2;
    }

    @Override
    public void f$E(Ee ee) {
        if (((Boolean)lE.f$E(0.f$d).f$E()).booleanValue()) {
            ee.f$a(true);
        }
    }
}
