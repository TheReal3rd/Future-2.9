package net.futureclient.client;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import net.futureclient.client.qh;
import net.futureclient.client.zh;

/*
 * Exception performing whole class analysis ignored.
 */
public class jH
extends Socket {
    private static int[] f$d;
    private int f$g;
    private String f$i;
    private qh f$M;

    private void f$e() throws IOException {
        int n;
        StringBuffer stringBuffer;
        String string;
        CharSequence charSequence;
        Closeable closeable;
        block5: {
            closeable = new PrintStream(this.getOutputStream());
            ((PrintStream)closeable).println("CONNECT " + this.f$i + ":" + this.f$g + " HTTP/1.1");
            ((PrintStream)closeable).println("HOST: " + this.f$i + ":" + this.f$g);
            ((PrintStream)closeable).println();
            ((PrintStream)closeable).flush();
            closeable = new BufferedReader(new InputStreamReader(this.getInputStream()));
            charSequence = new StringBuffer();
            Closeable closeable2 = closeable;
            while ((string = ((BufferedReader)closeable2).readLine()) != null) {
                if (string.length() == 0) {
                    stringBuffer = charSequence;
                    break block5;
                }
                charSequence.append(string);
                closeable2 = closeable;
            }
            stringBuffer = charSequence;
        }
        closeable = stringBuffer.toString().split("\n")[0].trim().split(" ");
        string = closeable[0];
        int n2 = Integer.parseInt(closeable[1]);
        charSequence = "";
        int n3 = n = 2;
        while (n3 < ((Closeable)closeable).length) {
            charSequence = String.valueOf(charSequence) + (String)((Object)closeable[n]);
            if (n != ((Closeable)closeable).length - 1) {
                charSequence = String.valueOf(charSequence) + " ";
            }
            n3 = ++n;
        }
        if (n2 != 200) {
            IOException iOException;
            IOException iOException2 = iOException;
            IOException iOException3 = iOException;
            System.out.println(charSequence);
            return;
        }
    }

    private void f$E() throws IOException {
        int n;
        DataOutputStream dataOutputStream;
        jH jH2;
        DataOutputStream dataOutputStream2 = new DataOutputStream(jH2.getOutputStream());
        DataInputStream dataInputStream = new DataInputStream(jH2.getInputStream());
        dataOutputStream2.writeByte(5);
        if (jH2.f$M.f$E()) {
            DataOutputStream dataOutputStream3 = dataOutputStream2;
            dataOutputStream = dataOutputStream3;
            dataOutputStream2.writeByte(2);
            dataOutputStream3.writeByte(0);
            dataOutputStream3.writeByte(2);
        } else {
            dataOutputStream = dataOutputStream2;
            DataOutputStream dataOutputStream4 = dataOutputStream2;
            dataOutputStream4.writeByte(1);
            dataOutputStream4.writeByte(0);
        }
        dataOutputStream.flush();
        DataInputStream dataInputStream2 = dataInputStream;
        dataInputStream2.readByte();
        if (dataInputStream2.readByte() == 2) {
            jH2.f$E(dataOutputStream2, dataInputStream);
        }
        DataOutputStream dataOutputStream5 = dataOutputStream2;
        DataOutputStream dataOutputStream6 = dataOutputStream2;
        dataOutputStream6.writeByte(5);
        dataOutputStream6.writeByte(1);
        dataOutputStream5.writeByte(0);
        dataOutputStream5.writeByte(3);
        dataOutputStream2.writeByte(jH2.f$i.length());
        int n2 = n = 0;
        while (n2 < jH2.f$i.length()) {
            dataOutputStream2.writeByte(jH2.f$i.charAt(n++));
            n2 = n;
        }
        DataOutputStream dataOutputStream7 = dataOutputStream2;
        dataOutputStream7.writeShort(jH2.f$g);
        dataOutputStream7.flush();
        dataInputStream.readByte();
        dataInputStream.readByte();
        dataInputStream.readByte();
        byte by = dataInputStream.readByte();
        n = by;
        DataInputStream dataInputStream3 = dataInputStream;
        jH2.f$E(by, dataInputStream3);
        dataInputStream3.readShort();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f$E(qh qh2, int n) throws IOException {
        0.connect(new InetSocketAddress(qh2.f$E(), qh2.f$E()), n);
        switch (jH.f$E()[qh2.f$E().ordinal()]) {
            case 3: {
                0.f$e();
                return;
            }
            case 1: {
                0.f$a();
                return;
            }
            case 2: {
                0.f$E();
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f$E(int n) throws IOException {
        if (0.f$M == null) {
            throw new IOException("Proxy is null");
        }
        0.connect(new InetSocketAddress(0.f$M.f$E(), 0.f$M.f$E()), n);
        switch (jH.f$E()[0.f$M.f$E().ordinal()]) {
            case 3: {
                0.f$e();
                return;
            }
            case 1: {
                0.f$a();
                return;
            }
            case 2: {
                0.f$E();
                return;
            }
        }
    }

    public jH(String string, int n, qh qh2) throws UnknownHostException, IOException {
        jH jH2 = 0;
        jH2.f$i = string;
        jH2.f$g = n;
        0.f$M = qh2;
        0.f$E(30000);
    }

    private void f$a() throws IOException {
        DataOutputStream dataOutputStream;
        jH jH2;
        DataOutputStream dataOutputStream2 = new DataOutputStream(jH2.getOutputStream());
        DataInputStream dataInputStream = new DataInputStream(jH2.getInputStream());
        jH jH3 = jH2;
        DataOutputStream dataOutputStream3 = dataOutputStream2;
        dataOutputStream2.writeByte(4);
        dataOutputStream3.writeByte(1);
        dataOutputStream3.writeShort(jH2.f$g);
        dataOutputStream2.write(InetAddress.getByName(jH3.f$i).getAddress());
        if (jH3.f$M.f$E()) {
            DataOutputStream dataOutputStream4 = dataOutputStream2;
            dataOutputStream = dataOutputStream4;
            dataOutputStream4.write(jH2.f$M.f$e().getBytes());
        } else {
            DataOutputStream dataOutputStream5 = dataOutputStream2;
            dataOutputStream = dataOutputStream5;
            dataOutputStream5.writeByte(0);
        }
        dataOutputStream.flush();
        DataInputStream dataInputStream2 = dataInputStream;
        byte by = dataInputStream2.readByte();
        byte by2 = dataInputStream2.readByte();
        if (by != 0 || by2 != 90) {
            throw new SocketException();
        }
        dataInputStream.readShort();
        byte[] byArray = new byte[4];
        dataInputStream.read(byArray);
    }

    public jH(String string, int n) throws UnknownHostException, IOException {
        jH jH2 = 0;
        jH2.f$i = string;
        jH2.f$g = n;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int[] f$E() {
        block9: {
            block8: {
                if (jH.f$d != null) {
                    return jH.f$d;
                }
                var0 = new int[zh.values().length];
                try {
                    var0[zh.f$g.ordinal()] = 3;
                    v0 = var0;
                    ** GOTO lbl11
                }
                catch (NoSuchFieldError v1) {
                    try {
                        v0 = var0;
lbl11:
                        // 2 sources

                        v0[zh.f$i.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError v2) {
                        try {
                            v3 = var0;
lbl16:
                            // 2 sources

                            while (true) {
                                v3[zh.f$M.ordinal()] = 2;
                                break block8;
                                break;
                            }
                        }
                        catch (NoSuchFieldError v4) {
                            v5 = var0;
                            break block9;
                        }
                    }
                }
                v3 = var0;
                ** while (true)
            }
            v5 = var0;
        }
        jH.f$d = v5;
        return v5;
    }

    private void f$E(int n, DataInputStream dataInputStream) throws IOException {
        if (n == 1) {
            byte[] byArray = new byte[4];
            dataInputStream.read(byArray);
            return;
        }
        if (n == 3) {
            DataInputStream dataInputStream2 = dataInputStream;
            byte[] byArray = new byte[dataInputStream2.readByte()];
            dataInputStream2.read(byArray);
            return;
        }
        byte[] byArray = new byte[16];
        dataInputStream.read(byArray);
    }

    private void f$E(DataOutputStream dataOutputStream, DataInputStream dataInputStream) throws IOException {
        int n;
        DataOutputStream dataOutputStream2 = dataOutputStream;
        dataOutputStream2.writeByte(1);
        dataOutputStream2.writeByte(0.f$M.f$e().length());
        int n2 = n = 0;
        while (n2 < 0.f$M.f$e().length()) {
            dataOutputStream.writeByte(0.f$M.f$e().charAt(n++));
            n2 = n;
        }
        dataOutputStream.writeByte(0.f$M.f$a().length());
        int n3 = n = 0;
        while (n3 < 0.f$M.f$a().length()) {
            dataOutputStream.writeByte(0.f$M.f$a().charAt(n++));
            n3 = n;
        }
        dataOutputStream.flush();
        dataInputStream.readByte();
        n = dataInputStream.readByte();
        if (n != 0) {
            throw new SocketException("Couldn't login: " + n);
        }
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 1 << 3;
        int cfr_ignored_0 = 2 << 3 ^ 2;
        int n5 = 4 << 4 ^ 1 << 1;
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
