package net.futureclient.client.deof.modules.miscellaneous.translate;

import net.futureclient.client.RA;
import net.futureclient.client.dF;
import net.futureclient.client.ji;

public class CB_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Oi;
import net.futureclient.client.RA;
import net.futureclient.client.dF;
import net.futureclient.client.ji;
import net.futureclient.client.kH;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;

public class CB
extends Ha<dF> {
    public final RA f$d;

    public CB(RA rA) {
        0.f$d = rA;
    }

    @Override
    public void f$E(dF dF2) {
        if (RA.f$E(0.f$d).f$E() == null) {
            return;
        }
        if (RA.f$E(0.f$d).f$E() != ji.f$Ya) {
            int n;
            ji ji2 = (ji)((Object)RA.f$E(0.f$d).f$E());
            Object object = ji.values();
            int n2 = ((ji[])object).length;
            int n3 = n = 0;
            while (n3 < n2) {
                ji ji3 = object[n];
                if (ji3.name().replaceAll("_", " ").equalsIgnoreCase(((ji)((Object)RA.f$E(0.f$d).f$E())).toString())) {
                    ji2 = ji3;
                }
                n3 = ++n;
            }
            object = ji2;
            if (object != null && !dF2.f$E()) {
                if (!dF2.f$E().startsWith("/") && !dF2.f$E().startsWith(kH.f$E().f$E().f$E())) {
                    dF2.f$E(true);
                    new Thread(() -> CB.f$E(dF2, (ji)((Object)object))).start();
                }
            }
        }
    }

private static void f$E(dF dF2, ji ji2) {
    try {
        CPacketChatMessage cPacketChatMessage;
        ji ji3;
        ji ji4;
        NetHandlerPlayClient netHandlerPlayClient = RA.f$E().getConnection();
        String string = dF2.f$E();
        if (ji2 == ji.f$Pa) {
            ji4 = ji.f$Ya;
            ji3 = ji2;
        } else {
            ji4 = ji.f$Pa;
            ji3 = ji2;
        }
        cPacketChatMessage(Oi.f$E((String)string, (ji)ji4, (ji)ji3));
        netHandlerPlayClient.sendPacket((Packet)cPacketChatMessage);
        return;
    }
    catch (Exception exception) {
        exception.printStackTrace();
        return;
    }
}
}
 */