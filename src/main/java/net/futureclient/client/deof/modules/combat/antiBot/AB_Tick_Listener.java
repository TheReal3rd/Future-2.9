package net.futureclient.client.deof.modules.combat.antiBot;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

import java.util.List;

public class AB_Tick_Listener extends Listener<TickEvent> {
    public static Minecraft mc = Minecraft.getMinecraft();// OG f$d
    public final AntiBot antiBot; // f$d

    public AB_Tick_Listener(AntiBot mF2) {
        this.antiBot = mF2;
    }

    @Override
    public void invoke(TickEvent mE) {
        if (mc.player.isDead) return;
        if (mc.player.isSpectator()) return;
        if (mc.player == null) return;

        if (antiBot.uuid.value) {
            int n;
            List<EntityPlayer> list = AntiBot.getList();
            int n2 = n = 0;
            while (n2 < list.size()) {
                int n3 = n + 1;
                while (n3 < list.size()) {
                    int n4 = 0;
                    EntityPlayer entityPlayer2 = list.get(n);
                    EntityPlayer entityPlayer3 = list.get(n4);
                    if (entityPlayer2.getUniqueID() == entityPlayer3.getUniqueID()) {
                        if (entityPlayer2.getEntityId() > entityPlayer3.getEntityId()) {
                            antiBot.botMap.put(entityPlayer2.getEntityId(), entityPlayer2.getUniqueID());
                            antiBot.botMap.remove(entityPlayer3.getEntityId());
                            break;
                        }
                        antiBot.botMap.put(entityPlayer3.getEntityId(), entityPlayer3.getUniqueID());
                        antiBot.botMap.remove(entityPlayer2.getEntityId());
                        break;
                    }
                    n3 = ++n4;
                }
                n2 = ++n;
            }
        }
        AntiBot.getList().stream().filter(entityPlayer -> AntiBot.invisibility(entityPlayer) || AntiBot.name(entityPlayer) || AntiBot.uuid(entityPlayer) || AntiBot.minePlex(entityPlayer)).forEach(entityPlayer -> antiBot.botMap.put(entityPlayer.getEntityId(), entityPlayer.getUniqueID()));
    }
}
/*
package net.futureclient.client;

import java.util.List;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.mF;
import net.minecraft.entity.player.EntityPlayer;

public class cE
extends Ha<ME> {
    public final mF f$d;

    @Override
    public void f$E(ME mE) {
        if (mF.f$g().player.field_70128_L) {
            return;
        }
        if (mF.f$m().player.func_175149_v()) {
            return;
        }
        if (mF.f$f().player == null) {
            return;
        }
        if (0.f$d.f$i.f$E().booleanValue()) {
            int n;
            List list = mF.f$E(0.f$d);
            int n2 = n = 0;
            while (n2 < list.size()) {
                int n3 = n + 1;
                while (n3 < list.size()) {
                    int n4;
                    EntityPlayer entityPlayer2 = (EntityPlayer)list.get(n);
                    EntityPlayer entityPlayer3 = (EntityPlayer)list.get(n4);
                    if (entityPlayer2.func_110124_au() == entityPlayer3.func_110124_au()) {
                        if (entityPlayer2.func_145782_y() > entityPlayer3.func_145782_y()) {
                            0.f$d.f$d.put(entityPlayer2.func_145782_y(), entityPlayer2.func_110124_au());
                            0.f$d.f$d.remove(entityPlayer3.func_145782_y());
                            break;
                        }
                        0.f$d.f$d.put(entityPlayer3.func_145782_y(), entityPlayer3.func_110124_au());
                        0.f$d.f$d.remove(entityPlayer2.func_145782_y());
                        break;
                    }
                    n3 = ++n4;
                }
                n2 = ++n;
            }
        }
        mF.f$E(0.f$d).stream().filter(entityPlayer -> mF.f$B(0.f$d, entityPlayer) || mF.f$e(0.f$d, entityPlayer) || mF.f$a(0.f$d, entityPlayer) || mF.f$E(0.f$d, entityPlayer)).forEach(entityPlayer -> 0.f$d.f$d.put(entityPlayer.func_145782_y(), entityPlayer.func_110124_au()));
    }

    public cE(mF mF2) {
        0.f$d = mF2;
    }
}
 */