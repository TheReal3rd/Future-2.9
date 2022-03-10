package net.futureclient.client.deof.modules.movement.entitySpeed;

public class bB_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.NA;
import net.futureclient.client.Pg;
import net.futureclient.client.Tb;
import net.futureclient.client.kH;
import net.minecraft.util.math.BlockPos;

public class bB
extends Ha<ME> {
    public final NA f$d;

    @Override
    public void f$E(ME mE) {
        0.f$d.f$a(String.format("EntitySpeed \u00a77[\u00a7F%s\u00a77]", Float.valueOf(NA.f$E(0.f$d).f$E().floatValue())));
        if (NA.f$J().player.func_184187_bx() != null) {
            double d = Math.cos(Math.toRadians(NA.f$d().player.field_70177_z + 90.0f));
            double d2 = Math.sin(Math.toRadians(NA.f$l().player.field_70177_z + 90.0f));
            Object object = new BlockPos(NA.f$k().player.field_70165_t + (2.0 * d + 0.0 * d2), NA.f$b().player.field_70163_u - 1.0, NA.f$F().player.field_70161_v + (2.0 * d2 - 0.0 * d));
            BlockPos blockPos = new BlockPos(NA.f$G().player.field_70165_t + (2.0 * d + 0.0 * d2), NA.f$D().player.field_70163_u - 2.0, NA.f$g().player.field_70161_v + (2.0 * d2 - 0.0 * d));
            if (!NA.f$m().player.func_184187_bx().onGround && !NA.f$f().world.func_180495_p((BlockPos)object).func_185904_a().blocksMovement() && !NA.f$L().world.func_180495_p(blockPos).func_185904_a().blocksMovement() && 0.f$d.f$i.f$E().booleanValue()) {
                Pg.f$E(0.0);
                NA.f$a(0.f$d).f$a();
                return;
            }
            object = new BlockPos(NA.f$i().player.field_70165_t + (2.0 * d + 0.0 * d2), NA.f$c().player.field_70163_u, NA.f$I().player.field_70161_v + (2.0 * d2 - 0.0 * d));
            if (NA.f$j().world.func_180495_p((BlockPos)object).func_185904_a().blocksMovement() && 0.f$d.f$i.f$E().booleanValue()) {
                Pg.f$E(0.0);
                NA.f$a(0.f$d).f$a();
                return;
            }
            object = new BlockPos(NA.f$M().player.field_70165_t + (1.0 * d + 0.0 * d2), NA.f$C().player.field_70163_u + 1.0, NA.f$H().player.field_70161_v + (1.0 * d2 - 0.0 * d));
            if (NA.f$h().world.func_180495_p((BlockPos)object).func_185904_a().blocksMovement() && 0.f$d.f$i.f$E().booleanValue()) {
                Pg.f$E(0.0);
                NA.f$a(0.f$d).f$a();
                return;
            }
            if (NA.f$A().player.movementInput.jump) {
                NA.f$E(0.f$d).f$a();
            }
            if (NA.f$a(0.f$d).f$a(10000L) || !0.f$d.f$i.f$E().booleanValue()) {
                if (!(NA.f$K().player.func_184187_bx().isInWater() || (object = (Tb)kH.f$E().f$E().f$E(Tb.class)) == null || ((Ba)object).f$E() || NA.f$B().player.movementInput.jump || !NA.f$E(0.f$d).f$E(1000L) || CG.f$E())) {
                    if (NA.f$e().player.func_184187_bx().onGround) {
                        NA.f$a().player.func_184187_bx().motionY = 0.4;
                    }
                    NA.f$E().player.func_184187_bx().motionY = -0.4;
                }
                bB bB2 = 0;
                Pg.f$E(NA.f$E(bB2.f$d).f$E().floatValue());
                NA.f$a(bB2.f$d).f$a();
            }
        }
    }

    public bB(NA nA) {
        0.f$d = nA;
    }
}
 */