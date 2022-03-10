package net.futureclient.client;

import net.futureclient.client.kF;
import net.futureclient.client.zB;

public class Ed {
    public static final int[] f$g;
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            Ed.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ed.f$d[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[zB.values().length];
        try {
            Ed.f$g[zB.f$j.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ed.f$g[zB.f$i.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ed.f$g[zB.f$M.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

