package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class ReloadCMD extends CommandBase {

    public ReloadCMD() {
        super(new String[]{"Reload", "Load"});
    }

    @Override
    public String execute(String[] stringArray) {
        kH.f$E().f$E().f$E().forEach(ib -> ib.f$E(new Object[0]));
        return "Reloaded config.";
    }

    @Override
    public String getInfo() {
        return null;
    }
}
/*
public class sI
extends GA {
    @Override
    public String f$E(String[] stringArray) {
        kH.f$E().f$E().f$E().forEach(ib -> ib.f$E(new Object[0]));
        return "Reloaded config.";
    }

    @Override
    public String f$E() {
        return null;
    }

    public sI() {
        sI sI2;
        String[] stringArray = new String[2];
        stringArray[0] = "Reload";
        stringArray[1] = "Load";
        super(stringArray);
    }
}
 */