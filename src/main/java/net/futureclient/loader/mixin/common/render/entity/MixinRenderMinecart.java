package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.RenderMinecart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderMinecart.class})
public abstract class MixinRenderMinecart {
    public MixinRenderMinecart() {
        MixinRenderMinecart mixinRenderMinecart;
    }

    @Inject(method={"renderCartContents"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        if (!zA.f$b) {
            callbackInfo.cancel();
        }
    }
}
