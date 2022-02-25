package net.futureclient.client;

import java.util.Objects;
import net.futureclient.client.Af;
import net.futureclient.client.Ha;
import net.futureclient.client.Tb;

public class VC
extends Ha<Af> {
    public final Tb f$d;

    public VC(Tb tb) {
        0.f$d = tb;
    }

    @Override
    public void f$E(Af af) {
        if (Tb.f$H().player != null && Tb.f$h().player.func_184187_bx() != null && Objects.equals(Tb.f$A().player.func_184187_bx().getControllingPassenger(), Tb.f$K().player)) {
            double d = Tb.f$B().player.func_184187_bx().motionY = Tb.f$e().player.movementInput.jump ? (double)0.f$d.f$M.f$E().floatValue() : (double)(-0.f$d.f$g.f$E().floatValue());
            if (((Boolean)Tb.f$E(0.f$d).f$E()).booleanValue()) {
                Tb.f$a().player.func_184187_bx().rotationYaw = Tb.f$E().player.field_70177_z;
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.BG;
import net.futureclient.client.GA;
import net.futureclient.client.RA;

public class Vc
extends GA {
    public final RA f$d;

    @Override
    public String f$E() {
        return "&e[key]";
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 1) {
            String string = stringArray[0];
            if (!string.startsWith("trnsl") || string.length() < 27) {
                return "Invalid Yandex Translate API key. Generate one at https://translate.yandex.com/developers/keys";
            }
            BG.f$a(string);
            return String.format("Yandex Translate API key has been set to &e%s&7.", string);
        }
        return null;
    }

    public Vc(RA rA, String[] stringArray) {
        0.f$d = rA;
        super(stringArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.kH;
import net.futureclient.client.qF;
import net.futureclient.client.vb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;

public class vc
extends Ha<ME> {
    public final vb f$d;

    public vc(vb vb2) {
        0.f$d = vb2;
    }

    @Override
    public void f$E(ME mE) {
        int n;
        int n2;
        int n3;
        int n4;
        block21: {
            int n5;
            int n6;
            block20: {
                qF qF2 = (qF)kH.f$E().f$E().f$E(qF.class);
                if (qF2.f$E() && qF2.f$B()) {
                    return;
                }
                n6 = -1;
                int n7 = n4 = 0;
                while (n7 < 9) {
                    ItemStack itemStack = vb.f$G().player.field_71071_by.getStackInSlot(n4);
                    if (!vb.f$D().player.field_71071_by.getStackInSlot(n4).isEmpty() && itemStack.getItem() instanceof ItemFishingRod) {
                        n5 = n6 = n4;
                        break block20;
                    }
                    n7 = ++n4;
                }
                n5 = n6;
            }
            if (n5 != -1) {
                if (vb.f$g().player.field_71071_by.currentItem != n6) {
                    vb.f$m().player.field_71071_by.currentItem = n6;
                    return;
                }
                if (vb.f$h(0.f$d) > 0) {
                    vb.f$A(0.f$d);
                    return;
                }
                if (vb.f$f().player.field_71104_cf != null) {
                    vc vc2 = 0;
                    vb.f$K(vc2.f$d);
                    if (vb.f$B(vc2.f$d) > 720) {
                        vb.f$E(0.f$d);
                    }
                    if (vb.f$L().player.field_71104_cf.caughtEntity != null) {
                        vb.f$E(0.f$d);
                    }
                    if (vb.f$E(0.f$d)) {
                        vc vc3 = 0;
                        vb.f$e(vc3.f$d);
                        if (vb.f$a(vc3.f$d) >= 4) {
                            vc vc4 = 0;
                            vb.f$E(vc4.f$d);
                            vb.f$E(vc4.f$d, false);
                            return;
                        }
                    } else if (vb.f$a(0.f$d) != 0) {
                        vb.f$E(0.f$d);
                    }
                    return;
                }
                vb.f$E(0.f$d);
                return;
            }
            n4 = -1;
            int n8 = n3 = 9;
            while (n8 < 36) {
                ItemStack itemStack = vb.f$i().player.field_71071_by.getStackInSlot(n3);
                if (!vb.f$c().player.field_71071_by.getStackInSlot(n3).isEmpty() && itemStack.getItem() instanceof ItemFishingRod) {
                    n2 = n4 = n3;
                    break block21;
                }
                n8 = ++n3;
            }
            n2 = n4;
        }
        if (n2 == -1) {
            return;
        }
        n3 = -1;
        int n9 = n = 0;
        while (n9 < 9) {
            if (vb.f$I().player.field_71071_by.getStackInSlot(n) == ItemStack.EMPTY) {
                n3 = n;
                break;
            }
            n9 = ++n;
        }
        n = 0;
        if (n3 == -1) {
            n3 = vb.f$j().player.field_71071_by.currentItem;
            n = 1;
        }
        vb.f$C().playerController.windowClick(0, n4, 0, ClickType.PICKUP, (EntityPlayer)vb.f$M().player);
        vb.f$h().playerController.windowClick(0, 36 + n3, 0, ClickType.PICKUP, (EntityPlayer)vb.f$H().player);
        if (n != 0) {
            vb.f$K().playerController.windowClick(0, n4, 0, ClickType.PICKUP, (EntityPlayer)vb.f$A().player);
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.JC;
import net.futureclient.client.ME;

public class vC
extends Ha<ME> {
    public final JC f$d;

    @Override
    public void f$E(ME mE) {
        if (JC.f$a().player.func_110143_aJ() <= 0.0f) {
            JC.f$E().player.respawnPlayer();
        }
    }

    public vC(JC jC) {
        0.f$d = jC;
    }
}
