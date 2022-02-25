package net.futureclient.loader.mixin.common;

import net.futureclient.client.AI;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GameSettings.class})
public abstract class MixinGameSettings {
    public MixinGameSettings() {
        MixinGameSettings mixinGameSettings;
    }

    @Inject(method={"<init>(Lnet/minecraft/client/Minecraft;Ljava/io/File;)V"}, at={@At(value="RETURN")})
    private void f$E(CallbackInfo callbackInfo) {
        AI.f$E().f$E();
    }
}
