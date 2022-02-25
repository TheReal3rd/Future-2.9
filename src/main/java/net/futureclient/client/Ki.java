package net.futureclient.client;

import net.futureclient.client.jG;

public class Ki {
    public static final int[] f$d;

    static {
        f$d = new int[jG.values().length];
        try {
            Ki.f$d[jG.f$K.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ki.f$d[jG.f$b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ki.f$d[jG.f$i.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Ki.f$d[jG.f$j.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.GA;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemAir;
import net.minecraft.util.EnumHand;

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

    /*
     * Enabled aggressive block sorting
     */
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
package net.futureclient.client;

public enum ki {
    f$i("Mojang"),
    f$M("TheAltening");

    private String f$g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ki(String string) {
        ki ki2;
        ki2.f$g = 0;
    }

    public String f$E() {
        ki ki2;
        return ki2.f$g;
    }
}
