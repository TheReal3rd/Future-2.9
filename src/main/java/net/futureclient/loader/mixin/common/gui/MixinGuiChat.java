package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.lG;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={GuiChat.class})
public abstract class MixinGuiChat
extends GuiScreen {
    @Shadow
    public GuiTextField field_146415_a;

    public MixinGuiChat() {
        MixinGuiChat mixinGuiChat;
    }

    @Redirect(method={"drawScreen"}, at=@At(value="INVOKE", target="net/minecraft/client/gui/GuiChat.drawRect(IIIII)V"))
    private void f$E(int n6, int n2, int n3, int n4, int n5) {
        if (!lG.f$E().f$E()) {
            0.field_146415_a.setFocused(Display.isActive());
            gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
            if (gF2 != null && !gF2.f$i) {
                gF2.f$i = true;
            }
            MixinGuiChat.func_73734_a((int)n6, (int)(0.height - (gF2 != null ? gF2.f$j : 14)), (int)n3, (int)n4, (int)n5);
        } else {
            int n6;
            MixinGuiChat.func_73734_a((int)n6, (int)n2, (int)n3, (int)n4, (int)n5);
        }
    }
}
