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
