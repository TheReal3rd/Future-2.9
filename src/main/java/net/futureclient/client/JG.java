package net.futureclient.client;

import net.futureclient.client.ki;

public final class JG {
    private static ki f$d;

    public static ki f$E() {
        return f$d;
    }

    public static void f$E(ki ki2) {
        f$d = ki2;
    }

    public JG() {
        JG jG;
    }

    static {
        f$d = ki.f$i;
    }
}
package net.futureclient.client;

public enum Jg {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Jg() {
        Jg jg;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.qE;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class jg
extends Ha<Pf> {
    public final qE f$d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(Pf pf) {
        switch (pf.f$E()) {
            case f$g: {
                int n;
                if (qE.f$a(0.f$d, qE.f$I().player.func_184614_ca()) && qE.f$j().player.func_184612_cw() > qE.f$a(0.f$d).f$E().intValue() - 1 && qE.f$a(0.f$d).f$E().intValue() < 25) {
                    int n2;
                    int n3 = n2 = 0;
                    while (true) {
                        if (n3 >= 32) {
                            qE.f$H().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.RELEASE_USE_ITEM, new BlockPos(0, 0, 0), EnumFacing.DOWN));
                            qE.f$h().player.func_184597_cx();
                            return;
                        }
                        qE.f$C().player.connection.sendPacket((Packet)new CPacketPlayer(qE.f$M().player.field_70122_E));
                        n3 = ++n2;
                    }
                }
                if (!qE.f$E(0.f$d, qE.f$A().player.func_184614_ca()) || qE.f$K().player.func_184612_cw() <= qE.f$E(0.f$d).f$E().intValue() - 1 || qE.f$E(0.f$d).f$E().intValue() >= 25) return;
                int n4 = n = 0;
                while (n4 < 24) {
                    qE.f$e().player.connection.sendPacket((Packet)new CPacketPlayer(qE.f$B().player.field_70122_E));
                    n4 = ++n;
                }
                qE.f$a().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.RELEASE_USE_ITEM, new BlockPos(0, 0, 0), EnumFacing.DOWN));
                qE.f$E().player.func_184597_cx();
                return;
            }
        }
    }

    public jg(qE qE2) {
        0.f$d = qE2;
    }
}
package net.futureclient.client;

import net.minecraft.util.text.TextFormatting;

public enum jG {
    f$K("Non-Premium", TextFormatting.YELLOW),
    f$b("Premium", TextFormatting.GREEN),
    f$j("Premium", TextFormatting.GREEN),
    f$i("Generated", TextFormatting.BLUE);

    private TextFormatting f$g;
    private String f$M;

    public String f$E() {
        jG jG2;
        return jG2.f$M;
    }

    public TextFormatting f$E() {
        jG jG2;
        return jG2.f$g;
    }

    /*
     * WARNING - void declaration
     */
    private jG(String string2, TextFormatting string2) {
        jG jG2;
        jG jG3 = jG2;
        jG3.f$M = 0;
        jG3.f$g = 0;
    }
}
