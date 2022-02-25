package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Y;
import net.futureclient.client.ic;
import net.futureclient.client.kH;
import net.futureclient.client.lc;
import net.futureclient.client.q;

public class JA
extends Ha<ME> {
    public final lc f$d;

    public JA(lc lc2) {
        0.f$d = lc2;
    }

    @Override
    public void f$E(ME mE) {
        ic ic2;
        if (lc.f$a().player.func_184187_bx() != null) {
            lc.f$E(0.f$d).f$a();
        }
        if (0.f$d.f$I.f$E().booleanValue() && lc.f$E(0.f$d) == 0 && (ic2 = (ic)kH.f$E().f$E().f$E(ic.class)) != null && !ic2.f$E()) {
            ((q)((Y)lc.f$E()).getTimer()).f$E(1.0f);
        }
    }
}
package net.futureclient.client;

import java.util.List;
import net.futureclient.client.HD;
import net.futureclient.client.Ha;
import net.futureclient.client.ia;
import net.futureclient.client.ta;
import net.minecraft.block.state.IBlockState;

public class ja
extends Ha<HD> {
    public final ta f$d;

    public ja(ta ta2) {
        0.f$d = ta2;
    }

    @Override
    public void f$E(HD hD) {
        if (((ia)((Object)ta.f$E(0.f$d).f$E())).equals((Object)ia.f$i) && ((Boolean)ta.f$E(0.f$d).f$E()).booleanValue() && ta.f$E(0.f$d).f$E(50L)) {
            IBlockState iBlockState = ta.f$E().world.func_180495_p(hD.f$E());
            List list = (List)ta.f$E(0.f$d).f$E();
            if (!list.contains(iBlockState)) {
                list.add(iBlockState);
                ta.f$E(0.f$d).f$a();
            }
        }
    }
}
package net.futureclient.client;

import java.util.concurrent.CopyOnWriteArrayList;
import net.futureclient.client.Ha;
import net.futureclient.client.PC;
import net.futureclient.client.hg;
import net.futureclient.client.zA;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;

public class jA
extends Ha<hg> {
    public final zA f$d;

    public jA(zA zA2) {
        0.f$d = zA2;
    }

    @Override
    public void f$E(hg hg2) {
        if (((Boolean)zA.f$e(0.f$d).f$E()).booleanValue()) {
            PC pC;
            BlockPos blockPos = hg2.f$E();
            PC pC2 = null;
            try {
                pC = pC2 = zA.f$E(0.f$d, blockPos);
            }
            catch (NullPointerException nullPointerException) {
                pC = pC2;
            }
            if (pC != null && !((CopyOnWriteArrayList)zA.f$E(0.f$d)).contains(blockPos)) {
                ((CopyOnWriteArrayList)zA.f$E(0.f$d)).add(new BlockPos((Vec3i)blockPos));
            }
        }
    }
}
