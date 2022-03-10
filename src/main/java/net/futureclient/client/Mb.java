package net.futureclient.client;

import net.futureclient.client.xC;

public class mB {
    public static final int[] f$d;

    static {
        f$d = new int[xC.values().length];
        try {
            mB.f$d[xC.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            mB.f$d[xC.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

public enum mb {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private mb() {
        mb mb2;
    }
}
