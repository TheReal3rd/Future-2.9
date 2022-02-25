package net.futureclient.loader.mixin.common.network.packet.clientbound;

import net.futureclient.client.I;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={SPacketPlayerPosLook.class})
public abstract class MixinSPacketPlayerPosLook
implements I {
    public MixinSPacketPlayerPosLook() {
        MixinSPacketPlayerPosLook mixinSPacketPlayerPosLook;
    }

    @Override
    @Accessor
    public abstract void setYaw(float var1);

    @Override
    @Accessor
    public abstract void setPitch(float var1);
}
