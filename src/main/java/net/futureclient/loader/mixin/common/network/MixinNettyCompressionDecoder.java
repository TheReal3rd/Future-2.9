package net.futureclient.loader.mixin.common.network;

import net.futureclient.client.GE;
import net.futureclient.client.kH;
import net.minecraft.network.NettyCompressionDecoder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value={NettyCompressionDecoder.class})
public abstract class MixinNettyCompressionDecoder {
    public MixinNettyCompressionDecoder() {
        MixinNettyCompressionDecoder mixinNettyCompressionDecoder;
    }

    @ModifyConstant(method={"decode"}, constant={@Constant(intValue=0x200000)})
    private int f$E(int n) {
        GE gE = new GE();
        kH.f$E().f$E().f$E(gE);
        return gE.f$E() ? Integer.MAX_VALUE : n;
    }
}
