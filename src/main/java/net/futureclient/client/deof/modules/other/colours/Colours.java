package net.futureclient.client.deof.modules.other.colours;

import net.futureclient.client.deof.modules.ModuleBase;
import net.futureclient.client.deof.settings.NumberSetting;
import net.futureclient.client.deof.settings.SettingsBase;
import net.futureclient.client.deof.utils.render.ColourUtils;

import java.awt.*;

public class Colours extends ModuleBase {
    public boolean f$A;
    public NumberSetting f$g;
    public float f$B;
    public NumberSetting f$i;
    public NumberSetting f$I;
    public NumberSetting f$b;
    public NumberSetting f$j;
    public NumberSetting f$d;
    public NumberSetting f$K;
    public NumberSetting f$M;
    public Color f$a;
    public NumberSetting f$e;
    public SettingsBase<Boolean> f$C;

    public Colours() {
        super("Colors", "Colors", "Color");
        this.f$a = new ColourUtils(0.0f, 100.0f, 50.0f, 0.0f).getColour();
        this.f$C = new SettingsBase<>(false, "HUD Rainbow", "HUDRainbow", "Rainbow", "Cycle");
        this.f$e = new NumberSetting(0.0f, 0.0f, 360.0f, 1, "Hue", "RGB", "HSL");
        this.f$I = new NumberSetting(90.0f, 0.0f, 100.0f, 0.1, "Saturation", "RainbowSaturation");
        this.f$K = new NumberSetting(45.0f, 0.0f, 100.0f, 0.1,    "Lightness", "Light", "Luminance", "Luminace", "Brightness", "Bright", "Brigtness", "Brigntrnew", "Brighgrtnewss");
        this.f$b = new NumberSetting(1.0f, 0.0f, 5.0f, 0.1, "RainbowSpeed", "RainbowHueSpeed", "RainbowSped", "RrainbowSpeed");
        this.f$j = new NumberSetting(4.0f, 0.0f, 10.0f, 0.1, "RainbowHue", "RainbowHueSpeed2", "RainbowSped2", "RrainbowSpeed2");
        this.f$i = new NumberSetting(1.0f, 0.0f, 5.0f, 0.1, "GearShadeSpeed", "GearSpeed");
        this.f$M = new NumberSetting(34.0f, 0.0f, 100.0f, 0.1, "GearIdleShade", "GearIdleShading", "GearShade");
        this.f$g = new NumberSetting(0.0f, 0.0f, 100.0f, 0.1, "GearMinShade", "GearMinimumShading", "GearMin", "GearMinimumShade", "GearMinimum");
        this.f$d = new NumberSetting(40.0f, 0.0f, 100.0f, 0.1, "GearMaxShade", "GearMaximumShading", "GearMax", "GearMaximumShade", "GearMaximum");
        this.addSettings(this.f$e, this.f$I, this.f$K, this.f$C, this.f$b, this.f$j, this.f$i, this.f$M, this.f$g, this.f$d);
    }
}
/*
package net.futureclient.client;

import java.awt.Color;
import net.futureclient.client.ma;
import net.futureclient.client.s;
import net.futureclient.client.vH;
import net.futureclient.client.z;

public class wD
extends ma {
    public boolean f$A;
    public s f$g;
    public float f$B;
    public s f$i;
    public s f$I;
    public s f$b;
    public s f$j;
    public s f$d;
    public s f$K;
    public s f$M;
    public Color f$a;
    public s f$e;
    public z<Boolean> f$C;

    public wD() {
        wD wD2;
        String[] stringArray = new String[2];
        stringArray[0] = "Colors";
        stringArray[1] = "Color";
        super("Colors", stringArray);
        wD wD3 = wD2;
        wD3.f$a = new vH(0.0f, 100.0f, 50.0f, 0.0f).f$E();
        String[] stringArray2 = new String[4];
        stringArray2[0] = "HUD Rainbow";
        stringArray2[1] = "HUDRainbow";
        stringArray2[2] = "Rainbow";
        stringArray2[3] = "Cycle";
        wD3.f$C = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Hue";
        stringArray3[1] = "RGB";
        stringArray3[2] = "HSL";
        wD2.f$e = new s((Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(360.0f), 1, stringArray3);
        String[] stringArray4 = new String[2];
        stringArray4[0] = "Saturation";
        stringArray4[1] = "RainbowSaturation";
        wD2.f$I = new s((Number)Float.valueOf(90.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), 0.1, stringArray4);
        String[] stringArray5 = new String[9];
        stringArray5[0] = "Lightness";
        stringArray5[1] = "Light";
        stringArray5[2] = "Luminance";
        stringArray5[3] = "Luminace";
        stringArray5[4] = "Brightness";
        stringArray5[5] = "Bright";
        stringArray5[6] = "Brigtness";
        stringArray5[7] = "Brigntrnew";
        stringArray5[8] = "Brighgrtnewss";
        wD2.f$K = new s((Number)Float.valueOf(45.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), 0.1, stringArray5);
        String[] stringArray6 = new String[4];
        stringArray6[0] = "RainbowSpeed";
        stringArray6[1] = "RainbowHueSpeed";
        stringArray6[2] = "RainbowSped";
        stringArray6[3] = "RrainbowSpeed";
        wD2.f$b = new s((Number)Float.valueOf(1.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(5.0f), 0.1, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "RainbowHue";
        stringArray7[1] = "RainbowHueSpeed2";
        stringArray7[2] = "RainbowSped2";
        stringArray7[3] = "RrainbowSpeed2";
        wD2.f$j = new s((Number)Float.valueOf(4.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(10.0f), 0.1, stringArray7);
        String[] stringArray8 = new String[2];
        stringArray8[0] = "GearShadeSpeed";
        stringArray8[1] = "GearSpeed";
        wD2.f$i = new s((Number)Float.valueOf(1.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(5.0f), 0.1, stringArray8);
        String[] stringArray9 = new String[3];
        stringArray9[0] = "GearIdleShade";
        stringArray9[1] = "GearIdleShading";
        stringArray9[2] = "GearShade";
        wD2.f$M = new s((Number)Float.valueOf(34.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), 0.1, stringArray9);
        String[] stringArray10 = new String[5];
        stringArray10[0] = "GearMinShade";
        stringArray10[1] = "GearMinimumShading";
        stringArray10[2] = "GearMin";
        stringArray10[3] = "GearMinimumShade";
        stringArray10[4] = "GearMinimum";
        wD2.f$g = new s((Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), 0.1, stringArray10);
        String[] stringArray11 = new String[5];
        stringArray11[0] = "GearMaxShade";
        stringArray11[1] = "GearMaximumShading";
        stringArray11[2] = "GearMax";
        stringArray11[3] = "GearMaximumShade";
        stringArray11[4] = "GearMaximum";
        wD2.f$d = new s((Number)Float.valueOf(40.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), 0.1, stringArray11);
        wD2.f$E(wD2.f$e, wD2.f$I, wD2.f$K, wD2.f$C, wD2.f$b, wD2.f$j, wD2.f$i, wD2.f$M, wD2.f$g, wD2.f$d);
    }
}
 */