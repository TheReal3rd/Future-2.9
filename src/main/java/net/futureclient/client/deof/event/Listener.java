package net.futureclient.client.deof.event;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class Listener<S extends Event> {
    private Class<S> eventClass;//OG f$d

    public abstract void invoke(S var1);

    //IDK
    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ (2 ^ 5);
        int n5 = (3 ^ 5) << 3 ^ (3 ^ 5);
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

    public Class<S> getEventClass() {
        return this.eventClass;
    }

    public Listener() {
        final Type typeArray = this.getClass().getGenericSuperclass();
        if (typeArray instanceof ParameterizedType) {
            int n;
            final Type[] typeArray1 = ((ParameterizedType)typeArray).getActualTypeArguments();
            int n2 = typeArray1.length;
            int n3 = n = 0;
            while (n3 < n2) {
                Type type = typeArray1[n];
                if (type instanceof Class && Listener.class.isAssignableFrom((Class)type)) {
                    this.eventClass = (Class) type;
                    return;
                }
                n3 = ++n;
            }
        }
    }
}
/*
public abstract class Ha<S extends RF> {
    private Class<S> f$d;

    public abstract void f$E(S var1);

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ (2 ^ 5);
        int n5 = (3 ^ 5) << 3 ^ (3 ^ 5);
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

    public Class<S> f$E() {
        Ha ha;
        return ha.f$d;
    }

    public Ha() {
        Ha ha;
        Ha ha2 = ha;
        Type[] typeArray = ha2.getClass().getGenericSuperclass();
        if (typeArray instanceof ParameterizedType) {
            int n;
            typeArray = ((ParameterizedType)typeArray).getActualTypeArguments();
            int n2 = typeArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                Type type = typeArray[n];
                if (type instanceof Class && RF.class.isAssignableFrom((Class)type)) {
                    ha.f$d = (Class)type;
                    return;
                }
                n3 = ++n;
            }
        }
    }
}
 */