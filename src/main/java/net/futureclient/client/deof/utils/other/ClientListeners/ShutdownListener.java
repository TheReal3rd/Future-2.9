package net.futureclient.client.deof.utils.other.ClientListeners;

import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.ShutdownEvent;
import net.futureclient.client.deof.utils.other.FutureLogger;
import org.apache.logging.log4j.Level;


public class ShutdownListener extends Listener<ShutdownEvent> {
    public final FutureClient client;// OG f$d

    public ShutdownListener(FutureClient kH2) {
        this.client = kH2;
    }

    @Override
    public void invoke(ShutdownEvent vd) {
        FutureLogger.getInstance().log(Level.INFO, "Initiated client shutdown.");
        this.client.f$E().f$E().forEach(ib -> ib.f$a(new Object[0]));//Probably the Module saving loop. TODO finish this
        FutureLogger.getInstance().log(Level.INFO, "Finished client shutdown.");
    }
}
/*
public class Vg extends Ha<Vd> {
    public final kH f$d;

    public Vg(kH kH2) {
        0.f$d = kH2;
    }

    @Override
    public void f$E(Vd vd) {
        La.f$E().f$E(Level.INFO, "Initiated client shutdown.");
        0.f$d.f$E().f$E().forEach(ib -> ib.f$a(new Object[0]));
        La.f$E().f$E(Level.INFO, "Finished client shutdown.");
    }
}
 */
