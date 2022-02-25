package net.futureclient.loader.mixin.common.network.packet.serverbound;

import net.futureclient.client.k;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.util.EnumHand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={CPacketAnimation.class})
public abstract class MixinCPacketAnimation
implements k {
    public MixinCPacketAnimation() {
        MixinCPacketAnimation mixinCPacketAnimation;
    }

    @Override
    @Accessor
    public abstract void setHand(EnumHand var1);
}
