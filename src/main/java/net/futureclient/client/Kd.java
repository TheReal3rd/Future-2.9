package net.futureclient.client;

import net.futureclient.client.Af;
import net.futureclient.client.Ha;
import net.futureclient.client.Pg;
import net.futureclient.client.cC;
import net.futureclient.client.kH;
import net.futureclient.client.uA;
import org.lwjgl.input.Keyboard;

public class Kd
extends Ha<Af> {
    public final cC f$d;

    @Override
    public void f$E(Af af) {
        if (0.f$d.f$b.f$E().booleanValue() && cC.f$e().stream().anyMatch(clazz -> clazz.isInstance(cC.f$b().currentScreen))) {
            if (Keyboard.isKeyDown((int)200)) {
                cC.f$v().player.field_70125_A -= 2.0f;
            }
            if (Keyboard.isKeyDown((int)208)) {
                cC.f$W().player.field_70125_A += 2.0f;
            }
            if (Keyboard.isKeyDown((int)203)) {
                cC.f$Y().player.field_70177_z -= 2.0f;
            }
            if (Keyboard.isKeyDown((int)205)) {
                cC.f$t().player.field_70177_z += 2.0f;
            }
            if (cC.f$P().player.field_70125_A > 90.0f) {
                cC.f$Q().player.field_70125_A = 90.0f;
            }
            if (cC.f$U().player.field_70125_A < -90.0f) {
                cC.f$J().player.field_70125_A = -90.0f;
            }
        }
        cC.f$E(0.f$d);
        if (cC.f$d().player.func_184585_cz()) {
            uA uA2 = (uA)kH.f$E().f$E().f$E(uA.class);
            if (0.f$d.f$i.f$E().booleanValue() && Pg.f$e() && cC.f$l().player.field_70122_E && uA2 != null && !uA2.f$E()) {
                cC.f$k().player.field_70181_x = 0.4;
            }
        }
    }

    public Kd(cC cC2) {
        0.f$d = cC2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Fg;
import net.futureclient.client.RF;

public class KD
extends RF {
    private Fg f$b;
    private float f$M;
    private float f$g;
    private float f$j;
    private boolean f$d;
    private float f$i;

    public float f$a() {
        KD kD;
        return kD.f$M;
    }

    public float f$e() {
        KD kD;
        return kD.f$i;
    }

    public KD(Fg fg, float f, float f2, boolean bl) {
        KD kD = 0;
        kD.f$b = fg;
        kD.f$j = kD.f$M = f;
        KD kD2 = 0;
        kD2.f$i = kD2.f$g = f2;
        0.f$d = bl;
    }

    public float f$E() {
        KD kD;
        return kD.f$g;
    }

    public void f$a(boolean bl) {
        0.f$d = bl;
    }

    public boolean f$a() {
        KD kD;
        return kD.f$d;
    }

    public float f$B() {
        KD kD;
        return kD.f$j;
    }

    public void f$a(float f) {
        0.f$j = f;
    }

    public void f$E(float f) {
        0.f$i = f;
    }

    public Fg f$E() {
        KD kD;
        return kD.f$b;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Of;
import net.futureclient.client.gG;
import net.futureclient.client.s;
import net.minecraft.client.Minecraft;

public class kD
extends Ba {
    private gG f$d;
    private s f$g;

    public static s f$E(kD kD2) {
        return kD2.f$g;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public kD() {
        kD kD2;
        String[] stringArray = new String[4];
        stringArray[0] = "AutoAccept";
        stringArray[1] = "accept";
        stringArray[2] = "tpaccept";
        stringArray[3] = "tpa";
        super("AutoAccept", stringArray, true, -11184726, JD.f$b);
        kD kD3 = kD2;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Delay";
        stringArray2[1] = "Del";
        stringArray2[2] = "d";
        kD3.f$g = new s((Number)Float.valueOf(3.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(10.0f), 0.1, stringArray2);
        kD2.f$d = new gG();
        kD2.f$E(kD2.f$g);
        kD2.f$E(new Of(kD2));
    }

    public static gG f$E(kD kD2) {
        return kD2.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.pC;
import net.futureclient.client.t;

public class kd
extends Ha<ME> {
    public final pC f$d;

    public kd(pC pC2) {
        0.f$d = pC2;
    }

    @Override
    public void f$E(ME mE) {
        if ((double)((t)pC.f$a().world).getRainingStrength() > 0.2) {
            String string = "Rain";
            if ((double)((t)pC.f$E().world).getThunderingStrength() > 0.9) {
                string = "Thunder";
            }
            0.f$d.f$a(String.format("NoWeather \u00a77[\u00a7F%s\u00a77]", string));
            return;
        }
        0.f$d.f$a("NoWeather \u00a77[\u00a7FClear\u00a77]");
    }
}
