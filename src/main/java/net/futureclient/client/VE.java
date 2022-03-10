package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRenderLayer;

public class VE
extends RF {
    private BlockRenderLayer f$d;
    private final Block f$g;

    public void f$E(BlockRenderLayer blockRenderLayer) {
        0.f$d = blockRenderLayer;
    }

    public BlockRenderLayer f$E() {
        VE vE;
        return vE.f$d;
    }

    public VE(Block block) {
        VE vE = 0;
        vE.f$d = null;
        vE.f$g = block;
    }

    public Block f$E() {
        VE vE;
        return vE.f$g;
    }
}
package net.futureclient.client;

import net.futureclient.client.aE;
import net.minecraft.network.Packet;

public final class ve
extends aE {
    public ve(Packet<?> packet) {
        super(packet);
    }
}
