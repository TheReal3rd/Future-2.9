package net.futureclient.client;

import net.futureclient.client.RF;

public class Ce
extends RF {
    public Ce() {
        Ce ce;
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.QE;
import net.futureclient.client.ig;

public class CE extends QE<ig> {
    @Override
    public void f$E(ig ig2) {
        super.f$a(ig2);
    }

    @Override
    public ig f$E(String string) {
        for (ig ig2 : 0.f$d) {
            if (!string.equalsIgnoreCase(ig2.f$E())) continue;
            return ig2;
        }
        return null;
    }

    public CE() {
        CE cE;
        CE cE2 = cE;
        cE2.f$d = new ArrayList();
    }
}
package net.futureclient.client;

import net.futureclient.client.IE;
import net.minecraft.network.Packet;

public final class ce
extends IE {
    public ce(Packet<?> packet) {
        super(packet);
    }
}
