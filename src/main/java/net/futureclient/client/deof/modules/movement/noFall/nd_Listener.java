package net.futureclient.client.deof.modules.movement.noFall;

public class nd_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.D;
import net.futureclient.client.Ha;
import net.futureclient.client.ve;
import net.futureclient.client.xc;
import net.futureclient.client.zB;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer;

public class nd
extends Ha<ve> {
    public final xc f$d;

    @Override
    public void f$E(ve ve2) {
        if (ve2.f$E() instanceof CPacketPlayer) {
            CPacketPlayer cPacketPlayer = (CPacketPlayer)ve2.f$E();
            switch ((zB)((Object)xc.f$E(0.f$d).f$E())) {
                case f$j: {
                    Minecraft minecraft = xc.f$b();
                    while (false) {
                    }
                    if (!(minecraft.player.field_70143_R > 3.0f)) break;
                    ((D)cPacketPlayer).setOnGround(true);
                    return;
                }
                case f$i: {
                    if (!(xc.f$F().player.field_70143_R > 3.0f)) break;
                    ((D)cPacketPlayer).setY(xc.f$G().player.field_70163_u + (double)0.1f);
                    return;
                }
                case f$M: {
                    if (!(xc.f$D().player.field_70143_R > 3.0f)) break;
                    xc.f$g().player.field_70122_E = true;
                    xc.f$m().player.field_71075_bZ.isFlying = true;
                    xc.f$f().player.field_71075_bZ.allowFlying = true;
                    ((D)cPacketPlayer).setOnGround(false);
                    xc.f$L().player.field_70133_I = true;
                    xc.f$i().player.field_71075_bZ.isFlying = false;
                    xc.f$c().player.func_70664_aZ();
                }
            }
        }
    }

    public nd(xc xc2) {
        0.f$d = xc2;
    }
}
 */