package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class KeyBindCMD extends CommandBase {

    public KeyBindCMD() {
        super(new String[] {"Keybind","Bind", "kb"});
    }

    @Override
    public String execute(String[] stringArray) { //TODO deobf this
        if (stringArray.length == 3) {
            String string = stringArray[0];
            String string2 = stringArray[1];
            String string3 = stringArray[2].toUpperCase();
            int n = string3.equals("NONE") ? 0 : Keyboard.getKeyIndex((String)string3);
            if (string.equalsIgnoreCase("module")) {
                ma ma2 = kH.f$E().f$E().f$E(string2);
                if (ma2 == null) {
                    return "That module does not exist.";
                }
                if (!(ma2 instanceof J)) {
                    return "That module is not toggleable.";
                }
                Ba ba = (Ba)ma2;
                kH.f$E().f$E().f$E(String.format("%sToggle", ba.f$E())).f$E(n);
                return String.format("%s keybind has been set to %s.", ba.f$E()[0], Keyboard.getKeyName((int)n));
            }
            if (string.equalsIgnoreCase("macro")) {
                if (kH.f$E().f$E().f$E(n)) {
                    kH.f$E().f$E().f$E(n);
                    return String.format("Removed macro with the keybind %s.", Keyboard.getKeyName((int)n));
                }
                kH.f$E().f$E().f$a(new lg(n, string2));
                return String.format("Added a macro with the keybind %s.", Keyboard.getKeyName((int)n));
            }
            return "Invalid action. Correct actions: Module | Macro.";
        }
        if (stringArray.length == 2) {
            String string = stringArray[0];
            String string4 = stringArray[1].toUpperCase();
            ma ma3 = kH.f$E().f$E().f$E(string);
            if (ma3 == null) {
                return "That module does not exist.";
            }
            if (!(ma3 instanceof J)) {
                return "That module is not toggleable.";
            }
            Ba ba = (Ba)ma3;
            int n = string4.equals("NONE") ? 0 : Keyboard.getKeyIndex((String)string4);
            kH.f$E().f$E().f$E(String.format("%sToggle", ba.f$E())).f$E(n);
            return String.format("%s keybind has been set to %s.", ba.f$E()[0], Keyboard.getKeyName((int)n));
        }
        return 0.f$E();
    }



    @Override
    public String getInfo() {
        return "&e[module|macro] [module|command] [key] &7| &e[module] [key]";
    }
}
/*
public class bG
extends GA {
    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 3) {
            String string = stringArray[0];
            String string2 = stringArray[1];
            String string3 = stringArray[2].toUpperCase();
            int n = string3.equals("NONE") ? 0 : Keyboard.getKeyIndex((String)string3);
            if (string.equalsIgnoreCase("module")) {
                ma ma2 = kH.f$E().f$E().f$E(string2);
                if (ma2 == null) {
                    return "That module does not exist.";
                }
                if (!(ma2 instanceof J)) {
                    return "That module is not toggleable.";
                }
                Ba ba = (Ba)ma2;
                kH.f$E().f$E().f$E(String.format("%sToggle", ba.f$E())).f$E(n);
                return String.format("%s keybind has been set to %s.", ba.f$E()[0], Keyboard.getKeyName((int)n));
            }
            if (string.equalsIgnoreCase("macro")) {
                if (kH.f$E().f$E().f$E(n)) {
                    kH.f$E().f$E().f$E(n);
                    return String.format("Removed macro with the keybind %s.", Keyboard.getKeyName((int)n));
                }
                kH.f$E().f$E().f$a(new lg(n, string2));
                return String.format("Added a macro with the keybind %s.", Keyboard.getKeyName((int)n));
            }
            return "Invalid action. Correct actions: Module | Macro.";
        }
        if (stringArray.length == 2) {
            String string = stringArray[0];
            String string4 = stringArray[1].toUpperCase();
            ma ma3 = kH.f$E().f$E().f$E(string);
            if (ma3 == null) {
                return "That module does not exist.";
            }
            if (!(ma3 instanceof J)) {
                return "That module is not toggleable.";
            }
            Ba ba = (Ba)ma3;
            int n = string4.equals("NONE") ? 0 : Keyboard.getKeyIndex((String)string4);
            kH.f$E().f$E().f$E(String.format("%sToggle", ba.f$E())).f$E(n);
            return String.format("%s keybind has been set to %s.", ba.f$E()[0], Keyboard.getKeyName((int)n));
        }
        return 0.f$E();
    }

    public bG() {
        bG bG2;
        String[] stringArray = new String[3];
        stringArray[0] = "Keybind";
        stringArray[1] = "Bind";
        stringArray[2] = "kb";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return "&e[module|macro] [module|command] [key] &7| &e[module] [key]";
    }
}
 */
