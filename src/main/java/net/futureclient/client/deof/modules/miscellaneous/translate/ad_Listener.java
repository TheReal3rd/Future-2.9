package net.futureclient.client.deof.modules.miscellaneous.translate;

public class ad_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.Oi;
import net.futureclient.client.RA;
import net.futureclient.client.jf;
import net.futureclient.client.ji;
import net.futureclient.client.vG;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.util.text.TextFormatting;

public class ad
extends Ha<jf> {
    public final RA f$d;

    public ad(RA rA) {
        0.f$d = rA;
    }

    @Override
    public void f$E(jf jf2) {
        if (jf2.f$E() instanceof SPacketChat) {
            SPacketChat sPacketChat = (SPacketChat)jf2.f$E();
            new Thread(() -> {
                String string;
                block5: {
                    string = TextFormatting.getTextWithoutFormattingCodes((String)sPacketChat.getChatComponent().getUnformattedText());
                    if (string != null && string.isEmpty()) break block5;
                    return;
                }
                try {
                    ji ji2 = vG.f$E((String)string);
                    if (ji2 != ji.f$Pa && ji2 != ji.f$Ya) {
                        String string2 = Oi.f$E((String)string, (ji)ji2, (ji)ji.f$Pa);
                        if (RA.f$E(0.f$d).f$E(string2, sPacketChat.getChatComponent().getUnformattedText()) < 0.99) {
                            string2 = string2.replace("&lt;", "<");
                            string2 = string2.replace("&gt;", ">");
                            La.f$E().f$E(new StringBuilder().insert(0, "(").append(Character.toUpperCase(ji2.name().charAt(0))).append(ji2.name().substring(1).toLowerCase()).append(") ").append(TextFormatting.GRAY).append(string2).toString(), false);
                            return;
                        }
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }).start();
        }
    }
}
 */