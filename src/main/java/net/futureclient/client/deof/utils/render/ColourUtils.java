package net.futureclient.client.deof.utils.render;

import java.awt.*;

public class ColourUtils {
    private float alpha;//OG f$d
    private Color colour;//OG f$M
    private float[] hsl;//OG f$g

    public ColourUtils(float[] fArray, float f) {
        this.hsl = fArray;
        this.alpha = f;
        this.colour = hslToColour(fArray[0], fArray[1], fArray[2], f);
    }

    public ColourUtils(float f, float f2, float f3, float f4) {
        this.hsl = new float[]{f, f2, f3};
        this.alpha = f4;
        this.colour = hslToColour(this.hsl[0], this.hsl[1], this.hsl[2], f4);
    }

    public ColourUtils(Color color) {
        this.colour = color;
        this.hsl = colourToHSL(this.colour);
        this.alpha = (float)color.getAlpha() / 255.0f;
    }

    public ColourUtils(float[] fArray) {
        this(fArray, 1.0f);
    }

    public ColourUtils(float f, float f2, float f3) {
        this(f, f2, f3, 1.0f);
    }

    public static float[] colourToHSL(Color color) {
        float f;
        float[] fArray = color.getRGBColorComponents(null);
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        float f5 = Math.min(f2, Math.min(f3, f4));
        float f6 = Math.max(f2, Math.max(f3, f4));
        float f7 = 0.0f;
        if (f6 == f5) {
            f7 = 0.0f;
            f = f6;
        } else if (f6 == f2) {
            f7 = (60.0f * (f3 - f4) / (f6 - f5) + 360.0f) % 360.0f;
            f = f6;
        } else if (f6 == f3) {
            f7 = 60.0f * (f4 - f2) / (f6 - f5) + 120.0f;
            f = f6;
        } else {
            if (f6 == f4) {
                f7 = 60.0f * (f2 - f3) / (f6 - f5) + 240.0f;
            }
            f = f6;
        }
        f2 = (f + f5) / 2.0f;
        f3 = 0.0f;
        if (f6 == f5) {
            f3 = 0.0f;
        } else {
            float f8 = f6;
            f3 = f2 <= 0.5f ? (f8 - f5) / (f6 + f5) : (f8 - f5) / (2.0f - f6 - f5);
        }
        return new float[]{f7, f3 * 100.0f, f2 * 100.0f};
    }

    public Color setLightness(float f) {
        return hslToColour(this.hsl[0], this.hsl[1], f, this.alpha);
    }

    public float[] f$E() {
        return this.hsl;
    }

    public String toString() {
        return new StringBuilder().insert(0, "HSLColor[h=").append(this.hsl[0]).append(",s=").append(this.hsl[1]).append(",l=").append(this.hsl[2]).append(",alpha=").append(this.alpha).append("]").toString();
    }

    public static Color setHSL(float[] fArray) {
        return hslToColour(fArray[0], fArray[1], fArray[2], 1.0f);
    }

    public Color setSaturation(float f) {
        return hslToColour(this.hsl[0], f, this.hsl[2], this.alpha);
    }

    public float setHue() {
        return this.hsl[0];
    }

    public Color getColour1() {
        return hslToColour((this.hsl[0] + 180.0f) % 360.0f, this.hsl[1], this.hsl[2], 1.0f);
    }

    public float getSaturation() {
        return this.hsl[1];
    }

    public Color setHue(float f) {
        return hslToColour(f, this.hsl[1], this.hsl[2], this.alpha);
    }

    private static float colourCalc(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        if (6.0f * f3 < 1.0f) {
            float f4 = f;
            return f4 + (f2 - f4) * 6.0f * f3;
        }
        if (2.0f * f3 < 1.0f) {
            return f2;
        }
        if (3.0f * f3 < 2.0f) {
            float f5 = f;
            return f5 + (f2 - f5) * 6.0f * (0.6666667f - f3);
        }
        return f;
    }

    public float getLightness() {
        return this.hsl[2];
    }

