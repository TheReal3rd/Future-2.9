package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.db;
import net.futureclient.client.ed;
import net.futureclient.client.ka;
import net.futureclient.client.mc;
import net.futureclient.client.oc;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;

public class BB
extends Ba {
    public z<Boolean> f$A;
    private static final double f$M = 2.0E-4;
    public z<Boolean> f$l;
    private final Random f$d;
    public z<Boolean> f$B;
    private Bh f$H;
    private double f$j;
    public z<Boolean> f$e;
    public z<Boolean> f$L;
    public z<Boolean> f$a;
    private s f$K;
    public ka<mc> f$D;
    private static final int f$g = 16;
    public z<Boolean> f$c;
    private int f$i;
    private boolean f$b;
    private s f$I;
    public z<Boolean> f$C;
    private Bh f$m;

    public static Minecraft f$Ea() {
        return f$d;
    }

    public static boolean f$E(BB bB, boolean bl) {
        bB.f$b = bl;
        return bB.f$b;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$Z() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$S() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$R() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$V() {
        return f$d;
    }

    public static Minecraft f$q() {
        return f$d;
    }

    @Override
    public void f$K() {
        BB bB;
        if (((Minecraft)BB.f$d).player != null && ((mc)((Object)bB.f$D.f$E())).equals((Object)mc.f$M) && ((Minecraft)BB.f$d).player.func_184582_a(EntityEquipmentSlot.CHEST).getItem() == Items.ELYTRA) {
            BB.f$d.player.field_70179_y = 0.0;
            BB.f$d.player.field_70181_x = 0.0;
            BB.f$d.player.field_70159_w = 0.0;
        }
        BB bB2 = bB;
        super.f$K();
        bB2.f$m.f$a();
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static int f$E(BB bB, int n) {
        bB.f$i = n;
        return bB.f$i;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static int f$E(BB bB) {
        return bB.f$i;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public BB() {
        BB bB;
        String[] stringArray = new String[5];
        stringArray[0] = "ElytraFly";
        stringArray[1] = "Elytra";
        stringArray[2] = "Elytracontrol";
        stringArray[3] = "Elytra+";
        stringArray[4] = "Elytraplus";
        super("ElytraFly", stringArray, true, -13131319, JD.f$j);
        BB bB2 = bB;
        BB bB3 = bB;
        bB2.f$H = new Bh();
        bB3.f$m = new Bh();
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Mode";
        stringArray2[1] = "Type";
        stringArray2[2] = "Method";
        stringArray2[3] = "FlyMethod";
        bB2.f$D = new ka<mc>(mc.f$j, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "StopInWater";
        stringArray3[1] = "siw";
        stringArray3[2] = "Stop";
        stringArray3[3] = "waterstop";
        bB.f$l = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "InstantFly";
        stringArray4[1] = "Instafly";
        stringArray4[2] = "if";
        bB.f$L = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[6];
        stringArray5[0] = "StopOnGround";
        stringArray5[1] = "StopONG";
        stringArray5[2] = "stopground";
        stringArray5[3] = "OnGround";
        stringArray5[4] = "OnGroundStop";
        stringArray5[5] = "sog";
        bB.f$c = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[5];
        stringArray6[0] = "AutoAccelerate";
        stringArray6[1] = "AutoSpeed";
        stringArray6[2] = "SpeedUp";
        stringArray6[3] = "AutoSpeedUp";
        stringArray6[4] = "Accelerate";
        bB.f$A = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "AntiKick";
        stringArray7[1] = "NoKick";
        stringArray7[2] = "CircleStrafer";
        stringArray7[3] = "Strafer";
        bB.f$B = new z<Boolean>(true, stringArray7);
        String[] stringArray8 = new String[3];
        stringArray8[0] = "Vertical";
        stringArray8[1] = "y";
        stringArray8[2] = "v";
        bB.f$a = new z<Boolean>(true, stringArray8);
        String[] stringArray9 = new String[8];
        stringArray9[0] = "Inf Durability";
        stringArray9[1] = "InfiniteDurability";
        stringArray9[2] = "Durability";
        stringArray9[3] = "NoDurability";
        stringArray9[4] = "NoDura";
        stringArray9[5] = "InfDura";
        stringArray9[6] = "InfDurability";
        stringArray9[7] = "InfiniteDura";
        bB.f$C = new z<Boolean>(true, stringArray9);
        String[] stringArray10 = new String[5];
        stringArray10[0] = "NCP Strict";
        stringArray10[1] = "NCPStrict";
        stringArray10[2] = "ncp";
        stringArray10[3] = "strict";
        stringArray10[4] = "ncps";
        bB.f$e = new z<Boolean>(false, stringArray10);
        String[] stringArray11 = new String[3];
        stringArray11[0] = "Speed";
        stringArray11[1] = "spd";
        stringArray11[2] = "s";
        bB.f$I = new s((Number)2.5, (Number)0.1, (Number)50.0, stringArray11);
        String[] stringArray12 = new String[5];
        stringArray12[0] = "VSpeed";
        stringArray12[1] = "verticalspeed";
        stringArray12[2] = "vspd";
        stringArray12[3] = "vs";
        stringArray12[4] = "yspeed";
        bB.f$K = new s((Number)1.0, (Number)0.1, (Number)10.0, stringArray12);
        bB.f$d = new Random();
        bB.f$E(bB.f$D, bB.f$c, bB.f$l, bB.f$L, bB.f$A, bB.f$B, bB.f$C, bB.f$e, bB.f$a, bB.f$I, bB.f$K);
        bB.f$E(new db(bB), new oc(bB), new ed(bB));
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$ba() {
        return f$d;
    }

    @Override
    public void f$B() {
        BB bB;
        BB bB2 = bB;
        super.f$B();
        bB2.f$b = true;
        bB2.f$i = 0;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static double f$E(BB bB, double d) {
        bB.f$j = d;
        return bB.f$j;
    }

    public static Minecraft f$s() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static s f$E(BB bB) {
        return bB.f$K;
    }

    public static Minecraft f$y() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static Minecraft f$X() {
        return f$d;
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$O() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$z() {
        return f$d;
    }

    public static Minecraft f$N() {
        return f$d;
    }

    public static Minecraft f$r() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static s f$a(BB bB) {
        return bB.f$I;
    }

    public static Minecraft f$La() {
        return f$d;
    }

    public static Minecraft f$T() {
        return f$d;
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static Bh f$E(BB bB) {
        return bB.f$H;
    }

    public static boolean f$E(BB bB) {
        return bB.f$b;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$ga() {
        return f$d;
    }

    public static Random f$E(BB bB) {
        return bB.f$d;
    }

    public static double f$E(BB bB) {
        return bB.f$j;
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.YD;
import net.futureclient.client.ZB;

public class Bb
extends Ha<YD> {
    public final ZB f$d;

    @Override
    public void f$E(YD yD) {
        if (((Boolean)ZB.f$a(0.f$d).f$E()).booleanValue()) {
            yD.f$E(true);
        }
    }

    public Bb(ZB zB) {
        0.f$d = zB;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.fd;
import net.futureclient.client.hA;
import net.futureclient.client.q;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import org.lwjgl.input.Keyboard;

public class bb
extends Ha<ME> {
    public final fd f$d;

    public bb(fd fd2) {
        0.f$d = fd2;
    }

    @Override
    public void f$E(ME mE) {
        switch ((hA)((Object)fd.f$E(0.f$d).f$E())) {
            case f$M: {
                Minecraft minecraft = fd.f$ta();
                while (false) {
                }
                if (minecraft.world == null) break;
                if (Keyboard.isKeyDown((int)50)) {
                    fd.f$E(0.f$d, 0.0, 2.147483647E9, 0.0);
                }
                if (!Pg.f$a()) {
                    return;
                }
                float f = fd.f$sa().player.field_70177_z + (float)(fd.f$za().player.field_191988_bg < 0.0f ? 180 : 0) + (fd.f$Ua().player.field_70702_br > 0.0f ? -90.0f * (fd.f$Sa().player.field_191988_bg < 0.0f ? -0.5f : (fd.f$na().player.field_191988_bg > 0.0f ? 0.5f : 1.0f)) : 0.0f) - (fd.f$Xa().player.field_70702_br < 0.0f ? -90.0f * (fd.f$Pa().player.field_191988_bg < 0.0f ? -0.5f : (fd.f$ra().player.field_191988_bg > 0.0f ? 0.5f : 1.0f)) : 0.0f);
                float f2 = (float)Math.cos((double)(f + 90.0f) * Math.PI / 180.0);
                f = (float)Math.sin((double)(f + 90.0f) * Math.PI / 180.0);
                if (!fd.f$Na().player.field_70124_G) {
                    bb bb2 = 0;
                    fd.f$a(bb2.f$d, fd.f$a(bb2.f$d) + 1);
                    if (fd.f$xa().player.movementInput.sneak) {
                        fd.f$Qa().player.connection.sendPacket((Packet)new CPacketPlayer.Position(0.0, 2.147483647E9, 0.0, false));
                    }
                    fd.f$E(0.f$d, 0);
                    if (!fd.f$qa().player.field_70124_G) {
                        if (fd.f$ua().player.field_70181_x == -0.07190068807140403) {
                            fd.f$oa().player.field_70181_x *= (double)0.35f;
                        }
                        if (fd.f$Va().player.field_70181_x == -0.10306193759436909) {
                            fd.f$pa().player.field_70181_x *= (double)0.55f;
                        }
                        if (fd.f$Ra().player.field_70181_x == -0.13395038817442878) {
                            fd.f$Wa().player.field_70181_x *= (double)0.67f;
                        }
                        if (fd.f$wa().player.field_70181_x == -0.16635183030382) {
                            fd.f$va().player.field_70181_x *= (double)0.69f;
                        }
                        if (fd.f$Oa().player.field_70181_x == -0.19088711097794803) {
                            fd.f$Ta().player.field_70181_x *= (double)0.71f;
                        }
                        if (fd.f$ya().player.field_70181_x == -0.21121925191528862) {
                            fd.f$ca().player.field_70181_x *= (double)0.2f;
                        }
                        if (fd.f$ka().player.field_70181_x == -0.11979897632390576) {
                            fd.f$ia().player.field_70181_x *= (double)0.93f;
                        }
                        if (fd.f$ea().player.field_70181_x == -0.18758479151225355) {
                            fd.f$Ia().player.field_70181_x *= (double)0.72f;
                        }
                        if (fd.f$Ja().player.field_70181_x == -0.21075983825251726) {
                            fd.f$Ma().player.field_70181_x *= (double)0.76f;
                        }
                        if (fd.f$E(0.f$d, (EntityPlayer)fd.f$ha().player, 69.0) < 0.5) {
                            if (fd.f$da().player.field_70181_x == -0.23537393014173347) {
                                fd.f$Ca().player.field_70181_x *= (double)0.03f;
                            }
                            if (fd.f$Da().player.field_70181_x == -0.08531999505205401) {
                                fd.f$Ka().player.field_70181_x *= -0.5;
                            }
                            if (fd.f$Aa().player.field_70181_x == -0.03659320313669756) {
                                fd.f$ja().player.field_70181_x *= (double)-0.1f;
                            }
                            if (fd.f$fa().player.field_70181_x == -0.07481386749524899) {
                                fd.f$Ba().player.field_70181_x *= (double)-0.07f;
                            }
                            if (fd.f$ma().player.field_70181_x == -0.0732677700939672) {
                                fd.f$Fa().player.field_70181_x *= (double)-0.05f;
                            }
                            if (fd.f$aa().player.field_70181_x == -0.07480988066790395) {
                                fd.f$Ha().player.field_70181_x *= (double)-0.04f;
                            }
                            if (fd.f$Ga().player.field_70181_x == -0.0784000015258789) {
                                fd.f$la().player.field_70181_x *= (double)0.1f;
                            }
                            if (fd.f$ba().player.field_70181_x == -0.08608320193943977) {
                                fd.f$Ea().player.field_70181_x *= (double)0.1f;
                            }
                            if (fd.f$La().player.field_70181_x == -0.08683615560584318) {
                                fd.f$ga().player.field_70181_x *= (double)0.05f;
                            }
                            if (fd.f$R().player.field_70181_x == -0.08265497329678266) {
                                fd.f$O().player.field_70181_x *= (double)0.05f;
                            }
                            if (fd.f$Z().player.field_70181_x == -0.08245009535659828) {
                                fd.f$T().player.field_70181_x *= (double)0.05f;
                            }
                            if (fd.f$z().player.field_70181_x == -0.08244005633718426) {
                                fd.f$r().player.field_70181_x = -0.08243956442521608;
                            }
                            if (fd.f$y().player.field_70181_x == -0.08243956442521608) {
                                fd.f$s().player.field_70181_x = -0.08244005590677261;
                            }
                            if (fd.f$S().player.field_70181_x > -0.1 && fd.f$N().player.field_70181_x < -0.08 && !fd.f$X().player.field_70122_E && fd.f$u().player.movementInput.forwardKeyDown) {
                                fd.f$V().player.field_70181_x = -1.0E-4f;
                            }
                        } else {
                            if (fd.f$q().player.field_70181_x < -0.2 && fd.f$x().player.field_70181_x > -0.24) {
                                fd.f$p().player.field_70181_x *= 0.7;
                            }
                            if (fd.f$n().player.field_70181_x < -0.25 && fd.f$o().player.field_70181_x > -0.32) {
                                fd.f$w().player.field_70181_x *= 0.8;
                            }
                            if (fd.f$v().player.field_70181_x < -0.35 && fd.f$W().player.field_70181_x > -0.8) {
                                fd.f$Y().player.field_70181_x *= 0.98;
                            }
                            if (fd.f$t().player.field_70181_x < -0.8 && fd.f$P().player.field_70181_x > -1.6) {
                                fd.f$Q().player.field_70181_x *= 0.99;
                            }
                        }
                    }
                    ((q)((Y)fd.f$U()).getTimer()).f$E(0.85f);
                    double[] dArray = new double[]{0.420606, 0.417924, 0.415258, 0.412609, 0.409977, 0.407361, 0.404761, 0.402178, 0.399611, 0.39706, 0.394525, 0.392, 0.3894, 0.38644, 0.383655, 0.381105, 0.37867, 0.37625, 0.37384, 0.37145, 0.369, 0.3666, 0.3642, 0.3618, 0.35945, 0.357, 0.354, 0.351, 0.348, 0.345, 0.342, 0.339, 0.336, 0.333, 0.33, 0.327, 0.324, 0.321, 0.318, 0.315, 0.312, 0.309, 0.307, 0.305, 0.303, 0.3, 0.297, 0.295, 0.293, 0.291, 0.289, 0.287, 0.285, 0.283, 0.281, 0.279, 0.277, 0.275, 0.273, 0.271, 0.269, 0.267, 0.265, 0.263, 0.261, 0.259, 0.257, 0.255, 0.253, 0.251, 0.249, 0.247, 0.245, 0.243, 0.241, 0.239, 0.237};
                    if (fd.f$J().player.movementInput.forwardKeyDown) {
                        try {
                            fd.f$d().player.field_70159_w = (double)f2 * dArray[fd.f$a(0.f$d) - 1] * 3.0;
                            fd.f$l().player.field_70179_y = (double)f * dArray[fd.f$a(0.f$d) - 1] * 3.0;
                            return;
                        }
                        catch (Exception exception) {
                            return;
                        }
                    }
                    fd.f$k().player.field_70159_w = 0.0;
                    fd.f$b().player.field_70179_y = 0.0;
                    return;
                }
                ((q)((Y)fd.f$F()).getTimer()).f$E(1.0f);
                bb bb3 = 0;
                fd.f$a(0.f$d, 0);
                fd.f$E(0.f$d, fd.f$E(bb3.f$d) + 1);
                fd.f$G().player.field_70159_w /= 13.0;
                fd.f$D().player.field_70179_y /= 13.0;
                if (fd.f$E(bb3.f$d) == 1) {
                    bb bb4 = 0;
                    fd.f$E(bb4.f$d, fd.f$g().player.field_70165_t, fd.f$m().player.field_70163_u, fd.f$f().player.field_70161_v);
                    fd.f$E(bb4.f$d, fd.f$L().player.field_70165_t + 0.0624, fd.f$i().player.field_70163_u, fd.f$c().player.field_70161_v);
                    fd.f$E(bb4.f$d, fd.f$I().player.field_70165_t, fd.f$j().player.field_70163_u + 0.419, fd.f$M().player.field_70161_v);
                    fd.f$E(bb4.f$d, fd.f$C().player.field_70165_t + 0.0624, fd.f$H().player.field_70163_u, fd.f$h().player.field_70161_v);
                    fd.f$E(bb4.f$d, fd.f$A().player.field_70165_t, fd.f$K().player.field_70163_u + 0.419, fd.f$B().player.field_70161_v);
                }
                if (fd.f$E(0.f$d) <= 2) break;
                fd.f$E(0.f$d, 0);
                fd.f$e().player.field_70159_w = (double)f2 * 0.3;
                fd.f$a().player.field_70179_y = (double)f * 0.3;
                fd.f$E().player.field_70181_x = 0.424f;
            }
        }
    }
}
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
