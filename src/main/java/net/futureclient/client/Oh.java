package net.futureclient.client;

import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Oh {
    f$g;


    public byte[] f$a(byte[] byArray, byte[] object, byte[] object2) throws Exception {
        Cipher cipher;
        object = new SecretKeySpec((byte[])object, "AES");
        object2 = new IvParameterSpec((byte[])object2);
        Cipher cipher2 = cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher2.init(1, (Key)object, (AlgorithmParameterSpec)object2);
        return cipher2.doFinal(byArray);
    }

    public byte[] f$E(byte[] byArray, byte[] object, byte[] object2) throws Exception {
        Cipher cipher;
        object = new SecretKeySpec((byte[])object, "AES");
        object2 = new IvParameterSpec((byte[])object2);
        Cipher cipher2 = cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher2.init(2, (Key)object, (AlgorithmParameterSpec)object2);
        return cipher2.doFinal(byArray);
    }

    public byte[] f$E(int n2) {
        byte[] n2 = new byte[n2];
        new SecureRandom().nextBytes(n2);
        return n2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Oh() {
        Oh oh;
    }
}
package net.futureclient.client;

import net.minecraft.util.EnumFacing;

public class OH {
    public static final int[] f$d;

    static {
        f$d = new int[EnumFacing.values().length];
        try {
            OH.f$d[EnumFacing.NORTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            OH.f$d[EnumFacing.SOUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            OH.f$d[EnumFacing.EAST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            OH.f$d[EnumFacing.WEST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.AI;
import net.futureclient.client.Ba;
import net.futureclient.client.FG;
import net.futureclient.client.JD;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.PixelFormat;

public class oH
extends Ba {
    public oH() {
        oH oH2;
        String[] stringArray = new String[2];
        stringArray[0] = "ESP";
        stringArray[1] = "PlayerESP";
        super("ESP", stringArray, true, -16155218, JD.f$i);
    }

    public static void f$A() throws LWJGLException {
        try {
            Class.forName(AI.f$E().getClass().getName(), false, oH.class.getClassLoader());
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        switch ((FG)((Object)AI.f$E().f$g.f$E())) {
            default: 
        }
        Display.create((PixelFormat)new PixelFormat().withDepthBits(24));
    }
}
