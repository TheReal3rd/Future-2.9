package net.futureclient.client.deof.modules.miscellaneous.notifications;

import net.futureclient.client.DC;
import net.futureclient.client.gC;
import net.futureclient.client.jf;
import net.futureclient.client.kH;

public class sb_Listener {
}
/*
package net.futureclient.client;

import java.awt.TrayIcon;
import net.futureclient.client.DC;
import net.futureclient.client.Ha;
import net.futureclient.client.gC;
import net.futureclient.client.jf;
import net.futureclient.client.kH;
import net.minecraft.network.play.server.SPacketChat;
import org.lwjgl.opengl.Display;

public class sb
extends Ha<jf> {
    public final DC f$d;

@Override
public void f$E(jf jf2) {
    sb sb2;
    String string;
    block5: {
        block4: {
            block3: {
                if (!(jf2.f$E() instanceof SPacketChat) || Display.isActive()) return;
                string = ((SPacketChat)jf2.f$E()).getChatComponent().getFormattedText();
                if (!0.f$d.f$H.f$E().booleanValue()) break block3;
                if (string.contains("\u00a7d")) break block3;
                if (!string.contains(String.format(" %s ", DC.f$E().player.func_70005_c_()))) break block3;
                if (DC.f$B() || !DC.f$e(0.f$d).f$E(10000L)) break block4;
                kH.f$E().f$E().f$g.displayMessage("Name called in chat", "Your name has been written in chat.", TrayIcon.MessageType.NONE);
                if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                DC.f$B(true);
                sb2 = 0;
                break block5;
            }
            DC.f$B(false);
        }
        sb2 = 0;
    }
    if (sb2.f$d.f$E.f$E().booleanValue()) {
        if (string.contains("\u00a7d")) {
            if (string.contains(" whispers: ")) {
                if (DC.f$e() || !DC.f$a(0.f$d).f$E(10000L)) return;
                kH.f$E().f$E().f$g.displayMessage("Private message received", "You have received a private message.", TrayIcon.MessageType.NONE);
                if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) return;
                DC.f$K(true);
                return;
            }
        }
    }
    DC.f$K(false);
}

    public sb(DC dC) {
        0.f$d = dC;
    }
}
 */