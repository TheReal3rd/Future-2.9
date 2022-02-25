package net.futureclient.client;

public class RF {
    private boolean f$d;

    public boolean f$E() {
        RF rF;
        return rF.f$d;
    }

    public void f$E(boolean bl) {
        0.f$d = bl;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (3 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3 << 1;
        int n5 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }

    public RF() {
        RF rF;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class Rf
extends RF {
    private String f$d;

    public Rf(String string) {
        0.f$d = string;
    }

    public String f$E() {
        Rf rf;
        return rf.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.GD;
import net.futureclient.client.JD;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public class rf
extends Ba {
    private z<Boolean> f$M;
    private z<Boolean> f$g;
    private boolean f$d;

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static z f$a(rf rf2) {
        return rf2.f$M;
    }

    @Override
    public void f$K() {
        rf rf2;
        if (rf2.f$M.f$E().booleanValue() && rf.f$d.player != null) {
            rf.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)rf.f$d.player, CPacketEntityAction.Action.STOP_SPRINTING));
        }
        super.f$K();
    }

    public rf() {
        rf rf2;
        String[] stringArray = new String[4];
        stringArray[0] = "AntiHunger";
        stringArray[1] = "NoHunger";
        stringArray[2] = "DenyHunger";
        stringArray[3] = "AH";
        super("AntiHunger", stringArray, true, -11127454, JD.f$K);
        rf rf3 = rf2;
        String[] stringArray2 = new String[1];
        stringArray2[0] = "Sprint";
        rf3.f$M = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[1];
        stringArray3[0] = "Ground";
        rf2.f$g = new z<Boolean>(true, stringArray3);
        rf2.f$E(rf2.f$M, rf2.f$g);
        rf2.f$E(new GD(rf2));
    }

    @Override
    public void f$B() {
        rf rf2;
        rf rf3 = rf2;
        super.f$B();
        if (rf3.f$M.f$E().booleanValue() && rf.f$d.player != null && rf.f$d.player.func_70051_ag()) {
            rf.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)rf.f$d.player, CPacketEntityAction.Action.START_SPRINTING));
        }
    }

    public static z f$E(rf rf2) {
        return rf2.f$g;
    }

    public static boolean f$E(rf rf2, boolean bl) {
        rf2.f$d = bl;
        return rf2.f$d;
    }

    public static boolean f$E(rf rf2) {
        return rf2.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Ze;
import net.futureclient.client.sE;

public class rF
extends Ha<sE> {
    public final Ze f$d;

    @Override
    public void f$E(sE sE2) {
    }

    public rF(Ze ze) {
        0.f$d = ze;
    }
}
