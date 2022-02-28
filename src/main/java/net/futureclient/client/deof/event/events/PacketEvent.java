package net.futureclient.client.deof.event.events;

import net.futureclient.client.deof.event.Event;
import net.minecraft.network.Packet;


public class PacketEvent extends Event {
    private final Packet<?> packet;//OG f$d

    public <T extends Packet<?>> T getPacket() {
        return (T)this.packet;
    }

    public PacketEvent(Packet<?> packet) {
        this.packet = packet;
    }
}
/*
public abstract class Ye extends RF {
    private final Packet<?> f$d;

    public <T extends Packet<?>> T f$E() {
        Ye ye;
        return (T)ye.f$d;
    }

    public Ye(Packet<?> packet) {
        0.f$d = packet;
    }
}
 */