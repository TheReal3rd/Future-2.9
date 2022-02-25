package net.futureclient.client;

import net.futureclient.client.B;
import net.futureclient.client.Eg;
import net.futureclient.client.Ha;
import net.futureclient.client.KD;
import net.futureclient.client.Ze;
import net.minecraft.item.ItemFood;

public class FE
extends Ha<KD> {
    public final Ze f$d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(KD kD) {
        0.f$d.f$a(String.format("Aura \u00a77[\u00a7F%s\u00a77]", 0.f$d.f$a.f$E()));
        if (!((Eg)((Object)Ze.f$E(0.f$d).f$E())).equals((Object)Eg.f$i) && Ze.f$a().player.func_110143_aJ() <= 0.0f) {
            0.f$d.f$E(false);
        }
        if (!0.f$d.f$r.f$E().booleanValue() && ((B)Ze.f$E().player).getActiveItemStack().getItem() instanceof ItemFood) {
            return;
        }
        switch (kD.f$E()) {
            case f$M: {
                Ze.f$E(0.f$d, kD);
                return;
            }
            case f$g: {
                Ze.f$E(0.f$d);
                return;
            }
        }
    }

    public FE(Ze ze) {
        0.f$d = ze;
    }
}
package net.futureclient.client;

import net.futureclient.client.ue;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.MovementInput;

public class Fe
extends ue {
    private boolean f$d;
    private final KeyBinding f$g;

    public Fe(MovementInput movementInput, KeyBinding keyBinding, boolean bl) {
        Fe fe = 0;
        super(movementInput);
        fe.f$g = keyBinding;
        fe.f$d = bl;
    }

    public void f$a(boolean bl) {
        0.f$d = bl;
    }

    public KeyBinding f$E() {
        Fe fe;
        return fe.f$g;
    }

    public boolean f$a() {
        Fe fe;
        return fe.f$d;
    }
}
package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.Re;
import net.futureclient.client.UD;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.uA;
import net.futureclient.client.xE;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

public class fe
extends Ba {
    private final Bh f$g;
    private final Random f$d;
    public ka<xE> f$M;

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    private boolean f$e() {
        uA uA2 = (uA)kH.f$E().f$E().f$E(uA.class);
        return (uA2 == null || !uA2.f$E()) && fe.f$d.player.field_70122_E && fe.f$d.player.field_70124_G && !((Minecraft)fe.f$d).player.func_180799_ab() && !((Minecraft)fe.f$d).player.func_70090_H();
    }

    public static boolean f$E(fe fe2) {
        return fe2.f$e();
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public void f$A() {
        fe fe2;
        if (!fe2.f$e()) {
            return;
        }
        if (fe2.f$M.f$E() == xE.f$g && fe2.f$g.f$E(500L)) {
            int n;
            fe fe3 = fe2;
            double d = 1.0E-7 + 1.0E-7 * (1.0 + (double)fe3.f$d.nextInt(fe3.f$d.nextBoolean() ? 34 : 43));
            double[] dArray = new double[]{0.1016 + d * 3.0, 0.0202 + d * 2.0, 3.239E-4 + d};
            int n2 = dArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                d = dArray[n];
                fe.f$d.player.connection.sendPacket((Packet)new CPacketPlayer.Position(fe.f$d.player.field_70165_t, fe.f$d.player.field_70163_u + d, fe.f$d.player.field_70161_v, false));
                n3 = ++n;
            }
            fe2.f$g.f$a();
        }
    }

    public fe() {
        fe fe2;
        String[] stringArray = new String[4];
        stringArray[0] = "Criticals";
        stringArray[1] = "critical";
        stringArray[2] = "crit";
        stringArray[3] = "crits";
        super("Criticals", stringArray, true, -3343176, JD.f$I);
        fe fe3 = fe2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Mode";
        stringArray2[1] = "m";
        fe3.f$M = new ka<xE>(xE.f$M, stringArray2);
        fe2.f$g = new Bh();
        fe2.f$d = new Random();
        fe2.f$E(fe2.f$M);
        fe2.f$E(new Re(fe2), new UD(fe2));
    }
}
package net.futureclient.client;

import net.futureclient.client.Af;
import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.kH;

public class fE
extends Ha<Af> {
    public final Ba f$d;

    public fE(Ba ba) {
        0.f$d = ba;
    }

    @Override
    public void f$E(Af af) {
        if (Ba.f$E(0.f$d) && 0.f$d.f$b < 0.0f) {
            0.f$d.f$b += 5.0f;
            return;
        }
        kH.f$E().f$E().f$E(0);
    }
}
