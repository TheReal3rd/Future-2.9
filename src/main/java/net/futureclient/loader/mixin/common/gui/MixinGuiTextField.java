package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.h;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiTextField;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={GuiTextField.class})
public abstract class MixinGuiTextField
implements h {
    public MixinGuiTextField() {
        MixinGuiTextField mixinGuiTextField;
    }

    @Override
    @Accessor
    public abstract FontRenderer getFontRenderer();

    @Override
    @Accessor
    public abstract String getText();

    @Override
    @Accessor
    public abstract int getCursorCounter();

    @Override
    @Accessor
    public abstract boolean isEnableBackgroundDrawing();

    @Override
    @Accessor
    public abstract boolean isIsEnabled();

    @Override
    @Accessor
    public abstract int getLineScrollOffset();

    @Override
    @Accessor
    public abstract int getEnabledColor();

    @Override
    @Accessor
    public abstract int getDisabledColor();

    @Override
    @Invoker
    public abstract void invokeDrawSelectionBox(int var1, int var2, int var3, int var4);

    @Override
    @Accessor
    public abstract int getWidth();

    @Override
    @Accessor
    public abstract int getHeight();
}
