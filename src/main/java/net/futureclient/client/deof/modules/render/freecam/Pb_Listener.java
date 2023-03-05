package net.futureclient.client.deof.modules.render.freecam;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.RenderHandEvent;

public class Pb_Listener extends Listener<RenderHandEvent> {
    public final FreeCam f$d;

    public Pb_Listener(FreeCam rA2) {
        f$d = rA2;
    }

    @Override
    public void invoke(RenderHandEvent dg) {
        dg.setCancel(true);
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Dg;
import net.futureclient.client.Ha;
import net.futureclient.client.rA;

public class Pb
extends Ha<Dg> {
    public final rA f$d;

    public Pb(rA rA2) {
        0.f$d = rA2;
    }

    @Override
    public void f$E(Dg dg) {
        dg.f$E(true);
    }
}
 */