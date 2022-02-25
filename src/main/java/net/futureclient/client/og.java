package net.futureclient.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import net.futureclient.client.LI;
import net.futureclient.client.TI;
import net.futureclient.client.WH;

public class og
extends DataInputStream {
    private LI f$d;

    public byte[] f$E(byte[] object) throws IOException, DataFormatException {
        Inflater inflater = new Inflater();
        inflater.setInput((byte[])object);
        object = new ByteArrayOutputStream(((byte[])object).length);
        byte[] byArray = new byte[1024];
        Inflater inflater2 = inflater;
        while (!inflater2.finished()) {
            inflater2 = inflater;
            int n = inflater.inflate(byArray);
            ((ByteArrayOutputStream)object).write(byArray, 0, n);
        }
        Object object2 = object;
        ((ByteArrayOutputStream)object2).close();
        byte[] byArray2 = ((ByteArrayOutputStream)object2).toByteArray();
        return byArray2;
    }

    public <P extends WH> P f$E(Class<P> clazz) throws IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, DataFormatException {
        Constructor<P> constructor;
        int n = 0.readInt();
        if (n > 2500) {
            System.err.println("Versuch: " + n);
            throw new IOException("Packet too long: " + n);
        }
        Object object = new byte[n];
        og og2 = 0;
        og2.readFully((byte[])object);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])object));
        object = dataInputStream;
        boolean bl = dataInputStream.readBoolean();
        byte[] byArray = new byte[n - 1];
        dataInputStream.readFully(byArray);
        byArray = og2.f$E(byArray);
        if (bl) {
            if (0.f$d == null) {
                throw new IOException("This packet is encrypted");
            }
            try {
                byArray = 0.f$d.f$E(byArray);
            }
            catch (Exception exception) {
                throw new IOException("Wrong password");
            }
            byArray = 0.f$E(byArray);
        }
        object = new DataInputStream(new ByteArrayInputStream(byArray));
        ((DataInputStream)object).readInt();
        Constructor<P> constructor2 = constructor = clazz.getConstructor(new Class[0]);
        constructor2.setAccessible(true);
        WH wH = (WH)constructor2.newInstance(new Object[0]);
        wH.f$E((DataInputStream)object);
        return (P)wH;
    }

    public og(InputStream inputStream) {
        super(inputStream);
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).insert(0, stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 3;
        int cfr_ignored_0 = 2 << 3 ^ 5;
        int n5 = 1 << 3 ^ 2;
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

    public TI f$E() throws IOException, DataFormatException {
        og og2;
        int n = og2.readInt();
        if (n > 2500) {
            System.err.println("Versuch: " + n);
            throw new IOException("Packet too long: " + n);
        }
        Object object = new byte[n];
        og og3 = og2;
        og3.readFully((byte[])object);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])object));
        object = dataInputStream;
        int n2 = dataInputStream.readBoolean();
        byte[] byArray = new byte[n - 1];
        dataInputStream.readFully(byArray);
        byArray = og3.f$E(byArray);
        if (n2 != 0) {
            if (og2.f$d == null) {
                throw new IOException("This packet is encrypted");
            }
            try {
                byArray = og2.f$d.f$E(byArray);
            }
            catch (Exception exception) {
                throw new IOException("Wrong password");
            }
            byArray = og2.f$E(byArray);
        }
        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(byArray));
        object = dataInputStream2;
        n2 = dataInputStream2.readInt();
        return new TI(n2, (DataInputStream)object);
    }

    public og(InputStream inputStream, String string) {
        super(inputStream);
        og og2 = 0;
        og2.f$d = new LI(string);
    }
}