    public static Color hslToColour(float f, float f2, float f3, float f4) {
        if (f2 < 0.0f || f2 > 100.0f) {
            String string = "Color parameter outside of expected range - Saturation";
            throw new IllegalArgumentException(string);
        }
        if (f3 < 0.0f || f3 > 100.0f) {
            String string = "Color parameter outside of expected range - Lightness";
            throw new IllegalArgumentException(string);
        }
        if (f4 < 0.0f || f4 > 1.0f) {
            String string = "Color parameter outside of expected range - Alpha";
            throw new IllegalArgumentException(string);
        }
        f %= 360.0f;
        float f5 = 0.0f;
        f5 = (double)f3 < 0.5 ? f3 * (1.0f + f2) : (f3 /= 100.0f) + (f2 /= 100.0f) - f2 * f3;
        f2 = 2.0f * f3 - f5;
        f3 = Math.max(0.0f, colourCalc(f2, f5, (f /= 360.0f) + 0.33333334f));
        float f6 = Math.max(0.0f, colourCalc(f2, f5, f));
        f2 = Math.max(0.0f, colourCalc(f2, f5, f - 0.33333334f));
        f3 = Math.min(f3, 1.0f);
        f6 = Math.min(f6, 1.0f);
        f2 = Math.min(f2, 1.0f);
        return new Color(f3, f6, f2, f4);
    }

    public Color decreaseLightness(float f) {
        f = (100.0f - f) / 100.0f;
        f = Math.max(0.0f, this.hsl[2] * f);
        return hslToColour(this.hsl[0], this.hsl[1], f, this.alpha);
    }

    public Color increaseLightness(float f) {
        f = (100.0f + f) / 100.0f;
        f = Math.min(100.0f, this.hsl[2] * f);
        return hslToColour(this.hsl[0], this.hsl[1], f, this.alpha);
    }

    public float f$B() {
        return this.alpha;
    }

