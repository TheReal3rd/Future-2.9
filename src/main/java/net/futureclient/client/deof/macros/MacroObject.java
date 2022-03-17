package net.futureclient.client.deof.macros;

import net.futureclient.client.deof.utils.chat.ChatObject;
import net.minecraft.client.Minecraft;

public class MacroObject {
    private final String string;//OG f$d
    private final ChatObject macroObject;//OG f$g
    private final int keyID;//OG f$M

    public MacroObject(int n, String string) {
        this.keyID = n;
        this.string = string;
        this.macroObject = new ChatObject(string);
    }

    public int getKeyID() {
        return this.keyID;
    }

    public ChatObject getMacroObject() {
        return this.macroObject;
    }

    public String getMacro() {
        return this.string;
    }

    public void send() {
        Minecraft.getMinecraft().player.sendChatMessage(this.macroObject.getMessage());
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Jf;
import net.minecraft.client.Minecraft;

public class lg {
    private String f$d;
    private Jf f$g;
    private int f$M;

    public lg(int n, String string) {
        lg lg2 = 0;
        lg2.f$M = n;
        lg2.f$d = string;
        lg lg3 = 0;
        lg2.f$g = new Jf(string);
    }

    public int f$E() {
        lg lg2;
        return lg2.f$M;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (2 ^ 5) << 4 ^ 4 << 1;
        int cfr_ignored_0 = 4 << 4 ^ 5 << 1;
        int n5 = 5;
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

    public Jf f$E() {
        lg lg2;
        return lg2.f$g;
    }

    public String f$E() {
        lg lg2;
        return lg2.f$d;
    }

    public void f$E() {
        lg lg2;
        Minecraft.getMinecraft().player.sendChatMessage(lg2.f$g.f$E());
    }
}
 */