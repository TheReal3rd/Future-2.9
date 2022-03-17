package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.YG;
import net.futureclient.client.YI;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketVehicleMove;

public final class UG
extends Ha<ME> {
    public final YG f$d;

    public UG(YG yG, YI yI) {
        0(yG);
    }

    @Override
    public void f$E(ME mE) {
        if (YG.f$E(0.f$d) != null) {
            if (YG.f$K((YG)0.f$d).player.func_184218_aH()) {
                YG.f$E(0.f$d, null);
                return;
            }
            UG uG = 0;
            YG.f$E(uG.f$d).setPosition(YG.f$B((YG)0.f$d).player.field_70165_t, YG.f$e((YG)0.f$d).player.field_70163_u, YG.f$a((YG)0.f$d).player.field_70161_v);
            YG.f$E((YG)uG.f$d).player.connection.sendPacket((Packet)new CPacketVehicleMove(YG.f$E(0.f$d)));
        }
    }

    private UG(YG yG) {
        UG uG;
        uG.f$d = yG;
    }
}
