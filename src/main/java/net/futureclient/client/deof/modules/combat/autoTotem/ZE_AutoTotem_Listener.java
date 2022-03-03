package net.futureclient.client.deof.modules.combat.autoTotem;

public class ZE_AutoTotem_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Af;
import net.futureclient.client.Ha;
import net.futureclient.client.yE;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.util.EnumHand;

public class ZE
extends Ha<Af> {
    public final yE f$d;

    @Override
    public void f$E(Af af) {
        0.f$d.f$a(String.format("AutoTotem \u00a77[\u00a7F%s\u00a77]", 0.f$d.f$a()));
        if (!0.f$d.f$M) {
            yE.f$E(0.f$d).f$a();
        }
        if (!(yE.f$f().currentScreen instanceof GuiContainer && !(yE.f$L().currentScreen instanceof GuiInventory) || yE.f$i().player.func_184586_b(EnumHand.OFF_HAND).getItem() == Items.TOTEM_OF_UNDYING || yE.f$c().player.func_184812_l_())) {
            int n;
            int n2 = n = 44;
            while (n2 >= 9) {
                if (yE.f$I().player.field_71069_bz.getSlot(n).getStack().getItem() == Items.TOTEM_OF_UNDYING) {
                    0.f$d.f$M = true;
                    if (yE.f$E(0.f$d).f$a(0.f$d.f$d.f$E().floatValue() * 1000.0f) && yE.f$j().player.field_71071_by.getItemStack().getItem() != Items.TOTEM_OF_UNDYING) {
                        yE.f$C().playerController.windowClick(0, n, 0, ClickType.PICKUP, (EntityPlayer)yE.f$M().player);
                    }
                    if (yE.f$E(0.f$d).f$a(0.f$d.f$d.f$E().floatValue() * 2000.0f) && yE.f$H().player.field_71071_by.getItemStack().getItem() == Items.TOTEM_OF_UNDYING) {
                        yE.f$A().playerController.windowClick(0, 45, 0, ClickType.PICKUP, (EntityPlayer)yE.f$h().player);
                        if (yE.f$K().player.field_71071_by.getItemStack().isEmpty()) {
                            0.f$d.f$M = false;
                            return;
                        }
                    }
                    if (yE.f$E(0.f$d).f$a(0.f$d.f$d.f$E().floatValue() * 3000.0f) && !yE.f$B().player.field_71071_by.getItemStack().isEmpty() && yE.f$e().player.func_184586_b(EnumHand.OFF_HAND).getItem() == Items.TOTEM_OF_UNDYING) {
                        yE.f$E().playerController.windowClick(0, n, 0, ClickType.PICKUP, (EntityPlayer)yE.f$a().player);
                        0.f$d.f$M = false;
                        return;
                    }
                }
                n2 = --n;
            }
        }
    }

    public ZE(yE yE2) {
        0.f$d = yE2;
    }
}
 */