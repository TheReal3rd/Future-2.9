package net.futureclient.client.deof.modules.movement.flight;

import net.futureclient.client.BA;
import net.futureclient.client.CG;
import net.futureclient.client.KC;
import net.futureclient.client.Pg;

public class cB_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.BA;
import net.futureclient.client.CG;
import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.KC;
import net.futureclient.client.Pg;
import net.futureclient.client.s;

public class cB
extends Ha<Ee> {
    public final KC f$d;

public cB(KC kC) {
    void 0;
    0.f$d = 0;
}

    @Override
    public void f$E(Ee ee) {
        switch ((BA)((Object)KC.f$E(0.f$d).f$E())) {
            case f$K: {
                Ee ee2 = ee;
                while (false) {
                }
                ee2.f$e(ee2.f$e() * ((s)KC.f$a(0.f$d)).f$E().doubleValue());
                ee2.f$E(ee2.f$E() * ((s)KC.f$a(0.f$d)).f$E().doubleValue());
                return;
            }
            case f$g: {
                if (KC.f$H().player.field_70122_E || CG.f$E()) break;
                Pg.f$E(ee, 0.4521096646785736);
                return;
            }
            case f$i: {
                if (!KC.f$E(0.f$d)) break;
                Pg.f$E(ee, KC.f$E(0.f$d).f$E().doubleValue());
                return;
            }
            case f$b: {
                Ee ee3;
                double d = ((s)KC.f$a(0.f$d)).f$E().doubleValue() / 10.0;
                if (KC.f$h().player.movementInput.jump) {
                    KC.f$A().player.field_70181_x = d;
                    ee.f$a(KC.f$A().player.field_70181_x);
                    ee3 = ee;
                } else {
                    Ee ee4 = ee;
                    if (KC.f$K().player.movementInput.sneak) {
                        KC.f$B().player.field_70181_x = -d;
                        ee4.f$a(KC.f$B().player.field_70181_x);
                        ee3 = ee;
                    } else {
                        KC.f$e().player.field_70181_x = 0.0;
                        ee4.f$a(0.0);
                        if (!KC.f$a().player.field_70124_G && ((Boolean)KC.f$B(0.f$d).f$E()).booleanValue()) {
                            ee.f$a(KC.f$E().player.field_70181_x -= KC.f$K(0.f$d).f$E().doubleValue());
                        }
                        ee3 = ee;
                    }
                }
                Pg.f$E(ee3, d);
                return;
            }
            case f$j: {
                Pg.f$E(ee, Pg.f$a());
            }
        }
    }
}
 */