package net.futureclient.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import net.futureclient.client.Ib;
import net.futureclient.client.ph;
import net.futureclient.client.xI;

public class lH
extends Ib {
    public final xI f$d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f$a(Object ... objectArray) {
        try {
            if (!0.f$E().exists()) {
                0.f$E().createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(0.f$E()));
            for (ph ph2 : 0.f$d.f$E()) {
                switch (ph2.f$E()) {
                    case f$K: {
                        bufferedWriter.write(String.format("%s", ph2.f$A()));
                        bufferedWriter.newLine();
                        break;
                    }
                    case f$b: {
                        bufferedWriter.write(String.format("%s:%s", ph2.f$A(), ph2.f$K()));
                        bufferedWriter.newLine();
                        break;
                    }
                    case f$i: {
                        bufferedWriter.write(String.format("%s:%s:%s", ph2.f$A(), ph2.f$a(), ph2.f$e()));
                        bufferedWriter.newLine();
                        break;
                    }
                    case f$j: {
                        bufferedWriter.write(String.format("%s:%s:%s:%s:%s", ph2.f$h(), ph2.f$B(), ph2.f$a(), ph2.f$A(), ph2.f$K()));
                        bufferedWriter.newLine();
                        break;
                    }
                }
            }
            bufferedWriter.close();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f$E(Object ... objectArray) {
        0.f$d.f$d.clear();
        try {
            String string;
            if (!0.f$E().exists()) {
                0.f$E().createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(0.f$E()));
            0.f$d.f$E().clear();
            while ((string = bufferedReader.readLine()) != null) {
                String[] stringArray = string.split(":");
                switch (stringArray.length) {
                    case 1: {
                        0.f$d.f$a(new ph(string));
                        break;
                    }
                    case 2: {
                        0.f$d.f$a(new ph(stringArray[0], stringArray[1]));
                        break;
                    }
                    case 3: {
                        0.f$d.f$a(new ph(stringArray[0], stringArray[1], stringArray[2]));
                        break;
                    }
                    case 5: {
                        0.f$d.f$a(new ph(stringArray[0], stringArray[1], stringArray[2], stringArray[3], stringArray[4]));
                        break;
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

    public lH(xI xI2, String string) {
        0.f$d = xI2;
        super(string);
    }
}
