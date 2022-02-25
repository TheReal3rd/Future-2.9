package net.futureclient.client;

import net.futureclient.client.jG;
import net.minecraft.util.Session;

public class ph {
    private String f$b;
    private String f$I;
    private jG f$d;
    private String f$j;
    private String f$K;
    private String f$g;
    private String f$i;
    private String f$M;

    public void f$E(Session session) {
        ph ph2 = 0;
        ph2.f$j = session.getPlayerID();
        ph2.f$M = session.getToken();
    }

    public void f$E(String string) {
        0.f$g = string;
    }

    public String f$K() {
        ph ph2;
        return ph2.f$b;
    }

    public jG f$E() {
        ph ph2;
        return ph2.f$d;
    }

    public void f$E(jG jG2) {
        0.f$d = jG2;
    }

    public void f$e(String string) {
        0.f$i = string;
    }

    public String f$B() {
        ph ph2;
        return ph2.f$j;
    }

    public String f$A() {
        ph ph2;
        return ph2.f$K;
    }

    public void f$K(String string) {
        0.f$I = string;
    }

    public ph(String string, String string2, String string3, String string4, String string5) {
        ph ph2 = 0;
        ph ph3 = 0;
        ph ph4 = 0;
        0.f$d = jG.f$j;
        0.f$I = string;
        ph4.f$j = string2;
        ph4.f$i = "";
        ph3.f$M = string3;
        ph3.f$K = string4;
        ph2.f$b = string5;
        ph2.f$g = "";
    }

    public void f$a(String string) {
        0.f$M = string;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 1 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 3 << 3 ^ (3 ^ 5);
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

    public ph(String string) {
        ph ph2 = 0;
        ph ph3 = 0;
        ph ph4 = 0;
        0.f$d = jG.f$K;
        0.f$I = string;
        ph4.f$j = "";
        ph4.f$i = "";
        ph3.f$M = "";
        ph3.f$K = string;
        ph2.f$b = "";
        ph2.f$g = "";
    }

    public String f$e() {
        ph ph2;
        return ph2.f$i;
    }

    public ph(String string, String string2) {
        ph ph2 = 0;
        ph ph3 = 0;
        ph ph4 = 0;
        0.f$d = jG.f$b;
        0.f$I = "";
        ph4.f$j = "";
        ph4.f$i = "";
        ph3.f$M = "";
        ph3.f$K = string;
        ph2.f$b = string2;
        ph2.f$g = "";
    }

    public void f$B(String string) {
        0.f$j = string;
    }

    public String f$a() {
        ph ph2;
        return ph2.f$M;
    }

    public String f$E() {
        ph ph2;
        return ph2.f$g;
    }

    public String f$h() {
        ph ph2;
        return ph2.f$I;
    }

    public Session f$E() {
        ph ph2;
        if (ph2.f$I.isEmpty()) {
            ph ph3 = ph2;
            return new Session(ph3.f$K, ph3.f$j, ph2.f$M, "mojang");
        }
        ph ph4 = ph2;
        return new Session(ph4.f$I, ph4.f$j, ph2.f$M, "mojang");
    }

    public ph(String string, String string2, String string3) {
        ph ph2 = 0;
        ph ph3 = 0;
        ph ph4 = 0;
        0.f$d = jG.f$i;
        0.f$I = string;
        ph4.f$j = "";
        ph4.f$i = string2;
        ph3.f$M = string3;
        ph3.f$K = string;
        ph2.f$b = "";
        ph2.f$g = "";
    }
}
