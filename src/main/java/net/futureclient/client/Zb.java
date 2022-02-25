package net.futureclient.client;

import net.futureclient.client.Eb;
import net.futureclient.client.Gf;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;

public class Zb
extends Ha<ME> {
    public final Eb f$d;

    public Zb(Eb eb) {
        0.f$d = eb;
    }

    @Override
    public void f$E(ME mE) {
        Class<?> clazz = Eb.f$K().player.movementInput.getClass();
        if (clazz == MovementInputFromOptions.class || clazz == MovementInput.class || clazz == Gf.f$h.getClass()) {
            Eb.f$E().updatePlayerMoveState();
            Eb.f$B().player.movementInput = Eb.f$E();
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bb;
import net.futureclient.client.JD;
import net.futureclient.client.QC;
import net.futureclient.client.Vb;
import net.futureclient.client.qc;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class ZB
extends Ba {
    private s f$M;
    private z<Boolean> f$d;
    private z<Boolean> f$g;

    public ZB() {
        ZB zB;
        String[] stringArray = new String[4];
        stringArray[0] = "EntityControl";
        stringArray[1] = "HorseJumpPower";
        stringArray[2] = "HorseJump";
        stringArray[3] = "HJ";
        super("EntityControl", stringArray, true, -15424990, JD.f$j);
        ZB zB2 = zB;
        String[] stringArray2 = new String[5];
        stringArray2[0] = "JumpStrength";
        stringArray2[1] = "JumpHeight";
        stringArray2[2] = "Strength";
        stringArray2[3] = "JumpStr";
        stringArray2[4] = "Str";
        zB2.f$M = new s((Number)0.7, (Number)0.0, (Number)2.0, 0.1, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Control";
        stringArray3[1] = "RidingControl";
        zB.f$g = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[7];
        stringArray4[0] = "No Pig AI";
        stringArray4[1] = "Pig AI";
        stringArray4[2] = "antipigai";
        stringArray4[3] = "nopigai";
        stringArray4[4] = "pigai";
        stringArray4[5] = "ai";
        stringArray4[6] = "pig";
        zB.f$d = new z<Boolean>(false, stringArray4);
        zB.f$E(zB.f$g, zB.f$M, zB.f$d);
        zB.f$E(new QC(zB), new qc(zB), new Bb(zB), new Vb(zB));
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static s f$E(ZB zB) {
        return zB.f$M;
    }

    public static z f$E(ZB zB) {
        return zB.f$g;
    }

    public static z f$a(ZB zB) {
        return zB.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Bd;
import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.Y;
import net.futureclient.client.lc;
import net.futureclient.client.q;
import net.futureclient.client.sf;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

public class zb
extends Ha<sf> {
    public final lc f$d;

    public zb(lc lc2) {
        0.f$d = lc2;
    }

    @Override
    public void f$E(sf sf2) {
        if (((Bd)((Object)0.f$d.f$b.f$E())).equals((Object)Bd.f$g)) {
            return;
        }
        double d = sf2.f$E().minY - lc.f$E(0.f$d);
        if (lc.f$E(0.f$d) && d > (double)sf2.f$E()) {
            int n;
            double[] dArray = new double[]{0.42, d < 1.0 && d > 0.8 ? 0.753 : 0.75, 1.0, 1.16, 1.23, 1.2};
            if (!((Bd)((Object)0.f$d.f$b.f$E())).equals((Object)Bd.f$M) && d >= 2.0) {
                dArray = new double[]{0.42, 0.78, 0.63, 0.51, 0.9, 1.21, 1.45, 1.43};
            }
            lc.f$E(0.f$d, d > 1.0 ? 0.15f : 0.35f);
            boolean bl = 0.f$d.f$I.f$E() != false && CG.f$E();
            int n2 = n = 0;
            while (n2 < (d > 1.0 ? dArray.length : 2)) {
                lc.f$B().player.connection.sendPacket((Packet)new CPacketPlayer.Position(lc.f$h().player.field_70165_t, lc.f$A().player.field_70163_u + dArray[n], lc.f$K().player.field_70161_v, true));
                if (0.f$d.f$I.f$E().booleanValue() && !bl) {
                    zb zb2 = 0;
                    lc.f$a(zb2.f$d);
                    if (lc.f$E(zb2.f$d) >= 2) {
                        ((q)((Y)lc.f$e()).getTimer()).f$E(lc.f$E(0.f$d));
                        lc.f$E(0.f$d, 0);
                    }
                }
                n2 = ++n;
            }
            lc.f$E(0.f$d, false);
        }
    }
}
package net.futureclient.client;

public enum zB {
    f$j,
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zB() {
        zB zB2;
    }
}
