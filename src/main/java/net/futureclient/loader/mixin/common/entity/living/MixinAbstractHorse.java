package net.futureclient.loader.mixin.common.entity.living;

import net.futureclient.client.LF;
import net.futureclient.client.Yd;
import net.futureclient.client.kH;
import net.futureclient.loader.mixin.common.entity.living.MixinEntityLivingBase;
import net.minecraft.entity.passive.AbstractHorse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={AbstractHorse.class})
public abstract class MixinAbstractHorse
extends MixinEntityLivingBase {
    public MixinAbstractHorse() {
        MixinAbstractHorse mixinAbstractHorse;
    }

    @Inject(method={"getHorseJumpStrength"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$e(CallbackInfoReturnable<Double> callbackInfoReturnable) {
        LF lF = new LF();
        kH.f$E().f$E().f$E(lF);
        if (lF.f$E() != 0.0) {
            callbackInfoReturnable.setReturnValue((Object)lF.f$E());
        }
    }

    @Inject(method={"canBeSteered"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$a(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Yd yd = new Yd();
        kH.f$E().f$E().f$E(yd);
        if (yd.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    @Inject(method={"isHorseSaddled"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Yd yd = new Yd();
        kH.f$E().f$E().f$E(yd);
        if (yd.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }
}
