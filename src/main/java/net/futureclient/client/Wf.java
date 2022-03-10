package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.client.gui.GuiScreen;

public class Wf
extends RF {
    private GuiScreen f$d;

    public Wf(GuiScreen guiScreen) {
        0.f$d = guiScreen;
    }

    public GuiScreen f$E() {
        Wf wf;
        return wf.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.yf;

public class WF {
    public static final int[] f$d;

    static {
        f$d = new int[yf.values().length];
        try {
            WF.f$d[yf.f$g.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            WF.f$d[yf.f$M.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.kF;

public class wf {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            wf.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
