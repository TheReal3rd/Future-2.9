package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Tf;

public class Gg
extends Ha<ME> {
    public final Tf f$d;

    public Gg(Tf tf) {
        0.f$d = tf;
    }

    @Override
    public void f$E(ME mE) {
        if (Tf.f$e(0.f$d) != 0.0 && Tf.f$a(0.f$d) != 0.0 && Tf.f$E(0.f$d) != 0.0 && Tf.f$E(0.f$d)) {
            Tf.f$E().player.func_70107_b(Tf.f$e(0.f$d), Tf.f$a(0.f$d), Tf.f$E(0.f$d));
            if (Tf.f$E(0.f$d).f$E(2500L)) {
                Tf.f$E(0.f$d, false);
            }
        }
    }
}
package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.GA;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;

public class GG
extends GA {
    @Override
    public String f$E() {
        return null;
    }

    public GG() {
        GG gG;
        String[] stringArray = new String[2];
        stringArray[0] = "Breed";
        stringArray[1] = "Rape";
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray2) {
        int stringArray2 = 0;
        Iterator iterator = 0.f$d.world.func_72910_y().iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                int n;
                Entity entity = (Entity)iterator.next();
                if (!(entity instanceof EntityAnimal)) continue block0;
                if (!0.f$E((EntityAnimal)(entity = (EntityAnimal)entity))) {
                    iterator2 = iterator;
                    continue;
                }
                int n2 = n = 36;
                while (true) {
                    if (n2 >= 45) continue block0;
                    ItemStack itemStack = 0.f$d.player.field_71069_bz.getSlot(n).getStack();
                    if (!(itemStack.getItem() instanceof ItemAir) && entity.isBreedingItem(itemStack)) {
                        GG gG = 0;
                        gG.f$d.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n - 36));
                        ++stringArray2;
                        gG.f$d.player.connection.sendPacket((Packet)new CPacketUseEntity(entity, EnumHand.MAIN_HAND));
                        if (gG.f$d.player.field_71075_bZ.isCreativeMode) continue block0;
                        int n3 = itemStack.getCount();
                        if (--n3 > 0) continue block0;
                        0.f$d.player.field_71071_by.setInventorySlotContents(n, itemStack);
                        continue block0;
                    }
                    n2 = ++n;
                }
            }
            break;
        }
        0.f$d.player.connection.sendPacket((Packet)new CPacketHeldItemChange(0.f$d.player.field_71071_by.currentItem));
        Object[] objectArray = new Object[2];
        objectArray[0] = stringArray2;
        objectArray[1] = stringArray2 == 1 ? "" : "s";
        return String.format("Bred %s animal%s.", objectArray);
    }

    private boolean f$E(EntityAnimal entityAnimal) {
        if (!entityAnimal.func_70631_g_() && !entityAnimal.isInLove()) {
            float f = 0.f$d.player.func_70032_d((Entity)entityAnimal);
            int n = 0.f$d.player.func_70685_l((Entity)entityAnimal) ? 6 : 3;
            if (f < (float)n) {
                return true;
            }
        }
        return false;
    }
}
package net.futureclient.client;

import java.util.concurrent.TimeUnit;

public final class gG {
    private long f$d;

    public long f$a() {
        gG gG2;
        return gG2.f$d;
    }

    public boolean f$E(long l) {
        return 0.f$E(l, TimeUnit.MILLISECONDS);
    }

    public void f$E() {
        0.f$d = System.nanoTime();
    }

    public long f$E(TimeUnit timeUnit) {
        return timeUnit.convert(System.nanoTime() - 0.f$d, TimeUnit.NANOSECONDS);
    }

    public long f$E() {
        gG gG2;
        return gG2.f$E(TimeUnit.MILLISECONDS);
    }

    public gG() {
        gG gG2;
    }

    public boolean f$E(long l, TimeUnit timeUnit) {
        long l2 = timeUnit.convert(System.nanoTime() - 0.f$d, TimeUnit.NANOSECONDS);
        if (l2 >= l) {
            0.f$E();
        }
        return l2 >= l;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).append(stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (2 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int n5 = 3 << 3 ^ 5;
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Ke;
import net.futureclient.client.LE;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;

public class gg
extends Ha<Ke> {
    public final LE f$d;

    @Override
    public void f$E(Ke ke) {
        CPacketPlayerDigging cPacketPlayerDigging;
        if (ke.f$E() instanceof CPacketPlayerDigging && (cPacketPlayerDigging = (CPacketPlayerDigging)ke.f$E()).getAction().equals((Object)CPacketPlayerDigging.Action.START_DESTROY_BLOCK)) {
            LE.f$E().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, cPacketPlayerDigging.getPosition(), cPacketPlayerDigging.getFacing()));
        }
    }

    public gg(LE lE) {
        0.f$d = lE;
    }
}
