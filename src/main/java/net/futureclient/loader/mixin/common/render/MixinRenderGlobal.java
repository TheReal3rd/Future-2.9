package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.VI;
import net.futureclient.client.kH;
import net.futureclient.client.nE;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderGlobal.class})
public abstract class MixinRenderGlobal {
    public MixinRenderGlobal() {
        MixinRenderGlobal mixinRenderGlobal;
    }

    @Inject(method={"makeEntityOutlineShader"}, at={@At(value="HEAD")})
    private void f$E(CallbackInfo callbackInfo) {
        VI.f$A();
    }

    @ModifyVariable(method={"setupTerrain"}, at=@At(value="HEAD"))
    private boolean f$E(boolean bl) {
        nE nE2 = new nE();
        kH.f$E().f$E().f$E(nE2);
        if (nE2.f$E()) {
            return true;
        }
        return bl;
    }
}
