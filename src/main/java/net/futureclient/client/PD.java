package net.futureclient.client;

import net.futureclient.client.ue;
import net.minecraft.util.MovementInput;

public class PD
extends ue {
    public PD(MovementInput movementInput) {
        super(movementInput);
    }
}
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
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.LA;
import net.futureclient.client.Nc;
import net.futureclient.client.xa;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class pd
extends Ba {
    private z<Boolean> f$d;
    public xa f$g;

    public pd() {
        pd pd2;
        String[] stringArray = new String[3];
        stringArray[0] = "TabGui";
        stringArray[1] = "tabui";
        stringArray[2] = "tabs";
        super("TabGui", stringArray, false, -23445, JD.f$i);
        pd pd3 = pd2;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "UseEnter";
        stringArray2[1] = "Enter";
        stringArray2[2] = "AllowEnter";
        stringArray2[3] = "Usenter";
        pd3.f$d = new z<Boolean>(true, stringArray2);
        pd2.f$E(pd2.f$d);
        pd2.f$E(new LA(pd2));
        pd2.f$E(new Nc(pd2));
    }

    public static z f$E(pd pd2) {
        return pd2.f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.entity.item.EntityItem;

public class pD
extends RF {
    private EntityItem f$d;

    public pD(EntityItem entityItem) {
        0.f$d = entityItem;
    }

    public EntityItem f$E() {
        pD pD2;
        return pD2.f$d;
    }
}
