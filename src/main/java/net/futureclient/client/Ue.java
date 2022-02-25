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

import net.futureclient.client.Af;
import net.futureclient.client.DD;
import net.futureclient.client.Ha;
import net.minecraft.network.Packet;

public class uE
extends Ha<Af> {
    public final DD f$d;

    public uE(DD dD) {
        0.f$d = dD;
    }

    @Override
    public void f$E(Af af) {
        if (DD.f$E(0.f$d).f$E((long)DD.f$E(0.f$d).f$E().intValue())) {
            DD.f$E(0.f$d).forEach(cPacketKeepAlive -> DD.f$E().player.connection.sendPacket((Packet)cPacketKeepAlive));
            uE uE2 = 0;
            DD.f$E(uE2.f$d).clear();
            DD.f$E(uE2.f$d).f$a();
        }
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
