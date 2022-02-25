package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

public class Zd
extends RF {
    public int f$i;
    public int f$j;
    public int f$M;
    public int f$g;
    public int f$d;

    public ScaledResolution f$E() {
        return new ScaledResolution(Minecraft.getMinecraft());
    }

    public Zd() {
        Zd zd;
        Zd zd2 = zd;
        Zd zd3 = zd;
        zd3.f$i = 2;
        zd3.f$M = 2;
        zd2.f$g = -7;
        zd2.f$d = 8;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Ie;
import net.futureclient.client.ye;

public class ZD
extends Ha<ye> {
    public final Ie f$d;

    @Override
    public void f$E(ye ye2) {
        ye2.f$E(true);
    }

    public ZD(Ie ie) {
        0.f$d = ie;
    }
}
package net.futureclient.client;

import net.futureclient.client.Fe;
import net.futureclient.client.Gf;
import net.futureclient.client.Ha;
import net.futureclient.client.kH;
import net.futureclient.client.rA;

public class zd
extends Ha<Fe> {
    public final Gf f$d;

    @Override
    public void f$E(Fe fe) {
        if (fe.f$E().equals(Gf.f$h)) {
            zd zd2;
            rA rA2 = (rA)kH.f$E().f$E().f$E(rA.class);
            if (rA2 != null && rA2.f$E()) {
                zd2 = 0;
                fe.f$a(false);
            } else {
                if (fe.f$a()) {
                    Gf.f$B(0.f$d).f$a();
                }
                zd2 = 0;
            }
            if (Gf.f$B(zd2.f$d) != null && fe.f$E().equals(Gf.f$K().gameSettings.keyBindForward)) {
                fe.f$a(Gf.f$B(0.f$d));
                return;
            }
            if (Gf.f$e(0.f$d) != null && fe.f$E().equals(Gf.f$B().gameSettings.keyBindBack)) {
                fe.f$a(Gf.f$e(0.f$d));
                return;
            }
            if (Gf.f$a(0.f$d) != null && fe.f$E().equals(Gf.f$e().gameSettings.keyBindLeft)) {
                fe.f$a(Gf.f$a(0.f$d));
                return;
            }
            if (Gf.f$E(0.f$d) != null && fe.f$E().equals(Gf.f$a().gameSettings.keyBindRight)) {
                fe.f$a(Gf.f$E(0.f$d));
                return;
            }
            if (Gf.f$K(0.f$d) != null && fe.f$E().equals(Gf.f$E().gameSettings.keyBindSneak)) {
                fe.f$a(Gf.f$K(0.f$d));
            }
        }
    }

    public zd(Gf gf) {
        0.f$d = gf;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.item.ItemStack;

public class zD
extends RF {
    private final ItemStack f$M;
    private final int f$d;
    private int f$g;

    public ItemStack f$E() {
        zD zD2;
        return zD2.f$M;
    }

    public int f$E() {
        zD zD2;
        return zD2.f$d;
    }

    public zD(ItemStack itemStack, int n, int n2) {
        zD zD2 = 0;
        0.f$M = itemStack;
        zD2.f$g = n;
        zD2.f$d = n2;
    }

    public int f$a() {
        zD zD2;
        return zD2.f$g;
    }

    public void f$E(int n) {
        0.f$g = n;
    }
}
