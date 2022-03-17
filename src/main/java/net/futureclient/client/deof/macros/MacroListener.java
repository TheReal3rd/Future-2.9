package net.futureclient.client.deof.macros;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.InputEvent;
import net.futureclient.client.deof.utils.enums.InputEnum;

public class MacroListener extends Listener<InputEvent> {
    public final MacroManager macroManager;//OG f$d

    public MacroListener(MacroManager lf2) {
        this.macroManager = lf2;
    }

    @Override
    public void invoke(InputEvent kE2) {
        if (kE2.getType() == InputEnum.KEYDOWN) {
            this.macroManager.getList().forEach(lg2 -> {
                if (lg2.getKeyID() != 0 && lg2.getKeyID() == kE2.getKeyCode()) {
                    lg2.send();
                }
            });
        }
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.kE;
import net.futureclient.client.lf;

public class BD
extends Ha<kE> {
    public final lf f$d;

    @Override
    public void f$E(kE kE2) {
        if (kE2.f$E() == He.f$b) {
            0.f$d.f$E().forEach(lg2 -> {
                if (lg2.f$E() != 0 && lg2.f$E() == kE2.f$E()) {
                    lg2.f$E();
                }
            });
        }
    }

    public BD(lf lf2) {
        0.f$d = lf2;
    }
}
 */