package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;

public class BreedCMD extends CommandBase {

    public BreedCMD() {
        super(new String[] {"Breed", "Rape"});
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String execute(String[] stringArray2) {
        int count = 0;
        for(Entity entity : mc.world.getLoadedEntityList()) {
            int n;
            if (!(entity instanceof EntityAnimal)) continue;
            if (!this.isBreedable((EntityAnimal)entity)) continue;
            EntityAnimal entityAnimal = (EntityAnimal) entity;

            int n2 = n = 36;
            while (true) {
                if (n2 >= 45) break;
                ItemStack itemStack = mc.player.inventoryContainer.getSlot(n).getStack();
                if (!(itemStack.getItem() instanceof ItemAir) && entityAnimal.isBreedingItem(itemStack)) {
                    mc.player.connection.sendPacket(new CPacketHeldItemChange(n - 36));
                    ++count;
                    mc.player.connection.sendPacket(new CPacketUseEntity(entity, EnumHand.MAIN_HAND));
                    if (mc.player.capabilities.isCreativeMode) continue;
                    int n3 = itemStack.getCount();
                    if (--n3 > 0) break;
                    mc.player.inventory.setInventorySlotContents(n, itemStack);
                    continue;
                }
                n2 = ++n;
            }
        }

        mc.player.connection.sendPacket(new CPacketHeldItemChange(mc.player.inventory.currentItem));
        Object[] objectArray = new Object[2];
        objectArray[0] = count;
        objectArray[1] = count == 1 ? "" : "s";
        return String.format("Bred %s animal%s.", objectArray);
    }

    private boolean isBreedable(EntityAnimal entityAnimal) {
        if (!entityAnimal.isChild() && !entityAnimal.isInLove()) {
            float f = mc.player.getDistance((Entity)entityAnimal);
            int n = mc.player.canEntityBeSeen((Entity)entityAnimal) ? 6 : 3;
            return f < (float) n;
        }
        return false;
    }
}
/*
public class GG
extends GA {
    @Override
    public String f$E() {
        return null;
    }

    public GG() {
        GG gG;
        String[] stringArray = new String[2];
        stringArray[0] = "Breed";
        stringArray[1] = "Rape";
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray2) {
        int stringArray2 = 0;
        Iterator iterator = 0.f$d.world.func_72910_y().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                int n;
                Entity entity = (Entity)iterator.next();
                if (!(entity instanceof EntityAnimal)) continue block0;
                if (!0.f$E((EntityAnimal)(entity = (EntityAnimal)entity))) {
                    iterator2 = iterator;
                    continue;
                }
                int n2 = n = 36;
                while (true) {
                    if (n2 >= 45) continue block0;
                    ItemStack itemStack = 0.f$d.player.field_71069_bz.getSlot(n).getStack();
                    if (!(itemStack.getItem() instanceof ItemAir) && entity.isBreedingItem(itemStack)) {
                        GG gG = 0;
                        gG.f$d.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n - 36));
                        ++stringArray2;
                        gG.f$d.player.connection.sendPacket((Packet)new CPacketUseEntity(entity, EnumHand.MAIN_HAND));
                        if (gG.f$d.player.field_71075_bZ.isCreativeMode) continue block0;
                        int n3 = itemStack.getCount();
                        if (--n3 > 0) continue block0;
                        0.f$d.player.field_71071_by.setInventorySlotContents(n, itemStack);
                        continue block0;
                    }
                    n2 = ++n;
                }
            }
            break;
        }
        0.f$d.player.connection.sendPacket((Packet)new CPacketHeldItemChange(0.f$d.player.field_71071_by.currentItem));
        Object[] objectArray = new Object[2];
        objectArray[0] = stringArray2;
        objectArray[1] = stringArray2 == 1 ? "" : "s";
        return String.format("Bred %s animal%s.", objectArray);
    }

    private boolean f$E(EntityAnimal entityAnimal) {
        if (!entityAnimal.func_70631_g_() && !entityAnimal.isInLove()) {
            float f = 0.f$d.player.func_70032_d((Entity)entityAnimal);
            int n = 0.f$d.player.func_70685_l((Entity)entityAnimal) ? 6 : 3;
            if (f < (float)n) {
                return true;
            }
        }
        return false;
    }
}
 */
