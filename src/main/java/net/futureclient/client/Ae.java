package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.Ha;
import net.futureclient.client.Rf;
import net.futureclient.client.UF;
import net.futureclient.client.kH;

public class Ae
extends Ha<Rf> {
    public final UF f$d;

    public Ae(UF uF) {
        0.f$d = uF;
    }

    @Override
    public void f$E(Rf rf) {
        if (((Boolean)UF.f$A(0.f$d).f$E()).booleanValue() && UF.f$e(0.f$d).f$E(2500L)) {
            Ae ae;
            if (kH.f$E().f$E().f$E(rf.f$E()) && !rf.f$E().equals(UF.f$c().player.func_70005_c_())) {
                Ae ae2 = 0;
                ae = ae2;
                UF.f$E(ae2.f$d, new StringBuilder().insert(0, "My friend ").append(rf.f$E()).append(" just joined the server!").toString());
            } else {
                if (!rf.f$E().equals(UF.f$I().player.func_70005_c_()) && UF.f$j().getCurrentServerData() != null) {
                    UF.f$E(0.f$d, UF.f$M(0.f$d)[new Random().nextInt(UF.f$M(0.f$d).length)].replaceFirst("SERVERIP1D5A9E", UF.f$M().getCurrentServerData().serverIP) + rf.f$E() + ".");
                }
                ae = 0;
            }
            UF.f$e(ae.f$d).f$a();
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ye;
import net.minecraft.network.Packet;

public abstract class aE
extends Ye {
    public aE(Packet<?> packet) {
        super(packet);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ee;
import net.futureclient.client.Gf;
import net.futureclient.client.Ha;

public class ae
extends Ha<Ee> {
    public final Gf f$d;

    public ae(Gf gf) {
        0.f$d = gf;
    }

    @Override
    public void f$E(Ee ee) {
        if (((Boolean)Gf.f$E(0.f$d).f$E()).booleanValue() && ((Boolean)Gf.f$I(0.f$d).f$E()).booleanValue() && Gf.f$B(0.f$d).f$a(Gf.f$E(0.f$d).f$E().floatValue() * 1000.0f)) {
            ee.f$a(true);
        }
    }
}
