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
