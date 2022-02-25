package net.futureclient.client;

import java.io.IOException;
import java.util.Iterator;
import net.futureclient.client.NH;
import net.futureclient.client.eH;
import net.futureclient.client.jG;
import net.futureclient.client.kH;
import net.futureclient.client.ph;
import net.futureclient.client.xI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class DG
extends GuiScreen {
    private NH f$b;
    private final xI f$K;
    private static final ResourceLocation f$e;
    private GuiTextField f$j;
    private int f$M;
    private Minecraft f$d;
    private GuiScreen f$I;
    private boolean f$g;
    private String f$i;

    public static FontRenderer f$e(DG dG) {
        return dG.fontRenderer;
    }

    public static FontRenderer f$B(DG dG) {
        return dG.fontRenderer;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void actionPerformed(GuiButton guiButton2) throws IOException {
        switch (guiButton2.id) {
            case 0: {
                DG dG = dG;
                dG.f$d.displayGuiScreen((GuiScreen)new eH(dG, 0, dG.f$b.f$M));
                return;
            }
            case 1: {
                DG dG = dG;
                dG.f$K.f$E(dG.f$b.f$M);
                return;
            }
            case 2: {
                dG.f$d.displayGuiScreen((GuiScreen)new eH(dG, 3, -1));
                return;
            }
            case 3: {
                DG dG = dG;
                dG.f$d.displayGuiScreen((GuiScreen)new eH(dG, 1, dG.f$b.f$M));
                return;
            }
            case 4: {
                int guiButton2 = (int)(Math.random() * (double)dG.f$K.f$E().size());
                DG dG = dG;
                dG.f$b.f$M = guiButton2;
                dG.f$K.f$E(guiButton2);
                dG.f$b.scrollBy(-dG.f$b.getAmountScrolled() + 36 * dG.f$b.f$M);
                return;
            }
            case 5: {
                DG dG;
                DG dG2 = dG;
                dG2.f$d.displayGuiScreen(dG2.f$I);
                return;
            }
            case 6: {
                DG dG;
                DG dG3 = dG;
                dG.f$d.displayGuiScreen((GuiScreen)new eH(dG3, 2, dG3.f$b.f$M));
                return;
            }
        }
    }

    public static FontRenderer f$a(DG dG) {
        return dG.fontRenderer;
    }

    public void updateScreen() {
        DG dG;
        DG dG2 = dG;
        dG2.f$j.updateCursorCounter();
        dG2.f$K.f$a();
    }

    public static FontRenderer f$A(DG dG) {
        return dG.fontRenderer;
    }

    public static FontRenderer f$h(DG dG) {
        return dG.fontRenderer;
    }

    public void mouseClicked(int n, int n2, int n3) throws IOException {
        DG dG = 0;
        super.mouseClicked(n, n2, n3);
        dG.f$j.mouseClicked(n, n2, n3);
    }

    public static Minecraft f$E(DG dG) {
        return dG.f$d;
    }

    public DG(GuiScreen guiScreen) {
        DG dG = 0;
        dG.f$K = kH.f$E().f$E();
        dG.f$d = Minecraft.getMinecraft();
        dG.f$I = guiScreen;
    }

    public static FontRenderer f$H(DG dG) {
        return dG.fontRenderer;
    }

    public static NH f$E(DG dG) {
        return dG.f$b;
    }

    public static ResourceLocation f$E() {
        return f$e;
    }

    public static FontRenderer f$K(DG dG) {
        return dG.fontRenderer;
    }

    public static xI f$E(DG dG) {
        return dG.f$K;
    }

    static {
        f$e = new ResourceLocation("textures/gui/server_selection.png");
    }

    public void initGui() {
        int n;
        DG dG;
        dG.buttonList.add(new GuiButton(0, dG.width / 2 - 154, dG.height - 48, 73, 20, "Add"));
        dG.buttonList.add(new GuiButton(1, dG.width / 2 - 76, dG.height - 48, 73, 20, "Login"));
        dG.buttonList.add(new GuiButton(2, dG.width / 2, dG.height - 48, 73, 20, "Direct"));
        dG.buttonList.add(new GuiButton(3, dG.width / 2 + 78, dG.height - 48, 73, 20, "Delete"));
        dG.buttonList.add(new GuiButton(4, dG.width / 2 - 154, dG.height - 26, 73, 20, "Random"));
        dG.buttonList.add(new GuiButton(5, dG.width / 2 - 76, dG.height - 26, 149, 20, "Back"));
        dG.buttonList.add(new GuiButton(6, dG.width / 2 + 78, dG.height - 26, 73, 20, "Edit"));
        dG.f$i = String.format("Account Manager %s[%s%s%s]", TextFormatting.GRAY, TextFormatting.WHITE, dG.f$K.f$E().size(), TextFormatting.GRAY);
        DG dG2 = dG;
        dG.f$M = dG.width / 2 + dG2.fontRenderer.getStringWidth(dG.f$i) / 2 + 8;
        dG.f$g = dG2.width - 120 < dG.f$M;
        DG dG3 = dG;
        DG dG4 = dG;
        int n2 = dG4.f$g ? dG.f$M : dG.width - 120;
        if (dG.f$g) {
            DG dG5 = dG;
            n = dG5.width - dG5.f$M - 10;
        } else {
            n = 110;
        }
        dG3.f$j = new GuiTextField(7, dG4.fontRenderer, n2, 10, n, 20);
        dG.f$j.setMaxStringLength(100);
        dG.f$b = new NH(dG);
    }

    public static FontRenderer f$E(DG dG) {
        return dG.fontRenderer;
    }

    public static FontRenderer f$C(DG dG) {
        return dG.fontRenderer;
    }

    public void handleMouseInput() throws IOException {
        DG dG;
        DG dG2 = dG;
        super.handleMouseInput();
        dG2.f$b.handleMouseInput();
    }

    public void drawScreen(int n, int n2, float f) {
        DG dG;
        if (0.f$b.f$M < 0) {
            ((GuiButton)0.buttonList.get((int)1)).enabled = false;
            ((GuiButton)0.buttonList.get((int)3)).enabled = false;
            ((GuiButton)0.buttonList.get((int)6)).enabled = false;
            dG = 0;
        } else {
            ((GuiButton)0.buttonList.get((int)1)).enabled = !0.f$K.f$I;
            ((GuiButton)0.buttonList.get((int)3)).enabled = true;
            ((GuiButton)0.buttonList.get((int)6)).enabled = true;
            dG = 0;
        }
        boolean bl = ((GuiButton)dG.buttonList.get((int)4)).enabled = !0.f$K.f$E().isEmpty();
        if (!0.f$K.f$a().equals(0.f$d.getSession().getUsername()) && 0.f$b.f$M != -1) {
            ph ph2 = (ph)0.f$K.f$E().get(0.f$b.f$M);
            if (ph2.f$E().equals((Object)jG.f$b)) {
                ph2.f$E(jG.f$j);
            }
            ph2.f$K(0.f$d.getSession().getUsername());
            DG dG2 = 0;
            dG2.f$K.f$a(dG2.f$d.getSession().getUsername());
        }
        DG dG3 = 0;
        dG3.f$b.drawScreen(n, n2, f);
        DG dG4 = 0;
        dG4.func_73732_a(dG3.f$d.fontRenderer, 0.f$i, dG4.width / 2, 2 + 0.f$d.fontRenderer.FONT_HEIGHT * 3, 0xFFFFFF);
        dG3.f$K.f$E();
        dG3.func_73731_b(dG3.f$d.fontRenderer, String.format("%sUsername: %s%s", TextFormatting.GRAY, TextFormatting.WHITE, 0.f$d.getSession().getUsername()), 2, 2 + 0.f$d.fontRenderer.FONT_HEIGHT * 2, 0xFFFFFF);
        DG dG5 = 0;
        dG5.f$j.drawTextBox();
        if (!dG5.f$j.isFocused()) {
            DG dG6 = 0;
            dG6.f$j.setText("");
            DG dG7 = 0;
            DG dG8 = 0;
            dG7.func_73731_b(dG6.f$d.fontRenderer, TextFormatting.GRAY + "Search", dG7.f$g ? dG8.f$M + 4 : dG8.width - 0.fontRenderer.getStringWidth("Search") - 80, 16, 0xFFFFFF);
        }
        super.drawScreen(n, n2, f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void keyTyped(char c, int n6) throws IOException {
        DG dG;
        boolean bl;
        block10: {
            if (!dG.f$j.isFocused()) {
                int n2 = dG.f$b.f$M;
                if (n2 >= 0) {
                    if (n6 == 200) {
                        if (n2 <= 0) return;
                        if (DG.isShiftKeyDown()) {
                            ph ph2 = (ph)dG.f$K.f$E().get(n2);
                            int n3 = n2;
                            dG.f$K.f$E().set(n3, dG.f$K.f$E().get(n3 - 1));
                            dG.f$K.f$E().set(n2 - 1, ph2);
                        }
                        DG dG2 = dG;
                        --dG2.f$b.f$M;
                        dG2.f$b.scrollBy(-dG.f$b.getSlotHeight());
                        return;
                    }
                    if (n6 == 208) {
                        if (n2 >= dG.f$b.getSize() - 1) return;
                        if (DG.isShiftKeyDown()) {
                            ph ph3 = (ph)dG.f$K.f$E().get(n2);
                            int n4 = n2;
                            dG.f$K.f$E().set(n4, dG.f$K.f$E().get(n4 + 1));
                            dG.f$K.f$E().set(n2 + 1, ph3);
                        }
                        dG.f$b.f$M = n2 + 1;
                        dG.f$b.scrollBy(dG.f$b.getSlotHeight());
                        return;
                    }
                    if (n6 != 28 && n6 != 156) {
                        super.keyTyped(c, n6);
                        return;
                    }
                    DG dG3 = dG;
                    dG3.actionPerformed((GuiButton)dG3.buttonList.get(1));
                    return;
                }
                super.keyTyped(c, n6);
                return;
            }
            DG dG4 = dG;
            super.keyTyped(c, n6);
            dG4.f$j.textboxKeyTyped(c, n6);
            boolean bl2 = false;
            if (dG4.f$j.getText().length() > 0) {
                int n5 = 0;
                Iterator iterator = c = dG.f$K.f$E().iterator();
                while (iterator.hasNext()) {
                    ph n6 = (ph)c.next();
                    if (n6.f$A().toLowerCase().contains(dG.f$j.getText().toLowerCase()) || n6.f$h().toLowerCase().contains(dG.f$j.getText().toLowerCase())) {
                        dG.f$b.f$M = n5;
                        dG.f$b.scrollBy(-dG.f$b.getAmountScrolled() + 36 * dG.f$b.f$M);
                        bl = bl2 = true;
                        break block10;
                    }
                    ++n5;
                    iterator = c;
                }
            }
            bl = bl2;
        }
        if (bl) return;
        dG.f$b.f$M = -1;
        dG.f$b.scrollBy(-dG.f$b.getAmountScrolled() + 36 * dG.f$b.f$M);
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class Dg
extends RF {
    public Dg() {
        Dg dg;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public final class dg
extends RF {
    public dg() {
        dg dg2;
    }
}
