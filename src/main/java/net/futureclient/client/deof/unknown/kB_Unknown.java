package net.futureclient.client.deof.unknown;

//TODO figure out whether this is correct.
public abstract class kB_Unknown implements kB_F_Unknown {
    private String string;//OG f$d

    public kB_Unknown(String string) {
        this.string = string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String getString() {
        return this.string;
    }

    public abstract void f$E();//TODO figure out what this is, I presume its an invoke for the event.
}
/*
package net.futureclient.client;

import net.futureclient.client.F;

public abstract class kB implements F {
    private String f$d;

    public void f$E(String string) {
        0.f$d = string;
    }

    @Override
    public String f$E() {
        kB kB2;
        return kB2.f$d;
    }

    public abstract void f$E();

    public kB(String string) {
        0.f$d = string;
    }
}
 */