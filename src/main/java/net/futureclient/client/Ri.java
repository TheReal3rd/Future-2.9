package net.futureclient.client;

public class Ri {
    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 5;
        int cfr_ignored_0 = 4 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 2 << 3 ^ (2 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public Ri() {
        Ri ri;
    }
}
package net.futureclient.client;

import net.futureclient.client.P;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public final class ri
implements P {
    private final Minecraft f$d;

    @Override
    public boolean f$E(EntityPlayer entityPlayer) {
        return entityPlayer.func_110124_au().toString().equals(0.f$d.getSession().getPlayerID());
    }

    @Override
    public String f$E() {
        return "textures/future/cape.png";
    }

    public ri() {
        ri ri2;
        ri2.f$d = Minecraft.getMinecraft();
    }
}
