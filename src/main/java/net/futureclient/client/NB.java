package net.futureclient.client;

import net.futureclient.client.Nb;

public class NB {
    public static final int[] f$d;

    static {
        f$d = new int[Nb.values().length];
        try {
            NB.f$d[Nb.f$g.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NB.f$d[Nb.f$M.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

public enum Nb {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Nb() {
        Nb nb;
    }
}
package net.futureclient.client;

import net.futureclient.client.Qb;
import net.futureclient.client.Uh;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.wD;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;

public class nb
extends Qb {
    private Minecraft f$d;
    private z f$g;

    @Override
    public void f$a(int n, int n2, int n3) {
        super.f$B(n, n2, n3);
    }

    public nb(z z2) {
        nb nb2 = 0;
        z z3 = z2;
        super(z3.f$E()[0]);
        0.f$d = Minecraft.getMinecraft();
        nb2.f$g = z3;
        nb2.f$i = 15;
    }

    @Override
    public void f$E(int n, int n2, float f2) {
        gF f2 = (gF)kH.f$E().f$E().f$E(gF.class);
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        nb nb2 = 0;
        nb nb3 = 0;
        nb nb4 = 0;
        Uh.f$E(nb2.f$b, nb2.f$j, nb3.f$b + (float)nb3.f$i + 7.0f, nb4.f$j + (float)nb4.f$M, 0.f$E() ? (!0.f$E(n, n2) ? wD2.f$a.getRGB() + -1728053248 : wD2.f$a.getRGB() + 0x70000000) : (!0.f$E(n, n2) ? 0x11555555 : -2007673515));
        if (f2.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            f2.f$L.f$E(0.f$E(), (double)(0.f$b + 2.0f), (double)(0.f$j + 4.0f), 0xFFFFFF);
            GlStateManager.disableBlend();
            return;
        }
        0.f$d.fontRenderer.drawStringWithShadow(0.f$E(), 0.f$b + 2.0f, 0.f$j + 4.0f, 0xFFFFFF);
    }

    @Override
    public boolean f$E() {
        nb nb2;
        return (Boolean)nb2.f$g.f$E();
    }

    @Override
    public void f$E() {
        nb nb2;
        nb nb3 = nb2;
        nb3.f$g.f$E((Boolean)nb3.f$g.f$E() == false);
    }

    @Override
    public int f$E() {
        return 14;
    }
}

