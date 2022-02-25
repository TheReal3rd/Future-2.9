package net.futureclient.client;

import net.futureclient.client.kF;
import net.futureclient.client.zB;

public class Ed {
    public static final int[] f$g;
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            Ed.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ed.f$d[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[zB.values().length];
        try {
            Ed.f$g[zB.f$j.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ed.f$g[zB.f$i.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ed.f$g[zB.f$M.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ah;
import net.futureclient.client.jf;
import net.futureclient.client.vf;
import net.minecraft.network.play.server.SPacketChunkData;

public class ED
extends Ha<jf> {
    public final vf f$d;

    public ED(vf vf2) {
        0.f$d = vf2;
    }

    @Override
    public void f$E(jf jf2) {
        if (jf2.f$E() instanceof SPacketChunkData) {
            SPacketChunkData sPacketChunkData = (SPacketChunkData)jf2.f$E();
            ah ah2 = new ah(sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ());
            if (!sPacketChunkData.isFullChunk()) {
                vf.f$E(0.f$d).add(ah2);
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Be;
import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.Ie;
import net.futureclient.client.tE;

public class eD
extends Ha<Ee> {
    public final Ie f$d;

    @Override
    public void f$E(Ee ee) {
        if (!((tE)((Object)Ie.f$a(0.f$d).f$E())).equals((Object)tE.f$i) && Ie.f$E(0.f$d) == 0) {
            return;
        }
        Ee ee2 = ee;
        ee2.f$e(Ie.f$I().player.field_70159_w);
        ee2.f$a(Ie.f$j().player.field_70181_x);
        ee2.f$E(Ie.f$M().player.field_70179_y);
        if (!((Be)((Object)Ie.f$E(0.f$d).f$E())).equals((Object)Be.f$i) && (((Be)((Object)Ie.f$E(0.f$d).f$E())).equals((Object)Be.f$M) || Ie.f$E(0.f$d))) {
            Ie.f$C().player.field_70145_X = true;
        }
    }

    public eD(Ie ie) {
        0.f$d = ie;
    }
}
package net.futureclient.client;

import net.futureclient.client.BB;
import net.futureclient.client.Ha;
import net.futureclient.client.jf;
import net.futureclient.client.mc;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.network.play.server.SPacketPlayerPosLook;

public class ed
extends Ha<jf> {
    public final BB f$d;

    public ed(BB bB) {
        0.f$d = bB;
    }

    @Override
    public void f$E(jf jf2) {
        if (jf2.f$E() instanceof SPacketPlayerPosLook && ((mc)((Object)0.f$d.f$D.f$E())).equals((Object)mc.f$M)) {
            if (BB.f$E().player.func_184582_a(EntityEquipmentSlot.CHEST).getItem() != Items.ELYTRA) {
                return;
            }
            BB.f$E(0.f$d, true);
        }
    }
}
