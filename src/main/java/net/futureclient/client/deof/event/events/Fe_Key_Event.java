package net.futureclient.client.deof.event.events;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.MovementInput;

public class Fe_Key_Event extends ue_Movement_Event {
    private boolean isKeyDown;// OG f$d
    private final KeyBinding keyBinding;// OG f$g

    public Fe_Key_Event(MovementInput movementInput, KeyBinding keyBinding, boolean bl) {
        super(movementInput);
        this.keyBinding = keyBinding;
        isKeyDown = bl;
    }

    public void setKeyDown(boolean bl) {
        isKeyDown = bl;
    }

    public KeyBinding getKeyBinding() {
        return keyBinding;
    }

    public boolean isKeyDown() {
        return isKeyDown;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.ue;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.MovementInput;

public class Fe
extends ue {
    private boolean f$d;
    private final KeyBinding f$g;

    public Fe(MovementInput movementInput, KeyBinding keyBinding, boolean bl) {
        Fe fe = 0;
        super(movementInput);
        fe.f$g = keyBinding;
        fe.f$d = bl;
    }

    public void f$a(boolean bl) {
        0.f$d = bl;
    }

    public KeyBinding f$E() {
        Fe fe;
        return fe.f$g;
    }

    public boolean f$a() {
        Fe fe;
        return fe.f$d;
    }
}
 */