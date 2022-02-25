package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Pg;
import net.futureclient.client.Sf;
import net.futureclient.client.Ze;
import net.futureclient.client.kH;
import net.futureclient.client.yE;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

public class LD
extends Ha<ME> {
    public final Sf f$d;

    public LD(Sf sf) {
        0.f$d = sf;
    }

    @Override
    public void f$E(ME mE) {
        Ba ba;
        0.f$d.f$a(String.format("AutoLog \u00a77[\u00a7F%s\u00a77]", Sf.f$E(0.f$d).f$E()));
        if (!Sf.f$i().player.func_70089_S()) {
            return;
        }
        if (((Boolean)Sf.f$a(0.f$d).f$E()).booleanValue()) {
            ba = (Ze)kH.f$E().f$E().f$E(Ze.class);
            EntityPlayer entityPlayer = Sf.f$c().world.field_73010_i.stream().filter(arg_0 -> LD.f$E((Ze)ba, arg_0)).findFirst().orElse(null);
            if (entityPlayer != null) {
                Sf.f$E(0.f$d, new StringBuilder().insert(0, "[AutoLog] ").append(entityPlayer.getName()).append(" came into render distance.").toString());
                return;
            }
        }
        if ((ba = (yE)kH.f$E().f$E().f$E(yE.class)) != null && Sf.f$C().world.func_175668_a(new BlockPos(Sf.f$I().player.field_70142_S, Sf.f$j().player.field_70137_T, Sf.f$M().player.field_70136_U), false) && Sf.f$K().world.func_175668_a(new BlockPos(Sf.f$H().player.field_70165_t, Sf.f$h().player.field_70163_u, Sf.f$A().player.field_70161_v), false)) {
            int n = ((yE)ba).f$a();
            if (((Boolean)Sf.f$E(0.f$d).f$E()).booleanValue() && n <= 0) {
                Sf.f$E(0.f$d, new StringBuilder().insert(0, "[AutoLog] Logged out with ").append(n).append(" totems and ").append(Sf.f$B().player.func_110143_aJ()).append(" hearts remaining.").toString());
                return;
            }
            if (ba.f$E() && n > 0) {
                return;
            }
        }
        if (Sf.f$e().player.func_110143_aJ() <= Sf.f$E(0.f$d).f$E().floatValue()) {
            Sf.f$E(0.f$d, new StringBuilder().insert(0, "[AutoLog] Logged out with ").append(Sf.f$a().player.func_110143_aJ()).append(" hearts remaining.").toString());
        }
    }

    private static boolean f$E(Ze ze, EntityPlayer entityPlayer) {
        return !(entityPlayer instanceof EntityPlayerSP) && !entityPlayer.getName().equals(Sf.f$E().player.func_70005_c_()) && Pg.f$E((Entity)entityPlayer) && (ze.f$h.f$E() == false || !kH.f$E().f$E().f$E(entityPlayer.getName()));
    }
}
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

import java.util.List;
import net.futureclient.client.Gb;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.tI;

public class ld
extends Ha<ME> {
    public final Gb f$d;

    public ld(Gb gb) {
        0.f$d = gb;
    }

    @Override
    public void f$E(ME mE) {
        if (((List)Gb.f$E(0.f$d).f$E()).size() != Gb.f$E(0.f$d)) {
            ld ld2 = 0;
            Gb.f$E(ld2.f$d, ((List)Gb.f$E(ld2.f$d).f$E()).size());
            if (((Boolean)Gb.f$B(0.f$d).f$E()).booleanValue()) {
                tI.f$a();
                return;
            }
            tI.f$E();
        }
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
