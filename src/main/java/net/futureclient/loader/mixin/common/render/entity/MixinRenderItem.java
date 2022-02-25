package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.C;
import net.futureclient.client.zA;
import net.minecraft.client.renderer.RenderItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderItem.class})
public abstract class MixinRenderItem
implements C {
    public MixinRenderItem() {
        MixinRenderItem mixinRenderItem;
    }

    @Override
    @Accessor
    public abstract void setNotRenderingEffectsInGUI(boolean var1);

    @Inject(method={"renderEffect"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        if (!zA.f$i) {
            callbackInfo.cancel();
        }
    }
}
