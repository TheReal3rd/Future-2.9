package net.futureclient.client.deof.modules.render.nametags;

public class jB_Listener {
}
/*
package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.Ha;
import net.futureclient.client.OB;
import net.futureclient.client.Pg;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.sE;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;

public class jB
extends Ha<sE> {
    public final OB f$d;

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        EntityPlayerSP entityPlayerSP = OB.f$e().getRenderViewEntity() == null ? OB.f$a().player : OB.f$E().getRenderViewEntity();
        Iterator<EntityPlayer> iterator = Pg.f$E().iterator();
        block0: while (true) {
            Iterator<EntityPlayer> iterator2 = iterator;
            while (iterator2.hasNext()) {
                EntityPlayer entityPlayer = iterator.next();
                if (!Pg.f$E((Entity)entityPlayer) || entityPlayer == entityPlayerSP) continue block0;
                if (entityPlayer.func_82150_aj() && !((Boolean)OB.f$E(0.f$d).f$E()).booleanValue()) {
                    iterator2 = iterator;
                    continue;
                }
                Vec3d vec3d = Uh.f$E((Entity)entityPlayer);
                iterator2 = iterator;
                OB.f$E(0.f$d, entityPlayer, vec3d.x, vec3d.y, vec3d.z);
            }
            break;
        }
    }

    public jB(OB oB) {
        0.f$d = oB;
    }
}
 */