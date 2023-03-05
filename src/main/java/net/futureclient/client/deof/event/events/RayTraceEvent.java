package net.futureclient.client.deof.event.events;

import net.minecraft.util.math.RayTraceResult;

public class RayTraceEvent extends ff_Unknown_Event {
    private RayTraceResult rayTraceResult;

    public RayTraceEvent(RayTraceResult rayTraceResult) {
        this.rayTraceResult = rayTraceResult;
    }
    public RayTraceResult getRayTraceResult() {
        return rayTraceResult;
    }

    public void setRayTraceResult(RayTraceResult rayTraceResult) {
        this.rayTraceResult = rayTraceResult;
    }
}
/*
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
 */