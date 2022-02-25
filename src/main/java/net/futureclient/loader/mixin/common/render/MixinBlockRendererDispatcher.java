package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.hg;
import net.futureclient.client.kH;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={BlockRendererDispatcher.class})
public abstract class MixinBlockRendererDispatcher {
    public MixinBlockRendererDispatcher() {
        MixinBlockRendererDispatcher mixinBlockRendererDispatcher;
    }

    @Inject(method={"renderBlock"}, at={@At(value="HEAD")})
    private void f$E(IBlockState iBlockState, BlockPos blockPos, IBlockAccess iBlockAccess, BufferBuilder bufferBuilder, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        kH.f$E().f$E().f$E(new hg(iBlockState, blockPos));
    }
}
