package net.futureclient.client;

import java.io.File;
import net.futureclient.client.F;
import net.futureclient.client.g;
import net.futureclient.client.j;
import net.futureclient.client.kH;

public abstract class Ib
implements F,
j,
g {
    private String f$M;
    private File f$d;
    private File f$g;

    @Override
    public String f$E() {
        Ib ib;
        return ib.f$M;
    }

    @Override
    public abstract void f$a(Object ... var1);

    public File f$E() {
        Ib ib;
        return ib.f$d;
    }

    public Ib(String string) {
        0.f$M = string;
        0.f$g = kH.f$E().f$E();
        Ib ib = 0;
        0.f$d = new File(0.f$g, string);
        kH.f$E().f$E().f$a(0);
    }

    public File f$a() {
        Ib ib;
        return ib.f$g;
    }

    public Ib(String string, File file) {
        Ib ib = 0;
        ib.f$M = string;
        ib.f$g = file;
        Ib ib2 = 0;
        ib.f$d = new File(file, string);
        kH.f$E().f$E().f$a(0);
    }

    @Override
    public abstract void f$E(Object ... var1);
}

