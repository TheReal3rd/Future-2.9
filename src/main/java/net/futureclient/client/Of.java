package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.eg;
import net.futureclient.client.jf;
import net.futureclient.client.kD;
import net.futureclient.client.kH;
import net.minecraft.network.play.server.SPacketChat;

public class Of
extends Ha<jf> {
    public final kD f$d;

    public Of(kD kD2) {
        0.f$d = kD2;
    }

    @Override
    public void f$E(jf jf2) {
        if (jf2.f$E() instanceof SPacketChat) {
            String string = ((SPacketChat)jf2.f$E()).getChatComponent().getUnformattedText();
            if (string.contains("has requested to teleport to you.") && (eg)kH.f$E().f$E().f$E().stream().filter(eg2 -> string.contains(eg2.f$E())).findFirst().orElse(null) != null && kD.f$E(0.f$d).f$E((long)(kD.f$E(0.f$d).f$E().floatValue() * 1000.0f))) {
                kD.f$E().player.sendChatMessage("/tpaccept");
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class OF
extends RF {
    public OF() {
        OF oF;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Me;
import net.futureclient.client.Ze;

public class of
extends Ha<Me> {
    public final Ze f$d;

    @Override
    public void f$E(Me me) {
        me.f$E(true);
    }

    public of(Ze ze) {
        0.f$d = ze;
    }
}
