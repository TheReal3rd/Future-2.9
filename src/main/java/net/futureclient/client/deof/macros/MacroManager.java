package net.futureclient.client.deof.macros;

import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.utils.client.ObjectList;

import java.util.ArrayList;

public class MacroManager extends ObjectList<MacroObject> {

    public MacroManager() {
        this.list = new ArrayList<MacroObject>();
        FutureClient.getINSTANCE().getEventManager().subscribe(new MacroListener(this));
        new MacroFile(this, "macros.txt");
    }

    public boolean contains(int n) {
        for (MacroObject lg2 : this.list) {
            if (n != lg2.getKeyID()) continue;
            return true;
        }
        return false;
    }

    public void remove(int n2) {
        MacroObject object = this.get(n2);
        if (object != null) {
            this.list.remove(object);
        }
    }

    public MacroObject get(int n) {
        for (MacroObject lg2 : this.list) {
            if (n != lg2.getKeyID()) continue;
            return lg2;
        }
        return null;
    }
}
/*
package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.BD;
import net.futureclient.client.QE;
import net.futureclient.client.kH;
import net.futureclient.client.lg;
import net.futureclient.client.nf;

public class lf extends QE<lg> {
    @Override
    public boolean f$E(int n) {
        for (lg lg2 : 0.f$d) {
            if (n != lg2.f$E()) continue;
            return true;
        }
        return false;
    }

    @Override
    public void f$E(int n2) {
        lg n2 = 0.f$E(n2);
        if (n2 != null) {
            0.f$d.remove(n2);
        }
    }

    public lf() {
        lf lf2;
        lf lf3 = lf2;
        lf3.f$d = new ArrayList();
        kH.f$E().f$E().f$a(new BD(lf2));
        new nf(lf2, "macros.txt");
    }

    @Override
    public lg f$E(int n) {
        for (lg lg2 : 0.f$d) {
            if (n != lg2.f$E()) continue;
            return lg2;
        }
        return null;
    }
}
 */