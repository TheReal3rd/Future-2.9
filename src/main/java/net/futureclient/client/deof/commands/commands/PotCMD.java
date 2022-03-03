package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class PotCMD extends CommandBase {//TODO work on this
    public Bh f$d;

    public Xf() {
        super(new String[] {"Pot", "ThrowPot", "Tpot", "UpPot", "SendPot", "Potion"});
        this.f$d = new Bh();
    }

    public static Minecraft f$A(Xf xf) {
        return xf.f$d;
    }

    public static Minecraft f$E(Xf xf) {
        return xf.f$d;
    }

    public static Minecraft f$e(Xf xf) {
        return xf.f$d;
    }

    @Override
    public String execute(String[] stringArray) {
        kH.f$E().f$E().f$a(new jF(0));
        return "Throwing potion.";
    }

    public static Minecraft f$a(Xf xf) {
        return xf.f$d;
    }

    public static Minecraft f$B(Xf xf) {
        return xf.f$d;
    }

    @Override
    public String getInfo() {
        return null;
    }

    public static Minecraft f$K(Xf xf) {
        return xf.f$d;
    }
}
/*
public class Xf
extends GA {
    public Bh f$d;

    public Xf() {
        Xf xf;
        String[] stringArray = new String[6];
        stringArray[0] = "Pot";
        stringArray[1] = "ThrowPot";
        stringArray[2] = "Tpot";
        stringArray[3] = "UpPot";
        stringArray[4] = "SendPot";
        stringArray[5] = "Potion";
        super(stringArray);
        Xf xf2 = xf;
        xf2.f$d = new Bh();
    }

    public static Minecraft f$A(Xf xf) {
        return xf.f$d;
    }

    public static Minecraft f$E(Xf xf) {
        return xf.f$d;
    }

    public static Minecraft f$e(Xf xf) {
        return xf.f$d;
    }

    @Override
    public String f$E(String[] stringArray) {
        kH.f$E().f$E().f$a(new jF(0));
        return "Throwing potion.";
    }

    public static Minecraft f$a(Xf xf) {
        return xf.f$d;
    }

    public static Minecraft f$B(Xf xf) {
        return xf.f$d;
    }

    @Override
    public String f$E() {
        return null;
    }

    public static Minecraft f$K(Xf xf) {
        return xf.f$d;
    }
}
 */