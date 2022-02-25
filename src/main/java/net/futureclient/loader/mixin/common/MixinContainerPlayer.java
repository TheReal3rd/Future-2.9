package net.futureclient.loader.mixin.common;

import net.futureclient.client.YF;
import net.futureclient.client.kH;
import net.minecraft.inventory.ContainerPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ContainerPlayer.class})
public abstract class MixinContainerPlayer {
    public MixinContainerPlayer() {
        MixinContainerPlayer mixinContainerPlayer;
    }

    @Inject(method={"onContainerClosed"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        YF yF = new YF();
        kH.f$E().f$E().f$E(yF);
        if (yF.f$E()) {
            callbackInfo.cancel();
        }
    }
}
