package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.ba;
import net.futureclient.client.kH;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={BlockModelRenderer.class})
public abstract class MixinBlockModelRenderer {
    public MixinBlockModelRenderer() {
        MixinBlockModelRenderer mixinBlockModelRenderer;
    }

    @Shadow
    public abstract boolean func_187498_b(IBlockAccess var1, IBakedModel var2, IBlockState var3, BlockPos var4, BufferBuilder var5, boolean var6, long var7);

    @Inject(method={"renderModel(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/BufferBuilder;ZJ)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(IBlockAccess iBlockAccess, IBakedModel iBakedModel, IBlockState iBlockState, BlockPos blockPos, BufferBuilder bufferBuilder, boolean bl, long l, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        ba ba2 = (ba)kH.f$E().f$E().f$E(ba.class);
        if (ba2 != null && ba2.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)0.func_187498_b(iBlockAccess, iBakedModel, iBlockState, blockPos, bufferBuilder, !ba2.f$E(iBlockState.getBlock(), blockPos), l));
        }
    }
}
