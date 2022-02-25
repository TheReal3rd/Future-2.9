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
package net.futureclient.client;

import java.util.Iterator;
import java.util.StringJoiner;
import net.futureclient.client.GA;
import net.futureclient.client.kB;
import net.futureclient.client.kH;
import net.futureclient.client.ma;

public final class vI
extends GA {
    @Override
    public String f$E(String[] object) {
        if (((String[])object).length == 2) {
            ma ma2 = kH.f$E().f$E().f$E(object[0]);
            if (ma2 == null) {
                return "No such module exists.";
            }
            if (ma2.f$E().size() < 1) {
                return "That module has no presets.";
            }
            if ((object = ma2.f$E(object[1])) == null) {
                Iterator<kB> iterator;
                StringJoiner stringJoiner = new StringJoiner(", ");
                Iterator<kB> iterator2 = iterator = ma2.f$E().iterator();
                while (iterator2.hasNext()) {
                    kB kB2 = iterator.next();
                    iterator2 = iterator;
                    stringJoiner.add(kB2.f$E());
                }
                return String.format("Try: %s.", stringJoiner.toString());
            }
            ((kB)object).f$E();
            return String.format("Loaded &e%s&7 preset for &e%s&7.", ((kB)object).f$E(), ma2.f$E());
        }
        return null;
    }

    @Override
    public String f$E() {
        return "&e[module] [preset]";
    }

    public vI() {
        vI vI2;
        String[] stringArray = new String[2];
        stringArray[0] = "Preset";
        stringArray[1] = "Presets";
        super(stringArray);
    }
}
