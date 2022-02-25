package net.futureclient.client;

public class o {
    public static final int f$e = 1;
    public static final int f$j = 5;
    public static final int f$C = 0;
    public static final int f$i = 6;
    public static final int f$b = 4;
    public static final int f$M = -1;
    public static final int f$K = 3;
    public Object f$d;
    public int f$g;
    public static final int f$I = 2;

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 1 << 3 ^ 2;
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

    public o(int n, Object object) {
        o o2 = 0;
        o o3 = 0;
        o3.f$g = 0;
        o3.f$d = null;
        o2.f$g = n;
        o2.f$d = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        StringBuffer stringBuffer;
        o o2;
        StringBuffer stringBuffer2 = new StringBuffer();
        switch (o2.f$g) {
            case 0: {
                StringBuffer stringBuffer3 = stringBuffer2;
                stringBuffer = stringBuffer3;
                stringBuffer3.append("VALUE(").append(o2.f$d).append(")");
                return stringBuffer.toString();
            }
            case 1: {
                StringBuffer stringBuffer4 = stringBuffer2;
                stringBuffer = stringBuffer4;
                stringBuffer4.append("LEFT BRACE({)");
                return stringBuffer.toString();
            }
            case 2: {
                StringBuffer stringBuffer5 = stringBuffer2;
                stringBuffer = stringBuffer5;
                stringBuffer5.append("RIGHT BRACE(})");
                return stringBuffer.toString();
            }
            case 3: {
                StringBuffer stringBuffer6 = stringBuffer2;
                stringBuffer = stringBuffer6;
                stringBuffer6.append("LEFT SQUARE([)");
                return stringBuffer.toString();
            }
            case 4: {
                StringBuffer stringBuffer7 = stringBuffer2;
                stringBuffer = stringBuffer7;
                stringBuffer7.append("RIGHT SQUARE(])");
                return stringBuffer.toString();
            }
            case 5: {
                StringBuffer stringBuffer8 = stringBuffer2;
                stringBuffer = stringBuffer8;
                stringBuffer8.append("COMMA(,)");
                return stringBuffer.toString();
            }
            case 6: {
                StringBuffer stringBuffer9 = stringBuffer2;
                stringBuffer = stringBuffer9;
                stringBuffer9.append("COLON(:)");
                return stringBuffer.toString();
            }
            case -1: {
                stringBuffer2.append("END OF FILE");
            }
        }
        stringBuffer = stringBuffer2;
        return stringBuffer.toString();
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.Ja;
import net.futureclient.client.z;

public abstract class O<T> extends z<List<T>> {
    public O(String[] stringArray, Ja ja) {
        0(stringArray);
    }

    private O(String ... stringArray) {
        0((List<T>)new ArrayList(), stringArray);
    }

    public O(List list, String[] stringArray, Ja ja) {
        0(list, stringArray);
    }

    private O(List<T> list, String ... stringArray) {
        super(list, stringArray);
    }
}
