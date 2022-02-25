package net.futureclient.client;

import net.futureclient.client.DA;
import net.futureclient.client.Ha;
import net.futureclient.client.oD;

public class Gd
extends Ha<oD> {
    public final DA f$d;

    @Override
    public void f$E(oD oD2) {
        oD2.f$E(0.f$d.f$M.f$E());
    }

    public Gd(DA dA) {
        0.f$d = dA;
    }
}
package net.futureclient.client;

import net.futureclient.client.D;
import net.futureclient.client.Ha;
import net.futureclient.client.rf;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;

public class GD
extends Ha<ve> {
    public final rf f$d;

    public GD(rf rf2) {
        0.f$d = rf2;
    }

    @Override
    public void f$E(ve ve2) {
        CPacketEntityAction cPacketEntityAction;
        if (ve2.f$E() instanceof CPacketEntityAction) {
            cPacketEntityAction = (CPacketEntityAction)ve2.f$E();
            if (((Boolean)rf.f$a(0.f$d).f$E()).booleanValue() && (cPacketEntityAction.getAction() == CPacketEntityAction.Action.START_SPRINTING || cPacketEntityAction.getAction() == CPacketEntityAction.Action.STOP_SPRINTING)) {
                ve2.f$E(true);
            }
        }
        if (ve2.f$E() instanceof CPacketPlayer) {
            cPacketEntityAction = (CPacketPlayer)ve2.f$E();
            boolean bl = rf.f$a().player.field_70122_E;
            if (((Boolean)rf.f$E(0.f$d).f$E()).booleanValue() && rf.f$E(0.f$d) && bl && cPacketEntityAction.getY(0.0) == (!((D)cPacketEntityAction).isMoving() ? 0.0 : rf.f$E().player.field_70163_u)) {
                ((D)cPacketEntityAction).setOnGround(false);
            }
            rf.f$E(0.f$d, bl);
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.WE;

public class gD
extends Ha<Ee> {
    public final WE f$d;

    public gD(WE wE) {
        0.f$d = wE;
    }

    @Override
    public void f$E(Ee ee) {
        if (WE.f$E(0.f$d)) {
            WE.f$e().player.field_70179_y = 0.0;
            WE.f$B().player.field_70159_w = 0.0;
            gD gD2 = 0;
            ee.f$e(WE.f$a(0.f$d) - WE.f$a().player.field_70165_t);
            ee.f$E(WE.f$E(gD2.f$d) - WE.f$E().player.field_70161_v);
            WE.f$E(gD2.f$d, false);
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.DA;
import net.futureclient.client.Ha;
import net.futureclient.client.Td;

public class gd
extends Ha<Td> {
    public final DA f$d;

    public gd(DA dA) {
        0.f$d = dA;
    }

    @Override
    public void f$E(Td td) {
        td.f$E(0.f$d.f$C.f$E());
    }
}
