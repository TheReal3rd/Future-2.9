package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.Zd;
import net.futureclient.client.kH;
import net.minecraft.client.gui.GuiSubtitleOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiSubtitleOverlay.class})
public abstract class MixinGuiSubtitleOverlay {
    public MixinGuiSubtitleOverlay() {
        MixinGuiSubtitleOverlay mixinGuiSubtitleOverlay;
    }

    @Inject(method={"renderSubtitles"}, at={@At(value="HEAD")})
    private void f$E(CallbackInfo callbackInfo) {
        kH.f$E().f$E().f$E(new Zd());
    }
}
