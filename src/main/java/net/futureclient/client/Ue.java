package net.futureclient.client;

import net.futureclient.client.nD;
import net.minecraft.util.math.Vec3d;

public final class Ue
extends nD {
    @Override
    public Vec3d f$E(Vec3d vec3d, Vec3d vec3d2) {
        return vec3d2.addVector(0.0, 1337.69, 0.0);
    }

    public Ue(String string, int n) {
        Ue ue;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.util.MovementInput;

public abstract class ue
extends RF {
    private final MovementInput f$d;

    public ue(MovementInput movementInput) {
        0.f$d = movementInput;
    }

    public MovementInput f$E() {
        ue ue2;
        return ue2.f$d;
    }
}
