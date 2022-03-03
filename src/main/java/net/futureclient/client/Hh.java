package net.futureclient.client;

import net.futureclient.client.nG;
import net.minecraft.util.math.BlockPos;

public class HH {
    private nG f$d;
    private BlockPos f$g;

    public BlockPos f$E() {
        HH hH;
        return hH.f$g;
    }

    public HH(BlockPos blockPos, nG nG2) {
        HH hH = 0;
        hH.f$g = blockPos;
        hH.f$d = nG2;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 1;
        int cfr_ignored_0 = 5 << 3 ^ 4;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 << 2 ^ 3);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public nG f$E() {
        HH hH;
        return hH.f$d;
    }
}
package net.futureclient.client;

import java.util.Collections;
import net.futureclient.client.h;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiTextField;

public class hh
extends GuiTextField {
    private static final String f$d = "*";

    public hh(int n, FontRenderer fontRenderer, int n2, int n3, int n4, int n5) {
        super(n, fontRenderer, n2, n3, n4, n5);
    }

    /*
     * Unable to fully structure code
     */
    public void drawTextBox() {
        block10: {
            if (!0.getVisible()) break block10;
            if (0.getEnableBackgroundDrawing()) {
                hh.func_73734_a((int)(0.x - 1), (int)(0.y - 1), (int)(0.x + ((h)0).getWidth() + 1), (int)(0.y + ((h)0).getHeight() + 1), (int)-6250336);
                v0 = 0;
                hh.func_73734_a((int)v0.x, (int)v0.y, (int)(0.x + ((h)0).getWidth()), (int)(0.y + ((h)0).getHeight()), (int)-16777216);
            }
            var1_1 = ((h)0).isIsEnabled() != false ? ((h)0).getEnabledColor() : ((h)0).getDisabledColor();
            var2_2 = 0.getCursorPosition() - ((h)0).getLineScrollOffset();
            var3_3 = 0.getSelectionEnd() - ((h)0).getLineScrollOffset();
            var4_4 = ((h)0).getFontRenderer().trimStringToWidth(((h)0).getText().substring(((h)0).getLineScrollOffset()), 0.getWidth());
            var5_5 = var2_2 >= 0 && var2_2 <= var4_4.length();
            var6_6 = 0.isFocused() != false && ((h)0).getCursorCounter() / 6 % 2 == 0 && var5_5 != false;
            v1 = 0;
            var7_7 = ((h)0).isEnableBackgroundDrawing() != false ? v1.x + 4 : v1.x;
            v2 = 0;
            var8_8 = ((h)0).isEnableBackgroundDrawing() != false ? v2.y + (((h)0).getHeight() - 8) / 2 : v2.y;
            var9_9 = var7_7;
            if (var3_3 > var4_4.length()) {
                var3_3 = var4_4.length();
            }
            if (!var4_4.isEmpty()) {
                var10_10 = var5_5 != false ? var4_4.substring(0, var2_2) : var4_4;
                var9_9 = ((h)0).getFontRenderer().drawStringWithShadow(String.join((CharSequence)"", Collections.nCopies(var10_10.length(), "*")), (float)var7_7, (float)var8_8, var1_1);
            }
            var10_11 = 0.getCursorPosition() < ((h)0).getText().length() || ((h)0).getText().length() >= 0.getMaxStringLength();
            var11_12 = var9_9;
            if (!var5_5) {
                var11_12 = var2_2 > 0 ? var7_7 + ((h)0).getWidth() : var7_7;
                v3 = var4_4;
            } else {
                if (var10_11) {
                    var11_12 = var9_9-- - 1;
                }
                v3 = var4_4;
            }
            if (!v3.isEmpty() && var5_5 && var2_2 < var4_4.length()) {
                var9_9 = ((h)0).getFontRenderer().drawStringWithShadow(String.join((CharSequence)"", Collections.nCopies(var4_4.substring(var2_2).length(), "*")), (float)var9_9, (float)var8_8, var1_1);
            }
            if (!var6_6) ** GOTO lbl41
            if (var10_11) {
                v4 = var11_12;
                Gui.drawRect((int)v4, (int)(var8_8 - 1), (int)(v4 + 1), (int)(var8_8 + 1 + ((h)0).getFontRenderer().FONT_HEIGHT), (int)-3092272);
                v5 = var3_3;
            } else {
                ((h)0).getFontRenderer().drawStringWithShadow("_", (float)var11_12, (float)var8_8, var1_1);
lbl41:
                // 2 sources

                v5 = var3_3;
            }
            if (v5 != var2_2) {
                var1_1 = var7_7 + ((h)0).getFontRenderer().getStringWidth(String.join((CharSequence)"", Collections.nCopies(var4_4.substring(0, var3_3).length(), "*")));
                ((h)0).invokeDrawSelectionBox(var11_12, var8_8 - 1, var1_1 - 1, var8_8 + 1 + ((h)0).getFontRenderer().FONT_HEIGHT);
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.ni;

public final class hH {
    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 4 << 4 ^ 1;
        int n4 = n2;
        int n5 = 1 << 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public hH() {
        hH hH2;
    }

    /*
     * Unable to fully structure code
     */
    public static void f$E(String 0, String 0, int 0) {
        var3_4 = Boolean.parseBoolean(System.getProperty("java.awt.headless"));
        System.setProperty("java.awt.headless", String.valueOf(false));
        var4_6 = null;
        var5_7 = null;
        try {
            var4_6 = Class.forName("javax.swing.UIManager");
            var5_7 = var4_6.getMethod("getLookAndFeel", new Class[0]).invoke(null, new Object[0]);
            var6_8 = (String)var4_6.getMethod("getSystemLookAndFeelClassName", new Class[0]).invoke(null, new Object[0]);
            var4_6.getMethod("setLookAndFeel", new Class[]{String.class}).invoke(null, new Object[]{var6_8});
            ** GOTO lbl23
        }
        catch (Exception var6_9) {
lbl23:
            // 2 sources

            var6_8 = Class.forName("javax.swing.JFrame");
            var7_10 = var6_8.newInstance();
            var6_8.getMethod("setAlwaysOnTop", new Class[]{Boolean.TYPE}).invoke(var7_10, new Object[]{true});
            var6_8.getMethod("setFocusable", new Class[]{Boolean.TYPE}).invoke(var7_10, new Object[]{true});
            var8_11 = Class.forName("java.awt.Component");
            v0 = new Object[4];
            v0[0] = var7_10;
            v0[1] = 0;
            v0[2] = "[Future] " + 0;
            v0[3] = 0;
            Class.forName("javax.swing.JOptionPane").getMethod("showMessageDialog", new Class[]{var8_11, Object.class, String.class, Integer.TYPE}).invoke(null, v0);
            var6_8.getMethod("dispose", new Class[0]).invoke(var7_10, new Object[0]);
            try {
                if (var4_6 != null && var5_7 != null) {
                    0 = Class.forName("javax.swing.LookAndFeel");
                    var4_6.getMethod("setLookAndFeel", new Class[]{0}).invoke(null, new Object[]{var5_7});
                }
                ** GOTO lbl59
            }
            catch (Exception 0) {
                try {
lbl59:
                    // 2 sources

                    System.setProperty("java.awt.headless", String.valueOf(var3_4));
                    return;
                }
                catch (Throwable var3_5) {
                    ni.f$E(var3_5);
                    return;
                }
            }
        }
    }
}
