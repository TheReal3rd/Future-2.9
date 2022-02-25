package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.RenderDragon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderDragon.class})
public abstract class MixinRenderDragon {
    public MixinRenderDragon() {
        MixinRenderDragon mixinRenderDragon;
    }

    @Inject(method={"renderCrystalBeams"}, at={@At(value="HEAD")}, cancellable=true)
    private static void f$E(double d, double d2, double d3, float f, double d4, double d5, double d6, int n, double d7, double d8, double d9, CallbackInfo callbackInfo) {
        if (!zA.f$b) {
            callbackInfo.cancel();
        }
    }
}
