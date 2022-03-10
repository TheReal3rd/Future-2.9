package net.futureclient.client.deof.modules.combat.autoPot;

public class AutoPot {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.Oe;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionUtils;

public class HE
extends Ba {
    public boolean f$j;
    private int f$b;
    private s f$a;
    private z<Boolean> f$K;
    private s f$e;
    private double f$i;
    private double f$g;
    public z<Boolean> f$I;
    public Bh f$d;
    private double f$M;
    private s f$C;

    public static Minecraft f$V() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public boolean f$E(ItemStack object) {
        if (object.getItem() instanceof ItemPotion && ((ItemPotion)object.getItem()).hasEffect((ItemStack)object)) {
            object = PotionUtils.getEffectsFromStack((ItemStack)object).iterator();
            while (object.hasNext()) {
                if (((PotionEffect)object.next()).getPotion() != MobEffects.INSTANT_HEALTH) continue;
                return true;
            }
        }
        return false;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$S() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$X() {
        return f$d;
    }

    public static double f$E(HE hE) {
        return hE.f$g;
    }

    public void f$E(int n, int n2) {
        ((Minecraft)HE.f$d).playerController.windowClick(HE.f$d.player.field_71069_bz.windowId, n, n2, ClickType.SWAP, (EntityPlayer)((Minecraft)HE.f$d).player);
    }

    public static s f$a(HE hE) {
        return hE.f$C;
    }

    public int f$e() {
        int n;
        int n2 = 0;
        int n3 = n = 9;
        while (n3 < 45) {
            HE hE;
            ItemStack itemStack = HE.f$d.player.field_71069_bz.getSlot(n).getStack();
            if (!(itemStack.getItem() instanceof ItemAir) && hE.f$E(itemStack)) {
                n2 += itemStack.getCount();
            }
            n3 = ++n;
        }
        return n2;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static double f$a(HE hE, double d) {
        hE.f$M = d;
        return hE.f$M;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static s f$E(HE hE) {
        return hE.f$e;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public int f$a() {
        int n;
        int n2 = -1;
        int n3 = n = 1;
        while (n3 < 45) {
            Object object;
            if (HE.f$d.player.field_71069_bz.getSlot(n).getHasStack() && (object = HE.f$d.player.field_71069_bz.getSlot(n).getStack()).getItem() instanceof ItemPotion && PotionUtils.getEffectsFromStack((ItemStack)object) != null) {
                object = PotionUtils.getEffectsFromStack((ItemStack)object).iterator();
                while (object.hasNext()) {
                    if (((PotionEffect)object.next()).getPotion() != MobEffects.INSTANT_HEALTH) continue;
                    n2 = n;
                }
            }
            n3 = ++n;
        }
        return n2;
    }

    public static int f$E(HE hE, int n) {
        hE.f$b = n;
        return hE.f$b;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$q() {
        return f$d;
    }

    public static double f$e(HE hE, double d) {
        hE.f$i = d;
        return hE.f$i;
    }

    public static int f$a(HE hE) {
        return hE.f$b;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$N() {
        return f$d;
    }

    public static double f$a(HE hE) {
        return hE.f$M;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static int f$E(HE hE) {
        return --hE.f$b;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    @Override
    public void f$K() {
        HE hE;
        hE.f$b = -1;
        super.f$K();
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static z f$E(HE hE) {
        return hE.f$K;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static s f$e(HE hE) {
        return hE.f$a;
    }

    @Override
    public void f$B() {
        HE hE;
        hE.f$j = false;
        super.f$B();
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static double f$e(HE hE) {
        return hE.f$i;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static double f$E(HE hE, double d) {
        hE.f$g = d;
        return hE.f$g;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public HE() {
        HE hE;
        String[] stringArray = new String[2];
        stringArray[0] = "AutoPot";
        stringArray[1] = "AutoHeal";
        super("AutoPot", stringArray, true, 0xFF3333, JD.f$I);
        HE hE2 = hE;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Health";
        stringArray2[1] = "h";
        stringArray2[2] = "<3";
        hE2.f$a = new s((Number)10.0, (Number)1.0, (Number)19.0, 0.5, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Delay";
        stringArray3[1] = "d";
        hE.f$C = new s((Number)Float.valueOf(0.7f), (Number)Float.valueOf(0.01f), (Number)Float.valueOf(1.0f), 0.01, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Slot";
        stringArray4[1] = "lot";
        stringArray4[2] = "hotbar";
        hE.f$e = new s((Number)Float.valueOf(6.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(9.0f), 1, stringArray4);
        String[] stringArray5 = new String[4];
        stringArray5[0] = "1.9Fix";
        stringArray5[1] = "handfix";
        stringArray5[2] = "1.10handfix";
        stringArray5[3] = "fix";
        hE.f$I = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[4];
        stringArray6[0] = "OnGroundOnly";
        stringArray6[1] = "OnlyOnground";
        stringArray6[2] = "GroundPot";
        stringArray6[3] = "Onground";
        hE.f$K = new z<Boolean>(false, stringArray6);
        hE.f$b = -1;
        hE.f$d = new Bh();
        hE.f$E(hE.f$K, hE.f$a, hE.f$C, hE.f$e, hE.f$I);
        hE.f$E(new Oe(hE));
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }
}
 */