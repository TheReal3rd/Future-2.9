package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.kE;
import net.futureclient.client.lf;

public class BD
extends Ha<kE> {
    public final lf f$d;

    @Override
    public void f$E(kE kE2) {
        if (kE2.f$E() == He.f$b) {
            0.f$d.f$E().forEach(lg2 -> {
                if (lg2.f$E() != 0 && lg2.f$E() == kE2.f$E()) {
                    lg2.f$E();
                }
            });
        }
    }

    public BD(lf lf2) {
        0.f$d = lf2;
    }
}
package net.futureclient.client;

public enum Bd {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Bd() {
        Bd bd;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.VF;
import net.futureclient.client.bE;
import net.futureclient.client.zf;

public class bD
extends Ha<zf> {
    public final bE f$d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(zf zf2) {
        switch ((VF)((Object)bE.f$E(0.f$d).f$E())) {
            case f$g: {
                if (zf2.f$E() == null || !(zf2.f$E().maxY > bE.f$u().player.func_174813_aQ().minY) || !bE.f$V().player.isSneaking()) return;
                zf2.f$E(null);
                return;
            }
            case f$j: {
                zf2.f$E(null);
                bE.f$q().player.field_70145_X = true;
                return;
            }
            case f$i: {
                if (bE.f$x().player.field_70123_F) {
                    zf2.f$E(null);
                }
                if (!bE.f$p().player.movementInput.sneak && (!bE.f$n().player.movementInput.jump || !((double)zf2.f$E().func_177956_o() > bE.f$o().player.field_70163_u))) return;
                zf2.f$E(true);
                return;
            }
        }
    }

    public bD(bE bE2) {
        0.f$d = bE2;
    }
}
