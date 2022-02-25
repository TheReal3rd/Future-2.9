package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.WI;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.ServerSelectionList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiMultiplayer.class})
public abstract class MixinGuiMultiplayer {
    @Shadow
    private ServerSelectionList field_146803_h;

    public MixinGuiMultiplayer() {
        MixinGuiMultiplayer mixinGuiMultiplayer;
    }

    @Inject(method={"connectToSelected"}, at={@At(value="HEAD")})
    private void f$E(CallbackInfo callbackInfo) {
        WI.f$E(0.field_146803_h.getSelected() < 0 ? null : 0.field_146803_h.getListEntry(0.field_146803_h.getSelected()));
    }
}
