package net.futureclient.client;

import net.futureclient.client.Eg;
import net.futureclient.client.Ha;
import net.futureclient.client.Wf;
import net.futureclient.client.Ze;
import net.minecraft.client.gui.GuiDownloadTerrain;

public class oe
extends Ha<Wf> {
    public final Ze f$d;

    @Override
    public void f$E(Wf wf) {
        if (!((Eg)((Object)Ze.f$E(0.f$d).f$E())).equals((Object)Eg.f$i) && wf.f$E() instanceof GuiDownloadTerrain) {
            0.f$d.f$E(false);
        }
    }

    public oe(Ze ze) {
        0.f$d = ze;
    }
}
