package net.futureclient.loader.mixin.common;

import net.futureclient.client.xH;
import net.minecraft.client.renderer.texture.AbstractTexture;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={AbstractTexture.class})
public abstract class MixinAbstractTexture {
    public MixinAbstractTexture() {
        MixinAbstractTexture mixinAbstractTexture;
    }

    @Inject(method={"setBlurMipmapDirect"}, at={@At(value="HEAD")})
    private void f$E(boolean bl, boolean bl2, CallbackInfo callbackInfo) {
        xH.f$A();
    }
}
