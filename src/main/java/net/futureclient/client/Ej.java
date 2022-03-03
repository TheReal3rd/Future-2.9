package net.futureclient.client;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.process.ICustomGoalProcess;
import net.futureclient.client.GA;
import net.futureclient.client.kH;
import net.futureclient.client.va;
import net.futureclient.client.yB;
import net.minecraft.world.DimensionType;

public final class ej
extends GA {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String f$E(String[] goalXZ) {
        double d;
        double d2;
        Double d3;
        block11: {
            double d4;
            d3 = null;
            switch (((GoalXZ)goalXZ).length) {
                case 1: {
                    kH kH2 = kH.f$E();
                    while (false) {
                    }
                    yB yB2 = (yB)kH2.f$E().f$E(yB.class);
                    va va2 = yB2.f$a((String)goalXZ[0]);
                    if (va2 == null) return "Invalid Waypoint entered.";
                    va va3 = va2;
                    d4 = va3.f$a();
                    d2 = va3.f$e();
                    if (0.f$d.world.field_73011_w.getDimensionType().equals((Object)DimensionType.NETHER) && va2.f$a().equals(DimensionType.OVERWORLD.getName())) {
                        d2 /= 8.0;
                        d = d4 /= 8.0;
                    } else {
                        if (!0.f$d.world.field_73011_w.getDimensionType().equals((Object)DimensionType.OVERWORLD) || !va2.f$a().equals(DimensionType.NETHER.getName())) break;
                        d2 *= 8.0;
                        d = d4 *= 8.0;
                    }
                    break block11;
                }
                case 2: {
                    GoalXZ goalXZ2 = goalXZ;
                    d4 = Double.parseDouble((String)goalXZ2[0]);
                    d2 = Double.parseDouble((String)goalXZ2[1]);
                    d = d4;
                    break block11;
                }
                case 3: {
                    GoalXZ goalXZ3 = goalXZ;
                    d4 = Double.parseDouble((String)goalXZ3[0]);
                    d3 = Double.parseDouble((String)goalXZ3[1]);
                    d2 = Double.parseDouble((String)goalXZ3[2]);
                    d = d4;
                    break block11;
                }
                default: {
                    return null;
                }
            }
            d = d4;
        }
        int n = (int)Math.floor(d);
        int n2 = (int)Math.floor(d2);
        if (d3 != null) {
            int n3 = (int)Math.floor(d3);
            goalXZ = new GoalBlock(n, n3, n2);
        } else {
            goalXZ = new GoalXZ(n, n2);
        }
        IBaritone iBaritone = BaritoneAPI.getProvider().getPrimaryBaritone();
        d3 = iBaritone.getPathingControlManager().mostRecentInControl().orElse(null);
        ICustomGoalProcess iCustomGoalProcess = iBaritone.getCustomGoalProcess();
        if (d3 != null && d3.priority() > iCustomGoalProcess.priority()) {
            return String.format("\"%s\" is currently controlling Baritone with a higher priority!", d3.displayName0());
        }
        iCustomGoalProcess.setGoalAndPath((Goal)goalXZ);
        return String.format("Starting to path towards %s.", goalXZ);
    }

    @Override
    public String f$E() {
        return "&e[waypoint] &7| &e[x] [z] &7| &e[x] [y] [z]";
    }

    public ej() {
        ej ej2;
        String[] stringArray = new String[2];
        stringArray[0] = "Goto";
        stringArray[1] = "Path";
        super(stringArray);
    }
}
