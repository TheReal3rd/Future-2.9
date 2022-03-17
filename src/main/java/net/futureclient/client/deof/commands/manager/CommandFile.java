package net.futureclient.client.deof.commands.manager;

import net.futureclient.client.deof.utils.file.FileObject;

import java.io.*;

public class CommandFile extends FileObject {
    public final CommandManager f$d;

    public CommandFile(CommandManager aG, String string) {
        super(string);
        this.f$d = aG;

    }

    @Override
    public void load(Object ... objectArray) {
        try {
            if (!this.getFile().exists()) {
                this.getFile().createNewFile();
            }
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (!this.getFile().exists()) return;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.getFile()));
            String string = bufferedReader.readLine();
            if (string != null && !string.isEmpty()) {
                if (!string.contains(" ")) {
                    if (!string.contains("\u0000")) {
                        CommandManager.setPrefix(this.f$d, string);
                    }
                }
            }
            bufferedReader.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void save(Object ... objectArray) {
        try {
            if (!this.getFile().exists()) {
                this.getFile().createNewFile();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.getFile()));
            bufferedWriter.write(CommandManager.getPrefix(this.f$d));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception exception) {
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
import java.io.IOException;
import net.futureclient.client.AG;
import net.futureclient.client.Ib;

public class Vi extends Ib {
    public final AG f$d;

    @Override
    public void f$E(Object ... objectArray) {
        try {
            if (!0.f$E().exists()) {
                0.f$E().createNewFile();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (!0.f$E().exists()) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(0.f$E()));
            String string = bufferedReader.readLine();
            if (string != null && !string.isEmpty()) {
                if (!string.contains(" ")) {
                    if (!string.contains("\u0000")) {
                        AG.f$E(0.f$d, string);
                    }
                }
            }
            bufferedReader.close();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    @Override
    public void f$a(Object ... objectArray) {
        try {
            if (!0.f$E().exists()) {
                0.f$E().createNewFile();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(0.f$E()));
            bufferedWriter.write(AG.f$E(0.f$d));
            bufferedWriter.newLine();
            bufferedWriter.close();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public Vi(AG aG, String string) {
        0.f$d = aG;
        super(string);
    }
}
 */