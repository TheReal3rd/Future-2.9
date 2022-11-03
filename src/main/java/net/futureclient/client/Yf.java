package net.futureclient.client;

import net.futureclient.client.RF;

public class Yf
extends RF {
    public Yf() {
        Yf yf;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class YF
extends RF {
    public YF() {
        YF yF;
    }
}

package net.futureclient.client;

import net.futureclient.client.B;
import net.futureclient.client.Eg;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.Ze;
import net.minecraft.item.ItemFood;

public class yF
extends Ha<Pf> {
    public final Ze f$d;

    public yF(Ze ze) {
        0.f$d = ze;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(Pf pf) {
        0.f$d.f$a(String.format("Aura \u00a77[\u00a7F%s\u00a77]", 0.f$d.f$a.f$E()));
        if (!((Eg)((Object)Ze.f$E(0.f$d).f$E())).equals((Object)Eg.f$i) && Ze.f$A().player.func_110143_aJ() <= 0.0f) {
            0.f$d.f$E(false);
        }
        if (!0.f$d.f$r.f$E().booleanValue() && ((B)Ze.f$K().player).getActiveItemStack().getItem() instanceof ItemFood) {
            return;
        }
        switch (pf.f$E()) {
            case f$M: {
                Ze.f$E(0.f$d, pf);
                return;
            }
            case f$g: {
                Ze.f$E(0.f$d);
                return;
            }
        }
    }
}
