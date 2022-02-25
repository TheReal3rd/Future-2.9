package net.futureclient.client;

import net.futureclient.client.DA;
import net.futureclient.client.Ha;
import net.futureclient.client.xF;

public class Wb
extends Ha<xF> {
    public final DA f$d;

    public Wb(DA dA) {
        0.f$d = dA;
    }

    @Override
    public void f$E(xF xF2) {
        xF2.f$E(0.f$d.f$i.f$E());
    }
}
package net.futureclient.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import net.futureclient.client.JD;
import net.futureclient.client.Uh;
import net.futureclient.client.jC;
import net.futureclient.client.qC;
import net.futureclient.client.tb;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.input.Mouse;

public class WB
extends GuiScreen {
    private static WB f$M;
    public double f$d;
    private ArrayList<qC> f$g;

    public void mouseReleased(int n, int n2, int n3) {
        0.f$g.forEach(qC2 -> qC2.f$E((int)((double)n * (1.0 / 0.f$d)), (int)((double)n2 * (1.0 / 0.f$d)), n3));
    }

    public void drawScreen(int n, int n2, float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        Uh.f$a(0.0f, 0.0f, 0.mc.displayWidth, 0.mc.displayHeight, 0x20000000, -1879048192);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        0.f$g.forEach(qC2 -> qC2.f$E((int)((double)n * (1.0 / 0.f$d)), (int)((double)n2 * (1.0 / 0.f$d)), f));
    }

    private void f$E() {
        WB wB;
        int n;
        int n2 = -84;
        JD[] jDArray = JD.values();
        int n3 = jDArray.length;
        int n4 = n = 0;
        while (n4 < n3) {
            JD jD = jDArray[n];
            ArrayList<qC> arrayList = wB.f$g;
            String string = jD.f$E();
            arrayList.add(new tb(wB, string, n2 += 90, 4, true, jD));
            n4 = ++n;
        }
        wB.f$g.add(new jC(wB, "Other", n2 += 90, 4, true));
    }

    public boolean doesGuiPauseGame() {
        return false;
    }

    public void mouseClicked(int n, int n2, int n3) {
        0.f$g.forEach(qC2 -> qC2.f$a((int)((double)n * (1.0 / 0.f$d)), (int)((double)n2 * (1.0 / 0.f$d)), n3));
    }

    public ArrayList<qC> f$E() {
        WB wB;
        return wB.f$g;
    }

    public static WB f$E() {
        if (f$M == null) {
            f$M = new WB();
            return f$M;
        }
        return f$M;
    }

    public void handleMouseInput() throws IOException {
        WB wB;
        super.handleMouseInput();
        int n = Mouse.getEventDWheel();
        if (n != 0) {
            if (n > 1) {
                n = 1;
            }
            if (n < -1) {
                n = -1;
            }
            if (!WB.isShiftKeyDown()) {
                n *= 25;
            }
            ArrayList arrayList = new ArrayList();
            wB.f$g.forEach(qC2 -> {
                qC qC3 = qC2;
                arrayList.add((int)qC3.f$E());
                qC3.f$E(n, -((Integer)Collections.max(arrayList)).intValue());
            });
        }
    }

    public WB() {
        WB wB;
        wB.f$d = 1.0;
        wB.f$g = new ArrayList();
        if (wB.f$E().isEmpty()) {
            wB.f$E();
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.kF;

public class wB {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            wB.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            wB.f$d[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.bg;
import net.futureclient.client.pc;
import net.futureclient.client.yA;

public class wb
extends Ha<bg> {
    public final yA f$d;

    @Override
    public void f$E(bg bg2) {
        if (((pc)((Object)0.f$d.f$d.f$E())).equals((Object)pc.f$g) && yA.f$E(0.f$d)) {
            bg2.f$a(true);
        }
    }

    public wb(yA yA2) {
        0.f$d = yA2;
    }
}
