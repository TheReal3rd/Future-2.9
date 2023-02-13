package net.futureclient.client.deof.modules.combat.autoArmour;

import net.futureclient.client.deof.modules.ModuleStandard;
import net.futureclient.client.deof.settings.EnumSetting;
import net.futureclient.client.deof.settings.NumberSetting;
import net.futureclient.client.deof.settings.SettingsBase;
import net.futureclient.client.deof.utils.enums.CategoryEnum;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemStack;

public class AutoArmour extends ModuleStandard {
    public static AutoArmour INSTANCE;
    private boolean moving; // f$d
    private SettingsBase<Boolean> elytraPriority; // f$j
    private SettingsBase<Boolean> inventory; // f$b
    private EnumSetting<PriorityEnum> priority;// f$M
    private NumberSetting delay; // f$i
    private DelayTimer f$g; // f$g

    public AutoArmour() {
        super("AutoArmor", new String[]{"AutoArmor", "aa", "armor"}, true, -5385072, CategoryEnum.COMBAT);
        INSTANCE = this;
        inventory = new SettingsBase<Boolean>(false, "Open Inventory", "OpenInventory", "Open", "Inv", "Inventory", "OpenInv", "OE", "I");
        elytraPriority = new SettingsBase<Boolean>(false, "Elytra Priority","ElytraPriority", "Elytra","EP");
        delay = new NumberSetting((Number)Float.valueOf(0.35f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), 0.01, "Delay", "D");
        priority = new EnumSetting<PriorityEnum>(PriorityEnum.Protection, "Priority", "Prior", "P");

        f$g = new DelayTimer();
        moving = false;
        addSettings(elytraPriority, inventory, delay, priority);
        addListeners(new AA_Tick_Listener(this));
    }

