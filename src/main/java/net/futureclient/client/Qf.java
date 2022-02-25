package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.UF;
import net.futureclient.client.ie;

public class Qf
extends Ha<ie> {
    public final UF f$d;

    @Override
    public void f$E(ie ie2) {
        if (((Boolean)UF.f$e(0.f$d).f$E()).booleanValue()) {
            block4: {
                if (!UF.f$a(0.f$d).containsKey(ie2.f$E().getDisplayName())) break block4;
                UF.f$a(0.f$d).put(ie2.f$E().getDisplayName(), (Integer)UF.f$a(0.f$d).get(ie2.f$E().getDisplayName()) + 1);
                return;
            }
            try {
                UF.f$a(0.f$d).put(ie2.f$E().getDisplayName(), 1);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public Qf(UF uF) {
        0.f$d = uF;
    }
}
package net.futureclient.client;

import net.futureclient.client.De;
import net.futureclient.client.Ha;
import net.futureclient.client.mF;

public class QF
extends Ha<De> {
    public final mF f$d;

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(De 0) {
        v0 = 0;
        v0.f$d.f$d.clear();
        if (mF.f$A().isSingleplayer() || mF.f$K().getCurrentServerData() == null) ** GOTO lbl-1000
        if (mF.f$B().getCurrentServerData().serverIP.toLowerCase().contains("hypixel")) {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        mF.f$a(v0.f$d, v1);
        if (mF.f$e().isSingleplayer() || mF.f$a().getCurrentServerData() == null) ** GOTO lbl-1000
        if (mF.f$E().getCurrentServerData().serverIP.toLowerCase().contains("mineplex")) {
            v2 = true;
        } else lbl-1000:
        // 2 sources

        {
            v2 = false;
        }
        mF.f$E(0.f$d, v2);
    }

    public QF(mF mF2) {
        0.f$d = mF2;
    }
}
package net.futureclient.client;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.StreamSupport;
import net.futureclient.client.Ag;
import net.futureclient.client.Ba;
import net.futureclient.client.Cd;
import net.futureclient.client.FA;
import net.futureclient.client.Ha;
import net.futureclient.client.Hb;
import net.futureclient.client.JD;
import net.futureclient.client.p;
import net.futureclient.client.rD;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class qF
extends Ba {
    private final s f$I;
    private FA f$i;
    private int f$M;
    private final s f$K;
    private final s f$C;
    private int f$g;
    private final s f$e;
    private boolean f$b;
    private int f$d;
    private boolean f$j;

    public static Minecraft f$e() {
        return f$d;
    }

    public static boolean f$E(qF qF2, ItemStack itemStack) {
        return qF2.f$E(itemStack);
    }

    public static int f$e(qF qF2) {
        return ++qF2.f$M;
    }

    public static int f$E(qF qF2, int n) {
        qF2.f$d = n;
        return qF2.f$d;
    }

    public static Map f$E(qF qF2) {
        return qF2.f$E();
    }

    public static boolean f$E(qF qF2) {
        return qF2.f$e();
    }

    public static FA f$E(qF qF2) {
        return qF2.f$i;
    }

    public static int f$a(qF qF2, int n) {
        qF2.f$g = n;
        return qF2.f$g;
    }

    public static int f$E(qF qF2) {
        return qF2.f$g;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static s f$e(qF qF2) {
        return qF2.f$e;
    }

    public static boolean f$a(qF qF2) {
        return qF2.f$b;
    }

    public boolean f$B() {
        qF qF2;
        return qF2.f$b;
    }

    @Override
    public void f$B() {
        qF qF2;
        qF qF3 = qF2;
        super.f$B();
        qF3.f$b = false;
        if (qF3.f$i.equals((Object)FA.f$M)) {
            qF2.f$e(false);
        }
        qF2.f$E(FA.f$i);
    }

    public static boolean f$E(qF qF2, boolean bl) {
        qF2.f$b = bl;
        return qF2.f$b;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static void f$E(qF qF2, FA fA) {
        qF2.f$E(fA);
    }

    private boolean f$e() {
        qF qF2;
        qF2.f$b = true;
        return qF2.f$j;
    }

    private boolean f$E(ItemStack itemStack) {
        block4: {
            block6: {
                ItemFood itemFood;
                block5: {
                    if (!(itemStack.getItem() instanceof ItemFood)) break block4;
                    itemFood = (ItemFood)itemStack.getItem();
                    PotionEffect potionEffect = ((p)itemFood).getPotionId();
                    if (potionEffect == null) break block5;
                    if (StreamSupport.stream(Potion.REGISTRY.spliterator(), false).filter(Potion::isBadEffect).anyMatch(potionEffect.getPotion()::equals)) break block6;
                }
                if (!(itemFood instanceof ItemFishFood) || !ItemFishFood.FishType.byItemStack((ItemStack)itemStack).equals((Object)ItemFishFood.FishType.PUFFERFISH)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void f$E(FA fA) {
        qF qF2 = 0;
        qF2.f$i = fA;
        qF2.f$M = 0;
    }

    public qF() {
        qF qF2;
        String[] stringArray = new String[4];
        stringArray[0] = "AutoEat";
        stringArray[1] = "AutoEater";
        stringArray[2] = "AutoEating";
        stringArray[3] = "AutoFood";
        super("AutoEat", stringArray, true, 16773918, JD.f$b);
        qF qF3 = qF2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Hunger";
        stringArray2[1] = "FoodLevel";
        qF3.f$C = new s((Number)Float.valueOf(19.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(19.0f), 1, stringArray2);
        qF qF4 = qF2;
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Start Ticks";
        stringArray3[1] = "StartTicks";
        stringArray3[2] = "StartFactor";
        stringArray3[3] = "startt";
        qF4.f$e = new s((Number)Float.valueOf(10.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), 1, stringArray3);
        qF qF5 = qF2;
        String[] stringArray4 = new String[4];
        stringArray4[0] = "Stop Ticks";
        stringArray4[1] = "StopTicks";
        stringArray4[2] = "StopFactor";
        stringArray4[3] = "stopt";
        qF5.f$I = new s((Number)Float.valueOf(5.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(10.0f), 1, stringArray4);
        qF qF6 = qF2;
        String[] stringArray5 = new String[4];
        stringArray5[0] = "Swap Ticks";
        stringArray5[1] = "SwapTicks";
        stringArray5[2] = "SwapFactor";
        stringArray5[3] = "st";
        qF6.f$K = new s((Number)Float.valueOf(5.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(20.0f), 1, stringArray5);
        qF2.f$j = true;
        qF2.f$i = FA.f$i;
        z[] zArray = new z[4];
        zArray[0] = qF2.f$C;
        zArray[1] = qF2.f$e;
        zArray[2] = qF2.f$I;
        zArray[3] = qF2.f$K;
        qF2.f$E(zArray);
        Ha[] haArray = new Ha[4];
        haArray[0] = new Ag(qF2);
        haArray[1] = new rD(qF2);
        haArray[2] = new Cd(qF2);
        haArray[3] = new Hb(qF2);
        qF2.f$E(haArray);
    }

    public static void f$E(qF qF2, boolean bl) {
        qF2.f$e(bl);
    }

    public static Minecraft f$a() {
        return f$d;
    }

    private void f$e(boolean bl) {
        KeyBinding.setKeyBindState((int)qF.f$d.gameSettings.keyBindUseItem.getKeyCode(), (boolean)bl);
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static s f$E(qF qF2) {
        return qF2.f$K;
    }

    public static s f$a(qF qF2) {
        return qF2.f$I;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static int f$a(qF qF2) {
        return qF2.f$d;
    }

    public static boolean f$a(qF qF2, boolean bl) {
        qF2.f$j = bl;
        return qF2.f$j;
    }

    private Map<Integer, ItemStack> f$E() {
        int n;
        LinkedHashMap<Integer, ItemStack> linkedHashMap = new LinkedHashMap<Integer, ItemStack>();
        int n2 = n = 0;
        while (n2 < 9) {
            ItemStack itemStack = qF.f$d.player.field_71071_by.getStackInSlot(n);
            if (itemStack.getItem() != Items.AIR) {
                linkedHashMap.put(n, itemStack);
            }
            n2 = ++n;
        }
        return linkedHashMap;
    }

    public static s f$B(qF qF2) {
        return qF2.f$C;
    }
}
package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.Ha;
import net.futureclient.client.UF;
import net.futureclient.client.ud;

public class qf
extends Ha<ud> {
    public final UF f$d;

    @Override
    public void f$E(ud ud2) {
        if (((Boolean)UF.f$K(0.f$d).f$E()).booleanValue() && UF.f$e(0.f$d).f$E(2500L) && !ud2.f$E().equals(UF.f$C().player.func_70005_c_())) {
            UF.f$E(0.f$d, UF.f$C(0.f$d)[new Random().nextInt(UF.f$C(0.f$d).length)] + ud2.f$E() + ".");
            UF.f$e(0.f$d).f$a();
        }
    }

    public qf(UF uF) {
        0.f$d = uF;
    }
}
