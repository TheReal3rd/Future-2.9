package net.futureclient.client;

import java.util.Iterator;
import java.util.List;
import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.ME;
import net.futureclient.client.Na;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.qa;
import net.minecraft.item.Item;

public class Xa
extends Ha<ME> {
    public final Na f$d;

    @Override
    public void f$E(ME mE) {
        Xa xa;
        boolean bl;
        block11: {
            bl = false;
            Iterator iterator = ((List)Na.f$E(0.f$d).f$E()).iterator();
            while (iterator.hasNext()) {
                if (Pg.f$E((Item)iterator.next()) == null) continue;
                bl = true;
                xa = 0;
                break block11;
            }
            xa = 0;
        }
        if (((Boolean)Na.f$a(xa.f$d).f$E()).booleanValue()) {
            if (Na.f$E(0.f$d).isEmpty()) {
                int n2;
                int n3 = n2 = 0;
                while (n3 < 9) {
                    if (((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$i) || ((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$M) && ((List)Na.f$E(0.f$d).f$E()).contains(Na.f$M().player.field_71069_bz.getSlot(n2 + 36).getStack().getItem()) || ((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$g) && !((List)Na.f$E(0.f$d).f$E()).contains(Na.f$C().player.field_71069_bz.getSlot(n2 + 36).getStack().getItem())) {
                        Na.f$E(0.f$d).add(n2);
                    }
                    n3 = ++n2;
                }
                Xa xa2 = 0;
                Na.f$E(xa2.f$d, Na.f$E(xa2.f$d).iterator());
            }
            if (Na.f$E(0.f$d).hasNext()) {
                Na.f$H().player.field_71071_by.currentItem = (Integer)Na.f$E(0.f$d).next();
            } else {
                Na.f$E(0.f$d).clear();
            }
        }
        if (!Na.f$h().gameSettings.keyBindUseItem.isKeyDown() || ((Boolean)Na.f$E(0.f$d).f$E()).booleanValue()) {
            Na.f$E(0.f$d).f$a();
        }
        if (((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$i) || ((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$M) && bl || ((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$g) && !bl) {
            if (Na.f$E(0.f$d).f$a(Na.f$a(0.f$d).f$E().floatValue() * 1000.0f) && ((Y)Na.f$A()).getRightClickDelayTimer() > Na.f$E(0.f$d).f$E().intValue()) {
                ((Y)Na.f$K()).setRightClickDelayTimer(Na.f$E(0.f$d).f$E().intValue());
            }
            if (((Boolean)Na.f$E(0.f$d).f$E()).booleanValue() && Na.f$B().objectMouseOver != null && Na.f$e().objectMouseOver.getBlockPos() != null && CG.f$E(Na.f$a().objectMouseOver.getBlockPos())) {
                ((Y)Na.f$E()).f$E(He.f$M);
            }
        }
    }

    public Xa(Na na) {
        0.f$d = na;
    }
}
package net.futureclient.client;

import net.futureclient.client.BA;
import net.futureclient.client.D;
import net.futureclient.client.Ha;
import net.futureclient.client.KC;
import net.futureclient.client.ve;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer;

public class XA
extends Ha<ve> {
    public final KC f$d;

    public XA(KC kC) {
        0.f$d = kC;
    }

    @Override
    public void f$E(ve ve2) {
        switch ((BA)((Object)KC.f$E(0.f$d).f$E())) {
            case f$g: {
                Minecraft minecraft = KC.f$M();
                while (false) {
                }
                if (!(minecraft.player.field_70143_R > 3.8f) || !(ve2.f$E() instanceof CPacketPlayer)) break;
                CPacketPlayer cPacketPlayer = (CPacketPlayer)ve2.f$E();
                ((D)cPacketPlayer).setOnGround(true);
                KC.f$C().player.field_70143_R = 0.0f;
                return;
            }
            case f$i: {
                if (!(ve2.f$E() instanceof CPacketPlayer)) break;
                CPacketPlayer cPacketPlayer = (CPacketPlayer)ve2.f$E();
                if (!((Boolean)KC.f$E(0.f$d).f$E()).booleanValue()) break;
                ((D)cPacketPlayer).setOnGround(false);
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.pc;

public class xA {
    public static final int[] f$d;

    static {
        f$d = new int[pc.values().length];
        try {
            xA.f$d[pc.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            xA.f$d[pc.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import net.futureclient.client.Ba;
import net.futureclient.client.J;
import net.futureclient.client.JD;
import net.futureclient.client.Uh;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.ma;
import net.futureclient.client.oa;
import net.futureclient.client.pd;
import net.futureclient.client.rC;
import net.futureclient.client.sa;
import net.futureclient.client.wD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;

public class xa {
    public int f$b;
    public boolean f$d;
    private int f$i;
    public int f$g;
    public boolean f$K;
    private Minecraft f$C;
    private float f$e;
    public ArrayList<sa> f$M;
    public int f$j;
    private int f$I;

    public int f$a() {
        xa xa2;
        return xa2.f$i;
    }

    public int f$e() {
        xa xa2;
        return xa2.f$b;
    }

    public void f$E(float f) {
        0.f$e = f;
    }

    public float f$E() {
        xa xa2;
        return xa2.f$e;
    }

    public int f$E() {
        xa xa2;
        return xa2.f$g;
    }

    public xa() {
        int n;
        xa xa2;
        xa xa3 = xa2;
        xa xa4 = xa2;
        xa xa5 = xa2;
        xa xa6 = xa2;
        xa2.f$C = Minecraft.getMinecraft();
        xa6.f$e = 0.7f;
        xa6.f$I = 0;
        xa5.f$K = true;
        xa5.f$b = 0;
        xa4.f$j = 0;
        xa4.f$i = 12;
        xa xa7 = xa2;
        xa4.f$M = new ArrayList();
        xa3.f$g = 0;
        xa3.f$d = true;
        Collection<ma> collection = kH.f$E().f$E().f$E();
        JD[] jDArray = JD.values();
        int n2 = jDArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            JD jD = jDArray[n];
            sa sa2 = new sa(xa2, jD.f$E());
            collection.forEach(ma2 -> {
                if (ma2 instanceof J && ((Ba)(ma2 = (Ba)ma2)).f$E().equals((Object)jD) && !ma2.getClass().equals(rC.class) && !ma2.getClass().equals(pd.class)) {
                    sa2.f$E().add(new oa((Ba)ma2));
                }
            });
            xa2.f$M.add(sa2);
            n3 = ++n;
        }
        xa2.f$M.sort(Comparator.comparing(sa::f$E));
        xa2.f$I = xa2.f$M.size() * xa2.f$a();
    }

    public void f$E(int n, int n2) {
        if (0.f$d) {
            int n3;
            int n4;
            gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
            wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
            int n5 = n + 4;
            n5 = gF2 != null && gF2.f$c.f$E().booleanValue() ? (n5 += gF2.f$L.f$E(0.f$M.get(2).f$E())) : (n5 += 0.f$C.fontRenderer.getStringWidth(0.f$M.get(2).f$E()));
            GlStateManager.enableBlend();
            GlStateManager.enableAlpha();
            Uh.f$E((float)n, (float)n2 - 0.4f, (float)(n + n5 - 2), (float)(n2 + 0.f$I) + 0.4f, 1.5f, 0x66000000, -2013265920);
            GlStateManager.disableBlend();
            int n6 = n4 = 0;
            while (n6 < 0.f$M.size()) {
                int n7;
                int n8;
                int n9;
                if (!0.f$K) {
                    n9 = 0;
                } else {
                    xa xa2 = 0;
                    n9 = n3 = xa2.f$g + (xa2.f$j == 0 && 0.f$g < 0 ? -0.f$g : 0);
                }
                if (!0.f$K) {
                    n8 = 0;
                } else {
                    xa xa3 = 0;
                    n8 = n7 = xa3.f$g + (xa3.f$j == 0.f$M.size() - 1 && 0.f$g > 0 ? -0.f$g : 0);
                }
                if (0.f$j == n4) {
                    Uh.f$E((float)n, (float)(n4 * 12 + n2 + n3) - 0.3f, (float)(n + n5) - 2.2f, (float)(n4 + n2 + 12 + n4 * 11 + n7) + 0.3f, 1.5f, -2013265920, wD2.f$a.getRGB() + -1728053248, wD2.f$a.getRGB() + -1728053248);
                }
                n6 = ++n4;
            }
            n4 = n2 + 2;
            int n10 = n3 = 0;
            while (n10 < 0.f$M.size()) {
                xa xa4;
                sa sa2 = 0.f$M.get(n3);
                if (gF2 != null && gF2.f$c.f$E().booleanValue()) {
                    GlStateManager.enableBlend();
                    GlStateManager.enableAlpha();
                    xa4 = 0;
                    gF2.f$L.f$E(sa2.f$E(), (double)(n + 2), (double)n4, -5592406);
                    GlStateManager.disableBlend();
                } else {
                    xa xa5 = 0;
                    xa4 = xa5;
                    xa5.f$C.fontRenderer.drawStringWithShadow(sa2.f$E(), (float)(n + 2), (float)n4, -5592406);
                }
                if (xa4.f$j == n3 && !0.f$K) {
                    sa2.f$E(0.f$C, n + n5, n4 - 2);
                }
                n4 += 0.f$a();
                n10 = ++n3;
            }
        }
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).insert(0, stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 5 << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 5 << 4 ^ 2 << 1;
        int n5 = 2 << 3 ^ (3 ^ 5);
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }
}
