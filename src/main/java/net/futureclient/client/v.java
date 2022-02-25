package net.futureclient.client;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.futureclient.client.a;
import net.futureclient.client.m;
import net.futureclient.client.o;
import net.futureclient.client.r;
import net.futureclient.client.u;
import net.futureclient.client.w;
import net.futureclient.client.x;

public class v {
    public static final int f$C = 2;
    public static final int f$j = -1;
    public static final int f$B = 0;
    private o f$g;
    public static final int f$K = 5;
    private LinkedList f$i;
    private w f$M;
    public static final int f$a = 1;
    private int f$d;
    public static final int f$b = 6;
    public static final int f$e = 3;
    public static final int f$I = 4;

    public void f$E(String 0222, m m2, boolean bl) throws r {
        Object 0222 = new StringReader((String)0222);
        try {
            0.f$E((Reader)0222, m2, bl);
            return;
        }
        catch (IOException 0222) {
            throw new r(-1, 2, 0222);
        }
    }

    public Object f$E(String 0222, a a2) throws r {
        Object 0222 = new StringReader((String)0222);
        try {
            return 0.f$E((Reader)0222, a2);
        }
        catch (IOException 0222) {
            throw new r(-1, 2, 0222);
        }
    }

    public Object f$E(String string) throws r {
        return 0.f$E(string, (a)null);
    }

    private void f$E() throws r, IOException {
        v v2;
        v v3 = v2;
        v3.f$g = v3.f$M.f$E();
        if (v3.f$g == null) {
            v v4 = v2;
            v4.f$g = new o(-1, null);
        }
    }

