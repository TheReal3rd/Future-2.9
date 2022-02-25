package net.futureclient.client;

public enum Aa {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Aa() {
        Aa aa;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.ic;
import net.futureclient.client.jf;
import net.futureclient.client.kH;
import net.futureclient.client.q;
import net.futureclient.client.uA;
import net.minecraft.network.play.server.SPacketPlayerPosLook;

public class AA
extends Ha<jf> {
    public final uA f$d;

    public AA(uA uA2) {
        0.f$d = uA2;
    }

    @Override
    public void f$E(jf jf2) {
        if (jf2.f$E() instanceof SPacketPlayerPosLook) {
            ic ic2 = (ic)kH.f$E().f$E().f$E(ic.class);
            if (ic2 != null && !ic2.f$E()) {
                ((q)((Y)uA.f$E()).getTimer()).f$E(1.0f);
            }
            AA aA = 0;
            uA.f$E(aA.f$d).f$a();
            uA.f$a(aA.f$d, Pg.f$a());
            uA.f$E(0.f$d, 0);
            AA aA2 = 0;
            uA.f$E(aA2.f$d, 0.0);
            uA.f$e(aA2.f$d, 4);
            uA.f$B(0.f$d, 1);
            uA.f$a(0.f$d, 1);
            uA.f$K(0.f$d, 2);
            uA.f$A(0.f$d, 4);
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.SA;

public class aA
extends Ha<Pf> {
    public final SA f$d;

    public aA(SA sA) {
        0.f$d = sA;
    }

    @Override
    public void f$E(Pf pf) {
        SA.f$E().player.field_70140_Q = 4.0f;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ca;
import net.futureclient.client.Ha;
import net.futureclient.client.iD;

public class aa
extends Ha<iD> {
    public final Ca f$d;

    @Override
    public void f$E(iD iD2) {
        iD2.f$E((Boolean)Ca.f$E(0.f$d).f$E());
    }

    public aa(Ca ca) {
        0.f$d = ca;
    }
}
