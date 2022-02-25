package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Zb;
import net.futureclient.client.lC;
import net.futureclient.client.ob;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;

public class Eb
extends Ba {
    private final z<Boolean> f$d;
    private static final MovementInput f$g;

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    @Override
    public void f$B() {
        Eb eb;
        super.f$B();
        if (((Minecraft)Eb.f$d).player != null && Eb.f$d.player.movementInput.getClass() == f$g.getClass()) {
            MovementInputFromOptions movementInputFromOptions = new MovementInputFromOptions(((Minecraft)Eb.f$d).gameSettings);
            movementInputFromOptions.updatePlayerMoveState();
            Eb.f$d.player.movementInput = movementInputFromOptions;
        }
    }

    public static MovementInput f$E() {
        return f$g;
    }

    static {
        f$g = new lC(((Minecraft)Eb.f$d).gameSettings);
    }

    public Eb() {
        Eb eb;
        String[] stringArray = new String[2];
        stringArray[0] = "AutoWalk";
        stringArray[1] = "AutoRun";
        super("AutoWalk", stringArray, true, -6710870, JD.f$j);
        Eb eb2 = eb;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Lock";
        stringArray2[1] = "lock";
        stringArray2[2] = "l";
        eb2.f$d = new z<Boolean>(true, stringArray2);
        eb.f$E(eb.f$d);
        eb.f$E(new Zb(eb), new ob(eb));
    }

    public static z f$E(Eb eb) {
        return eb.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.FB;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.YC;
import net.minecraft.client.Minecraft;

public class EB
extends Ba {
    public static Minecraft f$E() {
        return f$d;
    }

    public EB() {
        EB eB;
        String[] stringArray = new String[5];
        stringArray[0] = "NameProtect";
        stringArray[1] = "Naemprotect";
        stringArray[2] = "name";
        stringArray[3] = "protect";
        stringArray[4] = "np";
        super("NameProtect", stringArray, false, 0x115555FF, JD.f$i);
        Ha[] haArray = new Ha[2];
        haArray[0] = new FB(eB);
        haArray[1] = new YC(eB);
        eB.f$E(haArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.Qc;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.kH;
import net.futureclient.client.sE;
import net.futureclient.client.wD;
import org.lwjgl.opengl.GL11;

public class eB
extends Ha<sE> {
    public final Qc f$d;

    public eB(Qc qc) {
        0.f$d = qc;
    }

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        if (!((Boolean)Qc.f$E(0.f$d).f$E()).booleanValue()) {
            return;
        }
        if (Qc.f$E(0.f$d) == null) {
            return;
        }
        Uh.f$B();
        GL11.glLineWidth((float)Qc.f$E(0.f$d).f$E().floatValue());
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        GL11.glColor4f((float)((float)wD2.f$a.getRed() / 255.0f), (float)((float)wD2.f$a.getGreen() / 255.0f), (float)((float)wD2.f$a.getBlue() / 255.0f), (float)0.5f);
        Qc.f$E(0.f$d).forEach(zH -> {
            GL11.glBegin((int)3);
            zH.f$E().forEach(oI -> {
                double d = oI.f$M - ((K)Qc.f$e().getRenderManager()).getRenderPosX();
                double d2 = oI.f$g - ((K)Qc.f$a().getRenderManager()).getRenderPosY();
                double d3 = oI.f$d - ((K)Qc.f$E().getRenderManager()).getRenderPosZ();
                GL11.glVertex3d((double)d, (double)d2, (double)d3);
            });
            GL11.glEnd();
        });
        GL11.glColor4f((float)((float)wD2.f$a.getRed() / 255.0f), (float)((float)wD2.f$a.getGreen() / 255.0f), (float)((float)wD2.f$a.getBlue() / 255.0f), (float)1.0f);
        GL11.glBegin((int)3);
        Qc.f$E(0.f$d).f$E().forEach(oI -> {
            double d = oI.f$M - ((K)Qc.f$A().getRenderManager()).getRenderPosX();
            double d2 = oI.f$g - ((K)Qc.f$K().getRenderManager()).getRenderPosY();
            double d3 = oI.f$d - ((K)Qc.f$B().getRenderManager()).getRenderPosZ();
            GL11.glVertex3d((double)d, (double)d2, (double)d3);
        });
        GL11.glEnd();
        Uh.f$e();
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Y;
import net.futureclient.client.ic;
import net.futureclient.client.kH;
import net.futureclient.client.q;

public class eb
extends Ha<ME> {
    public final ic f$d;

    @Override
    public void f$E(ME mE) {
        0.f$d.f$a(String.format("Timer \u00a77[\u00a7F%s\u00a77]", (double)Math.round((double)((q)((Y)ic.f$A()).getTimer()).f$E() * 100.0) / 100.0));
        if (ic.f$K().player == null) {
            ((q)((Y)ic.f$B()).getTimer()).f$E(1.0f);
            return;
        }
        if (((Boolean)ic.f$E(0.f$d).f$E()).booleanValue()) {
            if ((double)(kH.f$E().f$E().f$E() / 20.0f) > 0.01) {
                ((q)((Y)ic.f$e()).getTimer()).f$E(kH.f$E().f$E().f$E() / 20.0f);
                return;
            }
            ((q)((Y)ic.f$a()).getTimer()).f$E(1.0f);
            return;
        }
        ((q)((Y)ic.f$E()).getTimer()).f$E(ic.f$E(0.f$d).f$E().floatValue());
    }

    public eb(ic ic2) {
        0.f$d = ic2;
    }
}
