package net.futureclient.client;

import net.futureclient.client.VD;
import net.futureclient.client.dE;
import net.futureclient.client.oE;
import net.minecraft.util.math.BlockPos;

public class Ud
implements Runnable {
    private Thread f$g;
    public final oE f$d;

    private Ud(oE oE2) {
        Ud ud;
        ud.f$d = oE2;
    }

    public Ud(oE oE2, dE dE2) {
        0(oE2);
    }

    @Override
    public void run() {
        Ud ud;
        long l = System.currentTimeMillis();
        if (oE.f$e().player != null && ((VD)((Object)oE.f$E(ud.f$d).f$E())).equals((Object)VD.f$M)) {
            oE.f$B(ud.f$d, (int)Math.floor(oE.f$a().player.field_70165_t));
            oE.f$a(ud.f$d, (int)Math.floor(oE.f$E().player.field_70161_v));
            int n = 0;
            int n2 = n;
            while (n2 <= oE.f$e(ud.f$d).f$E().intValue()) {
                int n3 = oE.f$a(ud.f$d).f$E().intValue() + oE.f$E(ud.f$d).f$E().intValue();
                while (n3 >= oE.f$a(ud.f$d).f$E().intValue()) {
                    int n4;
                    int n5 = -n;
                    while (n5 < n) {
                        int n6;
                        int n7 = -n;
                        while (n7 < n) {
                            int n8;
                            oE.f$e(ud.f$d).add(new BlockPos(oE.f$e(ud.f$d) + n6, n4, oE.f$E(ud.f$d) + n8++));
                            n7 = n8;
                        }
                        n5 = ++n6;
                    }
                    n3 = --n4;
                }
                n2 = ++n;
            }
            Ud ud2 = ud;
            oE.f$E(ud2.f$d, oE.f$e(ud2.f$d).size() - 1);
        }
    }

    public void f$E() {
        Ud ud;
        if (ud.f$g == null) {
            ud.f$g = new Thread(ud);
            ud.f$g.setPriority(1);
            ud.f$g.start();
            try {
                Ud ud2 = ud;
                ud2.f$g.join(1000L);
                ud2.f$g.interrupt();
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.fe;
import net.futureclient.client.ve;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketUseEntity;

public class UD
extends Ha<ve> {
    public final fe f$d;

    @Override
    public void f$E(ve ve2) {
        if (ve2.f$E() instanceof CPacketUseEntity) {
            CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)ve2.f$E();
            if (!fe.f$E(this.f$d) || cPacketUseEntity.getAction() != CPacketUseEntity.Action.ATTACK) {
                return;
            }
            Minecraft minecraft = fe.f$h();
            while (false) {
            }
            minecraft.player.func_70664_aZ();
            return;
        }
    }

    public UD(fe fe2) {
        0.f$d = fe2;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class ud
extends RF {
    private String f$d;

    public String f$E() {
        ud ud2;
        return ud2.f$d;
    }

    public ud(String string) {
        0.f$d = string;
    }
}
