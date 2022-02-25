package net.futureclient.loader.mixin.forge.item;

import net.futureclient.client.kH;
import net.futureclient.client.zD;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ItemStack.class})
public abstract class MixinItemStack {
    @Shadow
    private int field_77991_e;

    public MixinItemStack() {
        MixinItemStack mixinItemStack;
    }

    @Inject(method={"<init>(Lnet/minecraft/item/Item;IILnet/minecraft/nbt/NBTTagCompound;)V"}, at={@At(value="RETURN")})
    @Dynamic
    private void f$E(Item item, int n, int n2, NBTTagCompound nBTTagCompound, CallbackInfo callbackInfo) {
        0.field_77991_e = 0.f$E((ItemStack)0, 0.field_77991_e, n2);
    }

    @Inject(method={"<init>(Lnet/minecraft/nbt/NBTTagCompound;)V"}, at={@At(value="RETURN")})
    private void f$E(NBTTagCompound nBTTagCompound, CallbackInfo callbackInfo) {
        0.field_77991_e = 0.f$E((ItemStack)0, 0.field_77991_e, nBTTagCompound.getShort("Damage"));
    }

    private int f$E(ItemStack itemStack, int n, int n2) {
        zD zD2 = new zD(itemStack, n, n2);
        if (kH.f$E() != null) {
            kH.f$E().f$E().f$E(zD2);
        }
        return zD2.f$a();
    }
}