    private boolean doThing(byte by) { // f$E
        int n;
        String string;
        ItemStack itemStack;
        int n2;
        if (moving) {
            return false;
        }

        if (elytraPriority.value && by == 6) {
            Item item = mc.player.inventoryContainer.getSlot(by).getStack().getItem();
            if (item instanceof ItemElytra) {
                return false;
            }
            int n3 = n2 = 9;
            while (n3 <= 44) {
                itemStack = mc.player.inventoryContainer.getSlot(n2).getStack();
                if (itemStack != ItemStack.EMPTY && itemStack.getItem() instanceof ItemElytra && itemStack.getCount() == 1 && itemStack.getMaxDamage() - itemStack.getItemDamage() > 5) {
                    boolean bl = mc.player.inventoryContainer.getSlot(by).getStack() == ItemStack.EMPTY;
                    if (!bl) {
                        moveItem(by, false);
                    }
                    moveItem(n2, true);
                    if (!bl) {
                        moveItem(n2, false);
                    }
                    return true;
                }
                n3 = n2 = ((byte)(n2 + 1));
            }
        }
        int n4 = -1;
        n2 = -1;
        itemStack = null;
        if (priority.value == PriorityEnum.Blast) {
            string = "blast_protection";
        } else {
            string = "protection";
        }
        if (mc.player.inventoryContainer.getSlot(by).getStack() != ItemStack.EMPTY && mc.player.inventoryContainer.getSlot(by).getStack().getItem() instanceof ItemArmor) {
            itemStack = mc.player.inventoryContainer.getSlot(by).getStack();
            n4 = ((ItemArmor) itemStack.getItem()).damageReduceAmount + EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByLocation(string), mc.player.inventoryContainer.getSlot(by).getStack());
        }
        int n5 = n = 9;
        while (n5 <= 44) {
            ItemStack itemStack2 = mc.player.inventoryContainer.getSlot(n).getStack();
            if (itemStack2 != ItemStack.EMPTY && itemStack2.getItem() instanceof ItemArmor && itemStack2.getCount() == 1) {
                ItemArmor itemArmor = (ItemArmor)itemStack2.getItem();
                int n6 = itemArmor.damageReduceAmount + EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByLocation(string), itemStack2);
                if (isTargetItem(itemArmor, by) && (itemStack == null || n4 < n6)) {
                    n4 = n6;
                    itemStack = itemStack2;
                    n2 = n;
                }
            }
            n5 = n = ((byte)(n + 1));
        }
        if (n2 != -1) {
            n = mc.player.inventoryContainer.getSlot(by).getStack() == ItemStack.EMPTY ? 1 : 0;
            if (n == 0) {
                moveItem(by, false);
            }
            moveItem(n2, true);
            if (n == 0) {
                moveItem(n2, false);
            }
            return true;
        }
        return false;
    }

    private boolean isChestplate(ItemArmor itemArmor) { // f$e
        return itemArmor.armorType == EntityEquipmentSlot.CHEST;
    }

    public static DelayTimer getDelay() { // f$E
        return AutoArmour.INSTANCE.f$g;
    }


    private boolean isTargetItem(ItemArmor itemArmor, byte by) { // f$E
        return by == 5 && isHelmet(itemArmor) || by == 6 && isChestplate(itemArmor) || by == 7 && isLeggings(itemArmor) || by == 8 && isBoots(itemArmor);
    }

    private boolean isBoots(ItemArmor itemArmor) { // f$E
        return itemArmor.armorType == EntityEquipmentSlot.FEET;
    }

    public static SettingsBase<Boolean> getInventory() { // f$a
        return AutoArmour.INSTANCE.inventory;
    }

    private boolean isLeggings(ItemArmor itemArmor) { // f$a
        return itemArmor.armorType == EntityEquipmentSlot.LEGS;
    }

    public static SettingsBase<Boolean> elytraPriority() {// f$E
        return AutoArmour.INSTANCE.elytraPriority;
    }

    private void moveItem(int n, boolean bl) {// f$E
        mc.playerController.windowClick(mc.player.inventoryContainer.windowId, n, 0, bl ? ClickType.QUICK_MOVE : ClickType.PICKUP, mc.player);
    }

    public static boolean doThing1(byte by) { // f$E
        return AutoArmour.INSTANCE.doThing(by);
    }

    private boolean isHelmet(ItemArmor itemArmor) { // f$B
        return itemArmor.armorType == EntityEquipmentSlot.HEAD;
    }

    public static NumberSetting getDelaySetting() { // f$E
        return AutoArmour.INSTANCE.delay;
    }

    public static void move(int n, boolean bl) {// f$E
        AutoArmour.INSTANCE.moveItem(n, bl);
    }

    public static boolean setMoving(boolean bl) { // f$E
        AutoArmour.INSTANCE.moving = bl;
        return AutoArmour.INSTANCE.moving;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.uD;
import net.futureclient.client.yf;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemStack;

public class ef
extends Ba {
    private boolean f$d;
    private z<Boolean> f$j;
    private z<Boolean> f$b;
    private ka<yf> f$M;
    private s f$i;
    private Bh f$g;

    public static Minecraft f$E() {
        return f$d;
    }

    private boolean f$E(byte by) {
        int n;
        String string;
        ItemStack itemStack;
        int n2;
        if (0.f$d) {
            return false;
        }
        if (0.f$j.f$E().booleanValue() && by == 6) {
            Item item = ef.f$d.player.inventoryContainer.getSlot((int)by).getStack().getItem();
            if (item instanceof ItemElytra) {
                return false;
            }
            int n3 = n2 = 9;
            while (n3 <= 44) {
                itemStack = ef.f$d.player.inventoryContainer.getSlot(n2).getStack();
                if (itemStack != ItemStack.EMPTY && itemStack.getItem() instanceof ItemElytra && itemStack.getCount() == 1 && itemStack.getMaxDamage() - itemStack.getItemDamage() > 5) {
                    boolean bl;
                    boolean bl2 = bl = ef.f$d.player.inventoryContainer.getSlot((int)by).getStack() == ItemStack.EMPTY;
                    if (!bl) {
                        0.f$E(by, false);
                    }
                    0.f$E(n2, true);
                    if (!bl) {
                        0.f$E(n2, false);
                    }
                    return true;
                }
                n3 = n2 = (int)((byte)(n2 + 1));
            }
        }
        int n4 = -1;
        n2 = -1;
        itemStack = null;
        switch ((yf)((Object)0.f$M.f$E())) {
            case f$g: {
                while (false) {
                }
                string = "blast_protection";
                break;
            }
            default: {
                string = "protection";
            }
        }
        if (ef.f$d.player.inventoryContainer.getSlot((int)by).getStack() != ItemStack.EMPTY && ef.f$d.player.inventoryContainer.getSlot((int)by).getStack().getItem() instanceof ItemArmor) {
            itemStack = (ItemArmor)ef.f$d.player.inventoryContainer.getSlot((int)by).getStack().getItem();
            n4 = itemStack.damageReduceAmount + EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantment.getEnchantmentByLocation((String)string), (ItemStack)ef.f$d.player.inventoryContainer.getSlot((int)by).getStack());
        }
        int n5 = n = 9;
        while (n5 <= 44) {
            ItemStack itemStack2 = ef.f$d.player.inventoryContainer.getSlot(n).getStack();
            if (itemStack2 != ItemStack.EMPTY && itemStack2.getItem() instanceof ItemArmor && itemStack2.getCount() == 1) {
                ItemArmor itemArmor = (ItemArmor)itemStack2.getItem();
                int n6 = itemArmor.damageReduceAmount + EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantment.getEnchantmentByLocation((String)string), (ItemStack)itemStack2);
                if (0.f$E(itemArmor, by) && (itemStack == null || n4 < n6)) {
                    n4 = n6;
                    itemStack = itemArmor;
                    n2 = n;
                }
            }
            n5 = n = (int)((byte)(n + 1));
        }
        if (n2 != -1) {
            int n7 = n = ef.f$d.player.inventoryContainer.getSlot((int)by).getStack() == ItemStack.EMPTY ? 1 : 0;
            if (n == 0) {
                0.f$E(by, false);
            }
            0.f$E(n2, true);
            if (n == 0) {
                0.f$E(n2, false);
            }
            return true;
        }
        return false;
    }

    private boolean f$e(ItemArmor itemArmor) {
        return itemArmor.armorType == EntityEquipmentSlot.CHEST;
    }

    public ef() {
        ef ef2;
        String[] stringArray = new String[3];
        stringArray[0] = "AutoArmor";
        stringArray[1] = "aa";
        stringArray[2] = "armor";
        super("AutoArmor", stringArray, true, -5385072, JD.f$I);
        ef ef3 = ef2;
        String[] stringArray2 = new String[8];
        stringArray2[0] = "Open Inventory";
        stringArray2[1] = "OpenInventory";
        stringArray2[2] = "Open";
        stringArray2[3] = "Inv";
        stringArray2[4] = "Inventory";
        stringArray2[5] = "OpenInv";
        stringArray2[6] = "OE";
        stringArray2[7] = "I";
        ef3.f$b = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Elytra Priority";
        stringArray3[1] = "ElytraPriority";
        stringArray3[2] = "Elytra";
        stringArray3[3] = "EP";
        ef2.f$j = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[2];
        stringArray4[0] = "Delay";
        stringArray4[1] = "D";
        ef2.f$i = new s((Number)Float.valueOf(0.35f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), 0.01, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Priority";
        stringArray5[1] = "Prior";
        stringArray5[2] = "P";
        ef2.f$M = new ka<yf>(yf.f$M, stringArray5);
        ef2.f$g = new Bh();
        ef2.f$d = false;
        ef2.f$E(ef2.f$M, ef2.f$j, ef2.f$b, ef2.f$i);
        ef2.f$E(new uD(ef2));
    }

    public static Bh f$E(ef ef2) {
        return ef2.f$g;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    private boolean f$E(ItemArmor itemArmor, byte by) {
        return by == 5 && 0.f$B(itemArmor) || by == 6 && 0.f$e(itemArmor) || by == 7 && 0.f$a(itemArmor) || by == 8 && 0.f$E(itemArmor);
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    private boolean f$E(ItemArmor itemArmor) {
        return itemArmor.armorType == EntityEquipmentSlot.FEET;
    }

    public static z f$a(ef ef2) {
        return ef2.f$b;
    }

    private boolean f$a(ItemArmor itemArmor) {
        return itemArmor.armorType == EntityEquipmentSlot.LEGS;
    }

    public static z f$E(ef ef2) {
        return ef2.f$j;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    private void f$E(int n, boolean bl) {
        ef.f$d.playerController.windowClick(ef.f$d.player.inventoryContainer.windowId, n, 0, bl ? ClickType.QUICK_MOVE : ClickType.PICKUP, (EntityPlayer)ef.f$d.player);
    }

    public static boolean f$E(ef ef2, byte by) {
        return ef2.f$E(by);
    }

    private boolean f$B(ItemArmor itemArmor) {
        return itemArmor.armorType == EntityEquipmentSlot.HEAD;
    }

    public static s f$E(ef ef2) {
        return ef2.f$i;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static void f$E(ef ef2, int n, boolean bl) {
        ef2.f$E(n, bl);
    }

    public static boolean f$E(ef ef2, boolean bl) {
        ef2.f$d = bl;
        return ef2.f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }
}
 */
