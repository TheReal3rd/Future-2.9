package net.futureclient.client.deof.modules.movement.elytraFly;

import net.futureclient.client.BB;
import net.futureclient.client.Pg;
import net.futureclient.client.mc;

public class db_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.BB;
import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.Pg;
import net.futureclient.client.mc;
import net.futureclient.client.od;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.util.math.MathHelper;

public class db
extends Ha<Ee> {
    public final BB f$d;

@Override
public void f$E(Ee 0) {
    if (BB.f$ba().player.func_184582_a(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
        return;
    }
    switch (od.f$d[((mc)0.f$d.f$D.f$E()).ordinal()]) {
        case 1: {
            v0 = BB.f$Ea();
            while (false) {
            }
            if (v0.player.func_184613_cA() && 0.f$d.f$l.f$E().booleanValue() && BB.f$La().player.func_70090_H()) {
                BB.f$R().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)BB.f$ga().player, CPacketEntityAction.Action.START_FALL_FLYING));
                return;
            }
            if (BB.f$O().player.movementInput.jump || !BB.f$Z().inGameHasFocus && BB.f$T().player.func_184613_cA()) {
                0.f$a(0.0);
            }
            if (!BB.f$z().inGameHasFocus || !0.f$d.f$L.f$E().booleanValue() || !BB.f$r().player.movementInput.jump || BB.f$y().player.func_184613_cA() || !BB.f$E(0.f$d).f$E(1000L)) break;
            BB.f$s().player.func_70637_d(false);
            BB.f$S().player.setSprinting(true);
            BB.f$N().player.func_70664_aZ();
            BB.f$u().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)BB.f$X().player, CPacketEntityAction.Action.START_FALL_FLYING));
            BB.f$E(0.f$d).f$a();
            return;
        }
        case 2: {
            if (BB.f$V().player.field_70122_E && 0.f$d.f$c.f$E().booleanValue()) break;
            if (0.f$d.f$A.f$E().booleanValue()) {
                if (BB.f$E(0.f$d)) {
                    BB.f$E(0.f$d, 1.0);
                    BB.f$E(0.f$d, false);
                }
                if (BB.f$E(0.f$d) < BB.f$a(0.f$d).f$E().doubleValue()) {
                    v1 = 0;
                    BB.f$E(v1.f$d, BB.f$E(v1.f$d) + 0.1);
                }
                if (BB.f$E(0.f$d) - 0.1 > BB.f$a(0.f$d).f$E().doubleValue()) {
                    v2 = 0;
                    BB.f$E(v2.f$d, BB.f$E(v2.f$d) - 0.1);
                }
            } else {
                v3 = 0;
                BB.f$E(v3.f$d, BB.f$a(v3.f$d).f$E().doubleValue());
            }
            if (Pg.f$a() || BB.f$q().player.field_70132_H || !0.f$d.f$B.f$E().booleanValue()) ** GOTO lbl51
            if (!BB.f$E(0.f$d).f$E(1000L)) ** GOTO lbl55
            v4 = 0;
            BB.f$E(0.f$d, true);
            v5 = v4;
            BB.f$E(0.f$d, BB.f$E(v4.f$d) + 1);
            BB.f$x().player.field_70159_w += 0.03 * Math.sin(Math.toRadians(BB.f$E(0.f$d) * 4));
            BB.f$p().player.field_70179_y += 0.03 * Math.cos(Math.toRadians(BB.f$E(0.f$d) * 4));
                ** GOTO lbl56
            lbl51:
            // 1 sources

            v6 = 0;
            BB.f$E(v6.f$d).f$a();
            BB.f$E(v6.f$d, false);
            lbl55:
            // 2 sources

            v5 = 0;
            lbl56:
            // 2 sources

            if (v5.f$d.f$a.f$E().booleanValue() && BB.f$n().player.movementInput.jump) {
                BB.f$o().player.field_70181_x = BB.f$E(0.f$d).f$E().doubleValue();
                0.f$a(BB.f$o().player.field_70181_x);
                v7 = 0;
            } else if (BB.f$w().player.movementInput.sneak) {
                BB.f$v().player.field_70181_x = -BB.f$E(0.f$d).f$E().doubleValue();
                0.f$a(BB.f$v().player.field_70181_x);
                v7 = 0;
            } else if (0.f$d.f$e.f$E().booleanValue()) {
                if (BB.f$W().player.field_70173_aa % 32 == 0 && !BB.f$E(0.f$d) && (Math.abs(0.f$e()) >= 0.05 || Math.abs(0.f$E()) >= 0.05)) {
                    v8 = 0;
                    BB.f$E(v8.f$d, BB.f$E(v8.f$d) - BB.f$E(0.f$d) / 2.0 * 0.1);
                    BB.f$Y().player.field_70181_x = -2.0E-4;
                    0.f$a(0.006200000000000001);
                    v7 = 0;
                } else {
                    BB.f$t().player.field_70181_x = -2.0E-4;
                    0.f$a(-2.0E-4);
                    v7 = 0;
                }
            } else {
                BB.f$P().player.field_70181_x = 0.0;
                0.f$a(0.0);
                v7 = 0;
            }
            v7.f$e(0.f$e() * (BB.f$E(0.f$d) != false ? 0.5 : BB.f$E(0.f$d)));
            v9 = 0;
            v9.f$E(v9.f$E() * (BB.f$E(0.f$d) != false ? 0.5 : BB.f$E(0.f$d)));
            return;
        }
        case 3: {
            if (BB.f$Q().player.func_184613_cA() && 0.f$d.f$l.f$E().booleanValue() && BB.f$U().player.func_70090_H()) {
                BB.f$d().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)BB.f$J().player, CPacketEntityAction.Action.START_FALL_FLYING));
                return;
            }
            if (!BB.f$l().player.movementInput.jump || !BB.f$k().player.func_184613_cA()) break;
            var2_2 = BB.f$b().player.field_70177_z * 0.017453292f;
            BB.f$F().player.field_70159_w -= (double)(MathHelper.sin((float)var2_2) * 0.15f);
            BB.f$G().player.field_70179_y += (double)(MathHelper.cos((float)var2_2) * 0.15f);
            return;
        }
        case 4: {
            if (!BB.f$D().player.func_184613_cA()) break;
            if (BB.f$g().player.movementInput.forwardKeyDown || BB.f$m().player.movementInput.sneak) {
                if (!BB.f$f().player.movementInput.forwardKeyDown || !0.f$d.f$a.f$E().booleanValue() && !(BB.f$L().player.field_70127_C > 0.0f)) break;
                var2_3 = (float)Math.toRadians(BB.f$i().player.field_70177_z);
                BB.f$c().player.field_70159_w = (double)MathHelper.sin((float)var2_3) * -(BB.f$a(0.f$d).f$E().doubleValue() / 10.0);
                BB.f$I().player.field_70179_y = (double)MathHelper.cos((float)var2_3) * (BB.f$a(0.f$d).f$E().doubleValue() / 10.0);
                return;
            }
            BB.f$j().player.field_70159_w = 0.0;
            BB.f$M().player.field_70181_x = 0.0;
            BB.f$C().player.field_70179_y = 0.0;
        }
    }
}

    public db(BB bB) {
        0.f$d = bB;
    }
}
 */