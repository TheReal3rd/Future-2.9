package net.futureclient.client.deof.modules.combat.autoArmour;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemStack;

public class AA_Tick_Listener extends Listener<TickEvent> {
    private final Minecraft mc = Minecraft.getMinecraft();
    public final AutoArmour autoArmour; // f$d

    public AA_Tick_Listener(AutoArmour ef2) {
        autoArmour = ef2;
    }

    @Override
    public void invoke(TickEvent mE) {
        byte by;
        yE yE2 = (yE)kH.f$E().f$E().f$E(yE.class);//TODO AutoTotem related things here.
        if (yE2 != null && yE2.f$E() && yE2.f$M) {
            return;
        }
        if (!AutoArmour.getDelay().currentDiff((long) AutoArmour.getDelaySetting().value * 1000.0f) || mc.player.capabilities.isCreativeMode || mc.currentScreen instanceof GuiContainer && !(mc.currentScreen instanceof GuiInventory) || AutoArmour.getInventory().value && !(mc.currentScreen instanceof GuiContainer)) {
            return;
        }
        if (AutoArmour.elytraPriority().value && mc.player.inventoryContainer.getSlot(6).getStack().getItem() instanceof ItemElytra && mc.player.inventoryContainer.getSlot(6).getStack().getMaxDamage() - mc.player.inventoryContainer.getSlot(6).getStack().getItemDamage() < 5) {
            int n;
            int n2 = n = 9;
            while (n2 <= 44) {
                ItemStack itemStack = mc.player.inventoryContainer.getSlot(n).getStack();
                if (itemStack != ItemStack.EMPTY && itemStack.getItem() instanceof ItemElytra && itemStack.getCount() == 1 && itemStack.getMaxDamage() - itemStack.getItemDamage() > 5) {
                    AutoArmour.setMoving(true);
                    AutoArmour.move(6,false);
                    AutoArmour.move(n,true);
                    AutoArmour.move(n,false);
                    AutoArmour.setMoving(false);
                }
                n2 = n = ((byte)(n + 1));
            }
        }
        byte by2 = by = 5;
        while (by2 <= 8) {
            if (AutoArmour.doThing1(by)) {
                AutoArmour.getDelay().reset();
                return;
            }
            by2 = (byte)(by + 1);
        }
    }
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
        if (!ef.f$E(0.f$d).f$a(((s)ef.f$E(0.f$d)).f$E().floatValue() * 1000.0f) || ef.f$H().player.capabilities.isCreativeMode || ef.f$h().currentScreen instanceof GuiContainer && !(ef.f$A().currentScreen instanceof GuiInventory) || ((Boolean)ef.f$a(0.f$d).f$E()).booleanValue() && !(ef.f$K().currentScreen instanceof GuiContainer)) {
            return;
        }
        if (((Boolean)ef.f$E(0.f$d).f$E()).booleanValue() && ef.f$B().player.inventoryContainer.getSlot(6).getStack().getItem() instanceof ItemElytra && ef.f$e().player.inventoryContainer.getSlot(6).getStack().getMaxDamage() - ef.f$a().player.inventoryContainer.getSlot(6).getStack().getItemDamage() < 5) {
            int n;
            int n2 = n = 9;
            while (n2 <= 44) {
                ItemStack itemStack = ef.f$E().player.inventoryContainer.getSlot(n).getStack();
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