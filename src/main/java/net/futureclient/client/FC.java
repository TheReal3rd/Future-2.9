package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.dd;
import net.futureclient.client.s;
import net.futureclient.client.uA;
import net.futureclient.client.ze;

public class FC
extends Ha<ze> {
    public final uA f$d;

    public FC(uA uA2) {
        0.f$d = uA2;
    }

    @Override
    public void f$E(ze ze2) {
        if (((dd)((Object)0.f$d.f$K.f$E())).equals((Object)dd.f$M) && uA.f$E(0.f$d).f$E(100L)) {
            ze2.f$E(((s)uA.f$E(0.f$d)).f$E().intValue());
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.he;
import net.futureclient.client.wC;

public class Fc
extends Ha<he> {
    public final wC f$d;

    public Fc(wC wC2) {
        0.f$d = wC2;
    }

    @Override
    public void f$E(he he2) {
        if (0.f$d.f$b.f$E().booleanValue()) {
            he2.f$E(true);
        }
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.Ha;
import net.futureclient.client.LB;
import net.futureclient.client.OI;
import net.futureclient.client.Pf;
import net.futureclient.client.ZH;
import net.futureclient.client.fC;
import net.futureclient.client.jc;
import net.futureclient.client.kF;
import net.futureclient.client.tI;

public class fc
extends Ha<Pf> {
    public final jc f$d;

    @Override
    public void f$E(Pf pf) {
        fc fc2;
        0.f$d.f$a(String.format("FakeLag \u00a77[\u00a7F%s\u00a77]", jc.f$E(0.f$d).size()));
        if (!pf.f$E().equals((Object)kF.f$M)) {
            return;
        }
        fc fc3 = 0;
        jc.f$a(fc3.f$d, new OI(jc.f$g().player.field_70165_t, jc.f$m().player.field_70163_u, jc.f$f().player.field_70161_v));
        if (jc.f$a(fc3.f$d).equals(tI.f$d)) {
            return;
        }
        if (jc.f$E(0.f$d) == null) {
            ArrayList<OI> arrayList = new ArrayList<OI>();
            jc.f$E(0.f$d, new ZH(0, null, jc.f$L().world.field_73011_w.getDimensionType(), jc.f$a(0.f$d), arrayList));
        }
        fc fc4 = 0;
        fc fc5 = 0;
        jc.f$E(fc4.f$d, jc.f$E(fc4.f$d).f$E().isEmpty() ? jc.f$a(fc5.f$d) : jc.f$E(fc5.f$d).f$E().get(jc.f$E(0.f$d).f$E().size() - 1));
        if (jc.f$E(0.f$d).f$E().isEmpty() || !jc.f$a(0.f$d).equals(jc.f$E(0.f$d))) {
            jc.f$E(0.f$d).f$E().add(jc.f$a(0.f$d));
        }
        if (((LB)((Object)jc.f$a(0.f$d).f$E())).equals((Object)LB.f$M)) {
            return;
        }
        switch ((fC)((Object)jc.f$E(0.f$d).f$E())) {
            case f$M: {
                while (false) {
                }
                jc.f$E(0.f$d, !jc.f$i().player.field_70122_E);
                fc2 = 0;
                break;
            }
            case f$g: {
                jc.f$E(0.f$d, jc.f$c().player.field_70122_E);
            }
            default: {
                fc2 = 0;
            }
        }
        if (jc.f$E(fc2.f$d) || jc.f$E(0.f$d).size() >= jc.f$E(0.f$d).f$E().intValue()) {
            jc.f$E(0.f$d).forEach(packet -> jc.f$K().player.connection.sendPacket(packet));
            fc fc6 = 0;
            jc.f$E(fc6.f$d).clear();
            jc.f$E(fc6.f$d).func_70080_a(jc.f$a((jc)0.f$d).f$M, jc.f$a((jc)0.f$d).f$g, jc.f$a((jc)0.f$d).f$d, jc.f$I().player.field_70177_z, jc.f$j().player.field_70125_A);
            jc.f$E((jc)0.f$d).field_71071_by = jc.f$M().player.field_71071_by;
            jc.f$E((jc)fc6.f$d).field_71069_bz = jc.f$C().player.field_71069_bz;
            jc.f$E((jc)fc6.f$d).field_70759_as = jc.f$H().player.field_70759_as;
            jc.f$E(fc6.f$d).func_70095_a(jc.f$h().player.isSneaking());
            jc.f$E(fc6.f$d, null);
            fc fc7 = 0;
            jc.f$E(fc7.f$d, jc.f$A().player.field_70181_x);
            jc.f$E(fc7.f$d, false);
        }
    }

    public fc(jc jc2) {
        0.f$d = jc2;
    }
}
package net.futureclient.client;

public enum fC {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fC() {
        fC fC2;
    }
}
