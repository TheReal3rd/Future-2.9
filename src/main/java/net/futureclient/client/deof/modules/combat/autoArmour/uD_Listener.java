package net.futureclient.client.deof.modules.combat.autoArmour;

public class uD_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.ef;
import net.futureclient.client.kH;
import net.futureclient.client.s;
import net.futureclient.client.yE;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemStack;

public class uD
extends Ha<ME> {
    public final ef f$d;

    public uD(ef ef2) {
        0.f$d = ef2;
    }

    @Override
    public void f$E(ME mE) {
        byte by;
        yE yE2 = (yE)kH.f$E().f$E().f$E(yE.class);
        if (yE2 != null && yE2.f$E() && yE2.f$M) {
            return;
        }
        if (!ef.f$E(0.f$d).f$a(((s)ef.f$E(0.f$d)).f$E().floatValue() * 1000.0f) || ef.f$H().player.field_71075_bZ.isCreativeMode || ef.f$h().currentScreen instanceof GuiContainer && !(ef.f$A().currentScreen instanceof GuiInventory) || ((Boolean)ef.f$a(0.f$d).f$E()).booleanValue() && !(ef.f$K().currentScreen instanceof GuiContainer)) {
            return;
        }
        if (((Boolean)ef.f$E(0.f$d).f$E()).booleanValue() && ef.f$B().player.field_71069_bz.getSlot(6).getStack().getItem() instanceof ItemElytra && ef.f$e().player.field_71069_bz.getSlot(6).getStack().getMaxDamage() - ef.f$a().player.field_71069_bz.getSlot(6).getStack().getItemDamage() < 5) {
            int n;
            int n2 = n = 9;
            while (n2 <= 44) {
                ItemStack itemStack = ef.f$E().player.field_71069_bz.getSlot(n).getStack();
                if (itemStack != ItemStack.EMPTY && itemStack.getItem() instanceof ItemElytra && itemStack.getCount() == 1 && itemStack.getMaxDamage() - itemStack.getItemDamage() > 5) {
                    ef.f$E(0.f$d, true);
                    uD uD2 = 0;
                    ef.f$E(uD2.f$d, 6, false);
                    ef.f$E(uD2.f$d, n, true);
                    ef.f$E(uD2.f$d, n, false);
                    ef.f$E(uD2.f$d, false);
                }
                n2 = n = (int)((byte)(n + 1));
            }
        }
        byte by2 = by = 5;
        while (by2 <= 8) {
            if (ef.f$E(0.f$d, by)) {
                ef.f$E(0.f$d).f$a();
                return;
            }
            by2 = (byte)(by + 1);
        }
    }
}
 */