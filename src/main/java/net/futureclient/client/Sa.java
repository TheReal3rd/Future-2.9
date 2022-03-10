package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.F;
import net.futureclient.client.Uh;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.oa;
import net.futureclient.client.wD;
import net.futureclient.client.xa;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;

public class sa
implements F {
    private ArrayList<oa> f$i;
    private int f$g;
    private String f$d;
    private xa f$j;
    private int f$M;

    public ArrayList<oa> f$E() {
        sa sa2;
        return sa2.f$i;
    }

    public void f$E(Minecraft minecraft, int n, int n2) {
        int n3;
        0.f$E(minecraft);
        int n4 = n2;
        Uh.f$E((float)n, (float)n2 - 0.4f, (float)(n + 0.f$g) + 4.5f, (float)(n2 + 0.f$M) + 0.4f, 1.5f, 0x66000000, -2013265920);
        gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        int n5 = n3 = 0;
        while (n5 < 0.f$i.size()) {
            int n6 = 0.f$j.f$E() + (0.f$j.f$e() == 0 && 0.f$j.f$E() < 0 ? -0.f$j.f$E() : 0);
            int n7 = 0.f$j.f$E() + (0.f$j.f$e() == 0.f$i.size() - 1 && 0.f$j.f$E() > 0 ? -0.f$j.f$E() : 0);
            if (0.f$j.f$e() == n3) {
                Uh.f$E((float)n, (float)(n4 + n6) - 0.3f, (float)(n + 0.f$g) + 4.5f, (float)(n4 + 12 + n7) + 0.3f, 1.5f, -2013265920, wD2.f$a.getRGB() + -1728053248, wD2.f$a.getRGB() + -1728053248);
            }
            if (gF2.f$c.f$E().booleanValue()) {
                GlStateManager.enableBlend();
                GlStateManager.enableAlpha();
                gF2.f$L.f$E(0.f$i.get(n3).f$E().f$E(), (double)(n + 2), (double)(n2 + 0.f$j.f$a() * n3 + 2), 0.f$i.get(n3).f$E().f$E() ? wD2.f$a.getRGB() : -5592406);
                GlStateManager.disableBlend();
            } else {
                minecraft.fontRenderer.drawStringWithShadow(0.f$i.get(n3).f$E().f$E(), (float)(n + 2), (float)(n2 + 0.f$j.f$a() * n3 + 2), 0.f$i.get(n3).f$E().f$E() ? wD2.f$a.getRGB() : -5592406);
            }
            n4 += 12;
            n5 = ++n3;
        }
    }

    private void f$E(Minecraft minecraft) {
        int n = 0;
        for (oa oa2 : 0.f$i) {
            gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
            if (gF2.f$c.f$E().booleanValue()) {
                if (gF2.f$L.f$E(oa2.f$E().f$E()[0]) <= n) continue;
                n = gF2.f$L.f$E(oa2.f$E().f$E()[0]) + 1;
                continue;
            }
            if (gF2.f$c.f$E().booleanValue() || minecraft.fontRenderer.getStringWidth(oa2.f$E().f$E()[0]) <= n) continue;
            n = minecraft.fontRenderer.getStringWidth(oa2.f$E().f$E()[0]);
        }
        0.f$g = n;
        0.f$M = 0.f$i.size() * 0.f$j.f$a();
    }

    @Override
    public String f$E() {
        sa sa2;
        return sa2.f$d;
    }

    public sa(xa xa2, String string) {
        sa sa2 = 0;
        sa sa3 = 0;
        sa sa4 = 0;
        sa4.f$i = new ArrayList();
        sa3.f$M = 0;
        sa3.f$g = 0;
        sa2.f$j = xa2;
        sa2.f$d = string;
    }
}
