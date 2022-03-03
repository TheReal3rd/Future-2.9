package net.futureclient.client.deof.event.events;

import net.futureclient.client.deof.event.Event;
import net.minecraft.entity.MoverType;

public class MoveEvent extends Event {
    private final MoverType moveType;//OG f$g
    public double motionZ;//OG f$M
    public double motionX;//OG f$j
    private boolean onGround;//OG f$d
    public double motionY;//OG f$i

    public MoveEvent(MoverType moverType, double x, double y, double z, boolean bl) {
        this.moveType = moverType;
        this.motionX = x;
        this.motionY = y;
        this.motionZ = z;
        this.onGround = bl;
    }

    public void setMotionX(double d) {
        this.motionX = d;
    }

    public double getMotionY() {
        return this.motionY;
    }

    public MoverType getMoveType() {
        return this.moveType;
    }

    public void setOnGround(boolean bl) {
        this.onGround = bl;
    }

    public void setMotionZ(double d) {
        this.motionZ = d;
    }

    public double getMotionZ() {
        return this.motionZ;
    }

    public boolean isOnGround() {
        return this.onGround;
    }

    public double getMotionX() {
        return this.motionX;
    }

    public void setMotionY(double d) {
        this.motionY = d;
    }
}
/*
public class Ee
extends RF {
    private MoverType f$g;
    public double f$M;
    public double f$j;
    private boolean f$d;
    public double f$i;

    public void f$e(double d) {
        0.f$j = d;
    }

    public double f$a() {
        Ee ee;
        return ee.f$i;
    }

    public MoverType f$E() {
        Ee ee;
        return ee.f$g;
    }

    public void f$a(boolean bl) {
        0.f$d = bl;
    }

    public void f$E(double d) {
        0.f$M = d;
    }

    public double f$E() {
        Ee ee;
        return ee.f$M;
    }

    public boolean f$a() {
        Ee ee;
        return ee.f$d;
    }

    public Ee(MoverType moverType, double d, double d2, double d3, boolean bl) {
        Ee ee = 0;
        Ee ee2 = 0;
        0.f$g = moverType;
        ee2.f$j = d;
        ee2.f$i = d2;
        ee.f$M = d3;
        ee.f$d = bl;
    }

    public double f$e() {
        Ee ee;
        return ee.f$j;
    }

    public void f$a(double d) {
        0.f$i = d;
    }
}
 */
