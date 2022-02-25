package net.futureclient.client;

import net.futureclient.client.mh;

public class BH {
    public int f$j;
    public int f$i;
    public int f$M;
    public int f$g;
    public final mh f$d;

    public BH(mh mh2) {
        0.f$d = mh2;
    }
}
package net.futureclient.client;

public class Bh {
    private long f$d;
    private long f$g;

    public boolean f$E(double d) {
        return (double)(0.f$e() - 0.f$g) >= 1000.0 / d;
    }

    public boolean f$E(long l) {
        return 0.f$e() - 0.f$d >= l;
    }

    public long f$B() {
        Bh bh;
        return bh.f$g;
    }

    public long f$e() {
        return System.nanoTime() / 1000000L;
    }

    public boolean f$a(float f) {
        return (float)(0.f$e() - 0.f$g) >= f;
    }

    public void f$a() {
        Bh bh;
        Bh bh2 = bh;
        bh2.f$d = bh2.f$e();
        bh2.f$g = bh2.f$e();
    }

    public int f$E(int n) {
        return 1000 / n;
    }

    public void f$E(long l) {
        0.f$d = l;
    }

    public boolean f$E(float f) {
        return (float)(System.currentTimeMillis() - 0.f$d) >= f;
    }

    public void f$E() {
        0.f$d = System.currentTimeMillis();
    }

    public long f$a() {
        Bh bh;
        return bh.f$d;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 3 << 1;
        int cfr_ignored_0 = 3 << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (3 << 2 ^ 1);
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

    public long f$E() {
        Bh bh;
        return bh.f$e() - bh.f$g;
    }

    public boolean f$a(long l) {
        return System.currentTimeMillis() - 0.f$d >= l;
    }

    public Bh() {
        Bh bh;
        Bh bh2 = bh;
        bh2.f$d = 0L;
        bh2.f$a();
    }
}
