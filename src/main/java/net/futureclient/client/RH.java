package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Rf;
import net.futureclient.client.jf;
import net.futureclient.client.kH;
import net.futureclient.client.mI;
import net.futureclient.client.ud;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.network.play.server.SPacketPlayerListItem;

public class Rh
extends Ha<jf> {
    public final mI f$d;

    public Rh(mI mI2) {
        0.f$d = mI2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f$E(jf jf2) {
        if (!(jf2.f$E() instanceof SPacketPlayerListItem)) return;
        SPacketPlayerListItem sPacketPlayerListItem = (SPacketPlayerListItem)jf2.f$E();
        try {
            for (SPacketPlayerListItem.AddPlayerData addPlayerData : sPacketPlayerListItem.getEntries()) {
                if (sPacketPlayerListItem.getAction().equals((Object)SPacketPlayerListItem.Action.REMOVE_PLAYER)) {
                    NetworkPlayerInfo networkPlayerInfo;
                    NetworkPlayerInfo networkPlayerInfo2;
                    block6: {
                        networkPlayerInfo2 = null;
                        for (NetworkPlayerInfo networkPlayerInfo3 : Minecraft.getMinecraft().player.connection.getPlayerInfoMap()) {
                            if (!networkPlayerInfo3.getGameProfile().getId().equals(addPlayerData.getProfile().getId())) continue;
                            networkPlayerInfo = networkPlayerInfo2 = networkPlayerInfo3;
                            break block6;
                        }
                        networkPlayerInfo = networkPlayerInfo2;
                    }
                    if (networkPlayerInfo == null) continue;
                    kH.f$E().f$E().f$E(new ud(networkPlayerInfo2.getGameProfile().getName()));
                    continue;
                }
                if (!sPacketPlayerListItem.getAction().equals((Object)SPacketPlayerListItem.Action.ADD_PLAYER)) continue;
                kH.f$E().f$E().f$E(new Rf(addPlayerData.getProfile().getName()));
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
