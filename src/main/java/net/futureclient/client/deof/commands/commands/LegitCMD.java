package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class LegitCMD extends CommandBase {

    public LegitCMD() {
        super(new String[] {"Legit", "Alloff", "leigt"});
    }

    @Override
    public String execute(String[] stringArray) {//TODO work on this.
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            Ba ba;
            if (ma2 instanceof J && (ba = (Ba)ma2).f$E()) {
                ba.f$E();
            }
        });
        return "All modules turned off.";
    }

    @Override
    public String getInfo() {
        return null;
    }
}
/*
public class SG
extends GA {
    @Override
    public String f$E(String[] stringArray) {
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            Ba ba;
            if (ma2 instanceof J && (ba = (Ba)ma2).f$E()) {
                ba.f$E();
            }
        });
        return "All modules turned off.";
    }

    public SG() {
        SG sG;
        String[] stringArray = new String[3];
        stringArray[0] = "Legit";
        stringArray[1] = "Alloff";
        stringArray[2] = "leigt";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return null;
    }
}
 */