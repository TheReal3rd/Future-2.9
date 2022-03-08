package net.futureclient.client.deof.utils.render;


import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;

public class CFontDraw extends CFontRendering {
    private String f$j;// OG
    public BH_Font_Object[] f$I;// OG
    public DynamicTexture f$i;// OG
    private int[] f$b;// OG
    public BH_Font_Object[] f$C;// OG
    public DynamicTexture f$g;// OG
    public BH_Font_Object[] f$e;// OG
    public DynamicTexture f$M;// OG

    public float drawStringFloat(String string, float f, float f2, int n) {
        return this.drawString(string, (double)f, (double)f2, n, false);
    }

    @Override
    public void setAntiAlias(boolean bl) {
        super.setAntiAlias(bl);
        this.setUpFonts();
    }

    private void setUpFonts() {
        this.f$i = this.getDynamicTexture(this.font.deriveFont(1), (boolean)this.antiAlias, (boolean)this.fractionalMetric, this.f$C);
        this.f$M = this.getDynamicTexture(this.font.deriveFont(2), (boolean)this.antiAlias, (boolean)this.fractionalMetric, this.f$e);
        this.f$g = this.getDynamicTexture(this.font.deriveFont(3), (boolean)this.antiAlias, (boolean)this.fractionalMetric, this.f$I);
    }

    @Override
    public void setFont(Font font) {
        super.setFont(font);
        this.setUpFonts();
    }


    private void drawChar(double d, double d2, double d3, double d4, float f) {
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glEnable((int)3553);
    }



