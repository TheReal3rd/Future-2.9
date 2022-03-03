package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class UnBindCMD extends CommandBase {

    public UnBindCMD() {
        super(new String[] {"UnBind", "RemoveBind", "Deletebind", "Delbind"});
    }

    @Override
    public String execute(String[] object) {
        if (((String[])object).length == 1) {
            object = object[0];
            object = kH.f$E().f$E().f$E((String)object);
            if (object == null) {
                return "That module does not exist.";
            }
            if (!(object instanceof J)) {
                return "That module is not toggleable.";
            }
            object = (Ba)object;
            kH.f$E().f$E().f$E(String.format("%sToggle", ((ma)object).f$E())).f$E(0);
            return String.format("Unbound %s.", ((ma)object).f$E()[0]);
        }
        return null;
    }

    @Override
    public String getInfo() {
        return "&e[module]";
    }
}
/*
public class yG
extends GA {
    @Override
    public String f$E(String[] object) {
        if (((String[])object).length == 1) {
            object = object[0];
            object = kH.f$E().f$E().f$E((String)object);
            if (object == null) {
                return "That module does not exist.";
            }
            if (!(object instanceof J)) {
                return "That module is not toggleable.";
            }
            object = (Ba)object;
            kH.f$E().f$E().f$E(String.format("%sToggle", ((ma)object).f$E())).f$E(0);
            return String.format("Unbound %s.", ((ma)object).f$E()[0]);
        }
        return null;
    }

    public yG() {
        yG yG2;
        String[] stringArray = new String[4];
        stringArray[0] = "UnBind";
        stringArray[1] = "RemoveBind";
        stringArray[2] = "Deletebind";
        stringArray[3] = "Delbind";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return "&e[module]";
    }
}
 */