package net.futureclient.loader.mixin.optifine.render.entity;

import net.futureclient.client.Dg;
import net.futureclient.client.kH;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={EntityRenderer.class})
public abstract class MixinEntityRenderer {
    public MixinEntityRenderer() {
        MixinEntityRenderer mixinEntityRenderer;
    }

    @Inject(method={"renderHand(FIZZZ)V"}, at={@At(value="HEAD")}, cancellable=true, remap=false)
    @Dynamic
    private void f$E(CallbackInfo callbackInfo) {
        Dg dg = new Dg();
        kH.f$E().f$E().f$E(dg);
        if (dg.f$E()) {
            callbackInfo.cancel();
        }
    }
}
