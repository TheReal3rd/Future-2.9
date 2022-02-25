package net.futureclient.loader.mixin.common;

import net.futureclient.client.Fe;
import net.futureclient.client.PD;
import net.futureclient.client.kH;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={MovementInputFromOptions.class})
public abstract class MixinMovementInput {
    public MixinMovementInput() {
        MixinMovementInput mixinMovementInput;
    }

    @Inject(method={"updatePlayerMoveState"}, at={@At(value="RETURN")})
    private void f$E(CallbackInfo callbackInfo) {
        MovementInputFromOptions movementInputFromOptions = (MovementInputFromOptions)0;
        kH.f$E().f$E().f$E(new PD((MovementInput)movementInputFromOptions));
    }

    @Redirect(method={"updatePlayerMoveState"}, at=@At(value="INVOKE", target="net/minecraft/client/settings/KeyBinding.isKeyDown()Z"))
    private boolean f$E(KeyBinding keyBinding) {
        MovementInputFromOptions movementInputFromOptions = (MovementInputFromOptions)0;
        Fe 02 = new Fe((MovementInput)movementInputFromOptions, keyBinding, keyBinding.isKeyDown());
        kH.f$E().f$E().f$E(02);
        return 02.f$a();
    }
}
