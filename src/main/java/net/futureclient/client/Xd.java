package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.util.math.AxisAlignedBB;

public class Xd
extends RF {
    private final AxisAlignedBB f$d;

    public Xd(AxisAlignedBB axisAlignedBB) {
        0.f$d = axisAlignedBB;
    }

    public AxisAlignedBB f$E() {
        Xd xd;
        return xd.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.BE;
import net.futureclient.client.TD;
import net.futureclient.client.pF;
import net.futureclient.client.yD;

public class XD {
    public static final int[] f$g;
    public static final int[] f$d;
    public static final int[] f$M;
    public static final int[] f$i;

    static {
        f$d = new int[BE.values().length];
        try {
            XD.f$d[BE.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            XD.f$d[BE.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[yD.values().length];
        try {
            XD.f$g[yD.f$i.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            XD.f$g[yD.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            XD.f$g[yD.f$M.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$M = new int[pF.values().length];
        try {
            XD.f$M[pF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            XD.f$M[pF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$i = new int[TD.values().length];
        try {
            XD.f$i[TD.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            XD.f$i[TD.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class xd
extends RF {
    public xd() {
        xd xd2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.bE;
import net.futureclient.client.iD;

public class xD
extends Ha<iD> {
    public final bE f$d;

    @Override
    public void f$E(iD iD2) {
        iD2.f$E(true);
    }

    public xD(bE bE2) {
        0.f$d = bE2;
    }
}
