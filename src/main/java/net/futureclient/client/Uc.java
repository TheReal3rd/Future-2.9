package net.futureclient.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import net.futureclient.client.Ib;
import net.futureclient.client.va;
import net.futureclient.client.yB;
import net.minecraft.world.DimensionType;

public class Uc
extends Ib {
    public final yB f$d;

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
            Iterator<va> iterator;
            bufferedWriter = new BufferedWriter(new FileWriter(0.f$E()));
            Iterator<va> iterator2 = iterator = 0.f$d.f$i.iterator();
            while (iterator2.hasNext()) {
                va va2 = iterator.next();
                iterator2 = iterator;
                BufferedWriter bufferedWriter2 = bufferedWriter;
                bufferedWriter2.write(va2.f$E() + ":" + va2.f$e() + ":" + yB.f$E(0.f$d).format(va2.f$a()) + ":" + yB.f$E(0.f$d).format(va2.f$E()) + ":" + yB.f$E(0.f$d).format(va2.f$e()) + ":" + va2.f$a());
                bufferedWriter2.newLine();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        bufferedWriter.close();
    }

    public Uc(yB yB2, String string) {
        0.f$d = yB2;
        super(string);
    }

    @Override
    public void f$E(Object ... objectArray) {
        0.f$d.f$i.clear();
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
            String[] stringArray;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(0.f$E()));
            while ((stringArray = bufferedReader.readLine()) != null) {
                stringArray = stringArray.split(":");
                try {
                    String string = "overworld";
                    if (stringArray.length >= 6 && (stringArray[5].equalsIgnoreCase(DimensionType.OVERWORLD.getName()) || stringArray[5].equalsIgnoreCase(DimensionType.NETHER.getName()) || stringArray[5].equalsIgnoreCase(DimensionType.THE_END.getName()))) {
                        string = stringArray[5];
                    }
                    if (0.f$d.f$i.contains(new va(stringArray[0], stringArray[1], Double.parseDouble(stringArray[2].replaceAll(",", ".")), Double.parseDouble(stringArray[3].replaceAll(",", ".")), Double.parseDouble(stringArray[4].replaceAll(",", ".")), string))) continue;
                    0.f$d.f$i.add(new va(stringArray[0], stringArray[1], Double.parseDouble(stringArray[2].replaceAll(",", ".")), Double.parseDouble(stringArray[3].replaceAll(",", ".")), Double.parseDouble(stringArray[4].replaceAll(",", ".")), string));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
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
}
package net.futureclient.client;

import net.futureclient.client.LB;
import net.futureclient.client.fC;

public class uC {
    public static final int[] f$d;
    public static final int[] f$g;

    static {
        f$d = new int[LB.values().length];
        try {
            uC.f$d[LB.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uC.f$d[LB.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[fC.values().length];
        try {
            uC.f$g[fC.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uC.f$g[fC.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.YF;
import net.futureclient.client.ZC;

public class uc
extends Ha<YF> {
    public final ZC f$d;

    @Override
    public void f$E(YF yF) {
        yF.f$E(true);
    }

    public uc(ZC zC) {
        0.f$d = zC;
    }
}
