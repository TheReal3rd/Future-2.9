package net.futureclient.client;

import java.awt.TrayIcon;
import net.futureclient.client.DC;
import net.futureclient.client.De;
import net.futureclient.client.Ha;
import net.futureclient.client.kH;
import org.lwjgl.opengl.Display;

public class Cb
extends Ha<De> {
    public final DC f$d;

    @Override
    public void f$E(De de) {
        if (!Display.isActive() && 0.f$d.f$F.f$E().booleanValue() && DC.f$e().getCurrentServerData() != null) {
            if (DC.f$a().getCurrentServerData().serverIP.equalsIgnoreCase("2b2t.org") && DC.f$B(0.f$d).f$E(10000L)) {
                kH.f$E().f$E().f$g.displayMessage("Connected to the server", "You have finished going through the queue.", TrayIcon.MessageType.NONE);
            }
        }
    }

    public Cb(DC dC) {
        0.f$d = dC;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Oi;
import net.futureclient.client.RA;
import net.futureclient.client.dF;
import net.futureclient.client.ji;
import net.futureclient.client.kH;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;

public class CB
extends Ha<dF> {
    public final RA f$d;

    public CB(RA rA) {
        0.f$d = rA;
    }

    @Override
    public void f$E(dF dF2) {
        if (RA.f$E(0.f$d).f$E() == null) {
            return;
        }
        if (RA.f$E(0.f$d).f$E() != ji.f$Ya) {
            int n;
            ji ji2 = (ji)((Object)RA.f$E(0.f$d).f$E());
            Object object = ji.values();
            int n2 = ((ji[])object).length;
            int n3 = n = 0;
            while (n3 < n2) {
                ji ji3 = object[n];
                if (ji3.name().replaceAll("_", " ").equalsIgnoreCase(((ji)((Object)RA.f$E(0.f$d).f$E())).toString())) {
                    ji2 = ji3;
                }
                n3 = ++n;
            }
            object = ji2;
            if (object != null && !dF2.f$E()) {
                if (!dF2.f$E().startsWith("/") && !dF2.f$E().startsWith(kH.f$E().f$E().f$E())) {
                    dF2.f$E(true);
                    new Thread(() -> CB.f$E(dF2, (ji)((Object)object))).start();
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void f$E(dF dF2, ji ji2) {
        try {
            CPacketChatMessage cPacketChatMessage;
            ji ji3;
            ji ji4;
            NetHandlerPlayClient netHandlerPlayClient = RA.f$E().getConnection();
            String string = dF2.f$E();
            if (ji2 == ji.f$Pa) {
                ji4 = ji.f$Ya;
                ji3 = ji2;
            } else {
                ji4 = ji.f$Pa;
                ji3 = ji2;
            }
            cPacketChatMessage(Oi.f$E((String)string, (ji)ji4, (ji)ji3));
            netHandlerPlayClient.sendPacket((Packet)cPacketChatMessage);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.BA;
import net.futureclient.client.CG;
import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.KC;
import net.futureclient.client.Pg;
import net.futureclient.client.s;

public class cB
extends Ha<Ee> {
    public final KC f$d;

    /*
     * WARNING - void declaration
     */
    public cB(KC kC) {
        void 0;
        0.f$d = 0;
    }

    @Override
    public void f$E(Ee ee) {
        switch ((BA)((Object)KC.f$E(0.f$d).f$E())) {
            case f$K: {
                Ee ee2 = ee;
                while (false) {
                }
                ee2.f$e(ee2.f$e() * ((s)KC.f$a(0.f$d)).f$E().doubleValue());
                ee2.f$E(ee2.f$E() * ((s)KC.f$a(0.f$d)).f$E().doubleValue());
                return;
            }
            case f$g: {
                if (KC.f$H().player.field_70122_E || CG.f$E()) break;
                Pg.f$E(ee, 0.4521096646785736);
                return;
            }
            case f$i: {
                if (!KC.f$E(0.f$d)) break;
                Pg.f$E(ee, KC.f$E(0.f$d).f$E().doubleValue());
                return;
            }
            case f$b: {
                Ee ee3;
                double d = ((s)KC.f$a(0.f$d)).f$E().doubleValue() / 10.0;
                if (KC.f$h().player.movementInput.jump) {
                    KC.f$A().player.field_70181_x = d;
                    ee.f$a(KC.f$A().player.field_70181_x);
                    ee3 = ee;
                } else {
                    Ee ee4 = ee;
                    if (KC.f$K().player.movementInput.sneak) {
                        KC.f$B().player.field_70181_x = -d;
                        ee4.f$a(KC.f$B().player.field_70181_x);
                        ee3 = ee;
                    } else {
                        KC.f$e().player.field_70181_x = 0.0;
                        ee4.f$a(0.0);
                        if (!KC.f$a().player.field_70124_G && ((Boolean)KC.f$B(0.f$d).f$E()).booleanValue()) {
                            ee.f$a(KC.f$E().player.field_70181_x -= KC.f$K(0.f$d).f$E().doubleValue());
                        }
                        ee3 = ee;
                    }
                }
                Pg.f$E(ee3, d);
                return;
            }
            case f$j: {
                Pg.f$E(ee, Pg.f$a());
            }
        }
    }
}
package net.futureclient.client;

import net.minecraft.util.math.Vec3d;

public final class cb {
    private final Vec3d f$g;
    private final String f$M;
    private final long f$d;

    public Vec3d f$E() {
        cb cb2;
        return cb2.f$g;
    }

    public cb(String string, Vec3d vec3d, long l) {
        cb cb2 = 0;
        0.f$M = string;
        cb2.f$g = vec3d;
        cb2.f$d = l;
    }

    public long f$E() {
        cb cb2;
        return cb2.f$d;
    }

    public String f$E() {
        cb cb2;
        return cb2.f$M;
    }
}
