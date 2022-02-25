package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.GA;
import net.futureclient.client.J;
import net.futureclient.client.kH;

public class SG
extends GA {
    @Override
    public String f$E(String[] stringArray) {
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            Ba ba;
            if (ma2 instanceof J && (ba = (Ba)ma2).f$E()) {
                ba.f$E();
            }
        });
        return "All modules turned off.";
    }

    public SG() {
        SG sG;
        String[] stringArray = new String[3];
        stringArray[0] = "Legit";
        stringArray[1] = "Alloff";
        stringArray[2] = "leigt";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return null;
    }
}
package net.futureclient.client;

public enum sG {
    f$K,
    f$b,
    f$j,
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private sG() {
        sG sG2;
    }
}
