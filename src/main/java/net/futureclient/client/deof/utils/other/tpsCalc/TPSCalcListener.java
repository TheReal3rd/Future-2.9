package net.futureclient.client.deof.utils.other.tpsCalc;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.PacketEvent;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.network.play.server.SPacketTimeUpdate;

public class TPSCalcListener extends Listener<PacketEvent> {
    public final TPSCalc tpsCalc;// OG f$d

    public TPSCalcListener(TPSCalc rG) {
        this.tpsCalc = rG;
    }

    @Override
    public void invoke (PacketEvent jf2) {
        if (!(jf2.getPacket() instanceof SPacketChat)) {
            TPSCalc.getDelayTimer(this.tpsCalc).reset();
        }
        if (jf2.getPacket() instanceof SPacketTimeUpdate) {
            if (TPSCalc.getTime(this.tpsCalc) != 0L) {
                if (TPSCalc.getTPSResults(this.tpsCalc).size() > 20) {
                    TPSCalc.getTPSResults(this.tpsCalc).poll();
                }
                TPSCalc.getTPSResults(this.tpsCalc).add(20.0f * (1000.0f / (float) (System.currentTimeMillis() - TPSCalc.getTime(this.tpsCalc))));
                float f = 0.0f;
                for(Float value : TPSCalc.getTPSResults(this.tpsCalc)) {
                    f += Math.max(0.0f, Math.min(20.0f, value));
                }
                TPSCalc.setTPS(this.tpsCalc, f /= (float)TPSCalc.getTPSResults(this.tpsCalc).size());
            }
            TPSCalc.setTime(this.tpsCalc, System.currentTimeMillis());
        }
    }
}

/*
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
 */
