package net.futureclient.client.deof.event.events;

import net.futureclient.client.deof.event.Event;

public class EntityRendererOrientEvent extends Event {
    private float aFloat;

    public EntityRendererOrientEvent(float f) {
        aFloat = f;
    }

    public void setaFloat(float f) {
        aFloat = f;
    }

    public float getaFloat() {
        return aFloat;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.RF;

public class Wd
extends RF {
    private float f$d;

    public void f$E(float f) {
        0.f$d = f;
    }

    public float f$E() {
        Wd wd;
        return wd.f$d;
    }

    public Wd(float f) {
        0.f$d = f;
    }
}
 */