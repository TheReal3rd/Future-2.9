package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class FAddCMD extends CommandBase {

    public FAddCMD() {
        super(new String[] {"Add", "A"});
    }

    @Override
    public String getInfo() {
        return "&e[username] [alias]";
    }

    @Override
    public String execute(String[] stringArray) {//TODO work on this.
        if (stringArray.length == 2) {
            String string = stringArray[0];
            String string2 = stringArray[1];
            if (kH.f$E().f$E().f$E(string)) {
                return "That user is already a friend.";
            }
            kH.f$E().f$E().f$a(new eg(string, string2));
            return String.format("Added friend with alias %s.", string2);
        }
        if (stringArray.length == 1) {
            String string = stringArray[0];
            if (kH.f$E().f$E().f$E(string)) {
                return "That user is already a friend.";
            }
            String string3 = string;
            kH.f$E().f$E().f$a(new eg(string3, string3));
            return String.format("Added friend with alias %s.", string);
        }
        return null;
    }
}
/*
public final class eh
extends GA {
    @Override
    public String f$E() {
        return "&e[username] [alias]";
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 2) {
            String string = stringArray[0];
            String string2 = stringArray[1];
            if (kH.f$E().f$E().f$E(string)) {
                return "That user is already a friend.";
            }
            kH.f$E().f$E().f$a(new eg(string, string2));
            return String.format("Added friend with alias %s.", string2);
        }
        if (stringArray.length == 1) {
            String string = stringArray[0];
            if (kH.f$E().f$E().f$E(string)) {
                return "That user is already a friend.";
            }
            String string3 = string;
            kH.f$E().f$E().f$a(new eg(string3, string3));
            return String.format("Added friend with alias %s.", string);
        }
        return null;
    }

    public eh() {
        eh eh2;
        String[] stringArray = new String[2];
        stringArray[0] = "Add";
        stringArray[1] = "A";
        super(stringArray);
    }
}
 */
