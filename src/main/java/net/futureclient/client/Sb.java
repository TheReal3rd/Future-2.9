package net.futureclient.client;

import net.futureclient.client.DA;
import net.futureclient.client.Ha;
import net.futureclient.client.SD;

public class Sb
extends Ha<SD> {
    public final DA f$d;

    public Sb(DA dA) {
        0.f$d = dA;
    }

    @Override
    public void f$E(SD sD) {
        sD.f$E(0.f$d.f$g.f$E());
    }
}
package net.futureclient.client;

import java.util.HashMap;
import java.util.Map;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.hc;
import net.futureclient.client.mC;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class SB
extends Ba {
    private final Map<EntityPlayer, float[][]> f$d;

    public SB() {
        SB sB;
        String[] stringArray = new String[6];
        stringArray[0] = "Skeleton";
        stringArray[1] = "SkeletonESP";
        stringArray[2] = "Skelly";
        stringArray[3] = "Skele";
        stringArray[4] = "Skeleesp";
        stringArray[5] = "Skeleboy";
        super("Skeleton", stringArray, true, -2368549, JD.f$i);
        SB sB2 = sB;
        sB.f$d = new HashMap<EntityPlayer, float[][]>();
        sB.f$E(new hc(sB), new mC(sB));
    }

    public static Map f$E(SB sB) {
        return sB.f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.PC;
import net.futureclient.client.mb;

public class sB {
    public static final int[] f$g;
    public static final int[] f$d;

    static {
        f$d = new int[PC.values().length];
        try {
            sB.f$d[PC.f$i.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sB.f$d[PC.f$M.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sB.f$d[PC.f$g.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[mb.values().length];
        try {
            sB.f$g[mb.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sB.f$g[mb.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
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
