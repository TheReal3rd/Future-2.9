package net.futureclient.loader.mixin.common.entity.living.player;

import net.futureclient.client.Me;
import net.futureclient.client.he;
import net.futureclient.client.kH;
import net.futureclient.client.ye;
import net.futureclient.loader.mixin.common.entity.living.MixinEntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={EntityPlayer.class})
public abstract class MixinEntityPlayer
extends MixinEntityLivingBase {
    private boolean f$d;

    public MixinEntityPlayer() {
        MixinEntityPlayer mixinEntityPlayer;
    }

    @Shadow
    public abstract String func_70005_c_();

    @Shadow
    public abstract float func_110139_bj();

    @Shadow
    public void func_70071_h_() {
    }

    @Inject(method={"getAbsorptionAmount"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$e(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (!(0.f$d ^= true)) {
            return;
        }
        try {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.func_110139_bj()));
        }
        catch (ClassCastException classCastException) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }

    @Inject(method={"isEntityInsideOpaqueBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$a(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        ye ye2 = new ye();
        kH.f$E().f$E().f$E(ye2);
        if (ye2.f$E()) {
            callbackInfoReturnable.cancel();
        }
    }

    @Inject(method={"isPushedByWater"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        he he2 = new he();
        kH.f$E().f$E().f$E(he2);
        if (he2.f$E()) {
            callbackInfoReturnable.cancel();
        }
    }

    @Redirect(method={"attackTargetEntityWithCurrentItem"}, at=@At(value="INVOKE", target="net/minecraft/entity/player/EntityPlayer.setSprinting(Z)V"))
    private void f$E(EntityPlayer entityPlayer, boolean bl) {
        Me me = new Me();
        kH.f$E().f$E().f$E(me);
        if (me.f$E()) {
            0.field_70159_w /= 0.6;
            0.field_70179_y /= 0.6;
            return;
        }
        entityPlayer.func_70031_b(bl);
    }
}
