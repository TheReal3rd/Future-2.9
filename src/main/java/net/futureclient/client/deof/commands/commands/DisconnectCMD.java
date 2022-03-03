package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class DisconnectCMD extends CommandBase {

    public DisconnectCMD() {
        super(new String[] {"Disconnect", "disc", "dc"});
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String execute(String[] stringArray) {
        if (mc.isSingleplayer()) {
            return "You are in single player.";
        }
        if (mc.getConnection() == null) {
            mc.world.sendQuittingDisconnectingPacket();
        } else {
            mc.getConnection().getNetworkManager().closeChannel((ITextComponent)new TextComponentString("Disconnected using Disconnect command."));
        }
        return "Disconnecting...";
    }
}
/*
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
 */