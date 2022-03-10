package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.F;
import net.futureclient.client.Uh;
import net.futureclient.client.WB;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.qC;
import net.futureclient.client.wD;
import net.futureclient.client.wa;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;

public class Qb
extends wa
implements F {
    private boolean f$d;
    private Minecraft f$g;

    @Override
    public void f$E(int n, int n2, float f2) {
        int n3;
        Qb qb;
        int n4;
        gF f2 = (gF)kH.f$E().f$E().f$E(gF.class);
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        Qb qb2 = 0;
        Qb qb3 = 0;
        float f3 = qb3.f$b + (float)qb3.f$i;
        Qb qb4 = 0;
        float f4 = qb4.f$j + (float)qb4.f$M;
        if (0.f$E()) {
            if (!0.f$a(n, n2)) {
                n4 = wD2.f$a.getRGB() + -1728053248;
                qb = 0;
            } else {
                n4 = wD2.f$a.getRGB() + 0x70000000;
                qb = 0;
            }
        } else if (!0.f$a(n, n2)) {
            n4 = 0x33555555;
            qb = 0;
        } else {
            n4 = -2007673515;
            qb = 0;
        }
        if (qb.f$E()) {
            wD wD3 = wD2;
            n3 = !0.f$a(n, n2) ? wD3.f$a.getRGB() + -1728053248 : wD3.f$a.getRGB() + 0x70000000;
        } else {
            n3 = !0.f$a(n, n2) ? 0x55555555 : -1722460843;
        }
        Uh.f$a(qb2.f$b, qb2.f$j, f3, f4, n4, n3);
        if (f2.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            f2.f$L.f$E(0.f$E(), (double)(0.f$b + 2.0f), (double)(0.f$j + 4.0f), 0.f$E() ? -1 : -5592406);
            GlStateManager.disableBlend();
            return;
        }
        0.f$g.fontRenderer.drawStringWithShadow(0.f$E(), 0.f$b + 2.0f, 0.f$j + 4.0f, 0.f$E() ? -1 : -5592406);
    }

    public boolean f$E(int n, int n2) {
        Iterator<qC> iterator = WB.f$E().f$E().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().f$M) continue;
            return false;
        }
        return (float)n >= 0.f$a() && (float)n <= 0.f$a() + (float)0.f$a() + 6.0f && (float)n2 >= 0.f$E() && (float)n2 <= 0.f$E() + (float)0.f$M;
    }

    public void f$e(int n, int n2, int n3) {
        if (n3 != 0 || 0.f$a(n, n2)) {
            // empty if block
        }
    }

    @Override
    public int f$E() {
        return 14;
    }

    public void f$E() {
    }

    public boolean f$a(int n, int n2) {
        Iterator<qC> iterator = WB.f$E().f$E().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().f$M) continue;
            return false;
        }
        return (float)n >= 0.f$a() && (float)n <= 0.f$a() + (float)0.f$a() - 1.0f && (float)n2 >= 0.f$E() && (float)n2 <= 0.f$E() + (float)0.f$M;
    }

    public void f$B(int n, int n2, int n3) {
        if (n3 == 0 && 0.f$E(n, n2)) {
            0.f$d = !0.f$d;
            Qb qb = 0;
            qb.f$E();
            qb.f$g.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
        }
    }

    public Qb(String string) {
        super(string);
        0.f$g = Minecraft.getMinecraft();
        0.f$M = 15;
    }

    public boolean f$E() {
        Qb qb;
        return qb.f$d;
    }

    @Override
    public void f$a(int n, int n2, int n3) {
        if (n3 == 0 && 0.f$a(n, n2)) {
            0.f$d = !0.f$d;
            Qb qb = 0;
            qb.f$E();
            qb.f$g.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
        }
    }

    public void f$E(boolean bl) {
        0.f$d = bl;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.nE;
import net.futureclient.client.sC;

public class qB
extends Ha<nE> {
    public final sC f$d;

    @Override
    public void f$E(nE nE2) {
        nE2.f$E(true);
    }

    public qB(sC sC2) {
        0.f$d = sC2;
    }
}
package net.futureclient.client;

public enum qb {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qb() {
        qb qb2;
    }
}
