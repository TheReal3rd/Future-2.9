package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.rB;
import net.minecraft.client.Minecraft;

public class JB
extends Ha<Pf> {
    public final rB f$d;

    public JB(rB rB2) {
        0.f$d = rB2;
    }

    @Override
    public void f$E(Pf pf) {
        switch (pf.f$E()) {
            case f$M: {
                Minecraft minecraft = rB.f$e();
                while (false) {
                }
                if (minecraft.player.func_70089_S()) break;
                rB.f$a().player.field_70181_x = rB.f$E(0.f$d).f$E().floatValue();
            }
        }
    }
}
package net.futureclient.client;

import java.util.Arrays;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.lA;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;

public class jb
extends Ba {
    private final List<SoundEvent> f$d;

    public jb() {
        jb jb2;
        String[] stringArray = new String[5];
        stringArray[0] = "NoSoundLag";
        stringArray[1] = "NoSwapLag";
        stringArray[2] = "NoEquipSoundLag";
        stringArray[3] = "AntiSoundLag";
        stringArray[4] = "AntiSwapExploit";
        super("NoSoundLag", stringArray, true, -51200, JD.f$b);
        SoundEvent[] soundEventArray = new SoundEvent[7];
        soundEventArray[0] = SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
        soundEventArray[1] = SoundEvents.ITEM_ARMOR_EQIIP_ELYTRA;
        soundEventArray[2] = SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
        soundEventArray[3] = SoundEvents.ITEM_ARMOR_EQUIP_IRON;
        soundEventArray[4] = SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
        soundEventArray[5] = SoundEvents.ITEM_ARMOR_EQUIP_CHAIN;
        soundEventArray[6] = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
        jb2.f$d = Arrays.asList(soundEventArray);
        jb2.f$E(new lA(jb2));
    }

    public static List f$E(jb jb2) {
        return jb2.f$d;
    }
}
package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.Ha;
import net.futureclient.client.OB;
import net.futureclient.client.Pg;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.sE;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;

public class jB
extends Ha<sE> {
    public final OB f$d;

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        EntityPlayerSP entityPlayerSP = OB.f$e().getRenderViewEntity() == null ? OB.f$a().player : OB.f$E().getRenderViewEntity();
        Iterator<EntityPlayer> iterator = Pg.f$E().iterator();
        block0: while (true) {
            Iterator<EntityPlayer> iterator2 = iterator;
            while (iterator2.hasNext()) {
                EntityPlayer entityPlayer = iterator.next();
                if (!Pg.f$E((Entity)entityPlayer) || entityPlayer == entityPlayerSP) continue block0;
                if (entityPlayer.func_82150_aj() && !((Boolean)OB.f$E(0.f$d).f$E()).booleanValue()) {
                    iterator2 = iterator;
                    continue;
                }
                Vec3d vec3d = Uh.f$E((Entity)entityPlayer);
                iterator2 = iterator;
                OB.f$E(0.f$d, entityPlayer, vec3d.x, vec3d.y, vec3d.z);
            }
            break;
        }
    }

    public jB(OB oB) {
        0.f$d = oB;
    }
}
