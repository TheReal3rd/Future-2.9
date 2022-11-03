package net.futureclient.client.deof.modules.combat.antiBot;


import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.WorldClientEvent;
import net.minecraft.client.Minecraft;

public class AB_WorldClient_Listener extends Listener<WorldClientEvent> {
    public static Minecraft mc = Minecraft.getMinecraft();// OG f$d
    public final AntiBot antiBot; // f$d

    public AB_WorldClient_Listener(AntiBot mF2) {
        antiBot = mF2;
    }
    @Override
    public void invoke(WorldClientEvent event) {
        antiBot.botMap.clear();
        if(mc.isSingleplayer() || mc.getCurrentServerData() == null) {
            AntiBot.setMineplex(false);
            AntiBot.setHypixel(false);
            return;
        } else {
            final String serverIP = mc.getCurrentServerData().serverIP.toLowerCase();
            if(serverIP.contains("hypixel")) {
                AntiBot.setMineplex(false);
                AntiBot.setHypixel(true);
                return;
            } else if (serverIP.contains(("mineplex"))) {
                AntiBot.setMineplex(true);
                AntiBot.setHypixel(false);
                return;
            }
        }

        AntiBot.setMineplex(false);
        AntiBot.setHypixel(false);
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.De;
import net.futureclient.client.Ha;
import net.futureclient.client.mF;

public class QF
extends Ha<De> {
    public final mF f$d;

@Override
public void f$E(De 0) {
    v0 = 0;
    v0.f$d.f$d.clear();
    if (mF.f$A().isSingleplayer() || mF.f$K().getCurrentServerData() == null) ** GOTO lbl-1000
    if (mF.f$B().getCurrentServerData().serverIP.toLowerCase().contains("hypixel")) {
        v1 = true;
    } else lbl-1000:
    // 2 sources

    {
        v1 = false;
    }
    mF.f$a(v0.f$d, v1);
    if (mF.f$e().isSingleplayer() || mF.f$a().getCurrentServerData() == null) ** GOTO lbl-1000
    if (mF.f$E().getCurrentServerData().serverIP.toLowerCase().contains("mineplex")) {
        v2 = true;
    } else lbl-1000:
    // 2 sources

    {
        v2 = false;
    }
    mF.f$E(0.f$d, v2);
}

    public QF(mF mF2) {
        0.f$d = mF2;
    }
}
 */