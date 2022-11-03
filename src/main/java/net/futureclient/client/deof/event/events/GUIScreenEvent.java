package net.futureclient.client.deof.event.events;

import net.futureclient.client.deof.event.Event;
import net.minecraft.client.gui.GuiScreen;

public class GUIScreenEvent extends Event {
    private final GuiScreen screen;

    public GUIScreenEvent(GuiScreen guiScreen) {
        this.screen = guiScreen;
    }

    public GuiScreen getScreen() {
        return screen;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.client.gui.GuiScreen;

public class Wf
extends RF {
    private GuiScreen f$d;

    public Wf(GuiScreen guiScreen) {
        0.f$d = guiScreen;
    }

    public GuiScreen f$E() {
        Wf wf;
        return wf.f$d;
    }
}
 */