package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class HClipCMD extends CommandBase {
    public HClipCMD() {
        super(new String[] {"Hclip", "hc", "h"});
    }

    @Override
    public String execute(String[] stringArray) {
        if (stringArray.length == 1) {
            double d = Double.parseDouble(stringArray[0]);
            double d2 = Math.cos(Math.toRadians(mc.player.rotationPitch + 90.0f));
            double d3 = Math.sin(Math.toRadians(mc.player.rotationYawHead + 90.0f));
            if (mc.player.getRidingEntity() != null) {
                mc.player.getRidingEntity().setPosition(mc.player.getRidingEntity().posX + (1.0 * d * d2 + 0.0 * d * d3), mc.player.getRidingEntity().posY, mc.player.getRidingEntity().posZ + (1.0 * d * d3 - 0.0 * d * d2));
            } else {
                mc.player.setPosition(mc.player.posX + (1.0 * d * d2 + 0.0 * d * d3), mc.player.posY, mc.player.posZ + (1.0 * d * d3 - 0.0 * d * d2));
            }
        return String.format("Teleported %s &e%s&7 block(s).", d < 0.0 ? "back" : "forward", d);
        }
        return null;
    }

    @Override
    public String getInfo() {
        return "&e[blocks]";
    }
}
/*
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
 */