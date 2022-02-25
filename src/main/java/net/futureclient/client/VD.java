package net.futureclient.client;

public enum VD {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private VD() {
        VD vD;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class Vd
extends RF {
    public Vd() {
        Vd vd;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.IF;
import net.futureclient.client.xf;

public class vd
extends Ha<xf> {
    public final IF f$d;

    public vd(IF iF) {
        0.f$d = iF;
    }

    @Override
    public void f$E(xf xf2) {
        if (IF.f$e().getRenderViewEntity() != null && IF.f$a().world != null && IF.f$E().playerController != null) {
            xf xf3 = xf2;
            xf3.f$a(IF.f$a(0.f$d).f$E().floatValue());
            xf3.f$E(IF.f$E(0.f$d).f$E().floatValue());
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.L;
import net.futureclient.client.hF;
import net.futureclient.client.ve;
import net.minecraft.item.ItemEndCrystal;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;

public class vD
extends Ha<ve> {
    public final hF f$d;

    @Override
    public void f$E(ve ve2) {
        CPacketPlayerTryUseItemOnBlock cPacketPlayerTryUseItemOnBlock;
        if (ve2.f$E() instanceof CPacketPlayerTryUseItemOnBlock && hF.f$a().player.func_184586_b((cPacketPlayerTryUseItemOnBlock = (CPacketPlayerTryUseItemOnBlock)ve2.f$E()).getHand()).getItem() instanceof ItemEndCrystal) {
            if (cPacketPlayerTryUseItemOnBlock.getPos().func_177956_o() >= hF.f$E().world.func_72800_K() - 1 && cPacketPlayerTryUseItemOnBlock.getDirection().equals((Object)EnumFacing.UP)) {
                ((L)cPacketPlayerTryUseItemOnBlock).setPlacedBlockDirection(EnumFacing.DOWN);
            }
        }
    }

    public vD(hF hF2) {
        0.f$d = hF2;
    }
}
