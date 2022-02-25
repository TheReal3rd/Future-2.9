package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.gg;
import net.minecraft.client.Minecraft;

public final class LE
extends Ba {
    public LE() {
        LE lE;
        String[] stringArray = new String[3];
        stringArray[0] = "NoMineAnimation";
        stringArray[1] = "NoBreakAnimation";
        stringArray[2] = "animationdesync";
        super("NoMineAnimation", stringArray, true, 10454595, JD.f$K);
        lE.f$E(new gg(lE));
    }

    public static Minecraft f$E() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.RE;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class Le
extends Ba {
    private final z<Boolean> f$d;
    private final s f$g;

    public static Minecraft f$a() {
        return f$d;
    }

    public Le() {
        Le le;
        String[] stringArray = new String[3];
        stringArray[0] = "AutoBowRelease";
        stringArray[1] = "BowRelease";
        stringArray[2] = "BowSpammer";
        super("AutoBowRelease", stringArray, true, -4632381, JD.f$I);
        Le le2 = le;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Ticks";
        stringArray2[1] = "Delay";
        le2.f$g = new s((Number)Float.valueOf(21.0f), (Number)Float.valueOf(3.0f), (Number)Float.valueOf(21.0f), 1, stringArray2);
        Le le3 = le;
        String[] stringArray3 = new String[4];
        stringArray3[0] = "TPSSync";
        stringArray3[1] = "Sync";
        stringArray3[2] = "TPSSynchronize";
        stringArray3[3] = "Synchronize";
        le3.f$d = new z<Boolean>(true, stringArray3);
        z[] zArray = new z[2];
        zArray[0] = le.f$g;
        zArray[1] = le.f$d;
        le.f$E(zArray);
        le.f$E(new RE(le));
    }

    public static s f$E(Le le) {
        return le.f$g;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static z f$E(Le le) {
        return le.f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.vF;

public class le
extends Ha<Pf> {
    public final vF f$d;

    @Override
    public void f$E(Pf pf) {
        switch (pf.f$E()) {
            case f$M: {
                float f;
                le le2 = 0;
                while (false) {
                }
                le2.f$d.f$M = vF.f$E(le2.f$d, pf, 360.0f);
                if (!le2.f$d.f$e()) break;
                float f2 = (float)(vF.f$a().player.func_184607_cu().getMaxItemUseDuration() - vF.f$E().player.func_184605_cv()) / 20.0f;
                f2 = (f2 * f2 + f2 * 2.0f) / 3.0f;
                if (f >= 1.0f) {
                    f2 = 1.0f;
                }
                double d = f2 * 3.0f;
                double d2 = 0.05f;
                vF.f$E(0.f$d, pf, d, d2);
            }
        }
    }

    public le(vF vF2) {
        0.f$d = vF2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.TE;
import net.futureclient.client.XE;
import net.futureclient.client.af;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public class lE
extends Ba {
    private z<Boolean> f$g;
    private boolean f$d;

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    @Override
    public void f$B() {
        lE lE2;
        super.f$B();
        if (!lE.f$d.player.movementInput.sneak) {
            lE.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$d.player, CPacketEntityAction.Action.STOP_SNEAKING));
        }
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public boolean f$e() {
        lE lE2;
        return lE2.f$g.f$E();
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static boolean f$E(lE lE2) {
        return lE2.f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static boolean f$E(lE lE2, boolean bl) {
        lE2.f$d = bl;
        return lE2.f$d;
    }

    public static z f$E(lE lE2) {
        return lE2.f$g;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public lE() {
        lE lE2;
        String[] stringArray = new String[3];
        stringArray[0] = "Sneak";
        stringArray[1] = "Snea";
        stringArray[2] = "Snek";
        super("Sneak", stringArray, true, -4801884, JD.f$b);
        lE lE3 = lE2;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "SafeWalk";
        stringArray2[1] = "sw";
        stringArray2[2] = "safe";
        lE3.f$g = new z<Boolean>(false, stringArray2);
        lE2.f$E(lE2.f$g);
        lE2.f$E(new TE(lE2), new XE(lE2), new af(lE2));
    }

    public static Minecraft f$E() {
        return f$d;
    }
}
