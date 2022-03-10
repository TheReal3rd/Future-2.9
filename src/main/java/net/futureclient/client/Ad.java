package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.VF;
import net.futureclient.client.bE;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

public class aD
extends Ha<Pf> {
    public final bE f$d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(Pf pf) {
        0.f$d.f$a(String.format("Phase \u00a77[\u00a7F%s\u00a77]", bE.f$E(0.f$d).f$E()));
        float f = bE.f$w().player.field_70177_z;
        if (bE.f$v().player.field_191988_bg < 0.0f) {
            f += 180.0f;
        }
        if (bE.f$W().player.field_70702_br > 0.0f) {
            f -= 90.0f * (bE.f$Y().player.field_191988_bg < 0.0f ? -0.5f : (bE.f$t().player.field_191988_bg > 0.0f ? 0.5f : 1.0f));
        }
        if (bE.f$P().player.field_70702_br < 0.0f) {
            f += 90.0f * (bE.f$Q().player.field_191988_bg < 0.0f ? -0.5f : (bE.f$U().player.field_191988_bg > 0.0f ? 0.5f : 1.0f));
        }
        double d = Math.cos(Math.toRadians(f + 90.0f)) * 0.2;
        d = Math.sin(Math.toRadians(f + 90.0f)) * 0.2;
        d = (double)bE.f$J().player.func_174811_aO().getDirectionVec().getX() * 0.1;
        double d2 = (double)bE.f$d().player.func_174811_aO().getDirectionVec().getZ() * 0.1;
        switch ((VF)((Object)bE.f$E(0.f$d).f$E())) {
            case f$g: {
                switch (pf.f$E()) {
                    case f$M: {
                        if (!bE.f$l().player.isSneaking() || !bE.f$E(0.f$d)) return;
                        f = bE.f$k().player.field_70177_z;
                        bE.f$F().player.func_174826_a(bE.f$b().player.func_174813_aQ().offset(bE.f$E(0.f$d).f$E().doubleValue() * Math.cos(Math.toRadians(f + 90.0f)), 0.0, bE.f$E(0.f$d).f$E().doubleValue() * Math.sin(Math.toRadians(f + 90.0f))));
                        return;
                    }
                }
                return;
            }
            case f$j: {
                bE.f$G().player.field_70181_x = 0.0;
                if (bE.f$D().inGameHasFocus) {
                    if (bE.f$g().player.movementInput.jump) {
                        bE.f$m().player.field_70181_x += 0.3;
                    }
                    if (bE.f$f().player.movementInput.sneak) {
                        bE.f$L().player.field_70181_x -= 0.3;
                    }
                }
                bE.f$i().player.field_70145_X = true;
                return;
            }
            case f$M: {
                if (!bE.f$c().player.field_70123_F || !bE.f$E(0.f$d).f$a(200L)) return;
                bE.f$C().player.connection.sendPacket((Packet)new CPacketPlayer.Position(bE.f$I().player.field_70165_t, bE.f$j().player.field_70163_u + 0.05, bE.f$M().player.field_70161_v, true));
                bE.f$K().player.connection.sendPacket((Packet)new CPacketPlayer.Position(bE.f$H().player.field_70165_t + d * 4.0, bE.f$h().player.field_70163_u, bE.f$A().player.field_70161_v + d2 * 4.0, true));
                bE.f$E().player.connection.sendPacket((Packet)new CPacketPlayer.Position(bE.f$B().player.field_70165_t, bE.f$e().player.field_70163_u, bE.f$a().player.field_70161_v, true));
                bE.f$E(0.f$d).f$a();
                return;
            }
        }
    }

    public aD(bE bE2) {
        0.f$d = bE2;
    }
}
