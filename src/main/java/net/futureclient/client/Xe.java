package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Ze;
import net.futureclient.client.jf;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemShield;
import net.minecraft.network.play.server.SPacketEntityEquipment;

public class xe
extends Ha<jf> {
    public final Ze f$d;

    public xe(Ze ze) {
        0.f$d = ze;
    }

    @Override
    public void f$E(jf jf2) {
        SPacketEntityEquipment sPacketEntityEquipment;
        if (jf2.f$E() instanceof SPacketEntityEquipment && (sPacketEntityEquipment = (SPacketEntityEquipment)jf2.f$E()).getEquipmentSlot().getIndex() == 1 && sPacketEntityEquipment.getItemStack().getItem() instanceof ItemAir && !(Ze.f$B().player.func_184592_cb().getItem() instanceof ItemAir) && Ze.f$e().player.func_184592_cb().getItem() instanceof ItemShield && 0.f$d.f$E()) {
            jf2.f$E(true);
        }
    }
}
package net.futureclient.client;

public enum xE {
    f$j,
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xE() {
        xE xE2;
    }
}
