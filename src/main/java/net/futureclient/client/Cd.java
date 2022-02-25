package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Lg;
import net.futureclient.client.qF;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;

public class Cd
extends Ha<Lg> {
    public final qF f$d;

    @Override
    public void f$E(Lg lg) {
        if (!qF.f$a(0.f$d)) {
            return;
        }
        RayTraceResult rayTraceResult = lg.f$E();
        if (rayTraceResult != null && rayTraceResult.typeOfHit != RayTraceResult.Type.MISS) {
            lg.f$E(new RayTraceResult(RayTraceResult.Type.MISS, rayTraceResult.hitVec, null, new BlockPos(rayTraceResult.hitVec)));
        }
    }

    public Cd(qF qF2) {
        0.f$d = qF2;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class CD
extends RF {
    public CD() {
        CD cD;
    }
}
package net.futureclient.client;

import net.futureclient.client.nD;

public enum cD {
    f$j(nD.f$b),
    f$i(nD.f$j),
    f$M(nD.f$i);

    private final nD f$g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cD(nD nD2) {
        cD cD2;
        cD2.f$g = 0;
    }

    public nD f$E() {
        cD cD2;
        return cD2.f$g;
    }
}
package net.futureclient.client;

import net.futureclient.client.BA;
import net.futureclient.client.Ha;
import net.futureclient.client.KC;
import net.futureclient.client.ne;

public class cd
extends Ha<ne> {
    public final KC f$d;

    public cd(KC kC) {
        0.f$d = kC;
    }

    @Override
    public void f$E(ne ne2) {
        if (((Boolean)KC.f$a(0.f$d).f$E()).booleanValue() && KC.f$E(0.f$d).f$E() == BA.f$K) {
            ne2.f$E(true);
        }
    }
}
