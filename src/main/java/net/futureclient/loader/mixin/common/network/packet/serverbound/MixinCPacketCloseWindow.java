package net.futureclient.loader.mixin.common.network.packet.serverbound;

import net.futureclient.client.l;
import net.minecraft.network.play.client.CPacketCloseWindow;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={CPacketCloseWindow.class})
public abstract class MixinCPacketCloseWindow
implements l {
    public MixinCPacketCloseWindow() {
        MixinCPacketCloseWindow mixinCPacketCloseWindow;
    }

    @Override
    @Accessor
    public abstract int getWindowId();
}
