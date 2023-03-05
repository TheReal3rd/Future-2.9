package net.futureclient.client.deof.modules.render.freecam;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.EntityRendererOrientEvent;

public class MC_Listener extends Listener<EntityRendererOrientEvent> {
    public final FreeCam f$d;

    public MC_Listener(FreeCam rA2) {
        f$d = rA2;
    }

    @Override
    public void invoke(EntityRendererOrientEvent wd) {
        wd.setCancel(true);
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Wd;
import net.futureclient.client.rA;

public class MC
extends Ha<Wd> {
    public final rA f$d;

    public MC(rA rA2) {
        0.f$d = rA2;
    }

    @Override
    public void f$E(Wd wd) {
        wd.f$E(true);
    }
}
 */