package net.futureclient.client;

public final class ni {
    public ni() {
        ni ni2;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = 3 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 4 << 3 ^ 1;
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

    public static <T extends Throwable> void f$E(Throwable throwable) throws T {
        throw throwable;
    }
}
