package net.futureclient.client.deof.modules.miscellaneous.skinBlink;

public class SkinBlink {
}
/*
package net.futureclient.client;

import java.util.Set;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.bA;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EnumPlayerModelParts;

public class MA
extends Ba {
    private z<Boolean> f$M;
    private Bh f$d;
    private s f$i;
    private Set f$g;

    public static Bh f$E(MA mA) {
        return mA.f$d;
    }

    public MA() {
        MA mA;
        String[] stringArray = new String[1];
        stringArray[0] = "SkinBlink";
        super("SkinBlink", stringArray, true, -15605781, JD.f$b);
        MA mA2 = mA;
        String[] stringArray2 = new String[5];
        stringArray2[0] = "Delay";
        stringArray2[1] = "Sped";
        stringArray2[2] = "Speed";
        stringArray2[3] = "Del";
        stringArray2[4] = "D";
        mA2.f$i = new s((Number)Float.valueOf(0.1f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(20.0f), 0.1, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Random";
        stringArray3[1] = "Randomization";
        stringArray3[2] = "Rand";
        mA.f$M = new z<Boolean>(false, stringArray3);
        mA.f$d = new Bh();
        mA.f$E(mA.f$M, mA.f$i);
        mA.f$E(new bA(mA));
    }

    public static z f$E(MA mA) {
        return mA.f$M;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    @Override
    public void f$B() {
        int n;
        MA mA;
        super.f$B();
        EnumPlayerModelParts[] enumPlayerModelPartsArray = EnumPlayerModelParts.values();
        int n2 = enumPlayerModelPartsArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            EnumPlayerModelParts enumPlayerModelParts;
            EnumPlayerModelParts enumPlayerModelParts2 = enumPlayerModelParts = enumPlayerModelPartsArray[n];
            ((Minecraft)MA.f$d).gameSettings.setModelPartEnabled(enumPlayerModelParts2, mA.f$g.contains(enumPlayerModelParts2));
            n3 = ++n;
        }
    }

    @Override
    public void f$K() {
        MA mA;
        super.f$K();
        mA.f$g = ((Minecraft)MA.f$d).gameSettings.getModelParts();
    }

    public static s f$E(MA mA) {
        return mA.f$i;
    }

    public static Minecraft f$E() {
        return f$d;
    }
}
 */