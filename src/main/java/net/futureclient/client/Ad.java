package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.OI;
import net.futureclient.client.Qc;
import net.futureclient.client.ZH;
import net.futureclient.client.tI;

public class Ad
extends Ha<ME> {
    public final Qc f$d;

    @Override
    public void f$E(ME mE) {
        if (Qc.f$E(0.f$d).f$a(Qc.f$a(0.f$d).f$E().floatValue() * 1000.0f)) {
            OI oI;
            OI oI2 = new OI(Qc.f$I().player.field_70165_t, Qc.f$j().player.field_70163_u, Qc.f$M().player.field_70161_v);
            if (oI2.equals(tI.f$d)) {
                return;
            }
            if (Qc.f$E(0.f$d) == null) {
                Qc.f$E(0.f$d, new ZH(0, null, Qc.f$C().world.field_73011_w.getDimensionType(), oI2, new ArrayList<OI>()));
            }
            OI oI3 = oI = Qc.f$E(0.f$d).f$E().isEmpty() ? oI2 : Qc.f$E(0.f$d).f$E().get(Qc.f$E(0.f$d).f$E().size() - 1);
            if (!Qc.f$E(0.f$d).f$E().isEmpty() && (oI2.f$E(oI) > 100.0 || Qc.f$E(0.f$d).f$E() != Qc.f$H().world.field_73011_w.getDimensionType())) {
                Qc.f$E(0.f$d).add(Qc.f$E(0.f$d));
                Qc.f$E(0.f$d, new ZH(Qc.f$E(0.f$d).size() + 1, null, Qc.f$h().world.field_73011_w.getDimensionType(), oI2, new ArrayList<OI>()));
            }
            if (Qc.f$E(0.f$d).f$E().isEmpty() || !oI2.equals(oI)) {
                Qc.f$E(0.f$d).f$E().add(oI2);
            }
            Qc.f$E(0.f$d).f$a();
        }
    }

    public Ad(Qc qc) {
        0.f$d = qc;
    }
}
package net.futureclient.client;

import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.ZF;
import net.futureclient.client.Zf;
import net.futureclient.client.gG;
import net.futureclient.client.kH;
import net.futureclient.client.me;
import net.minecraft.client.Minecraft;

