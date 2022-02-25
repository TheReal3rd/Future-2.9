package net.futureclient.client;

import net.futureclient.client.sG;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;

public class TH {
    private static final Minecraft f$d;

    public static float[] f$E(double d, double d22, double d3) {
        double d4 = d - TH.f$d.player.field_70165_t;
        double d5 = d4;
        double d6 = d3 -= TH.f$d.player.field_70161_v;
        double d7 = MathHelper.sqrt((double)(d5 * d5 + d6 * d6));
        float f = (float)(Math.atan2(d3, d4) * 180.0 / Math.PI) - 90.0f;
        float d22 = (float)(-(Math.atan2(d22 -= TH.f$d.player.field_70163_u + (double)TH.f$d.player.func_70047_e(), d7) * 180.0 / Math.PI));
        float f2 = f - TH.f$d.player.field_70177_z;
        if (f2 < -180.0f || f2 > 180.0f) {
            float f3 = Math.round(Math.abs(f2 / 360.0f));
            f2 = f2 < 0.0f ? (f2 += 360.0f * f3) : (f2 -= 360.0f * f3);
        }
        return new float[]{TH.f$d.player.field_70177_z + f2, d22};
    }

    public TH() {
        TH tH;
    }

    public static float f$E(float f, float f2) {
        return Math.abs(((f - f2 + 180.0f) % 360.0f + 360.0f) % 360.0f - 180.0f);
    }

    public static boolean f$E(Entity entity, float f, sG sG2) {
        float f2;
        float f3 = Math.abs(TH.f$E(entity, sG2)[0] - TH.f$d.player.field_70177_z) % 360.0f > 180.0f ? 360.0f - Math.abs(TH.f$E(entity, sG2)[0] - TH.f$d.player.field_70177_z) % 360.0f : Math.abs(TH.f$E(entity, sG2)[0] - TH.f$d.player.field_70177_z) % 360.0f;
        float f4 = f2 = Math.abs(TH.f$E(entity, sG2)[1] - TH.f$d.player.field_70125_A) % 360.0f > 180.0f ? 360.0f - Math.abs(TH.f$E(entity, sG2)[1] - TH.f$d.player.field_70125_A) % 360.0f : Math.abs(TH.f$E(entity, sG2)[1] - TH.f$d.player.field_70125_A) % 360.0f;
        float f5 = f3;
        return Math.sqrt(f4 * f4 + f5 * f5) <= (double)(f == 180.0f ? 360.0f : f);
    }

    public static float f$E(float f) {
        if (f > 90.0f) {
            f = 90.0f;
            return 90.0f;
        }
        if (f < -90.0f) {
            f = -90.0f;
        }
        return f;
    }

