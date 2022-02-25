package net.futureclient.client;

public enum Eg {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Eg() {
        Eg eg;
    }
}
package net.futureclient.client;

import java.util.Iterator;
import java.util.StringJoiner;
import net.futureclient.client.Ba;
import net.futureclient.client.GA;
import net.futureclient.client.J;
import net.futureclient.client.kH;
import net.futureclient.client.ma;

public class EG
extends GA {
    public EG() {
        EG eG;
        String[] stringArray = new String[2];
        stringArray[0] = "Drawn";
        stringArray[1] = "Shown";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return "&e[module]";
    }

    @Override
    public String f$E(String[] object) {
        if (((String[])object).length == 1) {
            Ba ba;
            object = object[0];
            ma ma2 = kH.f$E().f$E().f$E((String)object);
            if (ma2 == null) {
                StringJoiner stringJoiner = new StringJoiner(", ");
                Iterator<ma> iterator = kH.f$E().f$E().f$E().iterator();
                while (iterator.hasNext()) {
                    int n;
                    String[] stringArray = iterator.next().f$E();
                    int n2 = stringArray.length;
                    int n3 = n = 0;
                    while (n3 < n2) {
                        String string = stringArray[n];
                        if (string.contains((CharSequence)object)) {
                            stringJoiner.add(String.format("&e%s&7", string));
                        }
                        n3 = ++n;
                    }
                }
                if (stringJoiner.length() < 1) {
                    return "That module does not exist.";
                }
                return String.format("Did you mean: %s?", stringJoiner.toString());
            }
            if (!(ma2 instanceof J)) {
                return "That module is not toggleable.";
            }
            ba.f$a(!(ba = (Ba)ma2).f$a());
            Object[] objectArray = new Object[2];
            objectArray[0] = ba.f$E()[0];
            objectArray[1] = ba.f$a() ? "&aon" : "&coff";
            return String.format("%s drawing %s&7.", objectArray);
        }
        return null;
    }
}
package net.futureclient.client;

import net.futureclient.client.F;

public class eg
implements F {
    private String f$g;
    private String f$d;

    public eg(String string, String string2) {
        eg eg2 = 0;
        eg2.f$g = string;
        eg2.f$d = string2;
    }

    @Override
    public String f$E() {
        eg eg2;
        return eg2.f$g;
    }

    public String f$a() {
        eg eg2;
        return eg2.f$d;
    }
}
