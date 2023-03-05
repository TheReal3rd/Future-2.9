package net.futureclient.client.deof.event.events;

import net.minecraft.entity.Entity;

public class Cf_Uknown_Event extends ff_Unknown_Event {//TODO find where the event is created.
    private Entity entity;

    public Cf_Uknown_Event(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.ff;
import net.minecraft.entity.Entity;

public class Cf
extends ff {
    private Entity f$d;

    public Entity f$E() {
        Cf cf;
        return cf.f$d;
    }

    public void f$E(Entity entity) {
        0.f$d = entity;
    }

    public Cf(Entity entity) {
        0.f$d = entity;
    }
}
 */