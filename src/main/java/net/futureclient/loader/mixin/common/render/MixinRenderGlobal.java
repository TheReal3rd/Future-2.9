package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.VI;
import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.event.events.SetupTerrainEvent;
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
        VI.f$A();//TODO
    }

    @ModifyVariable(method={"setupTerrain"}, at=@At(value="HEAD"))
    private boolean f$E(boolean bl) {
        SetupTerrainEvent nE2 = new SetupTerrainEvent();
        FutureClient.getINSTANCE().getEventManager().invoke(nE2);// kH.f$E().f$E().f$E(nE2);
        if (nE2.isCancelled()) {
            return true;
        }
        return bl;
    }
}
