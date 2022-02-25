package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.PF;
import net.futureclient.client.kH;
import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Render.class})
public abstract class MixinRender {
    public MixinRender() {
        MixinRender mixinRender;
    }

    @Inject(method={"getTeamColor"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(Entity entity, CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        PF pF = new PF(entity);
        kH.f$E().f$E().f$E(pF);
        if (pF.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)pF.f$E());
        }
    }

    @Inject(method={"doRenderShadowAndFire"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$a(CallbackInfo callbackInfo) {
        if (!zA.f$b) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderLivingLabel"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        if (!zA.f$b) {
            callbackInfo.cancel();
        }
    }
}
