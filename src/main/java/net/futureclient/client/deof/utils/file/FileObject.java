package net.futureclient.client.deof.utils.file;

import net.futureclient.client.deof.FutureClient;

import java.io.File;

public abstract class FileObject implements IString, ISave, ILoad {
    private final String fileName;//OG f$M
    private final File file;//OG f$d
    private final File dir;//OG f$g

    public FileObject(String string, File file) {
        this.fileName = string;
        this.dir = file;
        this.file = new File(file, string);
        kH.f$E().f$E().f$a(0);//TODO fix this.
    }

    public FileObject(String string) {
        this.fileName = string;
        this.dir = FutureClient.getINSTANCE().getFutureDir();
        this.file = new File(this.dir, string);
        kH.f$E().f$E().f$a(0);//TODO fix this.
    }

    @Override
    public String getString() {
        return this.fileName;
    }

    @Override
    public abstract void load(Object ... var1);

    @Override
    public abstract void save(Object ... var1);

    public File getFile() {
        return this.file;
    }

    public File getDir() {
        return this.dir;
    }
}
/*
package net.futureclient.client;

import java.io.File;
import net.futureclient.client.F;
import net.futureclient.client.g;
import net.futureclient.client.j;
import net.futureclient.client.kH;

public abstract class Ib implements F, j, g {
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
 */