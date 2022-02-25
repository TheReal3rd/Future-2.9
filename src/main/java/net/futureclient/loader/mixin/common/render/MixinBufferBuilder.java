package net.futureclient.loader.mixin.common.render;

import java.nio.IntBuffer;
import net.futureclient.client.ba;
import net.futureclient.client.kH;
import net.minecraft.client.renderer.BufferBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={BufferBuilder.class})
public abstract class MixinBufferBuilder {
    public MixinBufferBuilder() {
        MixinBufferBuilder mixinBufferBuilder;
    }

    @Redirect(method={"putColorMultiplier"}, at=@At(value="INVOKE", remap=false, target="java/nio/IntBuffer.put(II)Ljava/nio/IntBuffer;"))
    private IntBuffer f$E(IntBuffer intBuffer2, int n, int n22) {
        IntBuffer intBuffer2;
        ba ba2 = (ba)kH.f$E().f$E().f$E(ba.class);
        if (ba2 != null && ba2.f$E()) {
            int n22 = ba2.f$K.f$E().intValue() << 24 | n22 & 0xFFFFFF;
        }
        return intBuffer2.put(n, n22);
    }
}
