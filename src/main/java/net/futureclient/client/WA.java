package net.futureclient.client;

import net.futureclient.client.Oa;
import net.futureclient.client.kF;

public class Wa {
    public static final int[] f$d;
    public static final int[] f$g;

    static {
        f$d = new int[kF.values().length];
        try {
            Wa.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Wa.f$d[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[Oa.values().length];
        try {
            Wa.f$g[Oa.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Wa.f$g[Oa.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.F;

public class wa
implements F {
    public int f$d;
    public int f$g;
    public float f$j;
    public int f$M;
    public float f$b;
    private String f$K;
    public int f$i;

    @Override
    public String f$E() {
        wa wa2;
        return wa2.f$K;
    }

    public void f$E(int n, int n2, int n3) {
    }

    public float f$a() {
        wa wa2;
        return wa2.f$b;
    }

    public void f$E(int n) {
        0.f$M = n;
    }

    public void f$E(int n, int n2, float f) {
    }

    public void f$E(float f, float f2) {
        wa wa2 = 0;
        wa2.f$b = f;
        wa2.f$j = f2;
    }

    public int f$a() {
        wa wa2;
        return wa2.f$i;
    }

    public void f$a(int n, int n2, int n3) {
    }

    public float f$E() {
        wa wa2;
        return wa2.f$j;
    }

    public int f$E() {
        wa wa2;
        return wa2.f$M;
    }

    public wa(String string) {
        0.f$K = string;
    }

    public void f$a(int n) {
        0.f$i = n;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.WB;
import net.futureclient.client.kH;
import net.futureclient.client.rC;
import net.minecraft.client.gui.GuiScreen;

public class wA
extends Ha<ME> {
    public final rC f$d;

    public wA(rC rC2) {
        0.f$d = rC2;
    }

    @Override
    public void f$E(ME mE) {
        WB.f$E().f$d = 0.f$d.f$d.f$E().doubleValue();
        rC.f$E().displayGuiScreen((GuiScreen)WB.f$E());
        kH.f$E().f$E().f$E(0);
    }
}
