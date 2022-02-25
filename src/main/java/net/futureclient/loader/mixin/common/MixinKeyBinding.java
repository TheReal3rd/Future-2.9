package net.futureclient.loader.mixin.common;

import net.futureclient.client.CD;
import net.futureclient.client.kH;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={KeyBinding.class})
public abstract class MixinKeyBinding {
    @Shadow
    private boolean field_74513_e;

    public MixinKeyBinding() {
        MixinKeyBinding mixinKeyBinding;
    }

    @Inject(method={"unPressAllKeys"}, at={@At(value="HEAD")}, cancellable=true)
    private static void f$E(CallbackInfo callbackInfo) {
        CD cD = new CD();
        if (kH.f$E() != null) {
            kH.f$E().f$E().f$E(cD);
        }
        if (cD.f$E()) {
            Minecraft minecraft = Minecraft.getMinecraft();
            KeyBinding.setKeyBindState((int)minecraft.gameSettings.keyBindPickBlock.getKeyCode(), (boolean)false);
            KeyBinding.setKeyBindState((int)minecraft.gameSettings.keyBindUseItem.getKeyCode(), (boolean)false);
            KeyBinding.setKeyBindState((int)minecraft.gameSettings.keyBindAttack.getKeyCode(), (boolean)false);
            callbackInfo.cancel();
        }
    }

    @Inject(method={"isKeyDown"}, at={@At(value="RETURN")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (!((Boolean)callbackInfoReturnable.getReturnValue()).booleanValue()) {
            callbackInfoReturnable.setReturnValue((Object)0.field_74513_e);
        }
    }
}
