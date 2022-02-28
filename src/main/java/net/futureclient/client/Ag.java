package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.bF;
import net.futureclient.client.qF;

public class Ag
extends Ha<bF> {
    public final qF f$d;

    public Ag(qF qF2) {
        0.f$d = qF2;
    }

    @Override
    public void f$E(bF bF2) {
        if (!qF.f$a(0.f$d)) {
            qF.f$a(0.f$d, false);
            return;
        }
        bF2.f$E(true);
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.Comparator;
import net.futureclient.client.AF;
import net.futureclient.client.Ai;
import net.futureclient.client.DH;
import net.futureclient.client.EG;
import net.futureclient.client.Eh;
import net.futureclient.client.Ej;
import net.futureclient.client.GA;
import net.futureclient.client.GG;
import net.futureclient.client.Hh;
import net.futureclient.client.JE;
import net.futureclient.client.NG;
import net.futureclient.client.QE;
import net.futureclient.client.Qi;
import net.futureclient.client.RH;
import net.futureclient.client.SG;
import net.futureclient.client.TG;
import net.futureclient.client.Th;
import net.futureclient.client.Ui;
import net.futureclient.client.Vi;
import net.futureclient.client.XG;
import net.futureclient.client.Xf;
import net.futureclient.client.Xg;
import net.futureclient.client.YG;
import net.futureclient.client.bG;
import net.futureclient.client.di;
import net.futureclient.client.eh;
import net.futureclient.client.fH;
import net.futureclient.client.fi;
import net.futureclient.client.hG;
import net.futureclient.client.ih;
import net.futureclient.client.kH;
import net.futureclient.client.kI;
import net.futureclient.client.lh;
import net.futureclient.client.mD;
import net.futureclient.client.sH;
import net.futureclient.client.sI;
import net.futureclient.client.ti;
import net.futureclient.client.uH;
import net.futureclient.client.vI;
import net.futureclient.client.wh;
import net.futureclient.client.yG;
import net.futureclient.client.yi;
import net.futureclient.client.zI;

public class AG extends QE<GA> {
    private String f$d;

    public static String f$E(AG aG, String string) {
        aG.f$d = string;
        return aG.f$d;
    }

    public static String f$E(AG aG) {
        return aG.f$d;
    }

    public String f$E() {
        AG aG;
        return aG.f$d;
    }

    public AG() {
        AG aG;
        AG aG2 = aG;
        aG.f$d = ".";
        aG2.f$d = new ArrayList();
        aG.f$a(new zI());//Done
        aG2.f$a(new bG());//Done
        aG2.f$a(new lh());//Done
        aG2.f$a(new Qi());//Done
        aG2.f$a(new DH());//Done
        aG2.f$a(new RH());//Done
        aG2.f$a(new eh());//Done
        aG2.f$a(new Xg());
        aG2.f$a(new fi());
        aG2.f$a(new EG());
        aG2.f$a(new hG());
        aG2.f$a(new mD());
        aG2.f$a(new di());
        aG2.f$a(new SG());
        aG2.f$a(new XG());
        aG2.f$a(new Hh());
        aG2.f$a(new GG());
        aG2.f$a(new ti());
        aG2.f$a(new uH());
        aG2.f$a(new wh());
        aG2.f$a(new JE());
        aG2.f$a(new Ej());
        aG2.f$a(new yG());
        aG2.f$a(new AF());
        aG2.f$a(new Xf());
        aG2.f$a(new kI());
        aG2.f$a(new Eh());
        aG2.f$a(new vI());
        aG2.f$a(new Ui());
        aG2.f$a(new TG());
        aG2.f$a(new fH());
        aG2.f$a(new sH());
        aG2.f$a(new Th());
        aG2.f$a(new sI());
        aG2.f$a(new ih());
        aG2.f$a(new NG());
        aG2.f$a(new yi());
        aG2.f$a(new YG());
        aG2.f$d.sort(Comparator.comparing(gA -> gA.f$E()[0]));
        kH.f$E().f$E().f$a(new Ai(aG));
        new Vi(aG, "command_prefix.txt");
    }

    @Override
    public void f$E(String string) {
        0.f$d = string;
    }
}
