package net.futureclient.client.deof.modules.combat.autoBowRelease;

public class RE_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.B;
import net.futureclient.client.Ha;
import net.futureclient.client.Le;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.kF;
import net.futureclient.client.kH;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class RE
extends Ha<Pf> {
    public final Le f$d;

    public RE(Le le) {
        0.f$d = le;
    }

    @Override
    public void f$E(Pf pf) {
        ItemStack itemStack;
        if (pf.f$E() != kF.f$g) {
            return;
        }
        if (!((B)Le.f$B().player).getActiveItemStack().isEmpty() && (itemStack = Pg.f$E(ItemBow.class)) != null) {
            float f = itemStack.getMaxItemUseDuration() - Le.f$e().player.func_184605_cv();
            float f2 = (Boolean)Le.f$E(0.f$d).f$E() != false ? 20.0f - kH.f$E().f$E().f$E() : 0.0f;
            if (f - f2 >= Le.f$E(0.f$d).f$E().floatValue()) {
                Le.f$E().playerController.onStoppedUsingItem((EntityPlayer)Le.f$a().player);
            }
        }
    }
}
 */