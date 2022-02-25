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

import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.kH;
import net.futureclient.client.kg;
import net.futureclient.client.sE;
import net.futureclient.client.wD;
import net.minecraft.block.BlockSign;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;

public class Ve
extends Ha<sE> {
    public final kg f$d;

    public Ve(kg kg2) {
        0.f$d = kg2;
    }

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        if (kg.f$l().objectMouseOver != null && kg.f$k().objectMouseOver.typeOfHit == RayTraceResult.Type.BLOCK) {
            boolean bl;
            BlockPos blockPos = kg.f$b().objectMouseOver.getBlockPos();
            IBlockState iBlockState = kg.f$F().world.func_180495_p(blockPos);
            BlockPos blockPos2 = blockPos;
            int n = blockPos2.func_177958_n();
            int n2 = blockPos2.func_177956_o();
            int n3 = blockPos2.func_177952_p();
            IBlockState iBlockState2 = kg.f$G().world.func_180495_p(new BlockPos((double)n, (double)n2 + 1.0, (double)n3));
            IBlockState iBlockState3 = kg.f$D().world.func_180495_p(new BlockPos((double)n, (double)n2 + 2.0, (double)n3));
            boolean bl2 = !(iBlockState.getBlock() instanceof BlockSign) && iBlockState.func_185904_a().isSolid();
            boolean bl3 = iBlockState2.getBlock() instanceof BlockSign || !iBlockState2.func_185904_a().isSolid();
            boolean bl4 = bl = iBlockState3.getBlock() instanceof BlockSign || !iBlockState3.func_185904_a().isSolid();
            if (iBlockState.func_185904_a() != Material.AIR && bl2 && bl3 && bl) {
                kg.f$E(0.f$d, true);
                Uh.f$B();
                GlStateManager.pushMatrix();
                GlStateManager.enableBlend();
                wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
                double d = iBlockState.func_185900_c((IBlockAccess)kg.f$g().world, (BlockPos)kg.f$E((kg)0.f$d)).maxY;
                RenderGlobal.renderFilledBox((double)((double)n - ((K)kg.f$m().getRenderManager()).getRenderPosX()), (double)((double)n2 + d - ((K)kg.f$f().getRenderManager()).getRenderPosY()), (double)((double)n3 - ((K)kg.f$L().getRenderManager()).getRenderPosZ()), (double)((double)n - ((K)kg.f$i().getRenderManager()).getRenderPosX() + 1.0), (double)((double)n2 + d + 0.1 - ((K)kg.f$c().getRenderManager()).getRenderPosY()), (double)((double)n3 - ((K)kg.f$I().getRenderManager()).getRenderPosZ() + 1.0), (float)((float)wD2.f$a.getRed() / 255.0f), (float)((float)wD2.f$a.getGreen() / 255.0f), (float)((float)wD2.f$a.getBlue() / 255.0f), (float)120.0f);
                GL11.glColor4d((double)((float)wD2.f$a.getRed() / 255.0f), (double)((float)wD2.f$a.getGreen() / 255.0f), (double)((float)wD2.f$a.getBlue() / 255.0f), (double)0.47058823704719543);
                Uh.f$E(new AxisAlignedBB((double)n - ((K)kg.f$j().getRenderManager()).getRenderPosX(), (double)n2 + d - ((K)kg.f$M().getRenderManager()).getRenderPosY(), (double)n3 - ((K)kg.f$C().getRenderManager()).getRenderPosZ(), (double)n - ((K)kg.f$H().getRenderManager()).getRenderPosX() + 1.0, (double)n2 + d + 0.1 - ((K)kg.f$h().getRenderManager()).getRenderPosY(), (double)n3 - ((K)kg.f$A().getRenderManager()).getRenderPosZ() + 1.0));
                GlStateManager.disableBlend();
                GlStateManager.popMatrix();
                Uh.f$e();
                return;
            }
            kg.f$E(0.f$d, false);
        }
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
