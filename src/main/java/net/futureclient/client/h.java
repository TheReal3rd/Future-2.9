package net.futureclient.client;

import net.minecraft.client.gui.FontRenderer;

public interface h {
    public String getText();

    public boolean isIsEnabled();

    public void invokeDrawSelectionBox(int var1, int var2, int var3, int var4);

    public int getDisabledColor();

    public boolean isEnableBackgroundDrawing();

    public int getLineScrollOffset();

    public int getEnabledColor();

    public int getCursorCounter();

    public int getHeight();

    public int getWidth();

    public FontRenderer getFontRenderer();
}
