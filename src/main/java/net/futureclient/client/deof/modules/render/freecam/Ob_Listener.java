package net.futureclient.client.deof.modules.render.freecam;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.WorldClientEvent;

public class Ob_Listener extends Listener<WorldClientEvent> {
    public final FreeCam f$d;

    public Ob_Listener(FreeCam rA2) {
        f$d = rA2;
    }

    @Override
    public void invoke(WorldClientEvent de) {
        f$d.setEnabled(false);
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.De;
import net.futureclient.client.Ha;
import net.futureclient.client.rA;

public class Ob
extends Ha<De> {
    public final rA f$d;

    public Ob(rA rA2) {
        0.f$d = rA2;
    }

    @Override
    public void f$E(De de) {
        0.f$d.f$E(false);
    }
}
 */