package net.futureclient.loader.mixin.common.entity.living.player;

import net.futureclient.client.EE;
import net.futureclient.client.HD;
import net.futureclient.client.M;
import net.futureclient.client.kH;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={PlayerControllerMP.class})
public abstract class MixinPlayerControllerMP
implements M {
    @Shadow
    private float field_78770_f;
    @Shadow
    private int field_78781_i;

    public MixinPlayerControllerMP() {
        MixinPlayerControllerMP mixinPlayerControllerMP;
    }

    @Override
    @Invoker
    public abstract void invokeSyncCurrentPlayItem();

    @Override
    @Accessor
    public abstract float getCurBlockDamageMP();

    @Inject(method={"clickBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(BlockPos blockPos, EnumFacing enumFacing, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        HD hD = new HD(blockPos, enumFacing);
        kH.f$E().f$E().f$E(hD);
        if (hD.f$E()) {
            callbackInfoReturnable.cancel();
        }
    }

    @Redirect(method={"onPlayerDamageBlock"}, at=@At(value="INVOKE", target="net/minecraft/client/multiplayer/PlayerControllerMP.syncCurrentPlayItem()V"))
    private void f$E(PlayerControllerMP playerControllerMP, BlockPos blockPos, EnumFacing enumFacing) {
        EE eE = new EE(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p(), 0.field_78781_i, 0.field_78770_f, enumFacing, blockPos);
        kH.f$E().f$E().f$E(eE);
        0.invokeSyncCurrentPlayItem();
        if (0.field_78781_i != eE.f$E()) {
            0.field_78781_i = eE.f$E();
        }
        if (0.field_78770_f != eE.f$E()) {
            0.field_78770_f = eE.f$E();
        }
    }
}
