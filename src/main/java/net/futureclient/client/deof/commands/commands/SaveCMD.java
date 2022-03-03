package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class SaveCMD extends CommandBase {

    public SaveCMD() {
        super(new String[] {"Save", "Saveall", "SaveConfigs", "Asve"});
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String execute(String[] stringArray) {
        kH.f$E().f$E().f$E().forEach(ib -> ib.f$a(new Object[0]));//TODO Needs to be fixed.
        return "Saved config.";
    }
}
/*
public class XG
extends GA {
    @Override
    public String f$E() {
        return null;
    }

    @Override
    public String f$E(String[] stringArray) {
        kH.f$E().f$E().f$E().forEach(ib -> ib.f$a(new Object[0]));
        return "Saved config.";
    }

    public XG() {
        XG xG;
        String[] stringArray = new String[4];
        stringArray[0] = "Save";
        stringArray[1] = "Saveall";
        stringArray[2] = "SaveConfigs";
        stringArray[3] = "Asve";
        super(stringArray);
    }
}
 */
