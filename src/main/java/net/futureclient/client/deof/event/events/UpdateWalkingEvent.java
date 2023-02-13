package net.futureclient.client.deof.event.events;

import net.futureclient.client.deof.event.Event;
import net.futureclient.client.deof.utils.enums.PrePostEnum;

public class UpdateWalkingEvent extends Event {
    private double z2; // f$g
    private final float pitch2; // f$I
    private float pitch1; // f$C
    private final double y2; // f$i
    private float yaw1; // f$a
    private double z1; // f$M
    private final float yaw2; // f$e
    private boolean onGround; // f$d
    private final PrePostEnum postState;//Pre / Post Enum
    private double y1; // f$j
    private final double x1; // f$K
    private final double x2; // f$b

    public UpdateWalkingEvent(PrePostEnum num, float f, float f2, double d, double d2, double d3, boolean bl) {
        postState = num;
        yaw1 = yaw2 = f;
        pitch1 = pitch2 = f2;
        x1 = x2 = d;
        y1 = y2 = d2;
        z1 = z2 = d3;
        onGround = bl;
    }

    public void setOnGround(boolean bl) { // f$a
        onGround = bl;
    }

    public void setYaw1(float f) { // f$a
        yaw1 = f;
    }

    public void setPitch1(float f) { // f$E
        pitch1 = f;
    }

    public void setY1(double d) { // f$E
        y1 = d;
    }

    public double getY1() { // f$e
        return y1;
    }

    public double getY2() { // f$B
        return y2;
    }

    public double getX1() { // f$K
        return x1;
    }

    public double getX2() { // f$A
        return x2;
    }

    public double getZ1() { // f$E
        return z1;
    }

    public double getZ2() { // f$a

        return z2;
    }

    public float getYaw1() { // f$B
        return yaw1;
    }

    public float getYaw2() { // f$a
        return yaw2;
    }

    public float getPitch1() { // f$e
        return pitch1;
    }

    public float getPitch2() { // f$E
        return pitch2;
    }

    public boolean isOnGround() { // f$a
        return onGround;
    }

    public PrePostEnum getPostState() { // f$E
        return postState;
    }

}
/*
package net.futureclient.client;

import net.futureclient.client.RF;
import net.futureclient.client.kF;

public class Pf
extends RF {
    private double f$g;
    private float f$I;
    private float f$C;
    private double f$i;
    private float f$a;
    private double f$M;
    private float f$e;
    private boolean f$d;
    private kF f$B;
    private double f$j;
    private double f$K;
    private double f$b;

    public void f$a(boolean bl) {
        0.f$d = bl;
    }

    public double f$A() {
        Pf pf;
        return pf.f$b;
    }

    public float f$B() {
        Pf pf;
        return pf.f$a;
    }

    public double f$E() {
        Pf pf;
        return pf.f$M;
    }

    public double f$a() {
        Pf pf;
        return pf.f$g;
    }

    public void f$a(float f) {
        0.f$a = f;
    }

    public void f$E(double d) {
        0.f$j = d;
    }

    public boolean f$a() {
        Pf pf;
        return pf.f$d;
    }

    public Pf(kF kF2, float f, float f2, double d, double d2, double d3, boolean bl) {
        Pf pf = 0;
        pf.f$B = kF2;
        pf.f$a = pf.f$e = f;
        Pf pf2 = 0;
        pf2.f$C = pf2.f$I = f2;
        Pf pf3 = 0;
        pf3.f$K = pf3.f$b = d;
        Pf pf4 = 0;
        pf4.f$j = pf4.f$i = d2;
        Pf pf5 = 0;
        pf5.f$M = pf5.f$g = d3;
        0.f$d = bl;
    }

    public double f$B() {
        Pf pf;
        return pf.f$i;
    }

    public float f$e() {
        Pf pf;
        return pf.f$C;
    }

    public float f$a() {
        Pf pf;
        return pf.f$e;
    }

    public float f$E() {
        Pf pf;
        return pf.f$I;
    }

    public kF f$E() {
        Pf pf;
        return pf.f$B;
    }

    public double f$K() {
        Pf pf;
        return pf.f$K;
    }

    public void f$E(float f) {
        0.f$C = f;
    }

    public double f$e() {
        Pf pf;
        return pf.f$j;
    }
}
 */