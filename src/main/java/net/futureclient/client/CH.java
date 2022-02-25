package net.futureclient.client;

import net.futureclient.client.De;
import net.futureclient.client.Ha;
import net.futureclient.client.YG;
import net.futureclient.client.YI;

public final class CH
extends Ha<De> {
    public final YG f$d;

    @Override
    public void f$E(De de) {
        YG.f$E(0.f$d, null);
    }

    public CH(YG yG, YI yI) {
        0(yG);
    }

    private CH(YG yG) {
        CH cH;
        cH.f$d = yG;
    }
}
package net.futureclient.client;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import net.futureclient.client.FH;
import net.futureclient.client.gI;
import net.futureclient.client.qg;
import net.futureclient.client.zi;

public enum cH {
    f$i;

    private static final Path f$M;
    private static final Path f$g;

    static {
        String[] stringArray = new String[1];
        stringArray[0] = "Future";
        f$M = Paths.get(System.getProperty("user.home"), stringArray);
        f$g = f$M.resolve("auth_key");
    }

    public FH f$E(String object2, String 022) {
        Object object2 = new FH((String)object2, 022);
        try {
            gI.f$g.f$E((FH)object2);
            return object2;
        }
        catch (Exception 022) {
            return object2;
        }
    }

    public FH f$E() {
        FH fH = null;
        if (Files.exists(f$g, new LinkOption[0])) {
            try {
                fH = qg.f$g.f$E();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (zi.f$i.f$E()) {
            try {
                if (fH == null) {
                    cH cH2;
                    FH fH2 = zi.f$i.f$E();
                    fH = cH2.f$E(fH2.f$a(), fH2.f$E());
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return fH;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cH() {
        cH cH2;
    }

    public static Path f$a() {
        return f$g;
    }

    public static Path f$E() {
        return f$M;
    }
}
