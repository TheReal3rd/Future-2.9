package net.futureclient.loader.mixin.common;

import net.futureclient.client.AI;
import net.minecraft.client.main.GameConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GameConfiguration.DisplayInformation.class})
public abstract class MixinGameConfiguration {
    public MixinGameConfiguration() {
        MixinGameConfiguration mixinGameConfiguration;
    }

    @Inject(method={"<init>(IIZZ)V"}, at={@At(value="RETURN")})
    private void f$E(int n, int n2, boolean bl, boolean bl2, CallbackInfo callbackInfo) {
        AI.f$E().f$E();
    }
}
