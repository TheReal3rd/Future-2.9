package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.pA;
import net.futureclient.client.wC;

public class RB
extends Ha<Pf> {
    public final wC f$d;

    @Override
    public void f$E(Pf pf) {
        RB rB;
        if (((pA)((Object)wC.f$E(0.f$d).f$E())).equals((Object)pA.f$M)) {
            RB rB2 = 0;
            rB = rB2;
            0.f$d.f$a(new StringBuilder().insert(0, "Velocity \u00a77[\u00a7FH").append(rB2.f$d.f$g.f$E().doubleValue()).append("%\u00a77|\u00a7FV").append(0.f$d.f$d.f$E().doubleValue()).append("%\u00a77]").toString());
        } else {
            0.f$d.f$a(String.format("Velocity \u00a77[\u00a7F%s\u00a77]", wC.f$E(0.f$d).f$E()));
            rB = 0;
        }
        if (((pA)((Object)wC.f$E(rB.f$d).f$E())).equals((Object)pA.f$g) && wC.f$a().player.field_70737_aN != 0) {
            wC.f$E().player.field_70122_E = true;
        }
    }

    public RB(wC wC2) {
        0.f$d = wC2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.Pg;
import net.futureclient.client.rA;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Rb
extends Ha<Ee> {
    public final rA f$d;

    public Rb(rA rA2) {
        0.f$d = rA2;
    }

    @Override
    public void f$E(Ee ee) {
        if (rA.f$P().currentScreen instanceof GuiGameOver) {
            0.f$d.f$E(false);
            return;
        }
        Rb rb = 0;
        rA.f$E((rA)rb.f$d).movementInput.updatePlayerMoveState();
        rA.f$E(rb.f$d).func_70606_j(rA.f$Q().player.func_110143_aJ());
        rA.f$E(rb.f$d).func_110149_m(rA.f$U().player.func_110139_bj());
        rA.f$E(rb.f$d).func_184819_a(rA.f$J().player.func_184591_cq());
        rA.f$E((rA)rb.f$d).field_70169_q = rA.f$E((rA)0.f$d).field_70142_S = rA.f$E((rA)0.f$d).field_70165_t;
        rA.f$E((rA)0.f$d).field_70167_r = rA.f$E((rA)0.f$d).field_70137_T = rA.f$E((rA)0.f$d).field_70163_u;
        rA.f$E((rA)0.f$d).field_70166_s = rA.f$E((rA)0.f$d).field_70136_U = rA.f$E((rA)0.f$d).field_70161_v;
        Rb rb2 = 0;
        double[] dArray = Pg.f$E(rA.f$E(0.f$d), rA.f$E(rb2.f$d).f$E().doubleValue());
        rA.f$E((rA)0.f$d).field_70159_w = dArray[0];
        rA.f$E((rA)0.f$d).field_70181_x = rA.f$E((rA)0.f$d).movementInput.jump ? rA.f$E(0.f$d).f$E().doubleValue() : (rA.f$E((rA)0.f$d).movementInput.sneak ? -rA.f$E(0.f$d).f$E().doubleValue() : 0.0);
        rA.f$E((rA)0.f$d).field_70179_y = dArray[1];
        rA.f$E(rb2.f$d).func_174826_a(rA.f$E(0.f$d).func_174813_aQ().offset(rA.f$E((rA)0.f$d).field_70159_w, rA.f$E((rA)0.f$d).field_70181_x, rA.f$E((rA)0.f$d).field_70179_y));
        rA.f$E(0.f$d).func_174829_m();
        rA.f$E((rA)0.f$d).field_70176_ah = MathHelper.floor((double)(rA.f$E((rA)0.f$d).field_70165_t / 16.0));
        rA.f$E((rA)0.f$d).field_70164_aj = MathHelper.floor((double)(rA.f$E((rA)0.f$d).field_70161_v / 16.0));
        rA.f$E((rA)0.f$d).field_71071_by = rA.f$d().player.field_71071_by;
        rA.f$E((rA)0.f$d).field_71069_bz = rA.f$l().player.field_71069_bz;
        rA.f$E((rA)0.f$d).field_71075_bZ = rA.f$k().player.field_71075_bZ;
        rA.f$E((rA)0.f$d).field_70737_aN = rA.f$b().player.field_70737_aN;
        rA.f$E((rA)0.f$d).field_70738_aO = rA.f$F().player.field_70738_aO;
        rA.f$E((rA)0.f$d).field_70739_aP = rA.f$G().player.field_70739_aP;
        if (rA.f$D().getRenderViewEntity() != rA.f$E(0.f$d)) {
            rA.f$E(0.f$d, rA.f$g().getRenderViewEntity());
            rA.f$m().setRenderViewEntity((Entity)rA.f$E(0.f$d));
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JB;
import net.futureclient.client.JD;
import net.futureclient.client.VA;
import net.futureclient.client.s;
import net.minecraft.client.Minecraft;

public class rB
extends Ba {
    private s f$d;

    public static s f$E(rB rB2) {
        return rB2.f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public rB() {
        rB rB2;
        String[] stringArray = new String[4];
        stringArray[0] = "Heaven";
        stringArray[1] = "GoHeaven";
        stringArray[2] = "AutoHeaven";
        stringArray[3] = "Blessing";
        super("Heaven", stringArray, true, -10887189, JD.f$b);
        rB rB3 = rB2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Speed";
        stringArray2[1] = "Sped";
        rB3.f$d = new s((Number)Float.valueOf(0.75f), (Number)Float.valueOf(-10.0f), (Number)Float.valueOf(10.0f), 0.1, stringArray2);
        rB2.f$E(rB2.f$d);
        rB2.f$E(new JB(rB2), new VA(rB2));
    }

    public static Minecraft f$e() {
        return f$d;
    }
}
