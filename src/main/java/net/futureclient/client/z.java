package net.futureclient.client;

public class z<T> {
    public T f$d;
    private final String[] f$g;

    public T f$E() {
        z z2;
        return z2.f$d;
    }

    public z(T t, String ... stringArray) {
        z z2 = 0;
        z2.f$d = t;
        z2.f$g = stringArray;
    }

    public void f$E(T t) {
        0.f$d = t;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 3 << 1;
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

    public String[] f$E() {
        z z2;
        return z2.f$g;
    }
}
package net.futureclient.client;

import java.util.Comparator;
import java.util.List;
import net.futureclient.client.tg;

public interface Z {
    public tg f$E(List<String> var1, String var2, Comparator<tg> var3);

    public double f$E(String var1, String var2);

    public List<tg> f$E(List<String> var1, String var2);

    public tg f$E(List<String> var1, String var2);
}
