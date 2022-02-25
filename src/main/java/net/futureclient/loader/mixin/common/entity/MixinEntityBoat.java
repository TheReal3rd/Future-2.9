package net.futureclient.loader.mixin.common.entity;

import net.futureclient.client.Tb;
import net.futureclient.client.kH;
import net.futureclient.loader.mixin.common.entity.MixinEntity;
import net.minecraft.entity.item.EntityBoat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={EntityBoat.class})
public abstract class MixinEntityBoat
extends MixinEntity {
    public MixinEntityBoat() {
        MixinEntityBoat mixinEntityBoat;
    }

    @Redirect(method={"updateMotion"}, at=@At(value="INVOKE", target="net/minecraft/entity/item/EntityBoat.hasNoGravity()Z"))
    private boolean f$E(EntityBoat entityBoat) {
        Tb tb = (Tb)kH.f$E().f$E().f$E(Tb.class);
        return 0.func_189652_ae() || tb != null && tb.f$E() && tb.f$g.f$E().floatValue() == 0.0f;
    }
}
