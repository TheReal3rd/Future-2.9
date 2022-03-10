package net.futureclient.client.deof.modules.miscellaneous.chestAura;

import net.futureclient.client.CG;
import net.futureclient.client.ME;
import net.futureclient.client.QA;

public class GC_Listener {
}
/*
package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.QA;
import net.futureclient.client.s;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;

public class GC
extends Ha<ME> {
    public final QA f$d;

    public GC(QA qA) {
        0.f$d = qA;
    }

@Override
public void f$E(ME mE) {
    TileEntity tileEntity;
    GC gC = 0;
    QA.f$E(gC.f$d);
    if (QA.f$a(gC.f$d) > 0) {
        QA.f$E(0.f$d);
        return;
    }
    if (!QA.f$E(0.f$d)) {
        QA.f$E(0.f$d).remove(QA.f$E(0.f$d));
        QA.f$E(0.f$d, true);
    }
    if (((Boolean)QA.f$E(0.f$d).f$E()).booleanValue() && !QA.f$L().player.field_70122_E) {
        return;
    }
    if (QA.f$i().currentScreen != null) {
        return;
    }
    Iterator iterator = QA.f$c().world.field_147482_g.iterator();
    block0: do {
        Iterator iterator2 = iterator;
        while (true) {
            if (!iterator2.hasNext()) {
                return;
            }
            tileEntity = (TileEntity)iterator.next();
            if (!(tileEntity instanceof TileEntityChest) && !(tileEntity instanceof TileEntityEnderChest)) {
                iterator2 = iterator;
                continue;
            }
            if (!QA.f$E(0.f$d).contains(tileEntity.getPos())) continue block0;
            iterator2 = iterator;
        }
    } while (!(tileEntity.getDistanceSq(QA.f$I().player.field_70165_t, QA.f$j().player.field_70163_u + (double)QA.f$M().player.func_70047_e(), QA.f$C().player.field_70161_v) <= (double)(((s)QA.f$E(0.f$d)).f$E().floatValue() * ((s)QA.f$E(0.f$d)).f$E().floatValue())));
    CG.f$E(tileEntity.getPos());
    QA.f$A().playerController.processRightClickBlock(QA.f$H().player, QA.f$h().world, tileEntity.getPos(), EnumFacing.UP, new Vec3d(0.5, 0.5, 0.5), EnumHand.MAIN_HAND);
    QA.f$E(0.f$d, QA.f$K().getConnection() != null && QA.f$e().getConnection().getPlayerInfo(QA.f$B().player.func_110124_au()) != null ? QA.f$E().getConnection().getPlayerInfo(QA.f$a().player.func_110124_au()).getResponseTime() + 2 : 0);
    QA.f$E(0.f$d, tileEntity.getPos());
    QA.f$E(0.f$d, false);
    QA.f$E(0.f$d).add(QA.f$E(0.f$d));
}
}
 */