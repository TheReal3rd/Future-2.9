package net.futureclient.client;

import net.futureclient.client.Ye;
import net.minecraft.network.Packet;

public abstract class IE extends Ye {
    public IE(Packet<?> packet) {
        super(packet);
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class ie
extends RF {
    private ItemStack f$d;
    private BlockPos f$g;
    private EntityLivingBase f$M;

    public EntityLivingBase f$E() {
        ie ie2;
        return ie2.f$M;
    }

    public BlockPos f$E() {
        ie ie2;
        return ie2.f$g;
    }

    public ItemStack f$E() {
        ie ie2;
        return ie2.f$d;
    }

    public ie(EntityLivingBase entityLivingBase, BlockPos blockPos, ItemStack itemStack) {
        ie ie2 = 0;
        0.f$M = entityLivingBase;
        ie2.f$g = blockPos;
        ie2.f$d = itemStack;
    }
}
