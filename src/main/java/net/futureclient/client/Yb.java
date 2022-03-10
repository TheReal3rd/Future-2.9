package net.futureclient.client;

import net.futureclient.client.GA;
import net.futureclient.client.yB;

public class Yb
extends GA {
    public final yB f$d;

    @Override
    public String f$E(String[] stringArray) {
        if (yB.f$E(0.f$d) == null) {
            return "No destination found.";
        }
        yB.f$E(0.f$d, null);
        return "Destination removed.";
    }

    public Yb(yB yB2, String[] stringArray) {
        0.f$d = yB2;
        super(stringArray);
    }

    @Override
    public String f$E() {
        return null;
    }
}

