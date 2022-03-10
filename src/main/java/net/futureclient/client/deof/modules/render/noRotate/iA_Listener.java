package net.futureclient.client.deof.modules.render.noRotate;

public class iA_Listener {
}
/*
package net.futureclient.client;

import java.util.Set;
import net.futureclient.client.Ha;
import net.futureclient.client.I;
import net.futureclient.client.XB;
import net.futureclient.client.jf;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.math.BlockPos;

public class iA
extends Ha<jf> {
    public final XB f$d;

    public iA(XB xB) {
        0.f$d = xB;
    }

    @Override
    public void f$E(jf jf2) {
        if (jf2.f$E() instanceof SPacketPlayerPosLook) {
            SPacketPlayerPosLook sPacketPlayerPosLook = (SPacketPlayerPosLook)jf2.f$E();
            if (!XB.f$C().world.func_175668_a(new BlockPos(XB.f$I().player.field_70142_S, XB.f$j().player.field_70137_T, XB.f$M().player.field_70136_U), false) || !XB.f$K().world.func_175668_a(new BlockPos(XB.f$H().player.field_70165_t, XB.f$h().player.field_70163_u, XB.f$A().player.field_70161_v), false)) {
                return;
            }
            XB.f$a(0.f$d, Float.valueOf(sPacketPlayerPosLook.getYaw()));
            XB.f$E(0.f$d, Float.valueOf(sPacketPlayerPosLook.getPitch()));
            Set set = sPacketPlayerPosLook.getFlags();
            if (set.remove(SPacketPlayerPosLook.EnumFlags.Y_ROT)) {
                iA iA2 = 0;
                XB.f$a(iA2.f$d, Float.valueOf(XB.f$a(iA2.f$d).floatValue() + XB.f$B().player.field_70177_z));
            }
            if (set.remove(SPacketPlayerPosLook.EnumFlags.X_ROT)) {
                iA iA3 = 0;
                XB.f$E(iA3.f$d, Float.valueOf(XB.f$E(iA3.f$d).floatValue() + XB.f$e().player.field_70125_A));
            }
            ((I)sPacketPlayerPosLook).setYaw(XB.f$a().player.field_70177_z);
            ((I)sPacketPlayerPosLook).setPitch(XB.f$E().player.field_70125_A);
        }
    }
}
 */