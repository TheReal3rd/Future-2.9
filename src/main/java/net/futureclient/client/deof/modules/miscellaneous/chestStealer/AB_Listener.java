package net.futureclient.client.deof.modules.miscellaneous.chestStealer;

public class AB_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.A;
import net.futureclient.client.HC;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Zc;
import net.futureclient.client.rb;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemStack;

public class AB
extends Ha<ME> {
    public final Zc f$d;

    public AB(Zc zc) {
        0.f$d = zc;
    }

    @Override
    public void f$E(ME mE) {
        if (!(Zc.f$j().currentScreen instanceof GuiChest)) {
            return;
        }
        GuiChest guiChest = (GuiChest)Zc.f$M().currentScreen;
        if (Zc.f$e().contains(((A)guiChest).getLowerChestInventory().func_145748_c_().getUnformattedText())) {
            return;
        }
        if (((HC)((Object)Zc.f$E(0.f$d).f$E())).equals((Object)HC.f$M)) {
            int n;
            int n2 = n = ((A)guiChest).getLowerChestInventory().getSizeInventory();
            while (n2 <= ((A)guiChest).getLowerChestInventory().getSizeInventory() + 35) {
                ItemStack itemStack = Zc.f$C().player.field_71069_bz.getSlot(n - ((A)guiChest).getLowerChestInventory().getSizeInventory() + 9).getStack();
                if (!itemStack.isEmpty() && Zc.f$E(0.f$d).f$a(Zc.f$E(0.f$d).f$E().floatValue() * 1000.0f)) {
                    Zc.f$h().playerController.windowClick(guiChest.field_147002_h.windowId, n, 0, ClickType.QUICK_MOVE, (EntityPlayer)Zc.f$H().player);
                    Zc.f$E(0.f$d).f$a();
                    return;
                }
                n2 = ++n;
            }
        } else {
            int n;
            int n3 = n = 0;
            while (n3 < ((A)guiChest).getLowerChestInventory().getSizeInventory()) {
                ItemStack itemStack = ((A)guiChest).getLowerChestInventory().getStackInSlot(n);
                if (!itemStack.isEmpty() && Zc.f$E(0.f$d).f$a(Zc.f$E(0.f$d).f$E().floatValue() * 1000.0f)) {
                    AB aB;
                    switch (rb.f$d[((HC)((Object)Zc.f$E(0.f$d).f$E())).ordinal()]) {
                        case 1: {
                            Minecraft minecraft = Zc.f$K();
                            while (false) {
                            }
                            minecraft.playerController.windowClick(guiChest.field_147002_h.windowId, n, 0, ClickType.QUICK_MOVE, (EntityPlayer)Zc.f$A().player);
                            aB = 0;
                            break;
                        }
                        case 2: {
                            Zc.f$e().playerController.windowClick(guiChest.field_147002_h.windowId, n, 0, ClickType.PICKUP, (EntityPlayer)Zc.f$B().player);
                            Zc.f$E().playerController.windowClick(guiChest.field_147002_h.windowId, -999, 0, ClickType.PICKUP, (EntityPlayer)Zc.f$a().player);
                        }
                        default: {
                            aB = 0;
                        }
                    }
                    Zc.f$E(aB.f$d).f$a();
                }
                n3 = ++n;
            }
        }
    }
}
 */