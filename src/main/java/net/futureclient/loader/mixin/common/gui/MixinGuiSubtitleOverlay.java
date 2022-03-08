package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.event.events.ScaledResEvent;
import net.minecraft.client.gui.GuiSubtitleOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiSubtitleOverlay.class})
public abstract class MixinGuiSubtitleOverlay {

    @Inject(method={"renderSubtitles"}, at={@At(value="HEAD")})
    private void renderSubtitles(CallbackInfo callbackInfo) {
        //kH.f$E().f$E().f$E(new Zd());
        FutureClient.getINSTANCE().getEventManager().invoke(new ScaledResEvent());
    }
}
