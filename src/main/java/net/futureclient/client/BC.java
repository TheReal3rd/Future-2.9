package net.futureclient.client;

import net.futureclient.client.Ce;
import net.futureclient.client.Ha;
import net.futureclient.client.Hc;
import net.futureclient.client.Pg;

public class BC
extends Ha<Ce> {
    public final Hc f$d;

    @Override
    public void f$E(Ce ce) {
        if ((Pg.f$E().isInWater() || Pg.f$E().isInLava()) && (Pg.f$E().motionY == 0.1 || Pg.f$E().motionY == 0.5)) {
            ce.f$E(true);
        }
    }

    public BC(Hc hc) {
        0.f$d = hc;
    }
}
package net.futureclient.client;

import net.futureclient.client.hA;
import net.futureclient.client.kF;

public class Bc {
    public static final int[] f$d;
    public static final int[] f$g;

    static {
        f$d = new int[kF.values().length];
        try {
            Bc.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[hA.values().length];
        try {
            Bc.f$g[hA.f$i.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Bc.f$g[hA.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Bc.f$g[hA.f$M.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.PD;
import net.futureclient.client.rA;
import net.minecraft.util.MovementInputFromOptions;

public class bc
extends Ha<PD> {
    public final rA f$d;

    @Override
    public void f$E(PD pD) {
        if (rA.f$f().player.movementInput.getClass() == MovementInputFromOptions.class) {
            rA.f$L().player.movementInput = rA.f$E();
        }
    }

    public bc(rA rA2) {
        0.f$d = rA2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Wd;
import net.futureclient.client.sC;

public class bC
extends Ha<Wd> {
    public final sC f$d;

    @Override
    public void f$E(Wd wd) {
        Wd wd2 = wd;
        wd2.f$E(true);
        wd2.f$E(0.f$d.f$d.f$E().floatValue());
    }

    public bC(sC sC2) {
        0.f$d = sC2;
    }
}
