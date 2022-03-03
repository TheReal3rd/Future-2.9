package net.futureclient.client;

public enum Hg {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Hg() {
        Hg hg;
    }
}
package net.futureclient.client;

public enum HG {
    f$a,
    f$C,
    f$e,
    f$I,
    f$K,
    f$b,
    f$j,
    f$i,
    f$M,
    f$g;


    public int f$E() {
        HG hG;
        return hG.ordinal();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HG() {
        HG hG;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;

public class hg
extends RF {
    private final BlockPos f$d;
    private final IBlockState f$g;

    public BlockPos f$E() {
        hg hg2;
        return hg2.f$d;
    }

    public IBlockState f$E() {
        hg hg2;
        return hg2.f$g;
    }

    public hg(IBlockState iBlockState, BlockPos blockPos) {
        hg hg2 = 0;
        hg2.f$g = iBlockState;
        hg2.f$d = blockPos;
    }
}
