package net.futureclient.client.deof.modules.render.esp;

public class rc_Listener {
}
/*
package net.futureclient.client;

import java.util.stream.Collectors;
import net.futureclient.client.Ha;
import net.futureclient.client.cb;
import net.futureclient.client.jf;
import net.futureclient.client.zA;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.math.Vec3d;

public class rc
extends Ha<jf> {
    public final zA f$d;

    private static boolean f$E(cb cb2, cb cb3) {
        return cb3.f$E().equals((Object)cb2.f$E());
    }

    public rc(zA zA2) {
        0.f$d = zA2;
    }

    @Override
    public void f$E(jf jf2) {
        if (!((Boolean)zA.f$K(0.f$d).f$E()).booleanValue()) {
            return;
        }
        if (jf2.f$E() instanceof SPacketSoundEffect) {
            Object object = (SPacketSoundEffect)jf2.f$E();
            Object object2 = object.getSound().getSoundName();
            object2 = zA.f$E().getSoundHandler().getAccessor(object2);
            if (object2 != null && object2.getSubtitle() != null) {
                object = new cb((String)(object2 = object2.getSubtitle().getUnformattedText()), new Vec3d(object.getX(), object.getY(), object.getZ()), System.currentTimeMillis());
                zA.f$E(0.f$d).removeAll(zA.f$E(0.f$d).stream().filter(arg_0 -> rc.f$E((cb)object, arg_0)).collect(Collectors.toList()));
                zA.f$E(0.f$d).add(object);
            }
        }
    }
}
 */