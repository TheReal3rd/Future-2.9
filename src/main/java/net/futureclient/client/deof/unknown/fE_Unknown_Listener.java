package net.futureclient.client.deof.unknown;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.Af_Unknown_Event;
import net.futureclient.client.deof.modules.ModuleStandard;

public class fE_Unknown_Listener extends Listener<Af_Unknown_Event> {
    public final ModuleStandard f$d;

    public fE_Unknown_Listener(ModuleStandard ba) {
        this.f$d = ba;
    }

    @Override
    public void invoke(Af_Unknown_Event af) {
        if (ModuleStandard.isEnabled(this.f$d) && this.f$d.f$b < 0.0f) {
            this.f$d.f$b += 5.0f;
            return;
        }
        kH.f$E().f$E().f$E(0);//TODO fix this
    }
}
/*
public class fE
extends Ha<Af> {
    public final Ba f$d;

    public fE(Ba ba) {
        0.f$d = ba;
    }

    @Override
    public void f$E(Af af) {
        if (Ba.f$E(0.f$d) && 0.f$d.f$b < 0.0f) {
            0.f$d.f$b += 5.0f;
            return;
        }
        kH.f$E().f$E().f$E(0);
    }
}
 */