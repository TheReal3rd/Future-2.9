package net.futureclient.client.deof.event.events;

import net.minecraft.network.Packet;

public class PacketThreeEvent extends PacketTwoEvent {//TODO IDK why there is multiple PacketTwoEvent and PacketThreeEvent classes will optimize later.

    public PacketThreeEvent(Packet<?> packet) {
        super(packet);
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.IE;
import net.minecraft.network.Packet;

public final class jf extends IE {
    public jf(Packet<?> packet) {
        super(packet);
    }
}
 */