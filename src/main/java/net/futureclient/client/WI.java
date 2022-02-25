package net.futureclient.client;

import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.gui.ServerListEntryLanDetected;
import net.minecraft.client.gui.ServerListEntryNormal;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.network.LanServerInfo;

public class WI {
    public static ServerData f$d;
    public static int f$g;

    public WI() {
        WI wI;
    }

    public static void f$E(ServerData serverData) {
        f$d = serverData;
    }

    public static void f$E(GuiListExtended.IGuiListEntry iGuiListEntry) {
        if (iGuiListEntry instanceof ServerListEntryNormal) {
            f$d = ((ServerListEntryNormal)iGuiListEntry).getServerData();
            return;
        }
        if (iGuiListEntry instanceof ServerListEntryLanDetected) {
            LanServerInfo lanServerInfo = ((ServerListEntryLanDetected)iGuiListEntry).getServerData();
            f$d = new ServerData("LAN-Server", lanServerInfo.getServerIpPort(), true);
        }
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }
}
