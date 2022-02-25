package net.futureclient.client.deof.baritone;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.process.IBaritoneProcess;
import net.futureclient.client.*;
import net.minecraft.util.text.ITextComponent;

public class BaritoneRunnable implements Runnable{

    @Override
    public void run() {
        CI cI;
        BaritoneAPI.getProvider().getPrimaryBaritone().getPathingControlManager().registerProcess((IBaritoneProcess) uh.f$M);
        Settings settings = BaritoneAPI.getSettings();
        BaritoneAPI.getSettings().chatControl.value = false;
        BaritoneAPI.getSettings().logger.value = iTextComponent -> La.f$E().f$E((ITextComponent)iTextComponent, false);
        kH.f$E().f$E().f$a(new zg());
        kH.f$E().f$E().f$a(new ej());
        String[] stringArray = new String[1];
        stringArray[0] = "Baritone";
        kH.f$E().f$E().f$E(new Mh(cI, "Baritone", stringArray, settings));
    }

}
