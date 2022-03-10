package net.futureclient.client;

import net.futureclient.client.Vf;
import net.futureclient.client.kF;

public class Ef {
    public static final int[] f$d;
    public static final int[] f$g;

    static {
        f$d = new int[kF.values().length];
        try {
            Ef.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[Vf.values().length];
        try {
            Ef.f$g[Vf.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ef.f$g[Vf.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

public enum eF {
    f$C,
    f$e,
    f$I,
    f$K,
    f$b,
    f$j,
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eF() {
        eF eF2;
    }
}
