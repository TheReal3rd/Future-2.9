package net.futureclient.client.deof.modules.movement.sprint;

public class Sprint {
}
/*
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
 */