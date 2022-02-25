package net.futureclient.loader.mixin.common.entity.living;

import net.futureclient.client.Yd;
import net.futureclient.client.kH;
import net.futureclient.loader.mixin.common.entity.living.MixinAbstractHorse;
import net.minecraft.entity.passive.EntityLlama;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={EntityLlama.class})
public abstract class MixinEntityLlama
extends MixinAbstractHorse {
    public MixinEntityLlama() {
        MixinEntityLlama mixinEntityLlama;
    }

    @Inject(method={"canBeSteered"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Yd yd = new Yd();
        kH.f$E().f$E().f$E(yd);
        if (yd.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }
}
