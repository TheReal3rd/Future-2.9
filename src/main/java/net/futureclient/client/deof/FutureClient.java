package net.futureclient.client.deof;

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
import net.futureclient.client.deof.modules.ModuleManager;
import net.futureclient.client.fh;
import net.futureclient.client.lf;
import net.futureclient.client.mI;
import net.futureclient.client.mg;
import net.futureclient.client.xI;
import org.apache.logging.log4j.Level;

public class FutureClient {
    private final CE f$B; // Unknown
    private final IH f$c; // Unknown
    private final lf f$a; // Something with Macros Configs
    private final AI f$g; // Unknown Possibly Window Title.
    private File f$L; // User home Directory.
    private static FutureClient INSTANCE;// OG "kH f$H;" Client INSTANCE
    private final mI f$b; // Unknown String manipulation.
    private final xI f$K; // Alt Manager
    public static String clientName; // OG f$m;
    private Vh f$d; // System Tray
    private final mg f$e;// Friends
    private final AG f$C;// Commands
    private final Ah f$j;// Unknown Really fucked tho.
    public long startTime; // OG f$l
    private final We f$I;// Unknown
    private final fh f$M;// Unknown
    private final RG f$i;// Probably TPS calculator
    public static String version; // OG f$D
    private final ModuleManager moduleManager;// OG Hf f$A | Modules

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

    public FutureClient() {
        File file;
        this.startTime = System.nanoTime() / 1000000L;
        La.f$E().f$E(Level.INFO, "Initiated client startup.");
        f$H = kH2;
        kH kH3 = this;
        kH2.f$g = new AI();
        kH kH4 = this;
        kH4.f$L = new File(System.getProperty("user.home"), clientName);
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
        this.moduleManager = new Hf();
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

    public ModuleManager getModuleManager() {
        return this.moduleManager;
    }

    public IH f$E() {
        kH kH2;
        return kH2.f$c;
    }

    static {
        clientName = "Future";
        version = "2.9";
    }

    public AI f$E() {
        kH kH2;
        return kH2.f$g;
    }

    public Ah f$E() {
        kH kH2;
        return kH2.f$j;
    }

    public void setClientName(String string) {
        clientName = string;
    }
}


/*
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
 */