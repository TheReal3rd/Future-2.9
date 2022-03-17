package net.futureclient.client;

import net.futureclient.client.ff;
import net.minecraft.util.math.RayTraceResult;

public class Lg
extends ff {
    private RayTraceResult f$d;

    public RayTraceResult f$E() {
        Lg lg;
        return lg.f$d;
    }

    public void f$E(RayTraceResult rayTraceResult) {
        0.f$d = rayTraceResult;
    }

    public Lg(RayTraceResult rayTraceResult) {
        0.f$d = rayTraceResult;
    }
}
package net.futureclient.client;

import net.futureclient.client.ZG;

public class lG {
    private ZG f$d;
    private static final lG f$g;

    public boolean f$E() {
        lG lG2;
        return lG2.f$d == ZG.f$g;
    }

    public lG() {
        lG lG2;
        lG2.f$d = ZG.f$M;
    }

    public ZG f$E() {
        lG lG2;
        return lG2.f$d;
    }

    public void f$E(ZG zG) {
        0.f$d = zG;
    }

    public static lG f$E() {
        return f$g;
    }

    static {
        f$g = new lG();
    }
}
