package net.futureclient.loader.mixin.baritone;

import net.futureclient.client.deof.baritone.BaritoneAPIInterface;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Minecraft.class})
public abstract class MixinMinecraft {
    public MixinMinecraft() {
        MixinMinecraft mixinMinecraft;
    }

    @Inject(method={"init"}, at={@At(value="RETURN")})
    private void f$E(CallbackInfo callbackInfo) {
        BaritoneAPIInterface.Baritone.start();// OG Bi.f$M.f$E()
    }
}
