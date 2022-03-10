package net.futureclient.client.deof.event.events;

import net.futureclient.client.deof.event.Event;
import net.futureclient.client.deof.utils.enums.InputEnum;
import org.lwjgl.input.Keyboard;

public class InputEvent extends Event {
    private final InputEnum type;// OG f$d //TODO rework this enum.
    private final int keyCode;// OG f$g

    public InputEvent(InputEnum he) {
        this.keyCode = Keyboard.getEventKey();
        this.type = he;
    }

    public InputEnum getType() {
        return this.type;
    }

    public int getKeyCode() {
        return this.keyCode;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.He;
import net.futureclient.client.RF;
import org.lwjgl.input.Keyboard;

public class kE extends RF {
    private He f$d;
    private int f$g;

    public kE(He he) {
        0.f$g = Keyboard.getEventKey();
        0.f$d = he;
    }

    public He f$E() {
        kE kE2;
        return kE2.f$d;
    }

    public int f$E() {
        kE kE2;
        return kE2.f$g;
    }
}
 */
