package net.futureclient.client.deof.settings;

public class SettingsBase<T> {
    public T value;// OG f$d
    private final String[] names;// OG f$g

    public SettingsBase(T t, String ... stringArray) {
        this.value = t;
        this.names = stringArray;
    }

    public static String f$E(String string) {//TODO Figure out what this does and fix it / rename it.
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

    public void setValue(T t) {
        this.value = t;
    }

    public T getValue() {
        return this.value;
    }

    public String[] getNames() {
        return this.names;
    }
}

/*
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
 */