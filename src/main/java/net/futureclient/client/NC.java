package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.kE;
import net.futureclient.client.pd;
import org.lwjgl.input.Keyboard;

public class Nc
extends Ha<kE> {
    public final pd f$d;

    public Nc(pd pd2) {
        0.f$d = pd2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(kE kE2) {
        kE kE3;
        block23: {
            block24: {
                if (kE2.f$E() != He.f$b) break block24;
                Keyboard.enableRepeatEvents((boolean)false);
                switch (kE2.f$E()) {
                    case 200: {
                        if (!0.f$d.f$g.f$d) break;
                        Keyboard.enableRepeatEvents((boolean)true);
                        if (0.f$d.f$g.f$K) {
                            Nc nc = 0;
                            --nc.f$d.f$g.f$j;
                            if (nc.f$d.f$g.f$j < 0) {
                                0.f$d.f$g.f$j = 0.f$d.f$g.f$M.size() - 1;
                            }
                            0.f$d.f$g.f$g = 11;
                            kE3 = kE2;
                            break block23;
                        } else {
                            Nc nc = 0;
                            --nc.f$d.f$g.f$b;
                            if (nc.f$d.f$g.f$b < 0) {
                                0.f$d.f$g.f$b = 0.f$d.f$g.f$M.get(0.f$d.f$g.f$j).f$E().size() - 1;
                            }
                            if (0.f$d.f$g.f$M.get(0.f$d.f$g.f$j).f$E().size() <= 1) break;
                            kE3 = kE2;
                            0.f$d.f$g.f$g = 11;
                        }
                        break block23;
                    }
                    case 208: {
                        if (!0.f$d.f$g.f$d) break;
                        Keyboard.enableRepeatEvents((boolean)true);
                        if (0.f$d.f$g.f$K) {
                            Nc nc = 0;
                            ++nc.f$d.f$g.f$j;
                            if (nc.f$d.f$g.f$j > 0.f$d.f$g.f$M.size() - 1) {
                                0.f$d.f$g.f$j = 0;
                            }
                            0.f$d.f$g.f$g = -11;
                            kE3 = kE2;
                            break block23;
                        } else {
                            Nc nc = 0;
                            ++nc.f$d.f$g.f$b;
                            if (nc.f$d.f$g.f$b > 0.f$d.f$g.f$M.get(0.f$d.f$g.f$j).f$E().size() - 1) {
                                0.f$d.f$g.f$b = 0;
                            }
                            if (0.f$d.f$g.f$M.get(0.f$d.f$g.f$j).f$E().size() <= 1) break;
                            kE3 = kE2;
                            0.f$d.f$g.f$g = -11;
                        }
                        break block23;
                    }
                    case 203: {
                        if (0.f$d.f$g.f$K) break;
                        kE3 = kE2;
                        0.f$d.f$g.f$K = true;
                        break block23;
                    }
                    case 205: {
                        if (0.f$d.f$g.f$K) {
                            0.f$d.f$g.f$K = false;
                            kE3 = kE2;
                            0.f$d.f$g.f$b = 0;
                            break block23;
                        } else if (!0.f$d.f$g.f$d) {
                            0.f$d.f$g.f$d = true;
                            kE3 = kE2;
                            0.f$d.f$g.f$K = true;
                            break block23;
                        } else {
                            0.f$d.f$g.f$M.get(0.f$d.f$g.f$j).f$E().get(0.f$d.f$g.f$b).f$E().f$E();
                            kE3 = kE2;
                        }
                        break block23;
                    }
                    case 28: {
                        if (!((Boolean)pd.f$E(0.f$d).f$E()).booleanValue() || 0.f$d.f$g.f$K || !0.f$d.f$g.f$d) break;
                        0.f$d.f$g.f$M.get(0.f$d.f$g.f$j).f$E().get(0.f$d.f$g.f$b).f$E().f$E();
                    }
                }
            }
            kE3 = kE2;
        }
        if (kE3.f$E() != He.f$j) return;
        switch (kE2.f$E()) {
            case 200: 
            case 208: {
                Keyboard.enableRepeatEvents((boolean)false);
                return;
            }
        }
    }
}

