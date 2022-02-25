package net.futureclient.client;

import net.futureclient.client.aE;
import net.minecraft.network.Packet;

public final class Ke
extends aE {
    public Ke(Packet<?> packet) {
        super(packet);
    }
}
package net.futureclient.client;

import net.futureclient.client.GE;
import net.futureclient.client.Ha;
import net.futureclient.client.ge;

public class KE
extends Ha<GE> {
    public final ge f$d;

    public KE(ge ge2) {
        0.f$d = ge2;
    }

    @Override
    public void f$E(GE gE) {
        gE.f$E(true);
    }
}
package net.futureclient.client;

import net.futureclient.client.He;
import net.futureclient.client.RF;
import org.lwjgl.input.Keyboard;

public class kE
extends RF {
    private He f$d;
    private int f$g;

    public kE(He he) {
        0.f$g = Keyboard.getEventKey();
        0.f$d = he;
    }

    public He f$E() {
        kE kE2;
        return kE2.f$d;
    }

    public int f$E() {
        kE kE2;
        return kE2.f$g;
    }
}
package net.futureclient.client;

public class ke {
    public ke() {
        ke ke2;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 1;
        int cfr_ignored_0 = 1 << 3 ^ 4;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
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
}
