package net.futureclient.client;

import net.futureclient.client.PC;
import net.futureclient.client.mb;

public class sB {
    public static final int[] f$g;
    public static final int[] f$d;

    static {
        f$d = new int[PC.values().length];
        try {
            sB.f$d[PC.f$i.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sB.f$d[PC.f$M.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sB.f$d[PC.f$g.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[mb.values().length];
        try {
            sB.f$g[mb.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sB.f$g[mb.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

