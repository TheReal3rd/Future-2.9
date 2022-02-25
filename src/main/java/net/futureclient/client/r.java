package net.futureclient.client;

public class r
extends Exception {
    private int f$d;
    public static final int f$j = 1;
    private int f$M;
    public static final int f$b = 0;
    private Object f$g;
    private static final long f$K = -7880698968187728547L;
    public static final int f$i = 2;

    public Object f$E() {
        r r2;
        return r2.f$g;
    }

    public int f$a() {
        r r2;
        return r2.f$M;
    }

    public r(int n) {
        0(-1, n, null);
    }

    public void f$E(Object object) {
        0.f$g = object;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 4;
        int n4 = n2;
        int n5 = 1 << 3 ^ (2 ^ 5);
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

    public r(int n, Object object) {
        0(-1, n, object);
    }

    public r(int n, int n2, Object object) {
        r r2 = 0;
        0.f$d = n;
        r2.f$M = n2;
        r2.f$g = object;
    }

    public int f$E() {
        r r2;
        return r2.f$d;
    }

    public void f$E(int n) {
        0.f$d = n;
    }

    @Override
    public String getMessage() {
        StringBuffer stringBuffer;
        r r2;
        StringBuffer stringBuffer2 = new StringBuffer();
        switch (r2.f$M) {
            case 0: {
                StringBuffer stringBuffer3 = stringBuffer2;
                while (false) {
                }
                stringBuffer = stringBuffer3;
                stringBuffer3.append("Unexpected character (").append(r2.f$g).append(") at position ").append(r2.f$d).append(".");
                break;
            }
            case 1: {
                StringBuffer stringBuffer4 = stringBuffer2;
                stringBuffer = stringBuffer4;
                stringBuffer4.append("Unexpected token ").append(r2.f$g).append(" at position ").append(r2.f$d).append(".");
                break;
            }
            case 2: {
                StringBuffer stringBuffer5 = stringBuffer2;
                stringBuffer = stringBuffer5;
                stringBuffer5.append("Unexpected exception at position ").append(r2.f$d).append(": ").append(r2.f$g);
                break;
            }
            default: {
                StringBuffer stringBuffer6 = stringBuffer2;
                stringBuffer = stringBuffer6;
                stringBuffer6.append("Unkown error at position ").append(r2.f$d).append(".");
            }
        }
        return stringBuffer.toString();
    }

    public void f$a(int n) {
        0.f$M = n;
    }
}
package net.futureclient.client;

public interface R {
    public double f$E(String var1, String var2);
}
