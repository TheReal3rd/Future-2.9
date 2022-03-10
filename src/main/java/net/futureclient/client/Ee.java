package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class EE
extends RF {
    private float f$M;
    private int f$K;
    public BlockPos f$d;
    private EnumFacing f$g;
    private int f$b;
    private int f$j;
    private int f$i;

    public void f$B(int n) {
        0.f$K = n;
    }

    public int f$a() {
        EE eE;
        return eE.f$j;
    }

    public void f$a(int n) {
        0.f$j = n;
    }

    public EnumFacing f$E() {
        EE eE;
        return eE.f$g;
    }

    public void f$e(int n) {
        0.f$b = n;
    }

    public int f$e() {
        EE eE;
        return eE.f$b;
    }

    public int f$E() {
        EE eE;
        return eE.f$i;
    }

    public BlockPos f$E() {
        EE eE;
        return eE.f$d;
    }

    public void f$E(int n) {
        0.f$i = n;
    }

    public int f$B() {
        EE eE;
        return eE.f$K;
    }

    public void f$E(EnumFacing enumFacing) {
        0.f$g = enumFacing;
    }

    public EE(int n, int n2, int n3, int n4, float f, EnumFacing enumFacing, BlockPos blockPos) {
        EE eE = 0;
        EE eE2 = 0;
        EE eE3 = 0;
        0.f$K = n;
        eE3.f$b = n2;
        eE3.f$j = n3;
        eE2.f$i = n4;
        eE2.f$M = f;
        eE.f$g = enumFacing;
        eE.f$d = blockPos;
    }

    public Block f$E() {
        EE eE;
        return Minecraft.getMinecraft().world.func_180495_p(eE.f$d).getBlock();
    }

    public void f$E(float f) {
        0.f$M = f;
    }

    public float f$E() {
        EE eE;
        return eE.f$M;
    }
}
