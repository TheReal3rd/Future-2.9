package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.item.ItemStack;

public class zD
extends RF {
    private final ItemStack f$M;
    private final int f$d;
    private int f$g;

    public ItemStack f$E() {
        zD zD2;
        return zD2.f$M;
    }

    public int f$E() {
        zD zD2;
        return zD2.f$d;
    }

    public zD(ItemStack itemStack, int n, int n2) {
        zD zD2 = 0;
        0.f$M = itemStack;
        zD2.f$g = n;
        zD2.f$d = n2;
    }

    public int f$a() {
        zD zD2;
        return zD2.f$g;
    }

    public void f$E(int n) {
        0.f$g = n;
    }
}
