package net.futureclient.client;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Gi {
    private final String f$d;

    public static Gi f$E() {
        return new Gi("SHA-512");
    }

    public String f$E(String object) {
        Object object2;
        try {
            int n;
            MessageDigest messageDigest = MessageDigest.getInstance(this.f$d);
            messageDigest.update(((String)object).getBytes());
            object = messageDigest.digest();
            object2 = new StringBuilder();
            int n2 = n = 0;
            while (n2 < ((Object)object).length) {
                String string = Integer.toString((object[n] & 0xFF) + 256, 16);
                ((StringBuilder)object2).append(string.substring(1));
                n2 = ++n;
            }
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            try {
                object = Class.forName("java.lang.Shutdown");
                object2 = ((Class)object).getDeclaredMethod("exit", Integer.TYPE);
            }
            catch (Exception exception) {
                // empty catch block
            }
            throw new RuntimeException("Failed to load! Please post on the forums with the error code \"0x1A52\" to get help.");
        }
        return ((StringBuilder)object2).toString();
    }

    private Gi(String string) {
        0.f$d = string;
    }
}
