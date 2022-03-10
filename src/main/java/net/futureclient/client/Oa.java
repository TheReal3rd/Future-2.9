package net.futureclient.client;

public enum Oa {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Oa() {
        Oa oa;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;

public class oa {
    private Ba f$d;

    public oa(Ba ba) {
        0.f$d = ba;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 ^ 5;
        int n5 = 2 << 3 ^ 5;
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

    public Ba f$E() {
        oa oa2;
        return oa2.f$d;
    }
}
