package net.futureclient.client.deof.modules.movement.autoWalk;

public class AutoWalk {
}
/*
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
 */