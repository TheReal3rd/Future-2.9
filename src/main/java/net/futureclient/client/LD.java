package net.futureclient.client;

import java.util.Arrays;
import net.futureclient.client.GA;
import net.futureclient.client.va;
import net.futureclient.client.yB;
import net.minecraft.world.DimensionType;

public class Ld
extends GA {
    public final yB f$d;

    @Override
    public String f$E() {
        return "&e[add|del] [name] &7| &e[x] [y] [z] [dimension]";
    }

    @Override
    public String f$E(String[] stringArray) {
        block22: {
            String string;
            va va2;
            block23: {
                if (stringArray.length >= 2) {
                    if (stringArray[0].equalsIgnoreCase("add")) {
                        Object object;
                        double d;
                        double d2;
                        double d3;
                        Ld ld;
                        String[] stringArray2;
                        String string2 = stringArray[1];
                        String string3 = "";
                        if (0.f$d.isSingleplayer()) {
                            string3 = "singleplayer";
                            stringArray2 = stringArray;
                        } else if (0.f$d.getCurrentServerData() != null) {
                            string3 = 0.f$d.getCurrentServerData().serverIP.replaceAll(":", "_");
                            stringArray2 = stringArray;
                        } else {
                            if (0.f$d.isConnectedToRealms()) {
                                string3 = "realms";
                            }
                            stringArray2 = stringArray;
                        }
                        if (stringArray2.length >= 5) {
                            ld = 0;
                            d3 = Double.parseDouble(stringArray[2]);
                            d2 = Double.parseDouble(stringArray[3]);
                            d = Double.parseDouble(stringArray[4]);
                        } else {
                            Ld ld2 = 0;
                            ld = ld2;
                            Ld ld3 = 0;
                            d3 = Double.parseDouble(yB.f$E(ld2.f$d).format(ld3.f$d.player.field_70165_t).replaceAll(",", "."));
                            d2 = Double.parseDouble(yB.f$E(ld2.f$d).format(0.f$d.player.field_70163_u).replaceAll(",", "."));
                            d = Double.parseDouble(yB.f$E(ld3.f$d).format(0.f$d.player.field_70161_v).replaceAll(",", "."));
                        }
                        String string4 = ld.f$d.world.field_73011_w.getDimensionType().getName();
                        if (stringArray.length == 6) {
                            object = stringArray[5].toLowerCase();
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
                                string4 = DimensionType.OVERWORLD.getName();
                            } else if (Arrays.asList(stringArray6).contains(object)) {
                                string4 = DimensionType.NETHER.getName();
                            } else if (Arrays.asList(stringArray8).contains(object)) {
                                string4 = DimensionType.THE_END.getName();
                            } else {
                                return "Invalid dimension type entered.";
                            }
                        }
                        if (!yB.f$E(0.f$d, (va)(object = new va(string2, string3, d3, d2, d, string4)))) {
                            0.f$d.f$i.add((va)object);
                        }
                        return String.format("Added waypoint &e%s&7.", ((va)object).f$E());
                    }
                }
                if (stringArray.length != 2) break block22;
                if (stringArray[0].equalsIgnoreCase("del")) break block23;
                if (!stringArray[0].equalsIgnoreCase("remove")) break block22;
            }
            if ((va2 = 0.f$d.f$a(string = stringArray[1])) == null) {
                return "Invalid waypoint entered.";
            }
            if (yB.f$E(0.f$d, va2)) {
                0.f$d.f$i.remove(va2);
            }
            return String.format("Removed waypoint &e%s&7.", va2.f$E());
        }
        return null;
    }

    public Ld(yB yB2, String[] stringArray) {
        0.f$d = yB2;
        super(stringArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.nD;
import net.minecraft.util.math.Vec3d;

public final class lD
extends nD {
    @Override
    public Vec3d f$E(Vec3d vec3d, Vec3d vec3d2) {
        return vec3d2.subtract(0.0, 1337.69, 0.0);
    }

    public lD(String string, int n) {
        lD lD2;
    }
}
