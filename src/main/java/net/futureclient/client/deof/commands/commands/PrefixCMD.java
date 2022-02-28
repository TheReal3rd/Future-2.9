package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class PrefixCMD extends CommandBase {

    public PrefixCMD() {
        super(new String[] {"Prefix", "Pref"});
    }

    @Override
    public String execute(String[] object) {//TODO deobf this
        if (((String[])object).length == 1) {
            if ((object = object[0]).equalsIgnoreCase(kH.f$E().f$E().f$E())) {
                return "That is already your prefix.";
            }
            kH.f$E().f$E().f$E((String)object);
            return String.format("Command prefix set to %s.", object);
        }
        return null;
    }

    @Override
    public String getInfo() {
        return "&e[char]";
    }
}
/*
public class lh
extends GA {
    @Override
    public String f$E() {
        return "&e[char]";
    }

    @Override
    public String f$E(String[] object) {
        if (((String[])object).length == 1) {
            if ((object = object[0]).equalsIgnoreCase(kH.f$E().f$E().f$E())) {
                return "That is already your prefix.";
            }
            kH.f$E().f$E().f$E((String)object);
            return String.format("Command prefix set to %s.", object);
        }
        return null;
    }

    public lh() {
        lh lh2;
        String[] stringArray = new String[2];
        stringArray[0] = "Prefix";
        stringArray[1] = "Pref";
        super(stringArray);
    }
}
 */
