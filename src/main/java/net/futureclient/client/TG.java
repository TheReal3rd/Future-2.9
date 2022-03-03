package net.futureclient.client;

public class tg {
    private double f$d;
    private String f$g;

    public tg(String string, double d) {
        tg tg2 = 0;
        tg2.f$g = string;
        tg2.f$d = d;
    }

    public String f$E() {
        tg tg2;
        return tg2.f$g;
    }

    public boolean equals(Object object) {
        if (object == null || object.getClass() != 0.getClass()) {
            return false;
        }
        object = (tg)object;
        return 0.f$g.equals(((tg)object).f$g) && 0.f$d == ((tg)object).f$d;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (2 ^ 5) << 3;
        int cfr_ignored_0 = 2 << 3 ^ (2 ^ 5);
        int n5 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
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

    public int hashCode() {
        tg tg2;
        int n = 11;
        n = 23 * n + tg2.f$g.hashCode();
        n = 23 * n + (int)(tg2.f$d * 1000000.0);
        return n;
    }

    public double f$E() {
        tg tg2;
        return tg2.f$d;
    }
}
