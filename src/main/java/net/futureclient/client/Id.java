package net.futureclient.client;

import net.futureclient.client.Qb;
import net.futureclient.client.Uh;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.wD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;

public class Id
extends Qb {
    private ka f$g;
    private Minecraft f$d;

    @Override
    public void f$a(int n, int n2, int n3) {
        Id id = 0;
        super.f$B(n, n2, n3);
        if (id.f$E(n, n2)) {
            if (n3 == 0) {
                0.f$g.f$a();
                return;
            }
            if (n3 == 1) {
                Id id2 = 0;
                id2.f$g.f$E();
                id2.f$d.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
            }
        }
    }

    @Override
    public boolean f$E() {
        return true;
    }

    @Override
    public void f$E(int n, int n2, float f2) {
        gF f2 = (gF)kH.f$E().f$E().f$E(gF.class);
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        Id id = 0;
        Id id2 = 0;
        Id id3 = 0;
        Uh.f$E(id.f$b, id.f$j, id2.f$b + (float)id2.f$i + 7.0f, id3.f$j + (float)id3.f$M, 0.f$E() ? (!0.f$E(n, n2) ? wD2.f$a.getRGB() + -1728053248 : wD2.f$a.getRGB() + 0x70000000) : (!0.f$E(n, n2) ? 0x11555555 : -2007673515));
        if (f2.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            f2.f$L.f$E(String.format("%s\u00a77 %s", 0.f$E(), 0.f$g.f$E()), (double)(0.f$b + 2.0f), (double)(0.f$j + 4.0f), 0xFFFFFF);
            GlStateManager.disableBlend();
            return;
        }
        0.f$d.fontRenderer.drawStringWithShadow(String.format("%s\u00a77 %s", 0.f$E(), 0.f$g.f$E()), 0.f$b + 2.0f, 0.f$j + 4.0f, 0xFFFFFF);
    }

    @Override
    public int f$E() {
        return 14;
    }

    public Id(ka ka2) {
        super(ka2.f$E()[0]);
        0.f$d = Minecraft.getMinecraft();
        0.f$g = ka2;
    }

    @Override
    public void f$E() {
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class iD
extends RF {
    public iD() {
        iD iD2;
    }
}
