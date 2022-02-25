package net.futureclient.client;

public enum FA {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FA() {
        FA fA;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ba;
import net.futureclient.client.nE;

public class Fa
extends Ha<nE> {
    public final ba f$d;

    public Fa(ba ba2) {
        0.f$d = ba2;
    }

    @Override
    public void f$E(nE nE2) {
        nE2.f$E(true);
    }
}
package net.futureclient.client;

import java.util.List;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.ba;
import net.futureclient.client.tI;

public class fa
extends Ha<ME> {
    public final ba f$d;

    public fa(ba ba2) {
        0.f$d = ba2;
    }

    @Override
    public void f$E(ME mE) {
        0.f$d.f$a(String.format("Wallhack \u00a77[\u00a7F%s\u00a77]", ba.f$E(0.f$d).f$E()));
        ba.f$E().gameSettings.gammaSetting = 11.0f;
        if (ba.f$a(0.f$d) != 0.f$d.f$K.f$E().intValue() || ((List)ba.f$E(0.f$d).f$E()).size() != ba.f$E(0.f$d)) {
            fa fa2 = 0;
            ba.f$a(fa2.f$d, fa2.f$d.f$K.f$E().intValue());
            ba.f$E(fa2.f$d, ((List)ba.f$E(0.f$d).f$E()).size());
            if (((Boolean)ba.f$E(0.f$d).f$E()).booleanValue()) {
                tI.f$a();
                return;
            }
            tI.f$E();
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.IC;
import net.futureclient.client.JD;
import net.minecraft.client.Minecraft;

public class fA
extends Ba {
    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public fA() {
        fA fA2;
        String[] stringArray = new String[3];
        stringArray[0] = "Yaw";
        stringArray[1] = "RotationYaw";
        stringArray[2] = "Pitch";
        super("Yaw", stringArray, true, -9230451, JD.f$j);
        Ha[] haArray = new Ha[1];
        haArray[0] = new IC(fA2);
        fA2.f$E(haArray);
    }
}
