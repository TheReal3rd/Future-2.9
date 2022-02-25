package net.futureclient.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.futureclient.client.R;
import net.futureclient.client.Z;
import net.futureclient.client.jI;
import net.futureclient.client.tg;

public class Kh
implements Z {
    private R f$d;

    public Kh(R r) {
        0.f$d = r;
    }

    @Override
    public tg f$E(List<String> list, String string, Comparator<tg> comparator) {
        if (list.size() == 0) {
            return null;
        }
        List<Object> list2 = list = 0.f$E(list, string);
        Collections.sort(list2, comparator);
        return (tg)list2.get(0);
    }

    @Override
    public double f$E(String string, String string2) {
        return 0.f$d.f$E(string, string2);
    }

    @Override
    public List<tg> f$E(List<String> object, String string) {
        ArrayList<tg> arrayList = new ArrayList<tg>();
        Object object2 = object = object.iterator();
        while (object2.hasNext()) {
            String string2 = (String)object.next();
            object2 = object;
            double d = 0.f$d.f$E(string2, string);
            arrayList.add(new tg(string2, d));
        }
        return arrayList;
    }

    @Override
    public tg f$E(List<String> list, String string) {
        return 0.f$E(list, string, new jI());
    }
}
package net.futureclient.client;

import net.futureclient.client.Ah;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.kF;

public class KH
extends Ha<Pf> {
    public final Ah f$d;

    public KH(Ah ah) {
        0.f$d = ah;
    }

    @Override
    public void f$E(Pf pf) {
        if (pf.f$E() == kF.f$g) {
            Ah.f$E(0.f$d, pf.f$e(), pf.f$B());
        }
    }
}
package net.futureclient.client;

import java.io.File;
import net.futureclient.client.AG;
import net.futureclient.client.AI;
import net.futureclient.client.Ah;
import net.futureclient.client.CE;
import net.futureclient.client.Hf;
import net.futureclient.client.IH;
import net.futureclient.client.La;
import net.futureclient.client.RG;
import net.futureclient.client.Vg;
import net.futureclient.client.Vh;
import net.futureclient.client.We;
import net.futureclient.client.fh;
import net.futureclient.client.lf;
import net.futureclient.client.mI;
import net.futureclient.client.mg;
import net.futureclient.client.xI;
import org.apache.logging.log4j.Level;

public class kH {
    private final CE f$B;
    private final IH f$c;
    private final lf f$a;
    private final AI f$g;
    private File f$L;
    private static kH f$H;
    private final mI f$b;
    private final xI f$K;
    public static String f$m;
    private Vh f$d;
    private final mg f$e;
    private final AG f$C;
    private final Ah f$j;
    public long f$l;
    private final We f$I;
    private final fh f$M;
    private final RG f$i;
    public static String f$D;
    private final Hf f$A;

    public Vh f$E() {
        kH kH2;
        return kH2.f$d;
    }

    public mI f$E() {
        kH kH2;
        return kH2.f$b;
    }

    public File f$E() {
        kH kH2;
        return kH2.f$L;
    }

    public We f$E() {
        kH kH2;
        return kH2.f$I;
    }

    public mg f$E() {
        kH kH2;
        return kH2.f$e;
    }

    public fh f$E() {
        kH kH2;
        return kH2.f$M;
    }

    public void f$E(Vh vh) {
        0.f$d = vh;
    }

    public lf f$E() {
        kH kH2;
        return kH2.f$a;
    }

    public kH() {
        File file;
        kH kH2 = this;
        kH2.f$l = System.nanoTime() / 1000000L;
        La.f$E().f$E(Level.INFO, "Initiated client startup.");
        f$H = kH2;
        kH kH3 = this;
        kH2.f$g = new AI();
        kH kH4 = this;
        kH4.f$L = new File(System.getProperty("user.home"), f$m);
        if (!kH2.f$L.exists()) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.f$L.mkdir() ? "Created" : "Failed to create";
            La.f$E().f$E(Level.INFO, String.format("%s client directory.", objectArray));
        }
        if (!(file = new File(kH.f$H.f$E(), "songs")).exists()) {
            file.mkdir();
        }
        if (!(file = new File(kH.f$H.f$E(), "spammer")).exists()) {
            file.mkdir();
        }
        this.f$c = new IH();
        kH kH5 = this;
        this.f$I = new We();
        kH kH6 = this;
        kH5.f$B = new CE();
        kH kH7 = this;
        this.f$C = new AG();
        kH kH8 = this;
        this.f$A = new Hf();
        kH kH9 = this;
        this.f$a = new lf();
        kH kH10 = this;
        this.f$e = new mg();
        kH kH11 = this;
        this.f$K = new xI();
        kH kH12 = this;
        this.f$i = new RG();
        kH kH13 = this;
        this.f$b = new mI();
        kH kH14 = this;
        this.f$M = new fh();
        kH kH15 = this;
        this.f$j = new Ah();
        this.f$E().f$E().forEach(ib -> ib.f$E(new Object[0]));
        this.f$E().f$a(new Vg(this));
        La.f$E().f$E(Level.INFO, "Finished client startup.");
    }

    public RG f$E() {
        kH kH2;
        return kH2.f$i;
    }

    public AG f$E() {
        kH kH2;
        return kH2.f$C;
    }

    public CE f$E() {
        kH kH2;
        return kH2.f$B;
    }

    public xI f$E() {
        kH kH2;
        return kH2.f$K;
    }

    public Hf f$E() {
        kH kH2;
        return kH2.f$A;
    }

    public IH f$E() {
        kH kH2;
        return kH2.f$c;
    }

    static {
        f$m = "Future";
        f$D = "2.9";
    }

    public AI f$E() {
        kH kH2;
        return kH2.f$g;
    }

    public Ah f$E() {
        kH kH2;
        return kH2.f$j;
    }

    public void f$E(String string) {
        f$m = string;
    }
}
