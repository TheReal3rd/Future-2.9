package net.futureclient.client.deof.unknown;

import net.futureclient.client.deof.utils.chat.oF_Unknown;
import net.futureclient.client.deof.utils.file.IString;

public class ig_Unknown implements IString {//TODO figure out what this does.
    private oF_Unknown f$g;
    private String f$M;
    private int f$d;

    public ig_Unknown(String string, oF_Unknown oF2, int n) {
        this.f$M = string;
        this.f$g = oF2;
        this.f$d = n;
    }

    public oF_Unknown getF$g() {
        return this.f$g;
    }

    public void setF$d(int n) {
        this.f$d = n;
    }

    @Override
    public String getString() {
        return this.f$M;
    }

    public int getF$d() {
        return this.f$d;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.F;
import net.futureclient.client.oF;

public class ig
implements F {
    private oF f$g;
    private String f$M;
    private int f$d;

    public oF f$E() {
        ig ig2;
        return ig2.f$g;
    }

    public void f$E(int n) {
        0.f$d = n;
    }

    @Override
    public String f$E() {
        ig ig2;
        return ig2.f$M;
    }

    public int f$E() {
        ig ig2;
        return ig2.f$d;
    }

    public ig(String string, oF oF2, int n) {
        ig ig2 = 0;
        0.f$M = string;
        ig2.f$g = oF2;
        ig2.f$d = n;
    }
}
 */