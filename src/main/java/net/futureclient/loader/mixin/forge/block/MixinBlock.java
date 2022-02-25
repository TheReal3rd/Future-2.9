package net.futureclient.loader.mixin.forge.block;

import net.futureclient.client.VE;
import net.futureclient.client.kH;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Block.class})
public abstract class MixinBlock {
    public MixinBlock() {
        MixinBlock mixinBlock;
    }

    @Inject(method={"canRenderInLayer"}, at={@At(value="RETURN")}, cancellable=true)
    @Dynamic
    private void f$E(IBlockState iBlockState, BlockRenderLayer blockRenderLayer, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Block block = (Block)0;
        VE 02 = new VE(block);
        if (kH.f$E() != null) {
            kH.f$E().f$E().f$E(02);
        }
        if (02.f$E() != null) {
            callbackInfoReturnable.setReturnValue((Object)(02.f$E() == blockRenderLayer ? 1 : 0));
        }
    }
}
