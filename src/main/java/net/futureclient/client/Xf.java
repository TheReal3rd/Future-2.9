package net.futureclient.client;

import net.futureclient.client.Bh;
import net.futureclient.client.GA;
import net.futureclient.client.jF;
import net.futureclient.client.kH;
import net.minecraft.client.Minecraft;

public class Xf
extends GA {
    public Bh f$d;

    public Xf() {
        Xf xf;
        String[] stringArray = new String[6];
        stringArray[0] = "Pot";
        stringArray[1] = "ThrowPot";
        stringArray[2] = "Tpot";
        stringArray[3] = "UpPot";
        stringArray[4] = "SendPot";
        stringArray[5] = "Potion";
        super(stringArray);
        Xf xf2 = xf;
        xf2.f$d = new Bh();
    }

    public static Minecraft f$A(Xf xf) {
        return xf.f$d;
    }

    public static Minecraft f$E(Xf xf) {
        return xf.f$d;
    }

    public static Minecraft f$e(Xf xf) {
        return xf.f$d;
    }

    @Override
    public String f$E(String[] stringArray) {
        kH.f$E().f$E().f$a(new jF(0));
        return "Throwing potion.";
    }

    public static Minecraft f$a(Xf xf) {
        return xf.f$d;
    }

    public static Minecraft f$B(Xf xf) {
        return xf.f$d;
    }

    @Override
    public String f$E() {
        return null;
    }

    public static Minecraft f$K(Xf xf) {
        return xf.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.De;
import net.futureclient.client.Gf;
import net.futureclient.client.Ha;

public class XF
extends Ha<De> {
    public final Gf f$d;

    @Override
    public void f$E(De de) {
        Gf.f$B(0.f$d).f$a();
    }

    public XF(Gf gf) {
        0.f$d = gf;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class xf
extends RF {
    private float f$d;
    private float f$g;

    public void f$E(float f) {
        0.f$d = f;
    }

    public xf() {
        xf xf2;
    }

    public float f$a() {
        xf xf2;
        return xf2.f$g;
    }

    public float f$E() {
        xf xf2;
        return xf2.f$d;
    }

    public void f$a(float f) {
        0.f$g = f;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class xF
extends RF {
    public xF() {
        xF xF2;
    }
}
