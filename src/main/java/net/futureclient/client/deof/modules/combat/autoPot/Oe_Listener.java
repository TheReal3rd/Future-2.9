package net.futureclient.client.deof.modules.combat.autoPot;

import net.futureclient.client.*;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;

public class Oe_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.HE;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.kH;
import net.futureclient.client.uA;
import net.futureclient.client.yE;
import net.futureclient.client.zF;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;

public class Oe
extends Ha<Pf> {
    public final HE f$d;

    public Oe(HE hE) {
        0.f$d = hE;
    }

@Override
public void f$E(Pf 0) {
    0.f$d.f$a(String.format("AutoPot \u00a77[\u00a7F%s\u00a77]", new Object[]{0.f$d.f$e()}));
    var2_2 = (uA) kH.f$E().f$E().f$E(uA.class);
    if (((yE)kH.f$E().f$E().f$E(yE.class)).f$M) {
        return;
    }
    switch (zF.f$d[0.f$E().ordinal()]) {
        case 1: {
            while (false) {
            }
            if (0.f$d.f$a() == -1 || !(HE.f$S().player.func_110143_aJ() <= HE.f$e(0.f$d).f$E().floatValue()) || !0.f$d.f$d.f$a(HE.f$a(0.f$d).f$E().floatValue() * 1000.0f)) ** GOTO lbl42
            if (HE.f$N().player.field_70124_G && var2_2 != null && !var2_2.f$E() && !((Boolean)HE.f$E(0.f$d).f$E()).booleanValue()) {
                v0 = 0;
                v0.f$d.f$d.f$a();
                HE.f$x().player.connection.sendPacket((Packet)new CPacketPlayer.PositionRotation(HE.f$X().player.field_70165_t, HE.f$u().player.field_70163_u, HE.f$V().player.field_70161_v, HE.f$q().player.field_70177_z, -90.0f, true));
                v1 = 0;
                v0.f$d.f$E(0.f$d.f$a(), HE.f$E(v1.f$d).f$E().intValue() - 1);
                HE.f$p().player.connection.sendPacket((Packet)new CPacketHeldItemChange(HE.f$E(0.f$d).f$E().intValue() - 1));
                if (v1.f$d.f$I.f$E().booleanValue()) {
                    HE.f$n().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                } else {
                    HE.f$o().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND));
                }
                HE.f$v().player.connection.sendPacket((Packet)new CPacketHeldItemChange(HE.f$w().player.field_71071_by.currentItem));
                HE.f$P().player.connection.sendPacket((Packet)new CPacketPlayer.Position(HE.f$W().player.field_70165_t, HE.f$Y().player.field_70163_u + 0.42, HE.f$t().player.field_70161_v, true));
                HE.f$d().player.connection.sendPacket((Packet)new CPacketPlayer.Position(HE.f$Q().player.field_70165_t, HE.f$U().player.field_70163_u + 0.75, HE.f$J().player.field_70161_v, true));
                HE.f$F().player.connection.sendPacket((Packet)new CPacketPlayer.Position(HE.f$l().player.field_70165_t, HE.f$k().player.field_70163_u + 1.0, HE.f$b().player.field_70161_v, true));
                HE.f$m().player.connection.sendPacket((Packet)new CPacketPlayer.Position(HE.f$G().player.field_70165_t, HE.f$D().player.field_70163_u + 1.16, HE.f$g().player.field_70161_v, true));
                HE.f$c().player.connection.sendPacket((Packet)new CPacketPlayer.Position(HE.f$f().player.field_70165_t, HE.f$L().player.field_70163_u + 1.24, HE.f$i().player.field_70161_v, true));
                v2 = 0;
                HE.f$e(0.f$d, HE.f$I().player.field_70165_t);
                v3 = v2;
                HE.f$a(v2.f$d, HE.f$j().player.field_70163_u + 1.24);
                HE.f$E(0.f$d, HE.f$M().player.field_70161_v);
                HE.f$E(0.f$d, 5);
            } else {
                0.f$E(90.0f);
                0.f$d.f$j = true;
                0.f$d.f$d.f$a();
                lbl42:
                // 2 sources

                v3 = 0;
            }
            if (HE.f$a(v3.f$d) >= 0) {
                0.f$E(true);
            }
            if (HE.f$a(0.f$d) == 0) {
                var3_3 = 0.0;
                HE.f$C().player.field_70179_y = 0.0;
                HE.f$H().player.field_70159_w = 0.0;
                HE.f$h().player.func_70634_a(HE.f$e(0.f$d), HE.f$a(0.f$d), HE.f$E(0.f$d));
                HE.f$A().player.field_70181_x = -0.08;
            }
            HE.f$E(0.f$d);
            return;
        }
        case 2: {
            if (!0.f$d.f$j) break;
            v4 = 0;
            v5 = 0;
            v4.f$d.f$E(v4.f$d.f$a(), HE.f$E(v5.f$d).f$E().intValue() - 1);
            HE.f$K().player.connection.sendPacket((Packet)new CPacketHeldItemChange(HE.f$E(0.f$d).f$E().intValue() - 1));
            if (v5.f$d.f$I.f$E().booleanValue()) {
                HE.f$B().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
            } else {
                HE.f$e().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND));
            }
            HE.f$E().player.connection.sendPacket((Packet)new CPacketHeldItemChange(HE.f$a().player.field_71071_by.currentItem));
            0.f$d.f$d.f$a();
            0.f$d.f$j = false;
        }
    }
}
}
 */