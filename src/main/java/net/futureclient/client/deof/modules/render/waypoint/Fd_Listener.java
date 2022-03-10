package net.futureclient.client.deof.modules.render.waypoint;

public class Fd_Listener {
}
/*
package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.Ha;
import net.futureclient.client.ud;
import net.futureclient.client.va;
import net.futureclient.client.yB;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class Fd
extends Ha<ud> {
    public final yB f$d;

    public Fd(yB yB2) {
        0.f$d = yB2;
    }

    @Override
    public void f$E(ud ud2) {
        if (((Boolean)yB.f$E(0.f$d).f$E()).booleanValue()) {
            Iterator iterator = yB.f$c().world.field_73010_i.iterator();
            while (iterator.hasNext()) {
                Object object = (EntityPlayer)((Entity)iterator.next());
                if (!object.getName().equals(ud2.f$E())) continue;
                String string = "";
                if (yB.f$I().isSingleplayer()) {
                    string = "singleplayer";
                } else if (yB.f$j().getCurrentServerData() != null) {
                    string = yB.f$M().getCurrentServerData().serverIP.replaceAll(":", "_");
                } else if (yB.f$C().isConnectedToRealms()) {
                    string = "realms";
                }
                if (yB.f$E(0.f$d, (va)(object = new va(new StringBuilder().insert(0, object.getName()).append("_logout_spot").toString(), string, Double.parseDouble(yB.f$E(0.f$d).format(object.field_70165_t).replaceAll(",", ".")), Double.parseDouble(yB.f$E(0.f$d).format(object.field_70163_u).replaceAll(",", ".")), Double.parseDouble(yB.f$E(0.f$d).format(object.field_70161_v).replaceAll(",", ".")), yB.f$H().world.field_73011_w.getDimensionType().getName())))) continue;
                0.f$d.f$i.add((va)object);
            }
        }
    }
}
 */