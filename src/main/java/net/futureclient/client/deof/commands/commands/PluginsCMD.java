package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketTabComplete;

import java.util.ArrayList;
import java.util.List;

public class PluginsCMD extends CommandBase {
    private List<String> f$d;

    public PluginsCMD() {
        super(new String[] {"Plugins", "PluginDiscover", "Discover", "plugin", "pl"});
        this.f$d = new ArrayList<String>();
    }

    @Override
    public String execute(String[] stringArray) {//TODO complete this.
        0.f$d.player.connection.sendPacket((Packet)new CPacketTabComplete("/", null, false));
        kH.f$E().f$E().f$a(new Xi(0));
        return "Discovering plugins, please wait...";
    }

    @Override
    public String getInfo() {
        return null;
    }

    public static List f$E(wh wh2) {
        return wh2.f$d;
    }

    public static List f$E(wh wh2, List list) {
        wh2.f$d = list;
        return wh2.f$d;
    }
}
/*
public class wh
extends GA {
    private List<String> f$d;

    @Override
    public String f$E(String[] stringArray) {
        0.f$d.player.connection.sendPacket((Packet)new CPacketTabComplete("/", null, false));
        kH.f$E().f$E().f$a(new Xi(0));
        return "Discovering plugins, please wait...";
    }

    @Override
    public String f$E() {
        return null;
    }

    public wh() {
        wh wh2;
        String[] stringArray = new String[5];
        stringArray[0] = "Plugins";
        stringArray[1] = "PluginDiscover";
        stringArray[2] = "Discover";
        stringArray[3] = "plugin";
        stringArray[4] = "pl";
        super(stringArray);
        wh wh3 = wh2;
        wh3.f$d = new ArrayList<String>();
    }

    public static List f$E(wh wh2) {
        return wh2.f$d;
    }

    public static List f$E(wh wh2, List list) {
        wh2.f$d = list;
        return wh2.f$d;
    }
}
 */