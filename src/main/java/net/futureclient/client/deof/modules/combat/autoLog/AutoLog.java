package net.futureclient.client.deof.modules.combat.autoLog;

public class AutoLog {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.LD;
import net.futureclient.client.kH;
import net.futureclient.client.nB;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class Sf
extends Ba {
    private z<Boolean> f$g;
    private z<Boolean> f$M;
    private s f$d;

    public Sf() {
        Sf sf;
        String[] stringArray = new String[1];
        stringArray[0] = "AutoLog";
        super("AutoLog", stringArray, true, -5197648, JD.f$I);
        Sf sf2 = sf;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "OnRender";
        stringArray2[1] = "LogOnRender";
        stringArray2[2] = "or";
        stringArray2[3] = "o";
        sf2.f$M = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[6];
        stringArray3[0] = "NoTotems";
        stringArray3[1] = "OutOfTotem";
        stringArray3[2] = "nt";
        stringArray3[3] = "tt";
        stringArray3[4] = "oot";
        stringArray3[5] = "t";
        sf.f$g = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[2];
        stringArray4[0] = "Health";
        stringArray4[1] = "h";
        sf.f$d = new s((Number)Float.valueOf(5.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(19.0f), 1, stringArray4);
        sf.f$E(sf.f$M, sf.f$g, sf.f$d);
        sf.f$E(new LD(sf));
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    private void f$e(String string) {
        if (f$d.getConnection() == null) {
            ((Minecraft)Sf.f$d).world.sendQuittingDisconnectingPacket();
        } else {
            f$d.getConnection().getNetworkManager().closeChannel((ITextComponent)new TextComponentString(string));
        }
        ((nB)kH.f$E().f$E().f$E(nB.class)).f$E(false);
        0.f$E(false);
    }

    public static s f$E(Sf sf) {
        return sf.f$d;
    }

    public static z f$a(Sf sf) {
        return sf.f$M;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static z f$E(Sf sf) {
        return sf.f$g;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static void f$E(Sf sf, String string) {
        sf.f$e(string);
    }
}
 */