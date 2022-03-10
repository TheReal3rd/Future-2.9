package net.futureclient.client;

public enum BA {
    f$K,
    f$b,
    f$j,
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BA() {
        BA bA;
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.futureclient.client.HF;
import net.futureclient.client.Ha;
import net.futureclient.client.J;
import net.futureclient.client.JD;
import net.futureclient.client.La;
import net.futureclient.client.Q;
import net.futureclient.client.fE;
import net.futureclient.client.if;
import net.futureclient.client.ig;
import net.futureclient.client.kH;
import net.futureclient.client.ma;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Ba
extends ma
implements J {
    private final Ha f$g;
    private boolean f$j;
    public float f$b;
    private JD f$i;
    private final Ha f$d;
    private boolean f$i;
    private int f$M;
    private List<Ha> f$K;

    public void f$a(boolean bl) {
        0.f$i = bl;
    }

    public boolean f$a() {
        Ba ba;
        return ba.f$i;
    }

    @Override
    public boolean f$E() {
        Ba ba;
        return ba.f$j;
    }

    @Override
    public void f$E() {
        Ba ba;
        Ba ba2 = ba;
        ba2.f$E(!ba2.f$j);
    }

    public int f$E() {
        Ba ba;
        return ba.f$M;
    }

    public Ba(String string, String[] stringArray, boolean bl, int n, JD jD) {
        Ba ba = 0;
        super(string, stringArray);
        Ba ba2 = 0;
        0.f$K = new ArrayList<Ha>();
        0.f$M = n;
        ba.f$i = jD;
        ba.f$i = bl;
        ba.f$g = new fE(0);
        0.f$d = new HF(0);
        if (string.equalsIgnoreCase("ClickGui")) {
            Object[] objectArray = new Object[1];
            objectArray[0] = 0.f$E()[0].toLowerCase().replace(" ", "");
            kH.f$E().f$E().f$E(new ig(String.format("%sToggle", objectArray), new if(0), 54));
            return;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = 0.f$E()[0].toLowerCase().replace(" ", "");
        kH.f$E().f$E().f$E(new ig(String.format("%sToggle", objectArray), new if(0), 0));
    }

    public void f$K() {
        Ba ba;
        ba.f$K.forEach(ha -> kH.f$E().f$E().f$a((Ha)ha));
        if (ba.getClass().isAnnotationPresent(Q.class)) {
            Q q = ba.getClass().getAnnotation(Q.class);
            La.f$E().f$E(String.format("&cNOTE: &7%s", q.f$E()));
        }
        kH.f$E().f$E().f$a(ba.f$g);
    }

    public void f$E(Ha ... haArray) {
        Collections.addAll(0.f$K, haArray);
    }

    @Override
    public JD f$E() {
        Ba ba;
        return ba.f$i;
    }

    public static boolean f$E(Ba ba) {
        return ba.f$j;
    }

    public void f$B() {
        Ba ba;
        ba.f$K.forEach(ha -> kH.f$E().f$E().f$E((Ha)ha));
        kH.f$E().f$E().f$a(ba.f$d);
    }

    @Override
    public void f$E(boolean bl) {
        0.f$j = bl;
        if (0.f$j) {
            0.f$K();
            return;
        }
        0.f$B();
    }

    public void f$E(int n) {
        0.f$M = n;
    }
}


