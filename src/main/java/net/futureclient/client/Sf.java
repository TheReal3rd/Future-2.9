package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.LD;
import net.futureclient.client.kH;
import net.futureclient.client.nB;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class Sf
extends Ba {
    private z<Boolean> f$g;
    private z<Boolean> f$M;
    private s f$d;

    public Sf() {
        Sf sf;
        String[] stringArray = new String[1];
        stringArray[0] = "AutoLog";
        super("AutoLog", stringArray, true, -5197648, JD.f$I);
        Sf sf2 = sf;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "OnRender";
        stringArray2[1] = "LogOnRender";
        stringArray2[2] = "or";
        stringArray2[3] = "o";
        sf2.f$M = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[6];
        stringArray3[0] = "NoTotems";
        stringArray3[1] = "OutOfTotem";
        stringArray3[2] = "nt";
        stringArray3[3] = "tt";
        stringArray3[4] = "oot";
        stringArray3[5] = "t";
        sf.f$g = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[2];
        stringArray4[0] = "Health";
        stringArray4[1] = "h";
        sf.f$d = new s((Number)Float.valueOf(5.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(19.0f), 1, stringArray4);
        sf.f$E(sf.f$M, sf.f$g, sf.f$d);
        sf.f$E(new LD(sf));
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    private void f$e(String string) {
        if (f$d.getConnection() == null) {
            ((Minecraft)Sf.f$d).world.sendQuittingDisconnectingPacket();
        } else {
            f$d.getConnection().getNetworkManager().closeChannel((ITextComponent)new TextComponentString(string));
        }
        ((nB)kH.f$E().f$E().f$E(nB.class)).f$E(false);
        0.f$E(false);
    }

    public static s f$E(Sf sf) {
        return sf.f$d;
    }

    public static z f$a(Sf sf) {
        return sf.f$M;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static z f$E(Sf sf) {
        return sf.f$g;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static void f$E(Sf sf, String string) {
        sf.f$e(string);
    }
}
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
package net.futureclient.client;

import net.futureclient.client.Xd;
import net.minecraft.util.math.AxisAlignedBB;

public class sf
extends Xd {
    private final float f$d;

    public sf(AxisAlignedBB axisAlignedBB, float f) {
        super(axisAlignedBB);
        0.f$d = f;
    }

    public float f$E() {
        sf sf2;
        return sf2.f$d;
    }
}
