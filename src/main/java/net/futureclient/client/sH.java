package net.futureclient.client;

import net.futureclient.client.GA;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class sH
extends GA {
    @Override
    public String f$E() {
        return null;
    }

    public sH() {
        sH sH2;
        String[] stringArray = new String[3];
        stringArray[0] = "Disconnect";
        stringArray[1] = "disc";
        stringArray[2] = "dc";
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        if (0.f$d.isSingleplayer()) {
            return "You are in single player.";
        }
        if (0.f$d.getConnection() == null) {
            0.f$d.world.sendQuittingDisconnectingPacket();
        } else {
            0.f$d.getConnection().getNetworkManager().closeChannel((ITextComponent)new TextComponentString("Disconnected using Disconnect command."));
        }
        return "Disconnecting...";
    }
}
package net.futureclient.client;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public final class sh {
    private static final ThreadPoolExecutor f$d;

    public sh() {
        sh sh2;
    }

    static {
        f$d = (ThreadPoolExecutor)Executors.newFixedThreadPool(1);
    }

    public static void f$E(Runnable runnable) {
        f$d.execute(runnable);
    }
}
