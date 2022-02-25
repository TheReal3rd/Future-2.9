package net.futureclient.client;

import java.util.StringJoiner;
import net.futureclient.client.GA;
import net.futureclient.client.eg;
import net.futureclient.client.kH;

public final class RH
extends GA {
    @Override
    public String f$E() {
        return "&e[add|del|list] [name]";
    }

    @Override
    public String f$E(String[] stringArray) {
        block11: {
            block12: {
                if (stringArray.length == 3) {
                    if (stringArray[0].equalsIgnoreCase("add")) {
                        String string = stringArray[1];
                        String string2 = stringArray[2];
                        if (kH.f$E().f$E().f$E(string)) {
                            return "That user is already a friend.";
                        }
                        kH.f$E().f$E().f$a(new eg(string, string2));
                        return String.format("Added friend with alias %s.", string2);
                    }
                }
                if (stringArray.length != 2) break block11;
                if (stringArray[0].equalsIgnoreCase("add")) {
                    String string = stringArray[1];
                    if (kH.f$E().f$E().f$E(string)) {
                        return "That user is already a friend.";
                    }
                    String string3 = string;
                    kH.f$E().f$E().f$a(new eg(string3, string3));
                    return String.format("Added friend with alias %s.", string);
                }
                if (stringArray[0].equalsIgnoreCase("del")) break block12;
                if (stringArray[0].equalsIgnoreCase("remove")) break block12;
                if (!stringArray[0].equalsIgnoreCase("rem")) break block11;
            }
            String string = stringArray[1];
            if (!kH.f$E().f$E().f$E(string)) {
                return "That user is not a friend.";
            }
            eg eg3 = kH.f$E().f$E().f$E(string);
            String string4 = eg3.f$a();
            kH.f$E().f$E().f$E(eg3);
            return String.format("Removed friend with alias %s.", string4);
        }
        if (stringArray.length == 1) {
            if (stringArray[0].equalsIgnoreCase("list")) {
                StringJoiner stringJoiner = new StringJoiner(", ");
                kH.f$E().f$E().f$E().forEach(eg2 -> stringJoiner.add(eg2.f$E()));
                return String.format("Friends (%s): %s.", kH.f$E().f$E().f$E().size(), stringJoiner.toString());
            }
        }
        return null;
    }

    public RH() {
        RH rH;
        String[] stringArray = new String[4];
        stringArray[0] = "Friend";
        stringArray[1] = "FriendAdd";
        stringArray[2] = "Friends";
        stringArray[3] = "Frend";
        super(stringArray);
    }
}
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
