package net.futureclient.loader.mixin.common;

import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={LayerArmorBase.class})
public abstract class MixinLayerArmorBase {
    public MixinLayerArmorBase() {
        MixinLayerArmorBase mixinLayerArmorBase;
    }

    @Inject(method={"renderEnchantedGlint"}, at={@At(value="HEAD")}, cancellable=true)
    private static void f$E(CallbackInfo callbackInfo) {
        if (!zA.f$j) {
            callbackInfo.cancel();
        }
    }
}