    private List f$E(a object) {
        if (object == null) {
            return new x();
        }
        if ((object = object.f$E()) == null) {
            return new x();
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object f$E(Reader linkedList2, a a2) throws IOException, r {
        0.f$E((Reader)((Object)linkedList2));
        LinkedList<Integer> linkedList2 = new LinkedList();
        LinkedList<Object> linkedList3 = new LinkedList<Object>();
        do {
            v v2;
            block39: {
                v v3 = 0;
                v3.f$E();
                block3 : switch (v3.f$d) {
                    case 0: {
                        switch (0.f$g.f$g) {
                            case 0: {
                                v2 = 0;
                                0.f$d = 1;
                                LinkedList<Integer> linkedList4 = linkedList2;
                                linkedList2.addFirst(new Integer(0.f$d));
                                linkedList3.addFirst(0.f$g.f$d);
                                break;
                            }
                            case 1: {
                                v2 = 0;
                                0.f$d = 2;
                                linkedList2.addFirst(new Integer(0.f$d));
                                linkedList3.addFirst(0.f$E(a2));
                                break;
                            }
                            case 3: {
                                v2 = 0;
                                0.f$d = 3;
                                linkedList2.addFirst(new Integer(0.f$d));
                                linkedList3.addFirst(0.f$E(a2));
                                break;
                            }
                            default: {
                                v2 = 0;
                                0.f$d = -1;
                                break;
                            }
                        }
                        break block39;
                    }
                    case 1: {
                        if (0.f$g.f$g != -1) throw new r(0.f$E(), 1, 0.f$g);
                        return linkedList3.removeFirst();
                    }
                    case 2: {
                        Object object;
                        switch (0.f$g.f$g) {
                            case 5: {
                                break block3;
                            }
                            case 0: {
                                if (0.f$g.f$d instanceof String) {
                                    object = (String)0.f$g.f$d;
                                    linkedList3.addFirst(object);
                                    v2 = 0;
                                    0.f$d = 4;
                                    linkedList2.addFirst(new Integer(0.f$d));
                                    break;
                                }
                                0.f$d = -1;
                                v2 = 0;
                                break;
                            }
                            case 2: {
                                if (linkedList3.size() > 1) {
                                    Integer n = linkedList2.removeFirst();
                                    linkedList3.removeFirst();
                                    v2 = 0;
                                    0.f$d = 0.f$E(linkedList2);
                                    break;
                                }
                                v2 = 0;
                                0.f$d = 1;
                                break;
                            }
                            default: {
                                v2 = 0;
                                0.f$d = -1;
                                break;
                            }
                        }
                        break block39;
                    }
                    case 4: {
                        List list;
                        Map map;
                        Object object;
                        switch (0.f$g.f$g) {
                            case 6: {
                                break block3;
                            }
                            case 0: {
                                linkedList2.removeFirst();
                                object = (String)linkedList3.removeFirst();
                                map = (Map)linkedList3.getFirst();
                                v v4 = 0;
                                v2 = v4;
                                map.put(object, v4.f$g.f$d);
                                0.f$d = 0.f$E(linkedList2);
                                break;
                            }
                            case 3: {
                                linkedList2.removeFirst();
                                object = (String)linkedList3.removeFirst();
                                map = (Map)linkedList3.getFirst();
                                v v5 = 0;
                                v2 = v5;
                                list = v5.f$E(a2);
                                map.put(object, list);
                                0.f$d = 3;
                                linkedList2.addFirst(new Integer(0.f$d));
                                linkedList3.addFirst(list);
                                break;
                            }
                            case 1: {
                                linkedList2.removeFirst();
                                object = (String)linkedList3.removeFirst();
                                map = (Map)linkedList3.getFirst();
                                v v6 = 0;
                                v2 = v6;
                                Map map2 = v6.f$E(a2);
                                map.put(object, map2);
                                0.f$d = 2;
                                linkedList2.addFirst(new Integer(0.f$d));
                                linkedList3.addFirst(map2);
                                break;
                            }
                            default: {
                                v2 = 0;
                                0.f$d = -1;
                                break;
                            }
                        }
                        break block39;
                    }
                    case 3: {
                        List list;
                        Map map;
                        Object object;
                        switch (0.f$g.f$g) {
                            case 5: {
                                break block3;
                            }
                            case 0: {
                                object = (List)linkedList3.getFirst();
                                v v7 = 0;
                                v2 = v7;
                                object.add(v7.f$g.f$d);
                                break;
                            }
                            case 4: {
                                if (linkedList3.size() > 1) {
                                    Integer n = linkedList2.removeFirst();
                                    linkedList3.removeFirst();
                                    v2 = 0;
                                    0.f$d = 0.f$E(linkedList2);
                                    break;
                                }
                                v2 = 0;
                                0.f$d = 1;
                                break;
                            }
                            case 1: {
                                object = (List)linkedList3.getFirst();
                                v v8 = 0;
                                v2 = v8;
                                map = v8.f$E(a2);
                                object.add(map);
                                0.f$d = 2;
                                linkedList2.addFirst(new Integer(0.f$d));
                                linkedList3.addFirst(map);
                                break;
                            }
                            case 3: {
                                object = (List)linkedList3.getFirst();
                                v v9 = 0;
                                v2 = v9;
                                list = v9.f$E(a2);
                                object.add(list);
                                0.f$d = 3;
                                linkedList2.addFirst(new Integer(0.f$d));
                                linkedList3.addFirst(list);
                                break;
                            }
                            default: {
                                v2 = 0;
                                0.f$d = -1;
                                break;
                            }
                        }
                        break block39;
                    }
                    case -1: {
                        throw new r(0.f$E(), 1, 0.f$g);
                    }
                }
                v2 = 0;
            }
            if (v2.f$d != -1) continue;
            throw new r(0.f$E(), 1, 0.f$g);
        } while (0.f$g.f$g != -1);
        throw new r(0.f$E(), 1, 0.f$g);
    }

    private Map f$E(a object) {
        if (object == null) {
            return new u();
        }
        if ((object = object.f$E()) == null) {
            return new u();
        }
        return object;
    }

    public v() {
        v v2;
        v v3 = v2;
        v3.f$M = new w((Reader)null);
        v v4 = v2;
        v4.f$g = null;
        v4.f$d = 0;
    }

    public void f$E(Reader reader, m m2) throws IOException, r {
        0.f$E(reader, m2, false);
    }

    public Object f$E(Reader reader) throws IOException, r {
        return 0.f$E(reader, (a)null);
    }

    public void f$E(String string, m m2) throws r {
        0.f$E(string, m2, false);
    }

    private int f$E(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        return (Integer)linkedList.getFirst();
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3;
        int cfr_ignored_0 = 5 << 3 ^ 5;
        int n4 = n2;
        int n5 = 2 << 3 ^ 4;
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

    public void f$E(Reader reader) {
        v v2 = 0;
        v2.f$M.f$E(reader);
        v2.f$a();
    }

    public int f$E() {
        v v2;
        return v2.f$M.f$e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f$E(Reader object2, m m2, boolean bl2) throws IOException, r {
        v v2;
        if (!bl2) {
            v3.f$E((Reader)object2);
            v2 = v3;
            v3.f$i = new LinkedList();
        } else {
            if (v3.f$i == null) {
                bl2 = false;
                v3.f$E((Reader)object2);
                v3.f$i = new LinkedList();
            }
            v2 = v3;
        }
        Object object2 = v2.f$i;
        try {
            do {
                v v3;
                v v4;
                block51: {
                    block3 : switch (v3.f$d) {
                        case 0: {
                            m2.f$a();
                            v v5 = v3;
                            v5.f$E();
                            switch (v5.f$g.f$g) {
                                case 0: {
                                    v3.f$d = 1;
                                    ((LinkedList)object2).addFirst(new Integer(v3.f$d));
                                    if (m2.f$E(v3.f$g.f$d)) break block3;
                                    return;
                                }
                                case 1: {
                                    v3.f$d = 2;
                                    ((LinkedList)object2).addFirst(new Integer(v3.f$d));
                                    if (m2.f$K()) break block3;
                                    return;
                                }
                                case 3: {
                                    v3.f$d = 3;
                                    ((LinkedList)object2).addFirst(new Integer(v3.f$d));
                                    if (m2.f$a()) break block3;
                                    return;
                                }
                                default: {
                                    v4 = v3;
                                    v3.f$d = -1;
                                    break;
                                }
                            }
                            break block51;
                        }
                        case 1: {
                            v v6 = v3;
                            v6.f$E();
                            if (v6.f$g.f$g == -1) {
                                m2.f$E();
                                v3.f$d = 6;
                                return;
                            }
                            v3.f$d = -1;
                            throw new r(v3.f$E(), 1, v3.f$g);
                        }
                        case 2: {
                            v v7 = v3;
                            v7.f$E();
                            switch (v7.f$g.f$g) {
                                case 5: {
                                    break block3;
                                }
                                case 0: {
                                    if (v3.f$g.f$d instanceof String) {
                                        String bl2 = (String)v3.f$g.f$d;
                                        v3.f$d = 4;
                                        ((LinkedList)object2).addFirst(new Integer(v3.f$d));
                                        if (m2.f$E(bl2)) break block3;
                                        return;
                                    }
                                    v4 = v3;
                                    v3.f$d = -1;
                                    break;
                                }
                                case 2: {
                                    m m3;
                                    if (((LinkedList)object2).size() > 1) {
                                        m3 = m2;
                                        ((LinkedList)object2).removeFirst();
                                        v3.f$d = v3.f$E((LinkedList)object2);
                                    } else {
                                        v3.f$d = 1;
                                        m3 = m2;
                                    }
                                    if (m3.f$B()) break block3;
                                    return;
                                }
                                default: {
                                    v4 = v3;
                                    v3.f$d = -1;
                                    break;
                                }
                            }
                            break block51;
                        }
                        case 4: {
                            v v8 = v3;
                            v8.f$E();
                            switch (v8.f$g.f$g) {
                                case 6: {
                                    break block3;
                                }
                                case 0: {
                                    ((LinkedList)object2).removeFirst();
                                    v3.f$d = v3.f$E((LinkedList)object2);
                                    if (!m2.f$E(v3.f$g.f$d)) {
                                        return;
                                    }
                                    if (m2.f$e()) break block3;
                                    return;
                                }
                                case 3: {
                                    ((LinkedList)object2).removeFirst();
                                    Object object3 = object2;
                                    ((LinkedList)object3).addFirst(new Integer(5));
                                    v3.f$d = 3;
                                    ((LinkedList)object3).addFirst(new Integer(v3.f$d));
                                    if (m2.f$a()) break block3;
                                    return;
                                }
                                case 1: {
                                    ((LinkedList)object2).removeFirst();
                                    Object object4 = object2;
                                    ((LinkedList)object4).addFirst(new Integer(5));
                                    v3.f$d = 2;
                                    ((LinkedList)object4).addFirst(new Integer(v3.f$d));
                                    if (m2.f$K()) break block3;
                                    return;
                                }
                                default: {
                                    v4 = v3;
                                    v3.f$d = -1;
                                    break;
                                }
                            }
                            break block51;
                        }
                        case 5: {
                            ((LinkedList)object2).removeFirst();
                            v3.f$d = v3.f$E((LinkedList)object2);
                            if (m2.f$e()) break;
                            return;
                        }
                        case 3: {
                            v v9 = v3;
                            v9.f$E();
                            switch (v9.f$g.f$g) {
                                case 5: {
                                    break;
                                }
                                case 0: {
                                    if (m2.f$E(v3.f$g.f$d)) break;
                                    return;
                                }
                                case 4: {
                                    m m4;
                                    if (((LinkedList)object2).size() > 1) {
                                        m4 = m2;
                                        ((LinkedList)object2).removeFirst();
                                        v3.f$d = v3.f$E((LinkedList)object2);
                                    } else {
                                        v3.f$d = 1;
                                        m4 = m2;
                                    }
                                    if (m4.f$E()) break;
                                    return;
                                }
                                case 1: {
                                    v3.f$d = 2;
                                    ((LinkedList)object2).addFirst(new Integer(v3.f$d));
                                    if (m2.f$K()) break;
                                    return;
                                }
                                case 3: {
                                    v3.f$d = 3;
                                    ((LinkedList)object2).addFirst(new Integer(v3.f$d));
                                    if (m2.f$a()) break;
                                    return;
                                }
                                default: {
                                    v3.f$d = -1;
                                    break;
                                }
                            }
                            break;
                        }
                        case 6: {
                            return;
                        }
                        case -1: {
                            throw new r(v3.f$E(), 1, v3.f$g);
                        }
                    }
                    v4 = v3;
                }
                if (v4.f$d != -1) continue;
                throw new r(v3.f$E(), 1, v3.f$g);
            } while (v3.f$g.f$g != -1);
        }
        catch (IOException bl2) {
            v3.f$d = -1;
            throw bl2;
        }
        catch (r bl2) {
            v3.f$d = -1;
            throw bl2;
        }
        catch (RuntimeException bl2) {
            v3.f$d = -1;
            throw bl2;
        }
        catch (Error bl2) {
            v3.f$d = -1;
            throw bl2;
        }
        v3.f$d = -1;
        throw new r(v3.f$E(), 1, v3.f$g);
    }

    public void f$a() {
        v v2;
        v v3 = v2;
        v2.f$g = null;
        v3.f$d = 0;
        v3.f$i = null;
    }
}
package net.futureclient.client;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import net.futureclient.client.H;
import net.futureclient.client.d;
import net.futureclient.client.r;
import net.futureclient.client.u;
import net.futureclient.client.v;
import net.futureclient.client.x;

public class V {
    public static String f$a(String string) {
        StringBuffer stringBuffer;
        if (string == null) {
            return null;
        }
        StringBuffer stringBuffer2 = stringBuffer = new StringBuffer();
        V.f$E(string, stringBuffer2);
        return stringBuffer2.toString();
    }

    public static void f$E(Object object, Writer writer) throws IOException {
        if (object == null) {
            writer.write("null");
            return;
        }
        if (object instanceof String) {
            Writer writer2 = writer;
            writer2.write(34);
            writer2.write(V.f$a((String)object));
            writer.write(34);
            return;
        }
        if (object instanceof Double) {
            if (((Double)object).isInfinite() || ((Double)object).isNaN()) {
                writer.write("null");
                return;
            }
            writer.write(object.toString());
            return;
        }
        if (object instanceof Float) {
            if (((Float)object).isInfinite() || ((Float)object).isNaN()) {
                writer.write("null");
                return;
            }
            writer.write(object.toString());
            return;
        }
        if (object instanceof Number) {
            writer.write(object.toString());
            return;
        }
        if (object instanceof Boolean) {
            writer.write(object.toString());
            return;
        }
        if (object instanceof H) {
            ((H)object).f$E(writer);
            return;
        }
        if (object instanceof d) {
            writer.write(((d)object).f$E());
            return;
        }
        if (object instanceof Map) {
            u.f$E((Map)((Map)object), (Writer)writer);
            return;
        }
        if (object instanceof Collection) {
            x.f$E((Collection)((Collection)object), (Writer)writer);
            return;
        }
        if (object instanceof byte[]) {
            x.f$E((byte[])((byte[])object), (Writer)writer);
            return;
        }
        if (object instanceof short[]) {
            x.f$E((short[])((short[])object), (Writer)writer);
            return;
        }
        if (object instanceof int[]) {
            x.f$E((int[])((int[])object), (Writer)writer);
            return;
        }
        if (object instanceof long[]) {
            x.f$E((long[])((long[])object), (Writer)writer);
            return;
        }
        if (object instanceof float[]) {
            x.f$E((float[])((float[])object), (Writer)writer);
            return;
        }
        if (object instanceof double[]) {
            x.f$E((double[])((double[])object), (Writer)writer);
            return;
        }
        if (object instanceof boolean[]) {
            x.f$E((boolean[])((boolean[])object), (Writer)writer);
            return;
        }
        if (object instanceof char[]) {
            x.f$E((char[])((char[])object), (Writer)writer);
            return;
        }
        if (object instanceof Object[]) {
            x.f$E((Object[])((Object[])object), (Writer)writer);
            return;
        }
        writer.write(object.toString());
    }

    public V() {
        V v;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void f$E(String string, StringBuffer stringBuffer) {
        int n;
        int n2 = string.length();
        int n3 = n = 0;
        while (n3 < n2) {
            char c = string.charAt(n);
            switch (c) {
                case '\"': {
                    stringBuffer.append("\\\"");
                    break;
                }
                case '\\': {
                    stringBuffer.append("\\\\");
                    break;
                }
                case '\b': {
                    stringBuffer.append("\\b");
                    break;
                }
                case '\f': {
                    stringBuffer.append("\\f");
                    break;
                }
                case '\n': {
                    stringBuffer.append("\\n");
                    break;
                }
                case '\r': {
                    stringBuffer.append("\\r");
                    break;
                }
                case '\t': {
                    stringBuffer.append("\\t");
                    break;
                }
                case '/': {
                    stringBuffer.append("\\/");
                    break;
                }
                default: {
                    if (c >= '\u0000' && c <= '\u001f' || c >= '\u007f' && c <= '\u009f' || c >= '\u2000' && c <= '\u20ff') {
                        String string2 = Integer.toHexString(c);
                        stringBuffer.append("\\u");
                        int n4 = 0;
                        int n5 = n4;
                        while (n5 < 4 - string2.length()) {
                            stringBuffer.append('0');
                            n5 = ++n4;
                        }
                        stringBuffer.append(string2.toUpperCase());
                        break;
                    }
                    stringBuffer.append(c);
                }
            }
            n3 = ++n;
        }
        return;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (3 ^ 5) << 3 ^ 2;
        int cfr_ignored_0 = 5 << 4 ^ (2 << 2 ^ 3);
        int n5 = 5 << 3 ^ (3 ^ 5);
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

    public static Object f$E(Reader reader) throws IOException, r {
        return new v().f$E(reader);
    }

    public static String f$E(Object object) {
        StringWriter stringWriter = new StringWriter();
        try {
            V.f$E(object, stringWriter);
            return stringWriter.toString();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public static Object f$a(String string) {
        return V.f$a(new StringReader(string));
    }

    public static Object f$a(Reader reader) {
        try {
            v v2 = new v();
            return v2.f$E(reader);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Object f$E(String string) throws r {
        return new v().f$E(string);
    }
}
