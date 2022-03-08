package net.futureclient.client.deof.event.events;

import net.futureclient.client.deof.event.Event;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

public class ScaledResEvent extends Event {//TODO rename these values.
    public int f$i;
    public int f$j;
    public int f$M;
    public int f$g;
    public int f$d;

    public ScaledResolution getScaledResolution() {
        return new ScaledResolution(Minecraft.getMinecraft());
    }

    public ScaledResEvent() {
        this.f$i = 2;
        this.f$M = 2;
        this.f$g = -7;
        this.f$d = 8;
    }
}
/*
public class Zd
extends RF {
    public int f$i;
    public int f$j;
    public int f$M;
    public int f$g;
    public int f$d;

    public ScaledResolution f$E() {
        return new ScaledResolution(Minecraft.getMinecraft());
    }

    public Zd() {
        Zd zd;
        Zd zd2 = zd;
        Zd zd3 = zd;
        zd3.f$i = 2;
        zd3.f$M = 2;
        zd2.f$g = -7;
        zd2.f$d = 8;
    }
}
 */