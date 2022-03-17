package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;
import net.futureclient.client.deof.utils.game.EntityUtils;

public class DamageCMD extends CommandBase {

    public DamageCMD() {
        super(new String[] {"Damage", "dmg", "td"});
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String execute(String[] stringArray) {
        EntityUtils.damageSelf();
        return "Damaged.";
    }
}
/*
public class hG
extends GA {
    @Override
    public String f$E() {
        return null;
    }

    public hG() {
        hG hG2;
        String[] stringArray = new String[3];
        stringArray[0] = "Damage";
        stringArray[1] = "dmg";
        stringArray[2] = "td";
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        Pg.f$e();
        return "Damaged.";
    }
}
 */
