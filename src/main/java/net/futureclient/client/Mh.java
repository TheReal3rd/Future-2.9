package net.futureclient.client;

import baritone.api.Settings;
import baritone.api.utils.SettingsUtil;
import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.CI;
import net.futureclient.client.dh;
import net.futureclient.client.fj;
import net.futureclient.client.kH;
import net.futureclient.client.ma;
import net.futureclient.client.pI;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class Mh
extends ma {
    private final z<Boolean> f$f;
    private final List<z> f$j;
    private final z<Boolean> f$G;
    private final z<Boolean> f$m;
    private final z<Boolean> f$D;
    public final CI f$d;
    private final z<Boolean> f$a;
    private final z<Boolean> f$I;
    private final z<Boolean> f$k;
    private final z<Boolean> f$e;
    private final List<z> f$M;
    private final z<Boolean> f$K;
    private final s f$h;
    private final z<Boolean> f$l;
    private final z<Boolean> f$F;
    private final z<Boolean> f$b;
    private final z<Boolean> f$E;
    private final z<Boolean> f$C;
    private final z<Boolean> f$H;
    private final z<Boolean> f$c;
    public final Settings f$g;
    private final List<z> f$i;
    private final z<Boolean> f$A;
    private final z<Boolean> f$B;
    private final z<Boolean> f$J;
    private final z<Boolean> f$L;

    public static z f$a(Mh mh) {
        return mh.f$G;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static s f$E(Mh mh) {
        return mh.f$h;
    }

    public Mh(CI cI, String string, String[] stringArray,  /* corrupt varargs signature?! */ SettingsSettings settings) {
        Mh mh = 0;
        mh.f$d = cI;
        mh.f$g = settings;
        super(string, stringArray);
        Mh mh2 = 0;
        String[] stringArray2 = new String[5];
        stringArray2[0] = "Lag Pause";
        stringArray2[1] = "lagpause";
        stringArray2[2] = "lpause";
        stringArray2[3] = "lagp";
        stringArray2[4] = "lp";
        mh2.f$G = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[5];
        stringArray3[0] = "Lag Time";
        stringArray3[1] = "lagtime";
        stringArray3[2] = "ltime";
        stringArray3[3] = "lagt";
        stringArray3[4] = "lt";
        0.f$h = new s((Number)5.0, (Number)1.0, (Number)10.0, 1.0, stringArray3);
        String[] stringArray4 = new String[5];
        stringArray4[0] = "Combat Pause";
        stringArray4[1] = "combatpause";
        stringArray4[2] = "cpause";
        stringArray4[3] = "combatp";
        stringArray4[4] = "cp";
        0.f$f = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[2];
        stringArray5[0] = "Place";
        stringArray5[1] = "p";
        0.f$k = new fj<Boolean>(0.f$g.allowPlace, stringArray5);
        String[] stringArray6 = new String[2];
        stringArray6[0] = "Break";
        stringArray6[1] = "b";
        0.f$F = new fj<Boolean>(0.f$g.allowBreak, stringArray6);
        String[] stringArray7 = new String[2];
        stringArray7[0] = "Sprint";
        stringArray7[1] = "s";
        0.f$J = new fj<Boolean>(0.f$g.allowSprint, stringArray7);
        String[] stringArray8 = new String[4];
        stringArray8[0] = "Use Inventory";
        stringArray8[1] = "UseInventory";
        stringArray8[2] = "inventory";
        stringArray8[3] = "i";
        0.f$E = new fj<Boolean>(0.f$g.allowInventory, stringArray8);
        String[] stringArray9 = new String[2];
        stringArray9[0] = "Vines";
        stringArray9[1] = "v";
        0.f$H = new fj<Boolean>(0.f$g.allowVines, stringArray9);
        String[] stringArray10 = new String[4];
        stringArray10[0] = "Jump At 256";
        stringArray10[1] = "JumpAt256";
        stringArray10[2] = "ja";
        stringArray10[3] = "ja256";
        0.f$m = new fj<Boolean>(0.f$g.allowJumpAt256, stringArray10);
        String[] stringArray11 = new String[2];
        stringArray11[0] = "Parkour";
        stringArray11[1] = "p";
        0.f$D = new fj<Boolean>(0.f$g.allowParkour, stringArray11);
        String[] stringArray12 = new String[3];
        stringArray12[0] = "Parkour Place";
        stringArray12[1] = "ParkourPlace";
        stringArray12[2] = "pp";
        0.f$l = new fj<Boolean>(0.f$g.allowParkourPlace, stringArray12);
        String[] stringArray13 = new String[3];
        stringArray13[0] = "Parkour Ascend";
        stringArray13[1] = "ParkourAscend";
        stringArray13[2] = "pa";
        0.f$L = new fj<Boolean>(0.f$g.allowParkourAscend, stringArray13);
        String[] stringArray14 = new String[3];
        stringArray14[0] = "Diagonal Ascend";
        stringArray14[1] = "DiagonalAscend";
        stringArray14[2] = "da";
        0.f$c = new fj<Boolean>(0.f$g.allowDiagonalAscend, stringArray14);
        String[] stringArray15 = new String[3];
        stringArray15[0] = "Diagonal Descend";
        stringArray15[1] = "DiagonalDescend";
        stringArray15[2] = "dd";
        0.f$A = new fj<Boolean>(0.f$g.allowDiagonalDescend, stringArray15);
        String[] stringArray16 = new String[3];
        stringArray16[0] = "Mine Downward";
        stringArray16[1] = "MineDownward";
        stringArray16[2] = "md";
        0.f$B = new fj<Boolean>(0.f$g.allowDownward, stringArray16);
        String[] stringArray17 = new String[3];
        stringArray17[0] = "Legit Mine";
        stringArray17[1] = "LegitMine";
        stringArray17[2] = "lm";
        0.f$a = new fj<Boolean>(0.f$g.legitMine, stringArray17);
        String[] stringArray18 = new String[3];
        stringArray18[0] = "Log On Arrival";
        stringArray18[1] = "LogOnArrival";
        stringArray18[2] = "loa";
        0.f$C = new fj<Boolean>(0.f$g.disconnectOnArrival, stringArray18);
        String[] stringArray19 = new String[3];
        stringArray19[0] = "Free Look";
        stringArray19[1] = "FreeLook";
        stringArray19[2] = "fl";
        0.f$e = new fj<Boolean>(0.f$g.freeLook, stringArray19);
        String[] stringArray20 = new String[3];
        stringArray20[0] = "AntiCheat";
        stringArray20[1] = "ac";
        stringArray20[2] = "a";
        0.f$I = new fj<Boolean>(0.f$g.antiCheatCompatibility, stringArray20);
        String[] stringArray21 = new String[4];
        stringArray21[0] = "Censor Coords";
        stringArray21[1] = "CensorCoords";
        stringArray21[2] = "CoordsCensor";
        stringArray21[3] = "cc";
        0.f$K = new fj<Boolean>(0.f$g.censorCoordinates, stringArray21);
        String[] stringArray22 = new String[3];
        stringArray22[0] = "Chat Debug";
        stringArray22[1] = "ChatDebug";
        stringArray22[2] = "cd";
        0.f$b = new fj<Boolean>(0.f$g.chatDebug, stringArray22);
        0.f$j = new ArrayList<z>();
        0.f$i = new ArrayList<z>();
        0.f$M = new ArrayList<z>();
        0.f$j.add(0.f$G);
        Mh mh3 = 0;
        mh3.f$j.add(mh3.f$h);
        Mh mh4 = 0;
        mh4.f$j.add(mh4.f$f);
        Mh mh5 = 0;
        mh5.f$M.addAll(mh5.f$j);
        Mh mh6 = 0;
        mh6.f$i.add(mh6.f$k);
        Mh mh7 = 0;
        mh7.f$i.add(mh7.f$F);
        Mh mh8 = 0;
        mh8.f$i.add(mh8.f$J);
        Mh mh9 = 0;
        mh9.f$i.add(mh9.f$E);
        Mh mh10 = 0;
        mh10.f$i.add(mh10.f$H);
        Mh mh11 = 0;
        mh11.f$i.add(mh11.f$m);
        Mh mh12 = 0;
        mh12.f$i.add(mh12.f$D);
        Mh mh13 = 0;
        mh13.f$i.add(mh13.f$l);
        Mh mh14 = 0;
        mh14.f$i.add(mh14.f$L);
        Mh mh15 = 0;
        mh15.f$i.add(mh15.f$c);
        Mh mh16 = 0;
        mh16.f$i.add(mh16.f$A);
        Mh mh17 = 0;
        mh17.f$i.add(mh17.f$B);
        Mh mh18 = 0;
        mh18.f$i.add(mh18.f$a);
        Mh mh19 = 0;
        mh19.f$i.add(mh19.f$C);
        Mh mh20 = 0;
        mh20.f$i.add(mh20.f$e);
        Mh mh21 = 0;
        mh21.f$i.add(mh21.f$I);
        Mh mh22 = 0;
        mh22.f$i.add(mh22.f$K);
        Mh mh23 = 0;
        mh23.f$i.add(mh23.f$b);
        Mh mh24 = 0;
        mh24.f$M.addAll(mh24.f$i);
        Mh mh25 = 0;
        mh25.f$a(mh25.f$M);
        kH.f$E().f$E().f$a(new pI(0));
        kH.f$E().f$E().f$a(new dh(0));
    }

    public static z f$E(Mh mh) {
        return mh.f$f;
    }

    @Override
    public void f$a() {
        Mh mh;
        Mh mh2 = mh;
        mh2.f$a(mh2.f$j);
        super.f$a();
        mh2.f$a(mh2.f$M);
        SettingsUtil.save((Settings)mh2.f$g);
    }

    @Override
    public void f$e() {
        Mh mh;
        Mh mh2 = mh;
        mh2.f$a(mh2.f$j);
        super.f$e();
        mh2.f$a(mh2.f$M);
        SettingsUtil.readAndApply((Settings)mh2.f$g);
    }
}
package net.futureclient.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import net.futureclient.client.BH;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;

public class mh {
    public int f$g;
    public BH[] f$K;
    private float f$I;
    public boolean f$j;
    public int f$M;
    public boolean f$i;
    public DynamicTexture f$d;
    public Font f$b;

    public int f$E(String object) {
        int n;
        int n2 = 0;
        char[] cArray = ((String)object).toCharArray();
        object = cArray;
        int n3 = cArray.length;
        int n4 = n = 0;
        while (n4 < n3) {
            Object object2 = object[n];
            if (object2 < 0.f$K.length) {
                n2 += 0.f$K[object2].f$j - 8 + 0.f$g;
            }
            n4 = ++n;
        }
        return n2 / 2;
    }

    public void f$E(Font font) {
        mh mh2 = 0;
        0.f$b = font;
        mh mh3 = 0;
        mh2.f$d = mh2.f$E(font, mh2.f$j, mh3.f$i, mh3.f$K);
    }

    public BufferedImage f$E(Font serializable2, boolean 022, boolean 0322, BH[] bHArray) {
        int n;
        Graphics2D graphics2D;
        mh mh2;
        int n2;
        int n3 = n2 = (int)mh2.f$I;
        BufferedImage bufferedImage = new BufferedImage(n3, n3, 2);
        Graphics2D graphics2D2 = graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont((Font)serializable2);
        Graphics2D graphics2D3 = graphics2D;
        graphics2D2.setColor(new Color(255, 255, 255, 0));
        int n4 = n2;
        graphics2D.fillRect(0, 0, n4, n4);
        graphics2D2.setColor(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, 0322 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, 022 != 0 ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 022 != 0 ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        serializable2 = graphics2D.getFontMetrics();
        022 = 0;
        0322 = false;
        int n5 = 1;
        int n6 = n = 0;
        while (n6 < ((void)bHArray).length) {
            int 0322;
            char c = (char)n;
            BH bH = new BH(mh2);
            Rectangle2D rectangle2D = ((FontMetrics)serializable2).getStringBounds(String.valueOf(c), graphics2D);
            BH bH2 = bH;
            bH2.f$j = rectangle2D.getBounds().width + 8;
            bH2.f$i = rectangle2D.getBounds().height;
            if (0322 + bH.f$j >= n2) {
                0322 = 0;
                n5 += 022;
                022 = 0;
            }
            if (bH.f$i > 022) {
                022 = bH.f$i;
            }
            BH bH3 = bH;
            bH3.f$M = 0322;
            bH3.f$g = n5;
            if (bH.f$i > mh2.f$M) {
                mh2.f$M = bH.f$i;
            }
            bHArray[n] = bH;
            int n7 = 0322;
            graphics2D.drawString(String.valueOf(c), n7 + 2, n5 + ((FontMetrics)serializable2).getAscent());
            0322 = n7 + bH.f$j;
            n6 = ++n;
        }
        return bufferedImage;
    }

    public void f$E(boolean bl) {
        if (0.f$i != bl) {
            0.f$i = bl;
            mh mh2 = 0;
            0.f$d = mh2.f$E(0.f$b, mh2.f$j, bl, 0.f$K);
        }
    }

    public mh(Font font, boolean bl, boolean bl2) {
        mh mh2 = 0;
        mh2.f$I = 512.0f;
        mh2.f$K = new BH[256];
        mh mh3 = 0;
        mh mh4 = 0;
        mh4.f$M = -1;
        mh4.f$g = 0;
        mh3.f$b = font;
        mh3.f$j = bl;
        0.f$i = bl2;
        0.f$d = 0.f$E(font, bl, bl2, 0.f$K);
    }

    public boolean f$a() {
        mh mh2;
        return mh2.f$j;
    }

    public Font f$E() {
        mh mh2;
        return mh2.f$b;
    }

    public void f$E(BH[] bHArray2, char c, float f, float f2) throws ArrayIndexOutOfBoundsException {
        try {
            0.f$E(f, f2, bHArray2[c].f$j, bHArray2[c].f$i, bHArray2[c].f$M, bHArray2[c].f$g, bHArray2[c].f$j, bHArray2[c].f$i);
            return;
        }
        catch (Exception bHArray2) {
            bHArray2.printStackTrace();
            return;
        }
    }

    public boolean f$E() {
        mh mh2;
        return mh2.f$i;
    }

    public int f$E() {
        mh mh2;
        return mh2.f$M / 2 - 2;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 5 << 3 ^ 1;
        int cfr_ignored_0 = 1 << 3 ^ 2;
        int n5 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
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

    public void f$a(boolean bl) {
        if (0.f$j != bl) {
            0.f$j = bl;
            mh mh2 = 0;
            0.f$d = mh2.f$E(0.f$b, bl, mh2.f$i, 0.f$K);
        }
    }

    public void f$E(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        GL11.glTexCoord2f((float)((f5 /= 0.f$I) + (f7 /= 0.f$I)), (float)(f6 /= 0.f$I));
        GL11.glVertex2d((double)(f + f3), (double)f2);
        GL11.glTexCoord2f((float)f5, (float)f6);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glTexCoord2f((float)f5, (float)(f6 + (f8 /= 0.f$I)));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)f5, (float)(f6 + f8));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f5 + f7), (float)(f6 + f8));
        GL11.glVertex2d((double)(f + f3), (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f5 + f7), (float)f6);
        GL11.glVertex2d((double)(f + f3), (double)f2);
    }

    public DynamicTexture f$E(Font 0222, boolean bl, boolean bl2, BH[] bHArray) {
        Object 0222 = 0.f$E((Font)0222, bl, bl2, bHArray);
        try {
            return new DynamicTexture((BufferedImage)0222);
        }
        catch (Exception 0222) {
            0222.printStackTrace();
            return null;
        }
    }
}
