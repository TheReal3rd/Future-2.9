package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.UF;
import net.futureclient.client.ve;

public class Xe
extends Ha<ve> {
    public final UF f$d;

    public Xe(UF uF) {
        0.f$d = uF;
    }

    @Override
    public void f$E(ve ve2) {
        boolean bl = (Boolean)UF.f$B(this.f$d).f$E();
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.lE;
import net.futureclient.client.ve;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;

public class XE
extends Ha<ve> {
    public final lE f$d;

    /*
     * WARNING - void declaration
     */
    public XE(lE lE2) {
        void 0;
        0.f$d = 0;
    }

    @Override
    public void f$E(ve ve2) {
        if (!((Boolean)lE.f$E(0.f$d).f$E()).booleanValue() && ve2.f$E() instanceof CPacketPlayerTryUseItemOnBlock) {
            lE.f$E().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$a().player, CPacketEntityAction.Action.STOP_SNEAKING));
        }
    }
}
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
