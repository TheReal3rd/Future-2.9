package net.futureclient.client;

import java.util.StringJoiner;
import net.futureclient.client.GA;
import net.futureclient.client.kH;
import net.futureclient.client.lg;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.input.Keyboard;

public class Ej
extends GA {
    public Ej() {
        Ej ej;
        String[] stringArray = new String[5];
        stringArray[0] = "Macro";
        stringArray[1] = "Macros";
        stringArray[2] = "BindMacro";
        stringArray[3] = "MacroBind";
        stringArray[4] = "mb";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return "&e[list|clear] | [add|del] [key] [command]";
    }

    @Override
    public String f$E(String[] stringArray) {
        block9: {
            block10: {
                if (stringArray.length >= 3) {
                    if (stringArray[0].equalsIgnoreCase("add")) {
                        int n;
                        String string = stringArray[1].toUpperCase();
                        StringBuilder stringBuilder = new StringBuilder();
                        int n2 = n = 2;
                        while (n2 < stringArray.length) {
                            stringBuilder.append(stringArray[n]);
                            stringBuilder.append(" ");
                            n2 = ++n;
                        }
                        String string2 = stringBuilder.toString().trim();
                        kH.f$E().f$E().f$a(new lg(Keyboard.getKeyIndex((String)string), string2));
                        return String.format("Added a macro with the keybind %s.", Keyboard.getKeyName((int)Keyboard.getKeyIndex((String)string)));
                    }
                }
                if (stringArray.length != 2) break block9;
                if (stringArray[0].equalsIgnoreCase("del")) break block10;
                if (!stringArray[0].equalsIgnoreCase("remove")) break block9;
            }
            String string = stringArray[1].toUpperCase();
            if (kH.f$E().f$E().f$E(Keyboard.getKeyIndex((String)string))) {
                kH.f$E().f$E().f$E(Keyboard.getKeyIndex((String)string));
                return String.format("Removed a macro with the keybind %s.", Keyboard.getKeyName((int)Keyboard.getKeyIndex((String)string)));
            }
            return String.format("There is no macro bound to %s.", Keyboard.getKeyName((int)Keyboard.getKeyIndex((String)string)));
        }
        if (stringArray.length == 1) {
            if (stringArray[0].equalsIgnoreCase("list")) {
                StringJoiner stringJoiner = new StringJoiner("\n");
                kH.f$E().f$E().f$E().forEach(lg2 -> stringJoiner.add(String.format("%s [%s%s%s]", lg2.f$E(), TextFormatting.WHITE, Keyboard.getKeyName((int)lg2.f$E()), TextFormatting.GRAY)));
                return String.format("Macros [%s%s%s]: %s.", TextFormatting.WHITE, kH.f$E().f$E().f$E().size(), TextFormatting.GRAY, stringJoiner.toString());
            }
        }
        return null;
    }
}
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
