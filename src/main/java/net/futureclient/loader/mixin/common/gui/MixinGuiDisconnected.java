package net.futureclient.loader.mixin.common.gui;

import java.io.IOException;
import net.futureclient.client.WI;
import net.futureclient.client.kH;
import net.futureclient.client.lG;
import net.futureclient.client.nB;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.GuiConnecting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiDisconnected.class})
public abstract class MixinGuiDisconnected
extends GuiScreen {
    @Shadow
    private int field_175353_i;

    public MixinGuiDisconnected() {
        MixinGuiDisconnected mixinGuiDisconnected;
    }

    @Inject(method={"initGui"}, at={@At(value="RETURN")})
    private void f$E(CallbackInfo callbackInfo) {
        if (lG.f$E().f$E()) {
            return;
        }
        0.buttonList.add(new GuiButton(1, 0.width / 2 - 100, 0.height / 2 + 0.field_175353_i / 2 + 0.fontRenderer.FONT_HEIGHT + 24, "Reconnect"));
        0.buttonList.add(new GuiButton(2, 0.width / 2 - 100, 0.height / 2 + 0.field_175353_i / 2 + 0.fontRenderer.FONT_HEIGHT + 48, "AutoReconnect"));
        nB nB2 = (nB)kH.f$E().f$E().f$E(nB.class);
        if (nB2 != null && nB2.f$E()) {
            WI.f$g = Math.round(nB2.f$d.f$E().floatValue() * 20.0f);
        }
    }

    @Redirect(method={"actionPerformed"}, at=@At(value="INVOKE", ordinal=0, target="net/minecraft/client/Minecraft.displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V"))
    private void f$E(Minecraft minecraft, GuiScreen guiScreen) {
        if (!lG.f$E().f$E()) {
            minecraft.displayGuiScreen((GuiScreen)new GuiMultiplayer(null));
        } else {
            minecraft.displayGuiScreen(guiScreen);
        }
    }

    @Inject(method={"actionPerformed"}, at={@At(value="RETURN")})
    private void f$E(GuiButton guiButton, CallbackInfo callbackInfo) {
        if (lG.f$E().f$E()) {
            return;
        }
        GuiDisconnected guiDisconnected = (GuiDisconnected)0;
        if (guiButton.id == 1) {
            if (WI.f$d != null) {
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiConnecting((GuiScreen)guiDisconnected, Minecraft.getMinecraft(), WI.f$d));
            }
        } else if (guiButton.id == 2 && (0 = (nB)kH.f$E().f$E().f$E(nB.class)) != null) {
            0.f$E();
            if (0.f$E()) {
                WI.f$g = Math.round(0.f$d.f$E().floatValue() * 20.0f);
            }
        }
    }

    public void updateScreen() {
        MixinGuiDisconnected mixinGuiDisconnected;
        super.updateScreen();
        if (lG.f$E().f$E()) {
            return;
        }
        if (mixinGuiDisconnected.buttonList.size() > 1) {
            nB nB2 = (nB)kH.f$E().f$E().f$E(nB.class);
            if (nB2 != null && nB2.f$E()) {
                ((GuiButton)mixinGuiDisconnected.buttonList.get((int)2)).displayString = "AutoReconnect (" + (WI.f$g / 20 + 1) + ")";
                if (WI.f$g > 0) {
                    --WI.f$g;
                } else {
                    try {
                        mixinGuiDisconnected.actionPerformed((GuiButton)mixinGuiDisconnected.buttonList.get(1));
                    }
                    catch (IOException iOException) {}
                }
            } else {
                ((GuiButton)mixinGuiDisconnected.buttonList.get((int)2)).displayString = "AutoReconnect";
            }
        }
    }
}
