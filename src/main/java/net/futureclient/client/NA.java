package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.Uh;
import net.futureclient.client.WB;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.qC;
import net.futureclient.client.s;
import net.futureclient.client.wD;
import net.futureclient.client.wa;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import org.lwjgl.input.Mouse;

public class na
extends wa {
    private Minecraft f$g;
    private s f$M;
    private boolean f$d;

    @Override
    public void f$E(int n, int n2, float f2) {
        na na2 = 0;
        na2.f$E(n, n2);
        int f2 = na2.f$M.f$E().doubleValue() > 0.f$M.f$B().doubleValue() ? 0.f$a() + 7 : (int)(0.f$M.f$E().doubleValue() / 0.f$M.f$B().doubleValue() * (double)(0.f$a() + 7));
        gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        Uh.f$E(0.f$a() + (float)0.f$g, 0.f$E() + (float)0.f$d, 0.f$a() + (float)f2 + (float)0.f$g, 0.f$E() + (float)0.f$E() + 1.0f + (float)0.f$d, !0.f$E(n, n2) ? wD2.f$a.getRGB() + -1728053248 : wD2.f$a.getRGB() + 0x70000000);
        if (gF2.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            gF2.f$L.f$E(String.format("%s\u00a77 %s", 0.f$E(), 0.f$M.f$E()), (double)(0.f$b + 2.0f), (double)(0.f$j + 4.0f), 0xFFFFFF);
            GlStateManager.disableBlend();
            return;
        }
        0.f$g.fontRenderer.drawStringWithShadow(String.format("%s\u00a77 %s", 0.f$E(), 0.f$M.f$E()), 0.f$b + 2.0f, 0.f$j + 4.0f, 0xFFFFFF);
    }

    private void f$E(int n, int n2) {
        if (!Mouse.isButtonDown((int)0)) {
            0.f$E(false);
        }
        if (0.f$E() && 0.f$E(n, n2)) {
            double d = (double)(((float)n - 0.f$a()) / (float)(0.f$a() + 7)) * 0.f$M.f$B().doubleValue();
            d = (double)Math.round(d * (1.0 / 0.f$M.f$g.doubleValue())) / (1.0 / 0.f$M.f$g.doubleValue());
            na na2 = 0;
            na2.f$M.f$E(d);
            if (na2.f$M.f$E().doubleValue() < 0.f$M.f$e().doubleValue()) {
                na na3 = 0;
                na3.f$M.f$E(na3.f$M.f$e());
                return;
            }
            if (0.f$M.f$E().doubleValue() > 0.f$M.f$B().doubleValue()) {
                na na4 = 0;
                na4.f$M.f$E(na4.f$M.f$B());
            }
        }
    }

    public na(s s2) {
        super(s2.f$E()[0]);
        0.f$g = Minecraft.getMinecraft();
        0.f$M = s2;
    }

    @Override
    public void f$a(int n, int n2, int n3) {
        na na2 = 0;
        super.f$a(n, n2, n3);
        if (na2.f$E(n, n2) && n3 == 0) {
            na na3 = 0;
            na3.f$g.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
            na3.f$E(true);
        }
    }

    @Override
    public int f$E() {
        return 14;
    }

    private boolean f$E(int n, int n2) {
        Iterator<qC> iterator = WB.f$E().f$E().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().f$M) continue;
            return false;
        }
        return (float)n >= 0.f$a() && (float)n <= 0.f$a() + (float)(0.f$a() + 7) && (float)n2 >= 0.f$E() && (float)n2 <= 0.f$E() + (float)0.f$M;
    }

    private void f$E(boolean bl) {
        0.f$d = bl;
    }

    private boolean f$E() {
        na na2;
        return na2.f$d;
    }
}
