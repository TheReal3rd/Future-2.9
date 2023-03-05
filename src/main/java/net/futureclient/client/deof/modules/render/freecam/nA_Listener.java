package net.futureclient.client.deof.modules.render.freecam;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.RayTraceEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;

public class nA_Listener extends Listener<RayTraceEvent> {
    public final FreeCam f$d;

    public nA_Listener(FreeCam rA2) {
        f$d = rA2;
    }

    @Override
    public void invoke(RayTraceEvent lg) {
        RayTraceResult rayTraceResult = lg.getRayTraceResult();
        if (rayTraceResult != null && rayTraceResult.typeOfHit == RayTraceResult.Type.ENTITY && rayTraceResult.entityHit == Minecraft.getMinecraft().player) {
            lg.setRayTraceResult(new RayTraceResult(RayTraceResult.Type.MISS, rayTraceResult.hitVec, null, new BlockPos(rayTraceResult.hitVec)));
        }
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Lg;
import net.futureclient.client.rA;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;

public class nA
extends Ha<Lg> {
    public final rA f$d;

    @Override
    public void f$E(Lg lg) {
        RayTraceResult rayTraceResult = lg.f$E();
        if (rayTraceResult != null && rayTraceResult.typeOfHit == RayTraceResult.Type.ENTITY && rayTraceResult.entityHit == rA.f$c().player) {
            lg.f$E(new RayTraceResult(RayTraceResult.Type.MISS, rayTraceResult.hitVec, null, new BlockPos(rayTraceResult.hitVec)));
        }
    }

    public nA(rA rA2) {
        0.f$d = rA2;
    }
}
 */