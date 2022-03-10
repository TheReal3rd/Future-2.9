package net.futureclient.client.deof.modules.miscellaneous.antiAFK;

public class ee_Listener {
}
/*
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
 */