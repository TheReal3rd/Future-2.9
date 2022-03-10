package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.futureclient.client.Pg;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockNote;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class CG {
    private static Minecraft f$d;

    public static boolean f$e(BlockPos blockPos) {
        return CG.f$E(blockPos, false) != null;
    }

    static {
        f$d = Minecraft.getMinecraft();
    }

    public static boolean f$a() {
        IBlockState iBlockState = CG.f$E(Block.class, MathHelper.floor((double)(Pg.f$E().getEntityBoundingBox().minY - 0.01)));
        return iBlockState != null && iBlockState.func_185904_a().blocksMovement();
    }

    public static boolean f$a(BlockPos blockPos) {
        return Pg.f$E().getEntityBoundingBox().minY >= (double)blockPos.func_177956_o();
    }

    public static List<BlockPos> f$E(Vec3d vec3d, double d) {
        double d2;
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        double d3 = d2 = vec3d.x - d;
        while (d3 <= vec3d.x + d) {
            double d4 = vec3d.y - d;
            while (d4 <= vec3d.y + d) {
                double d5;
                double d6 = vec3d.z - d;
                while (d6 <= vec3d.z + d) {
                    double d7;
                    arrayList.add(new BlockPos((int)d2, (int)d5, (int)d7));
                    d6 = d7 += 1.0;
                }
                d4 = d5 + 1.0;
            }
            d3 = d2 + 1.0;
        }
        return arrayList;
    }

    public static IBlockState f$E(double d) {
        return CG.f$d.world.func_180495_p(new BlockPos(CG.f$d.player.field_70165_t, CG.f$d.player.field_70163_u - d, CG.f$d.player.field_70161_v));
    }

    public static boolean f$e() {
        return CG.f$d.world.func_184144_a((Entity)CG.f$d.player, CG.f$d.player.func_174813_aQ().offset(0.0, 0.21, 0.0)).size() > 0;
    }

    private static IBlockState f$E(Class<? extends Block> clazz, int n) {
        int n2;
        int n3 = n2 = MathHelper.floor((double)Pg.f$E().getEntityBoundingBox().minX);
        while (n3 < MathHelper.ceil((double)Pg.f$E().getEntityBoundingBox().maxX)) {
            int n4 = MathHelper.floor((double)Pg.f$E().getEntityBoundingBox().minZ);
            while (n4 < MathHelper.ceil((double)Pg.f$E().getEntityBoundingBox().maxZ)) {
                int n5;
                IBlockState iBlockState = CG.f$d.world.func_180495_p(new BlockPos(n2, n, n5));
                if (clazz.isInstance(iBlockState.getBlock())) {
                    return iBlockState;
                }
                n4 = ++n5;
            }
            n3 = ++n2;
        }
        return null;
    }

    public CG() {
        CG cG;
    }

    public static boolean f$E(boolean bl) {
        return CG.f$E(MathHelper.floor((double)(Pg.f$E().getEntityBoundingBox().minY - (bl ? 0.03 : 0.2))));
    }

    public static double f$E(BlockPos blockPos) {
        return CG.f$d.player.func_174818_b(blockPos);
    }

    private static boolean f$E(int n) {
        return CG.f$E(BlockLiquid.class, n) != null;
    }

    public static IBlockState f$a(double d) {
        return CG.f$d.world.func_180495_p(new BlockPos(CG.f$d.player.field_70165_t, CG.f$d.player.field_70163_u + d, CG.f$d.player.field_70161_v));
    }

    public static EnumFacing f$E(BlockPos blockPos) {
        return CG.f$E(blockPos, true);
    }

    public static boolean f$E() {
        return CG.f$E(MathHelper.floor((double)(Pg.f$E().getEntityBoundingBox().minY + 0.01)));
    }

    public static boolean f$E(BlockPos blockPos) {
        TileEntity tileEntity;
        Block block;
        block1: {
            block = CG.f$d.world.func_180495_p(blockPos).getBlock();
            TileEntity tileEntity2 = null;
            for (TileEntity tileEntity3 : CG.f$d.world.field_147482_g) {
                if (!tileEntity3.getPos().equals((Object)blockPos)) continue;
                tileEntity = tileEntity2 = tileEntity3;
                break block1;
            }
            tileEntity = tileEntity2;
        }
        return tileEntity == null && !(block instanceof BlockBed) && !(block instanceof BlockNote) && !(block instanceof BlockDoor) && !(block instanceof BlockTrapDoor) && !(block instanceof BlockFenceGate) && !(block instanceof BlockButton) && !(block instanceof BlockAnvil) && !(block instanceof BlockWorkbench) && !(block instanceof BlockCake) && !(block instanceof BlockRedstoneDiode);
    }

    public static void f$E(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos;
        double d = (double)blockPos2.func_177958_n() + 0.5 - CG.f$d.player.field_70165_t;
        double d2 = (double)blockPos2.func_177956_o() + 0.5 - (CG.f$d.player.field_70163_u + (double)CG.f$d.player.func_70047_e());
        double d3 = (double)blockPos2.func_177952_p() + 0.5 - CG.f$d.player.field_70161_v;
        double d4 = d;
        double d5 = d3;
        double d6 = MathHelper.sqrt((double)(d4 * d4 + d5 * d5));
        float f = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f + new Random().nextFloat() * 2.0f - 1.0f;
        float f2 = (float)(-(Math.atan2(d2, d6) * 180.0 / Math.PI)) + new Random().nextFloat() * 2.0f - 1.0f;
        CG.f$d.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(CG.f$d.player.field_70177_z + MathHelper.wrapDegrees((float)(f - CG.f$d.player.field_70177_z)), CG.f$d.player.field_70125_A + MathHelper.wrapDegrees((float)(f2 - CG.f$d.player.field_70125_A)), CG.f$d.player.field_70122_E));
    }

    public static EnumFacing f$E(BlockPos blockPos, boolean bl) {
        int n;
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n2 = enumFacingArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            EnumFacing enumFacing = enumFacingArray[n];
            RayTraceResult rayTraceResult = CG.f$d.world.func_147447_a(new Vec3d(CG.f$d.player.field_70165_t, CG.f$d.player.field_70163_u + (double)CG.f$d.player.func_70047_e(), CG.f$d.player.field_70161_v), new Vec3d((double)blockPos.func_177958_n() + 0.5 + (double)enumFacing.getDirectionVec().getX() * 1.0 / 2.0, (double)blockPos.func_177956_o() + 0.5 + (double)enumFacing.getDirectionVec().getY() * 1.0 / 2.0, (double)blockPos.func_177952_p() + 0.5 + (double)enumFacing.getDirectionVec().getZ() * 1.0 / 2.0), false, true, false);
            if (rayTraceResult != null && rayTraceResult.typeOfHit.equals((Object)RayTraceResult.Type.BLOCK) && rayTraceResult.getBlockPos().equals((Object)blockPos)) {
                return enumFacing;
            }
            n3 = ++n;
        }
        if (bl) {
            if ((double)blockPos.func_177956_o() > CG.f$d.player.field_70163_u + (double)CG.f$d.player.func_70047_e()) {
                return EnumFacing.DOWN;
            }
            return EnumFacing.UP;
        }
        return null;
    }
}
package net.futureclient.client;

public enum cg {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cg() {
        cg cg2;
    }
}
