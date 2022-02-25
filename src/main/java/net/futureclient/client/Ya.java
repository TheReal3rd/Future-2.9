package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.dg;
import net.futureclient.client.ya;

public class Ya
extends Ha<dg> {
    public final ya f$d;

    public Ya(ya ya2) {
        0.f$d = ya2;
    }

    @Override
    public void f$E(dg dg2) {
        if (!((Boolean)ya.f$E(0.f$d).f$E()).booleanValue() || !ya.f$E().player.field_70122_E) {
            return;
        }
        dg2.f$E(true);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Rf;
import net.futureclient.client.va;
import net.futureclient.client.yB;

public class YA
extends Ha<Rf> {
    public final yB f$d;

    @Override
    public void f$E(Rf rf) {
        if (((Boolean)yB.f$E(0.f$d).f$E()).booleanValue()) {
            va va2 = 0.f$d.f$a(new StringBuilder().insert(0, rf.f$E()).append("_logout_spot").toString());
            if (va2 != null && yB.f$E(0.f$d, va2)) {
                0.f$d.f$i.remove(va2);
            }
        }
    }

    public YA(yB yB2) {
        0.f$d = yB2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Ya;
import net.futureclient.client.z;
import net.futureclient.client.za;
import net.minecraft.client.Minecraft;

public final class ya
extends Ba {
    private final z<Boolean> f$g;
    private final z<Boolean> f$d;

    public ya() {
        ya ya2;
        String[] stringArray = new String[7];
        stringArray[0] = "NoGlitchBlocks";
        stringArray[1] = "NoGlitchyBlocks";
        stringArray[2] = "glitchyblocks";
        stringArray[3] = "noglitchyblocks";
        stringArray[4] = "ngb";
        stringArray[5] = "antidesync";
        stringArray[6] = "nodesync";
        super("NoGlitchBlocks", stringArray, true, -2525659, JD.f$M);
        ya ya3 = ya2;
        String[] stringArray2 = new String[1];
        stringArray2[0] = "Place";
        ya3.f$g = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[1];
        stringArray3[0] = "Destroy";
        ya2.f$d = new z<Boolean>(true, stringArray3);
        ya2.f$E(ya2.f$g, ya2.f$d);
        ya2.f$E(new za(ya2), new Ya(ya2));
    }

    public static z f$a(ya ya2) {
        return ya2.f$d;
    }

    public static z f$E(ya ya2) {
        return ya2.f$g;
    }

    public static Minecraft f$E() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Pg;
import net.futureclient.client.ka;
import net.futureclient.client.pc;
import net.futureclient.client.sA;
import net.futureclient.client.wb;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.MobEffects;

public class yA
extends Ba {
    public ka<pc> f$d;

    public static Minecraft f$a() {
        return f$d;
    }

    @Override
    public void f$B() {
        yA yA2;
        super.f$B();
        KeyBinding.setKeyBindState((int)yA.f$d.gameSettings.keyBindSprint.getKeyCode(), (boolean)Pg.f$E(yA.f$d.gameSettings.keyBindSprint));
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static boolean f$E(yA yA2) {
        return yA2.f$e();
    }

    private boolean f$e() {
        return !((Minecraft)yA.f$d).player.isSneaking() && !yA.f$d.player.field_70123_F && Pg.f$e() && ((float)((Minecraft)yA.f$d).player.func_71024_bL().getFoodLevel() > 6.0f || yA.f$d.player.field_71075_bZ.allowFlying) && !((Minecraft)yA.f$d).player.func_70644_a(MobEffects.BLINDNESS);
    }

    public yA() {
        yA yA2;
        String[] stringArray = new String[4];
        stringArray[0] = "Sprint";
        stringArray[1] = "Spritn";
        stringArray[2] = "Spri";
        stringArray[3] = "Sprnt";
        super("Sprint", stringArray, true, -7030642, JD.f$j);
        yA yA3 = yA2;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Mode";
        stringArray2[1] = "m";
        stringArray2[2] = "Type";
        stringArray2[3] = "Mod";
        yA3.f$d = new ka<pc>(pc.f$M, stringArray2);
        yA2.f$E(yA2.f$d);
        yA2.f$E(new sA(yA2), new wb(yA2));
    }
}
