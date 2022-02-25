package net.futureclient.client;

import net.futureclient.client.Yd;

public final class LF
extends Yd {
    private double f$d;

    public LF() {
        LF lF;
    }

    public void f$E(double d) {
        0.f$d = d;
    }

    public double f$E() {
        LF lF;
        return lF.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Fg;
import net.futureclient.client.Jg;
import net.futureclient.client.kF;

public class Lf {
    public static final int[] f$d;
    public static final int[] f$g;
    public static final int[] f$M;

    static {
        f$d = new int[Jg.values().length];
        try {
            Lf.f$d[Jg.f$g.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Lf.f$d[Jg.f$i.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Lf.f$d[Jg.f$M.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[Fg.values().length];
        try {
            Lf.f$g[Fg.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Lf.f$g[Fg.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$M = new int[kF.values().length];
        try {
            Lf.f$M[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Lf.f$M[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.BD;
import net.futureclient.client.QE;
import net.futureclient.client.kH;
import net.futureclient.client.lg;
import net.futureclient.client.nf;

public class lf extends QE<lg> {
    @Override
    public boolean f$E(int n) {
        for (lg lg2 : 0.f$d) {
            if (n != lg2.f$E()) continue;
            return true;
        }
        return false;
    }

    @Override
    public void f$E(int n2) {
        lg n2 = 0.f$E(n2);
        if (n2 != null) {
            0.f$d.remove(n2);
        }
    }

    public lf() {
        lf lf2;
        lf lf3 = lf2;
        lf3.f$d = new ArrayList();
        kH.f$E().f$E().f$a(new BD(lf2));
        new nf(lf2, "macros.txt");
    }

    @Override
    public lg f$E(int n) {
        for (lg lg2 : 0.f$d) {
            if (n != lg2.f$E()) continue;
            return lg2;
        }
        return null;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class lF
extends RF {
    public lF() {
        lF lF2;
    }
}
