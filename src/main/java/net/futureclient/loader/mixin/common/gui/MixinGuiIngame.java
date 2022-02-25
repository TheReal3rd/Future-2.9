package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.Mg;
import net.futureclient.client.Yf;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiIngame.class})
public abstract class MixinGuiIngame {
    public MixinGuiIngame() {
        MixinGuiIngame mixinGuiIngame;
    }

    @Inject(method={"renderPotionEffects"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$a(CallbackInfo callbackInfo) {
        gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
        if (gF2 != null && ((Mg)((Object)gF2.f$D.f$E())).equals((Object)Mg.f$M)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderPumpkinOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        Yf yf = new Yf();
        kH.f$E().f$E().f$E(yf);
        if (yf.f$E()) {
            callbackInfo.cancel();
        }
    }
}
