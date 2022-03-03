package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class PresetCMD extends CommandBase {
    public PresetCMD() {
        super(new String[] {"Preset", "Presets"});
    }

    @Override
    public String execute(String[] object) {
        if (((String[])object).length == 2) {
            ma ma2 = kH.f$E().f$E().f$E(object[0]);
            if (ma2 == null) {
                return "No such module exists.";
            }
            if (ma2.f$E().size() < 1) {
                return "That module has no presets.";
            }
            if ((object = ma2.f$E(object[1])) == null) {
                Iterator<kB> iterator;
                StringJoiner stringJoiner = new StringJoiner(", ");
                Iterator<kB> iterator2 = iterator = ma2.f$E().iterator();
                while (iterator2.hasNext()) {
                    kB kB2 = iterator.next();
                    iterator2 = iterator;
                    stringJoiner.add(kB2.f$E());
                }
                return String.format("Try: %s.", stringJoiner.toString());
            }
            ((kB)object).f$E();
            return String.format("Loaded &e%s&7 preset for &e%s&7.", ((kB)object).f$E(), ma2.f$E());
        }
        return null;
    }

    @Override
    public String getInfo() {
        return "&e[module] [preset]";
    }
}
/*
public final class vI
extends GA {
    @Override
    public String f$E(String[] object) {
        if (((String[])object).length == 2) {
            ma ma2 = kH.f$E().f$E().f$E(object[0]);
            if (ma2 == null) {
                return "No such module exists.";
            }
            if (ma2.f$E().size() < 1) {
                return "That module has no presets.";
            }
            if ((object = ma2.f$E(object[1])) == null) {
                Iterator<kB> iterator;
                StringJoiner stringJoiner = new StringJoiner(", ");
                Iterator<kB> iterator2 = iterator = ma2.f$E().iterator();
                while (iterator2.hasNext()) {
                    kB kB2 = iterator.next();
                    iterator2 = iterator;
                    stringJoiner.add(kB2.f$E());
                }
                return String.format("Try: %s.", stringJoiner.toString());
            }
            ((kB)object).f$E();
            return String.format("Loaded &e%s&7 preset for &e%s&7.", ((kB)object).f$E(), ma2.f$E());
        }
        return null;
    }

    @Override
    public String f$E() {
        return "&e[module] [preset]";
    }

    public vI() {
        vI vI2;
        String[] stringArray = new String[2];
        stringArray[0] = "Preset";
        stringArray[1] = "Presets";
        super(stringArray);
    }
}
 */
