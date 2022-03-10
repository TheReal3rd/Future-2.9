package net.futureclient.client.deof.modules;

import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.InputEvent;
import net.futureclient.client.deof.utils.enums.InputEnum;

public class Keybind_Listener extends Listener<InputEvent> {
    public final FutureClient f$d;

    public Keybind_Listener(FutureClient hf) {
        this.f$d = hf;
    }

    @Override
    public void invoke(InputEvent kE2) {
        if (kE2.getType() == InputEnum.KEYDOWN) {

            FutureClient.getINSTANCE().getModuleManager().getModuleList().forEach(ig2 -> {
                if (ig2.f$E() != 0 && kE2.getKeyCode() == ig2.f$E()) {//TODO finish this.
                    ig2.f$E().f$E();
                }
            });
        }
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.Hf;
import net.futureclient.client.kE;
import net.futureclient.client.kH;

public class cF extends Ha<kE> {
    public final Hf f$d;

    @Override
    public void f$E(kE kE2) {
        if (kE2.f$E() == He.f$b) {
            kH.f$E().f$E().f$E().forEach(ig2 -> {
                if (ig2.f$E() != 0 && kE2.f$E() == ig2.f$E()) {
                    ig2.f$E().f$E();
                }
            });
        }
    }

    public cF(Hf hf) {
        0.f$d = hf;
    }
}
 */