public class AD
extends Ba {
    private CopyOnWriteArrayList<UUID> f$g;
    private final gG f$d;

    public static boolean f$E(AD aD, UUID uUID) {
        return aD.f$E(uUID);
    }

    public AD() {
        AD aD;
        String[] stringArray = new String[3];
        stringArray[0] = "AntiVanish";
        stringArray[1] = "avanish";
        stringArray[2] = "vanish";
        super("AntiVanish", stringArray, true, -16588821, JD.f$b);
        AD aD2 = aD;
        aD.f$g = new CopyOnWriteArrayList();
        aD.f$d = new gG();
        aD.f$E(new ZF(aD), new me(aD));
        String[] stringArray2 = new String[3];
        stringArray2[0] = "WhosVanished";
        stringArray2[1] = "AntiVanishList";
        stringArray2[2] = "VanishList";
        kH.f$E().f$E().f$a(new Zf(aD, stringArray2));
    }

    private boolean f$E(UUID uUID) {
        if (0.f$g.contains(uUID)) {
            0.f$g.remove(uUID);
            return true;
        }
        0.f$g.add(uUID);
        return false;
    }

    public static gG f$E(AD aD) {
        return aD.f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static CopyOnWriteArrayList f$E(AD aD) {
        return aD.f$g;
    }

    public static Minecraft f$a() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.VF;
import net.futureclient.client.bE;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

public class aD
extends Ha<Pf> {
    public final bE f$d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(Pf pf) {
        0.f$d.f$a(String.format("Phase \u00a77[\u00a7F%s\u00a77]", bE.f$E(0.f$d).f$E()));
        float f = bE.f$w().player.field_70177_z;
        if (bE.f$v().player.field_191988_bg < 0.0f) {
            f += 180.0f;
        }
        if (bE.f$W().player.field_70702_br > 0.0f) {
            f -= 90.0f * (bE.f$Y().player.field_191988_bg < 0.0f ? -0.5f : (bE.f$t().player.field_191988_bg > 0.0f ? 0.5f : 1.0f));
        }
        if (bE.f$P().player.field_70702_br < 0.0f) {
            f += 90.0f * (bE.f$Q().player.field_191988_bg < 0.0f ? -0.5f : (bE.f$U().player.field_191988_bg > 0.0f ? 0.5f : 1.0f));
        }
        double d = Math.cos(Math.toRadians(f + 90.0f)) * 0.2;
        d = Math.sin(Math.toRadians(f + 90.0f)) * 0.2;
        d = (double)bE.f$J().player.func_174811_aO().getDirectionVec().getX() * 0.1;
        double d2 = (double)bE.f$d().player.func_174811_aO().getDirectionVec().getZ() * 0.1;
        switch ((VF)((Object)bE.f$E(0.f$d).f$E())) {
            case f$g: {
                switch (pf.f$E()) {
                    case f$M: {
                        if (!bE.f$l().player.isSneaking() || !bE.f$E(0.f$d)) return;
                        f = bE.f$k().player.field_70177_z;
                        bE.f$F().player.func_174826_a(bE.f$b().player.func_174813_aQ().offset(bE.f$E(0.f$d).f$E().doubleValue() * Math.cos(Math.toRadians(f + 90.0f)), 0.0, bE.f$E(0.f$d).f$E().doubleValue() * Math.sin(Math.toRadians(f + 90.0f))));
                        return;
                    }
                }
                return;
            }
            case f$j: {
                bE.f$G().player.field_70181_x = 0.0;
                if (bE.f$D().inGameHasFocus) {
                    if (bE.f$g().player.movementInput.jump) {
                        bE.f$m().player.field_70181_x += 0.3;
                    }
                    if (bE.f$f().player.movementInput.sneak) {
                        bE.f$L().player.field_70181_x -= 0.3;
                    }
                }
                bE.f$i().player.field_70145_X = true;
                return;
            }
            case f$M: {
                if (!bE.f$c().player.field_70123_F || !bE.f$E(0.f$d).f$a(200L)) return;
                bE.f$C().player.connection.sendPacket((Packet)new CPacketPlayer.Position(bE.f$I().player.field_70165_t, bE.f$j().player.field_70163_u + 0.05, bE.f$M().player.field_70161_v, true));
                bE.f$K().player.connection.sendPacket((Packet)new CPacketPlayer.Position(bE.f$H().player.field_70165_t + d * 4.0, bE.f$h().player.field_70163_u, bE.f$A().player.field_70161_v + d2 * 4.0, true));
                bE.f$E().player.connection.sendPacket((Packet)new CPacketPlayer.Position(bE.f$B().player.field_70165_t, bE.f$e().player.field_70163_u, bE.f$a().player.field_70161_v, true));
                bE.f$E(0.f$d).f$a();
                return;
            }
        }
    }

    public aD(bE bE2) {
        0.f$d = bE2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.Oi;
import net.futureclient.client.RA;
import net.futureclient.client.jf;
import net.futureclient.client.ji;
import net.futureclient.client.vG;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.util.text.TextFormatting;

public class ad
extends Ha<jf> {
    public final RA f$d;

    public ad(RA rA) {
        0.f$d = rA;
    }

    @Override
    public void f$E(jf jf2) {
        if (jf2.f$E() instanceof SPacketChat) {
            SPacketChat sPacketChat = (SPacketChat)jf2.f$E();
            new Thread(() -> {
                String string;
                block5: {
                    string = TextFormatting.getTextWithoutFormattingCodes((String)sPacketChat.getChatComponent().getUnformattedText());
                    if (string != null && string.isEmpty()) break block5;
                    return;
                }
                try {
                    ji ji2 = vG.f$E((String)string);
                    if (ji2 != ji.f$Pa && ji2 != ji.f$Ya) {
                        String string2 = Oi.f$E((String)string, (ji)ji2, (ji)ji.f$Pa);
                        if (RA.f$E(0.f$d).f$E(string2, sPacketChat.getChatComponent().getUnformattedText()) < 0.99) {
                            string2 = string2.replace("&lt;", "<");
                            string2 = string2.replace("&gt;", ">");
                            La.f$E().f$E(new StringBuilder().insert(0, "(").append(Character.toUpperCase(ji2.name().charAt(0))).append(ji2.name().substring(1).toLowerCase()).append(") ").append(TextFormatting.GRAY).append(string2).toString(), false);
                            return;
                        }
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }).start();
        }
    }
}
