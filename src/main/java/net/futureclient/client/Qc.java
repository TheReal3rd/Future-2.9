package net.futureclient.client;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import net.futureclient.client.F;
import net.futureclient.client.Qb;
import net.futureclient.client.TH;
import net.futureclient.client.Uh;
import net.futureclient.client.WB;
import net.futureclient.client.aj;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.wD;
import net.futureclient.client.wa;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public abstract class qC
implements F {
    private int f$I;
    private boolean f$i;
    private Minecraft f$d;
    private int f$j;
    private ArrayList<wa> f$g;
    private int f$C;
    private int f$K;
    private int f$b;
    public boolean f$M;
    private String f$B;
    public int f$a;
    private int f$e;

    public void f$a(int n) {
        0.f$C = n;
    }

    public void f$a(int n, int n2, int n3) {
        if (n3 == 0 && 0.f$E(n, n2)) {
            qC qC3 = 0;
            qC3.f$I = qC3.f$C - n;
            qC3.f$K = qC3.f$e - n2;
            WB.f$E().f$E().forEach(qC2 -> {
                if (qC2.f$M) {
                    qC2.f$M = false;
                }
            });
            0.f$M = true;
            return;
        }
        if (n3 == 1 && 0.f$E(n, n2)) {
            0.f$i = !0.f$i;
            0.f$d.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
            return;
        }
        if (0.f$i) {
            0.f$E().forEach(wa2 -> wa2.f$a(n, n2, n3));
        }
    }

    public int f$e() {
        qC qC2;
        return qC2.f$e;
    }

    @Override
    public String f$E() {
        qC qC2;
        return qC2.f$B;
    }

    public boolean f$E() {
        qC qC2;
        return qC2.f$i;
    }

    public ArrayList<wa> f$E() {
        qC qC2;
        return qC2.f$g;
    }

    public void f$E(int n, int n2, float f) {
        float f2;
        GlStateManager.pushMatrix();
        GlStateManager.scale((double)WB.f$E().f$d, (double)WB.f$E().f$d, (double)WB.f$E().f$d);
        qC qC2 = 0;
        qC2.f$a(n, n2);
        float f3 = qC2.f$i ? 0.f$E() - 2.0f : 0.0f;
        Object object = (gF)kH.f$E().f$E().f$E(gF.class);
        F f4 = (wD)kH.f$E().f$E().f$E(wD.class);
        qC qC3 = 0;
        qC qC4 = 0;
        Uh.f$a(0.f$C, (float)0.f$e - 1.5f, qC3.f$C + 0.f$b, qC4.f$e + qC4.f$j - 6, ((wD)f4).f$a.getRGB() + -1728053248, ((wD)f4).f$a.getRGB() + -1728053248);
        float f5 = qC3.f$C;
        float f6 = (float)0.f$e + 12.5f;
        qC qC5 = 0;
        float f7 = qC5.f$C + qC5.f$b;
        if (0.f$E()) {
            qC qC6 = 0;
            f2 = (float)(qC6.f$e + qC6.f$j) + f3;
        } else {
            qC qC7 = 0;
            f2 = qC7.f$e + qC7.f$j - 1;
        }
        Uh.f$E(f5, f6, f7, f2, 0x77000000);
        if (((gF)object).f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            ((gF)object).f$L.f$E(0.f$E(), (double)((float)0.f$C + 3.0f), (double)((float)0.f$e + 1.5f), 0xEDEDED);
            GlStateManager.disableBlend();
        } else {
            0.f$d.fontRenderer.drawStringWithShadow(0.f$E(), (float)0.f$C + 3.0f, (float)0.f$e + 1.5f, 0xEDEDED);
        }
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        aj.f$E(new Color(255, 255, 255, 255));
        qC qC8 = 0;
        0.f$d.getTextureManager().bindTexture(new ResourceLocation("textures/future/arrow.png"));
        GlStateManager.translate((float)(qC8.f$B() + 0.f$a() - 7), (float)((float)(0.f$e() + 6) - 0.3f), (float)0.0f);
        GlStateManager.rotate((float)TH.f$a(qC8.f$a), (float)0.0f, (float)0.0f, (float)0.0f);
        aj.f$E(-5, -5, 0.0f, 0.0f, 10, 10, 10, 10, 10.0f, 10.0f);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        if (qC8.f$i) {
            qC qC9 = 0;
            f3 = (float)(0.f$e() + qC9.f$E()) - 3.0f;
            Object object2 = object = qC9.f$E().iterator();
            while (object2.hasNext()) {
                f4 = (wa)object.next();
                object2 = object;
                F f8 = f4;
                qC qC10 = 0;
                ((wa)f4).f$E((float)qC10.f$C + 2.0f, f3);
                ((wa)f8).f$a(qC10.f$a() - 4);
                ((wa)f8).f$E(n, n2, f);
                f3 += (float)((wa)f4).f$E() + 1.5f;
            }
        }
        GlStateManager.popMatrix();
    }

    public void f$E(int n, int n2) {
        qC qC2 = 0;
        qC2.f$e += n;
        if (qC2.f$e < n2) {
            0.f$e = n2;
        }
        if (0.f$e >= 4) {
            0.f$e = 4;
        }
    }

    public float f$E() {
        qC qC2;
        Iterator<wa> iterator;
        float f = 0.0f;
        Iterator<wa> iterator2 = iterator = qC2.f$E().iterator();
        while (iterator2.hasNext()) {
            wa wa2 = iterator.next();
            f += (float)wa2.f$E() + 1.5f;
            iterator2 = iterator;
        }
        return f;
    }

    public void f$E(int n) {
        0.f$e = n;
    }

    public qC(String string, int n, int n2, boolean bl) {
        qC qC2 = 0;
        qC qC3 = 0;
        qC qC4 = 0;
        qC qC5 = 0;
        qC4.f$g = new ArrayList();
        qC4.f$d = Minecraft.getMinecraft();
        qC4.f$B = string;
        qC3.f$C = n;
        qC3.f$e = n2;
        qC2.f$a = 180;
        qC2.f$b = 88;
        0.f$j = 18;
        0.f$i = bl;
        0.f$E();
    }

    public int f$E() {
        qC qC2;
        return qC2.f$j;
    }

    public void f$E(int n, int n2, int n3) {
        if (n3 == 0) {
            0.f$M = false;
        }
        if (0.f$i) {
            0.f$E().forEach(wa2 -> wa2.f$E(n, n2, n3));
        }
    }

    public void f$E(boolean bl) {
        0.f$i = bl;
    }

    public int f$a() {
        qC qC2;
        return qC2.f$b;
    }

    private void f$a(int n, int n2) {
        if (0.f$M) {
            qC qC2 = 0;
            qC2.f$C = qC2.f$I + n;
            qC2.f$e = qC2.f$K + n2;
        }
    }

    private boolean f$E(int n, int n2) {
        return n >= 0.f$B() && n <= 0.f$B() + 0.f$a() - 1 && (float)n2 >= (float)0.f$e() - 1.5f && n2 <= 0.f$e() + 0.f$E() - 6;
    }

    public void f$E(Qb qb) {
        0.f$g.add(qb);
    }

    public int f$B() {
        qC qC2;
        return qC2.f$C;
    }

    public abstract void f$E();
}

