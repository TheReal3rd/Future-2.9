package net.futureclient.client;

import net.futureclient.client.HG;
import net.futureclient.client.S;

public class nG
implements S {
    private byte f$d;
    private HG f$g;

    public nG(HG hG, byte by) {
        nG nG2 = 0;
        nG2.f$g = hG;
        nG2.f$d = by;
    }

    public HG f$E() {
        nG nG2;
        return nG2.f$g;
    }

    public byte f$E() {
        nG nG2;
        return nG2.f$d;
    }

    public boolean equals(Object object) {
        if (object instanceof nG) {
            nG nG2 = (nG)object;
            return nG2.f$E() == 0.f$E() && nG2.f$E() == 0.f$E();
        }
        return super.equals(object);
    }
}
