package net.futureclient.client;

import net.futureclient.client.RF;

public class SD
extends RF {
    public SD() {
        SD sD;
    }
}
package net.futureclient.client;

import java.util.Arrays;
import net.futureclient.client.GA;
import net.futureclient.client.va;
import net.futureclient.client.yB;
import net.minecraft.world.DimensionType;

public class sd
extends GA {
    public final yB f$d;

    @Override
    public String f$E() {
        return "&e[name] | [x] [y] [z] [dimension]";
    }

    public sd(yB yB2, String[] stringArray) {
        0.f$d = yB2;
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length >= 1) {
            Object object;
            double d;
            double d2;
            double d3;
            sd sd2;
            String[] stringArray2;
            String string = stringArray[0];
            String string2 = "";
            if (0.f$d.isSingleplayer()) {
                string2 = "singleplayer";
                stringArray2 = stringArray;
            } else if (0.f$d.getCurrentServerData() != null) {
                string2 = 0.f$d.getCurrentServerData().serverIP.replaceAll(":", "_");
                stringArray2 = stringArray;
            } else {
                if (0.f$d.isConnectedToRealms()) {
                    string2 = "realms";
                }
                stringArray2 = stringArray;
            }
            if (stringArray2.length >= 4) {
                sd2 = 0;
                d3 = Double.parseDouble(stringArray[1]);
                d2 = Double.parseDouble(stringArray[2]);
                d = Double.parseDouble(stringArray[3]);
            } else {
                sd sd3 = 0;
                sd2 = sd3;
                sd sd4 = 0;
                d3 = Double.parseDouble(yB.f$E(sd3.f$d).format(sd4.f$d.player.field_70165_t).replaceAll(",", "."));
                d2 = Double.parseDouble(yB.f$E(sd3.f$d).format(0.f$d.player.field_70163_u).replaceAll(",", "."));
                d = Double.parseDouble(yB.f$E(sd4.f$d).format(0.f$d.player.field_70161_v).replaceAll(",", "."));
            }
            String string3 = sd2.f$d.world.field_73011_w.getDimensionType().getName();
            if (stringArray.length == 5) {
                object = stringArray[4].toLowerCase();
                String[] stringArray3 = new String[3];
                stringArray3[0] = "overworld";
                stringArray3[1] = "world";
                stringArray3[2] = "ow";
                String[] stringArray4 = stringArray3;
                String[] stringArray5 = new String[4];
                stringArray5[0] = "nether";
                stringArray5[1] = "the_nether";
                stringArray5[2] = "nethe";
                stringArray5[3] = "n";
                String[] stringArray6 = stringArray5;
                String[] stringArray7 = new String[4];
                stringArray7[0] = "end";
                stringArray7[1] = "the_end";
                stringArray7[2] = "en";
                stringArray7[3] = "e";
                String[] stringArray8 = stringArray7;
                if (Arrays.asList(stringArray4).contains(object)) {
                    string3 = DimensionType.OVERWORLD.getName();
                } else if (Arrays.asList(stringArray6).contains(object)) {
                    string3 = DimensionType.NETHER.getName();
                } else if (Arrays.asList(stringArray8).contains(object)) {
                    string3 = DimensionType.THE_END.getName();
                } else {
                    return "Invalid dimension type entered.";
                }
            }
            if (!yB.f$E(0.f$d, (va)(object = new va(string, string2, d3, d2, d, string3)))) {
                0.f$d.f$i.add((va)object);
            }
            return String.format("Added waypoint &e%s&7.", ((va)object).f$E());
        }
        return null;
    }
}
