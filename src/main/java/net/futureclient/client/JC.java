package net.futureclient.client;

import net.futureclient.client.J;
import net.futureclient.client.WB;
import net.futureclient.client.kH;
import net.futureclient.client.lb;
import net.futureclient.client.ma;
import net.futureclient.client.qC;

public class jC
extends qC {
    public final WB f$d;

    public jC(WB wB, String string, int n, int n2, boolean bl) {
        0.f$d = wB;
        super(string, n, n2, bl);
    }

    @Override
    public void f$E() {
        jC jC2;
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            if (!(ma2 instanceof J)) {
                0.f$E(new lb((ma)ma2));
            }
        });
    }
}
