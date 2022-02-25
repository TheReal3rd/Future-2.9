package net.futureclient.client;

import net.futureclient.client.CC;
import net.futureclient.client.Ha;
import net.futureclient.client.iF;

public class PB
extends Ha<iF> {
    public final CC f$d;

    @Override
    public void f$E(iF iF2) {
        iF2.f$E(true);
    }

    public PB(CC cC) {
        0.f$d = cC;
    }
}
package net.futureclient.client;

import net.futureclient.client.Dg;
import net.futureclient.client.Ha;
import net.futureclient.client.rA;

public class Pb
extends Ha<Dg> {
    public final rA f$d;

    public Pb(rA rA2) {
        0.f$d = rA2;
    }

    @Override
    public void f$E(Dg dg) {
        dg.f$E(true);
    }
}
package net.futureclient.client;

public enum pb {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pb() {
        pb pb2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.s;

public class pB
extends Ba {
    public s f$d;

    public pB() {
        pB pB2;
        String[] stringArray = new String[3];
        stringArray[0] = "SmallShield";
        stringArray[1] = "SmallHand";
        stringArray[2] = "Small";
        super("SmallShield", stringArray, true, -7217221, JD.f$i);
        pB pB3 = pB2;
        String[] stringArray2 = new String[7];
        stringArray2[0] = "Height";
        stringArray2[1] = "Heigh";
        stringArray2[2] = "Hight";
        stringArray2[3] = "High";
        stringArray2[4] = "Size";
        stringArray2[5] = "Scaling";
        stringArray2[6] = "Scale";
        pB3.f$d = new s((Number)Float.valueOf(0.5f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), stringArray2);
        pB2.f$E(pB2.f$d);
    }
}
