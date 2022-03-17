package net.futureclient.client;

public enum JF {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JF() {
        JF jF;
    }
}
package net.futureclient.client;

import net.futureclient.client.IE;
import net.minecraft.network.Packet;

public final class jf extends IE {
    public jf(Packet<?> packet) {
        super(packet);
    }
}
package net.futureclient.client;

import net.futureclient.client.HE;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.Xf;
import net.futureclient.client.kH;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;

public class jF
extends Ha<Pf> {
    public final Xf f$d;

    public jF(Xf xf) {
        0.f$d = xf;
    }

    @Override
    public void f$E(Pf pf) {
        if (Xf.f$A((Xf)0.f$d).player.field_70122_E) {
            jF jF2;
            HE hE = (HE)kH.f$E().f$E().f$E(HE.class);
            Xf.f$B((Xf)0.f$d).player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(Xf.f$K((Xf)0.f$d).player.field_70177_z, -90.0f, true));
            if (hE != null && hE.f$I.f$E().booleanValue()) {
                jF jF3 = 0;
                jF2 = jF3;
                Xf.f$e((Xf)jF3.f$d).player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
            } else {
                jF jF4 = 0;
                jF2 = jF4;
                Xf.f$a((Xf)jF4.f$d).player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND));
            }
            Xf.f$E((Xf)jF2.f$d).player.func_70664_aZ();
        }
        kH.f$E().f$E().f$E(0);
    }
}
