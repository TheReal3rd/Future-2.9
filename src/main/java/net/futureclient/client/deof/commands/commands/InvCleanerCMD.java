package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.Th;
import net.futureclient.client.deof.commands.manager.CommandBase;
import net.futureclient.client.hb;
import net.futureclient.client.kH;

public class InvCleanerCMD extends CommandBase {

    public InvCleanerCMD() {
        super(new String[] {"InvCleaner", "InvClean", "InventoryClean", "InventoryCleaner", "InventoryCleanerList", "IC"});
    }

    @Override
    public String execute(String[] stringArray) {//TODO work on this.
        String string;
        String string2;
        hb hb2;
        block27: {
            block26: {
                int n;
                block24: {
                    int n2;
                    block25: {
                        hb2 = (hb) kH.f$E().f$E().f$E(hb.class);
                        if (hb2 == null) {
                            return "Error.";
                        }
                        if (stringArray.length != 1) break block24;
                        String string3 = stringArray[0].toLowerCase();
                        int n3 = -1;
                        switch (string3.hashCode()) {
                            case 3322014: {
                                if (!string3.equals("list")) break;
                                n2 = n3 = 0;
                                break block25;
                            }
                            case 94746189: {
                                if (!string3.equals("clear")) break;
                                n3 = 1;
                            }
                        }
                        n2 = n3;
                    }
                    switch (n2) {
                        case 0: {
                            StringJoiner stringJoiner = new StringJoiner(", ");
                            hb2.f$d.forEach(stringJoiner::add);
                            return String.format("Items [%s%s%s]: %s.", TextFormatting.WHITE, hb2.f$d.size(), TextFormatting.GRAY, stringJoiner.toString());
                        }
                        case 1: {
                            hb2.f$d.clear();
                            return "Cleared items.";
                        }
                    }
                    return null;
                }
                if (stringArray.length < 2) {
                    return null;
                }
                string2 = stringArray[0];
                StringBuilder stringBuilder = new StringBuilder();
                int n4 = n = 1;
                while (n4 < stringArray.length) {
                    stringBuilder.append(stringArray[n]);
                    stringBuilder.append(" ");
                    n4 = ++n;
                }
                string = stringArray.length == 2 ? stringArray[1] : stringBuilder.toString().trim();
                if (string2.equalsIgnoreCase("add")) break block26;
                if (!string2.equalsIgnoreCase("a")) break block27;
            }
            if (string.equalsIgnoreCase("current")) {
                if (0.f$d.player.field_71071_by.getCurrentItem().isEmpty()) {
                    return "You are not holding an item.";
                }
                if (hb2.f$d.contains(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase())) {
                    return new StringBuilder().insert(0, 0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase()).append("\u00a77 is already added to the list.").toString();
                }
                hb2.f$d.add(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase());
                return new StringBuilder().insert(0, "Added ").append(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase()).append("\u00a77 to the list.").toString();
            }
            if (hb2.f$d.contains(string.toLowerCase())) {
                return new StringBuilder().insert(0, string.toLowerCase()).append(" is already added to the list.").toString();
            }
            hb2.f$d.add(string.toLowerCase());
            return new StringBuilder().insert(0, "Added ").append(string.toLowerCase()).append(" to the list.").toString();
        }
        if (!string2.equalsIgnoreCase("del")) {
            if (!string2.equalsIgnoreCase("remove")) {
                return "That item doesn't exist. Proper usage: ic del <item> | ic del current (Removes the current item you are holding.)";
            }
        }
        if (string.equalsIgnoreCase("current")) {
            if (0.f$d.player.field_71071_by.getCurrentItem().isEmpty()) {
                return "You are not holding an item.";
            }
            if (!hb2.f$d.contains(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase())) {
                return new StringBuilder().insert(0, "The list does not contain ").append(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName()).append("\u00a77.").toString();
            }
            hb2.f$d.remove(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase());
            return new StringBuilder().insert(0, "Removed ").append(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase()).append("\u00a77 from the list.").toString();
        }
        if (!hb2.f$d.contains(string.toLowerCase())) {
            return new StringBuilder().insert(0, "The list does not contain ").append(string.toLowerCase()).append(".").toString();
        }
        hb2.f$d.remove(string.toLowerCase());
        return new StringBuilder().insert(0, "Removed ").append(string.toLowerCase()).append(" from the list.").toString();
    }

