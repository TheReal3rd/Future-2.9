package net.futureclient.client.deof.modules.miscellaneous.autoEat;

public class Hb_Listener {
}
/*
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
 */