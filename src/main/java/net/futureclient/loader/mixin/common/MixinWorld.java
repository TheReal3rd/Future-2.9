package net.futureclient.loader.mixin.common;

import net.futureclient.client.kH;
import net.futureclient.client.qe;
import net.futureclient.client.t;
import net.futureclient.client.xd;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={World.class})
public abstract class MixinWorld
implements t {
    public MixinWorld() {
        MixinWorld mixinWorld;
    }

    @Override
    @Accessor
    public abstract float getRainingStrength();

    @Override
    @Accessor
    public abstract float getThunderingStrength();

    @Inject(method={"checkLightFor"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(EnumSkyBlock enumSkyBlock, BlockPos blockPos, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        qe qe2 = new qe(enumSkyBlock);
        kH.f$E().f$E().f$E(qe2);
        if (qe2.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"getRainStrength"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        xd xd2 = new xd();
        if (kH.f$E() != null) {
            kH.f$E().f$E().f$E(xd2);
        }
        if (xd2.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }
}
