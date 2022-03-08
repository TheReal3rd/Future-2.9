package net.futureclient.client.deof.utils.render;

import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class CFontRendering {
    public int f$g;// OG f$g Width
    public BH_Font_Object[] f$K;// OG f$K
    private float f$I;// OG f$I
    public boolean antiAlias;// OG f$j
    public int f$M;// OG f$M height
    public boolean fractionalMetric;// OG f$i
    public DynamicTexture dynamicTexture;// OG f$d
    public Font font;// OG f$b

    public int calcWidth(String object) {//This looks like width calculator.
        int n;
        int n2 = 0;
        char[] cArray = ((String)object).toCharArray();
        int n3 = cArray.length;
        int n4 = n = 0;
        while (n4 < n3) {
            char object2 = cArray[n];
            if (object2 < this.f$K.length) {
                n2 += this.f$K[object2].f$j - 8 + this.f$g;
            }
            n4 = ++n;
        }
        return n2 / 2;
    }

    public void setFont(Font font) {//Set font.
        this.font = font;
        this.dynamicTexture = this.getDynamicTexture(font, this.antiAlias, this.fractionalMetric, this.f$K);
    }

    public BufferedImage createBufferedImage(Font serializable2, boolean aa, boolean fm, BH_Font_Object[] bHArray) {
        int n;
        Graphics2D graphics2D;
        int n2;
        int n3 = n2 = (int)this.f$I;
        BufferedImage bufferedImage = new BufferedImage(n3, n3, 2);
        Graphics2D graphics2D2 = graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont(serializable2);
        graphics2D2.setColor(new Color(255, 255, 255, 0));
        int n4 = n2;
        graphics2D.fillRect(0, 0, n4, n4);
        graphics2D2.setColor(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, fm ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, aa ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, aa ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int integer = 0;
        int n5 = 1;
        int n6 = n = 0;
        while (n6 < bHArray.length) {
            int integer1 = 0;
            char c = (char)n;
            BH_Font_Object bH = new BH_Font_Object(this);
            Rectangle2D rectangle2D = (fontMetrics).getStringBounds(String.valueOf(c), graphics2D);
            bH.f$j = rectangle2D.getBounds().width + 8;
            bH.f$i = rectangle2D.getBounds().height;
            if (integer1 + bH.f$j >= n2) {
                n5 += integer;
                integer = 0;
            }
            if (bH.f$i > integer) {
                integer = bH.f$i;
            }
            bH.f$M = integer1;
            bH.f$g = n5;
            if (bH.f$i > this.f$M) {
                this.f$M = bH.f$i;
            }
            bHArray[n] = bH;
            int n7 = integer1;
            graphics2D.drawString(String.valueOf(c), n7 + 2, n5 + (fontMetrics).getAscent());
            integer1 = n7 + bH.f$j;
            n6 = ++n;
        }
        return bufferedImage;
    }

    public void setFractionalMetric(boolean bl) {//Set Font setting.
        if (this.fractionalMetric != bl) {
            this.fractionalMetric = bl;
            this.dynamicTexture = this.getDynamicTexture(this.font, this.antiAlias, bl, this.f$K);
        }
    }

    public CFontRendering(Font font, boolean bl, boolean bl2) {
        this.f$I = 512.0f;
        this.f$K = new BH_Font_Object[256];
        this.f$M = -1;
        this.f$g = 0;
        this.font = font;
        this.antiAlias = bl;
        this.fractionalMetric = bl2;
        this.dynamicTexture = this.getDynamicTexture(font, bl, bl2, this.f$K);
    }

    public boolean isAntiAlias() {
        return this.antiAlias;
    }

    public Font getFont() {
        return this.font;
    }

    public void f$E(BH_Font_Object[] bHArray2, char c, float f, float f2) throws ArrayIndexOutOfBoundsException {
        try {
            this.f$E(f, f2, bHArray2[c].f$j, bHArray2[c].f$i, bHArray2[c].f$M, bHArray2[c].f$g, bHArray2[c].f$j, bHArray2[c].f$i);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public boolean isFractionalMetric() {
        return this.fractionalMetric;
    }

    public int f$E() {
        return this.f$M / 2 - 2;
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

    public void setAntiAlias(boolean bl) {
        if (this.antiAlias != bl) {
            this.antiAlias = bl;
            this.dynamicTexture = this.getDynamicTexture(this.font, bl, this.fractionalMetric, this.f$K);
        }
    }

    public void f$E(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        GL11.glTexCoord2f((float)((f5 /= this.f$I) + (f7 /= this.f$I)), (float)(f6 /= this.f$I));
        GL11.glVertex2d((double)(f + f3), (double)f2);
        GL11.glTexCoord2f((float)f5, (float)f6);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glTexCoord2f((float)f5, (float)(f6 + (f8 /= this.f$I)));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)f5, (float)(f6 + f8));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f5 + f7), (float)(f6 + f8));
        GL11.glVertex2d((double)(f + f3), (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f5 + f7), (float)f6);
        GL11.glVertex2d((double)(f + f3), (double)f2);
    }

    public DynamicTexture getDynamicTexture(Font font, boolean bl, boolean bl2, BH_Font_Object[] bHArray) {
        BufferedImage font1 = this.createBufferedImage(font, bl, bl2, bHArray);
        try {
            return new DynamicTexture(font1);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
/*
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
 */