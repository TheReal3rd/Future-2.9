package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class MacroCMD extends CommandBase {
    public MacroCMD() {
        super(new String[] {"Macro", "Macros", "BindMacro", "MacroBind", "mb"});
    }

    @Override
    public String getInfo() {
        return "&e[list|clear] | [add|del] [key] [command]";
    }

    @Override
    public String execute(String[] stringArray) {
        block9: {
            block10: {
                if (stringArray.length >= 3) {
                    if (stringArray[0].equalsIgnoreCase("add")) {
                        int n;
                        String string = stringArray[1].toUpperCase();
                        StringBuilder stringBuilder = new StringBuilder();
                        int n2 = n = 2;
                        while (n2 < stringArray.length) {
                            stringBuilder.append(stringArray[n]);
                            stringBuilder.append(" ");
                            n2 = ++n;
                        }
                        String string2 = stringBuilder.toString().trim();
                        kH.f$E().f$E().f$a(new lg(Keyboard.getKeyIndex((String)string), string2));
                        return String.format("Added a macro with the keybind %s.", Keyboard.getKeyName((int)Keyboard.getKeyIndex((String)string)));
                    }
                }
                if (stringArray.length != 2) break block9;
                if (stringArray[0].equalsIgnoreCase("del")) break block10;
                if (!stringArray[0].equalsIgnoreCase("remove")) break block9;
            }
            String string = stringArray[1].toUpperCase();
            if (kH.f$E().f$E().f$E(Keyboard.getKeyIndex((String)string))) {
                kH.f$E().f$E().f$E(Keyboard.getKeyIndex((String)string));
                return String.format("Removed a macro with the keybind %s.", Keyboard.getKeyName((int)Keyboard.getKeyIndex((String)string)));
            }
            return String.format("There is no macro bound to %s.", Keyboard.getKeyName((int)Keyboard.getKeyIndex((String)string)));
        }
        if (stringArray.length == 1) {
            if (stringArray[0].equalsIgnoreCase("list")) {
                StringJoiner stringJoiner = new StringJoiner("\n");
                kH.f$E().f$E().f$E().forEach(lg2 -> stringJoiner.add(String.format("%s [%s%s%s]", lg2.f$E(), TextFormatting.WHITE, Keyboard.getKeyName((int)lg2.f$E()), TextFormatting.GRAY)));
                return String.format("Macros [%s%s%s]: %s.", TextFormatting.WHITE, kH.f$E().f$E().f$E().size(), TextFormatting.GRAY, stringJoiner.toString());
            }
        }
        return null;
    }
}
/*
public class Ej
extends GA {
    public Ej() {
        Ej ej;
        String[] stringArray = new String[5];
        stringArray[0] = "Macro";
        stringArray[1] = "Macros";
        stringArray[2] = "BindMacro";
        stringArray[3] = "MacroBind";
        stringArray[4] = "mb";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return "&e[list|clear] | [add|del] [key] [command]";
    }

    @Override
    public String f$E(String[] stringArray) {
        block9: {
            block10: {
                if (stringArray.length >= 3) {
                    if (stringArray[0].equalsIgnoreCase("add")) {
                        int n;
                        String string = stringArray[1].toUpperCase();
                        StringBuilder stringBuilder = new StringBuilder();
                        int n2 = n = 2;
                        while (n2 < stringArray.length) {
                            stringBuilder.append(stringArray[n]);
                            stringBuilder.append(" ");
                            n2 = ++n;
                        }
                        String string2 = stringBuilder.toString().trim();
                        kH.f$E().f$E().f$a(new lg(Keyboard.getKeyIndex((String)string), string2));
                        return String.format("Added a macro with the keybind %s.", Keyboard.getKeyName((int)Keyboard.getKeyIndex((String)string)));
                    }
                }
                if (stringArray.length != 2) break block9;
                if (stringArray[0].equalsIgnoreCase("del")) break block10;
                if (!stringArray[0].equalsIgnoreCase("remove")) break block9;
            }
            String string = stringArray[1].toUpperCase();
            if (kH.f$E().f$E().f$E(Keyboard.getKeyIndex((String)string))) {
                kH.f$E().f$E().f$E(Keyboard.getKeyIndex((String)string));
                return String.format("Removed a macro with the keybind %s.", Keyboard.getKeyName((int)Keyboard.getKeyIndex((String)string)));
            }
            return String.format("There is no macro bound to %s.", Keyboard.getKeyName((int)Keyboard.getKeyIndex((String)string)));
        }
        if (stringArray.length == 1) {
            if (stringArray[0].equalsIgnoreCase("list")) {
                StringJoiner stringJoiner = new StringJoiner("\n");
                kH.f$E().f$E().f$E().forEach(lg2 -> stringJoiner.add(String.format("%s [%s%s%s]", lg2.f$E(), TextFormatting.WHITE, Keyboard.getKeyName((int)lg2.f$E()), TextFormatting.GRAY)));
                return String.format("Macros [%s%s%s]: %s.", TextFormatting.WHITE, kH.f$E().f$E().f$E().size(), TextFormatting.GRAY, stringJoiner.toString());
            }
        }
        return null;
    }
}
 */