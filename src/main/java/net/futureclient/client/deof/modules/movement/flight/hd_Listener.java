package net.futureclient.client.deof.modules.movement.flight;

import net.futureclient.client.*;
import net.minecraft.entity.Entity;

public class hd_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.BA;
import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.KC;
import net.futureclient.client.Pf;
import net.futureclient.client.ac;
import net.futureclient.client.cC;
import net.futureclient.client.kH;
import net.minecraft.entity.Entity;
import net.minecraft.init.MobEffects;

public class hd
extends Ha<Pf> {
    public final KC f$d;

@Override
public void f$E(Pf 0) {
    switch (ac.f$d[((BA) KC.f$E(0.f$d).f$E()).ordinal()]) {
        case 1: {
            v0 = KC.f$r();
            while (false) {
            }
            v0.player.field_70159_w = 0.0;
            KC.f$y().player.field_70181_x = 0.0;
            KC.f$s().player.field_70179_y = 0.0;
            if (((Boolean)KC.f$B(0.f$d).f$E()).booleanValue()) {
                KC.f$S().player.field_70181_x -= KC.f$K(0.f$d).f$E().doubleValue();
            }
            var2_2 = (cC)kH.f$E().f$E().f$E(cC.class);
            if (!KC.f$N().inGameHasFocus && (var2_2 == null || !var2_2.f$E() || !var2_2.f$b.f$E().booleanValue())) ** GOTO lbl20
            if (KC.f$X().player.movementInput.jump) {
                KC.f$u().player.field_70181_x += 0.4000000059604645;
            }
            if (KC.f$V().player.movementInput.sneak) {
                KC.f$q().player.field_70181_x -= 0.4000000059604645;
                v1 = 0;
                break;
            }
                ** GOTO lbl71
        }
        lbl20:
        // 2 sources

        case 2: {
            switch (ac.f$g[0.f$E().ordinal()]) {
                case 1: {
                    v2 = KC.f$x();
                    while (false) {
                    }
                    if (v2.player.field_70122_E) ** GOTO lbl71
                    if (KC.f$p().player.movementInput.jump) ** GOTO lbl39
                    if ((KC.f$n().player.movementInput.forwardKeyDown || KC.f$o().player.movementInput.backKeyDown || KC.f$w().player.movementInput.leftKeyDown || KC.f$v().player.movementInput.rightKeyDown) && !KC.f$W().player.movementInput.sneak) {
                        v3 = 0;
                        KC.f$a(0.f$d, KC.f$a(v3.f$d) + 1);
                        if (KC.f$a(v3.f$d) >= 11) {
                            KC.f$Y().player.field_70747_aH = 0.7f;
                            KC.f$t().player.func_70664_aZ();
                            KC.f$a(0.f$d, 0);
                            break;
                        }
                    }
                        ** GOTO lbl71
                    lbl39:
                    // 1 sources

                    if (KC.f$P().player.movementInput.sneak) ** GOTO lbl71
                    v4 = 0;
                    KC.f$a(0.f$d, KC.f$a(v4.f$d) + 1);
                    if (KC.f$a(v4.f$d) < 4) ** GOTO lbl71
                    KC.f$Q().player.field_70747_aH = 0.01f;
                    KC.f$U().player.func_70664_aZ();
                    KC.f$a(0.f$d, 0);
                }
                default: {
                    break;
                }
                {
                }
            }
                ** GOTO lbl71
        }
        case 3: {
            switch (ac.f$g[0.f$E().ordinal()]) {
                case 1: {
                    v5 = KC.f$J();
                    while (false) {
                    }
                    v5.player.field_70181_x = 0.0;
                    if (CG.f$e()) ** GOTO lbl68
                    v6 = 0;
                    var3_3 = 1.0E-8 + 1.0E-8 * (1.0 + (double)KC.f$E(0.f$d).nextInt(1 + (KC.f$E(0.f$d).nextBoolean() != false ? KC.f$E(v6.f$d).nextInt(34) : KC.f$E(v6.f$d).nextInt(43))));
                    v7 = 0;
                    if (KC.f$d().player.field_70173_aa % 2 == 0) {
                        v7.f$E(KC.f$l().player.field_70163_u + var3_3);
                        v8 = 0;
                    } else {
                        v7.f$E(KC.f$k().player.field_70163_u);
                        lbl68:
                        // 2 sources

                        v8 = 0;
                    }
                    if (v8.f$e() == 0.f$B()) break;
                    KC.f$G().player.func_70107_b(KC.f$b().player.field_70165_t, 0.f$e(), KC.f$F().player.field_70161_v);
                }
            }
        }
        lbl71:
        // 10 sources

        default: {
            v1 = 0;
        }
    }
    if (((Boolean)KC.f$e(v1.f$d).f$E()).booleanValue()) {
        v9 = 0;
        if (KC.f$E(v9.f$d, KC.f$E(v9.f$d) + 1) >= 12 && !KC.f$D().player.func_70644_a(MobEffects.LEVITATION) && !KC.f$g().player.func_184613_cA() && KC.f$L().world.func_184144_a((Entity)KC.f$m().player, KC.f$f().player.func_174813_aQ().grow(0.0625).expand(0.0, -0.55, 0.0)).isEmpty()) {
            v10 = 0;
            v10.f$E(v10.f$e() - 0.03126);
            v10.f$a(true);
            if (KC.f$E(0.f$d) >= 22) {
                KC.f$E(0.f$d, 0);
            }
        }
    }
}

    public hd(KC kC) {
        0.f$d = kC;
    }
}
 */