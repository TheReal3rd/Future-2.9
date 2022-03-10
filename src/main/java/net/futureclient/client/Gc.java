package net.futureclient.client;

import net.futureclient.client.Jd;
import net.futureclient.client.Wc;

public class Gc {
    public static final int[] f$g;
    public static final int[] f$d;

    static {
        f$d = new int[Wc.values().length];
        try {
            Gc.f$d[Wc.f$i.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Gc.f$d[Wc.f$M.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[Jd.values().length];
        try {
            Gc.f$g[Jd.f$i.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Gc.f$g[Jd.f$M.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Gc.f$g[Jd.f$g.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

public enum gC {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gC() {
        gC gC2;
    }
}
