package net.futureclient.client.deof.altManager;

import net.futureclient.client.deof.utils.file.FileObject;

import java.io.*;

public class KeyFile extends FileObject {
    public final AltManager f$d;

    public KeyFile(AltManager xI2, String string) {
        super(string);
        this.f$d = xI2;
    }

    @Override
    public void load(Object ... objectArray) {
        if (this.getFile().exists()) return;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(getFile()));
            String string = bufferedReader.readLine();
            if (string != null) {
                AltManager.setKey(this.f$d, string);;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void save(Object ... objectArray) {
        block4: {
            try {
                if (!AltManager.getKey(this.f$d).isEmpty()) break block4;
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        try {
            if (!this.getFile().exists()) this.getFile().createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.getFile()));
            bufferedWriter.write(AltManager.getKey(this.f$d));
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
/*
package net.futureclient.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import net.futureclient.client.Ib;
import net.futureclient.client.xI;

public class wg
extends Ib {
    public final xI f$d;

    public wg(xI xI2, String string) {
        0.f$d = xI2;
        super(string);
    }

    @Override
    public void f$E(Object ... objectArray) {
        block4: {
            if (0.f$E().exists()) break block4;
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(0.f$E()));
            String string = bufferedReader.readLine();
            if (string != null) {
                xI.f$E(0.f$d, string);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void f$a(Object ... objectArray) {
        block4: {
            try {
                if (!xI.f$E(0.f$d).isEmpty()) break block4;
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        if (!0.f$E().exists()) {
            0.f$E().createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(0.f$E()));
        bufferedWriter.write(xI.f$E(0.f$d));
        bufferedWriter.close();
    }
}
 */