package net.futureclient.client;

public enum CF {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CF() {
        CF cF;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.Hf;
import net.futureclient.client.kE;
import net.futureclient.client.kH;

public class cF extends Ha<kE> {
    public final Hf f$d;

    @Override
    public void f$E(kE kE2) {
        if (kE2.f$E() == He.f$b) {
            kH.f$E().f$E().f$E().forEach(ig2 -> {
                if (ig2.f$E() != 0 && kE2.f$E() == ig2.f$E()) {
                    ig2.f$E().f$E();
                }
            });
        }
    }

    public cF(Hf hf) {
        0.f$d = hf;
    }
}
