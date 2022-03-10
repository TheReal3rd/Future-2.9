package net.futureclient.client.deof.modules.movement.noSlow;

public class Fb_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Pg;
import net.futureclient.client.cC;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;

public class Fb
extends Ha<ME> {
    public final cC f$d;

    @Override
    public void f$E(ME mE) {
        if (0.f$d.f$i.f$E().booleanValue() && 0.f$d.f$M.f$E().booleanValue()) {
            Item item = cC.f$e().player.func_184607_cu().getItem();
            if (Pg.f$e() && item instanceof ItemFood || item instanceof ItemBow || item instanceof ItemPotion) {
                cC.f$E().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, cC.f$a().player.getPosition(), EnumFacing.DOWN));
            }
        }
    }

    public Fb(cC cC2) {
        0.f$d = cC2;
    }
}
 */