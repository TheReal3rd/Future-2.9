package net.futureclient.client;

import net.futureclient.client.kF;
import net.futureclient.client.pa;

public class Ua {
    public static final int[] f$g;
    public static final int[] f$d;

    static {
        f$d = new int[pa.values().length];
        try {
            Ua.f$d[pa.f$j.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ua.f$d[pa.f$i.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ua.f$d[pa.f$M.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ua.f$d[pa.f$g.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[kF.values().length];
        try {
            Ua.f$g[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ua.f$g[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
