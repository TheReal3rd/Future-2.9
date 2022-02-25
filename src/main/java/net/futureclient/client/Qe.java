package net.futureclient.client;

import net.futureclient.client.CF;
import net.futureclient.client.EF;
import net.futureclient.client.Ha;
import net.futureclient.client.k;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.util.EnumHand;

public class Qe
extends Ha<ve> {
    public final EF f$d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(ve ve2) {
        if (!(ve2.f$E() instanceof CPacketAnimation)) return;
        k k2 = (k)ve2.f$E();
        switch ((CF)((Object)EF.f$E(0.f$d).f$E())) {
            case f$M: {
                ve2.f$E(true);
                return;
            }
            case f$g: {
                k2.setHand(EnumHand.OFF_HAND);
                return;
            }
        }
    }

    public Qe(EF eF) {
        0.f$d = eF;
    }
}
package net.futureclient.client;

import java.util.List;

public class QE<T> {
    public List<T> f$d;

    public T f$E(T t) {
        if (0.f$d.contains(t)) {
            return t;
        }
        return null;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).insert(0, stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (3 ^ 5) << 4 ^ 5 << 1;
        int cfr_ignored_0 = 4 << 4 ^ (2 << 2 ^ 3);
        int n5 = 5 << 4 ^ 1 << 1;
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }

    public List<T> f$E() {
        QE qE;
        return qE.f$d;
    }

    public QE() {
        QE qE;
    }

    public void f$E(T t) {
        0.f$d.remove(t);
    }

    public void f$a(T t) {
        0.f$d.add(t);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.jg;
import net.futureclient.client.s;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;

public class qE
extends Ba {
    private s f$g;
    private s f$d;

    public static s f$E(qE qE2) {
        return qE2.f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static s f$a(qE qE2) {
        return qE2.f$g;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    private boolean f$E(ItemStack itemStack) {
        return itemStack != null && ((Minecraft)qE.f$d).player.isHandActive() && itemStack.getItem() instanceof ItemBow;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    private boolean f$a(ItemStack itemStack) {
        if (itemStack == null) {
            return false;
        }
        if (((Minecraft)qE.f$d).player.isHandActive()) {
            if (itemStack.getItem() instanceof ItemFood) {
                return true;
            }
            if (itemStack.getItem() instanceof ItemPotion) {
                return true;
            }
            if (itemStack.getItem() instanceof ItemBucketMilk) {
                return true;
            }
        }
        return false;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static boolean f$a(qE qE2, ItemStack itemStack) {
        return qE2.f$a(itemStack);
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static boolean f$E(qE qE2, ItemStack itemStack) {
        return qE2.f$E(itemStack);
    }

    public qE() {
        qE qE2;
        String[] stringArray = new String[5];
        stringArray[0] = "FastUse";
        stringArray[1] = "FastConsume";
        stringArray[2] = "fc";
        stringArray[3] = "instantuse";
        stringArray[4] = "iu";
        super("FastUse", stringArray, true, -4664836, JD.f$K);
        qE qE3 = qE2;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Ticks";
        stringArray2[1] = "Delay";
        stringArray2[2] = "d";
        stringArray2[3] = "t";
        qE3.f$g = new s((Number)Float.valueOf(15.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(25.0f), 1, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "BowTicks";
        stringArray3[1] = "BowDelay";
        stringArray3[2] = "bt";
        stringArray3[3] = "bd";
        qE2.f$d = new s((Number)Float.valueOf(15.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(25.0f), 1, stringArray3);
        qE2.f$E(qE2.f$g, qE2.f$d);
        qE2.f$E(new jg(qE2));
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.world.EnumSkyBlock;

public class qe
extends RF {
    private EnumSkyBlock f$d;

    public qe(EnumSkyBlock enumSkyBlock) {
        0.f$d = enumSkyBlock;
    }

    public EnumSkyBlock f$E() {
        qe qe2;
        return qe2.f$d;
    }
}
