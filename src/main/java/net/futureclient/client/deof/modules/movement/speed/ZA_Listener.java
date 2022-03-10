package net.futureclient.client.deof.modules.movement.speed;

import net.futureclient.client.*;

public class ZA_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.KC;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.bE;
import net.futureclient.client.dd;
import net.futureclient.client.kH;
import net.futureclient.client.q;
import net.futureclient.client.uA;

public class ZA
extends Ha<Pf> {
    public final uA f$d;

@Override
public void f$E(Pf pf) {
    0.f$d.f$a(String.format("Speed \u00a77[\u00a7F%s\u00a77]", 0.f$d.f$K.f$E()));
    bE bE2 = (bE) kH.f$E().f$E().f$E(bE.class);
    KC kC = (KC)kH.f$E().f$E().f$E(KC.class);
    if (bE2 != null && bE2.f$E()) {
        return;
    }
    if (kC != null && kC.f$E()) {
        return;
    }
    if (uA.f$e(0.f$d)) {
        uA.f$w().player.field_70159_w = 0.0;
        uA.f$v().player.field_70179_y = 0.0;
        uA.f$a(0.f$d, 0.0);
        return;
    }
    switch ((dd)((Object)0.f$d.f$K.f$E())) {
        case f$b:
        case f$i: {
            double d = uA.f$W().player.field_70165_t - uA.f$Y().player.field_70169_q;
            double d2 = uA.f$t().player.field_70161_v - uA.f$P().player.field_70166_s;
            double d3 = d;
            double d4 = d2;
            uA.f$E(0.f$d, Math.sqrt(d3 * d3 + d4 * d4));
            return;
        }
        case f$j: {
            switch (pf.f$E()) {
                case f$M: {
                    if (!uA.f$E(0.f$d).f$E(100L)) {
                        return;
                    }
                    if (!((Boolean)uA.f$a(0.f$d).f$E()).booleanValue() && (CG.f$E() || CG.f$E(true) || uA.f$Q().player.func_70617_f_() || uA.f$U().player.func_70094_T())) return;
                    if (uA.f$J().player.field_191988_bg != 0.0f || uA.f$d().player.field_70702_br != 0.0f) {
                        if (uA.f$l().player.movementInput.jump || !uA.f$k().player.field_70122_E) return;
                        if (uA.f$b().player.field_70173_aa % 2 == 0) {
                            Pf pf2 = pf;
                            pf2.f$E(pf2.f$e() + (CG.f$e() ? 0.2 : 0.424999997) + Pg.f$E());
                        }
                        if (((Boolean)uA.f$E(0.f$d).f$E()).booleanValue()) {
                            ((q)((Y)uA.f$G()).getTimer()).f$E(uA.f$F().player.field_70173_aa % 3 == 0 ? 1.3f : 1.0f);
                        }
                        uA.f$D().player.field_70159_w *= uA.f$g().player.field_70173_aa % 2 != 0 ? 2.0 : 0.705;
                        uA.f$m().player.field_70179_y *= uA.f$f().player.field_70173_aa % 2 != 0 ? 2.0 : 0.705;
                        return;
                    }
                    uA.f$L().player.field_70159_w = 0.0;
                    uA.f$i().player.field_70179_y = 0.0;
                    return;
                }
            }
            return;
        }
        case f$C: {
            switch (pf.f$E()) {
                case f$M: {
                    if ((double)uA.f$H(0.f$d) == 3.0) {
                        Pf pf3 = pf;
                        pf3.f$E(pf3.f$e() + (CG.f$e() ? 0.2 : 0.4) + Pg.f$E());
                    }
                    double d = uA.f$c().player.field_70165_t - uA.f$I().player.field_70169_q;
                    double d5 = uA.f$j().player.field_70161_v - uA.f$M().player.field_70166_s;
                    double d6 = d;
                    double d7 = d5;
                    uA.f$E(0.f$d, Math.sqrt(d6 * d6 + d7 * d7));
                    return;
                }
            }
            return;
        }
        case f$K:
        case f$I:
        case f$e: {
            switch (pf.f$E()) {
                case f$M: {
                    double d = uA.f$C().player.field_70165_t - uA.f$H().player.field_70169_q;
                    double d8 = uA.f$h().player.field_70161_v - uA.f$A().player.field_70166_s;
                    double d9 = d;
                    double d10 = d8;
                    uA.f$E(0.f$d, Math.sqrt(d9 * d9 + d10 * d10));
                    return;
                }
            }
            return;
        }
        case f$a: {
            switch (pf.f$E()) {
                case f$M: {
                    ZA zA;
                    ZA zA2 = 0;
                    if (uA.f$a(0.f$d)) {
                        uA.f$E(zA2.f$d, uA.f$E(0.f$d) + 1);
                        zA = 0;
                    } else {
                        uA.f$E(zA2.f$d, 0);
                        zA = 0;
                    }
                    if (uA.f$E(zA.f$d) != 4) return;
                    Pf pf4 = pf;
                    pf4.f$E(pf4.f$e() + (CG.f$e() ? 0.2 : 0.4) + Pg.f$E());
                    return;
                }
                case f$g: {
                    if (uA.f$E(0.f$d) == 3) {
                        uA.f$K().player.field_70159_w *= 3.25;
                        uA.f$B().player.field_70179_y *= 3.25;
                        return;
                    }
                    if (uA.f$E(0.f$d) != 4) return;
                    uA.f$e().player.field_70159_w /= 1.4;
                    uA.f$a().player.field_70179_y /= 1.4;
                    uA.f$E(0.f$d, 2);
                }
            }
            return;
        }
    }
}

    public ZA(uA uA2) {
        0.f$d = uA2;
    }
}
 */