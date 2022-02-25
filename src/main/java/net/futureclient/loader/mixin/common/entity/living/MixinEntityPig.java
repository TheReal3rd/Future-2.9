package net.futureclient.loader.mixin.common.entity.living;

import net.futureclient.client.YD;
import net.futureclient.client.Yd;
import net.futureclient.client.kH;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={EntityPig.class})
public abstract class MixinEntityPig
extends EntityAnimal {
    public MixinEntityPig(World world) {
        super(world);
    }

    @Inject(method={"canBeSteered"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Yd yd = new Yd();
        kH.f$E().f$E().f$E(yd);
        if (yd.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="net/minecraft/entity/passive/EntityAnimal.travel(FFF)V"))
    private void f$E(EntityAnimal entityAnimal, float f, float f2, float f3) {
        YD yD = new YD();
        kH.f$E().f$E().f$E(yD);
        super.func_191986_a(f, f2, yD.f$E() ? 0.0f : f3);
    }
}
