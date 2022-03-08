package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Tf;

public class Gg
extends Ha<ME> {
    public final Tf f$d;

    public Gg(Tf tf) {
        0.f$d = tf;
    }

    @Override
    public void f$E(ME mE) {
        if (Tf.f$e(0.f$d) != 0.0 && Tf.f$a(0.f$d) != 0.0 && Tf.f$E(0.f$d) != 0.0 && Tf.f$E(0.f$d)) {
            Tf.f$E().player.func_70107_b(Tf.f$e(0.f$d), Tf.f$a(0.f$d), Tf.f$E(0.f$d));
            if (Tf.f$E(0.f$d).f$E(2500L)) {
                Tf.f$E(0.f$d, false);
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Ke;
import net.futureclient.client.LE;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;

public class gg
extends Ha<Ke> {
    public final LE f$d;

    @Override
    public void f$E(Ke ke) {
        CPacketPlayerDigging cPacketPlayerDigging;
        if (ke.f$E() instanceof CPacketPlayerDigging && (cPacketPlayerDigging = (CPacketPlayerDigging)ke.f$E()).getAction().equals((Object)CPacketPlayerDigging.Action.START_DESTROY_BLOCK)) {
            LE.f$E().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, cPacketPlayerDigging.getPosition(), cPacketPlayerDigging.getFacing()));
        }
    }

    public gg(LE lE) {
        0.f$d = lE;
    }
}
