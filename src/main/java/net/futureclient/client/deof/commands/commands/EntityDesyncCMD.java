package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class EntityDesyncCMD extends CommandBase {//TODo work on this
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
/*
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
 */
