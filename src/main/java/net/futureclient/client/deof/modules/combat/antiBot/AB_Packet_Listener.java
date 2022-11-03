package net.futureclient.client.deof.modules.combat.antiBot;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.PacketThreeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.server.SPacketSpawnPlayer;

public class AB_Packet_Listener extends Listener<PacketThreeEvent> {
    public static Minecraft mc = Minecraft.getMinecraft();
    public final AntiBot antiBot; // f$d

    public AB_Packet_Listener(AntiBot mF2) {
        antiBot = mF2;
    }

    @Override
    public void invoke(PacketThreeEvent jf2) {
        SPacketSpawnPlayer sPacketSpawnPlayer;
        if (!AntiBot.isHypixel()) {
            return;
        }
        if (jf2.getPacket() instanceof SPacketSpawnPlayer && Math.sqrt((mc.player.posX - (sPacketSpawnPlayer = jf2.getPacket()).getX() / 32.0) * (mc.player.posX - sPacketSpawnPlayer.getX() / 32.0) + (mc.player.posY - sPacketSpawnPlayer.getY() / 32.0) * (mc.player.posY - sPacketSpawnPlayer.getY() / 32.0) + (mc.player.posZ - sPacketSpawnPlayer.getZ() / 32.0) * (mc.player.posZ - sPacketSpawnPlayer.getZ() / 32.0)) <= 17.0 && sPacketSpawnPlayer.getX() / 32.0 != mc.player.posX && sPacketSpawnPlayer.getY() / 32.0 != mc.player.posY && sPacketSpawnPlayer.getZ() / 32.0 != mc.player.posZ) {
            antiBot.botMap.put(sPacketSpawnPlayer.getEntityID(), sPacketSpawnPlayer.getUniqueId());
        }
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.jf;
import net.futureclient.client.mF;
import net.minecraft.network.play.server.SPacketSpawnPlayer;

public class wF
extends Ha<jf> {
    public final mF f$d;

    public wF(mF mF2) {
        0.f$d = mF2;
    }

    @Override
    public void f$E(jf jf2) {
        SPacketSpawnPlayer sPacketSpawnPlayer;
        if (!mF.f$E(0.f$d)) {
            return;
        }
        if (jf2.f$E() instanceof SPacketSpawnPlayer && Math.sqrt((mF.f$L().player.field_70165_t - (sPacketSpawnPlayer = (SPacketSpawnPlayer)jf2.f$E()).getX() / 32.0) * (mF.f$i().player.field_70165_t - sPacketSpawnPlayer.getX() / 32.0) + (mF.f$c().player.field_70163_u - sPacketSpawnPlayer.getY() / 32.0) * (mF.f$I().player.field_70163_u - sPacketSpawnPlayer.getY() / 32.0) + (mF.f$j().player.posZ - sPacketSpawnPlayer.getZ() / 32.0) * (mF.f$M().player.posZ - sPacketSpawnPlayer.getZ() / 32.0)) <= 17.0 && sPacketSpawnPlayer.getX() / 32.0 != mF.f$C().player.field_70165_t && sPacketSpawnPlayer.getY() / 32.0 != mF.f$H().player.field_70163_u && sPacketSpawnPlayer.getZ() / 32.0 != mF.f$h().player.posZ) {
            0.f$d.f$d.put(sPacketSpawnPlayer.getEntityID(), sPacketSpawnPlayer.getUniqueId());
        }
    }
}
 */