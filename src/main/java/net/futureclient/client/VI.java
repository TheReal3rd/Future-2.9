package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;

public class VI
extends Ba {
    public static void f$A() {
    }

    public VI() {
        VI vI;
        String[] stringArray = new String[3];
        stringArray[0] = "LongJump";
        stringArray[1] = "LJ";
        stringArray[2] = "longneck";
        super("LongJump", stringArray, true, -87927212, JD.f$j);
    }
}
package net.futureclient.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import net.futureclient.client.AG;
import net.futureclient.client.Ib;

public class Vi
extends Ib {
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
