package net.futureclient.client.deof.event.events;

import net.futureclient.client.deof.event.Event;
import net.minecraft.util.MovementInput;

public class ue_Movement_Event extends Event {
    private final MovementInput movementInput;// OG f$d

    public ue_Movement_Event(MovementInput movementInput) {
        this.movementInput = movementInput;
    }

    public MovementInput getMovementInput() {
        return movementInput;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.util.MovementInput;

public abstract class ue
extends RF {
    private final MovementInput f$d;

    public ue(MovementInput movementInput) {
        0.f$d = movementInput;
    }

    public MovementInput f$E() {
        ue ue2;
        return ue2.f$d;
    }
}
 */