    public Color getColour() {
        return this.colour;
    }
}
/*
package net.futureclient.client;

import java.awt.Color;

public class vH {
    private float f$d;
    private Color f$M;
    private float[] f$g;

    public vH(float[] fArray, float f) {
        vH vH2 = 0;
        0.f$g = fArray;
        vH2.f$d = f;
        vH2.f$M = vH.f$E(fArray[0], fArray[1], fArray[2], f);
    }

    public static float[] f$E(Color color) {
        float f;
        float[] fArray = color.getRGBColorComponents(null);
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        float f5 = Math.min(f2, Math.min(f3, f4));
        float f6 = Math.max(f2, Math.max(f3, f4));
        float f7 = 0.0f;
        if (f6 == f5) {
            f7 = 0.0f;
            f = f6;
        } else if (f6 == f2) {
            f7 = (60.0f * (f3 - f4) / (f6 - f5) + 360.0f) % 360.0f;
            f = f6;
        } else if (f6 == f3) {
            f7 = 60.0f * (f4 - f2) / (f6 - f5) + 120.0f;
            f = f6;
        } else {
            if (f6 == f4) {
                f7 = 60.0f * (f2 - f3) / (f6 - f5) + 240.0f;
            }
            f = f6;
        }
        f2 = (f + f5) / 2.0f;
        f3 = 0.0f;
        if (f6 == f5) {
            f3 = 0.0f;
        } else {
            float f8 = f6;
            f3 = f2 <= 0.5f ? (f8 - f5) / (f6 + f5) : (f8 - f5) / (2.0f - f6 - f5);
        }
        return new float[]{f7, f3 * 100.0f, f2 * 100.0f};
    }

    public Color f$B(float f) {
        return vH.f$E(0.f$g[0], 0.f$g[1], f, 0.f$d);
    }

    public float[] f$E() {
        vH vH2;
        return vH2.f$g;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 4 << 3 ^ 5;
        int n4 = n2;
        int n5 = 4 << 3;
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

    public String toString() {
        vH vH2;
        return new StringBuilder().insert(0, "HSLColor[h=").append(vH2.f$g[0]).append(",s=").append(vH2.f$g[1]).append(",l=").append(vH2.f$g[2]).append(",alpha=").append(vH2.f$d).append("]").toString();
    }

    public static Color f$E(float[] fArray) {
        return vH.f$E(fArray[0], fArray[1], fArray[2], 1.0f);
    }

    public Color f$e(float f) {
        return vH.f$E(0.f$g[0], f, 0.f$g[2], 0.f$d);
    }

    public float f$e() {
        vH vH2;
        return vH2.f$g[0];
    }

    public Color f$a() {
        vH vH2;
        return vH.f$E((vH2.f$g[0] + 180.0f) % 360.0f, vH2.f$g[1], vH2.f$g[2], 1.0f);
    }

    public vH(float f, float f2, float f3, float f4) {
        vH vH2 = 0;
        0.f$g = new float[]{f, f2, f3};
        vH2.f$d = f4;
        vH2.f$M = vH.f$E(0.f$g[0], 0.f$g[1], 0.f$g[2], f4);
    }

    public vH(Color color) {
        vH vH2 = 0;
        0.f$M = color;
        vH2.f$g = vH.f$E(0.f$M);
        vH2.f$d = (float)color.getAlpha() / 255.0f;
    }

    public float f$E() {
        vH vH2;
        return vH2.f$g[1];
    }

    public Color f$K(float f) {
        return vH.f$E(f, 0.f$g[1], 0.f$g[2], 0.f$d);
    }

    private static float f$E(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        if (6.0f * f3 < 1.0f) {
            float f4 = f;
            return f4 + (f2 - f4) * 6.0f * f3;
        }
        if (2.0f * f3 < 1.0f) {
            return f2;
        }
        if (3.0f * f3 < 2.0f) {
            float f5 = f;
            return f5 + (f2 - f5) * 6.0f * (0.6666667f - f3);
        }
        return f;
    }

    public float f$a() {
        vH vH2;
        return vH2.f$g[2];
    }

    public vH(float[] fArray) {
        0(fArray, 1.0f);
    }

    public vH(float f, float f2, float f3) {
        0(f, f2, f3, 1.0f);
    }

    public static Color f$E(float f, float f2, float f3, float f4) {
        if (f2 < 0.0f || f2 > 100.0f) {
            String string = "Color parameter outside of expected range - Saturation";
            throw new IllegalArgumentException(string);
        }
        if (f3 < 0.0f || f3 > 100.0f) {
            String string = "Color parameter outside of expected range - Lightness";
            throw new IllegalArgumentException(string);
        }
        if (f4 < 0.0f || f4 > 1.0f) {
            String string = "Color parameter outside of expected range - Alpha";
            throw new IllegalArgumentException(string);
        }
        f %= 360.0f;
        float f5 = 0.0f;
        f5 = (double)f3 < 0.5 ? f3 * (1.0f + f2) : (f3 /= 100.0f) + (f2 /= 100.0f) - f2 * f3;
        f2 = 2.0f * f3 - f5;
        f3 = Math.max(0.0f, vH.f$E(f2, f5, (f /= 360.0f) + 0.33333334f));
        float f6 = Math.max(0.0f, vH.f$E(f2, f5, f));
        f2 = Math.max(0.0f, vH.f$E(f2, f5, f - 0.33333334f));
        f3 = Math.min(f3, 1.0f);
        f6 = Math.min(f6, 1.0f);
        f2 = Math.min(f2, 1.0f);
        return new Color(f3, f6, f2, f4);
    }

    public Color f$a(float f) {
        f = (100.0f - f) / 100.0f;
        f = Math.max(0.0f, 0.f$g[2] * f);
        return vH.f$E(0.f$g[0], 0.f$g[1], f, 0.f$d);
    }

    public Color f$E(float f) {
        f = (100.0f + f) / 100.0f;
        f = Math.min(100.0f, 0.f$g[2] * f);
        return vH.f$E(0.f$g[0], 0.f$g[1], f, 0.f$d);
    }

    public float f$B() {
        vH vH2;
        return vH2.f$d;
    }

    public Color f$E() {
        vH vH2;
        return vH2.f$M;
    }
}
 */