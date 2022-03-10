package net.futureclient.client.deof.modules.miscellaneous.announcer;

public class sF_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.RF;

public class SF
extends RF {
    public SF() {
        SF sF;
    }
}
package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.UF;

public class sF
extends Ha<ME> {
    public final UF f$d;

    public sF(UF uF) {
        0.f$d = uF;
    }

    @Override
    public void f$E(ME mE) {
        block13: {
            sF sF2;
            block19: {
                block18: {
                    block17: {
                        sF sF3;
                        block16: {
                            block15: {
                                block14: {
                                    block12: {
                                        if (UF.f$a(0.f$d).isEmpty() && UF.f$e(0.f$d).isEmpty() && UF.f$E(0.f$d).isEmpty()) {
                                            UF.f$a(0.f$d).f$a();
                                        }
                                        if (UF.f$B().world == null && UF.f$e().player == null) {
                                            return;
                                        }
                                        if (UF.f$e(0.f$d).isEmpty()) break block12;
                                        if (UF.f$a(0.f$d).f$E(9000L)) {
                                            UF.f$E(0.f$d, new StringBuilder().insert(0, "I just mined ").append(UF.f$e(0.f$d).get(UF.f$e(0.f$d).entrySet().iterator().next().getKey())).append(" ").append((String)UF.f$e(0.f$d).entrySet().iterator().next().getKey()).append("!").toString());
                                            UF.f$e(0.f$d).remove(UF.f$e(0.f$d).entrySet().iterator().next().getKey());
                                            UF.f$a(0.f$d).f$a();
                                            return;
                                        }
                                        break block13;
                                    }
                                    sF sF4 = 0;
                                    UF.f$e(sF4.f$d).clear();
                                    if (UF.f$a(sF4.f$d).isEmpty()) break block14;
                                    if (!UF.f$a(0.f$d).f$E(9000L)) break block15;
                                    UF.f$E(0.f$d, new StringBuilder().insert(0, "I just placed ").append(UF.f$a(0.f$d).get(UF.f$a(0.f$d).entrySet().iterator().next().getKey())).append(" ").append((String)UF.f$a(0.f$d).entrySet().iterator().next().getKey()).append("!").toString());
                                    UF.f$a(0.f$d).remove(UF.f$a(0.f$d).entrySet().iterator().next().getKey());
                                    UF.f$a(0.f$d).f$a();
                                    sF3 = 0;
                                    break block16;
                                }
                                UF.f$a(0.f$d).clear();
                            }
                            sF3 = 0;
                        }
                        if (UF.f$E(sF3.f$d).isEmpty()) break block17;
                        if (!UF.f$a(0.f$d).f$E(9000L)) break block18;
                        UF.f$E(0.f$d, new StringBuilder().insert(0, "I just ate ").append(UF.f$E(0.f$d).get(UF.f$E(0.f$d).entrySet().iterator().next().getKey())).append(" ").append((String)UF.f$E(0.f$d).entrySet().iterator().next().getKey()).append("!").toString());
                        UF.f$E(0.f$d).remove(UF.f$E(0.f$d).entrySet().iterator().next().getKey());
                        UF.f$a(0.f$d).f$a();
                        sF2 = 0;
                        break block19;
                    }
                    UF.f$E(0.f$d).clear();
                }
                sF2 = 0;
            }
            if (((Boolean)UF.f$a(sF2.f$d).f$E()).booleanValue() && UF.f$E(0.f$d).f$E(60000L)) {
                double d = (double)Math.round(((double)Math.round((double)UF.f$a().world.func_72912_H().getWorldTime() / 24000.0 * 1000.0) / 1000.0 - (double)Math.round(UF.f$E().world.func_72912_H().getWorldTime() / 24000L)) * 1000.0) / 1000.0;
                if (d == 0.0) {
                    sF sF5 = 0;
                    UF.f$E(sF5.f$d, UF.f$H(sF5.f$d)[new Random().nextInt(UF.f$H(0.f$d).length)]);
                    UF.f$E(0.f$d).f$a();
                    return;
                }
                if (d == 0.178) {
                    sF sF6 = 0;
                    UF.f$E(sF6.f$d, UF.f$h(sF6.f$d)[new Random().nextInt(UF.f$h(0.f$d).length)]);
                    UF.f$E(0.f$d).f$a();
                    return;
                }
                if (d == 0.25) {
                    sF sF7 = 0;
                    UF.f$E(sF7.f$d, UF.f$A(sF7.f$d)[new Random().nextInt(UF.f$A(0.f$d).length)]);
                    UF.f$E(0.f$d).f$a();
                    return;
                }
                if (d == 0.484) {
                    sF sF8 = 0;
                    UF.f$E(sF8.f$d, UF.f$K(sF8.f$d)[new Random().nextInt(UF.f$K(0.f$d).length)]);
                    UF.f$E(0.f$d).f$a();
                    return;
                }
                if (d == 0.521) {
                    sF sF9 = 0;
                    UF.f$E(sF9.f$d, UF.f$B(sF9.f$d)[new Random().nextInt(UF.f$B(0.f$d).length)]);
                    UF.f$E(0.f$d).f$a();
                    return;
                }
                if (d == 0.575) {
                    sF sF10 = 0;
                    UF.f$E(sF10.f$d, UF.f$e(sF10.f$d)[new Random().nextInt(UF.f$e(0.f$d).length)]);
                    UF.f$E(0.f$d).f$a();
                    return;
                }
                if (d == 0.75) {
                    sF sF11 = 0;
                    UF.f$E(sF11.f$d, UF.f$a(sF11.f$d)[new Random().nextInt(UF.f$a(0.f$d).length)]);
                    UF.f$E(0.f$d).f$a();
                    return;
                }
                if (d == 0.977) {
                    sF sF12 = 0;
                    UF.f$E(sF12.f$d, UF.f$E(sF12.f$d)[new Random().nextInt(UF.f$E(0.f$d).length)]);
                    UF.f$E(0.f$d).f$a();
                }
            }
        }
    }
}
 */