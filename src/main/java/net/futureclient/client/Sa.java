package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Qa;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class Sa
extends Ba {
    private z<Boolean> f$M;
    private z<Boolean> f$d;
    private z<Boolean> f$g;

    public static z f$a(Sa sa) {
        return sa.f$g;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public Sa() {
        Sa sa;
        String[] stringArray = new String[2];
        stringArray[0] = "Avoid";
        stringArray[1] = "AntiVoid";
        super("Avoid", stringArray, false, -10561537, JD.f$M);
        Sa sa2 = sa;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Fire";
        stringArray2[1] = "f";
        sa2.f$M = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Cactus";
        stringArray3[1] = "c";
        sa.f$g = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Unloaded";
        stringArray4[1] = "Void";
        stringArray4[2] = "AntiVoid";
        sa.f$d = new z<Boolean>(true, stringArray4);
        sa.f$E(sa.f$M, sa.f$g, sa.f$d);
        sa.f$E(new Qa(sa));
    }

    public static z f$E(Sa sa) {
        return sa.f$d;
    }

    public static z f$e(Sa sa) {
        return sa.f$M;
    }

    public static Minecraft f$a() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.aA;
import net.minecraft.client.Minecraft;

public class SA
extends Ba {
    public static Minecraft f$E() {
        return f$d;
    }

    public SA() {
        SA sA;
        String[] stringArray = new String[1];
        stringArray[0] = "NoBob";
        super("NoBob", stringArray, true, -10399265, JD.f$i);
        Ha[] haArray = new Ha[1];
        haArray[0] = new aA(sA);
        sA.f$E(haArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.pc;
import net.futureclient.client.yA;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

public class sA
extends Ha<ME> {
    public final yA f$d;

    @Override
    public void f$E(ME mE) {
        0.f$d.f$a(String.format("Sprint \u00a77[\u00a7F%s\u00a77]", 0.f$d.f$d.f$E()));
        if (yA.f$E(0.f$d)) {
            switch ((pc)((Object)0.f$d.f$d.f$E())) {
                case f$M: {
                    Minecraft minecraft = yA.f$a();
                    while (false) {
                    }
                    KeyBinding.setKeyBindState((int)minecraft.gameSettings.keyBindSprint.getKeyCode(), (boolean)true);
                    return;
                }
                case f$g: {
                    yA.f$E().player.setSprinting(true);
                }
            }
        }
    }

    public sA(yA yA2) {
        0.f$d = yA2;
    }
}
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
