package net.futureclient.client;

import net.futureclient.client.AD;
import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.VH;
import net.futureclient.client.jf;
import net.futureclient.client.sh;
import net.minecraft.network.play.server.SPacketPlayerListItem;

public class ZF
extends Ha<jf> {
    public final AD f$d;

    @Override
    public void f$E(jf jf2) {
        Object object = jf2.f$E();
        if (object instanceof SPacketPlayerListItem && (object = (SPacketPlayerListItem)object).getAction() == SPacketPlayerListItem.Action.UPDATE_LATENCY) {
            for (SPacketPlayerListItem.AddPlayerData addPlayerData : object.getEntries()) {
                if (AD.f$B().getConnection().getPlayerInfo(addPlayerData.getProfile().getId()) != null || AD.f$E(0.f$d, addPlayerData.getProfile().getId()) || !AD.f$E(0.f$d).f$E(1000L)) continue;
                sh.f$E(() -> {
                    String string = VH.f$B(addPlayerData.getProfile().getId());
                    AD.f$e().addScheduledTask(() -> La.f$E().f$E(new StringBuilder().insert(0, string).append(" is vanished.").toString()));
                });
                AD.f$E(0.f$d).f$E();
            }
        }
    }

    public ZF(AD aD) {
        0.f$d = aD;
    }
}
package net.futureclient.client;

import java.util.StringJoiner;
import net.futureclient.client.AD;
import net.futureclient.client.GA;
import net.futureclient.client.VH;

public class Zf
extends GA {
    public final AD f$d;

    public Zf(AD aD, String[] stringArray) {
        0.f$d = aD;
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        if (0.f$d.f$E()) {
            if (AD.f$E(0.f$d).size() > 0) {
                StringJoiner stringJoiner = new StringJoiner(", ");
                AD.f$E(0.f$d).forEach(uUID -> stringJoiner.add(VH.f$B(uUID)));
                return String.format("Vanished users: %s.", stringJoiner.toString());
            }
            return "There are no vanished users.";
        }
        return "AntiVanish is not enabled.";
    }

    @Override
    public String f$E() {
        return null;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class zf
extends RF {
    private final BlockPos f$M;
    private AxisAlignedBB f$d;
    private final Entity f$g;
    private final Block f$i;

    public BlockPos f$E() {
        zf zf2;
        return zf2.f$M;
    }

    public Block f$E() {
        zf zf2;
        return zf2.f$i;
    }

    public Entity f$E() {
        zf zf2;
        return zf2.f$g;
    }

    public void f$E(AxisAlignedBB axisAlignedBB) {
        0.f$d = axisAlignedBB;
    }

    public AxisAlignedBB f$E() {
        zf zf2;
        return zf2.f$d;
    }

    public zf(Block block, BlockPos blockPos, AxisAlignedBB axisAlignedBB) {
        0(block, blockPos, null, axisAlignedBB);
    }

    public zf(Block block, BlockPos blockPos, Entity entity, AxisAlignedBB axisAlignedBB) {
        zf zf2 = 0;
        zf zf3 = 0;
        zf3.f$i = block;
        zf3.f$M = blockPos;
        zf2.f$g = entity;
        zf2.f$d = axisAlignedBB;
    }
}
package net.futureclient.client;

import net.futureclient.client.kF;

public class zF {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            zF.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zF.f$d[kF.f$g.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
