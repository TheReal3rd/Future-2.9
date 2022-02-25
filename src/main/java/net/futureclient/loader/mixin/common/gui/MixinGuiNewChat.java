package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.La;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.util.text.ITextComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiNewChat.class})
public abstract class MixinGuiNewChat {
    public MixinGuiNewChat() {
        MixinGuiNewChat mixinGuiNewChat;
    }

    @ModifyVariable(method={"setChatLine"}, at=@At(value="HEAD"), ordinal=0)
    private int f$E(int n) {
        if (n == La.f$i) {
            n = 0;
        }
        return n;
    }

    @Inject(method={"printChatMessageWithOptionalDeletion"}, at={@At(value="INVOKE", target="net/minecraft/client/gui/GuiNewChat.setChatLine(Lnet/minecraft/util/text/ITextComponent;IIZ)V", shift=At.Shift.AFTER)}, cancellable=true)
    private void f$E(ITextComponent iTextComponent, int n, CallbackInfo callbackInfo) {
        if (n == La.f$i || n == La.f$M) {
            callbackInfo.cancel();
        }
    }
}
