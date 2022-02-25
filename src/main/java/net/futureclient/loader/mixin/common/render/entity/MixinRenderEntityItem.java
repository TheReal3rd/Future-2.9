package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.kH;
import net.futureclient.client.pD;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.entity.item.EntityItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderEntityItem.class})
public abstract class MixinRenderEntityItem {
    public MixinRenderEntityItem() {
        MixinRenderEntityItem mixinRenderEntityItem;
    }

    @Inject(method={"doRender"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(EntityItem entityItem, double d, double d2, double d3, float f, float f2, CallbackInfo callbackInfo) {
        pD pD2 = new pD(entityItem);
        kH.f$E().f$E().f$E(pD2);
        if (pD2.f$E()) {
            callbackInfo.cancel();
        }
    }
}
