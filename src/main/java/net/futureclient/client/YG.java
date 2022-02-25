package net.futureclient.client;

import net.futureclient.client.CH;
import net.futureclient.client.GA;
import net.futureclient.client.UG;
import net.futureclient.client.bi;
import net.futureclient.client.kH;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public final class YG
extends GA {
    private bi f$g;
    private Entity f$d;
    private CH f$M;
    private UG f$i;

    public static Minecraft f$E(YG yG) {
        return yG.f$d;
    }

    public static Entity f$E(YG yG) {
        return yG.f$d;
    }

    @Override
    public String f$E(String[] object) {
        if (0.f$i == null && 0.f$M == null && 0.f$g == null) {
            YG yG = 0;
            0.f$i = new UG(0, null);
            kH.f$E().f$E().f$a(0.f$i);
            YG yG2 = 0;
            0.f$M = new CH(0, null);
            kH.f$E().f$E().f$a(0.f$M);
            YG yG3 = 0;
            0.f$g = new bi(0, null);
            kH.f$E().f$E().f$a(0.f$g);
        }
        if (((String[])object).length == 1) {
            object = object[0];
            if (((String)object).equalsIgnoreCase("dismount")) {
                Entity entity = 0.f$d.player.func_184187_bx();
                if (entity == null) {
                    return "You are not riding an entity.";
                }
                YG yG = 0;
                yG.f$d = entity;
                yG.f$d.player.dismountRidingEntity();
                yG.f$d.world.removeEntity(entity);
                return "Forced a dismount.";
            }
            if (((String)object).equalsIgnoreCase("remount")) {
                if (0.f$d == null) {
                    return "You have not forced a dismount.";
                }
                0.f$d.isDead = false;
                0.f$d.world.spawnEntity(0.f$d);
                0.f$d.player.startRiding(0.f$d, true);
                return "Forced a remount.";
            }
            if (((String)object).equalsIgnoreCase("reset")) {
                if (0.f$d == null) {
                    return "You have not forced a dismount.";
                }
                0.f$d = null;
                return "Reset.";
            }
        }
        return null;
    }

    public static Entity f$E(YG yG, Entity entity) {
        yG.f$d = entity;
        return yG.f$d;
    }

    public static Minecraft f$B(YG yG) {
        return yG.f$d;
    }

    public static Minecraft f$a(YG yG) {
        return yG.f$d;
    }

    @Override
    public String f$E() {
        return "&e[dismount|remount|reset]";
    }

    public YG() {
        YG yG;
        String[] stringArray = new String[2];
        stringArray[0] = "EntityDesync";
        stringArray[1] = "Desync";
        super(stringArray);
    }

    public static Minecraft f$K(YG yG) {
        return yG.f$d;
    }

    public static Minecraft f$e(YG yG) {
        return yG.f$d;
    }
}
package net.futureclient.client;

public class yg {
    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).insert(0, stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 5 << 3 ^ 1;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 4;
        int n5 = 3 << 3 ^ (3 ^ 5);
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

    public yg() {
        yg yg2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.GA;
import net.futureclient.client.J;
import net.futureclient.client.kH;
import net.futureclient.client.ma;

public class yG
extends GA {
    @Override
    public String f$E(String[] object) {
        if (((String[])object).length == 1) {
            object = object[0];
            object = kH.f$E().f$E().f$E((String)object);
            if (object == null) {
                return "That module does not exist.";
            }
            if (!(object instanceof J)) {
                return "That module is not toggleable.";
            }
            object = (Ba)object;
            kH.f$E().f$E().f$E(String.format("%sToggle", ((ma)object).f$E())).f$E(0);
            return String.format("Unbound %s.", ((ma)object).f$E()[0]);
        }
        return null;
    }

    public yG() {
        yG yG2;
        String[] stringArray = new String[4];
        stringArray[0] = "UnBind";
        stringArray[1] = "RemoveBind";
        stringArray[2] = "Deletebind";
        stringArray[3] = "Delbind";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return "&e[module]";
    }
}
