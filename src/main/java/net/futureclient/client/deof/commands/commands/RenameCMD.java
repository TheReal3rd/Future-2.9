package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class RenameCMD extends CommandBase {
    public RenameCMD() {
        super(new String[] {"Rename", "ModuleName", "ModName"});
    }

    @Override
    public String getInfo() {
        return "&e[module] [name]";
    }

    @Override
    public String execute(String[] stringArray) {
        if (stringArray.length == 2) {
            if (kH.f$E().f$E().f$E(stringArray[0]) != null) {
                kH.f$E().f$E().f$E(stringArray[0]).f$a(stringArray[1]);
                return new StringBuilder().insert(0, stringArray[0]).append(" has been renamed to ").append(stringArray[1]).append(".").toString();
            }
            return new StringBuilder().insert(0, "Module ").append(stringArray[0]).append(" does not exist.").toString();
        }
        return null;
    }
}

/*
public class TG
extends GA {
    @Override
    public String f$E() {
        return "&e[module] [name]";
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 2) {
            if (kH.f$E().f$E().f$E(stringArray[0]) != null) {
                kH.f$E().f$E().f$E(stringArray[0]).f$a(stringArray[1]);
                return new StringBuilder().insert(0, stringArray[0]).append(" has been renamed to ").append(stringArray[1]).append(".").toString();
            }
            return new StringBuilder().insert(0, "Module ").append(stringArray[0]).append(" does not exist.").toString();
        }
        return null;
    }

    public TG() {
        TG tG;
        String[] stringArray = new String[3];
        stringArray[0] = "Rename";
        stringArray[1] = "ModuleName";
        stringArray[2] = "ModName";
        super(stringArray);
    }
}
 */
