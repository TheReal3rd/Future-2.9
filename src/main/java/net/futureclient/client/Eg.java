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
