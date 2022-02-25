package net.futureclient.client;

import net.futureclient.client.RF;

public class RD
extends RF {
    public RD() {
        RD rD;
    }
}
package net.futureclient.client;

import net.futureclient.client.BA;
import net.futureclient.client.Ha;
import net.futureclient.client.KC;
import net.futureclient.client.ME;
import net.minecraft.client.Minecraft;

public class Rd
extends Ha<ME> {
    public final KC f$d;

    public Rd(KC kC) {
        0.f$d = kC;
    }

    @Override
    public void f$E(ME mE) {
        0.f$d.f$a(String.format("Flight \u00a77[\u00a7F%s\u00a77]", KC.f$E(0.f$d).f$E()));
        switch ((BA)((Object)KC.f$E(0.f$d).f$E())) {
            case f$g: {
                Minecraft minecraft = KC.f$i();
                while (false) {
                }
                if ((float)minecraft.player.field_70737_aN != 10.0f) break;
                KC.f$c().player.field_70181_x = KC.f$B(0.f$d).f$E().doubleValue();
                return;
            }
            case f$i: {
                if (!(KC.f$I().player.field_70163_u <= KC.f$E(0.f$d)) || !KC.f$E(0.f$d).f$E(200L)) break;
                KC.f$j().player.func_70664_aZ();
                Rd rd = 0;
                KC.f$E(rd.f$d).f$a();
                KC.f$E(rd.f$d, KC.f$E(0.f$d) - KC.f$e(0.f$d).f$E().doubleValue());
                KC.f$E(0.f$d, true);
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Bc;
import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.Pg;
import net.futureclient.client.fd;
import net.futureclient.client.hA;
import net.futureclient.client.wG;
import net.minecraft.entity.Entity;

public class rd
extends Ha<Ee> {
    public final fd f$d;

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(Ee 0) {
        switch (Bc.f$g[((hA)fd.f$E(0.f$d).f$E()).ordinal()]) {
            case 1: {
                v0 = fd.f$ld();
                while (false) {
                }
                if (v0.player.field_70702_br <= 0.0f && fd.f$Hb().player.field_191988_bg <= 0.0f) {
                    fd.f$B(0.f$d, 1);
                }
                if (wG.f$E(fd.f$wA().player.field_70163_u - (double)((int)fd.f$Ib().player.field_70163_u), 3) == wG.f$E(0.943, 3)) {
                    var2_2 = fd.f$Tc().player;
                    var2_2.field_70181_x -= 0.03;
                    0.f$i -= 0.03;
                }
                if (fd.f$h(0.f$d) == 1 && (fd.f$bC().player.field_191988_bg != 0.0f || fd.f$wb().player.field_70702_br != 0.0f)) {
                    v1 = 0;
                    v2 = v1;
                    fd.f$B(v1.f$d, 2);
                    v3 = 0;
                    fd.f$e(v3.f$d, fd.f$E(v3.f$d).f$E().doubleValue() * Pg.f$a() - 0.01);
                } else if (fd.f$h(0.f$d) == 2) {
                    fd.f$ac().player.field_70181_x = 0.424;
                    0.f$i = 0.424;
                    v4 = 0;
                    fd.f$B(0.f$d, 3);
                    v2 = v4;
                    fd.f$e(0.f$d, fd.f$e(v4.f$d) * 2.149802);
                } else if (fd.f$h(0.f$d) == 3) {
                    v5 = 0;
                    fd.f$B(0.f$d, 4);
                    v2 = v5;
                    fd.f$a(v5.f$d, 0.66 * (fd.f$a(0.f$d) - Pg.f$a()));
                    v6 = 0;
                    fd.f$e(v6.f$d, fd.f$a(v6.f$d) - fd.f$E(0.f$d));
                } else {
                    if (fd.f$fB().world.func_184144_a((Entity)fd.f$Mc().player, fd.f$lc().player.func_174813_aQ().offset(0.0, fd.f$wB().player.field_70181_x, 0.0)).size() > 0 || fd.f$Qc().player.field_70124_G) {
                        fd.f$B(0.f$d, 1);
                    }
                    v7 = 0;
                    v2 = v7;
                    fd.f$e(v7.f$d, fd.f$a(v7.f$d) - fd.f$a(0.f$d) / 159.0);
                }
                fd.f$e(v2.f$d, Math.max(fd.f$e(0.f$d), Pg.f$a()));
                var2_2 = fd.f$Ac().player.movementInput;
                var2_3 = var2_2.moveForward;
                var3_5 = var2_2.moveStrafe;
                var4_6 = fd.f$ob().player.field_70177_z;
                if (var2_3 != 0.0f || var3_5 != 0.0f) ** GOTO lbl62
                v8 = var4_6;
                v9 = 0;
                v9.f$j = 0.0;
                v9.f$M = 0.0;
                ** GOTO lbl79
lbl62:
                // 1 sources

                if (var2_3 == 0.0f) ** GOTO lbl78
                if (var3_5 >= 1.0f) {
                    var4_6 += (float)(var2_3 > 0.0f ? -45 : 45);
                    var3_5 = 0.0f;
                    v10 = var2_3;
                } else {
                    if (var3_5 <= -1.0f) {
                        var4_6 += (float)(var2_3 > 0.0f ? 45 : -45);
                        var3_5 = 0.0f;
                    }
                    v10 = var2_3;
                }
                if (v10 > 0.0f) {
                    var2_3 = 1.0f;
                    v8 = var4_6;
                } else {
                    if (var2_3 < 0.0f) {
                        var2_3 = -1.0f;
                    }
lbl78:
                    // 4 sources

                    v8 = var4_6;
                }
lbl79:
                // 3 sources

                var5_7 = Math.cos(Math.toRadians(v8 + 90.0f));
                var7_10 = Math.sin(Math.toRadians(var4_6 + 90.0f));
                v11 = 0;
                v11.f$j = (double)var2_3 * fd.f$e(0.f$d) * var5_7 + (double)var3_5 * fd.f$e(0.f$d) * var7_10;
                v11.f$M = (double)var2_3 * fd.f$e(0.f$d) * var7_10 - (double)var3_5 * fd.f$e(0.f$d) * var5_7;
                return;
            }
            case 2: {
                if (!fd.f$a(0.f$d)) ** GOTO lbl193
                if (fd.f$cB().player.field_70122_E) {
                    fd.f$E(0.f$d).f$a();
                }
                if (wG.f$E(fd.f$ZB().player.field_70163_u - (double)((int)fd.f$TB().player.field_70163_u), 3) == wG.f$E(0.41, 3)) {
                    fd.f$md().player.field_70181_x = 0.0;
                }
                if (fd.f$FC().player.field_70702_br <= 0.0f && fd.f$Jd().player.field_191988_bg <= 0.0f) {
                    fd.f$e(0.f$d, 1);
                }
                if (wG.f$E(fd.f$UC().player.field_70163_u - (double)((int)fd.f$oC().player.field_70163_u), 3) == wG.f$E(0.943, 3)) {
                    fd.f$yA().player.field_70181_x = 0.0;
                }
                if (fd.f$A(0.f$d) != 1) ** GOTO lbl107
                if (fd.f$Sd().player.field_191988_bg != 0.0f || fd.f$Ed().player.field_70702_br != 0.0f) ** GOTO lbl100
                v12 = 0;
                ** GOTO lbl108
lbl100:
                // 1 sources

                v13 = 0;
                v14 = v13;
                fd.f$e(v13.f$d, 2);
                fd.f$e(0.f$d, 4.515 * Pg.f$a() - 0.01);
                ** GOTO lbl140
lbl107:
                // 1 sources

                v12 = 0;
lbl108:
                // 2 sources

                if (fd.f$A(v12.f$d) == 2) {
                    v15 = 0;
                    fd.f$e(v15.f$d, 3);
                    if (!((Boolean)fd.f$E(v15.f$d).f$E()).booleanValue()) {
                        fd.f$gb().player.field_70181_x = 0.424;
                    }
                    0.f$i = 0.424;
                    v16 = 0;
                    v14 = v16;
                    fd.f$e(0.f$d, fd.f$e(v16.f$d) * 2.149802);
                } else if (fd.f$A(0.f$d) == 3) {
                    var5_8 = 0.66 * (fd.f$a(0.f$d) - Pg.f$a());
                    v17 = 0;
                    fd.f$e(0.f$d, 4);
                    v14 = v17;
                    fd.f$e(0.f$d, fd.f$a(v17.f$d) - var5_8);
                } else {
                    var5_8 = 0.0;
                    if (fd.f$aC().world.func_184144_a((Entity)fd.f$hA().player, fd.f$Xb().player.func_174813_aQ().offset(0.0, fd.f$gc().player.field_70181_x, 0.0)).size() <= 0 && !fd.f$hb().player.field_70124_G) {
                        v18 = 0;
                    } else {
                        v19 = 0;
                        v18 = v19;
                        fd.f$e(v19.f$d, 1);
                    }
                    fd.f$e(v18.f$d, fd.f$a(0.f$d) - fd.f$a(0.f$d) / 159.0);
                    v14 = 0;
                }
lbl140:
                // 4 sources

                fd.f$e(v14.f$d, Math.max(fd.f$e(0.f$d), Pg.f$a()));
                var5_9 = fd.f$qA().player.movementInput.moveForward;
                var9_12 = fd.f$qd().player.movementInput.moveStrafe;
                var2_4 = fd.f$ec().player.field_70177_z;
                if (var5_9 != 0.0f || var9_12 != 0.0f) ** GOTO lbl151
                v20 = var2_4;
                v21 = 0;
                v21.f$j = 0.0;
                v21.f$M = 0.0;
                ** GOTO lbl168
lbl151:
                // 1 sources

                if (var5_9 == 0.0f) ** GOTO lbl167
                if (var9_12 >= 1.0f) {
                    var2_4 += (float)(var5_9 > 0.0f ? -45 : 45);
                    var9_12 = 0.0f;
                    v22 = var5_9;
                } else {
                    if (var9_12 <= -1.0f) {
                        var2_4 += (float)(var5_9 > 0.0f ? 45 : -45);
                        var9_12 = 0.0f;
                    }
                    v22 = var5_9;
                }
                if (v22 > 0.0f) {
                    var5_9 = 1.0f;
                    v20 = var2_4;
                } else {
                    if (var5_9 < 0.0f) {
                        var5_9 = -1.0f;
                    }
lbl167:
                    // 4 sources

                    v20 = var2_4;
                }
lbl168:
                // 3 sources

                var7_11 = Math.cos(Math.toRadians(v20 + 90.0f));
                var10_13 = Math.sin(Math.toRadians(var2_4 + 90.0f));
                v23 = var5_9;
                0.f$j = (double)var5_9 * fd.f$e(0.f$d) * var7_11 + (double)var9_12 * fd.f$e(0.f$d) * var10_13;
                0.f$M = (double)v23 * fd.f$e(0.f$d) * var10_13 - (double)var9_12 * fd.f$e(0.f$d) * var7_11;
                if (v23 == 0.0f && var9_12 == 0.0f) {
                    v24 = 0;
                    v24.f$j = 0.0;
                    v24.f$M = 0.0;
                } else if (var5_9 != 0.0f) {
                    if (var9_12 >= 1.0f) {
                        var2_4 += (float)(var5_9 > 0.0f ? -45 : 45);
                        var9_12 = 0.0f;
                        v25 = var5_9;
                    } else {
                        if (var9_12 <= -1.0f) {
                            var2_4 += (float)(var5_9 > 0.0f ? 45 : -45);
                            var9_12 = 0.0f;
                        }
                        v25 = var5_9;
                    }
                    if (v25 > 0.0f) {
                        var5_9 = 1.0f;
                    } else if (var5_9 < 0.0f) {
                        var5_9 = -1.0f;
                    }
                }
lbl193:
                // 8 sources

                if (fd.f$jB().player.field_70122_E) {
                    v26 = 0;
                    v27 = v26;
                    fd.f$K(v26.f$d);
                } else {
                    if (!fd.f$Id().player.field_70122_E && fd.f$B(0.f$d) != 0) {
                        fd.f$e(0.f$d);
                    }
                    v27 = 0;
                }
                if (((Boolean)fd.f$E(v27.f$d).f$E()).booleanValue()) {
                    if (fd.f$E(0.f$d).f$E(35L)) {
                        fd.f$a(0.f$d, true);
                    }
                    v28 = 0;
                    fd.f$E(v28.f$d).f$E(2200L);
                    if (fd.f$E(v28.f$d).f$E(2490L)) {
                        fd.f$a(0.f$d, false);
                        fd.f$E(0.f$d, false);
                        fd.f$Dc().player.field_70159_w *= 0.0;
                        fd.f$pd().player.field_70179_y *= 0.0;
                    }
                    if (!fd.f$E(0.f$d).f$E(2820L)) break;
                    fd.f$E(0.f$d, true);
                    fd.f$KC().player.field_70159_w *= 0.0;
                    fd.f$bc().player.field_70179_y *= 0.0;
                    fd.f$E(0.f$d).f$a();
                    return;
                }
                if (((Boolean)fd.f$E(0.f$d).f$E()).booleanValue()) break;
                if (fd.f$E(0.f$d).f$E(480L)) {
                    fd.f$PC().player.field_70159_w *= 0.0;
                    fd.f$LC().player.field_70179_y *= 0.0;
                    fd.f$E(0.f$d, false);
                }
                if (fd.f$E(0.f$d).f$E(550L)) {
                    fd.f$XC().player.field_70159_w *= 0.0;
                    fd.f$eB().player.field_70179_y *= 0.0;
                    fd.f$E(0.f$d, false);
                }
                if (fd.f$E(0.f$d).f$E(650L)) {
                    fd.f$qb().player.field_70159_w *= 0.0;
                    fd.f$OB().player.field_70179_y *= 0.0;
                    fd.f$E(0.f$d, false);
                }
                if (fd.f$E(0.f$d).f$E(750L)) {
                    fd.f$Qd().player.field_70159_w *= 0.0;
                    fd.f$FA().player.field_70179_y *= 0.0;
                    fd.f$E(0.f$d, false);
                }
                if (!fd.f$E(0.f$d).f$E(780L)) break;
                fd.f$Jb().player.field_70159_w *= 0.0;
                fd.f$hc().player.field_70179_y *= 0.0;
                fd.f$E(0.f$d, true);
                fd.f$E(0.f$d).f$a();
            }
        }
    }

    public rd(fd fd2) {
        0.f$d = fd2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.SE;
import net.futureclient.client.qF;

public class rD
extends Ha<SE> {
    public final qF f$d;

    public rD(qF qF2) {
        0.f$d = qF2;
    }

    @Override
    public void f$E(SE sE) {
        qF.f$a(0.f$d, sE.f$a());
    }
}
