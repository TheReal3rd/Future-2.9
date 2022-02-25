package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.DG;
import net.futureclient.client.lG;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiMainMenu.class})
public abstract class MixinGuiMainMenu
extends GuiScreen {
    public MixinGuiMainMenu() {
        MixinGuiMainMenu mixinGuiMainMenu;
    }

    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    private void f$E(CallbackInfo callbackInfo) {
        if (!lG.f$E().f$E()) {
            0.buttonList.add(new GuiButton(167, 0.width / 2 - 100, 0.height / 4 + 48 + 72, "Account Manager"));
            for (GuiButton guiButton : 0.buttonList) {
                if (guiButton.id != 0 && guiButton.id != 4 && guiButton.id != 5) continue;
                guiButton.y += 12;
            }
        }
    }

    @Inject(method={"actionPerformed"}, at={@At(value="RETURN")})
    private void f$E(GuiButton guiButton, CallbackInfo callbackInfo) {
        GuiMainMenu guiMainMenu = (GuiMainMenu)0;
        if (guiButton.id == 167) {
            0.mc.displayGuiScreen((GuiScreen)new DG((GuiScreen)guiMainMenu));
        }
    }
}
