package net.futureclient.client;

import net.minecraft.client.Minecraft;

public abstract class GA {
    private String[] f$g;
    public Minecraft f$d;

    public String[] f$E() {
        GA gA;
        return gA.f$g;
    }

    public abstract String f$E();

    public GA(String[] stringArray) {
        0.f$d = Minecraft.getMinecraft();
        0.f$g = stringArray;
    }

    public abstract String f$E(String[] var1);

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).insert(0, stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 5 << 4 ^ 1 << 1;
        int n5 = (2 ^ 5) << 4 ^ 4 << 1;
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
}
package net.futureclient.client;

import net.futureclient.client.kF;

public class ga {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            ga.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ga.f$d[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
