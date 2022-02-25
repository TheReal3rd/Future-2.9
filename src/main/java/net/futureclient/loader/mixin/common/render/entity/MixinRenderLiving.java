package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.RenderLiving;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderLiving.class})
public abstract class MixinRenderLiving {
    public MixinRenderLiving() {
        MixinRenderLiving mixinRenderLiving;
    }

    @Inject(method={"renderLeash"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        if (!zA.f$b) {
            callbackInfo.cancel();
        }
    }
}
