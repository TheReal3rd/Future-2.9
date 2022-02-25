package net.futureclient.client;

public enum PC {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PC() {
        PC pC;
    }
}
package net.futureclient.client;

public enum pc {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pc() {
        pc pc2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.NC;
import net.futureclient.client.kd;
import net.minecraft.client.Minecraft;

public class pC
extends Ba {
    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public pC() {
        pC pC2;
        String[] stringArray = new String[7];
        stringArray[0] = "NoWeather";
        stringArray[1] = "NoWather";
        stringArray[2] = "NoRain";
        stringArray[3] = "AntiWeather";
        stringArray[4] = "AntiRain";
        stringArray[5] = "RainRemove";
        stringArray[6] = "NoThunder";
        super("NoWeather", stringArray, true, 0x99FFFF, JD.f$i);
        Ha[] haArray = new Ha[2];
        haArray[0] = new kd(pC2);
        haArray[1] = new NC(pC2);
        pC2.f$E(haArray);
    }
}
