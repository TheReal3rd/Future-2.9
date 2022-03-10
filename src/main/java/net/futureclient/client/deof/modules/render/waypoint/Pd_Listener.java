package net.futureclient.client.deof.modules.render.waypoint;

public class Pd_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Eb;
import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.ME;
import net.futureclient.client.fA;
import net.futureclient.client.kH;
import net.futureclient.client.yB;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import org.lwjgl.opengl.Display;

public class Pd
extends Ha<ME> {
    public final yB f$d;

    public Pd(yB yB2) {
        0.f$d = yB2;
    }

    @Override
    public void f$E(ME mE) {
        if (yB.f$E(0.f$d) != null) {
            Pd pd = 0;
            if (yB.f$E(pd.f$d, yB.f$E(pd.f$d)) < 15.0f) {
                Pd pd2;
                if (Display.isActive()) {
                    ((Eb)kH.f$E().f$E().f$E(Eb.class)).f$E(false);
                    ((fA)kH.f$E().f$E().f$E(fA.class)).f$E(false);
                    La.f$E().f$E("You have reached your destination.");
                    pd2 = 0;
                } else if (yB.f$e().getConnection() == null) {
                    yB.f$a().world.sendQuittingDisconnectingPacket();
                    pd2 = 0;
                } else {
                    yB.f$E().getConnection().getNetworkManager().closeChannel((ITextComponent)new TextComponentString("You have reached your destination."));
                    pd2 = 0;
                }
                yB.f$E(pd2.f$d, null);
            }
        }
    }
}
 */