package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.RenderGuardian;
import net.minecraft.entity.monster.EntityGuardian;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderGuardian.class})
public abstract class MixinRenderGuardian {
    public MixinRenderGuardian() {
        MixinRenderGuardian mixinRenderGuardian;
    }

    @Inject(method={"doRender"}, at={@At(value="INVOKE", target="net/minecraft/entity/monster/EntityGuardian.getAttackAnimationScale(F)F")}, cancellable=true)
    private void f$E(EntityGuardian entityGuardian, double d, double d2, double d3, float f, float f2, CallbackInfo callbackInfo) {
        if (!zA.f$b) {
            callbackInfo.cancel();
        }
    }
}
