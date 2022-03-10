package net.futureclient.client.deof.modules.render.nameProtect;

public class YC_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.EB;
import net.futureclient.client.Ha;
import net.futureclient.client.dF;
import net.futureclient.client.kH;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;

public class YC
extends Ha<dF> {
    public final EB f$d;

    @Override
    public void f$E(dF dF2) {
        String[] stringArray = new String[]{dF2.f$E()};
        if (!stringArray[0].startsWith(kH.f$E().f$E().f$E()) && !dF2.f$E()) {
            dF2.f$E(true);
            kH.f$E().f$E().f$E().forEach(eg2 -> {
                if (stringArray[0].contains(new StringBuilder().insert(0, "-").append(eg2.f$a()).toString())) {
                    stringArray[0] = stringArray[0].replaceAll(new StringBuilder().insert(0, "-").append(eg2.f$a()).toString(), eg2.f$E());
                }
            });
            EB.f$E().getConnection().sendPacket((Packet)new CPacketChatMessage(stringArray[0]));
        }
    }

    public YC(EB eB) {
        0.f$d = eB;
    }
}
 */