package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.ME;
import net.futureclient.client.Wi;
import net.futureclient.client.ih;
import net.futureclient.client.kH;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderEye;

public class gH
extends Ha<ME> {
    public final ih f$d;

    /*
     * WARNING - void declaration
     */
    public gH(ih ih2) {
        void 0;
        0.f$d = 0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(ME 0) {
        for (Entity var3_3 : ih.f$e((ih)0.f$d).world.field_72996_f) {
            if (!(var3_3 instanceof EntityEnderEye)) ** GOTO lbl17
            var3_3 = (EntityEnderEye)var3_3;
            if (ih.f$a(0.f$d) == null && !var3_3.equals((Object)ih.f$E(0.f$d))) {
                v0 = 0;
                v1 = v0;
                ih.f$a(v0.f$d, (EntityEnderEye)var3_3);
                La.f$E().f$E("First Eye of Ender set. After the first one breaks, throw another one farther from the last.");
            } else {
                if (ih.f$E(0.f$d) == null && !var3_3.equals((Object)ih.f$a(0.f$d))) {
                    ih.f$E(0.f$d, (EntityEnderEye)var3_3);
                    La.f$E().f$E("Second Eye of Ender set. Attempting to calculate...");
                }
lbl17:
                // 4 sources

                v1 = 0;
            }
            if (ih.f$a(v1.f$d) != null && !ih.f$a(0.f$d)) {
                if (ih.f$a((ih)0.f$d).field_70173_aa < 10 || ih.f$a((ih)0.f$d).field_70173_aa > 20) {
                    return;
                }
                v2 = 0;
                ih.f$K(0.f$d, new Wi(v2.f$d, ih.f$a((ih)v2.f$d).field_70142_S, ih.f$a((ih)0.f$d).field_70136_U, null));
                v3 = 0;
                ih.f$B(0.f$d, new Wi(v3.f$d, ih.f$a((ih)v3.f$d).field_70165_t, ih.f$a((ih)0.f$d).field_70161_v, null));
                ih.f$a(0.f$d, true);
            }
            if (ih.f$E(0.f$d) != null && !ih.f$E(0.f$d)) {
                if (ih.f$E((ih)0.f$d).field_70173_aa < 10 || ih.f$E((ih)0.f$d).field_70173_aa > 20) {
                    return;
                }
                v4 = 0;
                ih.f$e(0.f$d, new Wi(v4.f$d, ih.f$E((ih)v4.f$d).field_70142_S, ih.f$E((ih)0.f$d).field_70136_U, null));
                v5 = 0;
                ih.f$a(0.f$d, new Wi(v5.f$d, ih.f$E((ih)v5.f$d).field_70165_t, ih.f$E((ih)0.f$d).field_70161_v, null));
                ih.f$E(0.f$d, true);
            }
            if (!ih.f$a(0.f$d) || !ih.f$E(0.f$d) || !ih.f$E(0.f$d).f$E(6000L)) continue;
            v6 = 0;
            ih.f$E(v6.f$d).f$a();
            v7 = 0;
            ih.f$E(v6.f$d, ih.f$E(0.f$d, ih.f$K(v7.f$d), ih.f$B(0.f$d), ih.f$e(0.f$d), ih.f$a(0.f$d)));
            if (ih.f$E(v7.f$d) != null) {
                v8 = 0;
                ih.f$E((ih)v8.f$d).f$M -= 3.0;
                ih.f$E((ih)v8.f$d).f$g -= 3.0;
                ih.f$a((ih)v8.f$d).player.sendChatMessage(String.format("%sWaypointsRemove Stronghold", new Object[]{kH.f$E().f$E().f$E()}));
                ih.f$E((ih)0.f$d).player.sendChatMessage(String.format("%sWaypointsAdd Stronghold %s 100 %s", new Object[]{kH.f$E().f$E().f$E(), (int)ih.f$E((ih)0.f$d).f$M, (int)ih.f$E((ih)0.f$d).f$g}));
                La.f$E().f$E(String.format("Possible stronghold found! XZ: %s, %s.", new Object[]{(int)ih.f$E((ih)0.f$d).f$M, (int)ih.f$E((ih)0.f$d).f$g}), false);
            } else {
                La.f$E().f$E("The Eye of Enders had the same path. Try throwing them farther away from each other.");
            }
            kH.f$E().f$E().f$E(0);
            ih.f$E(0.f$d);
        }
        if (ih.f$E(0.f$d).f$E(60000L) || ih.f$E(0.f$d).f$E(5000L) && ih.f$E(0.f$d)) {
            kH.f$E().f$E().f$E(0);
            ih.f$E(0.f$d);
        }
    }
}
