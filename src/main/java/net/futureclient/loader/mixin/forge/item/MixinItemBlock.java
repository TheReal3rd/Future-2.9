package net.futureclient.loader.mixin.forge.item;

import net.futureclient.client.dg;
import net.futureclient.client.kH;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={ItemBlock.class})
public abstract class MixinItemBlock {
    public MixinItemBlock() {
        MixinItemBlock mixinItemBlock;
    }

    @Shadow
    @Dynamic
    public abstract boolean placeBlockAt(ItemStack var1, EntityPlayer var2, World var3, BlockPos var4, EnumFacing var5, float var6, float var7, float var8, IBlockState var9);

    @Redirect(method={"onItemUse"}, at=@At(value="INVOKE", target="net/minecraft/item/ItemBlock.placeBlockAt(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFLnet/minecraft/block/state/IBlockState;)Z"))
    @Dynamic
    private boolean f$E(ItemBlock itemBlock, ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, IBlockState iBlockState) {
        dg dg2 = new dg();
        kH.f$E().f$E().f$E(dg2);
        return world.isRemote && dg2.f$E() || 0.placeBlockAt(itemStack, entityPlayer, world, blockPos, enumFacing, f, f2, f3, iBlockState);
    }
}
