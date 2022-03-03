package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class OpenFolderCMD extends CommandBase {

    public OpenFolderCMD() {
        super(new String[] {"OpenFolder", "OpenTheFolder", "folder", "FolderOpen", "OF", "FolderOpener"});
    }

    @Override
    public String execute(String[] stringArray2) {
        try {
            Desktop.getDesktop().open(new File(kH.f$E().f$E().toURI()));//TODO simple fix ill do later.
        }
        catch (IOException stringArray2) {
            return "Failed to open folder.";
        }
        return "Opened the Future folder.";
    }


    @Override
    public String getInfo() {
        return null;
    }
}
/*
public class Eh
extends GA {
    @Override
    public String f$E(String[] stringArray2) {
        try {
            Desktop.getDesktop().open(new File(kH.f$E().f$E().toURI()));
        }
        catch (IOException stringArray2) {
            return "Failed to open folder.";
        }
        return "Opened the Future folder.";
    }

    public Eh() {
        Eh eh;
        String[] stringArray = new String[6];
        stringArray[0] = "OpenFolder";
        stringArray[1] = "OpenTheFolder";
        stringArray[2] = "folder";
        stringArray[3] = "FolderOpen";
        stringArray[4] = "OF";
        stringArray[5] = "FolderOpener";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return null;
    }
}
 */