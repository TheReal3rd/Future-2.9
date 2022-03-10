package net.futureclient.client.deof.modules.render.waypoint;

public class UB_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Wf;
import net.futureclient.client.va;
import net.futureclient.client.yB;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiGameOver;

public class UB
extends Ha<Wf> {
    public final yB f$d;

    public UB(yB yB2) {
        0.f$d = yB2;
    }

    @Override
    public void f$E(Wf wf) {
        if (wf.f$E() instanceof GuiGameOver && ((Boolean)yB.f$a(0.f$d).f$E()).booleanValue()) {
            String string = "";
            if (yB.f$b().isSingleplayer()) {
                string = "singleplayer";
            } else if (yB.f$F().getCurrentServerData() != null) {
                string = yB.f$G().getCurrentServerData().serverIP.replaceAll(":", "_");
            } else if (yB.f$D().isConnectedToRealms()) {
                string = "realms";
            }
            EntityPlayerSP entityPlayerSP = yB.f$g().getRenderViewEntity() == null ? yB.f$m().player : yB.f$f().getRenderViewEntity();
            UB uB = 0;
            double d = Double.parseDouble(yB.f$E(uB.f$d).format(entityPlayerSP.posX).replaceAll(",", "."));
            double d2 = Double.parseDouble(yB.f$E(uB.f$d).format(entityPlayerSP.posY).replaceAll(",", "."));
            double d3 = Double.parseDouble(yB.f$E(uB.f$d).format(entityPlayerSP.posZ).replaceAll(",", "."));
            va va2 = uB.f$d.f$a("Death");
            if (va2 != null && entityPlayerSP.getDistance(va2.f$a(), va2.f$E(), va2.f$e()) > 100.0 || !string.equalsIgnoreCase(va2.f$e())) {
                if (yB.f$E(0.f$d, va2)) {
                    0.f$d.f$i.remove(va2);
                }
                va va3 = new va("Death", string, d, d2, d3, yB.f$L().world.field_73011_w.getDimensionType().getName());
                0.f$d.f$i.add(va3);
                return;
            }
            if (0.f$d.f$a("Death") == null) {
                va va4 = new va("Death", string, d, d2, d3, yB.f$i().world.field_73011_w.getDimensionType().getName());
                0.f$d.f$i.add(va4);
            }
        }
    }
}
 */