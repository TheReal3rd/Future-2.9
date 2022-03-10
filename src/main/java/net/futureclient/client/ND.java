package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.Mf;
import net.futureclient.client.Ue;
import net.futureclient.client.eE;
import net.futureclient.client.lD;
import net.minecraft.util.math.Vec3d;

public abstract class nD
extends Enum<nD> {
    private static final Random f$g;
    private static final nD[] f$d;
    private static final int f$M = 29000000;
    public static final nD f$j;
    public static final nD f$i;
    public static final nD f$b;

    public nD(String string, int n, eE eE2) {
        0(string, n);
    }

    public static nD valueOf(String string) {
        return Enum.valueOf(nD.class, string);
    }

    static {
        f$b = new lD("Down", 0);
        f$j = new Ue("Up", 1);
        f$i = new Mf("Preserve", 2);
        nD[] nDArray = new nD[3];
        nDArray[0] = f$b;
        nDArray[1] = f$j;
        nDArray[2] = f$i;
        f$d = nDArray;
        f$g = new Random();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nD() {
        void var2_-1;
        void var1_-1;
        nD nD2;
    }

    public final int f$E() {
        int n = f$g.nextInt(29000000);
        if (f$g.nextBoolean()) {
            return n;
        }
        return -n;
    }

    public static nD[] values() {
        return (nD[])f$d.clone();
    }

    public abstract Vec3d f$E(Vec3d var1, Vec3d var2);
}
