
package net.futureclient.client;

import net.futureclient.client.Tc;

public class dc {
    public static final int[] f$d;

    static {
        f$d = new int[Tc.values().length];
        try {
            dc.f$d[Tc.f$g.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dc.f$d[Tc.f$M.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dc.f$d[Tc.f$i.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
