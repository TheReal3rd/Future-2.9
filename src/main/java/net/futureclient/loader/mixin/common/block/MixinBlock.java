package net.futureclient.loader.mixin.common.block;

import java.util.List;
import javax.annotation.Nullable;
import net.futureclient.client.ba;
import net.futureclient.client.ie;
import net.futureclient.client.kH;
import net.futureclient.client.zf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Block.class})
public abstract class MixinBlock {
    @Shadow
    @Final
    public Material field_149764_J;
    private static final Minecraft f$d = Minecraft.getMinecraft();

    public MixinBlock() {
        MixinBlock mixinBlock;
    }

    @Shadow
    @Deprecated
    public abstract boolean func_176225_a(IBlockState var1, IBlockAccess var2, BlockPos var3, EnumFacing var4);

    @Shadow
    public static void func_185492_a(BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable AxisAlignedBB blockBox) {
    }

    @Inject(method={"addCollisionBoxToList(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Deprecated
    private void f$E(IBlockState iBlockState, World world, BlockPos blockPos, AxisAlignedBB axisAlignedBB, List<AxisAlignedBB> list, Entity entity, boolean bl, CallbackInfo callbackInfo) {
        Block block = (Block)0;
        AxisAlignedBB 02 = block.getCollisionBoundingBox(iBlockState, (IBlockAccess)world, blockPos);
        zf 03 = new zf(block, blockPos, entity, 02);
        kH.f$E().f$E().f$E(03);
        if (02 != 03.f$E()) {
            02 = 03.f$E();
        }
        if (02 != null && axisAlignedBB.intersects(02)) {
            list.add(02);
        }
        MixinBlock.func_185492_a(blockPos, axisAlignedBB, list, 02);
        callbackInfo.cancel();
    }

    @Inject(method={"addCollisionBoxToList(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/util/math/AxisAlignedBB;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private static void f$E(BlockPos blockPos, AxisAlignedBB axisAlignedBB, List<AxisAlignedBB> list, AxisAlignedBB axisAlignedBB2, CallbackInfo callbackInfo) {
        if (axisAlignedBB2 != Block.NULL_AABB) {
            AxisAlignedBB axisAlignedBB3 = axisAlignedBB2.offset(blockPos);
            zf 02 = new zf(MixinBlock.f$d.world != null ? MixinBlock.f$d.world.func_180495_p(blockPos).getBlock() : null, blockPos, axisAlignedBB3);
            kH.f$E().f$E().f$E(02);
            if (axisAlignedBB3 != 02.f$E()) {
                axisAlignedBB3 = 02.f$E();
            }
            if (axisAlignedBB3 != null && axisAlignedBB.intersects(axisAlignedBB3)) {
                list.add(axisAlignedBB3);
            }
        }
        callbackInfo.cancel();
    }

    @Inject(method={"getAmbientOcclusionLightValue"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        ba ba2 = (ba)kH.f$E().f$E().f$E(ba.class);
        if (ba2 != null && ba2.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(1.0f));
        }
    }

    @Inject(method={"onBlockPlacedBy"}, at={@At(value="HEAD")})
    private void f$E(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack, CallbackInfo callbackInfo) {
        kH.f$E().f$E().f$E(new ie(entityLivingBase, blockPos, itemStack));
    }
}
