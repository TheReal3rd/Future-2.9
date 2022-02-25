package net.futureclient.client;

import net.futureclient.client.Rh;
import net.futureclient.client.kH;

public class mI {
    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 3 ^ 5;
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

    public mI() {
        mI mI2;
        kH.f$E().f$E().f$a(new Rh(mI2));
    }
}
package net.futureclient.client;

import net.futureclient.client.S;

public class mi
implements S {
    private int f$d;

    public int f$E() {
        mi mi2;
        return mi2.f$d;
    }

    public mi(int n) {
        0.f$d = n;
    }
}
