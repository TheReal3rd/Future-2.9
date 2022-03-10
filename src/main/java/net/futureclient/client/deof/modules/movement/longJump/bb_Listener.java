package net.futureclient.client.deof.modules.movement.longJump;

public class bb_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.fd;
import net.futureclient.client.hA;
import net.futureclient.client.q;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import org.lwjgl.input.Keyboard;

public class bb
extends Ha<ME> {
    public final fd f$d;

    public bb(fd fd2) {
        0.f$d = fd2;
    }

    @Override
    public void f$E(ME mE) {
        switch ((hA)((Object)fd.f$E(0.f$d).f$E())) {
            case f$M: {
                Minecraft minecraft = fd.f$ta();
                while (false) {
                }
                if (minecraft.world == null) break;
                if (Keyboard.isKeyDown((int)50)) {
                    fd.f$E(0.f$d, 0.0, 2.147483647E9, 0.0);
                }
                if (!Pg.f$a()) {
                    return;
                }
                float f = fd.f$sa().player.field_70177_z + (float)(fd.f$za().player.field_191988_bg < 0.0f ? 180 : 0) + (fd.f$Ua().player.field_70702_br > 0.0f ? -90.0f * (fd.f$Sa().player.field_191988_bg < 0.0f ? -0.5f : (fd.f$na().player.field_191988_bg > 0.0f ? 0.5f : 1.0f)) : 0.0f) - (fd.f$Xa().player.field_70702_br < 0.0f ? -90.0f * (fd.f$Pa().player.field_191988_bg < 0.0f ? -0.5f : (fd.f$ra().player.field_191988_bg > 0.0f ? 0.5f : 1.0f)) : 0.0f);
                float f2 = (float)Math.cos((double)(f + 90.0f) * Math.PI / 180.0);
                f = (float)Math.sin((double)(f + 90.0f) * Math.PI / 180.0);
                if (!fd.f$Na().player.field_70124_G) {
                    bb bb2 = 0;
                    fd.f$a(bb2.f$d, fd.f$a(bb2.f$d) + 1);
                    if (fd.f$xa().player.movementInput.sneak) {
                        fd.f$Qa().player.connection.sendPacket((Packet)new CPacketPlayer.Position(0.0, 2.147483647E9, 0.0, false));
                    }
                    fd.f$E(0.f$d, 0);
                    if (!fd.f$qa().player.field_70124_G) {
                        if (fd.f$ua().player.field_70181_x == -0.07190068807140403) {
                            fd.f$oa().player.field_70181_x *= (double)0.35f;
                        }
                        if (fd.f$Va().player.field_70181_x == -0.10306193759436909) {
                            fd.f$pa().player.field_70181_x *= (double)0.55f;
                        }
                        if (fd.f$Ra().player.field_70181_x == -0.13395038817442878) {
                            fd.f$Wa().player.field_70181_x *= (double)0.67f;
                        }
                        if (fd.f$wa().player.field_70181_x == -0.16635183030382) {
                            fd.f$va().player.field_70181_x *= (double)0.69f;
                        }
                        if (fd.f$Oa().player.field_70181_x == -0.19088711097794803) {
                            fd.f$Ta().player.field_70181_x *= (double)0.71f;
                        }
                        if (fd.f$ya().player.field_70181_x == -0.21121925191528862) {
                            fd.f$ca().player.field_70181_x *= (double)0.2f;
                        }
                        if (fd.f$ka().player.field_70181_x == -0.11979897632390576) {
                            fd.f$ia().player.field_70181_x *= (double)0.93f;
                        }
                        if (fd.f$ea().player.field_70181_x == -0.18758479151225355) {
                            fd.f$Ia().player.field_70181_x *= (double)0.72f;
                        }
                        if (fd.f$Ja().player.field_70181_x == -0.21075983825251726) {
                            fd.f$Ma().player.field_70181_x *= (double)0.76f;
                        }
                        if (fd.f$E(0.f$d, (EntityPlayer)fd.f$ha().player, 69.0) < 0.5) {
                            if (fd.f$da().player.field_70181_x == -0.23537393014173347) {
                                fd.f$Ca().player.field_70181_x *= (double)0.03f;
                            }
                            if (fd.f$Da().player.field_70181_x == -0.08531999505205401) {
                                fd.f$Ka().player.field_70181_x *= -0.5;
                            }
                            if (fd.f$Aa().player.field_70181_x == -0.03659320313669756) {
                                fd.f$ja().player.field_70181_x *= (double)-0.1f;
                            }
                            if (fd.f$fa().player.field_70181_x == -0.07481386749524899) {
                                fd.f$Ba().player.field_70181_x *= (double)-0.07f;
                            }
                            if (fd.f$ma().player.field_70181_x == -0.0732677700939672) {
                                fd.f$Fa().player.field_70181_x *= (double)-0.05f;
                            }
                            if (fd.f$aa().player.field_70181_x == -0.07480988066790395) {
                                fd.f$Ha().player.field_70181_x *= (double)-0.04f;
                            }
                            if (fd.f$Ga().player.field_70181_x == -0.0784000015258789) {
                                fd.f$la().player.field_70181_x *= (double)0.1f;
                            }
                            if (fd.f$ba().player.field_70181_x == -0.08608320193943977) {
                                fd.f$Ea().player.field_70181_x *= (double)0.1f;
                            }
                            if (fd.f$La().player.field_70181_x == -0.08683615560584318) {
                                fd.f$ga().player.field_70181_x *= (double)0.05f;
                            }
                            if (fd.f$R().player.field_70181_x == -0.08265497329678266) {
                                fd.f$O().player.field_70181_x *= (double)0.05f;
                            }
                            if (fd.f$Z().player.field_70181_x == -0.08245009535659828) {
                                fd.f$T().player.field_70181_x *= (double)0.05f;
                            }
                            if (fd.f$z().player.field_70181_x == -0.08244005633718426) {
                                fd.f$r().player.field_70181_x = -0.08243956442521608;
                            }
                            if (fd.f$y().player.field_70181_x == -0.08243956442521608) {
                                fd.f$s().player.field_70181_x = -0.08244005590677261;
                            }
                            if (fd.f$S().player.field_70181_x > -0.1 && fd.f$N().player.field_70181_x < -0.08 && !fd.f$X().player.field_70122_E && fd.f$u().player.movementInput.forwardKeyDown) {
                                fd.f$V().player.field_70181_x = -1.0E-4f;
                            }
                        } else {
                            if (fd.f$q().player.field_70181_x < -0.2 && fd.f$x().player.field_70181_x > -0.24) {
                                fd.f$p().player.field_70181_x *= 0.7;
                            }
                            if (fd.f$n().player.field_70181_x < -0.25 && fd.f$o().player.field_70181_x > -0.32) {
                                fd.f$w().player.field_70181_x *= 0.8;
                            }
                            if (fd.f$v().player.field_70181_x < -0.35 && fd.f$W().player.field_70181_x > -0.8) {
                                fd.f$Y().player.field_70181_x *= 0.98;
                            }
                            if (fd.f$t().player.field_70181_x < -0.8 && fd.f$P().player.field_70181_x > -1.6) {
                                fd.f$Q().player.field_70181_x *= 0.99;
                            }
                        }
                    }
                    ((q)((Y)fd.f$U()).getTimer()).f$E(0.85f);
                    double[] dArray = new double[]{0.420606, 0.417924, 0.415258, 0.412609, 0.409977, 0.407361, 0.404761, 0.402178, 0.399611, 0.39706, 0.394525, 0.392, 0.3894, 0.38644, 0.383655, 0.381105, 0.37867, 0.37625, 0.37384, 0.37145, 0.369, 0.3666, 0.3642, 0.3618, 0.35945, 0.357, 0.354, 0.351, 0.348, 0.345, 0.342, 0.339, 0.336, 0.333, 0.33, 0.327, 0.324, 0.321, 0.318, 0.315, 0.312, 0.309, 0.307, 0.305, 0.303, 0.3, 0.297, 0.295, 0.293, 0.291, 0.289, 0.287, 0.285, 0.283, 0.281, 0.279, 0.277, 0.275, 0.273, 0.271, 0.269, 0.267, 0.265, 0.263, 0.261, 0.259, 0.257, 0.255, 0.253, 0.251, 0.249, 0.247, 0.245, 0.243, 0.241, 0.239, 0.237};
                    if (fd.f$J().player.movementInput.forwardKeyDown) {
                        try {
                            fd.f$d().player.field_70159_w = (double)f2 * dArray[fd.f$a(0.f$d) - 1] * 3.0;
                            fd.f$l().player.field_70179_y = (double)f * dArray[fd.f$a(0.f$d) - 1] * 3.0;
                            return;
                        }
                        catch (Exception exception) {
                            return;
                        }
                    }
                    fd.f$k().player.field_70159_w = 0.0;
                    fd.f$b().player.field_70179_y = 0.0;
                    return;
                }
                ((q)((Y)fd.f$F()).getTimer()).f$E(1.0f);
                bb bb3 = 0;
                fd.f$a(0.f$d, 0);
                fd.f$E(0.f$d, fd.f$E(bb3.f$d) + 1);
                fd.f$G().player.field_70159_w /= 13.0;
                fd.f$D().player.field_70179_y /= 13.0;
                if (fd.f$E(bb3.f$d) == 1) {
                    bb bb4 = 0;
                    fd.f$E(bb4.f$d, fd.f$g().player.field_70165_t, fd.f$m().player.field_70163_u, fd.f$f().player.field_70161_v);
                    fd.f$E(bb4.f$d, fd.f$L().player.field_70165_t + 0.0624, fd.f$i().player.field_70163_u, fd.f$c().player.field_70161_v);
                    fd.f$E(bb4.f$d, fd.f$I().player.field_70165_t, fd.f$j().player.field_70163_u + 0.419, fd.f$M().player.field_70161_v);
                    fd.f$E(bb4.f$d, fd.f$C().player.field_70165_t + 0.0624, fd.f$H().player.field_70163_u, fd.f$h().player.field_70161_v);
                    fd.f$E(bb4.f$d, fd.f$A().player.field_70165_t, fd.f$K().player.field_70163_u + 0.419, fd.f$B().player.field_70161_v);
                }
                if (fd.f$E(0.f$d) <= 2) break;
                fd.f$E(0.f$d, 0);
                fd.f$e().player.field_70159_w = (double)f2 * 0.3;
                fd.f$a().player.field_70179_y = (double)f * 0.3;
                fd.f$E().player.field_70181_x = 0.424f;
            }
        }
    }
}
 */