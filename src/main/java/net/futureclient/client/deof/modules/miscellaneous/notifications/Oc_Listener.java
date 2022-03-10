package net.futureclient.client.deof.modules.miscellaneous.notifications;

public class Oc_Listener {
}
/*
package net.futureclient.client;

import java.awt.TrayIcon;
import net.futureclient.client.DC;
import net.futureclient.client.Eb;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Pg;
import net.futureclient.client.gC;
import net.futureclient.client.kH;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import org.lwjgl.opengl.Display;

public class Oc
extends Ha<ME> {
    public final DC f$d;

    @Override
    public void f$E(ME mE) {
        Oc oc;
        Object object;
        Eb eb;
        block17: {
            block16: {
                block15: {
                    Oc oc2;
                    block7: {
                        block4: {
                            block14: {
                                block13: {
                                    block12: {
                                        block11: {
                                            block5: {
                                                block10: {
                                                    block9: {
                                                        block8: {
                                                            block6: {
                                                                if (Display.isActive()) {
                                                                    DC.f$K(false);
                                                                    DC.f$B(false);
                                                                    DC.f$e(false);
                                                                    DC.f$a(false);
                                                                    DC.f$E(false);
                                                                    return;
                                                                }
                                                                eb = (Eb)kH.f$E().f$E().f$E(Eb.class);
                                                                if (eb == null || !eb.f$E() || !0.f$d.f$m.f$E().booleanValue()) break block4;
                                                                object = DC.f$g().player.func_174811_aO();
                                                                if (DC.f$m().player.func_184187_bx() != null) break block5;
                                                                if (!object.equals((Object)EnumFacing.NORTH) || DC.f$f().player.field_70179_y != 0.0) break block6;
                                                                if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                                                DC.f$e();
                                                                if (DC.f$a() <= 1) break block4;
                                                                DC.f$E(0);
                                                                kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                                                if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                                                DC.f$e(true);
                                                                oc2 = 0;
                                                                break block7;
                                                            }
                                                            if (!object.equals((Object)EnumFacing.SOUTH) || DC.f$L().player.field_70159_w != 0.0 || DC.f$i().player.field_70179_y != 0.0) break block8;
                                                            if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                                            DC.f$e();
                                                            if (DC.f$a() <= 1) break block4;
                                                            DC.f$E(0);
                                                            kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                                            if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                                            DC.f$e(true);
                                                            oc2 = 0;
                                                            break block7;
                                                        }
                                                        if (!object.equals((Object)EnumFacing.EAST) || DC.f$c().player.field_70159_w != 0.0) break block9;
                                                        if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                                        DC.f$e();
                                                        if (DC.f$a() <= 1) break block4;
                                                        DC.f$E(0);
                                                        kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                                        if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                                        DC.f$e(true);
                                                        oc2 = 0;
                                                        break block7;
                                                    }
                                                    if (!object.equals((Object)EnumFacing.WEST) || DC.f$I().player.field_70159_w != 0.0) break block10;
                                                    if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                                    DC.f$e();
                                                    if (DC.f$a() <= 1) break block4;
                                                    DC.f$E(0);
                                                    kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                                    if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                                    DC.f$e(true);
                                                    oc2 = 0;
                                                    break block7;
                                                }
                                                DC.f$e(false);
                                                DC.f$E(0);
                                                oc2 = 0;
                                                break block7;
                                            }
                                            if (!object.equals((Object)EnumFacing.NORTH) || DC.f$j().player.func_184187_bx().motionZ != 0.0) break block11;
                                            if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                            DC.f$e();
                                            if (DC.f$a() <= 1) break block4;
                                            DC.f$E(0);
                                            kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                            if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                            DC.f$e(true);
                                            oc2 = 0;
                                            break block7;
                                        }
                                        if (!object.equals((Object)EnumFacing.SOUTH) || DC.f$M().player.func_184187_bx().motionX != 0.0 || DC.f$C().player.func_184187_bx().motionZ != 0.0) break block12;
                                        if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                        DC.f$e();
                                        if (DC.f$a() <= 1) break block4;
                                        DC.f$E(0);
                                        kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                        if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                        DC.f$e(true);
                                        oc2 = 0;
                                        break block7;
                                    }
                                    if (!object.equals((Object)EnumFacing.EAST) || DC.f$H().player.func_184187_bx().motionX != 0.0) break block13;
                                    if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                    DC.f$e();
                                    if (DC.f$a() <= 1) break block4;
                                    DC.f$E(0);
                                    kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                    if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                    DC.f$e(true);
                                    oc2 = 0;
                                    break block7;
                                }
                                if (!object.equals((Object)EnumFacing.WEST) || DC.f$h().player.func_184187_bx().motionX != 0.0) break block14;
                                if (DC.f$h() || !DC.f$h(0.f$d).f$E(2500L)) break block4;
                                DC.f$e();
                                if (DC.f$a() <= 1) break block4;
                                DC.f$E(0);
                                kH.f$E().f$E().f$g.displayMessage("No longer moving", "AutoWalk has detected that you are stuck.", TrayIcon.MessageType.NONE);
                                if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block4;
                                DC.f$e(true);
                                oc2 = 0;
                                break block7;
                            }
                            DC.f$e(false);
                            DC.f$E(0);
                        }
                        oc2 = 0;
                    }
                    if (!oc2.f$d.f$D.f$E().booleanValue() || DC.f$A().player.field_70737_aN == 0) break block15;
                    if (DC.f$A() || !DC.f$A(0.f$d).f$E(10000L)) break block16;
                    kH.f$E().f$E().f$g.displayMessage("Damage received", "You have just taken damage.", TrayIcon.MessageType.NONE);
                    if (!((gC)((Object)DC.f$E(0.f$d).f$E())).equals((Object)gC.f$M)) break block16;
                    DC.f$a(true);
                    oc = 0;
                    break block17;
                }
                DC.f$a(false);
            }
            oc = 0;
        }
        if (oc.f$d.f$l.f$E().booleanValue()) {
            object = DC.f$K().world.field_73010_i.iterator();
            while (object.hasNext()) {
                eb = (EntityPlayer)((Entity)object.next());
                if (!(!Pg.f$E((Entity)eb) || DC.f$E(0.f$d).contains(eb) || !0.f$d.f$L.f$E().booleanValue() && kH.f$E().f$E().f$E(eb.getName()) || eb.getName().equals(DC.f$B().player.func_70005_c_()) || eb instanceof EntityPlayerSP)) {
                    if (DC.f$K() || !DC.f$K(0.f$d).f$E(10000L)) continue;
                    Oc oc3 = 0;
                    DC.f$E(oc3.f$d).add(eb);
                    kH.f$E().f$E().f$g.displayMessage("Player in range", new StringBuilder().insert(0, eb.getName()).append(" came into render distance.").toString(), TrayIcon.MessageType.NONE);
                    if (!((gC)((Object)DC.f$E(oc3.f$d).f$E())).equals((Object)gC.f$M)) continue;
                    DC.f$E(true);
                    continue;
                }
                DC.f$E(false);
            }
        }
    }

    public Oc(DC dC) {
        0.f$d = dC;
    }
}
 */