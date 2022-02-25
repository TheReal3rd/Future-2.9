package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.network.Packet;

public abstract class Ye
extends RF {
    private final Packet<?> f$d;

    public <T extends Packet<?>> T f$E() {
        Ye ye;
        return (T)ye.f$d;
    }

    public Ye(Packet<?> packet) {
        0.f$d = packet;
    }
}
package net.futureclient.client;

public enum YE {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private YE() {
        YE yE;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class ye
extends RF {
    public ye() {
        ye ye2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.ZE;
import net.futureclient.client.s;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class yE
extends Ba {
    public s f$d;
    private Bh f$g;
    public boolean f$M;

    public static Bh f$E(yE yE2) {
        return yE2.f$g;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public yE() {
        yE yE2;
        String[] stringArray = new String[3];
        stringArray[0] = "AutoTotem";
        stringArray[1] = "Totem";
        stringArray[2] = "AutoRevive";
        super("AutoTotem", stringArray, true, -4598640, JD.f$I);
        yE yE3 = yE2;
        yE3.f$M = false;
        yE yE4 = yE2;
        yE3.f$g = new Bh();
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Delay";
        stringArray2[1] = "Deley";
        stringArray2[2] = "Del";
        stringArray2[3] = "D";
        yE4.f$d = new s((Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(2.0f), 0.01, stringArray2);
        yE2.f$E(yE2.f$d);
        yE2.f$E(new ZE(yE2));
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    @Override
    public void f$B() {
        yE yE2;
        super.f$B();
        yE2.f$M = false;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public int f$a() {
        int n;
        int n2 = 0;
        ItemStack[] itemStackArray = (ItemStack[])yE.f$d.player.field_71071_by.mainInventory.toArray((Object[])new ItemStack[n2]);
        int n3 = itemStackArray.length;
        int n4 = n = 0;
        while (n4 < n3) {
            ItemStack itemStack = itemStackArray[n];
            if (itemStack != null && itemStack.getItem() == Items.TOTEM_OF_UNDYING) {
                ++n2;
            }
            n4 = ++n;
        }
        if (((Minecraft)yE.f$d).player.func_184586_b(EnumHand.OFF_HAND).getItem() == Items.TOTEM_OF_UNDYING) {
            ++n2;
        }
        return n2;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }
}