    public static float[] f$E(Entity entity) {
        Entity entity2 = entity;
        double d = entity2.posX - TH.f$d.player.field_70165_t;
        double d2 = entity2.posY - (TH.f$d.player.field_70163_u + (double)TH.f$d.player.func_70047_e());
        double d3 = entity2.posZ - TH.f$d.player.field_70161_v;
        double d4 = d;
        double d5 = d3;
        double d6 = MathHelper.sqrt((double)(d4 * d4 + d5 * d5));
        float f = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(Math.atan2(d2, d6) * 180.0 / Math.PI));
        float f3 = f - TH.f$d.player.field_70177_z;
        if (f3 < -180.0f || f3 > 180.0f) {
            float f4 = Math.round(Math.abs(f3 / 360.0f));
            f3 = f3 < 0.0f ? (f3 += 360.0f * f4) : (f3 -= 360.0f * f4);
        }
        return new float[]{TH.f$d.player.field_70177_z + f3, f2};
    }

    public static float[] f$a(Entity entity) {
        Entity entity2 = entity;
        double d = entity2.posX - TH.f$d.player.field_70165_t;
        Entity entity3 = entity;
        double d2 = entity2.posY + (double)(entity3.getEyeHeight() / 2.0f) - 0.5 - TH.f$d.player.field_70163_u - 0.6;
        double d3 = entity3.posZ - TH.f$d.player.field_70161_v;
        double d4 = d;
        double d5 = d3;
        double d6 = MathHelper.sqrt((double)(d4 * d4 + d5 * d5));
        float f = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(Math.atan2(d2, d6) * 180.0 / Math.PI));
        return new float[]{f, f2};
    }

    public static double f$E(Entity entity) {
        return TH.f$E(entity)[0] - TH.f$d.player.field_70177_z;
    }

    public static float f$a(float f, float f2) {
        float f3;
        f2 = Math.abs(f - f2) % 360.0f;
        if (f3 > 180.0f) {
            f2 = 360.0f - f2;
        }
        return f2;
    }

    public static float f$E(float f, float f2, float f3) {
        float f4;
        f2 = TH.f$a(f2 - f);
        if (f4 > f3) {
            f2 = f3;
        }
        if (f2 < -f3) {
            f2 = -f3;
        }
        return f2;
    }

    public static float[] f$E(Entity entity, sG sG22) {
        Entity entity2 = entity;
        double d = entity2.posX - TH.f$d.player.field_70165_t;
        double d2 = entity2.posY + (double)entity.getEyeHeight() - (TH.f$d.player.field_70163_u + (double)TH.f$d.player.func_70047_e()) - (double)(sG22 == null ? entity.height / 2.0f : TH.f$E(sG22));
        double d3 = entity.posZ - TH.f$d.player.field_70161_v;
        double d4 = d;
        double d5 = d3;
        double d6 = MathHelper.sqrt((double)(d4 * d4 + d5 * d5));
        float sG22 = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
        float f = (float)(-(Math.atan2(d2, d6) * 180.0 / Math.PI));
        if ((sG22 -= TH.f$d.player.field_70177_z) < -180.0f || sG22 > 180.0f) {
            float f2 = Math.round(Math.abs(sG22 / 360.0f));
            sG22 = sG22 < 0.0f ? (sG22 += 360.0f * f2) : (sG22 -= 360.0f * f2);
        }
        return new float[]{TH.f$d.player.field_70177_z + sG22, f};
    }

    static {
        f$d = Minecraft.getMinecraft();
    }

    public static double f$E(Entity entity, sG sG2) {
        return new Vec3d(TH.f$d.player.field_70165_t, TH.f$d.player.field_70163_u + (double)TH.f$d.player.func_70047_e(), TH.f$d.player.field_70161_v).distanceTo(entity.getPositionVector());
    }

    public static float[] f$E(BlockPos blockPos, EnumFacing enumFacing) {
        AxisAlignedBB axisAlignedBB = TH.f$d.world.func_180495_p(blockPos).func_185900_c((IBlockAccess)TH.f$d.world, blockPos);
        BlockPos blockPos2 = blockPos;
        double d = (double)blockPos2.func_177958_n() + (axisAlignedBB.minX + axisAlignedBB.maxX) / 2.0;
        double d2 = (double)blockPos2.func_177956_o() + (axisAlignedBB.minY + axisAlignedBB.maxY) / 2.0;
        double d3 = (double)blockPos2.func_177952_p() + (axisAlignedBB.minZ + axisAlignedBB.maxZ) / 2.0;
        if (enumFacing != null) {
            d += (double)enumFacing.getDirectionVec().getX() * ((axisAlignedBB.minX + axisAlignedBB.maxX) / 2.0);
            d2 += (double)enumFacing.getDirectionVec().getY() * ((axisAlignedBB.minY + axisAlignedBB.maxY) / 2.0);
            d3 += (double)enumFacing.getDirectionVec().getZ() * ((axisAlignedBB.minZ + axisAlignedBB.maxZ) / 2.0);
        }
        return TH.f$E(d, d2, d3);
    }

    public static float f$a(float f) {
        float f2;
        f %= 360.0f;
        if (f2 >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float f$E(sG sG2) {
        float f = 0.0f;
        switch (sG2) {
            case f$K: {
                return f -= 0.0f;
            }
            case f$b: {
                return f += 0.2f;
            }
            case f$j: {
                return f += 0.5f;
            }
            case f$i: {
                return f += 0.85f;
            }
            case f$M: {
                return f += 1.2f;
            }
            case f$g: {
                f += 1.6f;
                return f;
            }
        }
        return f;
    }
}
package net.futureclient.client;

import java.util.StringJoiner;
import net.futureclient.client.GA;
import net.futureclient.client.hb;
import net.futureclient.client.kH;
import net.minecraft.util.text.TextFormatting;

public class Th
extends GA {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String f$E(String[] stringArray) {
        String string;
        String string2;
        hb hb2;
        block27: {
            block26: {
                int n;
                block24: {
                    int n2;
                    block25: {
                        hb2 = (hb)kH.f$E().f$E().f$E(hb.class);
                        if (hb2 == null) {
                            return "Error.";
                        }
                        if (stringArray.length != 1) break block24;
                        String string3 = stringArray[0].toLowerCase();
                        int n3 = -1;
                        switch (string3.hashCode()) {
                            case 3322014: {
                                if (!string3.equals("list")) break;
                                n2 = n3 = 0;
                                break block25;
                            }
                            case 94746189: {
                                if (!string3.equals("clear")) break;
                                n3 = 1;
                            }
                        }
                        n2 = n3;
                    }
                    switch (n2) {
                        case 0: {
                            StringJoiner stringJoiner = new StringJoiner(", ");
                            hb2.f$d.forEach(stringJoiner::add);
                            return String.format("Items [%s%s%s]: %s.", TextFormatting.WHITE, hb2.f$d.size(), TextFormatting.GRAY, stringJoiner.toString());
                        }
                        case 1: {
                            hb2.f$d.clear();
                            return "Cleared items.";
                        }
                    }
                    return null;
                }
                if (stringArray.length < 2) {
                    return null;
                }
                string2 = stringArray[0];
                StringBuilder stringBuilder = new StringBuilder();
                int n4 = n = 1;
                while (n4 < stringArray.length) {
                    stringBuilder.append(stringArray[n]);
                    stringBuilder.append(" ");
                    n4 = ++n;
                }
                string = stringArray.length == 2 ? stringArray[1] : stringBuilder.toString().trim();
                if (string2.equalsIgnoreCase("add")) break block26;
                if (!string2.equalsIgnoreCase("a")) break block27;
            }
            if (string.equalsIgnoreCase("current")) {
                if (0.f$d.player.field_71071_by.getCurrentItem().isEmpty()) {
                    return "You are not holding an item.";
                }
                if (hb2.f$d.contains(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase())) {
                    return new StringBuilder().insert(0, 0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase()).append("\u00a77 is already added to the list.").toString();
                }
                hb2.f$d.add(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase());
                return new StringBuilder().insert(0, "Added ").append(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase()).append("\u00a77 to the list.").toString();
            }
            if (hb2.f$d.contains(string.toLowerCase())) {
                return new StringBuilder().insert(0, string.toLowerCase()).append(" is already added to the list.").toString();
            }
            hb2.f$d.add(string.toLowerCase());
            return new StringBuilder().insert(0, "Added ").append(string.toLowerCase()).append(" to the list.").toString();
        }
        if (!string2.equalsIgnoreCase("del")) {
            if (!string2.equalsIgnoreCase("remove")) {
                return "That item doesn't exist. Proper usage: ic del <item> | ic del current (Removes the current item you are holding.)";
            }
        }
        if (string.equalsIgnoreCase("current")) {
            if (0.f$d.player.field_71071_by.getCurrentItem().isEmpty()) {
                return "You are not holding an item.";
            }
            if (!hb2.f$d.contains(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase())) {
                return new StringBuilder().insert(0, "The list does not contain ").append(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName()).append("\u00a77.").toString();
            }
            hb2.f$d.remove(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase());
            return new StringBuilder().insert(0, "Removed ").append(0.f$d.player.field_71071_by.getCurrentItem().getDisplayName().toLowerCase()).append("\u00a77 from the list.").toString();
        }
        if (!hb2.f$d.contains(string.toLowerCase())) {
            return new StringBuilder().insert(0, "The list does not contain ").append(string.toLowerCase()).append(".").toString();
        }
        hb2.f$d.remove(string.toLowerCase());
        return new StringBuilder().insert(0, "Removed ").append(string.toLowerCase()).append(" from the list.").toString();
    }

    @Override
    public String f$E() {
        return "&e[list|clear] | [add|del] [item|current]";
    }

    public Th() {
        Th th;
        String[] stringArray = new String[6];
        stringArray[0] = "InvCleaner";
        stringArray[1] = "InvClean";
        stringArray[2] = "InventoryClean";
        stringArray[3] = "InventoryCleaner";
        stringArray[4] = "InventoryCleanerList";
        stringArray[5] = "IC";
        super(stringArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.FG;

public class th {
    public static final int[] f$d;

    static {
        f$d = new int[FG.values().length];
        try {
            th.f$d[FG.f$g.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            th.f$d[FG.f$M.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