    @Override
    public String getInfo() {
        return "&e[list|clear] | [add|del] [item|current]";
    }
}
/*
public class Th
extends GA {

@Override
public String f$E(String[] stringArray) {
    String string;
    String string2;
    hb hb2;
    block27: {
        block26: {
            int n;
            block24: {
                int n2;
                block25: {
                    hb2 = (hb) kH.f$E().f$E().f$E(hb.class);
                    if (hb2 == null) {
                        return "Error.";
                    }
                    if (stringArray.length != 1) break block24;
                    String string3 = stringArray[0].toLowerCase();
                    int n3 = -1;
                    switch (string3.hashCode()) {
                        case 3322014: {
                            if (!string3.equals("list")) break;
                            n2 = n3 = 0;
                            break block25;
                        }
                        case 94746189: {
                            if (!string3.equals("clear")) break;
                            n3 = 1;
                        }
                    }
                    n2 = n3;
                }
                switch (n2) {
                    case 0: {
                        StringJoiner stringJoiner = new StringJoiner(", ");
                        hb2.f$d.forEach(stringJoiner::add);
                        return String.format("Items [%s%s%s]: %s.", TextFormatting.WHITE, hb2.f$d.size(), TextFormatting.GRAY, stringJoiner.toString());
                    }
                    case 1: {
                        hb2.f$d.clear();
                        return "Cleared items.";
                    }
                }
                return null;
            }
            if (stringArray.length < 2) {
                return null;
            }
            string2 = stringArray[0];
            StringBuilder stringBuilder = new StringBuilder();
            int n4 = n = 1;
            while (n4 < stringArray.length) {
                stringBuilder.append(stringArray[n]);
                stringBuilder.append(" ");
                n4 = ++n;
            }
            string = stringArray.length == 2 ? stringArray[1] : stringBuilder.toString().trim();
            if (string2.equalsIgnoreCase("add")) break block26;
            if (!string2.equalsIgnoreCase("a")) break block27;
        }
        if (string.equalsIgnoreCase("current")) {
            if (0.f$d.player.field_71071_by.getCurrentItem().isEmpty()) {
                return "You are not holding an item.";
            }
            if (hb2.f$d.contains(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase())) {
                return new StringBuilder().insert(0, 0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase()).append("\u00a77 is already added to the list.").toString();
            }
            hb2.f$d.add(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase());
            return new StringBuilder().insert(0, "Added ").append(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase()).append("\u00a77 to the list.").toString();
        }
        if (hb2.f$d.contains(string.toLowerCase())) {
            return new StringBuilder().insert(0, string.toLowerCase()).append(" is already added to the list.").toString();
        }
        hb2.f$d.add(string.toLowerCase());
        return new StringBuilder().insert(0, "Added ").append(string.toLowerCase()).append(" to the list.").toString();
    }
    if (!string2.equalsIgnoreCase("del")) {
        if (!string2.equalsIgnoreCase("remove")) {
            return "That item doesn't exist. Proper usage: ic del <item> | ic del current (Removes the current item you are holding.)";
        }
    }
    if (string.equalsIgnoreCase("current")) {
        if (0.f$d.player.field_71071_by.getCurrentItem().isEmpty()) {
            return "You are not holding an item.";
        }
        if (!hb2.f$d.contains(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase())) {
            return new StringBuilder().insert(0, "The list does not contain ").append(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName()).append("\u00a77.").toString();
        }
        hb2.f$d.remove(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase());
        return new StringBuilder().insert(0, "Removed ").append(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase()).append("\u00a77 from the list.").toString();
    }
    if (!hb2.f$d.contains(string.toLowerCase())) {
        return new StringBuilder().insert(0, "The list does not contain ").append(string.toLowerCase()).append(".").toString();
    }
    hb2.f$d.remove(string.toLowerCase());
    return new StringBuilder().insert(0, "Removed ").append(string.toLowerCase()).append(" from the list.").toString();
}

    @Override
    public String f$E() {
        return "&e[list|clear] | [add|del] [item|current]";
    }

    public Th() {
        Th th;
        String[] stringArray = new String[6];
        stringArray[0] = "InvCleaner";
        stringArray[1] = "InvClean";
        stringArray[2] = "InventoryClean";
        stringArray[3] = "InventoryCleaner";
        stringArray[4] = "InventoryCleanerList";
        stringArray[5] = "IC";
        super(stringArray);
    }
}
 */