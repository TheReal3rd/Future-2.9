package net.futureclient.client;

public class PI {
    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 2;
        int cfr_ignored_0 = 4 << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 4;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public PI() {
        PI pI;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Mh;
import net.futureclient.client.Ze;
import net.futureclient.client.bF;
import net.futureclient.client.hF;
import net.futureclient.client.kH;
import net.futureclient.client.vF;
import net.minecraft.entity.Entity;

public class pI
extends Ha<bF> {
    public final Mh f$d;

    @Override
    public void f$E(bF bF2) {
        Ze ze = (Ze)kH.f$E().f$E().f$E(Ze.class);
        hF hF2 = (hF)kH.f$E().f$E().f$E(hF.class);
        vF vF2 = (vF)kH.f$E().f$E().f$E(vF.class);
        if ((Boolean)Mh.f$a(0.f$d).f$E() != false && (double)kH.f$E().f$E().f$E().f$E() / 1000.0 >= Mh.f$E(0.f$d).f$E().doubleValue() || (Boolean)Mh.f$E(0.f$d).f$E() != false && ze != null && ze.f$E() && ze.f$E() != null && (double)ze.f$E().getDistance((Entity)Mh.f$E().player) > (double)ze.f$L.f$E().floatValue() / 2.0 || hF2 != null && hF2.f$E() && (hF2.f$E() != null || hF2.f$E() != null) || vF2 != null && vF2.f$E() && vF2.f$e()) {
            bF2.f$E(true);
        }
    }

    public pI(Mh mh) {
        0.f$d = mh;
    }
}
