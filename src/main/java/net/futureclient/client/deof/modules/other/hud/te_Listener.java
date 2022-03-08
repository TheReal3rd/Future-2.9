package net.futureclient.client.deof.modules.other.hud;

import net.futureclient.client.TD;
import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.ScaledResEvent;
import net.futureclient.client.deof.utils.render.ColourUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.translation.I18n;

import java.awt.*;
import java.util.Comparator;

public class te_Listener extends Listener<ScaledResEvent> {
    public final Hud f$d;

    public te_Listener(Hud gF2) {
        this.f$d = gF2;
    }

    @Override
    public void invoke(ScaledResEvent zd) {
        if (this.f$d.getMinecraft().gameSettings.showDebugInfo) return;

        zd.f$g = -(this.f$d.customFont.getValue() ? this.f$d.fontSetting.f$E() : Hud.getMinecraft1().fontRenderer.FONT_HEIGHT) + 2;
        zd.f$g += Hud.f$e(this.f$d);
        zd.f$d = (this.f$d.customFont.getValue() ? this.f$d.fontSetting.f$E() : Hud.getMinecraft1().fontRenderer.FONT_HEIGHT) - 1;
        if (this.f$d.potionEffects.getValue()) {
            Hud.getMinecraft1().player.getActivePotionEffects().stream().sorted(((TD)((Object)Hud.f$E(this.f$d).f$E())).equals((Object)TD.f$M) ? Comparator.comparing(PotionEffect::getEffectName).reversed() : Comparator.comparing(PotionEffect::getEffectName)).forEach(object -> {
                Potion potion = object.getPotion();
                String object1 = new StringBuilder().insert(0, I18n.translateToLocal((String)potion.getName())).append(object.getAmplifier() > 0 ? new StringBuilder().insert(0, " ").append(object.getAmplifier() + 1).toString() : "").append(" \u00a7F").append(Potion.getPotionDurationString((PotionEffect)object, (float)1.0f)).toString();
                Hud.drawText(this.f$d, zd, object1, potion.getLiquidColor());
            });
        }
        if (this.f$d.serverBrand.getValue()) {
            Hud.drawText(this.f$d, zd, Hud.getMinecraft1().getCurrentServerData() == null ? "Vanilla" : Hud.getMinecraft1().player.getServerBrand(), -5592406);
        }
        if (this.f$d.watermark.getValue()) {
            Hud.drawWatermark(this.f$d, zd);
        }
        if (this.f$d.arrayList.getValue()) {
            Hud.drawArrayList(this.f$d, zd);
        }
        if (this.f$d.coords.getValue()) {
            Hud.drawCoords(this.f$d, zd);
        }
        if (this.f$d.armour.getValue()) {
            Hud.drawArmourHud(this.f$d, zd);
        }
        if (this.f$d.direction.getValue()) {
            Hud.drawPlayerDirection(this.f$d, zd);
        }
        if (this.f$d.speed.getValue()) {
            Hud.drawText(this.f$d, zd, String.format("Speed \u00a7F%skm/h", (double)Math.round(Hud.f$E(this.f$d) * 100.0) / 100.0), -5592406);
        }
        if (this.f$d.durability.getValue() && Hud.getMinecraft1().player.inventory.getCurrentItem().isItemStackDamageable()) {
            int n = Hud.getMinecraft1().player.inventory.getCurrentItem().getMaxDamage();
            int n2 = Hud.getMinecraft1().player.inventory.getCurrentItem().getItemDamage();
            Color color = new ColourUtils((float)(n - n2) / (float)n * 120.0f, 100.0f, 50.0f, 1.0f).getColour();
            Hud.drawText(this.f$d, zd, String.format("\u00a77Durability \u00a7r%s", n - n2), color.getRGB());
        }
        if (this.f$d.ping.getValue() && !Hud.getMinecraft1().isSingleplayer() && Hud.getMinecraft1().getConnection().getPlayerInfo(Hud.getMinecraft1().player.getUniqueID()) != null) {
            Hud.drawText(this.f$d, zd, String.format("Ping \u00a7F%sms", Hud.getMinecraft1().getConnection().getPlayerInfo(Hud.getMinecraft1().player.getUniqueID()).getResponseTime()), -5592406);
        }
        if (this.f$d.tps.getValue()) {
            Hud.drawText(this.f$d, zd, String.format("TPS \u00a7F%s", (double)Math.round((double) FutureClient.getINSTANCE().getTpsCalc().getTPS() * 100.0) / 100.0), -5592406);//TODO add tps calc from MAIN.
        }
        if (this.f$d.fps.getValue()) {
            Object[] objectArray = new Object[1];
            Hud.f$e();//Hmmmmm
            objectArray[0] = Minecraft.getDebugFPS();
            Hud.drawText(this.f$d, zd, String.format("FPS \u00a7F%s", objectArray), -5592406);
        }
        if (this.f$d.lagNotify.getValue()) {
            Hud.drawServerResonse(this.f$d, zd);
        }
    }
}
/*
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
 */