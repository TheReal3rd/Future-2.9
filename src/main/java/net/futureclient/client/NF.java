package net.futureclient.client;

import net.futureclient.client.VF;
import net.futureclient.client.kF;

public class NF {
    public static final int[] f$g;
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            NF.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[VF.values().length];
        try {
            NF.f$g[VF.f$g.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NF.f$g[VF.f$j.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NF.f$g[VF.f$i.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NF.f$g[VF.f$M.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.MovementInputFromOptions;

public final class Nf
extends MovementInputFromOptions {
    public Nf(GameSettings gameSettings) {
        super(gameSettings);
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class nF
extends RF {
    private World f$d;
    private ItemStack f$g;
    private EntityLivingBase f$M;

    public World f$E() {
        nF nF2;
        return nF2.f$d;
    }

    public ItemStack f$E() {
        nF nF2;
        return nF2.f$g;
    }

    public nF(ItemStack itemStack, World world, EntityLivingBase entityLivingBase) {
        nF nF2 = 0;
        0.f$g = itemStack;
        nF2.f$d = world;
        nF2.f$M = entityLivingBase;
    }

    public EntityLivingBase f$E() {
        nF nF2;
        return nF2.f$M;
    }
}
