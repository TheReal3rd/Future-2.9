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
