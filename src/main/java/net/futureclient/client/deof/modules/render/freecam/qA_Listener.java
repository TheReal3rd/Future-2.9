package net.futureclient.client.deof.modules.render.freecam;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.SetupTerrainEvent;

public class qA_Listener extends Listener<SetupTerrainEvent> {
    public final FreeCam f$d;

    public qA_Listener(FreeCam rA2) {
        f$d = rA2;
    }

    @Override
    public void invoke(SetupTerrainEvent nE2) {
        nE2.setCancel(true);
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.nE;
import net.futureclient.client.rA;

public class qA
extends Ha<nE> {
    public final rA f$d;

    public qA(rA rA2) {
        0.f$d = rA2;
    }

    @Override
    public void f$E(nE nE2) {
        nE2.f$E(true);
    }
}
 */