package net.futureclient.loader.mixin.common.entity.living;

import net.futureclient.client.B;
import net.futureclient.client.BB;
import net.futureclient.client.Ce;
import net.futureclient.client.iF;
import net.futureclient.client.kH;
import net.futureclient.client.mc;
import net.futureclient.client.wC;
import net.futureclient.loader.mixin.common.entity.MixinEntity;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.potion.Potion;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Mixin(value={EntityLivingBase.class})
public abstract class MixinEntityLivingBase
extends MixinEntity
implements B {
    @Shadow
    @Final
    private static DataParameter<Integer> field_184633_f;
    @Shadow
    public int field_184617_aD;
    @Shadow
    public int field_184628_bn;

    public MixinEntityLivingBase() {
        MixinEntityLivingBase mixinEntityLivingBase;
    }

    @Override
    @Accessor
    public abstract ItemStack getActiveItemStack();

    @Override
    public boolean f$E() {
        MixinEntityLivingBase mixinEntityLivingBase;
        return mixinEntityLivingBase.func_70083_f(7);
    }

    @Override
    public int f$E() {
        MixinEntityLivingBase mixinEntityLivingBase;
        return (Integer)mixinEntityLivingBase.field_70180_af.get(field_184633_f);
    }

    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="net/minecraft/entity/EntityLivingBase.isPotionActive(Lnet/minecraft/potion/Potion;)Z"))
    private boolean f$E(EntityLivingBase entityLivingBase2, Potion potion) {
        EntityLivingBase entityLivingBase2;
        if (entityLivingBase2 instanceof EntityPlayerSP && potion == MobEffects.LEVITATION) {
            iF iF2 = new iF();
            kH.f$E().f$E().f$E(iF2);
            if (iF2.f$E()) {
                return false;
            }
        }
        return entityLivingBase2.isPotionActive(potion);
    }

    @Inject(method={"isElytraFlying"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Entity entity = (Entity)0;
        if (entity instanceof EntityPlayerSP && (0 = (BB)kH.f$E().f$E().f$E(BB.class)) != null && 0.f$E() && 0.f$D.f$E() == mc.f$M) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"collideWithNearbyEntities"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$e(CallbackInfo callbackInfo) {
        wC wC2 = (wC)kH.f$E().f$E().f$E(wC.class);
        if (wC2 != null && wC2.f$E() && !wC2.f$M.f$E().booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"handleJumpWater"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$a(CallbackInfo callbackInfo) {
        Ce ce = new Ce();
        kH.f$E().f$E().f$E(ce);
        if (ce.f$E()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"handleJumpLava"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        Ce ce = new Ce();
        kH.f$E().f$E().f$E(ce);
        if (ce.f$E()) {
            callbackInfo.cancel();
        }
    }
}
