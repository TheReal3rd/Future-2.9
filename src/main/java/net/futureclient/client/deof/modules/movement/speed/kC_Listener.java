package net.futureclient.client.deof.modules.movement.speed;

import net.futureclient.client.*;

public class kC_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.AC;
import net.futureclient.client.CG;
import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.dd;
import net.futureclient.client.q;
import net.futureclient.client.uA;
import net.futureclient.client.wG;
import net.minecraft.entity.Entity;

public class kC
extends Ha<Ee> {
    public final uA f$d;

    public kC(uA uA2) {
        0.f$d = uA2;
    }

@Override
public void f$E(Ee 0) {
    if (!((Boolean) uA.f$a(0.f$d).f$E()).booleanValue() && (CG.f$E() || CG.f$E(true) || uA.f$gb().player.func_70617_f_() || uA.f$hA().player.func_70094_T())) {
        uA.f$a(0.f$d, 0.0);
        uA.f$a(0.f$d, true);
        return;
    }
    if (uA.f$K(0.f$d)) {
        uA.f$a(0.f$d, 0.0);
        uA.f$a(0.f$d, false);
        return;
    }
    switch (AC.f$g[((dd)0.f$d.f$K.f$E()).ordinal()]) lbl-1000:
    // 2 sources

    {
        case 1: {
            if (false) ** GOTO lbl-1000
            if (!uA.f$E(0.f$d).f$E(100L)) {
                return;
            }
            if (((Boolean)uA.f$E(0.f$d).f$E()).booleanValue()) {
                ((q)((Y)uA.f$gc()).getTimer()).f$E(1.0888f);
            }
            if (uA.f$Xb().player.field_70123_F) ** GOTO lbl44
            if (wG.f$E(uA.f$aC().player.field_70163_u - (double)((int)uA.f$hb().player.field_70163_u), 3) == wG.f$E(0.4, 3)) {
                uA.f$qA().player.field_70181_x = 0.31 + Pg.f$E();
                0.f$a(uA.f$qA().player.field_70181_x);
                v0 = 0;
            } else if (wG.f$E(uA.f$qd().player.field_70163_u - (double)((int)uA.f$ec().player.field_70163_u), 3) == wG.f$E(0.71, 3)) {
                uA.f$jB().player.field_70181_x = 0.04 + Pg.f$E();
                0.f$a(uA.f$jB().player.field_70181_x);
                v0 = 0;
            } else if (wG.f$E(uA.f$Id().player.field_70163_u - (double)((int)uA.f$Dc().player.field_70163_u), 3) == wG.f$E(0.75, 3)) {
                uA.f$pd().player.field_70181_x = -0.2 - Pg.f$E();
                0.f$a(uA.f$pd().player.field_70181_x);
                v0 = 0;
            } else if (wG.f$E(uA.f$KC().player.field_70163_u - (double)((int)uA.f$bc().player.field_70163_u), 3) == wG.f$E(0.55, 3)) {
                uA.f$PC().player.field_70181_x = -0.14 + Pg.f$E();
                0.f$a(uA.f$PC().player.field_70181_x);
                v0 = 0;
            } else {
                if (wG.f$E(uA.f$LC().player.field_70163_u - (double)((int)uA.f$XC().player.field_70163_u), 3) == wG.f$E(0.41, 3)) {
                    uA.f$eB().player.field_70181_x = -0.2 + Pg.f$E();
                    0.f$a(uA.f$eB().player.field_70181_x);
                }
                lbl44:
                // 4 sources

                v0 = 0;
            }
            if (uA.f$M(v0.f$d) == 1 && (uA.f$qb().player.field_191988_bg != 0.0f || uA.f$OB().player.field_70702_br != 0.0f)) {
                uA.f$a(0.f$d, 1.35 * Pg.f$a() - 0.01);
                v1 = 0;
            } else if (uA.f$M(0.f$d) == 2 && (uA.f$Qd().player.field_191988_bg != 0.0f || uA.f$FA().player.field_70702_br != 0.0f)) {
                uA.f$Jb().player.field_70181_x = (CG.f$e() != false ? 0.2 : 0.3999) + Pg.f$E();
                0.f$a(uA.f$Jb().player.field_70181_x);
                v2 = 0;
                uA.f$a(v2.f$d, uA.f$a(v2.f$d) * (uA.f$B(0.f$d) != false ? 1.5685 : 1.3445));
                v1 = 0;
            } else if (uA.f$M(0.f$d) == 3) {
                var2_2 = 0.66 * (uA.f$E(0.f$d) - Pg.f$a());
                v3 = 0;
                uA.f$a(0.f$d, uA.f$E(v3.f$d) - var2_2);
                uA.f$E(v3.f$d, uA.f$B(0.f$d) == false);
                v1 = 0;
            } else {
                if (uA.f$hc().player.field_70122_E && uA.f$M(0.f$d) > 0) {
                    uA.f$A(0.f$d, uA.f$Hc().player.field_191988_bg != 0.0f || uA.f$Nc().player.field_70702_br != 0.0f ? 1 : 0);
                }
                v4 = 0;
                uA.f$a(v4.f$d, uA.f$E(v4.f$d) - uA.f$E(0.f$d) / 159.0);
                v1 = 0;
            }
            v5 = 0;
            Pg.f$E(v1, uA.f$a(v5.f$d, Math.max(uA.f$a(v5.f$d), Pg.f$a())));
            if (uA.f$Sb().player.field_191988_bg == 0.0f && uA.f$jc().player.field_70702_br == 0.0f) break;
            uA.f$C(0.f$d);
            return;
        }
        case 2: {
            if (!uA.f$pB().player.field_70122_E && (double)uA.f$H(0.f$d) != 3.0) break;
            if ((uA.f$vC().player.field_70123_F || uA.f$cb().player.field_191988_bg == 0.0f) && uA.f$Za().player.field_70702_br == 0.0f) ** GOTO lbl103
            v6 = 0;
            if ((double)uA.f$H(0.f$d) == 2.0) {
                uA.f$a(v6.f$d, uA.f$a(0.f$d) * 2.149);
                uA.f$K(0.f$d, 3);
                v7 = 0;
            } else if ((double)uA.f$H(v6.f$d) == 3.0) {
                v7 = 0;
                uA.f$K(0.f$d, 2);
                var2_3 = 0.66 * (uA.f$E(0.f$d) - Pg.f$a());
                v8 = 0;
                uA.f$a(v8.f$d, uA.f$E(v8.f$d) - var2_3);
            } else {
                if (CG.f$e() || uA.f$Ya().player.field_70124_G) {
                    uA.f$K(0.f$d, 1);
                }
                lbl103:
                // 4 sources

                v7 = 0;
            }
            v9 = 0;
            Pg.f$E(v7, uA.f$a(v9.f$d, Math.max(uA.f$a(v9.f$d), Pg.f$a())));
            return;
        }
        case 3: {
            if (!uA.f$E(0.f$d).f$E(100L)) {
                uA.f$B(0.f$d, 1);
                return;
            }
            if (uA.f$ta().player.field_191988_bg == 0.0f && uA.f$sa().player.field_70702_br == 0.0f) {
                uA.f$a(0.f$d, Pg.f$a());
            }
            if (wG.f$E(uA.f$za().player.field_70163_u - (double)((int)uA.f$Ua().player.field_70163_u), 3) == wG.f$E(0.4, 3)) {
                uA.f$Sa().player.field_70181_x = 0.31 + Pg.f$E();
                0.f$a(uA.f$Sa().player.field_70181_x);
            } else if (wG.f$E(uA.f$na().player.field_70163_u - (double)((int)uA.f$Xa().player.field_70163_u), 3) == wG.f$E(0.71, 3)) {
                uA.f$Pa().player.field_70181_x = 0.04 + Pg.f$E();
                0.f$a(uA.f$Pa().player.field_70181_x);
            } else if (wG.f$E(uA.f$ra().player.field_70163_u - (double)((int)uA.f$Na().player.field_70163_u), 3) == wG.f$E(0.75, 3)) {
                uA.f$xa().player.field_70181_x = -0.2 + Pg.f$E();
                0.f$a(uA.f$xa().player.field_70181_x);
            }
            var2_4 = uA.f$ua().world.func_184144_a((Entity)uA.f$Qa().player, uA.f$qa().player.func_174813_aQ().offset(0.0, -0.56, 0.0));
            if (var2_4.size() > 0 && wG.f$E(uA.f$oa().player.field_70163_u - (double)((int)uA.f$Va().player.field_70163_u), 3) == wG.f$E(0.55, 3)) {
                uA.f$pa().player.field_70181_x = -0.14 + Pg.f$E();
                0.f$a(uA.f$pa().player.field_70181_x);
            }
            if (uA.f$h(0.f$d) == 1 && uA.f$Ra().player.field_70124_G && (uA.f$Wa().player.field_191988_bg != 0.0f || uA.f$wa().player.field_70702_br != 0.0f)) ** GOTO lbl160
            if (uA.f$h(0.f$d) == 2 && uA.f$va().player.field_70124_G && (uA.f$Oa().player.field_191988_bg != 0.0f || uA.f$Ta().player.field_70702_br != 0.0f)) ** GOTO lbl153
            if (uA.f$h(0.f$d) != 3) ** GOTO lbl139
            var3_5 = 0.66 * (uA.f$E(0.f$d) - Pg.f$a());
            v10 = 0;
            v11 = v10;
            uA.f$a(0.f$d, uA.f$E(v10.f$d) - var3_5);
                ** GOTO lbl164
            lbl139:
            // 1 sources

            if (!uA.f$ya().player.field_70122_E || uA.f$h(0.f$d) <= 0) ** GOTO lbl148
            v12 = 0;
            if (1.35 * Pg.f$a() - 0.01 > uA.f$a(0.f$d)) {
                uA.f$B(v12.f$d, 0);
                v13 = 0;
            } else {
                uA.f$B(v12.f$d, uA.f$ca().player.field_191988_bg == 0.0f && uA.f$ka().player.field_70702_br == 0.0f ? 0 : 1);
                lbl148:
                // 2 sources

                v13 = 0;
            }
            uA.f$a(v13.f$d, uA.f$E(0.f$d) - uA.f$E(0.f$d) / 159.0);
            v11 = 0;
                ** GOTO lbl164
            lbl153:
            // 1 sources

            uA.f$ia().player.field_70181_x = (CG.f$e() != false ? 0.2 : 0.4) + Pg.f$E();
            0.f$a(uA.f$ia().player.field_70181_x);
            v14 = 0;
            v11 = v14;
            uA.f$a(0.f$d, uA.f$a(v14.f$d) * 2.149);
                ** GOTO lbl164
            lbl160:
            // 1 sources

            v15 = 0;
            v11 = v15;
            uA.f$a(v15.f$d, 2.0 * Pg.f$a() - 0.01);
            lbl164:
            // 4 sources

            if (uA.f$h(v11.f$d) > 8) {
                uA.f$a(0.f$d, Pg.f$a());
            }
            v16 = 0;
            uA.f$a(v16.f$d, Math.max(uA.f$a(v16.f$d), Pg.f$a()));
            if (uA.f$h(v16.f$d) > 0) {
                Pg.f$E(0, uA.f$a(0.f$d));
            }
            if (uA.f$ea().player.field_191988_bg == 0.0f && uA.f$Ia().player.field_70702_br == 0.0f) break;
            uA.f$A(0.f$d);
            return;
        }
        case 4: {
            if (!uA.f$E(0.f$d).f$E(100L)) {
                uA.f$e(0.f$d, 4);
                return;
            }
            if (wG.f$E(uA.f$Ja().player.field_70163_u - (double)((int)uA.f$Ma().player.field_70163_u), 3) == wG.f$E(0.138, 3)) {
                uA.f$ha().player.field_70181_x -= 0.08 + Pg.f$E();
                v17 = 0;
                v17.f$a(v17.f$a() - (0.0931 + Pg.f$E()));
                uA.f$da().player.field_70163_u -= 0.0931 + Pg.f$E();
            }
            if ((double)uA.f$K(0.f$d) != 2.0 || uA.f$Ca().player.field_191988_bg == 0.0f && uA.f$Da().player.field_70702_br == 0.0f) {
                if ((double)uA.f$K(0.f$d) == 3.0) {
                    var3_6 = 0.66 * (uA.f$E(0.f$d) - Pg.f$a());
                    v18 = 0;
                    v19 = v18;
                    uA.f$a(0.f$d, uA.f$E(v18.f$d) - var3_6);
                } else {
                    if (uA.f$Ka().player.field_70122_E) {
                        uA.f$e(0.f$d, 1);
                    }
                    v20 = 0;
                    v19 = v20;
                    uA.f$a(v20.f$d, uA.f$E(v20.f$d) - uA.f$E(0.f$d) / 159.0);
                }
            } else {
                uA.f$Aa().player.field_70181_x = (CG.f$e() != false ? 0.2 : 0.4) + Pg.f$E();
                0.f$a(uA.f$Aa().player.field_70181_x);
                v21 = 0;
                v19 = v21;
                uA.f$a(0.f$d, uA.f$a(v21.f$d) * 2.149);
            }
            uA.f$a(v19.f$d, Math.max(uA.f$a(0.f$d), Pg.f$a()));
            v22 = 0;
            Pg.f$E(0, uA.f$a(v22.f$d));
            uA.f$B(v22.f$d);
            return;
        }
        case 5: {
            if (uA.f$ja().player.field_191988_bg == 0.0f && uA.f$fa().player.field_70702_br == 0.0f) {
                return;
            }
            if (((Boolean)uA.f$E(0.f$d).f$E()).booleanValue()) {
                ((q)((Y)uA.f$Ba()).getTimer()).f$E(1.0888f);
            }
            if (uA.f$M(0.f$d) == 1 && (uA.f$ma().player.field_191988_bg != 0.0f || uA.f$Fa().player.field_70702_br != 0.0f)) {
                uA.f$a(0.f$d, 1.35 * Pg.f$a() - 0.01);
                v23 = 0;
            } else if (uA.f$M(0.f$d) == 2 && (uA.f$aa().player.field_191988_bg != 0.0f || uA.f$Ha().player.field_70702_br != 0.0f)) {
                uA.f$Ga().player.field_70181_x = (CG.f$e() != false ? 0.3999 : 0.3999) + Pg.f$E();
                0.f$a(uA.f$Ga().player.field_70181_x);
                v24 = 0;
                uA.f$a(v24.f$d, uA.f$a(v24.f$d) * (uA.f$B(0.f$d) != false ? 1.6835 : 1.395));
                v23 = 0;
            } else if (uA.f$M(0.f$d) == 3) {
                var3_7 = 0.66 * (uA.f$E(0.f$d) - Pg.f$a());
                v25 = 0;
                uA.f$a(0.f$d, uA.f$E(v25.f$d) - var3_7);
                uA.f$E(v25.f$d, uA.f$B(0.f$d) == false);
                v23 = 0;
            } else {
                var3_8 = uA.f$La().world.func_184144_a((Entity)uA.f$la().player, uA.f$Ea().player.func_174813_aQ().offset(0.0, uA.f$ba().player.field_70181_x, 0.0));
                if ((var3_8.size() > 0 || uA.f$ga().player.field_70124_G) && uA.f$M(0.f$d) > 0) {
                    uA.f$A(0.f$d, uA.f$R().player.field_191988_bg != 0.0f || uA.f$O().player.field_70702_br != 0.0f ? 1 : 0);
                }
                v26 = 0;
                uA.f$a(v26.f$d, uA.f$E(v26.f$d) - uA.f$E(0.f$d) / 159.0);
                v23 = 0;
            }
            v27 = 0;
            Pg.f$E(v23, uA.f$a(v27.f$d, Math.max(uA.f$a(v27.f$d), Pg.f$a())));
            if (uA.f$Z().player.field_191988_bg == 0.0f && uA.f$T().player.field_70702_br == 0.0f) break;
            uA.f$C(0.f$d);
            return;
        }
        case 6: {
            if (!uA.f$E(0.f$d).f$E(100L)) {
                uA.f$a(0.f$d, 1);
                return;
            }
            if (uA.f$z().player.field_191988_bg == 0.0f && uA.f$r().player.field_70702_br == 0.0f) {
                uA.f$a(0.f$d, Pg.f$a());
            }
            if (uA.f$e(0.f$d) != 1 || !uA.f$y().player.field_70124_G || uA.f$s().player.field_191988_bg == 0.0f && uA.f$S().player.field_70702_br == 0.0f) ** GOTO lbl270
            v28 = 0;
            v29 = v28;
            uA.f$a(v28.f$d, 0.25 + Pg.f$a() - 0.01);
                ** GOTO lbl298
            lbl270:
            // 1 sources

            if (uA.f$e(0.f$d) != 2 || !uA.f$N().player.field_70124_G || uA.f$X().player.field_191988_bg == 0.0f && uA.f$u().player.field_70702_br == 0.0f) ** GOTO lbl278
            uA.f$V().player.field_70181_x = (CG.f$e() != false ? 0.2 : 0.4) + Pg.f$E();
            0.f$a(uA.f$V().player.field_70181_x);
            v30 = 0;
            v29 = v30;
            uA.f$a(0.f$d, uA.f$a(v30.f$d) * 2.149);
                ** GOTO lbl298
            lbl278:
            // 1 sources

            if (uA.f$e(0.f$d) != 3) ** GOTO lbl285
            var3_9 = 0.66 * (uA.f$E(0.f$d) - Pg.f$a());
            v31 = 0;
            v29 = v31;
            uA.f$a(0.f$d, uA.f$E(v31.f$d) - var3_9);
                ** GOTO lbl298
            lbl285:
            // 1 sources

            if (!uA.f$q().player.field_70122_E || uA.f$e(0.f$d) <= 0) ** GOTO lbl294
            v32 = 0;
            if (1.35 * Pg.f$a() - 0.01 > uA.f$a(0.f$d)) {
                uA.f$a(v32.f$d, 0);
                v33 = 0;
            } else {
                uA.f$a(v32.f$d, uA.f$x().player.field_191988_bg == 0.0f && uA.f$p().player.field_70702_br == 0.0f ? 0 : 1);
                lbl294:
                // 2 sources

                v33 = 0;
            }
            uA.f$a(v33.f$d, uA.f$E(0.f$d) - uA.f$E(0.f$d) / 159.0);
            v29 = 0;
            lbl298:
            // 4 sources

            uA.f$a(v29.f$d, Math.max(uA.f$a(0.f$d), Pg.f$a()));
            if (uA.f$e(0.f$d) > 0) {
                Pg.f$E(0, uA.f$a(0.f$d));
            }
            if (uA.f$n().player.field_191988_bg == 0.0f && uA.f$o().player.field_70702_br == 0.0f) break;
            uA.f$a(0.f$d);
            return;
        }
        case 7: {
            Pg.f$E(0, uA.f$E(0.f$d).f$E().doubleValue() / 10.0);
        }
    }
}
}
 */