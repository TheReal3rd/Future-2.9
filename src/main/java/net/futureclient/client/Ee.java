package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.entity.MoverType;

public class Ee
extends RF {
    private MoverType f$g;
    public double f$M;
    public double f$j;
    private boolean f$d;
    public double f$i;

    public void f$e(double d) {
        0.f$j = d;
    }

    public double f$a() {
        Ee ee;
        return ee.f$i;
    }

    public MoverType f$E() {
        Ee ee;
        return ee.f$g;
    }

    public void f$a(boolean bl) {
        0.f$d = bl;
    }

    public void f$E(double d) {
        0.f$M = d;
    }

    public double f$E() {
        Ee ee;
        return ee.f$M;
    }

    public boolean f$a() {
        Ee ee;
        return ee.f$d;
    }

    public Ee(MoverType moverType, double d, double d2, double d3, boolean bl) {
        Ee ee = 0;
        Ee ee2 = 0;
        0.f$g = moverType;
        ee2.f$j = d;
        ee2.f$i = d2;
        ee.f$M = d3;
        ee.f$d = bl;
    }

    public double f$e() {
        Ee ee;
        return ee.f$j;
    }

    public void f$a(double d) {
        0.f$i = d;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class EE
extends RF {
    private float f$M;
    private int f$K;
    public BlockPos f$d;
    private EnumFacing f$g;
    private int f$b;
    private int f$j;
    private int f$i;

    public void f$B(int n) {
        0.f$K = n;
    }

    public int f$a() {
        EE eE;
        return eE.f$j;
    }

    public void f$a(int n) {
        0.f$j = n;
    }

    public EnumFacing f$E() {
        EE eE;
        return eE.f$g;
    }

    public void f$e(int n) {
        0.f$b = n;
    }

    public int f$e() {
        EE eE;
        return eE.f$b;
    }

    public int f$E() {
        EE eE;
        return eE.f$i;
    }

    public BlockPos f$E() {
        EE eE;
        return eE.f$d;
    }

    public void f$E(int n) {
        0.f$i = n;
    }

    public int f$B() {
        EE eE;
        return eE.f$K;
    }

    public void f$E(EnumFacing enumFacing) {
        0.f$g = enumFacing;
    }

    public EE(int n, int n2, int n3, int n4, float f, EnumFacing enumFacing, BlockPos blockPos) {
        EE eE = 0;
        EE eE2 = 0;
        EE eE3 = 0;
        0.f$K = n;
        eE3.f$b = n2;
        eE3.f$j = n3;
        eE2.f$i = n4;
        eE2.f$M = f;
        eE.f$g = enumFacing;
        eE.f$d = blockPos;
    }

    public Block f$E() {
        EE eE;
        return Minecraft.getMinecraft().world.func_180495_p(eE.f$d).getBlock();
    }

    public void f$E(float f) {
        0.f$M = f;
    }

    public float f$E() {
        EE eE;
        return eE.f$M;
    }
}
package net.futureclient.client;

import net.futureclient.client.Be;
import net.futureclient.client.Ha;
import net.futureclient.client.Ie;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.kF;
import net.futureclient.client.s;
import net.futureclient.client.tE;

public class eE
extends Ha<Pf> {
    public final Ie f$d;

    @Override
    public void f$E(Pf pf) {
        int n;
        eE eE2;
        double d;
        if (!pf.f$E().equals((Object)kF.f$M)) {
            return;
        }
        0.f$d.f$a(String.format("PacketFly \u00a77[\u00a7F%s\u00a77]", Ie.f$a(0.f$d).f$E()));
        Ie.f$g().player.field_70179_y = 0.0;
        Ie.f$D().player.field_70181_x = 0.0;
        Ie.f$G().player.field_70159_w = 0.0;
        if (!((tE)((Object)Ie.f$a(0.f$d).f$E())).equals((Object)tE.f$i) && Ie.f$E(0.f$d) == 0) {
            if (Ie.f$E(0.f$d, 4)) {
                Ie.f$E(0.f$d, 0.0, 0.0, 0.0, false);
            }
            return;
        }
        boolean bl = Ie.f$E(0.f$d);
        if (Ie.f$m().player.movementInput.jump && (bl || !Pg.f$e())) {
            double d2;
            if (((Boolean)Ie.f$E(0.f$d).f$E()).booleanValue() && !bl) {
                eE eE3 = 0;
                d2 = Ie.f$E(eE3.f$d, ((tE)((Object)Ie.f$a(eE3.f$d).f$E())).equals((Object)tE.f$i) ? 10 : 20) ? -0.032 : 0.062;
            } else {
                d2 = 0.062;
            }
            d = d2;
            eE2 = 0;
        } else if (Ie.f$f().player.movementInput.sneak) {
            d = -0.062;
            eE2 = 0;
        } else {
            d = !bl ? (Ie.f$E(0.f$d, 4) ? (((Boolean)Ie.f$E(0.f$d).f$E()).booleanValue() ? -0.04 : 0.0) : 0.0) : 0.0;
            eE2 = 0;
        }
        if (((Be)((Object)Ie.f$E(eE2.f$d).f$E())).equals((Object)Be.f$g) && bl && Pg.f$e() && d != 0.0) {
            d /= 2.5;
        }
        double[] dArray = Pg.f$E(((Be)((Object)Ie.f$E(0.f$d).f$E())).equals((Object)Be.f$g) && bl ? 0.031 : 0.26);
        int n2 = n = 1;
        while (true) {
            if (n2 > (((tE)((Object)Ie.f$a(0.f$d).f$E())).equals((Object)tE.f$g) ? ((s)Ie.f$E(0.f$d)).f$E().intValue() : 1)) break;
            Ie.f$L().player.field_70159_w = dArray[0] * (double)n;
            Ie.f$i().player.field_70181_x = d * (double)n;
            Ie.f$c().player.field_70179_y = dArray[1] * (double)n;
            Ie.f$E(0.f$d, Ie.f$L().player.field_70159_w, Ie.f$i().player.field_70181_x, Ie.f$c().player.field_70179_y, !((tE)((Object)Ie.f$a(0.f$d).f$E())).equals((Object)tE.f$i));
            n2 = ++n;
        }
    }

    public eE(Ie ie) {
        0.f$d = ie;
    }
}
package net.futureclient.client;

import net.futureclient.client.B;
import net.futureclient.client.Gf;
import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.ME;
import net.futureclient.client.Y;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketTabComplete;
import net.minecraft.util.EnumHand;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;

public class ee
extends Ha<ME> {
    public final Gf f$d;

    public ee(Gf gf) {
        0.f$d = gf;
    }

    @Override
    public void f$E(ME mE) {
        Class<?> clazz;
        if (!((Boolean)Gf.f$I(0.f$d).f$E()).booleanValue()) {
            ee ee2 = 0;
            ee ee3 = 0;
            Gf.f$K(ee2.f$d, Gf.f$B(ee2.f$d, Gf.f$e(ee3.f$d, Gf.f$a(ee3.f$d, null))));
        }
        if (!((Boolean)Gf.f$j(0.f$d).f$E()).booleanValue()) {
            Gf.f$E(0.f$d, null);
        }
        if ((clazz = Gf.f$l().player.movementInput.getClass()) == MovementInputFromOptions.class || clazz == MovementInput.class) {
            Gf.f$B(0.f$d).f$a();
            Gf.f$h.updatePlayerMoveState();
            Gf.f$k().player.movementInput = Gf.f$h;
        }
        if (Gf.f$B(0.f$d).f$a(Gf.f$E(0.f$d).f$E().floatValue() * 1000.0f)) {
            if (((Boolean)Gf.f$I(0.f$d).f$E()).booleanValue()) {
                ee ee4;
                if (Gf.f$a(0.f$d) > 7) {
                    ee ee5 = 0;
                    Gf.f$E(ee5.f$d, -Gf.f$E(ee5.f$d).nextInt(20));
                }
                switch (Gf.f$a(0.f$d)) {
                    case 0: {
                        ee ee6 = 0;
                        while (false) {
                        }
                        ee4 = ee6;
                        Gf.f$K(ee6.f$d, true);
                        ee ee7 = 0;
                        Gf.f$B(ee7.f$d, Gf.f$a(ee7.f$d, Gf.f$e(0.f$d, false)));
                        break;
                    }
                    case 1: {
                        ee ee8 = 0;
                        ee4 = ee8;
                        Gf.f$K(ee8.f$d, Gf.f$a(ee8.f$d, true));
                        ee ee9 = 0;
                        Gf.f$B(ee9.f$d, Gf.f$e(ee9.f$d, false));
                        break;
                    }
                    case 2: {
                        ee ee10 = 0;
                        ee4 = ee10;
                        Gf.f$a(ee10.f$d, true);
                        ee ee11 = 0;
                        Gf.f$K(ee11.f$d, Gf.f$B(ee11.f$d, Gf.f$e(0.f$d, false)));
                        break;
                    }
                    case 3: {
                        ee ee12 = 0;
                        ee4 = ee12;
                        Gf.f$a(ee12.f$d, Gf.f$B(ee12.f$d, true));
                        ee ee13 = 0;
                        Gf.f$e(ee13.f$d, Gf.f$K(ee13.f$d, false));
                        break;
                    }
                    case 4: {
                        ee ee14 = 0;
                        ee4 = ee14;
                        Gf.f$B(ee14.f$d, true);
                        ee ee15 = 0;
                        Gf.f$K(ee15.f$d, Gf.f$e(ee15.f$d, Gf.f$a(0.f$d, false)));
                        break;
                    }
                    case 5: {
                        ee ee16 = 0;
                        ee4 = ee16;
                        Gf.f$B(ee16.f$d, Gf.f$e(ee16.f$d, true));
                        ee ee17 = 0;
                        Gf.f$K(ee17.f$d, Gf.f$a(ee17.f$d, false));
                        break;
                    }
                    case 6: {
                        ee ee18 = 0;
                        ee4 = ee18;
                        Gf.f$e(ee18.f$d, true);
                        ee ee19 = 0;
                        Gf.f$K(ee19.f$d, Gf.f$B(ee19.f$d, Gf.f$a(0.f$d, false)));
                        break;
                    }
                    case 7: {
                        ee ee20 = 0;
                        ee4 = ee20;
                        Gf.f$K(ee20.f$d, Gf.f$e(ee20.f$d, true));
                        ee ee21 = 0;
                        Gf.f$B(ee21.f$d, Gf.f$a(ee21.f$d, false));
                        break;
                    }
                    default: {
                        ee ee22 = 0;
                        ee4 = ee22;
                        ee ee23 = 0;
                        Gf.f$K(ee22.f$d, Gf.f$B(ee22.f$d, Gf.f$e(ee23.f$d, Gf.f$a(ee23.f$d, false))));
                    }
                }
                if (Gf.f$e(ee4.f$d).f$E((long)Gf.f$E(0.f$d).nextInt(1000)) && (Gf.f$b().player.field_70159_w == 0.0 || Gf.f$F().player.field_70179_y == 0.0)) {
                    Gf.f$E(0.f$d);
                    Gf.f$e(0.f$d).f$a();
                }
            }
            if (!Gf.f$a(0.f$d).f$a(Gf.f$E(0.f$d).f$E().floatValue() * 1000.0f)) {
                return;
            }
            ee ee24 = 0;
            Gf.f$a(ee24.f$d).f$a();
            if (((Boolean)Gf.f$M(ee24.f$d).f$E()).booleanValue()) {
                Gf.f$G().player.swingArm(EnumHand.MAIN_HAND);
            }
            if (((Boolean)Gf.f$C(0.f$d).f$E()).booleanValue()) {
                Gf.f$D().player.sendChatMessage(new StringBuilder().insert(0, "/").append(Long.toHexString(Double.doubleToLongBits(Math.random()))).toString());
            }
            if (((Boolean)Gf.f$H(0.f$d).f$E()).booleanValue()) {
                Gf.f$g().player.connection.sendPacket((Packet)new CPacketTabComplete(new StringBuilder().insert(0, "/").append(Long.toHexString(Double.doubleToLongBits(Math.random()))).toString(), null, false));
            }
            if (((Boolean)Gf.f$h(0.f$d).f$E()).booleanValue()) {
                ee ee25 = 0;
                float f = Gf.f$E(0.f$d).nextBoolean() ? (float)Gf.f$E(ee25.f$d).nextInt(45) : (float)(-Gf.f$E(ee25.f$d).nextInt(45));
                Gf.f$m().player.field_70177_z = (float)((double)Gf.f$m().player.field_70177_z + ((double)f + (Gf.f$E(0.f$d).nextBoolean() ? Math.random() * 45.0 : -(Math.random() * 45.0))));
                Gf.f$f().player.field_70125_A = f;
            }
            if (((Boolean)Gf.f$A(0.f$d).f$E()).booleanValue()) {
                ((Y)Gf.f$L()).f$E(He.f$M);
            }
            if (((Boolean)Gf.f$K(0.f$d).f$E()).booleanValue()) {
                Gf.f$M().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Gf.f$i().player.field_70165_t, Gf.f$c().player.field_70163_u - Math.random(), Gf.f$I().player.field_70161_v, Gf.f$j().player.field_70122_E));
            }
            if (((Boolean)Gf.f$B(0.f$d).f$E()).booleanValue()) {
                Gf.f$C().player.func_70664_aZ();
            }
            if (((Boolean)Gf.f$j(0.f$d).f$E()).booleanValue() && !Gf.f$H().player.func_184218_aH() && !((B)Gf.f$h().player).f$E()) {
                ee ee26 = 0;
                Gf.f$E(ee26.f$d, Gf.f$K(ee26.f$d) == null || Gf.f$K(0.f$d) == false);
                return;
            }
        } else {
            ee ee27 = 0;
            ee ee28 = 0;
            Gf.f$K(ee27.f$d, Gf.f$B(ee27.f$d, Gf.f$e(ee28.f$d, Gf.f$a(ee28.f$d, Gf.f$E(0.f$d, null)))));
        }
    }
}
