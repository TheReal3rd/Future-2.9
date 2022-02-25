package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.Hc;
import net.futureclient.client.ME;
import net.futureclient.client.Pg;
import net.futureclient.client.Tc;

public class TC
extends Ha<ME> {
    public final Hc f$d;

    public TC(Hc hc) {
        0.f$d = hc;
    }

    @Override
    public void f$E(ME mE) {
        if (!Hc.f$E(0.f$d).f$E(800L)) {
            return;
        }
        if (Hc.f$E(0.f$d).f$E() == Tc.f$i) {
            if (Pg.f$E().fallDistance > 3.0f) {
                return;
            }
            if ((Hc.f$B().player.func_180799_ab() || Hc.f$e().player.func_70090_H()) && !Hc.f$a().player.isSneaking()) {
                Pg.f$E().motionY = 0.1;
                return;
            }
            if (CG.f$E() && !Hc.f$E().player.isSneaking()) {
                Pg.f$E().motionY = 0.1;
            }
        }
    }
}
package net.futureclient.client;

public enum Tc {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Tc() {
        Tc tc;
    }
}
package net.futureclient.client;

import net.futureclient.client.kF;

public class tc {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            tc.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.GA;
import net.futureclient.client.fB;

public class tC
extends GA {
    public final fB f$d;

    @Override
    public String f$E() {
        return null;
    }

    public tC(fB fB2, String[] stringArray) {
        0.f$d = fB2;
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        fB.f$E(0.f$d);
        return "Downloading songs...";
    }
}
