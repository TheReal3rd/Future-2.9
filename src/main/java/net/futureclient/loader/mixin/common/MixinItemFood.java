package net.futureclient.loader.mixin.common;

import net.futureclient.client.kH;
import net.futureclient.client.nF;
import net.futureclient.client.p;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={ItemFood.class})
public abstract class MixinItemFood
implements p {
    public MixinItemFood() {
        MixinItemFood mixinItemFood;
    }

    @Override
    @Accessor
    public abstract PotionEffect getPotionId();

    @Inject(method={"onItemUseFinish"}, at={@At(value="HEAD")})
    private void f$E(ItemStack itemStack, World world, EntityLivingBase entityLivingBase, CallbackInfoReturnable<ItemStack> callbackInfoReturnable) {
        if (entityLivingBase instanceof EntityPlayer) {
            kH.f$E().f$E().f$E(new nF(itemStack, world, entityLivingBase));
        }
    }
}
