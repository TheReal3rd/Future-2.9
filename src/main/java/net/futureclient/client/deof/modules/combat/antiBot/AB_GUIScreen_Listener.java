package net.futureclient.client.deof.modules.combat.antiBot;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.GUIScreenEvent;
import net.minecraft.client.gui.GuiDownloadTerrain;

public class AB_GUIScreen_Listener extends Listener<GUIScreenEvent> {
    public final AntiBot antiBot;// f$d

    public AB_GUIScreen_Listener(AntiBot mF2) {
        antiBot = mF2;
    }
    @Override
    public void invoke(GUIScreenEvent wf) {
        if (wf.getScreen() instanceof GuiDownloadTerrain) {
            antiBot.botMap.clear();
        }
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Wf;
import net.futureclient.client.mF;
import net.minecraft.client.gui.GuiDownloadTerrain;

public class BF
extends Ha<Wf> {
    public final mF f$d;

    @Override
    public void f$E(Wf wf) {
        if (wf.f$E() instanceof GuiDownloadTerrain) {
            0.f$d.f$d.clear();
        }
    }

    public BF(mF mF2) {
        0.f$d = mF2;
    }
}
 */