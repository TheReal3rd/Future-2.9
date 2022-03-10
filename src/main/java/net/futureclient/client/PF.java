package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.entity.Entity;

public class PF
extends RF {
    private Entity f$g;
    private int f$d;

    public PF(Entity entity) {
        PF pF = 0;
        pF.f$d = -1;
        pF.f$g = entity;
    }

    public Entity f$E() {
        PF pF;
        return pF.f$g;
    }

    public int f$E() {
        PF pF;
        return pF.f$d;
    }

    public void f$E(int n) {
        0.f$d = n;
    }
}
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
package net.futureclient.client;

public enum pF {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pF() {
        pF pF2;
    }
}
