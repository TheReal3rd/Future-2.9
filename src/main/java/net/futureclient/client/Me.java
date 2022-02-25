package net.futureclient.client;

import net.futureclient.client.RF;

public class Me
extends RF {
    public Me() {
        Me me;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class ME extends RF {
    public ME() {
        ME mE;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Ie;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.CPacketPlayer;

public class mE
extends Ha<ve> {
    public final Ie f$d;

    public mE(Ie ie) {
        0.f$d = ie;
    }

    @Override
    public void f$E(ve ve2) {
        if (ve2.f$E() instanceof CPacketPlayer) {
            CPacketPlayer cPacketPlayer = (CPacketPlayer)ve2.f$E();
            if (Ie.f$E(0.f$d).contains(cPacketPlayer)) {
                Ie.f$E(0.f$d).remove(cPacketPlayer);
                return;
            }
            ve2.f$E(true);
        }
    }
}
package net.futureclient.client;

import java.util.UUID;
import net.futureclient.client.AD;
import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.ME;
import net.futureclient.client.VH;
import net.futureclient.client.sh;

public class me
extends Ha<ME> {
    public final AD f$d;

    public me(AD aD) {
        0.f$d = aD;
    }

    @Override
    public void f$E(ME mE) {
        for (UUID uUID : AD.f$E(0.f$d)) {
            if (AD.f$a().getConnection().getPlayerInfo(uUID) == null) continue;
            if (AD.f$E(0.f$d).f$E(1000L)) {
                sh.f$E(() -> {
                    String string = VH.f$B(uUID);
                    AD.f$E().addScheduledTask(() -> La.f$E().f$E(new StringBuilder().insert(0, string).append(" is no longer vanished.").toString()));
                });
                AD.f$E(0.f$d).f$E();
            }
            AD.f$E(0.f$d).remove(uUID);
        }
    }
}
