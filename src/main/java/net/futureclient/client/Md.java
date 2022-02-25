package net.futureclient.client;

import net.futureclient.client.kF;

public class Md {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            Md.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Md.f$d[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.kg;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.input.Mouse;

public class MD
extends Ha<Pf> {
    public final kg f$d;

    @Override
    public void f$E(Pf pf) {
        switch (pf.f$E()) {
            case f$M: {
                Minecraft minecraft = kg.f$W();
                while (false) {
                }
                if (minecraft.objectMouseOver != null && kg.f$Y().objectMouseOver.typeOfHit == RayTraceResult.Type.BLOCK && kg.f$E(0.f$d) && Mouse.isButtonDown((int)1) && !kg.f$t().player.isSneaking() && kg.f$a(0.f$d) == 0 && kg.f$P().inGameHasFocus) {
                    kg.f$E(0.f$d, kg.f$Q().objectMouseOver.getBlockPos());
                    Pg.f$E(Pg.f$E(), kg.f$E(0.f$d), 0.0);
                    kg.f$d().player.func_70107_b((double)kg.f$E(0.f$d).func_177958_n() + 0.5, (double)kg.f$E(0.f$d).func_177956_o() + kg.f$J().world.func_180495_p((BlockPos)kg.f$E((kg)0.f$d)).func_185900_c((IBlockAccess)kg.f$U().world, (BlockPos)kg.f$E((kg)0.f$d)).maxY, (double)kg.f$E(0.f$d).func_177952_p() + 0.5);
                    kg.f$E(0.f$d, 5);
                }
                if (kg.f$a(0.f$d) <= 0) break;
                kg.f$E(0.f$d);
            }
        }
    }

    public MD(kg kg2) {
        0.f$d = kg2;
    }
}
package net.futureclient.client;

import net.futureclient.client.GA;
import net.minecraft.world.DimensionType;

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
package net.futureclient.client;

import net.futureclient.client.Qd;

public class md {
    public static final int[] f$d;

    static {
        f$d = new int[Qd.values().length];
        try {
            md.f$d[Qd.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            md.f$d[Qd.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
