package net.futureclient.client.deof.modules.movement.elytraFly;

public class oc_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.B;
import net.futureclient.client.BB;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.kF;
import net.futureclient.client.mc;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public class oc
extends Ha<Pf> {
    public final BB f$d;

    @Override
    public void f$E(Pf pf) {
        0.f$d.f$a(String.format("ElytraFly \u00a77[\u00a7F%s\u00a77]", 0.f$d.f$D.f$E()));
        if (!BB.f$H().player.field_70122_E || !0.f$d.f$c.f$E().booleanValue()) {
            if (BB.f$h().player.func_184582_a(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
                return;
            }
            if (pf.f$E().equals((Object)kF.f$M) && ((mc)((Object)0.f$d.f$D.f$E())).equals((Object)mc.f$M)) {
                if (0.f$d.f$C.f$E().booleanValue() || !((B)BB.f$A().player).f$E()) {
                    BB.f$B().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)BB.f$K().player, CPacketEntityAction.Action.START_FALL_FLYING));
                }
                if (0.f$d.f$e.f$E().booleanValue() && !BB.f$E(0.f$d) && (Math.abs(pf.f$K()) >= 0.05 || Math.abs(pf.f$E()) >= 0.05)) {
                    double d = 1.0E-8 + 1.0E-8 * (1.0 + (double)BB.f$E(0.f$d).nextInt(1 + (BB.f$E(0.f$d).nextBoolean() ? BB.f$E(0.f$d).nextInt(34) : BB.f$E(0.f$d).nextInt(43))));
                    if (BB.f$e().player.field_70122_E || BB.f$a().player.field_70173_aa % 2 == 0) {
                        Pf pf2 = pf;
                        pf2.f$E(pf2.f$e() + d);
                        return;
                    }
                    Pf pf3 = pf;
                    pf3.f$E(pf3.f$e() - d);
                }
            }
        }
    }

    public oc(BB bB) {
        0.f$d = bB;
    }
}
 */