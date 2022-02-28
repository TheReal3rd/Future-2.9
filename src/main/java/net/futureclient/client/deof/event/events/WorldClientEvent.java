package net.futureclient.client.deof.event.events;

import net.futureclient.client.deof.event.Event;
import net.minecraft.client.multiplayer.WorldClient;

public class WorldClientEvent extends Event {
    private final WorldClient worldClient;//OG f$d

    public WorldClient f$E() {
        return this.worldClient;
    }

    public WorldClientEvent(WorldClient worldClient) {
        this.worldClient = worldClient;
    }
}

/*
public class De
extends RF {
    private WorldClient f$d;

    public WorldClient f$E() {
        De de;
        return de.f$d;
    }

    public De(WorldClient worldClient) {
        0.f$d = worldClient;
    }
}
 */
