package net.futureclient.client.deof.modules.movement.fakeLag;

import net.futureclient.client.LB;
import net.futureclient.client.jc;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.*;

public class RC_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.LB;
import net.futureclient.client.jc;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;

public class RC
extends Ha<ve> {
    public final jc f$d;

@Override
public void f$E(ve ve2) {
    switch ((LB)((Object) jc.f$a(0.f$d).f$E())) {
        case f$M: {
            if (!(ve2.f$E() instanceof CPacketPlayer) && !(ve2.f$E() instanceof CPacketPlayerTryUseItemOnBlock) && !(ve2.f$E() instanceof CPacketPlayerDigging) && !(ve2.f$E() instanceof CPacketUseEntity) && !(ve2.f$E() instanceof CPacketAnimation)) return;
            jc.f$E(0.f$d).add(ve2.f$E());
            ve2.f$E(true);
            return;
        }
        case f$g: {
            if (jc.f$E(0.f$d) || !(ve2.f$E() instanceof CPacketPlayer) || jc.f$E(0.f$d).contains(ve2.f$E())) return;
            jc.f$E(0.f$d).add(ve2.f$E());
            ve2.f$E(true);
            return;
        }
    }
}

    public RC(jc jc2) {
        0.f$d = jc2;
    }
}
 */