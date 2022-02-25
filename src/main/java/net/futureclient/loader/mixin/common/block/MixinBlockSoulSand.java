package net.futureclient.loader.mixin.common.block;

import net.futureclient.client.DF;
import net.futureclient.client.kH;
import net.minecraft.block.BlockSoulSand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={BlockSoulSand.class})
public abstract class MixinBlockSoulSand {
    public MixinBlockSoulSand() {
        MixinBlockSoulSand mixinBlockSoulSand;
    }

    @Inject(method={"onEntityCollision"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        DF dF = new DF();
        kH.f$E().f$E().f$E(dF);
        if (dF.f$E()) {
            callbackInfo.cancel();
        }
    }
}
