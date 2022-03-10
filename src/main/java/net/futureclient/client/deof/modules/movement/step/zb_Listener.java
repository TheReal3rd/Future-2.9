package net.futureclient.client.deof.modules.movement.step;

public class zb_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Bd;
import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.Y;
import net.futureclient.client.lc;
import net.futureclient.client.q;
import net.futureclient.client.sf;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

public class zb
extends Ha<sf> {
    public final lc f$d;

    public zb(lc lc2) {
        0.f$d = lc2;
    }

    @Override
    public void f$E(sf sf2) {
        if (((Bd)((Object)0.f$d.f$b.f$E())).equals((Object)Bd.f$g)) {
            return;
        }
        double d = sf2.f$E().minY - lc.f$E(0.f$d);
        if (lc.f$E(0.f$d) && d > (double)sf2.f$E()) {
            int n;
            double[] dArray = new double[]{0.42, d < 1.0 && d > 0.8 ? 0.753 : 0.75, 1.0, 1.16, 1.23, 1.2};
            if (!((Bd)((Object)0.f$d.f$b.f$E())).equals((Object)Bd.f$M) && d >= 2.0) {
                dArray = new double[]{0.42, 0.78, 0.63, 0.51, 0.9, 1.21, 1.45, 1.43};
            }
            lc.f$E(0.f$d, d > 1.0 ? 0.15f : 0.35f);
            boolean bl = 0.f$d.f$I.f$E() != false && CG.f$E();
            int n2 = n = 0;
            while (n2 < (d > 1.0 ? dArray.length : 2)) {
                lc.f$B().player.connection.sendPacket((Packet)new CPacketPlayer.Position(lc.f$h().player.field_70165_t, lc.f$A().player.field_70163_u + dArray[n], lc.f$K().player.field_70161_v, true));
                if (0.f$d.f$I.f$E().booleanValue() && !bl) {
                    zb zb2 = 0;
                    lc.f$a(zb2.f$d);
                    if (lc.f$E(zb2.f$d) >= 2) {
                        ((q)((Y)lc.f$e()).getTimer()).f$E(lc.f$E(0.f$d));
                        lc.f$E(0.f$d, 0);
                    }
                }
                n2 = ++n;
            }
            lc.f$E(0.f$d, false);
        }
    }
}
 */