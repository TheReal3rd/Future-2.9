package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.rB;
import net.futureclient.client.zf;

public class VA
extends Ha<zf> {
    public final rB f$d;

    @Override
    public void f$E(zf zf2) {
        if (!rB.f$E().player.func_70089_S() && zf2.f$E() != null) {
            zf2.f$E(null);
        }
    }

    public VA(rB rB2) {
        0.f$d = rB2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Ta;
import net.minecraft.client.settings.KeyBinding;

public class Va
extends Ha<ME> {
    public final Ta f$d;

    @Override
    public void f$E(ME mE) {
        if (Ta.f$e().currentScreen != null) {
            Ta.f$a().currentScreen.allowUserInput = true;
        }
        KeyBinding.setKeyBindState((int)Ta.f$E().gameSettings.keyBindAttack.getKeyCode(), (boolean)true);
    }

    public Va(Ta ta) {
        0.f$d = ta;
    }
}
package net.futureclient.client;

import net.futureclient.client.F;

public class va
implements F {
    private double f$i;
    private String f$d;
    private String f$b;
    private double f$g;
    private String f$j;
    private double f$M;

    @Override
    public String f$E() {
        va va2;
        return va2.f$b;
    }

    public va(String string, String string2, double d, double d2, double d3, String string3) {
        va va2 = 0;
        va va3 = 0;
        va va4 = 0;
        va4.f$b = string;
        va4.f$j = string2;
        va3.f$i = d;
        va3.f$M = d2;
        va2.f$g = d3;
        va2.f$d = string3;
    }

    public String f$e() {
        va va2;
        return va2.f$j;
    }

    public double f$E() {
        va va2;
        return va2.f$M;
    }

    public double f$e() {
        va va2;
        return va2.f$g;
    }

    public String f$a() {
        va va2;
        return va2.f$d;
    }

    public double f$a() {
        va va2;
        return va2.f$i;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.tI;
import net.futureclient.client.zA;

public class vA
extends Ha<ME> {
    public final zA f$d;

    public vA(zA zA2) {
        0.f$d = zA2;
    }

    @Override
    public void f$E(ME mE) {
        if (zA.f$E(0.f$d) != (Boolean)zA.f$e(0.f$d).f$E()) {
            vA vA2 = 0;
            zA.f$E(vA2.f$d, (Boolean)zA.f$e(vA2.f$d).f$E());
            if (zA.f$E(0.f$d)) {
                tI.f$a();
            }
        }
    }
}
