package net.futureclient.client;

import net.futureclient.client.GA;

public class di
extends GA {
    public di() {
        di di2;
        String[] stringArray = new String[3];
        stringArray[0] = "Hclip";
        stringArray[1] = "hc";
        stringArray[2] = "h";
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 1) {
            double d = Double.parseDouble(stringArray[0]);
            di di2 = 0;
            double d2 = Math.cos(Math.toRadians(di2.f$d.player.field_70177_z + 90.0f));
            double d3 = Math.sin(Math.toRadians(di2.f$d.player.field_70177_z + 90.0f));
            if (di2.f$d.player.func_184187_bx() != null) {
                0.f$d.player.func_184187_bx().setPosition(0.f$d.player.func_184187_bx().posX + (1.0 * d * d2 + 0.0 * d * d3), 0.f$d.player.func_184187_bx().posY, 0.f$d.player.func_184187_bx().posZ + (1.0 * d * d3 - 0.0 * d * d2));
            } else {
                0.f$d.player.func_70107_b(0.f$d.player.field_70165_t + (1.0 * d * d2 + 0.0 * d * d3), 0.f$d.player.field_70163_u, 0.f$d.player.field_70161_v + (1.0 * d * d3 - 0.0 * d * d2));
            }
            Object[] objectArray = new Object[2];
            objectArray[0] = d < 0.0 ? "back" : "forward";
            objectArray[1] = d;
            return String.format("Teleported %s &e%s&7 block(s).", objectArray);
        }
        return null;
    }

    @Override
    public String f$E() {
        return "&e[blocks]";
    }
}
