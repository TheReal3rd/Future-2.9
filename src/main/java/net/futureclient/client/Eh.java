package net.futureclient.client;

public class EH {
    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).insert(0, stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 5 << 3;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int n5 = (3 ^ 5) << 3 ^ 5;
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }

    public EH() {
        EH eH;
    }
}
package net.futureclient.client;

import java.io.IOException;
import net.futureclient.client.hh;
import net.futureclient.client.kH;
import net.futureclient.client.ph;
import net.futureclient.client.xI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.text.TextFormatting;

public class eH
extends GuiScreen {
    private String f$M;
    private GuiTextField f$i;
    private GuiScreen f$b;
    private Minecraft f$K;
    private final xI f$I;
    private int f$g;
    private int f$d;
    private GuiTextField f$j;

    public void actionPerformed(GuiButton object) {
        switch (((GuiButton)object).id) {
            case 0: {
                eH eH2;
                while (false) {
                }
                switch (0.f$g) {
                    case 0: {
                        eH eH3 = 0;
                        while (false) {
                        }
                        eH2 = eH3;
                        eH3.f$I.f$a(eH3.f$j.getText(), 0.f$i.getText());
                        break;
                    }
                    case 1: {
                        eH eH4 = 0;
                        eH2 = eH4;
                        eH4.f$I.f$a(eH4.f$d);
                        break;
                    }
                    case 2: {
                        eH eH5 = 0;
                        eH2 = eH5;
                        eH5.f$I.f$E(eH5.f$d, 0.f$j.getText(), 0.f$i.getText());
                        break;
                    }
                    case 3: {
                        eH eH6 = 0;
                        object = eH6.f$K.getSession().getUsername();
                        eH6.f$I.f$E(0.f$j.getText(), 0.f$i.getText());
                        if (!((String)object).equals(0.f$K.getSession().getUsername())) {
                            eH eH7 = 0;
                            eH7.f$K.displayGuiScreen(eH7.f$b);
                        }
                    }
                    default: {
                        eH2 = 0;
                    }
                }
                if (eH2.f$g == 3) break;
                eH eH8 = 0;
                eH8.f$K.displayGuiScreen(eH8.f$b);
                return;
            }
            case 1: {
                eH eH9 = 0;
                eH9.f$K.displayGuiScreen(eH9.f$b);
            }
        }
    }

    public void mouseClicked(int n, int n2, int n3) throws IOException {
        eH eH2 = 0;
        super.mouseClicked(n, n2, n3);
        eH2.f$j.mouseClicked(n, n2, n3);
        0.f$i.mouseClicked(n, n2, n3);
    }

    /*
     * Unable to fully structure code
     */
    public void keyTyped(char 0, int 0) throws IOException {
        v0 = 0;
        0.f$j.textboxKeyTyped(0, v0);
        0.f$i.textboxKeyTyped(0, 0);
        if (v0 != 15) ** GOTO lbl22
        if (0.f$j.isFocused()) {
            v1 = 0;
            v2 = 0;
            v2.f$j.setFocused(false);
            v2.f$i.setFocused(true);
        } else if (0.f$i.isFocused()) {
            v1 = 0;
            v3 = 0;
            v3.f$j.setFocused(true);
            v3.f$i.setFocused(false);
        } else {
            v4 = 0;
            v4.f$j.setFocused(true);
            v4.f$i.setFocused(false);
lbl22:
            // 2 sources

            v1 = 0;
        }
        if (v1 == 28 || 0 == 156) {
            v5 = 0;
            if (0.f$j.getText().isEmpty()) {
                v5.actionPerformed((GuiButton)0.buttonList.get(1));
                return;
            }
            v5.actionPerformed((GuiButton)0.buttonList.get(0));
        }
    }

    public void drawScreen(int n, int n2, float f) {
        eH eH2 = 0;
        eH2.drawDefaultBackground();
        eH2.f$j.drawTextBox();
        eH2.f$i.drawTextBox();
        eH eH3 = 0;
        eH2.func_73732_a(eH2.fontRenderer, eH3.f$M, eH3.width / 2, 8, -1);
        eH2.func_73732_a(eH2.fontRenderer, TextFormatting.GRAY + "(" + 0.f$I.f$E().size() + ")", 0.width / 2, 20, -1);
        eH2.func_73731_b(eH2.fontRenderer, TextFormatting.GRAY + "Username: " + TextFormatting.WHITE + 0.f$K.getSession().getUsername(), 2, 2 + 0.f$K.fontRenderer.FONT_HEIGHT * 2, -1);
        switch (eH2.f$g) {
            case 0: 
            case 2: 
            case 3: {
                eH eH4 = 0;
                while (false) {
                }
                eH4.func_73731_b(eH4.fontRenderer, "Username", 0.width / 2 - 100, 0.height / 2 - (0.f$g == 0 ? 73 : 53), -6250336);
                eH eH5 = 0;
                eH5.func_73731_b(0.fontRenderer, "Password", eH5.width / 2 - 100, 0.height / 2 - (0.f$g == 0 ? 33 : 13), -6250336);
            }
        }
        0.f$I.f$E();
        super.drawScreen(n, n2, f);
    }

    public void initGui() {
        eH eH2;
        eH eH3 = eH2;
        eH eH4 = eH2;
        eH3.f$j = new GuiTextField(0, eH4.fontRenderer, eH4.width / 2 - 100, eH2.height / 2 - (eH2.f$g == 0 ? 60 : 40), 200, 20);
        eH eH5 = eH2;
        eH5.f$j.setFocused(true);
        eH5.f$j.setMaxStringLength(1500);
        eH eH6 = eH2;
        eH5.f$i = new hh(1, eH6.fontRenderer, eH6.width / 2 - 100, eH2.height / 2 - (eH2.f$g == 0 ? 20 : 0), 200, 20);
        eH eH7 = eH2;
        eH7.f$i.setMaxStringLength(1500);
        eH7.f$i.setText("");
        eH7.buttonList.add(new GuiButton(0, eH2.width / 2 - 154, eH2.height - 28, 150, 20, "Confirm"));
        eH2.buttonList.add(new GuiButton(1, eH2.width / 2 + 4, eH2.height - 28, 150, 20, "Back"));
        switch (eH7.f$g) {
            case 0: {
                return;
            }
            case 1: {
                eH eH8 = eH2;
                eH8.f$j.setVisible(false);
                eH8.f$i.setVisible(false);
                return;
            }
            case 2: {
                eH eH9 = eH2;
                eH9.f$j.setText(((ph)eH9.f$I.f$E().get(eH2.f$d)).f$A());
                eH eH10 = eH2;
                eH10.f$i.setText(((ph)eH10.f$I.f$E().get(eH2.f$d)).f$K());
            }
        }
    }

    public void handleMouseInput() throws IOException {
        eH eH2;
        super.handleMouseInput();
    }

    /*
     * Enabled aggressive block sorting
     */
    public eH(GuiScreen guiScreen, int n, int n2) {
        eH eH2 = 0;
        eH eH3 = 0;
        eH eH4 = 0;
        eH4.f$I = kH.f$E().f$E();
        eH4.f$K = Minecraft.getMinecraft();
        eH4.f$g = 0;
        eH3.f$d = -1;
        eH3.f$b = guiScreen;
        eH2.f$g = n;
        eH2.f$d = n2;
        switch (n) {
            case 0: {
                0.f$M = "Add Account";
                return;
            }
            case 1: {
                0.f$M = "Delete Account";
                return;
            }
            case 2: {
                0.f$M = "Edit Account";
                return;
            }
            case 3: {
                0.f$M = "Direct Login";
                return;
            }
        }
    }

    public void updateScreen() {
        eH eH2;
        eH eH3 = eH2;
        eH3.f$j.updateCursorCounter();
        eH3.f$i.updateCursorCounter();
        if (eH3.f$g != 1) {
            ((GuiButton)eH2.buttonList.get((int)0)).enabled = !eH2.f$j.getText().isEmpty();
        }
    }
}
