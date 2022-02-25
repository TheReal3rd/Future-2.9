package net.futureclient.client;

import net.futureclient.client.Bh;
import net.futureclient.client.KG;
import net.futureclient.client.KH;
import net.futureclient.client.ci;
import net.futureclient.client.kH;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public class Ah {
    private float f$b;
    private float f$g;
    private int f$e;
    private float f$j;
    private static final Minecraft f$C;
    private final Bh f$I;
    private boolean f$K;
    private float f$M;
    private float f$d;
    private float f$i;

    public static float f$B(Ah ah) {
        return ah.f$M;
    }

    /*
     * Unable to fully structure code
     */
    private float f$E(EntityLivingBase 0, float 0, float 0) {
        var4_4 = 0;
        v0 = 0;
        var5_5 = 0.field_70165_t - v0.field_70169_q;
        var7_7 = v0.field_70161_v - 0.field_70166_s;
        v1 = var5_5;
        v2 = var7_7;
        if (!((float)(v1 * v1 + v2 * v2) > 0.0025000002f)) ** GOTO lbl15
        var9_8 = (float)MathHelper.atan2((double)var7_7, (double)var5_5) * 57.295776f - 90.0f;
        var5_6 = MathHelper.abs((float)(MathHelper.wrapDegrees((float)0) - var9_8));
        if (95.0f < var5_6 && var5_6 < 265.0f) {
            var4_4 = var9_8 - 180.0f;
            v3 = 0;
        } else {
            var4_4 = var9_8;
lbl15:
            // 2 sources

            v3 = 0;
        }
        if (v3.swingProgress > 0.0f) {
            var4_4 = 0;
        }
        var4_4 = 0 + MathHelper.wrapDegrees((float)(var4_4 - 0)) * 0.3f;
        var9_8 = MathHelper.wrapDegrees((float)(0 - var4_4));
        if (v4 < -75.0f) {
            var9_8 = -75.0f;
        }
        if (var9_8 >= 75.0f) {
            var9_8 = 75.0f;
        }
        var4_4 = 0 - var9_8;
        v5 = var9_8;
        if (v5 * v5 > 2500.0f) {
            var4_4 += var9_8 * 0.2f;
        }
        return var4_4;
    }

    public static float f$e(Ah ah) {
        return ah.f$i;
    }

    public static void f$E(Ah ah, float f, float f2) {
        ah.f$a(f, f2);
    }

    public static float f$E(Ah ah) {
        return ah.f$g;
    }

    public Ah() {
        Ah ah;
        Ah ah2 = ah;
        ah2.f$I = new Bh();
        kH.f$E().f$E().f$a(new ci(ah));
        kH.f$E().f$E().f$a(new KH(ah));
        kH.f$E().f$E().f$a(new KG(ah));
    }

    public static float f$a(Ah ah) {
        return ah.f$d;
    }

    private void f$E(float f, float f2) {
        Ah ah = 0;
        0.f$j = 0.f$b;
        ah.f$b = f;
        0.f$M = 0.f$i;
        ah.f$i = 0.f$E((EntityLivingBase)Ah.f$C.player, f2, 0.f$M);
        0.f$d = 0.f$g;
        0.f$g = f2;
    }

    static {
        f$C = Minecraft.getMinecraft();
    }

    private void f$a(float f, float f2) {
        if (0.f$e != Ah.f$C.player.field_70173_aa) {
            Ah ah = 0;
            ah.f$e = Ah.f$C.player.field_70173_aa;
            ah.f$K = f != Ah.f$C.player.field_70125_A || f2 != Ah.f$C.player.field_70177_z;
            0.f$E(f, f2);
        }
    }

    public static boolean f$E(Ah ah) {
        return ah.f$K;
    }

    public static float f$A(Ah ah) {
        return ah.f$j;
    }

    public static Bh f$E(Ah ah) {
        return ah.f$I;
    }

    public static float f$K(Ah ah) {
        return ah.f$b;
    }
}
package net.futureclient.client;

import net.minecraft.client.gui.BossInfoClient;

public class aH {
    public int f$d;
    public BossInfoClient f$g;

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ (3 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public aH() {
        aH aH2;
        aH2.f$d = 0;
    }
}
package net.futureclient.client;

public class ah {
    public int f$g;
    public int f$d;

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 5 << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 3 << 3 ^ (2 ^ 5);
        int n5 = (3 ^ 5) << 3 ^ 4;
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

    public ah(int n, int n2) {
        ah ah2 = 0;
        ah2.f$g = n;
        ah2.f$d = n2;
    }

    public boolean equals(Object object) {
        if (object instanceof ah) {
            ah ah2 = (ah)object;
            return Double.compare(ah2.f$g, 0.f$g) == 0 && Double.compare(ah2.f$d, 0.f$d) == 0;
        }
        return super.equals(object);
    }
}
