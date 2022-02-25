package net.futureclient.loader.mixin.common;

import net.futureclient.client.q;
import net.minecraft.util.Timer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Timer.class})
public abstract class MixinTimer
implements q {
    @Shadow
    public float field_194148_c;
    private float f$d = 1.0f;

    public MixinTimer() {
        MixinTimer mixinTimer;
    }

    @Inject(method={"updateTimer"}, at={@At(value="FIELD", target="net/minecraft/util/Timer.elapsedPartialTicks:F", ordinal=1)})
    private void f$E(CallbackInfo callbackInfo) {
        0.field_194148_c *= 0.f$d;
    }

    @Override
    public void f$E(float f) {
        0.f$d = f;
    }

    @Override
    public float f$E() {
        MixinTimer mixinTimer;
        return mixinTimer.f$d;
    }
}
