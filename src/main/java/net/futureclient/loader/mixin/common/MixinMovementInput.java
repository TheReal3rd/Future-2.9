package net.futureclient.loader.mixin.common;

import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.event.events.Fe_Key_Event;
import net.futureclient.client.deof.event.events.MovementInputEvent;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.MovementInputFromOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={MovementInputFromOptions.class})
public abstract class MixinMovementInput {// Done
    public MixinMovementInput() {
        MixinMovementInput mixinMovementInput;
    }

    @Inject(method={"updatePlayerMoveState"}, at={@At(value="RETURN")})
    private void f$E(CallbackInfo callbackInfo) {
        MovementInputFromOptions movementInputFromOptions = (MovementInputFromOptions) (Object) this;
        //kH.f$E().f$E().f$E(new PD((MovementInput)movementInputFromOptions));
        FutureClient.getINSTANCE().getEventManager().invoke(new MovementInputEvent(movementInputFromOptions));
    }

    @Redirect(method={"updatePlayerMoveState"}, at=@At(value="INVOKE", target="net/minecraft/client/settings/KeyBinding.isKeyDown()Z"))
    private boolean f$E(KeyBinding keyBinding) {
        MovementInputFromOptions movementInputFromOptions = (MovementInputFromOptions) (Object) this;
        Fe_Key_Event event = new Fe_Key_Event(movementInputFromOptions, keyBinding, keyBinding.isKeyDown());
        FutureClient.getINSTANCE().getEventManager().invoke(event);
        return event.isKeyDown();
    }
}
