package net.futureclient.client;

public class RF {
    private boolean f$d;

    public boolean f$E() {
        RF rF;
        return rF.f$d;
    }

    public void f$E(boolean bl) {
        0.f$d = bl;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (3 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3 << 1;
        int n5 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
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

    public RF() {
        RF rF;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class Rf
extends RF {
    private String f$d;

    public Rf(String string) {
        0.f$d = string;
    }

    public String f$E() {
        Rf rf;
        return rf.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Ze;
import net.futureclient.client.sE;

public class rF
extends Ha<sE> {
    public final Ze f$d;

    @Override
    public void f$E(sE sE2) {
    }

    public rF(Ze ze) {
        0.f$d = ze;
    }
}
