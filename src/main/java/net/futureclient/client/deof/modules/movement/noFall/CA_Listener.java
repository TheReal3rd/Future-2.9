package net.futureclient.client.deof.modules.movement.noFall;

import net.futureclient.client.*;

public class CA_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ed;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.xc;
import net.futureclient.client.zB;
import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class CA
extends Ha<Pf> {
    public final xc f$d;

@Override
public void f$E(Pf 0) {
    0.f$d.f$a(String.format("NoFall \u00a77[\u00a7F%s\u00a77]", new Object[]{xc.f$E(0.f$d).f$E()}));
    if (!((zB)xc.f$E(0.f$d).f$E()).equals((Object)zB.f$g)) {
        return;
    }
    var2_2 = xc.f$I().player.func_174791_d();
    var3_3 = new Vec3d(var2_2.x, var2_2.y - 3.0, var2_2.z);
    var3_3 = xc.f$j().world.func_72901_a(var2_2, var3_3, true);
    if (xc.f$M().player.field_70143_R < 5.0f || var3_3 == null || !var3_3.typeOfHit.equals((Object)RayTraceResult.Type.BLOCK) || xc.f$C().world.func_180495_p(var3_3.getBlockPos()).getBlock() instanceof BlockLiquid || !xc.f$H().player.field_71071_by.hasItemStack(xc.f$E(0.f$d)) || CG.f$E() || CG.f$E(false)) {
        return;
    }
    switch (Ed.f$d[0.f$E().ordinal()]) {
        case 1: {
            while (false) {
            }
            0.f$E(90.0f);
            var3_4 = -1;
            v0 = var4_5 = 44;
            while (v0 >= 36) {
                if (xc.f$h().player.field_71069_bz.getSlot(var4_5).getStack().getItem() != Items.WATER_BUCKET) ** GOTO lbl21
                v1 = var3_4 = var4_5 - 36;
                    ** GOTO lbl24
                lbl21:
                // 1 sources

                v0 = --var4_5;
            }
            v1 = var3_4;
            lbl24:
            // 2 sources

            if (v1 == -1) break;
            xc.f$A().player.field_71071_by.currentItem = var3_4;
            return;
        }
        case 2: {
            var4_6 = new Vec3d(var2_2.x, var2_2.y - 5.0, var2_2.z);
            var2_2 = xc.f$K().world.func_72901_a(var2_2, var4_6, true);
            if (var2_2 == null || !var2_2.typeOfHit.equals((Object)RayTraceResult.Type.BLOCK) || xc.f$B().world.func_180495_p(var2_2.getBlockPos()).getBlock() instanceof BlockLiquid || !xc.f$E(0.f$d).f$E(1000L)) break;
            0.f$E(90.0f);
            xc.f$E().playerController.processRightClick((EntityPlayer)xc.f$e().player, (World)xc.f$a().world, EnumHand.MAIN_HAND);
            xc.f$E(0.f$d).f$a();
        }
    }
}

    public CA(xc xc2) {
        0.f$d = xc2;
    }
}
 */