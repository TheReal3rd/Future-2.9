package net.futureclient.client.deof.unknown;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.Af_Unknown_Event;
import net.futureclient.client.deof.modules.ModuleStandard;

public class HF_Unknown_Listener extends Listener<Af_Unknown_Event> {
    public final ModuleStandard moduleS;//OG f$d

    @Override
    public void invoke(Af_Unknown_Event af) {
        if (!ModuleStandard.isEnabled(this.moduleS) && this.moduleS.f$b > -100.0f) {
            this.moduleS.f$b -= 5.0f;
            return;
        }
        kH.f$E().f$E().f$E(0);//TODO figure this out.
    }

    public HF_Unknown_Listener(ModuleStandard ba) {
        this.moduleS = ba;
    }
}
/*
public class HF
extends Ha<Af> {
    public final Ba f$d;

    @Override
    public void f$E(Af af) {
        if (!Ba.f$E(0.f$d) && 0.f$d.f$b > -100.0f) {
            0.f$d.f$b -= 5.0f;
            return;
        }
        kH.f$E().f$E().f$E(0);
    }

    public HF(Ba ba) {
        0.f$d = ba;
    }
}
 */