package net.futureclient.client;

import net.futureclient.client.ff;
import net.minecraft.util.math.RayTraceResult;

public class Lg
extends ff {
    private RayTraceResult f$d;

    public RayTraceResult f$E() {
        Lg lg;
        return lg.f$d;
    }

    public void f$E(RayTraceResult rayTraceResult) {
        0.f$d = rayTraceResult;
    }

    public Lg(RayTraceResult rayTraceResult) {
        0.f$d = rayTraceResult;
    }
}
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
package net.futureclient.client;

import net.futureclient.client.ZG;

public class lG {
    private ZG f$d;
    private static final lG f$g;

    public boolean f$E() {
        lG lG2;
        return lG2.f$d == ZG.f$g;
    }

    public lG() {
        lG lG2;
        lG2.f$d = ZG.f$M;
    }

    public ZG f$E() {
        lG lG2;
        return lG2.f$d;
    }

    public void f$E(ZG zG) {
        0.f$d = zG;
    }

    public static lG f$E() {
        return f$g;
    }

    static {
        f$g = new lG();
    }
}
