package net.futureclient.loader.mixin.common.network.packet.clientbound;

import net.futureclient.client.G;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={SPacketEntityVelocity.class})
public abstract class MixinSPacketEntityVelocity
implements G {
    public MixinSPacketEntityVelocity() {
        MixinSPacketEntityVelocity mixinSPacketEntityVelocity;
    }

    @Override
    @Accessor
    public abstract void setMotionX(int var1);

    @Override
    @Accessor
    public abstract void setMotionY(int var1);

    @Override
    @Accessor
    public abstract void setMotionZ(int var1);
}
