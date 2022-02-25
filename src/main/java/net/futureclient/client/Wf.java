package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.client.gui.GuiScreen;

public class Wf
extends RF {
    private GuiScreen f$d;

    public Wf(GuiScreen guiScreen) {
        0.f$d = guiScreen;
    }

    public GuiScreen f$E() {
        Wf wf;
        return wf.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.yf;

public class WF {
    public static final int[] f$d;

    static {
        f$d = new int[yf.values().length];
        try {
            WF.f$d[yf.f$g.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            WF.f$d[yf.f$M.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.jf;
import net.futureclient.client.mF;
import net.minecraft.network.play.server.SPacketSpawnPlayer;

public class wF
extends Ha<jf> {
    public final mF f$d;

    public wF(mF mF2) {
        0.f$d = mF2;
    }

    @Override
    public void f$E(jf jf2) {
        SPacketSpawnPlayer sPacketSpawnPlayer;
        if (!mF.f$E(0.f$d)) {
            return;
        }
        if (jf2.f$E() instanceof SPacketSpawnPlayer && Math.sqrt((mF.f$L().player.field_70165_t - (sPacketSpawnPlayer = (SPacketSpawnPlayer)jf2.f$E()).getX() / 32.0) * (mF.f$i().player.field_70165_t - sPacketSpawnPlayer.getX() / 32.0) + (mF.f$c().player.field_70163_u - sPacketSpawnPlayer.getY() / 32.0) * (mF.f$I().player.field_70163_u - sPacketSpawnPlayer.getY() / 32.0) + (mF.f$j().player.field_70161_v - sPacketSpawnPlayer.getZ() / 32.0) * (mF.f$M().player.field_70161_v - sPacketSpawnPlayer.getZ() / 32.0)) <= 17.0 && sPacketSpawnPlayer.getX() / 32.0 != mF.f$C().player.field_70165_t && sPacketSpawnPlayer.getY() / 32.0 != mF.f$H().player.field_70163_u && sPacketSpawnPlayer.getZ() / 32.0 != mF.f$h().player.field_70161_v) {
            0.f$d.f$d.put(sPacketSpawnPlayer.getEntityID(), sPacketSpawnPlayer.getUniqueId());
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.kF;

public class wf {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            wf.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
