package net.futureclient.client;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class LI {
    private byte[] f$d;

    private Key f$E() throws Exception {
        LI lI;
        return new SecretKeySpec(lI.f$d, "AES");
    }

    public LI(String string) {
        int n;
        0.f$d = new byte[16];
        int n2 = n = 0;
        while (n2 < 16) {
            try {
                int n3 = n;
                0.f$d[n3] = string.getBytes()[n3];
            }
            catch (Exception exception) {
                // empty catch block
            }
            n2 = ++n;
        }
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 1;
        int cfr_ignored_0 = (3 ^ 5) << 4;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 2;
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

    public byte[] f$E(byte[] byArray) throws Exception {
        Cipher cipher;
        Key key = 0.f$E();
        Cipher cipher2 = cipher = Cipher.getInstance("AES");
        cipher2.init(2, key);
        return cipher2.doFinal(byArray);
    }

    public byte[] f$a(byte[] byArray) throws Exception {
        Cipher cipher;
        Key key = 0.f$E();
        Cipher cipher2 = cipher = Cipher.getInstance("AES");
        cipher2.init(1, key);
        return cipher2.doFinal(byArray);
    }
}
