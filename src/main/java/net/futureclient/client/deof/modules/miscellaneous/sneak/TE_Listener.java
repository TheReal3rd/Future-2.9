package net.futureclient.client.deof.modules.miscellaneous.sneak;

public class TE_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.hD;
import net.futureclient.client.lE;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public class TE
extends Ha<Pf> {
    public final lE f$d;

    public TE(lE lE2) {
        0.f$d = lE2;
    }

    @Override
    public void f$E(Pf pf) {
        boolean bl;
        if (((Boolean)lE.f$E(0.f$d).f$E()).booleanValue()) {
            if (lE.f$E(0.f$d) && !lE.f$D().player.movementInput.sneak) {
                lE.f$m().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$g().player, CPacketEntityAction.Action.STOP_SNEAKING));
                lE.f$E(0.f$d, false);
            }
            return;
        }
        boolean bl2 = bl = lE.f$f().player.field_70159_w != 0.0 && lE.f$L().player.field_70179_y != 0.0;
        if (!bl) {
            lE.f$c().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$i().player, CPacketEntityAction.Action.START_SNEAKING));
            lE.f$E(0.f$d, true);
            return;
        }
        switch (hD.f$d[pf.f$E().ordinal()]) {
            case 1: {
                Minecraft minecraft = lE.f$j();
                while (false) {
                }
                minecraft.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$I().player, CPacketEntityAction.Action.START_SNEAKING));
                lE.f$C().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$M().player, CPacketEntityAction.Action.START_SNEAKING));
                lE.f$h().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$H().player, CPacketEntityAction.Action.STOP_SNEAKING));
                return;
            }
            case 2: {
                lE.f$K().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$A().player, CPacketEntityAction.Action.START_SNEAKING));
                lE.f$e().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$B().player, CPacketEntityAction.Action.START_SNEAKING));
                lE.f$E(0.f$d, true);
            }
        }
    }
}
 */