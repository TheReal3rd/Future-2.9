package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.hD;
import net.futureclient.client.lE;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;

public class TE
extends Ha<Pf> {
    public final lE f$d;

    public TE(lE lE2) {
        0.f$d = lE2;
    }

    @Override
    public void f$E(Pf pf) {
        boolean bl;
        if (((Boolean)lE.f$E(0.f$d).f$E()).booleanValue()) {
            if (lE.f$E(0.f$d) && !lE.f$D().player.movementInput.sneak) {
                lE.f$m().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$g().player, CPacketEntityAction.Action.STOP_SNEAKING));
                lE.f$E(0.f$d, false);
            }
            return;
        }
        boolean bl2 = bl = lE.f$f().player.field_70159_w != 0.0 && lE.f$L().player.field_70179_y != 0.0;
        if (!bl) {
            lE.f$c().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$i().player, CPacketEntityAction.Action.START_SNEAKING));
            lE.f$E(0.f$d, true);
            return;
        }
        switch (hD.f$d[pf.f$E().ordinal()]) {
            case 1: {
                Minecraft minecraft = lE.f$j();
                while (false) {
                }
                minecraft.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$I().player, CPacketEntityAction.Action.START_SNEAKING));
                lE.f$C().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$M().player, CPacketEntityAction.Action.START_SNEAKING));
                lE.f$h().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$H().player, CPacketEntityAction.Action.STOP_SNEAKING));
                return;
            }
            case 2: {
                lE.f$K().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$A().player, CPacketEntityAction.Action.START_SNEAKING));
                lE.f$e().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)lE.f$B().player, CPacketEntityAction.Action.START_SNEAKING));
                lE.f$E(0.f$d, true);
            }
        }
    }
}
package net.futureclient.client;

import java.awt.Color;
import java.util.Comparator;
import net.futureclient.client.Ha;
import net.futureclient.client.TD;
import net.futureclient.client.Zd;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.vH;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.translation.I18n;

public class te
extends Ha<Zd> {
    public final gF f$d;

    public te(gF gF2) {
        0.f$d = gF2;
    }

    @Override
    public void f$E(Zd zd) {
        if (gF.f$m().gameSettings.showDebugInfo) {
            return;
        }
        zd.f$g = -(0.f$d.f$c.f$E() != false ? 0.f$d.f$L.f$E() : gF.f$f().fontRenderer.FONT_HEIGHT) + 2;
        zd.f$g += gF.f$e(0.f$d);
        zd.f$d = (0.f$d.f$c.f$E() != false ? 0.f$d.f$L.f$E() : gF.f$L().fontRenderer.FONT_HEIGHT) - 1;
        if (0.f$d.f$w.f$E().booleanValue()) {
            gF.f$i().player.func_70651_bq().stream().sorted(((TD)((Object)gF.f$E(0.f$d).f$E())).equals((Object)TD.f$M) ? Comparator.comparing(PotionEffect::getEffectName).reversed() : Comparator.comparing(PotionEffect::getEffectName)).forEach(object -> {
                Potion potion = object.getPotion();
                object = new StringBuilder().insert(0, I18n.translateToLocal((String)potion.getName())).append(object.getAmplifier() > 0 ? new StringBuilder().insert(0, " ").append(object.getAmplifier() + 1).toString() : "").append(" \u00a7F").append(Potion.getPotionDurationString((PotionEffect)object, (float)1.0f)).toString();
                gF.f$E(0.f$d, zd, (String)object, potion.getLiquidColor());
            });
        }
        if (0.f$d.f$W.f$E().booleanValue()) {
            gF.f$E(0.f$d, zd, gF.f$c().getCurrentServerData() == null ? "Vanilla" : gF.f$I().player.getServerBrand(), -5592406);
        }
        if (0.f$d.f$Q.f$E().booleanValue()) {
            gF.f$A(0.f$d, zd);
        }
        if (0.f$d.f$T.f$E().booleanValue()) {
            gF.f$K(0.f$d, zd);
        }
        if (0.f$d.f$v.f$E().booleanValue()) {
            gF.f$B(0.f$d, zd);
        }
        if (0.f$d.f$p.f$E().booleanValue()) {
            gF.f$e(0.f$d, zd);
        }
        if (0.f$d.f$V.f$E().booleanValue()) {
            gF.f$a(0.f$d, zd);
        }
        if (0.f$d.f$y.f$E().booleanValue()) {
            gF.f$E(0.f$d, zd, String.format("Speed \u00a7F%skm/h", (double)Math.round(gF.f$E(0.f$d) * 100.0) / 100.0), -5592406);
        }
        if (0.f$d.f$O.f$E().booleanValue() && gF.f$j().player.field_71071_by.getCurrentItem().isItemStackDamageable()) {
            int n = gF.f$M().player.field_71071_by.getCurrentItem().getMaxDamage();
            int n2 = gF.f$C().player.field_71071_by.getCurrentItem().getItemDamage();
            Color color = new vH((float)(n - n2) / (float)n * 120.0f, 100.0f, 50.0f, 1.0f).f$E();
            gF.f$E(0.f$d, zd, String.format("\u00a77Durability \u00a7r%s", n - n2), color.getRGB());
        }
        if (0.f$d.f$G.f$E().booleanValue() && !gF.f$H().isSingleplayer() && gF.f$A().getConnection().getPlayerInfo(gF.f$h().player.func_110124_au()) != null) {
            gF.f$E(0.f$d, zd, String.format("Ping \u00a7F%sms", gF.f$B().getConnection().getPlayerInfo(gF.f$K().player.func_110124_au()).getResponseTime()), -5592406);
        }
        if (0.f$d.f$h.f$E().booleanValue()) {
            gF.f$E(0.f$d, zd, String.format("TPS \u00a7F%s", (double)Math.round((double)kH.f$E().f$E().f$E() * 100.0) / 100.0), -5592406);
        }
        if (0.f$d.f$r.f$E().booleanValue()) {
            Object[] objectArray = new Object[1];
            gF.f$e();
            objectArray[0] = Minecraft.getDebugFPS();
            gF.f$E(0.f$d, zd, String.format("FPS \u00a7F%s", objectArray), -5592406);
        }
        if (0.f$d.f$f.f$E().booleanValue()) {
            gF.f$E(0.f$d, zd);
        }
    }
}
package net.futureclient.client;

public enum tE {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tE() {
        tE tE2;
    }
}
