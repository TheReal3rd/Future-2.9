package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.AB;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.HC;
import net.futureclient.client.JD;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.minecraft.client.Minecraft;

public class Zc
extends Ba {
    private ka<HC> f$M;
    private s f$i;
    private Bh f$g;
    private static final List<String> f$d;

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static ka f$E(Zc zc) {
        return zc.f$M;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    static {
        f$d = new ArrayList<String>();
        f$d.add("Upgrades");
        f$d.add("Item");
        f$d.add("Play");
        f$d.add("The");
        f$d.add("Teleport");
        f$d.add("Select");
        f$d.add("Effect");
        f$d.add("Vault");
        f$d.add("Game");
        f$d.add("Particles");
        f$d.add("Server");
        f$d.add("Soul");
        f$d.add("Setting");
        f$d.add("Are");
        f$d.add("Option");
        f$d.add("SkyWars");
        f$d.add("Kit");
        f$d.add("Categories");
        f$d.add("Class");
        f$d.add("Auctions");
        f$d.add("Ender");
        f$d.add("Menu");
        f$d.add("Shop");
        f$d.add("Collectibles");
        f$d.add("Lobby");
        f$d.add("Profile");
    }

    public Zc() {
        Zc zc;
        String[] stringArray = new String[5];
        stringArray[0] = "ChestStealer";
        stringArray[1] = "Steal";
        stringArray[2] = "Drop";
        stringArray[3] = "Chest";
        stringArray[4] = "Container";
        super("ChestStealer", stringArray, true, -357023, JD.f$b);
        Zc zc2 = zc;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Delay";
        stringArray2[1] = "D";
        zc2.f$i = new s((Number)Float.valueOf(0.15f), (Number)Float.valueOf(0.01f), (Number)Float.valueOf(1.0f), 0.01, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Mode";
        stringArray3[1] = "m";
        zc.f$M = new ka<HC>(HC.f$i, stringArray3);
        zc.f$g = new Bh();
        zc.f$E(zc.f$M, zc.f$i);
        zc.f$E(new AB(zc));
    }

    public static List f$e() {
        return f$d;
    }

    public static Bh f$E(Zc zc) {
        return zc.f$g;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static s f$E(Zc zc) {
        return zc.f$i;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.WC;
import net.futureclient.client.uc;
import net.futureclient.client.z;

public class ZC
extends Ba {
    private final z<Boolean> f$d;

    public static z f$E(ZC zC) {
        return zC.f$d;
    }

    public ZC() {
        ZC zC;
        String[] stringArray = new String[4];
        stringArray[0] = "XCarry";
        stringArray[1] = "MoreCarry";
        stringArray[2] = "MoreInventory";
        stringArray[3] = "MoreInv";
        super("XCarry", stringArray, true, -4191950, JD.f$b);
        ZC zC2 = zC;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "ForceCancel";
        stringArray2[1] = "Force";
        zC2.f$d = new z<Boolean>(false, stringArray2);
        zC.f$E(zC.f$d);
        zC.f$E(new WC(zC), new uc(zC));
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.dd;
import net.futureclient.client.uA;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.CPacketPlayer;

public class zc
extends Ha<ve> {
    public final uA f$d;

    @Override
    public void f$E(ve ve2) {
        if (0.f$d.f$K.f$E() == dd.f$K && ve2.f$E() instanceof CPacketPlayer && uA.f$E(0.f$d)) {
            ve2.f$E(true);
            uA.f$e(0.f$d, false);
        }
    }

    public zc(uA uA2) {
        0.f$d = uA2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.iD;
import net.futureclient.client.wC;

public class zC
extends Ha<iD> {
    public final wC f$d;

    @Override
    public void f$E(iD iD2) {
        if (0.f$d.f$i.f$E().booleanValue()) {
            iD2.f$E(true);
        }
    }

    public zC(wC wC2) {
        0.f$d = wC2;
    }
}
