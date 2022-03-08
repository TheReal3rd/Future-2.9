package net.futureclient.client;

import net.futureclient.client.RF;

public class Wd
extends RF {
    private float f$d;

    public void f$E(float f) {
        0.f$d = f;
    }

    public float f$E() {
        Wd wd;
        return wd.f$d;
    }

    public Wd(float f) {
        0.f$d = f;
    }
}
package net.futureclient.client;

import net.futureclient.client.GF;
import net.futureclient.client.Ha;
import net.futureclient.client.Hg;
import net.futureclient.client.UE;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.CPacketUpdateSign;

public class WD
extends Ha<ve> {
    public final GF f$d;

    public WD(GF gF) {
        0.f$d = gF;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(ve ve2) {
        if (ve2.f$E() instanceof CPacketUpdateSign) {
            String[] stringArray = (String[])ve2.f$E();
            if (GF.f$E().getCurrentServerData() != null) {
                int n;
                stringArray = stringArray.getLines();
                int n2 = n = 0;
                while (n2 < 4) {
                    if (stringArray[n] != null) {
                        switch (UE.f$d[((Hg)((Object)GF.f$E(0.f$d).f$E())).ordinal()]) {
                            case 1: {
                                int n3 = n;
                                stringArray[n3] = stringArray[n3].replace("&", "\u00a7\u00a70");
                                break;
                            }
                            case 2: {
                                int n4 = n;
                                stringArray[n4] = stringArray[n4].replace("&", "\u00a7\u00a7\u00a700");
                                break;
                            }
                        }
                    }
                    n2 = ++n;
                }
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public final class wd
extends RF {
    private boolean f$d;

    public void f$a(boolean bl) {
        0.f$d = bl;
    }

    public wd() {
        wd wd2;
    }

    public boolean f$a() {
        wd wd2;
        return wd2.f$d;
    }
}
