package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class VClipCMD extends CommandBase {

    public VClipCMD() {
        super(new String[] {"Vclip", "vc", "v"});
    }

    @Override
    public String execute(String[] stringArray) {
        if (stringArray.length == 1) {
            if (stringArray[0].equalsIgnoreCase("nether") && 0.f$d.player.func_184187_bx() != null && 0.f$d.world.field_73011_w.getDimensionType() == DimensionType.NETHER) {
                0.f$d.player.func_184187_bx().setEntityBoundingBox(0.f$d.player.func_184187_bx().getEntityBoundingBox().offset(0.0, 126.9 - 0.f$d.player.func_184187_bx().posY, 0.0));
                Object[] objectArray = new Object[2];
                objectArray[0] = 126.9 - 0.f$d.player.func_184187_bx().posY < 0.0 ? "down" : "up";
                objectArray[1] = 126.9 - 0.f$d.player.func_184187_bx().posY;
                return String.format("Teleported %s &e%s&7 block(s).", objectArray);
            }
            double d = Double.parseDouble(stringArray[0]);
            mD mD2 = 0;
            if (0.f$d.player.func_184187_bx() != null) {
                mD2.f$d.player.func_184187_bx().setEntityBoundingBox(0.f$d.player.func_184187_bx().getEntityBoundingBox().offset(0.0, d, 0.0));
            } else {
                mD2.f$d.player.func_174826_a(0.f$d.player.func_174813_aQ().offset(0.0, d, 0.0));
            }
            Object[] objectArray = new Object[2];
            objectArray[0] = d < 0.0 ? "down" : "up";
            objectArray[1] = d;
            return String.format("Teleported %s &e%s&7 block(s).", objectArray);
        }
        return null;
    }

    @Override
    public String getInfo() {
        return "&e[blocks]";
    }
}
/*
public class mD
extends GA {
    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 1) {
            if (stringArray[0].equalsIgnoreCase("nether") && 0.f$d.player.func_184187_bx() != null && 0.f$d.world.field_73011_w.getDimensionType() == DimensionType.NETHER) {
                0.f$d.player.func_184187_bx().setEntityBoundingBox(0.f$d.player.func_184187_bx().getEntityBoundingBox().offset(0.0, 126.9 - 0.f$d.player.func_184187_bx().posY, 0.0));
                Object[] objectArray = new Object[2];
                objectArray[0] = 126.9 - 0.f$d.player.func_184187_bx().posY < 0.0 ? "down" : "up";
                objectArray[1] = 126.9 - 0.f$d.player.func_184187_bx().posY;
                return String.format("Teleported %s &e%s&7 block(s).", objectArray);
            }
            double d = Double.parseDouble(stringArray[0]);
            mD mD2 = 0;
            if (0.f$d.player.func_184187_bx() != null) {
                mD2.f$d.player.func_184187_bx().setEntityBoundingBox(0.f$d.player.func_184187_bx().getEntityBoundingBox().offset(0.0, d, 0.0));
            } else {
                mD2.f$d.player.func_174826_a(0.f$d.player.func_174813_aQ().offset(0.0, d, 0.0));
            }
            Object[] objectArray = new Object[2];
            objectArray[0] = d < 0.0 ? "down" : "up";
            objectArray[1] = d;
            return String.format("Teleported %s &e%s&7 block(s).", objectArray);
        }
        return null;
    }

    public mD() {
        mD mD2;
        String[] stringArray = new String[3];
        stringArray[0] = "Vclip";
        stringArray[1] = "vc";
        stringArray[2] = "v";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return "&e[blocks]";
    }
}
 */
