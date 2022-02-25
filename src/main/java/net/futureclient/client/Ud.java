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

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.ef;
import net.futureclient.client.kH;
import net.futureclient.client.s;
import net.futureclient.client.yE;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemStack;

public class uD
extends Ha<ME> {
    public final ef f$d;

    public uD(ef ef2) {
        0.f$d = ef2;
    }

    @Override
    public void f$E(ME mE) {
        byte by;
        yE yE2 = (yE)kH.f$E().f$E().f$E(yE.class);
        if (yE2 != null && yE2.f$E() && yE2.f$M) {
            return;
        }
        if (!ef.f$E(0.f$d).f$a(((s)ef.f$E(0.f$d)).f$E().floatValue() * 1000.0f) || ef.f$H().player.field_71075_bZ.isCreativeMode || ef.f$h().currentScreen instanceof GuiContainer && !(ef.f$A().currentScreen instanceof GuiInventory) || ((Boolean)ef.f$a(0.f$d).f$E()).booleanValue() && !(ef.f$K().currentScreen instanceof GuiContainer)) {
            return;
        }
        if (((Boolean)ef.f$E(0.f$d).f$E()).booleanValue() && ef.f$B().player.field_71069_bz.getSlot(6).getStack().getItem() instanceof ItemElytra && ef.f$e().player.field_71069_bz.getSlot(6).getStack().getMaxDamage() - ef.f$a().player.field_71069_bz.getSlot(6).getStack().getItemDamage() < 5) {
            int n;
            int n2 = n = 9;
            while (n2 <= 44) {
                ItemStack itemStack = ef.f$E().player.field_71069_bz.getSlot(n).getStack();
                if (itemStack != ItemStack.EMPTY && itemStack.getItem() instanceof ItemElytra && itemStack.getCount() == 1 && itemStack.getMaxDamage() - itemStack.getItemDamage() > 5) {
                    ef.f$E(0.f$d, true);
                    uD uD2 = 0;
                    ef.f$E(uD2.f$d, 6, false);
                    ef.f$E(uD2.f$d, n, true);
                    ef.f$E(uD2.f$d, n, false);
                    ef.f$E(uD2.f$d, false);
                }
                n2 = n = (int)((byte)(n + 1));
            }
        }
        byte by2 = by = 5;
        while (by2 <= 8) {
            if (ef.f$E(0.f$d, by)) {
                ef.f$E(0.f$d).f$a();
                return;
            }
            by2 = (byte)(by + 1);
        }
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
