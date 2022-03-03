package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.ServerData;

public class ConnectCMD extends CommandBase {

    public ConnectCMD() {
        super(new String[] {"Connect", "c"});
    }

    @Override
    public String getInfo() {
        return "&e[ip]";
    }

    @Override
    public String execute(String[] args) {
        if (((String[])args).length == 1) {
            final ServerData serverData = new ServerData("", args[0], false);
            mc.world.sendQuittingDisconnectingPacket();
            mc.loadWorld(null);
            mc.displayGuiScreen(new GuiConnecting((GuiScreen)new GuiMultiplayer(new GuiMainMenu()), mc, serverData));
            return "Connecting...";
        }
        return null;
    }
}
/*
public class ti
extends GA {
    @Override
    public String f$E() {
        return "&e[ip]";
    }

    @Override
    public String f$E(String[] serverData) {
        if (((String[])serverData).length == 1) {
            serverData = new ServerData("", serverData[0], false);
            ti ti2 = 0;
            ti2.f$d.world.sendQuittingDisconnectingPacket();
            ti2.f$d.loadWorld(null);
            ti2.f$d.displayGuiScreen((GuiScreen)new GuiConnecting((GuiScreen)new GuiMultiplayer((GuiScreen)new GuiMainMenu()), 0.f$d, serverData));
            return "Connecting...";
        }
        return null;
    }

    public ti() {
        ti ti2;
        String[] stringArray = new String[2];
        stringArray[0] = "Connect";
        stringArray[1] = "c";
        super(stringArray);
    }
}
 */
