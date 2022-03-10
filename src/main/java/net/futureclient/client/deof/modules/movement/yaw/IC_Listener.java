package net.futureclient.client.deof.modules.movement.yaw;

public class IC_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.fA;
import net.futureclient.client.kH;
import net.futureclient.client.yB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DimensionType;

public class IC
extends Ha<ME> {
    public final fA f$d;

    public IC(fA fA2) {
        0.f$d = fA2;
    }

    @Override
    public void f$E(ME mE) {
        yB yB2 = (yB)kH.f$E().f$E().f$E(yB.class);
        if (yB2 != null && yB2.f$E() && yB2.f$E() != null) {
            yB yB3 = yB2;
            double d = yB3.f$E().f$a();
            double d2 = yB3.f$E().f$e();
            if (fA.f$h().world.field_73011_w.getDimensionType().equals((Object)DimensionType.NETHER) && yB2.f$E().f$a().equals(DimensionType.OVERWORLD.getName())) {
                d /= 8.0;
                d2 /= 8.0;
            } else if (fA.f$A().world.field_73011_w.getDimensionType().equals((Object)DimensionType.OVERWORLD) && yB2.f$E().f$a().equals(DimensionType.NETHER.getName())) {
                d *= 8.0;
                d2 *= 8.0;
            }
            fA.f$K().player.field_70177_z = (float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(fA.f$B().player.field_70161_v - d2, fA.f$e().player.field_70165_t - d)) + 90.0));
            return;
        }
        fA.f$a().player.field_70177_z = (float)Math.round((fA.f$E().player.field_70177_z + 1.0f) / 45.0f) * 45.0f;
    }
}
 */