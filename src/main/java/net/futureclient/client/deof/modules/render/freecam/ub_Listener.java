package net.futureclient.client.deof.modules.render.freecam;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.Cf_Uknown_Event;
import net.futureclient.client.deof.modules.render.freecam.utils.InteractEnum;
import net.minecraft.client.Minecraft;

public class ub_Listener extends Listener<Cf_Uknown_Event> {
    public final FreeCam f$d;

    public ub_Listener(FreeCam rA2) {
        f$d = rA2;
    }

    @Override
    public void invoke(Cf_Uknown_Event cf) {
        if (FreeCam.getInteract(f$d).getValue().equals(InteractEnum.f$g)) {//((pb)((Object)rA.f$E(0.f$d).f$E())).equals((Object)pb.f$g)
            cf.setEntity(Minecraft.getMinecraft().player);//cf.f$E((Entity)rA.f$i().player);
        }
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Cf;
import net.futureclient.client.Ha;
import net.futureclient.client.pb;
import net.futureclient.client.rA;
import net.minecraft.entity.Entity;

public class ub
extends Ha<Cf> {
    public final rA f$d;

    public ub(rA rA2) {
        0.f$d = rA2;
    }

    @Override
    public void f$E(Cf cf) {
        if (((pb)((Object)rA.f$E(0.f$d).f$E())).equals((Object)pb.f$g)) {
            cf.f$E((Entity)rA.f$i().player);
        }
    }
}
 */