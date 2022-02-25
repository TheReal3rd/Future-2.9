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

public abstract class oF {
    public oF() {
        oF oF2;
    }

    public abstract void f$E();

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 5 << 4 ^ 2 << 1;
        int cfr_ignored_0 = 5 << 4 ^ 1 << 1;
        int n5 = 2 << 3 ^ 2;
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
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
