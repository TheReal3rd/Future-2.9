package net.futureclient.client.deof.modules.combat.autoSoup;

public class AutoSoup {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.ND;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;

public class tF
extends Ba {
    private Bh f$b;
    private z<Boolean> f$M;
    public boolean f$d;
    private z<Boolean> f$i;
    private Bh f$j;
    private s f$g;

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static z f$E(tF tF2) {
        return tF2.f$i;
    }

    private void f$A() {
        tF tF2;
        if (tF2.f$b.f$E(125L) && tF.f$d.player.func_70089_S()) {
            int n;
            int n2 = tF.f$d.player.field_71071_by.currentItem;
            int n3 = n = 44;
            while (n3 >= 9) {
                ItemStack itemStack = tF.f$d.player.field_71069_bz.getSlot(n).getStack();
                if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getItem() instanceof ItemSoup) {
                    if (n >= 36 && n <= 44) {
                        tF.f$d.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n - 36));
                        if (tF2.f$M.f$E().booleanValue()) {
                            tF.f$d.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                        } else {
                            tF.f$d.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND));
                        }
                        tF.f$d.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
                        tF2.f$b.f$a();
                        return;
                    }
                    tF.f$d.playerController.windowClick(0, n, 0, ClickType.PICKUP, (EntityPlayer)tF.f$d.player);
                    tF.f$d.playerController.windowClick(0, 41, 0, ClickType.PICKUP, (EntityPlayer)tF.f$d.player);
                    tF2.f$b.f$a();
                    return;
                }
                n3 = --n;
            }
        }
    }

    public static s f$E(tF tF2) {
        return tF2.f$g;
    }

    public static void f$E(tF tF2) {
        tF2.f$A();
    }

    public tF() {
        tF tF2;
        String[] stringArray = new String[2];
        stringArray[0] = "AutoSoup";
        stringArray[1] = "autosp";
        super("AutoSoup", stringArray, true, -4598640, JD.f$I);
        tF tF3 = tF2;
        tF tF4 = tF2;
        tF3.f$b = new Bh();
        tF4.f$j = new Bh();
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Dropsoup";
        stringArray2[1] = "drop";
        stringArray2[2] = "throw";
        tF3.f$i = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "1.9Fix";
        stringArray3[1] = "handfix";
        stringArray3[2] = "1.10handfix";
        stringArray3[3] = "fix";
        tF2.f$M = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Health";
        stringArray4[1] = "h";
        stringArray4[2] = "hp";
        tF2.f$g = new s((Number)Float.valueOf(14.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(20.0f), 0.5, stringArray4);
        tF2.f$d = false;
        tF2.f$E(tF2.f$i, tF2.f$g, tF2.f$M);
        tF2.f$E(new ND(tF2));
    }

    @Override
    public void f$B() {
        tF tF2;
        tF2.f$d = false;
        super.f$B();
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Bh f$E(tF tF2) {
        return tF2.f$j;
    }

    public int f$a() {
        int n;
        int n2 = 0;
        ItemStack[] itemStackArray = (ItemStack[])tF.f$d.player.field_71071_by.mainInventory.toArray((Object[])new ItemStack[n2]);
        int n3 = itemStackArray.length;
        int n4 = n = 0;
        while (n4 < n3) {
            ItemStack itemStack = itemStackArray[n];
            if (itemStack != null && itemStack.getItem() instanceof ItemSoup) {
                ++n2;
            }
            n4 = ++n;
        }
        return n2;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
 */