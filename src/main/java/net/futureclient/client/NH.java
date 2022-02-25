package net.futureclient.client;

import net.futureclient.client.DG;
import net.futureclient.client.ph;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.opengl.GL11;

public class NH
extends GuiSlot {
    public final DG f$d;
    private boolean f$g;
    public int f$M;

    public NH(DG dG) {
        NH nH;
        nH.f$d = dG;
        DG dG2 = dG;
        super(DG.f$E(nH.f$d), dG2.width, dG2.height, 40, dG.height - 60, 36);
        nH.f$M = -1;
    }

    public int getSize() {
        NH nH;
        return DG.f$E(nH.f$d).f$E().size();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void drawSlot(int n, int n2, int n3, int n42, int n5, int n6, float 022) {
        NH nH;
        int n7;
        int n8;
        block22: {
            if (n3 <= 10 || n3 >= 0.height - 60) {
                return;
            }
            ph n42 = (ph)DG.f$E(0.f$d).f$E().get(n);
            if (!n42.f$h().isEmpty()) {
                DG.f$E(0.f$d).f$E(n42.f$h(), n2, n3);
            }
            DG.f$C(0.f$d).drawString(n42.f$A(), (float)(n2 + 36), (float)n3 + 12.5f, 0xFFFFFF, false);
            String string = 022 = n42.f$E().f$E() + n42.f$E().f$E();
            DG.f$h(0.f$d).drawString(string, (float)(n2 + 215 - DG.f$H(0.f$d).getStringWidth(string)), (float)n3 + 2.5f, 0xFFFFFF, false);
            if (!n42.f$A().equals(n42.f$h())) {
                DG.f$A(0.f$d).drawString(n42.f$h(), (float)(n2 + 36), (float)n3 + 2.5f, 0xFFFFFF, false);
            }
            String 022 = n42.f$E();
            n8 = -1;
            switch (022.hashCode()) {
                case -1147090062: {
                    if (!022.equals("Invalid credentials. Invalid username or password.")) break;
                    n7 = n8 = 0;
                    break block22;
                }
                case 2142553676: {
                    if (!022.equals("Invalid credentials. Account migrated, use email as username.")) break;
                    n7 = n8 = 1;
                    break block22;
                }
                case -1116833701: {
                    if (!022.equals("Invalid credentials.")) break;
                    n7 = n8 = 2;
                    break block22;
                }
                case 459044782: {
                    if (!022.equals("Cannot contact authentication server")) break;
                    n8 = 3;
                }
            }
            n7 = n8;
        }
        switch (n7) {
            case 0: {
                NH nH2 = 0;
                nH = nH2;
                DG.f$K(nH2.f$d).drawString(TextFormatting.RED + "Invalid username or password.", (float)(n2 + 36), (float)n3 + 22.5f, 0xFFFFFF, false);
                break;
            }
            case 1: {
                NH nH3 = 0;
                nH = nH3;
                DG.f$B(nH3.f$d).drawString(TextFormatting.RED + "This account has been migrated.", (float)(n2 + 36), (float)n3 + 22.5f, 0xFFFFFF, false);
                break;
            }
            case 2: {
                NH nH4 = 0;
                nH = nH4;
                DG.f$e(nH4.f$d).drawString(TextFormatting.RED + "Login has been temporarily blocked.", (float)(n2 + 36), (float)n3 + 22.5f, 0xFFFFFF, false);
                break;
            }
            case 3: {
                NH nH5 = 0;
                nH = nH5;
                DG.f$a(nH5.f$d).drawString(TextFormatting.RED + "Cannot contact authentication server.", (float)(n2 + 36), (float)n3 + 22.5f, 0xFFFFFF, false);
                break;
            }
            default: {
                NH nH6 = 0;
                nH = nH6;
                DG.f$E(nH6.f$d).drawString(TextFormatting.RED + n42.f$E(), (float)(n2 + 36), (float)n3 + 22.5f, 0xFFFFFF, false);
            }
        }
        if (!(nH.mc.gameSettings.touchscreen || 0.isMouseYWithinSlotBounds(n6) && 0.getSlotIndexFromScreenCoords(n5, n6) == n)) {
            return;
        }
        int n9 = n2;
        int n10 = n3;
        Gui.drawRect((int)n9, (int)n10, (int)(n9 + 32), (int)(n10 + 32), (int)-1601138544);
        NH nH7 = 0;
        NH nH8 = 0;
        nH8.mc.getTextureManager().bindTexture(DG.f$E());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        int 022 = nH7.mouseX - n2;
        n8 = nH8.mouseY - n3;
        if (!DG.f$E((DG)nH7.f$d).f$I) {
            Gui.drawModalRectWithCustomSizedTexture((int)n2, (int)n3, (float)0.0f, (float)(022 < 32 && 022 > 16 ? 32.0f : 0.0f), (int)32, (int)32, (float)256.0f, (float)256.0f);
            if (0.f$g && 022 < 32 && 022 > 16) {
                DG.f$E(0.f$d).f$E(n);
                DG.f$E((DG)0.f$d).f$M = n;
                0.f$g = false;
            }
        }
        if (n > 0) {
            Gui.drawModalRectWithCustomSizedTexture((int)n2, (int)n3, (float)96.0f, (float)(022 < 16 && n8 < 16 ? 32.0f : 0.0f), (int)32, (int)32, (float)256.0f, (float)256.0f);
            if (0.f$g && 022 < 16 && n8 < 16) {
                int n11 = n;
                DG.f$E(0.f$d).f$E().set(n11, DG.f$E(0.f$d).f$E().get(n11 - 1));
                DG.f$E(0.f$d).f$E().set(n - 1, n42);
                DG.f$E((DG)0.f$d).f$M = n - 1;
                DG.f$E(0.f$d).scrollBy(-DG.f$E(0.f$d).getSlotHeight());
                0.f$g = false;
            }
        }
        if (n < DG.f$E(0.f$d).getSize() - 1) {
            Gui.drawModalRectWithCustomSizedTexture((int)n2, (int)n3, (float)64.0f, (float)(022 < 16 && n8 > 16 ? 32.0f : 0.0f), (int)32, (int)32, (float)256.0f, (float)256.0f);
            if (0.f$g && 022 < 16 && n8 > 16) {
                int n12 = n;
                DG.f$E(0.f$d).f$E().set(n12, DG.f$E(0.f$d).f$E().get(n12 + 1));
                DG.f$E(0.f$d).f$E().set(n + 1, n42);
                DG.f$E((DG)0.f$d).f$M = n + 1;
                DG.f$E(0.f$d).scrollBy(DG.f$E(0.f$d).getSlotHeight());
                0.f$g = false;
            }
        }
    }

    public void drawBackground() {
    }

    public void elementClicked(int n, boolean bl, int n2, int n3) {
        NH nH = 0;
        NH nH2 = 0;
        int n4 = nH.left + nH.width / 2 - nH2.getListWidth() / 2 + 2;
        int n5 = nH2.top + 4 - (int)0.amountScrolled;
        n3 -= n5;
        if ((n2 -= n4) <= 32) {
            0.f$g = true;
            return;
        }
        DG.f$E(0.f$d).f$a(0.mc.getSession().getUsername());
        0.f$M = n;
        if (bl && !DG.f$E((DG)0.f$d).f$I) {
            DG.f$E(0.f$d).f$E(n);
        }
    }

    public boolean isSelected(int n) {
        return n == 0.f$M;
    }
}