    public ArrayList<String> f$a(String string, double d) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if ((double)this.calcWidth(string) > d) {
            int n;
            String[] stringArray = string.split(" ");
            String string2 = "";
            char c = '\uffff';
            int n2 = stringArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                int n4;
                String string3 = stringArray[n];
                int n5 = n4 = 0;
                while (n5 < string3.toCharArray().length) {
                    if (string3.toCharArray()[n4] == '\u00a7' && n4 < string3.toCharArray().length - 1) {
                        c = string3.toCharArray()[n4 + 1];
                    }
                    n5 = ++n4;
                }
                StringBuilder stringBuilder = new StringBuilder();
                if ((double)this.calcWidth(stringBuilder.insert(0, string2).append(string3).append(" ").toString()) < d) {
                    string2 = new StringBuilder().insert(0, string2).append(string3).append(" ").toString();
                } else {
                    arrayList.add(string2);
                    string2 = new StringBuilder().insert(0, "\u00a7").append(c).append(string3).append(" ").toString();
                }
                n3 = ++n;
            }
            if (string2.length() > 0) {
                ArrayList<String> arrayList2 = arrayList;
                if ((double)this.calcWidth(string2) < d) {
                    ArrayList<String> arrayList3 = arrayList;
                    arrayList2.add("\u00a7" + c + string2 + " ");
                } else {
                    arrayList2.addAll(this.splitString(string2, d));
                }
            }
        } else {
            arrayList.add(string);
        }
        return arrayList;
    }

    public CFontDraw(Font font, boolean bl, boolean bl2) {
        super(font, bl, bl2);
        this.f$C = new BH_Font_Object[256];
        this.f$e = new BH_Font_Object[256];
        this.f$I = new BH_Font_Object[256];
        this.f$b = new int[32];
        this.f$j = "0123456789abcdefklmnor";
        this.updateSomething();
        this.setUpFonts();
    }

    public float drawStringCentered(String string, float f, float f2, int n) {
        return this.drawStringFloat(string, f - (float)this.calcWidth(string) / 2.0f, f2, n);
    }

    @Override
    public int calcWidth(String string) {
        int n;
        if (string == null) {
            return 0;
        }
        int n2 = 0;
        BH_Font_Object[] bHArray = this.f$K;
        boolean bl = false;
        boolean bl2 = false;
        int n3 = n = 0;
        while (n3 < string.length()) {
            char c = string.charAt(n);
            if (c == '\u00a7') {
                if (string.length() > n + 1) {
                    switch (Character.toLowerCase(string.charAt(n + 1))) {
                        case 'l': {
                            bl = true;
                            if (bl2) {
                                bHArray = this.f$I;
                                break;
                            }
                            bHArray = this.f$C;
                            break;
                        }
                        case 'o': {
                            bl2 = true;
                            if (bl) {
                                bHArray = this.f$I;
                                break;
                            }
                            bHArray = this.f$e;
                            break;
                        }
                        case 'r': {
                            bl = false;
                            bl2 = false;
                            bHArray = this.f$K;
                            break;
                        }
                    }
                }
                ++n;
            } else if (c < bHArray.length) {
                n2 += bHArray[c].f$j - 8 + super.f$g;
            }
            n3 = ++n;
        }
        return n2 / 2;
    }

    private void updateSomething() {//IDK what this does.
        int n;
        int n2 = n = 0;
        while (n2 < 32) {
            int n3 = (n >> 3 & 1) * 85;
            int n4 = (n >> 2 & 1) * 170 + n3;
            int n5 = (n >> 1 & 1) * 170 + n3;
            n3 = (n & 1) * 170 + n3;
            if (n == 6) {
                n4 += 85;
            }
            if (n >= 16) {
                n4 /= 4;
                n5 /= 4;
                n3 /= 4;
            }
            this.f$b[n++] = (n4 & 0xFF) << 16 | (n5 & 0xFF) << 8 | n3 & 0xFF;
            n2 = n;
        }
    }

    public float drawStringSized(String string, double d, double d2, int n) {
        return Math.max(this.drawString(string, d + 1.0, d2 + 1.0, n, true), this.drawString(string, d, d2, n, false));
    }

    public float drawString(String string, double d, double d1, int n3, boolean bl) {
        int n2;
        d -= 1.0;
        if (string == null) {
            return 0.0f;
        }
        if (n3 == 0x20FFFFFF) {
            n3 = 0xFFFFFF;
        }
        if ((n3 & 0xFC000000) == 0) {
            n3 |= 0xFF000000;
        }
        if (bl) {
            n3 = (n3 & 0xFCFCFC) >> 2 | n3 & 0xFF000000;
        }
        BH_Font_Object[] bHArray = this.f$K;
        float f = (float)(n3 >> 24 & 0xFF) / 255.0f;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        int n4 = 1;
        d *= 2.0;
        d1 = (d1 - 3.0) * 2.0;
        GL11.glPushMatrix();
        GlStateManager.scale(0.5, 0.5, 0.5);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 771);
        GlStateManager.color(((float)(n3 >> 16 & 0xFF) / 255.0f), ((float)(n3 >> 8 & 0xFF) / 255.0f), ((float)(n3 & 0xFF) / 255.0f), f);
        n4 = string.length();
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture(this.dynamicTexture.getGlTextureId());
        GL11.glBindTexture(3553, this.dynamicTexture.getGlTextureId());
        int n5 = n2 = 0;
        while (n5 < n4) {
            char c = string.charAt(n2);
            if (c == '\u00a7') {
                int n6;
                int n7 = 21;
                try {
                    n6 = n7 = "0123456789abcdefklmnor".indexOf(string.charAt(n2 + 1));
                }
                catch (Exception exception) {
                    n6 = n7;
                    exception.printStackTrace();
                }
                if (n6 < 16) {
                    bl3 = false;
                    bl4 = false;
                    bl2 = false;
                    bl6 = false;
                    bl5 = false;
                    GlStateManager.bindTexture((int)this.dynamicTexture.getGlTextureId());
                    bHArray = this.f$K;
                    if (n7 < 0 || n7 > 15) {
                        n7 = 15;
                    }
                    if (bl) {
                        n7 += 16;
                    }
                    int n8 = this.f$b[n7];
                    GlStateManager.color((float)((float)(n8 >> 16 & 0xFF) / 255.0f), (float)((float)(n8 >> 8 & 0xFF) / 255.0f), (float)((float)(n8 & 0xFF) / 255.0f), (float)f);
                } else if (n7 == 16) {
                    bl2 = true;
                } else if (n7 == 17) {
                    bl3 = true;
                    if (bl4) {
                        GlStateManager.bindTexture((int)this.f$g.getGlTextureId());
                        bHArray = this.f$I;
                    } else {
                        GlStateManager.bindTexture((int)this.f$i.getGlTextureId());
                        bHArray = this.f$C;
                    }
                } else if (n7 == 18) {
                    bl5 = true;
                } else if (n7 == 19) {
                    bl6 = true;
                } else if (n7 == 20) {
                    bl4 = true;
                    if (bl3) {
                        GlStateManager.bindTexture((int)this.f$g.getGlTextureId());
                        bHArray = this.f$I;
                    } else {
                        GlStateManager.bindTexture((int)this.f$M.getGlTextureId());
                        bHArray = this.f$e;
                    }
                } else if (n7 == 21) {
                    bl3 = false;
                    bl4 = false;
                    bl2 = false;
                    bl6 = false;
                    bl5 = false;
                    GlStateManager.color(((float)(n3 >> 16 & 0xFF) / 255.0f), ((float)(n3 >> 8 & 0xFF) / 255.0f), ((float)(n3 & 0xFF) / 255.0f), f);
                    GlStateManager.bindTexture(this.dynamicTexture.getGlTextureId());
                    bHArray = this.f$K;
                }
                ++n2;
            } else if (c < bHArray.length && c > '\u0000') {
                GL11.glBegin(4);
                this.f$E(bHArray, c, (float)d, (float)d1);
                GL11.glEnd();
                if (bl5) {
                    double d2 = d;
                    this.drawChar(d2, d1 + (double)bHArray[c].f$i / 2.0, d2 + (double)bHArray[c].f$j - 8.0, d1 + (double)bHArray[c].f$i / 2.0, 1.0f);
                }
                if (bl6) {
                    double d3 = d;
                    this.drawChar(d3, d1 + (double)bHArray[c].f$i - 2.0, d3 + (double)bHArray[c].f$j - 8.0, d1 + (double)bHArray[c].f$i - 2.0, 1.0f);
                }
                d += (double)(bHArray[c].f$j - 8 + super.f$g);
            }
            n5 = ++n2;
        }
        GL11.glHint((int)3155, (int)4352);
        GL11.glPopMatrix();
        return (float)d / 2.0f;
    }

    public ArrayList<String> splitString(String object2, double d) {//This seems to split string by a set length.
        int n;
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = ((String)object2).toCharArray();
        int n2 = n = 0;
        while (n2 < charArray.length) {
            char object = 0;
            int object3 = charArray[n];
            if (object3 == 167 && n < charArray.length - 1) {
                object = charArray[n + 1];
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            if ((double)this.calcWidth(stringBuilder2.insert(0, stringBuilder.toString()).append((char)object3).toString()) < d) {//Guess thats right :shrug:
                stringBuilder.append((char)object3);
            } else {
                arrayList.add(stringBuilder.toString());
                stringBuilder = new StringBuilder(new StringBuilder().insert(0, "\u00a7").append((char)object).append(String.valueOf((char)object3)).toString());
            }
            n2 = ++n;
        }
        if (stringBuilder.length() > 0) {
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }

    @Override
    public void setFractionalMetric(boolean bl) {
        super.setFractionalMetric(bl);
        this.setUpFonts();
    }
}
/*
package net.futureclient.client;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.BH;
import net.futureclient.client.mh;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;

public class fG
extends mh {
    private String f$j;
    public BH[] f$I;
    public DynamicTexture f$i;
    private int[] f$b;
    public BH[] f$C;
    public DynamicTexture f$g;
    public BH[] f$e;
    public DynamicTexture f$M;

    public float f$a(String string, float f, float f2, int n) {
        return 0.f$E(string, (double)f, (double)f2, n, false);
    }

    @Override
    public void f$a(boolean bl) {
        fG fG2 = 0;
        super.f$a(bl);
        fG2.f$a();
    }

    private void f$a() {
        fG fG2;
        fG fG3 = fG2;
        fG fG4 = fG2;
        fG2.f$i = fG3.f$E(fG3.f$b.deriveFont(1), (boolean)fG2.f$j, (boolean)fG4.f$i, fG4.f$C);
        fG fG5 = fG2;
        fG3.f$M = fG3.f$E(fG3.f$b.deriveFont(2), (boolean)fG5.f$j, (boolean)fG5.f$i, fG2.f$e);
        fG fG6 = fG2;
        fG3.f$g = fG3.f$E(fG3.f$b.deriveFont(3), (boolean)fG6.f$j, (boolean)fG6.f$i, fG2.f$I);
    }

    @Override
    public void f$E(Font font) {
        fG fG2 = 0;
        super.f$E(font);
        fG2.f$a();
    }

    private void f$E(double d, double d2, double d3, double d4, float f) {
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glEnable((int)3553);
    }

    public List<String> f$a(String string, double d) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if ((double)0.f$E(string) > d) {
            int n;
            String[] stringArray = string.split(" ");
            String string2 = "";
            char c = '\uffff';
            int n2 = stringArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                int n4;
                String string3 = stringArray[n];
                int n5 = n4 = 0;
                while (n5 < string3.toCharArray().length) {
                    if (string3.toCharArray()[n4] == '\u00a7' && n4 < string3.toCharArray().length - 1) {
                        c = string3.toCharArray()[n4 + 1];
                    }
                    n5 = ++n4;
                }
                StringBuilder stringBuilder = new StringBuilder();
                if ((double)0.f$E(stringBuilder.insert(0, string2).append(string3).append(" ").toString()) < d) {
                    string2 = new StringBuilder().insert(0, string2).append(string3).append(" ").toString();
                } else {
                    arrayList.add(string2);
                    string2 = new StringBuilder().insert(0, "\u00a7").append(c).append(string3).append(" ").toString();
                }
                n3 = ++n;
            }
            if (string2.length() > 0) {
                ArrayList<String> arrayList2 = arrayList;
                if ((double)0.f$E(string2) < d) {
                    ArrayList<String> arrayList3 = arrayList;
                    arrayList2.add("\u00a7" + c + string2 + " ");
                } else {
                    arrayList2.addAll(0.f$E(string2, d));
                }
            }
        } else {
            arrayList.add(string);
        }
        return arrayList;
    }

    public fG(Font font, boolean bl, boolean bl2) {
        super(font, bl, bl2);
        0.f$C = new BH[256];
        0.f$e = new BH[256];
        0.f$I = new BH[256];
        0.f$b = new int[32];
        0.f$j = "0123456789abcdefklmnor";
        0.f$E();
        0.f$a();
    }

    public float f$E(String string, float f, float f2, int n) {
        fG fG2 = 0;
        return fG2.f$a(string, f - (float)fG2.f$E(string) / 2.0f, f2, n);
    }

@Override
public int f$E(String string) {
    int n;
    if (string == null) {
        return 0;
    }
    int n2 = 0;
    BH[] bHArray = 0.f$K;
    boolean bl = false;
    boolean bl2 = false;
    int n3 = n = 0;
    while (n3 < string.length()) {
        char c = string.charAt(n);
        if (c == '\u00a7') {
            if (string.length() > n + 1) {
                switch (Character.toLowerCase(string.charAt(n + 1))) {
                    case 'l': {
                        bl = true;
                        if (bl2) {
                            bHArray = 0.f$I;
                            break;
                        }
                        bHArray = 0.f$C;
                        break;
                    }
                    case 'o': {
                        bl2 = true;
                        fG fG2 = 0;
                        if (bl) {
                            bHArray = fG2.f$I;
                            break;
                        }
                        bHArray = fG2.f$e;
                        break;
                    }
                    case 'r': {
                        bl = false;
                        bl2 = false;
                        bHArray = 0.f$K;
                        break;
                    }
                }
            }
            ++n;
        } else if (c < bHArray.length) {
            n2 += bHArray[c].f$j - 8 + 0.f$g;
        }
        n3 = ++n;
    }
    return n2 / 2;
}

    private void f$E() {
        int n;
        int n2 = n = 0;
        while (n2 < 32) {
            int n3 = (n >> 3 & 1) * 85;
            int n4 = (n >> 2 & 1) * 170 + n3;
            int n5 = (n >> 1 & 1) * 170 + n3;
            n3 = (n & 1) * 170 + n3;
            if (n == 6) {
                n4 += 85;
            }
            if (n >= 16) {
                n4 /= 4;
                n5 /= 4;
                n3 /= 4;
            }
            0.f$b[n++] = (n4 & 0xFF) << 16 | (n5 & 0xFF) << 8 | n3 & 0xFF;
            n2 = n;
        }
    }

    public float f$E(String string, double d, double d2, int n) {
        return Math.max(0.f$E(string, d + 1.0, d2 + 1.0, n, true), 0.f$E(string, d, d2, n, false));
    }

    public float f$E(String string, double d, double 022, int n3, boolean bl) {
        int n2;
        int n3;
        d -= 1.0;
        if (string == null) {
            return 0.0f;
        }
        if (n3 == 0x20FFFFFF) {
            n3 = 0xFFFFFF;
        }
        if ((n3 & 0xFC000000) == 0) {
            n3 |= 0xFF000000;
        }
        if (bl) {
            n3 = (n3 & 0xFCFCFC) >> 2 | n3 & 0xFF000000;
        }
        fG fG2 = 0;
        BH[] bHArray = fG2.f$K;
        float f = (float)(n3 >> 24 & 0xFF) / 255.0f;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        int n4 = 1;
        d *= 2.0;
        double 022 = (022 - 3.0) * 2.0;
        GL11.glPushMatrix();
        GlStateManager.scale((double)0.5, (double)0.5, (double)0.5);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc((int)770, (int)771);
        GlStateManager.color((float)((float)(n3 >> 16 & 0xFF) / 255.0f), (float)((float)(n3 >> 8 & 0xFF) / 255.0f), (float)((float)(n3 & 0xFF) / 255.0f), (float)f);
        n4 = string.length();
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture((int)fG2.f$d.func_110552_b());
        GL11.glBindTexture((int)3553, (int)0.f$d.func_110552_b());
        int n5 = n2 = 0;
        while (n5 < n4) {
            char c = string.charAt(n2);
            if (c == '\u00a7') {
                int n6;
                int n7 = 21;
                try {
                    n6 = n7 = "0123456789abcdefklmnor".indexOf(string.charAt(n2 + 1));
                }
                catch (Exception exception) {
                    n6 = n7;
                    exception.printStackTrace();
                }
                if (n6 < 16) {
                    bl3 = false;
                    bl4 = false;
                    bl2 = false;
                    bl6 = false;
                    bl5 = false;
                    fG fG3 = 0;
                    GlStateManager.bindTexture((int)fG3.f$d.func_110552_b());
                    bHArray = fG3.f$K;
                    if (n7 < 0 || n7 > 15) {
                        n7 = 15;
                    }
                    if (bl) {
                        n7 += 16;
                    }
                    int n8 = 0.f$b[n7];
                    GlStateManager.color((float)((float)(n8 >> 16 & 0xFF) / 255.0f), (float)((float)(n8 >> 8 & 0xFF) / 255.0f), (float)((float)(n8 & 0xFF) / 255.0f), (float)f);
                } else if (n7 == 16) {
                    bl2 = true;
                } else if (n7 == 17) {
                    bl3 = true;
                    fG fG4 = 0;
                    if (bl4) {
                        GlStateManager.bindTexture((int)fG4.f$g.func_110552_b());
                        bHArray = 0.f$I;
                    } else {
                        GlStateManager.bindTexture((int)fG4.f$i.func_110552_b());
                        bHArray = 0.f$C;
                    }
                } else if (n7 == 18) {
                    bl5 = true;
                } else if (n7 == 19) {
                    bl6 = true;
                } else if (n7 == 20) {
                    bl4 = true;
                    fG fG5 = 0;
                    if (bl3) {
                        GlStateManager.bindTexture((int)fG5.f$g.func_110552_b());
                        bHArray = 0.f$I;
                    } else {
                        GlStateManager.bindTexture((int)fG5.f$M.func_110552_b());
                        bHArray = 0.f$e;
                    }
                } else if (n7 == 21) {
                    bl3 = false;
                    bl4 = false;
                    bl2 = false;
                    bl6 = false;
                    bl5 = false;
                    GlStateManager.color((float)((float)(n3 >> 16 & 0xFF) / 255.0f), (float)((float)(n3 >> 8 & 0xFF) / 255.0f), (float)((float)(n3 & 0xFF) / 255.0f), (float)f);
                    fG fG6 = 0;
                    GlStateManager.bindTexture((int)fG6.f$d.func_110552_b());
                    bHArray = fG6.f$K;
                }
                ++n2;
            } else if (c < bHArray.length && c > '\u0000') {
                GL11.glBegin((int)4);
                0.f$E(bHArray, c, (float)d, (float)022);
                GL11.glEnd();
                if (bl5) {
                    double d2 = d;
                    0.f$E(d2, 022 + (double)bHArray[c].f$i / 2.0, d2 + (double)bHArray[c].f$j - 8.0, 022 + (double)bHArray[c].f$i / 2.0, 1.0f);
                }
                if (bl6) {
                    double d3 = d;
                    0.f$E(d3, 022 + (double)bHArray[c].f$i - 2.0, d3 + (double)bHArray[c].f$j - 8.0, 022 + (double)bHArray[c].f$i - 2.0, 1.0f);
                }
                d += (double)(bHArray[c].f$j - 8 + 0.f$g);
            }
            n5 = ++n2;
        }
        GL11.glHint((int)3155, (int)4352);
        GL11.glPopMatrix();
        return (float)d / 2.0f;
    }

    public List<String> f$E(String object2, double d) {
        int n;
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        int c = 65535;
        object2 = ((String)object2).toCharArray();
        int n2 = n = 0;
        while (n2 < ((Object)object2).length) {
            fG fG2;
            Object object;
            Object object3 = object2[n];
            if (object3 == 167 && n < ((Object)object2).length - 1) {
                object = object2[n + 1];
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            if ((double)fG2.f$E(stringBuilder2.insert(0, stringBuilder.toString()).append((char)object3).toString()) < d) {
                stringBuilder.append((char)object3);
            } else {
                arrayList.add(stringBuilder.toString());
                stringBuilder = new StringBuilder(new StringBuilder().insert(0, "\u00a7").append((char)object).append(String.valueOf((char)object3)).toString());
            }
            n2 = ++n;
        }
        if (stringBuilder.length() > 0) {
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }

    @Override
    public void f$E(boolean bl) {
        fG fG2 = 0;
        super.f$E(bl);
        fG2.f$a();
    }
}
 */