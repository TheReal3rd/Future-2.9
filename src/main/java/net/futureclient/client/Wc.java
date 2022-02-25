package net.futureclient.client;

public enum Wc {
    f$j,
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Wc() {
        Wc wc;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ZC;
import net.futureclient.client.l;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.CPacketCloseWindow;

public class WC
extends Ha<ve> {
    public final ZC f$d;

    @Override
    public void f$E(ve ve2) {
        Object object = ve2.f$E();
        if (object instanceof CPacketCloseWindow) {
            object = (CPacketCloseWindow)object;
            ve2.f$E((Boolean)ZC.f$E(0.f$d).f$E() != false || ((l)object).getWindowId() == 0);
        }
    }

    public WC(ZC zC) {
        0.f$d = zC;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Fc;
import net.futureclient.client.Ic;
import net.futureclient.client.JD;
import net.futureclient.client.RB;
import net.futureclient.client.ka;
import net.futureclient.client.pA;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.futureclient.client.zC;
import net.minecraft.client.Minecraft;

public class wC
extends Ba {
    private ka<pA> f$K;
    public z<Boolean> f$j;
    public z<Boolean> f$i;
    public z<Boolean> f$M;
    public s f$d;
    public s f$g;
    public z<Boolean> f$b;

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static ka f$E(wC wC2) {
        return wC2.f$K;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public wC() {
        wC wC2;
        String[] stringArray = new String[5];
        stringArray[0] = "Velocity";
        stringArray[1] = "av";
        stringArray[2] = "antivelocity";
        stringArray[3] = "antivel";
        stringArray[4] = "knockback";
        super("Velocity", stringArray, true, -9206132, JD.f$j);
        wC wC3 = wC2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Mode";
        stringArray2[1] = "m";
        wC3.f$K = new ka<pA>(pA.f$M, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Water";
        stringArray3[1] = "w";
        wC2.f$b = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[2];
        stringArray4[0] = "FishingHook";
        stringArray4[1] = "fishhook";
        wC2.f$j = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[8];
        stringArray5[0] = "Blocks";
        stringArray5[1] = "Block";
        stringArray5[2] = "BlockPush";
        stringArray5[3] = "PushOutOfBlock";
        stringArray5[4] = "PushOutOfBlocks";
        stringArray5[5] = "BlocksPush";
        stringArray5[6] = "bp";
        stringArray5[7] = "b";
        wC2.f$i = new z<Boolean>(false, stringArray5);
        String[] stringArray6 = new String[2];
        stringArray6[0] = "Pushable";
        stringArray6[1] = "Push";
        wC2.f$M = new z<Boolean>(false, stringArray6);
        String[] stringArray7 = new String[8];
        stringArray7[0] = "Horizontal";
        stringArray7[1] = "h%";
        stringArray7[2] = "HReduction";
        stringArray7[3] = "RHeduce";
        stringArray7[4] = "HLower";
        stringArray7[5] = "HVelocity_reduction";
        stringArray7[6] = "hv";
        stringArray7[7] = "h";
        wC2.f$g = new s((Number)0.0, (Number)-100.0, (Number)100.0, 0.1, stringArray7);
        String[] stringArray8 = new String[8];
        stringArray8[0] = "Vertical";
        stringArray8[1] = "v%";
        stringArray8[2] = "VReduction";
        stringArray8[3] = "VReduce";
        stringArray8[4] = "VLower";
        stringArray8[5] = "VVelocity_reduction";
        stringArray8[6] = "vv";
        stringArray8[7] = "v";
        wC2.f$d = new s((Number)0.0, (Number)-100.0, (Number)100.0, 0.1, stringArray8);
        wC2.f$E(wC2.f$K, wC2.f$b, wC2.f$j, wC2.f$i, wC2.f$M, wC2.f$g, wC2.f$d);
        wC2.f$E(new Ic(wC2), new Fc(wC2), new zC(wC2), new RB(wC2));
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Mc;

public class wc
extends Ba {
    public wc() {
        wc wc2;
        String[] stringArray = new String[4];
        stringArray[0] = "TrueDurability";
        stringArray[1] = "TrueDura";
        stringArray[2] = "RealDura";
        stringArray[3] = "RealDurability";
        super("TrueDurability", stringArray, true, -89805, JD.f$b);
        wc2.f$E(new Mc(wc2));
    }
}
