package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class MotionCMD extends CommandBase {

    public MotionCMD() {
        super(new String[] {"VelocityPercentage", "velocity%", "%", "Vel", "Velocity_reduction", "Reduce", "Reduction", "Lower"});
    }

    @Override
    public String getInfo() {
        return "&e[number]";
    }

    @Override
    public String execute(String[] object) {//TODO work on this.
        if (((String[])object).length == 1) {
            object = object[0];
            wC wC2 = (wC)kH.f$E().f$E().f$E(wC.class);
            if (object == null) {
                return "No number entered.";
            }
            if (wC2 != null) {
                wC wC3 = wC2;
                wC3.f$g.f$E(Double.parseDouble((String)object));
                wC3.f$d.f$E(Double.parseDouble((String)object));
            }
            return new StringBuilder().insert(0, "Horizontal and vertical percentage has been set to ").append(Double.parseDouble((String)object)).toString();
        }
        return null;
    }
}
/*
public class JE
extends GA {
    @Override
    public String f$E() {
        return "&e[number]";
    }

    @Override
    public String f$E(String[] object) {
        if (((String[])object).length == 1) {
            object = object[0];
            wC wC2 = (wC)kH.f$E().f$E().f$E(wC.class);
            if (object == null) {
                return "No number entered.";
            }
            if (wC2 != null) {
                wC wC3 = wC2;
                wC3.f$g.f$E(Double.parseDouble((String)object));
                wC3.f$d.f$E(Double.parseDouble((String)object));
            }
            return new StringBuilder().insert(0, "Horizontal and vertical percentage has been set to ").append(Double.parseDouble((String)object)).toString();
        }
        return null;
    }

    public JE() {
        JE jE;
        String[] stringArray = new String[8];
        stringArray[0] = "VelocityPercentage";
        stringArray[1] = "velocity%";
        stringArray[2] = "%";
        stringArray[3] = "Vel";
        stringArray[4] = "Velocity_reduction";
        stringArray[5] = "Reduce";
        stringArray[6] = "Reduction";
        stringArray[7] = "Lower";
        super(stringArray);
    }
}
 */
