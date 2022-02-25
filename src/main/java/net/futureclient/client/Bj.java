package net.futureclient.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import net.futureclient.client.HG;
import net.futureclient.client.S;
import net.futureclient.client.mi;
import net.futureclient.client.nG;

public class Bj {
    public static S[] f$E(File file) throws IOException {
        int n;
        int n2;
        int n3;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] byArray = new byte[fileInputStream.available()];
        fileInputStream.read(byArray);
        ArrayList<S> arrayList = new ArrayList<S>();
        boolean bl = true;
        byte[] byArray2 = byArray;
        int n4 = byArray2.length;
        int n5 = n3 = 0;
        while (n5 < n4) {
            n2 = byArray2[n3];
            if (n2 == 64) {
                bl = false;
                break;
            }
            n5 = ++n3;
        }
        int n6 = n = 0;
        while (n6 < byArray.length) {
            n4 = byArray[n];
            if (n4 == (bl ? 5 : 64)) {
                byte[] byArray3 = new byte[]{byArray[++n], byArray[++n]};
                n2 = byArray3[0] & 0xFF | (byArray3[1] & 0xFF) << 8;
                arrayList.add(new mi(n2));
            } else {
                arrayList.add(new nG(HG.values()[n4], byArray[++n]));
            }
            n6 = ++n;
        }
        ArrayList<S> arrayList2 = arrayList;
        return arrayList2.toArray(new S[arrayList2.size()]);
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 5 << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3 << 1;
        int n5 = (2 ^ 5) << 3 ^ 3;
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

    public Bj() {
        Bj bj;
    }

    public static void f$E(File file, S[] sArray) throws IOException {
        int n;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        int n2 = sArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            byte[] byArray;
            S s;
            S s2 = sArray[n];
            if (s2 instanceof mi) {
                s = (mi)s2;
                byArray = new byte[]{64, (byte)(((mi)s).f$E() & 0xFF), (byte)(((mi)s).f$E() >> 8 & 0xFF)};
                ((OutputStream)fileOutputStream).write(byArray);
            } else if (s2 instanceof nG) {
                s = (nG)s2;
                byArray = new byte[]{(byte)((nG)s).f$E().f$E(), ((nG)s).f$E()};
                ((OutputStream)fileOutputStream).write(byArray);
            }
            n3 = ++n;
        }
        ((OutputStream)fileOutputStream).close();
    }
}
package net.futureclient.client;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import net.futureclient.client.P;
import net.futureclient.client.ii;
import net.futureclient.client.ri;
import net.minecraft.entity.player.EntityPlayer;

public final class bj {
    private static final List<P> f$d;

    @Nullable
    public static P f$E(EntityPlayer entityPlayer) {
        for (P p : f$d) {
            if (!p.f$E(entityPlayer)) continue;
            return p;
        }
        return null;
    }

    static {
        P[] pArray = new P[2];
        pArray[0] = new ii();
        pArray[1] = new ri();
        f$d = Arrays.asList(pArray);
    }

    public bj() {
        bj bj2;
    }
}
