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

import java.util.concurrent.atomic.AtomicInteger;
import net.futureclient.client.CG;
import net.futureclient.client.HG;
import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.MB;
import net.futureclient.client.Pf;
import net.futureclient.client.TH;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class QB
extends Ha<Pf> {
    public final MB f$d;

    public QB(MB mB) {
        0.f$d = mB;
    }

    @Override
    public void f$E(Pf pf) {
        switch (pf.f$E()) {
            case f$M: {
                QB qB;
                QB qB2 = 0;
                while (false) {
                }
                MB.f$e(qB2.f$d, null);
                if (MB.f$e(qB2.f$d) == 1 && MB.f$a(0.f$d, null) == null) {
                    if (MB.f$E(0.f$d)) {
                        La.f$E().f$E("Finished tuning.");
                        0.f$d.f$E(false);
                        return;
                    }
                    MB.f$E(0.f$d, true);
                    MB.f$a(0.f$d, 0);
                    MB.f$E(0.f$d, 0);
                    return;
                }
                QB qB3 = 0;
                if (MB.f$e(0.f$d) != 0) {
                    QB qB4 = 0;
                    MB.f$e(qB3.f$d, MB.f$a(qB4.f$d, MB.f$a(qB4.f$d)));
                    QB qB5 = 0;
                    MB.f$E(qB5.f$d, MB.f$E(qB5.f$d));
                    qB = 0;
                } else {
                    while (MB.f$a(qB3.f$d) < 250 && MB.f$E(0.f$d) == null) {
                        QB qB6 = 0;
                        MB.f$e(qB6.f$d, ((BlockPos[])MB.f$a(qB6.f$d).get((Object)HG.values()[(int)Math.floor(MB.f$a(0.f$d) / 25)]))[MB.f$a(0.f$d) % 25]);
                        MB.f$E(0.f$d);
                        qB3 = 0;
                    }
                    qB = 0;
                }
                if (MB.f$E(qB.f$d) == null) {
                    return;
                }
                float[] fArray = TH.f$E(MB.f$E(0.f$d), CG.f$E(MB.f$E(0.f$d)));
                Pf pf2 = pf;
                pf2.f$a(fArray[0]);
                pf2.f$E(fArray[1]);
                return;
            }
            case f$g: {
                if (MB.f$e(0.f$d) == 0 && MB.f$E(0.f$d) != null) {
                    MB.f$e().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, MB.f$E(0.f$d), CG.f$E(MB.f$E(0.f$d))));
                    MB.f$a().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, MB.f$E(0.f$d), CG.f$E(MB.f$E(0.f$d))));
                    return;
                }
                if (MB.f$E(0.f$d) == null) break;
                ((AtomicInteger)MB.f$E(0.f$d).get(MB.f$E(0.f$d))).decrementAndGet();
                MB.f$E().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(MB.f$E(0.f$d), CG.f$E(MB.f$E(0.f$d)), EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
            }
        }
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
