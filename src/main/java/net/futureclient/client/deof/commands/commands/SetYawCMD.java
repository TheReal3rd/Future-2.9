package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class SetYawCMD extends CommandBase {//TODO work on this.
    private DecimalFormat f$d;

    public SetYawCMD() {
        super(new String[] {"SetYaw", "SePitch", "SetRotationYaw", "SetRotation", "sy"});
        this.f$d = new DecimalFormat("0.##");
    }

    @Override
    public String execute(String[] stringArray) {
        if (stringArray.length == 1) {
            AF aF;
            double d;
            try {
                d = MathHelper.wrapDegrees((double)Double.parseDouble(stringArray[0]));
                aF = 0;
            }
            catch (NumberFormatException numberFormatException) {
                va va2 = ((yB)kH.f$E().f$E().f$E(yB.class)).f$a(stringArray[0]);
                if (va2 != null) {
                    AF aF2;
                    va va3 = va2;
                    double d2 = va3.f$a();
                    double d3 = va3.f$e();
                    if (0.f$d.world.field_73011_w.getDimensionType().equals((Object)DimensionType.NETHER) && va2.f$a().equals(DimensionType.OVERWORLD.getName())) {
                        d2 /= 8.0;
                        d3 /= 8.0;
                        aF2 = 0;
                    } else {
                        if (0.f$d.world.field_73011_w.getDimensionType().equals((Object)DimensionType.OVERWORLD) && va2.f$a().equals(DimensionType.NETHER.getName())) {
                            d2 *= 8.0;
                            d3 *= 8.0;
                        }
                        aF2 = 0;
                    }
                    d = MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(aF2.f$d.player.field_70161_v - d3, 0.f$d.player.field_70165_t - d2)) + 90.0));
                    aF = 0;
                }
                return "Invalid Waypoint entered.";
            }
            if (((Minecraft)aF.f$d).player != null) {
                0.f$d.player.field_70177_z = (float)d;
            }
            return String.format("Set rotation yaw to %s degrees.", 0.f$d.format(d));
        }
        if (stringArray.length == 2) {
            AF aF = 0;
            double d = MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(0.f$d.player.field_70161_v - Double.parseDouble(stringArray[1]), aF.f$d.player.field_70165_t - Double.parseDouble(stringArray[0]))) + 90.0));
            if (((Minecraft)aF.f$d).player != null) {
                0.f$d.player.field_70177_z = (float)d;
            }
            return String.format("Set rotation yaw to %s degrees.", 0.f$d.format(d));
        }
        return null;
    }

    @Override
    public String getInfo() {
        return "&e[yaw|waypoint] &7| &e[x] [z]";
    }
}
/*
public class AF
extends GA {
    private DecimalFormat f$d;

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 1) {
            AF aF;
            double d;
            try {
                d = MathHelper.wrapDegrees((double)Double.parseDouble(stringArray[0]));
                aF = 0;
            }
            catch (NumberFormatException numberFormatException) {
                va va2 = ((yB)kH.f$E().f$E().f$E(yB.class)).f$a(stringArray[0]);
                if (va2 != null) {
                    AF aF2;
                    va va3 = va2;
                    double d2 = va3.f$a();
                    double d3 = va3.f$e();
                    if (0.f$d.world.field_73011_w.getDimensionType().equals((Object)DimensionType.NETHER) && va2.f$a().equals(DimensionType.OVERWORLD.getName())) {
                        d2 /= 8.0;
                        d3 /= 8.0;
                        aF2 = 0;
                    } else {
                        if (0.f$d.world.field_73011_w.getDimensionType().equals((Object)DimensionType.OVERWORLD) && va2.f$a().equals(DimensionType.NETHER.getName())) {
                            d2 *= 8.0;
                            d3 *= 8.0;
                        }
                        aF2 = 0;
                    }
                    d = MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(aF2.f$d.player.field_70161_v - d3, 0.f$d.player.field_70165_t - d2)) + 90.0));
                    aF = 0;
                }
                return "Invalid Waypoint entered.";
            }
            if (((Minecraft)aF.f$d).player != null) {
                0.f$d.player.field_70177_z = (float)d;
            }
            return String.format("Set rotation yaw to %s degrees.", 0.f$d.format(d));
        }
        if (stringArray.length == 2) {
            AF aF = 0;
            double d = MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(0.f$d.player.field_70161_v - Double.parseDouble(stringArray[1]), aF.f$d.player.field_70165_t - Double.parseDouble(stringArray[0]))) + 90.0));
            if (((Minecraft)aF.f$d).player != null) {
                0.f$d.player.field_70177_z = (float)d;
            }
            return String.format("Set rotation yaw to %s degrees.", 0.f$d.format(d));
        }
        return null;
    }

    public AF() {
        AF aF;
        String[] stringArray = new String[5];
        stringArray[0] = "SetYaw";
        stringArray[1] = "SePitch";
        stringArray[2] = "SetRotationYaw";
        stringArray[3] = "SetRotation";
        stringArray[4] = "sy";
        super(stringArray);
        AF aF2 = aF;
        aF2.f$d = new DecimalFormat("0.##");
    }

    @Override
    public String f$E() {
        return "&e[yaw|waypoint] &7| &e[x] [z]";
    }
}
 */