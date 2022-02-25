package net.futureclient.loader.mixin.common.block;

import net.futureclient.client.ba;
import net.futureclient.client.kH;
import net.futureclient.loader.mixin.common.block.MixinBlock;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={BlockLiquid.class})
public abstract class MixinBlockLiquid
extends MixinBlock {
    public MixinBlockLiquid() {
        MixinBlockLiquid mixinBlockLiquid;
    }

    @Inject(method={"shouldSideBeRendered"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        ba ba2 = (ba)kH.f$E().f$E().f$E(ba.class);
        if (ba2 != null && ba2.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)(iBlockAccess.getBlockState(blockPos.offset(enumFacing)).func_185904_a() != 0.field_149764_J ? 1 : 0));
        }
    }
}
