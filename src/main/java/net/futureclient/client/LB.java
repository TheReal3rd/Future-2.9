package net.futureclient.client;

public enum LB {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LB() {
        LB lB;
    }
}
package net.futureclient.client;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.Id;
import net.futureclient.client.J;
import net.futureclient.client.Qb;
import net.futureclient.client.TH;
import net.futureclient.client.aj;
import net.futureclient.client.jd;
import net.futureclient.client.ka;
import net.futureclient.client.ma;
import net.futureclient.client.na;
import net.futureclient.client.nb;
import net.futureclient.client.s;
import net.futureclient.client.vH;
import net.futureclient.client.wa;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class lb
extends Qb {
    private ma f$e;
    private List<wa> f$I;
    public Color f$d;
    public float f$g;
    private Minecraft f$b;
    public boolean f$K;
    public int f$j;

    @Override
    public boolean f$E() {
        lb lb2;
        return !(lb2.f$e instanceof Ba) || ((Ba)lb2.f$e).f$E();
    }

    public lb(ma ma2) {
        lb lb2 = 0;
        super(ma2.f$E());
        lb lb3 = 0;
        0.f$I = new ArrayList<wa>();
        lb3.f$b = Minecraft.getMinecraft();
        lb2.f$j = 0;
        lb2.f$g = 1.0f;
        lb2.f$d = new vH(0.0f, 0.0f, 100.0f, 1.0f).f$E();
        0.f$e = ma2;
        if (!0.f$e.f$a().isEmpty()) {
            for (z z2 : ma2.f$a()) {
                if (z2.f$E() instanceof Boolean) {
                    0.f$I.add(new nb(z2));
                }
                if (z2 instanceof ka) {
                    0.f$I.add(new Id((ka)z2));
                }
                if (!(z2 instanceof s)) continue;
                0.f$I.add(new na((s)z2));
            }
        }
        if (ma2 instanceof J) {
            0.f$I.add(new jd((Ba)ma2));
        }
    }

    @Override
    public void f$a(int n, int n2, int n3) {
        lb lb2 = 0;
        super.f$a(n, n2, n3);
        if (!lb2.f$I.isEmpty()) {
            if (n3 == 1 && 0.f$a(n, n2)) {
                0.f$K = !0.f$K;
                0.f$b.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
            }
            if (0.f$K) {
                Iterator<wa> iterator;
                Iterator<wa> iterator2 = iterator = 0.f$I.iterator();
                while (iterator2.hasNext()) {
                    iterator.next().f$a(n, n2, n3);
                    iterator2 = iterator;
                }
            }
        }
    }

    @Override
    public void f$E() {
        lb lb2;
        if (lb2.f$e instanceof Ba) {
            ((Ba)lb2.f$e).f$E();
        }
    }

    @Override
    public void f$E(int n, int n2, float f) {
        lb lb2 = 0;
        super.f$E(n, n2, f);
        if (!lb2.f$I.isEmpty()) {
            GlStateManager.pushMatrix();
            GlStateManager.enableBlend();
            lb lb3 = 0;
            lb lb4 = 0;
            aj.f$E(lb4.f$d);
            lb4.f$b.getTextureManager().bindTexture(new ResourceLocation("textures/future/gear.png"));
            GlStateManager.translate((float)(lb3.f$a() + (float)0.f$a() - 6.7f), (float)(0.f$E() + 7.7f), (float)0.0f);
            GlStateManager.rotate((float)TH.f$a(lb3.f$j), (float)0.0f, (float)0.0f, (float)1.0f);
            aj.f$E(-5, -5, 0.0f, 0.0f, 10, 10, 10, 10, 10.0f, 10.0f);
            GlStateManager.disableBlend();
            GlStateManager.popMatrix();
            if (lb3.f$K) {
                Iterator<wa> iterator;
                float f2 = 1.1f;
                Iterator<wa> iterator2 = iterator = 0.f$I.iterator();
                while (iterator2.hasNext()) {
                    wa wa2 = iterator.next();
                    iterator2 = iterator;
                    wa wa3 = wa2;
                    wa wa4 = wa2;
                    wa4.f$E((float)(0.f$b + 1.0f), 0.f$j + (f2 += 15.0f));
                    wa4.f$E(15);
                    wa3.f$a(0.f$i - 9);
                    wa3.f$E(n, n2, f);
                }
            }
        }
    }

    @Override
    public int f$E() {
        lb lb2;
        if (lb2.f$K) {
            Iterator<wa> iterator;
            int n = 14;
            Iterator<wa> iterator2 = iterator = lb2.f$I.iterator();
            while (iterator2.hasNext()) {
                wa wa2 = iterator.next();
                n += wa2.f$E() + 1;
                iterator2 = iterator;
            }
            return n + 2;
        }
        return 14;
    }
}

