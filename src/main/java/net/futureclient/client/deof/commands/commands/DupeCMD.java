package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemAir;
import net.minecraft.util.EnumHand;

public class DupeCMD extends CommandBase {//TODO finish this.

    public DupeCMD() {
        super(new String[]{"Dupe", "DupeExploit", "DupeKick", "DropKick", "DupeAll", "InventoryDupe"});
    }

    @Override
    public String getInfo() {
        return "&e[hand|all]";
    }

    @Override
    public String execute(String[] object) {
        if (mc.isSingleplayer()) {
            return "You are in singleplayer.";
        }
        if (object.length != 1) {
            return null;
        }

        switch (object[0].toLowerCase()) {
            case "hand":
            case "hend":
                if (!(mc.player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof ItemAir)) {
                    mc.player.dropItem(true);
                    mc.world.sendQuittingDisconnectingPacket();
                    return "Dropping and kicking.";
                }
                return "Put an item in your hand.";
            case "all":
            case "inventory":
                int slot = 9;
                while (true) {
                    if (slot >= 45) {
                        mc.world.sendQuittingDisconnectingPacket();
                        return "Dropping and kicking.";
                    }
                    mc.playerController.windowClick(0, slot++, 1, ClickType.THROW, mc.player);
                }
        }
        return null;
    }
}
/*
public class kI
extends GA {
    @Override
    public String f$E() {
        return "&e[hand|all]";
    }

    public kI() {
        kI kI2;
        String[] stringArray = new String[6];
        stringArray[0] = "Dupe";
        stringArray[1] = "DupeExploit";
        stringArray[2] = "DupeKick";
        stringArray[3] = "DropKick";
        stringArray[4] = "DupeAll";
        stringArray[5] = "InventoryDupe";
        super(stringArray);
    }


@Override
public String f$E(String[] object) {
    int n;
    block15: {
        if (0.f$d.isSingleplayer()) {
            return "You are in singleplayer.";
        }
        if (((Object)object).length != 1) {
            return null;
        }
        object = ((String)object[0]).toLowerCase();
        int n2 = -1;
        switch (((String)object).hashCode()) {
            case 3194991: {
                if (!((String)object).equals("hand")) break;
                n = n2 = 0;
                break block15;
            }
            case 3198835: {
                if (!((String)object).equals("hend")) break;
                n = n2 = 1;
                break block15;
            }
            case 96673: {
                if (!((String)object).equals("all")) break;
                n = n2 = 2;
                break block15;
            }
            case -2020599460: {
                if (!((String)object).equals("inventory")) break;
                n2 = 3;
            }
        }
        n = n2;
    }
    switch (n) {
        case 0:
        case 1: {
            if (!(0.f$d.player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemAir)) {
                0.f$d.player.dropItem(true);
                0.f$d.world.sendQuittingDisconnectingPacket();
                return "Dropping and kicking.";
            }
        }
        return "Put an item in your hand.";
        case 2:
        case 3: {
            int n3 = object = 9;
            while (true) {
                if (n3 >= 45) {
                    0.f$d.world.sendQuittingDisconnectingPacket();
                    return "Dropping and kicking.";
                }
                0.f$d.playerController.windowClick(0, object++, 1, ClickType.THROW, (EntityPlayer)0.f$d.player);
                n3 = object;
            }
        }
    }
    return null;
}
}
 */