package net.futureclient.client.deof.utils;

import java.util.List;

public class ObjectList<T> {
    public List<T> list;//OG f$d

    public boolean contains(T t) {
        return this.list.contains(t);
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).insert(0, stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (3 ^ 5) << 4 ^ 5 << 1;
        int cfr_ignored_0 = 4 << 4 ^ (2 << 2 ^ 3);
        int n5 = 5 << 4 ^ 1 << 1;
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

    public List<T> getList() {
        return this.list;
    }

    public void remove(T t) {
        this.list.remove(t);
    }

    public void add(T t) {
        this.list.add(t);
    }
}
/*
public class QE<T> {
    public List<T> f$d;

    public T f$E(T t) {
        if (0.f$d.contains(t)) {
            return t;
        }
        return null;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).insert(0, stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (3 ^ 5) << 4 ^ 5 << 1;
        int cfr_ignored_0 = 4 << 4 ^ (2 << 2 ^ 3);
        int n5 = 5 << 4 ^ 1 << 1;
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

    public List<T> f$E() {
        QE qE;
        return qE.f$d;
    }

    public QE() {
        QE qE;
    }

    public void f$E(T t) {
        0.f$d.remove(t);
    }

    public void f$a(T t) {
        0.f$d.add(t);
    }
}
 */