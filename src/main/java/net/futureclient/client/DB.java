package net.futureclient.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import net.futureclient.client.Ib;
import net.futureclient.client.hb;

public class dB
extends Ib {
    public final hb f$d;

    @Override
    public void f$E(Object ... objectArray) {
        0.f$d.f$d.clear();
        try {
            if (0.f$E().length() > 6000L && !0.f$E().delete()) {
                0.f$E().deleteOnExit();
            }
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
            block6: while (true) {
                String string;
                BufferedReader bufferedReader2 = bufferedReader;
                while ((string = bufferedReader2.readLine()) != null) {
                    try {
                        if (0.f$d.f$d.contains(string.toLowerCase())) continue block6;
                        0.f$d.f$d.add(string.toLowerCase());
                    }
                    catch (Exception exception) {
                        bufferedReader2 = bufferedReader;
                        exception.printStackTrace();
                        continue;
                    }
                    continue block6;
                }
                break;
            }
            bufferedReader.close();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public dB(hb hb2, String string) {
        0.f$d = hb2;
        super(string);
    }

    @Override
    public void f$a(Object ... objectArray) {
        BufferedWriter bufferedWriter;
        try {
            if (!0.f$E().exists()) {
                0.f$E().createNewFile();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            Iterator<String> iterator;
            bufferedWriter = new BufferedWriter(new FileWriter(0.f$E()));
            Iterator<String> iterator2 = iterator = 0.f$d.f$d.iterator();
            while (iterator2.hasNext()) {
                String string = iterator.next();
                iterator2 = iterator;
                BufferedWriter bufferedWriter2 = bufferedWriter;
                bufferedWriter2.write(string.toLowerCase());
                bufferedWriter2.newLine();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        bufferedWriter.close();
    }
}
