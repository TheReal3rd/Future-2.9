package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class FriendCMD extends CommandBase {

    public FriendCMD() {
        super(new String[] {"Friend", "FriendAdd", "Friends", "Frend"});
    }

    @Override
    public String getInfo() {
        return "&e[add|del|list] [name]";
    }

    @Override
    public String execute(String[] stringArray) {//TODO work on this.
        block11: {
            block12: {
                if (stringArray.length == 3) {
                    if (stringArray[0].equalsIgnoreCase("add")) {
                        String string = stringArray[1];
                        String string2 = stringArray[2];
                        if (kH.f$E().f$E().f$E(string)) {
                            return "That user is already a friend.";
                        }
                        kH.f$E().f$E().f$a(new eg(string, string2));
                        return String.format("Added friend with alias %s.", string2);
                    }
                }
                if (stringArray.length != 2) break block11;
                if (stringArray[0].equalsIgnoreCase("add")) {
                    String string = stringArray[1];
                    if (kH.f$E().f$E().f$E(string)) {
                        return "That user is already a friend.";
                    }
                    String string3 = string;
                    kH.f$E().f$E().f$a(new eg(string3, string3));
                    return String.format("Added friend with alias %s.", string);
                }
                if (stringArray[0].equalsIgnoreCase("del")) break block12;
                if (stringArray[0].equalsIgnoreCase("remove")) break block12;
                if (!stringArray[0].equalsIgnoreCase("rem")) break block11;
            }
            String string = stringArray[1];
            if (!kH.f$E().f$E().f$E(string)) {
                return "That user is not a friend.";
            }
            eg eg3 = kH.f$E().f$E().f$E(string);
            String string4 = eg3.f$a();
            kH.f$E().f$E().f$E(eg3);
            return String.format("Removed friend with alias %s.", string4);
        }
        if (stringArray.length == 1) {
            if (stringArray[0].equalsIgnoreCase("list")) {
                StringJoiner stringJoiner = new StringJoiner(", ");
                kH.f$E().f$E().f$E().forEach(eg2 -> stringJoiner.add(eg2.f$E()));
                return String.format("Friends (%s): %s.", kH.f$E().f$E().f$E().size(), stringJoiner.toString());
            }
        }
        return null;
    }
}
/*
public final class RH
extends GA {
    @Override
    public String f$E() {
        return "&e[add|del|list] [name]";
    }

    @Override
    public String f$E(String[] stringArray) {
        block11: {
            block12: {
                if (stringArray.length == 3) {
                    if (stringArray[0].equalsIgnoreCase("add")) {
                        String string = stringArray[1];
                        String string2 = stringArray[2];
                        if (kH.f$E().f$E().f$E(string)) {
                            return "That user is already a friend.";
                        }
                        kH.f$E().f$E().f$a(new eg(string, string2));
                        return String.format("Added friend with alias %s.", string2);
                    }
                }
                if (stringArray.length != 2) break block11;
                if (stringArray[0].equalsIgnoreCase("add")) {
                    String string = stringArray[1];
                    if (kH.f$E().f$E().f$E(string)) {
                        return "That user is already a friend.";
                    }
                    String string3 = string;
                    kH.f$E().f$E().f$a(new eg(string3, string3));
                    return String.format("Added friend with alias %s.", string);
                }
                if (stringArray[0].equalsIgnoreCase("del")) break block12;
                if (stringArray[0].equalsIgnoreCase("remove")) break block12;
                if (!stringArray[0].equalsIgnoreCase("rem")) break block11;
            }
            String string = stringArray[1];
            if (!kH.f$E().f$E().f$E(string)) {
                return "That user is not a friend.";
            }
            eg eg3 = kH.f$E().f$E().f$E(string);
            String string4 = eg3.f$a();
            kH.f$E().f$E().f$E(eg3);
            return String.format("Removed friend with alias %s.", string4);
        }
        if (stringArray.length == 1) {
            if (stringArray[0].equalsIgnoreCase("list")) {
                StringJoiner stringJoiner = new StringJoiner(", ");
                kH.f$E().f$E().f$E().forEach(eg2 -> stringJoiner.add(eg2.f$E()));
                return String.format("Friends (%s): %s.", kH.f$E().f$E().f$E().size(), stringJoiner.toString());
            }
        }
        return null;
    }

    public RH() {
        RH rH;
        String[] stringArray = new String[4];
        stringArray[0] = "Friend";
        stringArray[1] = "FriendAdd";
        stringArray[2] = "Friends";
        stringArray[3] = "Frend";
        super(stringArray);
    }
}
 */