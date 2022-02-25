package net.futureclient.client.deof.baritone;

/**
 *
 */
public enum BaritoneAPIInterface {
    Baritone;

    public void start() {

    }

}
/*
package net.futureclient.client;

import net.futureclient.client.CI;
import net.futureclient.client.kH;
import net.futureclient.client.oG;
import net.futureclient.client.yI;

public enum Bi {
    f$M;

    private oG f$g;


     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation

public void f$E() {
    Bi bi;
    Bi bi2;
    block10: {
        block9: {
            try {
                Class<?> clazz = Class.forName("baritone.api.BaritoneAPI", false, ((Object)((Object)bi2)).getClass().getClassLoader());
                String[] stringArray = clazz.getPackage().getImplementationVersion();
                if (stringArray != null) {
                    stringArray = stringArray.split("\\.");
                    int n = stringArray.length >= 1 ? Integer.parseInt(stringArray[0]) : 0;
                    if (n >= 1) {
                        int n2 = stringArray.length >= 2 ? Integer.parseInt(stringArray[1]) : 0;
                        if (n != 1 || n2 != 2) break block9;
                        int n3 = n = stringArray.length >= 3 ? Integer.parseInt(stringArray[2]) : 0;
                        if (n < 10) {
                            bi2.f$g = oG.f$i;
                        }
                        break block9;
                    }
                    bi2.f$g = oG.f$i;
                    break block9;
                }
                bi2.f$g = oG.f$j;
            }
            catch (ClassNotFoundException | NoClassDefFoundError throwable) {
                bi = bi2;
                bi2.f$g = oG.f$M;
                break block10;
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        bi = bi2;
    }
    if (bi.f$g != null) {
        kH.f$E().f$E().f$a(new yI(bi2));
        return;
    }
    new CI(bi2).run();
}

    public static oG f$E(Bi bi) {
        return bi.f$g;
    }


     * WARNING - Possible parameter corruption
     * WARNING - void declaration

    private Bi() {
        Bi bi;
    }
}
 */