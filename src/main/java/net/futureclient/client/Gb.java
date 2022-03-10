package net.futureclient.client;

import net.futureclient.client.kF;
import net.futureclient.client.qb;

public class GB {
    public static final int[] f$g;
    public static final int[] f$d;

    static {
        f$d = new int[qb.values().length];
        try {
            GB.f$d[qb.f$i.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GB.f$d[qb.f$M.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GB.f$d[qb.f$g.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[kF.values().length];
        try {
            GB.f$g[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GB.f$g[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

