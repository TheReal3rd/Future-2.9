package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.K;
import net.futureclient.client.xG;
import net.minecraft.client.renderer.entity.RenderManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderManager.class})
public abstract class MixinRenderManager
implements K {
    public MixinRenderManager() {
        MixinRenderManager mixinRenderManager;
    }

    @Override
    @Accessor
    public abstract double getRenderPosX();

    @Override
    @Accessor
    public abstract double getRenderPosY();

    @Override
    @Accessor
    public abstract double getRenderPosZ();

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void f$E(CallbackInfo callbackInfo) {
        xG.f$A();
    }
}
