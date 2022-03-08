package net.futureclient.client.deof.modules.other.hud;

import net.minecraft.client.gui.GuiChat;
import org.lwjgl.opengl.Display;

import java.util.TimerTask;

public class AE_TimeTask extends TimerTask {
    public final Hud f$d;

    @Override
    public void run() {
        if (f$d.getMinecraft().world != null && Display.isCreated() && Display.isVisible()) {
            wD wD2;
            Object object;
            pd pd2;
            AE aE;
            if (aE.f$d.f$i) {
                if (gF.f$P().currentScreen instanceof GuiChat && gF.f$C(aE.f$d) < 14 + (aE.f$d.f$c.f$E() != false ? aE.f$d.f$L.f$E() : gF.f$Q().fontRenderer.FONT_HEIGHT)) {
                    gF.f$H(aE.f$d);
                }
                if (!(gF.f$U().currentScreen instanceof GuiChat) && gF.f$C(aE.f$d) > (aE.f$d.f$c.f$E() != false ? aE.f$d.f$L.f$E() : gF.f$J().fontRenderer.FONT_HEIGHT)) {
                    gF.f$h(aE.f$d);
                }
                if (gF.f$d().currentScreen instanceof GuiChat && aE.f$d.f$j < 14) {
                    ++aE.f$d.f$j;
                }
                if (!(gF.f$l().currentScreen instanceof GuiChat) && aE.f$d.f$j > 0) {
                    --aE.f$d.f$j;
                }
            }
            if (gF.f$k().player != null && kH.f$E().f$E().f$E() && gF.f$A(aE.f$d) < 2) {
                gF.f$K(aE.f$d);
            }
            if (gF.f$b().player != null && !kH.f$E().f$E().f$E() && gF.f$A(aE.f$d) > -(aE.f$d.f$c.f$E() != false ? aE.f$d.f$L.f$E() : gF.f$F().fontRenderer.FONT_HEIGHT) - 2) {
                gF.f$B(aE.f$d);
            }
            if ((pd2 = (pd)kH.f$E().f$E().f$E(pd.class)) != null && pd2.f$E() && pd2.f$g != null) {
                pd pd3 = pd2;
                if (pd2.f$g.f$g > 0) {
                    --pd3.f$g.f$g;
                } else if (pd3.f$g.f$g < 0) {
                    ++pd2.f$g.f$g;
                }
            }
            try {
                Collection collection;
                if (gF.f$G().player != null && ((Mg)((Object)aE.f$d.f$D.f$E())).equals((Object)Mg.f$g) && !(collection = gF.f$D().player.func_70651_bq()).isEmpty()) {
                    object = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    collection.forEach(potionEffect -> {
                        if (potionEffect.getPotion().isBeneficial()) {
                            arrayList.add(potionEffect.getPotion());
                            return;
                        }
                        object.add(potionEffect.getPotion());
                    });
                    if (!object.isEmpty()) {
                        if (gF.f$e(aE.f$d) < 50) {
                            gF.f$a(aE.f$d);
                        }
                        return;
                    }
                    if (!arrayList.isEmpty()) {
                        if (gF.f$e(aE.f$d) < 24) {
                            gF.f$a(aE.f$d);
                            return;
                        }
                        if (gF.f$e(aE.f$d) > 24) {
                            gF.f$E(aE.f$d);
                        }
                        return;
                    }
                }
                for (int i = 0; i < 2; ++i) {
                    if (gF.f$e(aE.f$d) <= 0) continue;
                    gF.f$E(aE.f$d);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if ((wD2 = (wD)kH.f$E().f$E().f$E(wD.class)) == null) {
                return;
            }
            Object object2 = object = new vH(wD2.f$e.f$E().floatValue(), wD2.f$I.f$E().floatValue(), wD2.f$K.f$E().floatValue(), 1.0f);
            Color color = wD2.f$a = wD2.f$C.f$E() != false ? ((vH)object2).f$K(gF.f$E(aE.f$d)) : ((vH)object2).f$E();
            if (wD2.f$C.f$E().booleanValue() || ((yD)((Object)gF.f$a(aE.f$d).f$E())).equals((Object)yD.f$M)) {
                AE aE2 = aE;
                gF.f$E(aE2.f$d, gF.f$E(aE2.f$d) + wD2.f$b.f$E().floatValue());
                if (gF.f$E(aE2.f$d) > 360.0f) {
                    AE aE3 = aE;
                    gF.f$E(aE3.f$d, gF.f$E(aE3.f$d) - 360.0f);
                }
            }
            if (gF.f$g().currentScreen instanceof WB) {
                wD wD3;
                wD wD4;
                wD wD5 = wD2;
                if (wD5.f$B >= wD5.f$d.f$E().floatValue()) {
                    wD2.f$A = true;
                    wD4 = wD2;
                } else {
                    if (wD2.f$B <= wD2.f$g.f$E().floatValue()) {
                        wD2.f$A = false;
                    }
                    wD4 = wD2;
                }
                wD wD6 = wD2;
                if (wD4.f$A) {
                    wD6.f$B -= wD2.f$i.f$E().floatValue();
                    wD3 = wD2;
                } else {
                    wD6.f$B += wD2.f$i.f$E().floatValue();
                    wD3 = wD2;
                }
                if (wD3.f$B < wD2.f$g.f$E().floatValue()) {
                    wD2.f$B = wD2.f$g.f$E().floatValue();
                } else if (wD2.f$B > wD2.f$d.f$E().floatValue()) {
                    wD2.f$B = wD2.f$d.f$E().floatValue();
                }
                WB.f$E().f$E().forEach(qC2 -> {
                    qC qC3;
                    block4: {
                        block3: {
                            block2: {
                                if (!qC2.f$E()) break block2;
                                if (qC2.f$a >= 180) break block3;
                                qC qC4 = qC2;
                                qC3 = qC4;
                                qC4.f$a += 5;
                                break block4;
                            }
                            if (qC2.f$a > 0) {
                                qC2.f$a -= 5;
                            }
                        }
                        qC3 = qC2;
                    }
                    if (!qC3.f$E()) {
                        return;
                    }
                    qC2.f$E().forEach(wa2 -> {
                        block9: {
                            lb lb2;
                            vH vH2;
                            lb lb3;
                            block12: {
                                block11: {
                                    block10: {
                                        if (!(wa2 instanceof lb)) break block9;
                                        lb3 = (lb)wa2;
                                        vH2 = new vH(0.0f, 0.0f, 100.0f, 1.0f);
                                        if (lb3.f$K) {
                                            lb lb4 = lb3;
                                            lb4.f$j = (int)((float)lb4.f$j + 1.0f);
                                            if (lb4.f$g > wD2.f$B) {
                                                lb lb5 = lb3;
                                                lb5.f$g -= wD2.f$i.f$E().floatValue();
                                                if (lb5.f$g < wD2.f$g.f$E().floatValue()) {
                                                    lb3.f$g = wD2.f$g.f$E().floatValue();
                                                }
                                                lb3.f$d = vH2.f$a(lb3.f$g);
                                                return;
                                            }
                                            if (lb3.f$g < wD2.f$B) {
                                                lb lb6 = lb3;
                                                lb6.f$g += wD2.f$i.f$E().floatValue();
                                                if (lb6.f$g > wD2.f$d.f$E().floatValue()) {
                                                    lb3.f$g = wD2.f$d.f$E().floatValue();
                                                }
                                                lb3.f$d = vH2.f$a(lb3.f$g);
                                                return;
                                            }
                                            if (lb3.f$g >= wD2.f$B - 0.5f && lb3.f$g <= wD2.f$B + 0.5f) {
                                                lb3.f$d = vH2.f$a(wD2.f$B);
                                            }
                                            return;
                                        }
                                        if (!(lb3.f$g < wD2.f$M.f$E().floatValue())) break block10;
                                        lb lb7 = lb3;
                                        lb7.f$g += wD2.f$i.f$E().floatValue();
                                        if (!(lb7.f$g > wD2.f$M.f$E().floatValue())) break block11;
                                        lb2 = lb3;
                                        lb3.f$g = wD2.f$M.f$E().floatValue();
                                        break block12;
                                    }
                                    if (lb3.f$g > wD2.f$M.f$E().floatValue()) {
                                        lb lb8 = lb3;
                                        lb8.f$g -= wD2.f$i.f$E().floatValue();
                                        if (lb8.f$g < wD2.f$M.f$E().floatValue()) {
                                            lb3.f$g = wD2.f$M.f$E().floatValue();
                                        }
                                    }
                                }
                                lb2 = lb3;
                            }
                            if (lb2.f$g >= wD2.f$M.f$E().floatValue() - 0.5f && lb3.f$g <= wD2.f$M.f$E().floatValue() + 0.5f) {
                                lb3.f$g = wD2.f$M.f$E().floatValue();
                            }
                            lb3.f$d = vH2.f$a(lb3.f$g);
                        }
                    });
                });
            }
        }
    }

    public AE_TimeTask(Hud gF2) {
        this.f$d = gF2;
    }
}
/*
package net.futureclient.client;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TimerTask;
import net.futureclient.client.Mg;
import net.futureclient.client.WB;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.lb;
import net.futureclient.client.pd;
import net.futureclient.client.qC;
import net.futureclient.client.vH;
import net.futureclient.client.wD;
import net.futureclient.client.yD;
import net.minecraft.client.gui.GuiChat;
import org.lwjgl.opengl.Display;

public class AE extends TimerTask {
    public final gF f$d;

    @Override
    public void run() {
        if (gF.f$t().world != null && Display.isCreated() && Display.isVisible()) {
            wD wD2;
            Object object;
            pd pd2;
            AE aE;
            if (aE.f$d.f$i) {
                if (gF.f$P().currentScreen instanceof GuiChat && gF.f$C(aE.f$d) < 14 + (aE.f$d.f$c.f$E() != false ? aE.f$d.f$L.f$E() : gF.f$Q().fontRenderer.FONT_HEIGHT)) {
                    gF.f$H(aE.f$d);
                }
                if (!(gF.f$U().currentScreen instanceof GuiChat) && gF.f$C(aE.f$d) > (aE.f$d.f$c.f$E() != false ? aE.f$d.f$L.f$E() : gF.f$J().fontRenderer.FONT_HEIGHT)) {
                    gF.f$h(aE.f$d);
                }
                if (gF.f$d().currentScreen instanceof GuiChat && aE.f$d.f$j < 14) {
                    ++aE.f$d.f$j;
                }
                if (!(gF.f$l().currentScreen instanceof GuiChat) && aE.f$d.f$j > 0) {
                    --aE.f$d.f$j;
                }
            }
            if (gF.f$k().player != null && kH.f$E().f$E().f$E() && gF.f$A(aE.f$d) < 2) {
                gF.f$K(aE.f$d);
            }
            if (gF.f$b().player != null && !kH.f$E().f$E().f$E() && gF.f$A(aE.f$d) > -(aE.f$d.f$c.f$E() != false ? aE.f$d.f$L.f$E() : gF.f$F().fontRenderer.FONT_HEIGHT) - 2) {
                gF.f$B(aE.f$d);
            }
            if ((pd2 = (pd)kH.f$E().f$E().f$E(pd.class)) != null && pd2.f$E() && pd2.f$g != null) {
                pd pd3 = pd2;
                if (pd2.f$g.f$g > 0) {
                    --pd3.f$g.f$g;
                } else if (pd3.f$g.f$g < 0) {
                    ++pd2.f$g.f$g;
                }
            }
            try {
                Collection collection;
                if (gF.f$G().player != null && ((Mg)((Object)aE.f$d.f$D.f$E())).equals((Object)Mg.f$g) && !(collection = gF.f$D().player.func_70651_bq()).isEmpty()) {
                    object = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    collection.forEach(potionEffect -> {
                        if (potionEffect.getPotion().isBeneficial()) {
                            arrayList.add(potionEffect.getPotion());
                            return;
                        }
                        object.add(potionEffect.getPotion());
                    });
                    if (!object.isEmpty()) {
                        if (gF.f$e(aE.f$d) < 50) {
                            gF.f$a(aE.f$d);
                        }
                        return;
                    }
                    if (!arrayList.isEmpty()) {
                        if (gF.f$e(aE.f$d) < 24) {
                            gF.f$a(aE.f$d);
                            return;
                        }
                        if (gF.f$e(aE.f$d) > 24) {
                            gF.f$E(aE.f$d);
                        }
                        return;
                    }
                }
                for (int i = 0; i < 2; ++i) {
                    if (gF.f$e(aE.f$d) <= 0) continue;
                    gF.f$E(aE.f$d);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if ((wD2 = (wD)kH.f$E().f$E().f$E(wD.class)) == null) {
                return;
            }
            Object object2 = object = new vH(wD2.f$e.f$E().floatValue(), wD2.f$I.f$E().floatValue(), wD2.f$K.f$E().floatValue(), 1.0f);
            Color color = wD2.f$a = wD2.f$C.f$E() != false ? ((vH)object2).f$K(gF.f$E(aE.f$d)) : ((vH)object2).f$E();
            if (wD2.f$C.f$E().booleanValue() || ((yD)((Object)gF.f$a(aE.f$d).f$E())).equals((Object)yD.f$M)) {
                AE aE2 = aE;
                gF.f$E(aE2.f$d, gF.f$E(aE2.f$d) + wD2.f$b.f$E().floatValue());
                if (gF.f$E(aE2.f$d) > 360.0f) {
                    AE aE3 = aE;
                    gF.f$E(aE3.f$d, gF.f$E(aE3.f$d) - 360.0f);
                }
            }
            if (gF.f$g().currentScreen instanceof WB) {
                wD wD3;
                wD wD4;
                wD wD5 = wD2;
                if (wD5.f$B >= wD5.f$d.f$E().floatValue()) {
                    wD2.f$A = true;
                    wD4 = wD2;
                } else {
                    if (wD2.f$B <= wD2.f$g.f$E().floatValue()) {
                        wD2.f$A = false;
                    }
                    wD4 = wD2;
                }
                wD wD6 = wD2;
                if (wD4.f$A) {
                    wD6.f$B -= wD2.f$i.f$E().floatValue();
                    wD3 = wD2;
                } else {
                    wD6.f$B += wD2.f$i.f$E().floatValue();
                    wD3 = wD2;
                }
                if (wD3.f$B < wD2.f$g.f$E().floatValue()) {
                    wD2.f$B = wD2.f$g.f$E().floatValue();
                } else if (wD2.f$B > wD2.f$d.f$E().floatValue()) {
                    wD2.f$B = wD2.f$d.f$E().floatValue();
                }
                WB.f$E().f$E().forEach(qC2 -> {
                    qC qC3;
                    block4: {
                        block3: {
                            block2: {
                                if (!qC2.f$E()) break block2;
                                if (qC2.f$a >= 180) break block3;
                                qC qC4 = qC2;
                                qC3 = qC4;
                                qC4.f$a += 5;
                                break block4;
                            }
                            if (qC2.f$a > 0) {
                                qC2.f$a -= 5;
                            }
                        }
                        qC3 = qC2;
                    }
                    if (!qC3.f$E()) {
                        return;
                    }
                    qC2.f$E().forEach(wa2 -> {
                        block9: {
                            lb lb2;
                            vH vH2;
                            lb lb3;
                            block12: {
                                block11: {
                                    block10: {
                                        if (!(wa2 instanceof lb)) break block9;
                                        lb3 = (lb)wa2;
                                        vH2 = new vH(0.0f, 0.0f, 100.0f, 1.0f);
                                        if (lb3.f$K) {
                                            lb lb4 = lb3;
                                            lb4.f$j = (int)((float)lb4.f$j + 1.0f);
                                            if (lb4.f$g > wD2.f$B) {
                                                lb lb5 = lb3;
                                                lb5.f$g -= wD2.f$i.f$E().floatValue();
                                                if (lb5.f$g < wD2.f$g.f$E().floatValue()) {
                                                    lb3.f$g = wD2.f$g.f$E().floatValue();
                                                }
                                                lb3.f$d = vH2.f$a(lb3.f$g);
                                                return;
                                            }
                                            if (lb3.f$g < wD2.f$B) {
                                                lb lb6 = lb3;
                                                lb6.f$g += wD2.f$i.f$E().floatValue();
                                                if (lb6.f$g > wD2.f$d.f$E().floatValue()) {
                                                    lb3.f$g = wD2.f$d.f$E().floatValue();
                                                }
                                                lb3.f$d = vH2.f$a(lb3.f$g);
                                                return;
                                            }
                                            if (lb3.f$g >= wD2.f$B - 0.5f && lb3.f$g <= wD2.f$B + 0.5f) {
                                                lb3.f$d = vH2.f$a(wD2.f$B);
                                            }
                                            return;
                                        }
                                        if (!(lb3.f$g < wD2.f$M.f$E().floatValue())) break block10;
                                        lb lb7 = lb3;
                                        lb7.f$g += wD2.f$i.f$E().floatValue();
                                        if (!(lb7.f$g > wD2.f$M.f$E().floatValue())) break block11;
                                        lb2 = lb3;
                                        lb3.f$g = wD2.f$M.f$E().floatValue();
                                        break block12;
                                    }
                                    if (lb3.f$g > wD2.f$M.f$E().floatValue()) {
                                        lb lb8 = lb3;
                                        lb8.f$g -= wD2.f$i.f$E().floatValue();
                                        if (lb8.f$g < wD2.f$M.f$E().floatValue()) {
                                            lb3.f$g = wD2.f$M.f$E().floatValue();
                                        }
                                    }
                                }
                                lb2 = lb3;
                            }
                            if (lb2.f$g >= wD2.f$M.f$E().floatValue() - 0.5f && lb3.f$g <= wD2.f$M.f$E().floatValue() + 0.5f) {
                                lb3.f$g = wD2.f$M.f$E().floatValue();
                            }
                            lb3.f$d = vH2.f$a(lb3.f$g);
                        }
                    });
                });
            }
        }
    }

    public AE(gF gF2) {
        0.f$d = gF2;
    }
}
 */