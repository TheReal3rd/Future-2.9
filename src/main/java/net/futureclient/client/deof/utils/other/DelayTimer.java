package net.futureclient.client.deof.utils.other;

import java.util.concurrent.TimeUnit;

public class DelayTimer {
    private long timeStart;//OG f$d

    public long getTimeStart() {
        return this.timeStart;
    }

    public boolean passed(long l) {
        return this.passed(l, TimeUnit.MILLISECONDS);
    }

    public void reset() {
        this.timeStart = System.nanoTime();
    }

    public long convert(TimeUnit timeUnit) {
        return timeUnit.convert(System.nanoTime() - this.timeStart, TimeUnit.NANOSECONDS);
    }

    public long getMS() {
        return this.convert(TimeUnit.MILLISECONDS);
    }

    public boolean passed(long l, TimeUnit timeUnit) {
        long l2 = timeUnit.convert(System.nanoTime() - this.timeStart, TimeUnit.NANOSECONDS);
        if (l2 >= l) {
            this.reset();
        }
        return l2 >= l;
    }

    //IDK what this does lol.
    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (2 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int n5 = 3 << 3 ^ 5;
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
}
/*
package net.futureclient.client;

import java.util.concurrent.TimeUnit;

public final class gG {
    private long f$d;

    public long f$a() {
        gG gG2;
        return gG2.f$d;
    }

    public boolean f$E(long l) {
        return 0.f$E(l, TimeUnit.MILLISECONDS);
    }

    public void f$E() {
        0.f$d = System.nanoTime();
    }

    public long f$E(TimeUnit timeUnit) {
        return timeUnit.convert(System.nanoTime() - 0.f$d, TimeUnit.NANOSECONDS);
    }

    public long f$E() {
        gG gG2;
        return gG2.f$E(TimeUnit.MILLISECONDS);
    }

    public gG() {
        gG gG2;
    }

    public boolean f$E(long l, TimeUnit timeUnit) {
        long l2 = timeUnit.convert(System.nanoTime() - 0.f$d, TimeUnit.NANOSECONDS);
        if (l2 >= l) {
            0.f$E();
        }
        return l2 >= l;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (2 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int n5 = 3 << 3 ^ 5;
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
}
 */