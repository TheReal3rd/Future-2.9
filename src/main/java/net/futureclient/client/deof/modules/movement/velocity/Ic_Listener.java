package net.futureclient.client.deof.modules.movement.velocity;

public class Ic_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.G;
import net.futureclient.client.Ha;
import net.futureclient.client.e;
import net.futureclient.client.jf;
import net.futureclient.client.pA;
import net.futureclient.client.wC;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.network.play.server.SPacketEntityStatus;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketExplosion;
import net.minecraft.world.World;

public class Ic
extends Ha<jf> {
    public final wC f$d;

    @Override
    public void f$E(jf jf2) {
        if (!((pA)((Object)wC.f$E(0.f$d).f$E())).equals((Object)pA.f$M)) {
            return;
        }
        if (jf2.f$E() instanceof SPacketEntityVelocity) {
            SPacketEntityVelocity sPacketEntityVelocity = (SPacketEntityVelocity)jf2.f$E();
            if (wC.f$A().world.getEntityByID(sPacketEntityVelocity.getEntityID()) == wC.f$K().player) {
                if (0.f$d.f$g.f$E().doubleValue() > 0.0 || 0.f$d.f$d.f$E().doubleValue() > 0.0) {
                    ((G)sPacketEntityVelocity).setMotionX(sPacketEntityVelocity.getMotionX() * 0.f$d.f$g.f$E().intValue() / 100);
                    ((G)sPacketEntityVelocity).setMotionY(sPacketEntityVelocity.getMotionY() * 0.f$d.f$d.f$E().intValue() / 100);
                    ((G)sPacketEntityVelocity).setMotionZ(sPacketEntityVelocity.getMotionZ() * 0.f$d.f$g.f$E().intValue() / 100);
                    return;
                }
                jf2.f$E(true);
                return;
            }
        } else {
            jf jf3 = jf2;
            if (jf2.f$E() instanceof SPacketExplosion) {
                SPacketExplosion sPacketExplosion = (SPacketExplosion)jf3.f$E();
                ((e)sPacketExplosion).setMotionX(sPacketExplosion.getMotionX() * 0.f$d.f$g.f$E().floatValue() / 100.0f);
                ((e)sPacketExplosion).setMotionY(sPacketExplosion.getMotionY() * 0.f$d.f$d.f$E().floatValue() / 100.0f);
                ((e)sPacketExplosion).setMotionZ(sPacketExplosion.getMotionZ() * 0.f$d.f$g.f$E().floatValue() / 100.0f);
                return;
            }
            if (jf3.f$E() instanceof SPacketEntityStatus) {
                SPacketEntityStatus sPacketEntityStatus = (SPacketEntityStatus)jf2.f$E();
                if (0.f$d.f$j.f$E().booleanValue() && sPacketEntityStatus.getOpCode() == 31 && (sPacketEntityStatus = sPacketEntityStatus.getEntity((World)wC.f$B().world)) instanceof EntityFishHook && ((EntityFishHook)sPacketEntityStatus).caughtEntity == wC.f$e().player) {
                    jf2.f$E(true);
                }
            }
        }
    }

    public Ic(wC wC2) {
        0.f$d = wC2;
    }
}
 */