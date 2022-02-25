package net.futureclient.client;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import net.futureclient.client.FA;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Pc;
import net.futureclient.client.kH;
import net.futureclient.client.qF;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.FoodStats;

public class Hb
extends Ha<ME> {
    public final qF f$d;

    public Hb(qF qF2) {
        0.f$d = qF2;
    }

    @Override
    public void f$E(ME mE) {
        Object[] objectArray = new Object[1];
        objectArray[0] = !qF.f$E(0.f$d).equals((Object)FA.f$i) ? String.format(" \u00a77[\u00a7F%s\u00a77]", qF.f$E(0.f$d).toString()) : "";
        0.f$d.f$a(String.format("AutoEat%s", objectArray));
        Object object = qF.f$E(0.f$d).entrySet().stream().filter(entry -> qF.f$E(0.f$d, (ItemStack)entry.getValue())).sorted(Comparator.comparing(entry -> {
            FoodStats foodStats;
            ItemStack itemStack = (ItemStack)entry.getValue();
            ItemFood itemFood = (ItemFood)itemStack.getItem();
            FoodStats foodStats2 = foodStats = new FoodStats();
            foodStats.setFoodLevel(qF.f$a().player.func_71024_bL().getFoodLevel());
            foodStats2.setFoodSaturationLevel(qF.f$E().player.func_71024_bL().getSaturationLevel());
            foodStats2.addStats(itemFood, itemStack);
            return Float.valueOf((float)foodStats2.getFoodLevel() + foodStats.getSaturationLevel());
        })).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (itemStack, itemStack2) -> itemStack, LinkedHashMap::new));
        if (object.size() == 0) {
            Hb hb = 0;
            qF.f$E(hb.f$d, false);
            if (qF.f$E(hb.f$d).equals((Object)FA.f$M)) {
                qF.f$E(0.f$d, false);
            }
            qF.f$E(0.f$d, FA.f$i);
            return;
        }
        int n = qF.f$e(0.f$d);
        switch (Pc.f$d[qF.f$E(0.f$d).ordinal()]) {
            case 1: {
                Minecraft minecraft = qF.f$C();
                while (false) {
                }
                if (minecraft.player.func_71024_bL().getFoodLevel() > qF.f$B(0.f$d).f$E().intValue() || !qF.f$E(0.f$d)) break;
                qF.f$a(0.f$d, qF.f$H().player.field_71071_by.currentItem);
                qF.f$E(0.f$d, -1);
                qF.f$E(0.f$d, FA.f$M);
                return;
            }
            case 2: {
                long l = object.values().stream().map(itemStack -> (ItemFood)itemStack.getItem()).filter(itemFood -> !(itemFood instanceof ItemAppleGold)).count();
                object = object.entrySet().stream().filter(entry -> l == 0L || !(((ItemStack)entry.getValue()).getItem() instanceof ItemAppleGold)).findFirst().orElse(null);
                if (object == null) {
                    qF.f$E(0.f$d, FA.f$i);
                    return;
                }
                int n2 = (Integer)object.getKey();
                object = (ItemFood)((ItemStack)object.getValue()).getItem();
                if (qF.f$a(0.f$d) != -1 && qF.f$a(0.f$d) != n2) {
                    qF.f$E(0.f$d, -1);
                    Hb hb = 0;
                    qF.f$E(hb.f$d, false);
                    qF.f$E(hb.f$d, FA.f$M);
                }
                if (qF.f$h().player.func_71024_bL().getFoodLevel() > qF.f$B(0.f$d).f$E().intValue()) {
                    qF.f$E(0.f$d, FA.f$g);
                    return;
                }
                qF.f$A().player.field_71071_by.currentItem = n2;
                qF.f$E(0.f$d, qF.f$A().player.field_71071_by.currentItem);
                if (n <= qF.f$e(0.f$d).f$E().intValue()) {
                    return;
                }
                if ((float)(n - qF.f$e(0.f$d).f$E().intValue()) >= ((float)((ItemFood)object).itemUseDuration + (20.0f - kH.f$E().f$E().f$E())) * 5.0f && !kH.f$E().f$E().f$E()) {
                    Hb hb = 0;
                    qF.f$E(hb.f$d, false);
                    qF.f$E(hb.f$d, FA.f$M);
                    return;
                }
                if (qF.f$K().currentScreen != null) {
                    qF.f$B().currentScreen.allowUserInput = true;
                }
                qF.f$E(0.f$d, true);
                return;
            }
            case 3: {
                if (n <= qF.f$a(0.f$d).f$E().intValue()) {
                    return;
                }
                qF.f$E(0.f$d, false);
                if (n <= qF.f$a(0.f$d).f$E().intValue() + qF.f$E(0.f$d).f$E().intValue()) {
                    return;
                }
                qF.f$e().player.field_71071_by.currentItem = qF.f$E(0.f$d);
                qF.f$E(0.f$d, false);
                qF.f$E(0.f$d, FA.f$i);
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.fd;
import net.futureclient.client.hA;

public class HB
extends Ha<Pf> {
    public final fd f$d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(Pf pf) {
        0.f$d.f$a(String.format("LongJump \u00a77[\u00a7F%s\u00a77]", fd.f$E(0.f$d).f$E()));
        switch (pf.f$E()) {
            case f$M: {
                switch ((hA)((Object)fd.f$E(0.f$d).f$E())) {
                    case f$i: {
                        fd.f$a(0.f$d, fd.f$Hc().player.field_70165_t - fd.f$Nc().player.field_70169_q);
                        double d = fd.f$Sb().player.field_70161_v - fd.f$jc().player.field_70166_s;
                        HB hB = 0;
                        double d2 = d;
                        fd.f$E(hB.f$d, Math.sqrt(fd.f$E(hB.f$d) * fd.f$E(0.f$d) + d2 * d2));
                        return;
                    }
                    case f$g: {
                        double d = fd.f$pB().player.field_70165_t - fd.f$vC().player.field_70169_q;
                        double d3 = fd.f$cb().player.field_70161_v - fd.f$Za().player.field_70166_s;
                        HB hB = 0;
                        double d4 = d;
                        double d5 = d3;
                        fd.f$E(hB.f$d, Math.sqrt(d4 * d4 + d5 * d5));
                        if (!fd.f$E(hB.f$d)) return;
                        fd.f$Ya().player.field_70181_x = -0.005;
                    }
                }
                return;
            }
        }
    }

    public HB(fd fd2) {
        0.f$d = fd2;
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.IB;
import net.futureclient.client.JD;
import net.futureclient.client.dB;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class hb
extends Ba {
    private Bh f$g;
    public ArrayList<String> f$d;
    private s f$i;
    private z<Boolean> f$M;

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public hb() {
        hb hb2;
        String[] stringArray = new String[5];
        stringArray[0] = "InvCleaner";
        stringArray[1] = "InvClean";
        stringArray[2] = "InventoryClean";
        stringArray[3] = "InventoryCleaner";
        stringArray[4] = "InventoryCleanerList";
        super("InvCleaner", stringArray, true, -10890357, JD.f$b);
        hb hb3 = hb2;
        String[] stringArray2 = new String[5];
        stringArray2[0] = "Delay";
        stringArray2[1] = "Del";
        stringArray2[2] = "D";
        stringArray2[3] = "Speed";
        stringArray2[4] = "Sped";
        hb3.f$i = new s((Number)Float.valueOf(0.05f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), 0.01, stringArray2);
        String[] stringArray3 = new String[7];
        stringArray3[0] = "CleanHotbar";
        stringArray3[1] = "Clean";
        stringArray3[2] = "Hotbar";
        stringArray3[3] = "HotbarClean";
        stringArray3[4] = "Cleaner";
        stringArray3[5] = "ch";
        stringArray3[6] = "hc";
        hb2.f$M = new z<Boolean>(true, stringArray3);
        hb2.f$g = new Bh();
        hb2.f$d = new ArrayList();
        hb2.f$E(hb2.f$i, hb2.f$M);
        hb2.f$E(new IB(hb2));
        new dB(hb2, "inventory_cleaner.txt");
    }

    public static z f$E(hb hb2) {
        return hb2.f$M;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Bh f$E(hb hb2) {
        return hb2.f$g;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static s f$E(hb hb2) {
        return hb2.f$i;
    }

    public static Minecraft f$K() {
        return f$d;
    }
}
package net.futureclient.client;

import java.awt.TrayIcon;
import net.futureclient.client.DC;
import net.futureclient.client.Ha;
import net.futureclient.client.OD;
import net.futureclient.client.kH;
import org.lwjgl.opengl.Display;

public class hB
extends Ha<OD> {
    public final DC f$d;

    @Override
    public void f$E(OD oD) {
        if (!Display.isActive() && 0.f$d.f$J.f$E().booleanValue() && DC.f$E(0.f$d).f$E(10000L)) {
            kH.f$E().f$E().f$g.displayMessage("Kicked from the server", oD.f$E(), TrayIcon.MessageType.NONE);
        }
    }

    public hB(DC dC) {
        0.f$d = dC;
    }
}
