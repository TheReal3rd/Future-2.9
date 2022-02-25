package net.futureclient.loader.mixin.common;

import net.futureclient.client.De;
import net.futureclient.client.SD;
import net.futureclient.client.kH;
import net.minecraft.client.multiplayer.WorldClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={WorldClient.class})
public abstract class MixinWorldClient {
    public MixinWorldClient() {
        MixinWorldClient mixinWorldClient;
    }

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void f$E(CallbackInfo callbackInfo) {
        WorldClient worldClient = (WorldClient)0;
        kH.f$E().f$E().f$E(new De(worldClient));
    }

    @ModifyVariable(method={"showBarrierParticles(IIIILjava/util/Random;ZLnet/minecraft/util/math/BlockPos$MutableBlockPos;)V"}, at=@At(value="HEAD"))
    private boolean f$E(boolean bl) {
        SD sD = new SD();
        kH.f$E().f$E().f$E(sD);
        return sD.f$E() || bl;
    }
}
