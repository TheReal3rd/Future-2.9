package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class HD
extends RF {
    private EnumFacing f$d;
    private BlockPos f$g;

    public HD(BlockPos blockPos, EnumFacing enumFacing) {
        HD hD = 0;
        hD.f$g = blockPos;
        hD.f$d = enumFacing;
    }

    public BlockPos f$E() {
        HD hD;
        return hD.f$g;
    }

    public EnumFacing f$E() {
        HD hD;
        return hD.f$d;
    }
}
