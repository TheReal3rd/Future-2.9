package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.Ha;
import net.futureclient.client.RG;
import net.futureclient.client.jf;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.network.play.server.SPacketTimeUpdate;

public class VG extends Ha<jf> {
    public final RG f$d;

    @Override
    public void f$E(jf jf2) {
        if (!(jf2.f$E() instanceof SPacketChat)) {
            RG.f$E(0.f$d).f$E();
        }
        if (jf2.f$E() instanceof SPacketTimeUpdate) {
            if (RG.f$E(0.f$d) != 0L) {
                if (RG.f$E(0.f$d).size() > 20) {
                    RG.f$E(0.f$d).poll();
                }
                RG.f$E(0.f$d).add(Float.valueOf(20.0f * (1000.0f / (float)(System.currentTimeMillis() - RG.f$E(0.f$d)))));
                float f = 0.0f;
                Iterator iterator = RG.f$E(0.f$d).iterator();
                Iterator iterator2 = iterator;
                while (iterator2.hasNext()) {
                    Float f2 = (Float)iterator.next();
                    f += Math.max(0.0f, Math.min(20.0f, f2.floatValue()));
                    iterator2 = iterator;
                }
                RG.f$E(0.f$d, f /= (float)RG.f$E(0.f$d).size());
            }
            RG.f$E(0.f$d, System.currentTimeMillis());
        }
    }

    public VG(RG rG) {
        0.f$d = rG;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.Vd;
import net.futureclient.client.kH;
import org.apache.logging.log4j.Level;

public class Vg extends Ha<Vd> {
    public final kH f$d;

    public Vg(kH kH2) {
        0.f$d = kH2;
    }

    @Override
    public void f$E(Vd vd) {
        La.f$E().f$E(Level.INFO, "Initiated client shutdown.");
        this.f$d.f$E().f$E().forEach(ib -> ib.f$a(new Object[0]));
        La.f$E().f$E(Level.INFO, "Finished client shutdown.");
    }
}
