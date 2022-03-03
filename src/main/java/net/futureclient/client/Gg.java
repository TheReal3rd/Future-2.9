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
