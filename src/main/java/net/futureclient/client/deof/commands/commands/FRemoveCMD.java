package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class FRemoveCMD extends CommandBase {
    public FRemoveCMD() {
        super(new String[] {"Remove", "rem"});
    }

    @Override
    public String execute(String[] stringArray) {//TODO work on this.
        if (stringArray.length == 1) {
            Object object = stringArray[0];
            if (!kH.f$E().f$E().f$E((String)object)) {
                return "That user is not a friend.";
            }
            object = kH.f$E().f$E().f$E((String)object);
            String string = ((eg)object).f$a();
            kH.f$E().f$E().f$E(object);
            return String.format("Removed friend with alias %s.", string);
        }
        return null;
    }

    @Override
    public String getInfo() {
        return "&e[username|alias]";
    }
}

/*
public final class Xg
extends GA {
    public Xg() {
        Xg xg;
        String[] stringArray = new String[2];
        stringArray[0] = "Remove";
        stringArray[1] = "rem";
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 1) {
            Object object = stringArray[0];
            if (!kH.f$E().f$E().f$E((String)object)) {
                return "That user is not a friend.";
            }
            object = kH.f$E().f$E().f$E((String)object);
            String string = ((eg)object).f$a();
            kH.f$E().f$E().f$E(object);
            return String.format("Removed friend with alias %s.", string);
        }
        return null;
    }

    @Override
    public String f$E() {
        return "&e[username|alias]";
    }
}
 */
