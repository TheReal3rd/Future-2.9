package net.futureclient.client;

import net.futureclient.client.GA;
import net.futureclient.client.va;
import net.futureclient.client.yB;

public class sc
extends GA {
    public final yB f$d;

    public sc(yB yB2, String[] stringArray) {
        0.f$d = yB2;
        super(stringArray);
    }

    @Override
    public String f$E() {
        return "&e[point]";
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 1) {
            Object object = stringArray[0];
            if ((object = yB.f$E(0.f$d, (String)object)) == null) {
                return "Invalid waypoint entered.";
            }
            if (yB.f$E(0.f$d, (va)object)) {
                yB.f$E(0.f$d, (va)object);
            }
            return String.format("Destination has been set to &e%s&7.", ((va)object).f$E());
        }
        return null;
    }
}
