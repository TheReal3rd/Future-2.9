package net.futureclient.loader.mixin.common.entity.living.player;

import net.futureclient.client.bj;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.lG;
import net.futureclient.loader.mixin.common.entity.living.player.MixinEntityPlayer;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={AbstractClientPlayer.class})
public abstract class MixinAbstractClientPlayer
extends MixinEntityPlayer {
    public MixinAbstractClientPlayer() {
        MixinAbstractClientPlayer mixinAbstractClientPlayer;
    }

    @Inject(method={"getLocationCape"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<ResourceLocation> callbackInfoReturnable) {
        if (lG.f$E().f$E()) {
            return;
        }
        gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
        if (gF2 != null && gF2.f$F.f$E().booleanValue() && (0 = bj.f$E((EntityPlayer)((AbstractClientPlayer)0))) != null) {
            callbackInfoReturnable.setReturnValue((Object)new ResourceLocation(0.f$E()));
        }
    }
}
