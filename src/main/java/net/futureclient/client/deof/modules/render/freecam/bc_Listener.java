package net.futureclient.client.deof.modules.render.freecam;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.MovementInputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MovementInputFromOptions;

public class bc_Listener extends Listener<MovementInputEvent> {
    private final static Minecraft mc = Minecraft.getMinecraft();
    public final FreeCam f$d;

    public bc_Listener(FreeCam rA2) {
        f$d = rA2;
    }

    @Override
    public void invoke(MovementInputEvent pD) {
        if (mc.player.movementInput.getClass() == MovementInputFromOptions.class) {
            mc.player.movementInput = FreeCam.getMovementInput();
        }
    }

}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.PD;
import net.futureclient.client.rA;
import net.minecraft.util.MovementInputFromOptions;

public class bc
extends Ha<PD> {
    public final rA f$d;

    @Override
    public void f$E(PD pD) {
        if (rA.f$f().player.movementInput.getClass() == MovementInputFromOptions.class) {
            rA.f$L().player.movementInput = rA.f$E();
        }
    }

    public bc(rA rA2) {
        0.f$d = rA2;
    }
}
 */