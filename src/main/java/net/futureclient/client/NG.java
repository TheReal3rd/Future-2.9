package net.futureclient.client;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.StringJoiner;
import net.futureclient.client.GA;
import net.futureclient.client.fG;
import net.futureclient.client.gF;
import net.futureclient.client.kH;

public class NG
extends GA {
    @Override
    public String f$E() {
        return "&e[font|style|size|list]";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String f$E(String[] 0) {
        block45: {
            var2_2 = (gF)kH.f$E().f$E().f$E(gF.class);
            if (var2_2 == null) {
                return null;
            }
            var3_3 = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
            if (0.length < 1) break block45;
            var4_4 = 0[0].toLowerCase();
            var5_5 = -1;
            switch (var4_4.hashCode()) lbl-1000:
            // 2 sources

            {
                case 3322014: {
                    if (false) ** GOTO lbl-1000
                    if (var4_4.equals("list")) {
                        v0 = var5_5 = 0;
                        break;
                    }
                    ** GOTO lbl26
                }
                case 109780401: {
                    if (var4_4.equals("style")) {
                        v0 = var5_5 = 1;
                        break;
                    }
                    ** GOTO lbl26
                }
                case 3530753: {
                    if (var4_4.equals("size")) {
                        var5_5 = 2;
                    }
                }
lbl26:
                // 6 sources

                default: {
                    v0 = var5_5;
                }
            }
            switch (v0) {
                case 0: {
                    var6_7 = new StringJoiner(", ");
                    var7_10 = var3_3;
                    var8_14 = var3_3.length;
                    v1 = var9_18 = 0;
                    while (v1 < var8_14) {
                        var10_23 = var7_10[var9_18];
                        var6_7.add(var10_23);
                        v1 = ++var9_18;
                    }
                    return String.format("Fonts (%s): %s.", new Object[]{var3_3.length, var6_7.toString()});
                }
                case 1: {
                    while (false) {
                    }
                    if (0.length != 2) {
                        return "No font style entered. Possible options: PLAIN, BOLD, ITALIC, or BOLD+ITALIC.";
                    }
                    var9_19 = var7_11 = 0[1].toUpperCase();
                    var10_24 = -1;
                    switch (var9_19.hashCode()) {
                        case 76210602: {
                            if (var9_19.equals("PLAIN")) {
                                v2 = var10_24 = 0;
                                break;
                            }
                            ** GOTO lbl75
                        }
                        case 2044549: {
                            if (var9_19.equals("BOLD")) {
                                v2 = var10_24 = 1;
                                break;
                            }
                            ** GOTO lbl75
                        }
lbl64:
                        // 2 sources

                        case -2125451728: {
                            if (false) ** GOTO lbl64
                            if (var9_19.equals("ITALIC")) {
                                v2 = var10_24 = 2;
                                break;
                            }
                            ** GOTO lbl75
                        }
                        case -977469450: {
                            if (var9_19.equals("BOLD+ITALIC")) {
                                var10_24 = 3;
                            }
                        }
lbl75:
                        // 7 sources

                        default: {
                            v2 = var10_24;
                        }
                    }
                    switch (v2) lbl-1000:
                    // 2 sources

                    {
                        case 0: {
                            if (false) ** GOTO lbl-1000
                            var8_15 = 0;
                            v3 = var2_2;
                            break;
                        }
                        case 1: {
                            var8_15 = 1;
                            v3 = var2_2;
                            break;
                        }
                        case 2: {
                            var8_15 = 2;
                            v3 = var2_2;
                            break;
                        }
                        case 3: {
                            var8_15 = 3;
                            v3 = var2_2;
                            break;
                        }
                        default: {
                            return "Invalid font style entered. Possible options: PLAIN, BOLD, ITALIC, or BOLD+ITALIC.";
                        }
                    }
                    v3.f$L = new fG(new Font(var2_2.f$L.f$E().getName(), var8_15, var2_2.f$L.f$E().getSize()), true, true);
                    return String.format("Font style been set to %s.", new Object[]{var7_11});
                }
                case 2: {
                    if (0.length != 2) {
                        return "No font size entered.";
                    }
                    var9_20 = 0[1];
                    try {
                        var10_25 = Integer.parseInt(var9_20);
                    }
                    catch (NumberFormatException var11_27) {
                        return String.format("Invalid font size entered, input must be a number: %s.", new Object[]{var11_27.getMessage()});
                    }
                    if (var10_25 < 5 || var10_25 > 30) {
                        v4 = new Object[2];
                        v4[0] = var10_25 < 5 ? "smaller" : "larger";
                        v4[1] = var10_25 < 5 ? 5 : 30;
                        return String.format("Font size cannot be %s than %s.", v4);
                    }
                    var2_2.f$L = new fG(new Font(var2_2.f$L.f$E().getName(), var2_2.f$L.f$E().getStyle(), var10_25), true, true);
                    return String.format("Font size has been set to %s.", new Object[]{var10_25});
                }
            }
            var4_4 = new StringBuilder();
            var5_6 = 0;
            var6_8 = 0.length;
            v5 = var7_12 = 0;
            while (v5 < var6_8) {
                var8_16 = var5_6[var7_12];
                var4_4.append(var8_16);
                var4_4.append(" ");
                v5 = ++var7_12;
            }
            var5_6 = 0.length == 1 ? 0[0].toLowerCase() : var4_4.toString().trim().toLowerCase();
            var6_9 /* !! */  = var3_3;
            var7_12 = var3_3.length;
            v6 = var8_17 = 0;
            while (v6 < var7_12) {
                var9_21 = var6_9 /* !! */ [var8_17];
                if (var9_21.toLowerCase().equals(var5_6)) {
                    v7 = var2_2;
                    v7.f$L = new fG(new Font(var9_21, var2_2.f$L.f$E().getStyle(), var2_2.f$L.f$E().getSize()), true, true);
                    return String.format("Font has been set to %s.", new Object[]{var9_21});
                }
                v6 = ++var8_17;
            }
            var6_9 /* !! */  = var5_6.replaceAll(" |_|-|'", "").toLowerCase();
            var7_13 = var3_3;
            var8_17 = var3_3.length;
            v8 = var9_22 = 0;
            while (v8 < var8_17) {
                var10_26 = var7_13[var9_22];
                var11_28 = var10_26.replaceAll(" |_|-|'", "").toLowerCase();
                if (var11_28.contains((CharSequence)var6_9 /* !! */ )) {
                    var2_2.f$L = new fG(new Font(var10_26, var2_2.f$L.f$E().getStyle(), var2_2.f$L.f$E().getSize()), true, true);
                    return String.format("Font has been set to %s.", new Object[]{var10_26});
                }
                v8 = ++var9_22;
            }
            return "That font doesn't exist.";
        }
        return null;
    }

    public NG() {
        NG nG;
        String[] stringArray = new String[6];
        stringArray[0] = "Font";
        stringArray[1] = "SetFont";
        stringArray[2] = "CustomFont";
        stringArray[3] = "SetCustomFont";
        stringArray[4] = "Fond";
        stringArray[5] = "SetFond";
        super(stringArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.HG;
import net.futureclient.client.S;

public class nG
implements S {
    private byte f$d;
    private HG f$g;

    public nG(HG hG, byte by) {
        nG nG2 = 0;
        nG2.f$g = hG;
        nG2.f$d = by;
    }

    public HG f$E() {
        nG nG2;
        return nG2.f$g;
    }

    public byte f$E() {
        nG nG2;
        return nG2.f$d;
    }

    public boolean equals(Object object) {
        if (object instanceof nG) {
            nG nG2 = (nG)object;
            return nG2.f$E() == 0.f$E() && nG2.f$E() == 0.f$E();
        }
        return super.equals(object);
    }
}
