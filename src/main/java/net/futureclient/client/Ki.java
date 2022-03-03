package net.futureclient.client;

import net.futureclient.client.jG;

public class Ki {
    public static final int[] f$d;

    static {
        f$d = new int[jG.values().length];
        try {
            Ki.f$d[jG.f$K.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ki.f$d[jG.f$b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ki.f$d[jG.f$i.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ki.f$d[jG.f$j.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

public enum ki {
    f$i("Mojang"),
    f$M("TheAltening");

    private String f$g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ki(String string) {
        ki ki2;
        ki2.f$g = 0;
    }

    public String f$E() {
        ki ki2;
        return ki2.f$g;
    }
}
