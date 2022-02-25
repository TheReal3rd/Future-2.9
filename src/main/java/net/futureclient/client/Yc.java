package net.futureclient.client;

import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.b;
import net.futureclient.client.cC;

public class Yc
extends Ha<Ee> {
    public final cC f$d;

    public Yc(cC cC2) {
        0.f$d = cC2;
    }

    @Override
    public void f$E(Ee ee) {
        if (0.f$d.f$j.f$E().booleanValue() && cC.f$E(0.f$d).f$E(250L) && ((b)cC.f$F().player).isIsInWeb()) {
            if (cC.f$G().player.field_70122_E) {
                Ee ee2 = ee;
                ee2.f$e(ee2.f$e() * cC.f$E(0.f$d).f$E().doubleValue());
                ee2.f$E(ee2.f$E() * cC.f$E(0.f$d).f$E().doubleValue());
                return;
            }
            if (cC.f$D().player.movementInput.sneak) {
                double d = cC.f$E(0.f$d).f$E().doubleValue() + 10.0;
                ee.f$a(ee.f$a() * d);
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.EB;
import net.futureclient.client.Ha;
import net.futureclient.client.dF;
import net.futureclient.client.kH;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;

public class YC
extends Ha<dF> {
    public final EB f$d;

    @Override
    public void f$E(dF dF2) {
        String[] stringArray = new String[]{dF2.f$E()};
        if (!stringArray[0].startsWith(kH.f$E().f$E().f$E()) && !dF2.f$E()) {
            dF2.f$E(true);
            kH.f$E().f$E().f$E().forEach(eg2 -> {
                if (stringArray[0].contains(new StringBuilder().insert(0, "-").append(eg2.f$a()).toString())) {
                    stringArray[0] = stringArray[0].replaceAll(new StringBuilder().insert(0, "-").append(eg2.f$a()).toString(), eg2.f$E());
                }
            });
            EB.f$E().getConnection().sendPacket((Packet)new CPacketChatMessage(stringArray[0]));
        }
    }

    public YC(EB eB) {
        0.f$d = eB;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.RA;
import net.futureclient.client.ji;

public class yc
extends Ha<ME> {
    public final RA f$d;

    public yc(RA rA) {
        0.f$d = rA;
    }

    @Override
    public void f$E(ME mE) {
        if (RA.f$E(0.f$d) == null || !RA.f$E(0.f$d).equals(RA.f$E(0.f$d).f$E())) {
            yc yc2 = 0;
            RA.f$E(yc2.f$d, (ji)((Object)RA.f$E(yc2.f$d).f$E()));
            if (!((ji)((Object)RA.f$E(0.f$d).f$E())).equals((Object)ji.f$Ya)) {
                0.f$d.f$a(String.format("Translate \u00a77[\u00a7F%s\u00a77]", RA.f$E(0.f$d).f$E()));
                return;
            }
            0.f$d.f$a("Translate");
        }
    }
}
