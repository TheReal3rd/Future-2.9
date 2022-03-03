package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.Pg;
import net.futureclient.client.deof.commands.manager.CommandBase;
import net.futureclient.client.fH;
import net.futureclient.client.jD;
import net.futureclient.client.kH;

public class PeekCMD extends CommandBase {//TODO needs work

    public PeekCMD() {
        super(new String[] {"Peek", "Peak", "Peeker", "ShulkerPeek"});
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String execute(String[] 0) {
        block5: {
            block7: {
                block6: {
                    0 = Pg.f$E(ItemShulkerBox.class);
                    if (0 != null) ** GOTO lbl-1000
                    if (0.f$d.objectMouseOver.typeOfHit != RayTraceResult.Type.ENTITY) break block5;
                    var2_2 = 0.f$d.objectMouseOver.entityHit;
                    if (!(var2_2 instanceof EntityItem)) break block6;
                    var3_3 = (EntityItem)var2_2;
                    0 = var3_3.getItem();
                    ** GOTO lbl-1000
                }
                if (!(var2_2 instanceof EntityItemFrame)) break block7;
                var3_3 = (EntityItemFrame)var2_2;
                0 = var3_3.getDisplayedItem();
                ** GOTO lbl-1000
            }
            if (!(var2_2 instanceof EntityLivingBase)) ** GOTO lbl-1000
            var3_3 = (EntityLivingBase)var2_2;
            0 = Pg.f$E((EntityLivingBase)var3_3, ItemShulkerBox.class);
            ** GOTO lbl-1000
        }
        if (0.f$d.objectMouseOver.typeOfHit == RayTraceResult.Type.BLOCK) {
            v0 = 0;
            v1 = var2_2 = v0.f$d.objectMouseOver.getBlockPos();
            var3_3 = v0.f$d.world.func_72872_a(EntityItem.class, new AxisAlignedBB((BlockPos)v1, v1.add(1, 2, 1))).iterator();
            while (var3_3.hasNext()) {
                var4_4 = ((EntityItem)var3_3.next()).getItem();
                if (!(var4_4.getItem() instanceof ItemShulkerBox)) continue;
                v2 = 0 = var4_4;
                break;
            }
        } else lbl-1000:
        // 7 sources

        {
            v2 = var2_2 = 0;
        }
        if (var2_2 != null && var2_2.getItem() instanceof ItemShulkerBox) {
            if (var2_2.getTagCompound() != null) {
                kH.f$E().f$E().f$a(new jD(0, var2_2));
                return "Opened shulker box.";
            }
            return "Empty shulker box.";
        }
        return "No shulker box found in hand or crosshair.";
    }

    public static Minecraft f$E(fH fH2) {
        return fH2.f$d;
    }

    public static Minecraft f$a(fH fH2) {
        return fH2.f$d;
    }
}
/*
public class fH
extends GA {
    @Override
    public String f$E() {
        return null;
    }

    public fH() {
        fH fH2;
        String[] stringArray = new String[4];
        stringArray[0] = "Peek";
        stringArray[1] = "Peak";
        stringArray[2] = "Peeker";
        stringArray[3] = "ShulkerPeek";
        super(stringArray);
    }

@Override
public String f$E(String[] 0) {
    block5: {
        block7: {
            block6: {
                0 = Pg.f$E(ItemShulkerBox.class);
                if (0 != null) ** GOTO lbl-1000
                if (0.f$d.objectMouseOver.typeOfHit != RayTraceResult.Type.ENTITY) break block5;
                var2_2 = 0.f$d.objectMouseOver.entityHit;
                if (!(var2_2 instanceof EntityItem)) break block6;
                var3_3 = (EntityItem)var2_2;
                0 = var3_3.getItem();
                    ** GOTO lbl-1000
            }
            if (!(var2_2 instanceof EntityItemFrame)) break block7;
            var3_3 = (EntityItemFrame)var2_2;
            0 = var3_3.getDisplayedItem();
                ** GOTO lbl-1000
        }
        if (!(var2_2 instanceof EntityLivingBase)) ** GOTO lbl-1000
        var3_3 = (EntityLivingBase)var2_2;
        0 = Pg.f$E((EntityLivingBase)var3_3, ItemShulkerBox.class);
            ** GOTO lbl-1000
    }
    if (0.f$d.objectMouseOver.typeOfHit == RayTraceResult.Type.BLOCK) {
        v0 = 0;
        v1 = var2_2 = v0.f$d.objectMouseOver.getBlockPos();
        var3_3 = v0.f$d.world.func_72872_a(EntityItem.class, new AxisAlignedBB((BlockPos)v1, v1.add(1, 2, 1))).iterator();
        while (var3_3.hasNext()) {
            var4_4 = ((EntityItem)var3_3.next()).getItem();
            if (!(var4_4.getItem() instanceof ItemShulkerBox)) continue;
            v2 = 0 = var4_4;
            break;
        }
    } else lbl-1000:
    // 7 sources

    {
        v2 = var2_2 = 0;
    }
    if (var2_2 != null && var2_2.getItem() instanceof ItemShulkerBox) {
        if (var2_2.getTagCompound() != null) {
            kH.f$E().f$E().f$a(new jD(0, var2_2));
            return "Opened shulker box.";
        }
        return "Empty shulker box.";
    }
    return "No shulker box found in hand or crosshair.";
}

    public static Minecraft f$E(fH fH2) {
        return fH2.f$d;
    }

    public static Minecraft f$a(fH fH2) {
        return fH2.f$d;
    }
}
 */