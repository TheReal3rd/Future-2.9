package net.futureclient.client.deof.utils.game;

import net.futureclient.client.Pg;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.*;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class EntityUtils {//TODO complete this.
    public static Minecraft mc;//OG f$M
    private static final Comparator<Entity> f$g;//OG f$g
    private static final Comparator<va> f$d;//OG f$d

    public static Entity getRidingEntity() {
        if (mc.player.getRidingEntity() != null && !(mc.player.getRidingEntity() instanceof EntityBoat)) {
            return mc.player.getRidingEntity();
        }
        return mc.player;
    }

    public static int getDestroySpeed(IBlockState iBlockState) {
        int n;
        int n2 = -1;
        float f = 1.0f;
        if (iBlockState.getMaterial() == Material.AIR) return -1;

        int n3 = n = 0;
        while (n3 < 36) {
            try {
                ItemStack itemStack = mc.player.inventory.getStackInSlot(n);
                if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getDestroySpeed(iBlockState) > f) {
                    f = itemStack.getDestroySpeed(iBlockState);
                    n2 = n;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            n3 = n = (int)((byte)(n + 1));
        }
        return n2;
    }

    public static boolean f$a(Entity entity) {
        return Pg.f$E(entity) == Pg.f$E((Entity)mc.player);
    }

    public static void setRidingEntityStrafe(double d) {
        if (mc.player.getRidingEntity() != null) {
            MovementInput movementInput = mc.player.movementInput;
            double d2 = movementInput.moveForward;
            double d3 = movementInput.moveStrafe;
            float f = mc.player.rotationYaw;
            if (d2 == 0.0 && d3 == 0.0) {
                mc.player.getRidingEntity().motionX = 0.0;
                mc.player.getRidingEntity().motionZ = 0.0;
                return;
            }
            if (d2 != 0.0) {
                if (d3 > 0.0) {
                    f += (float)(d2 > 0.0 ? -45 : 45);
                } else if (d3 < 0.0) {
                    f += (float)(d2 > 0.0 ? 45 : -45);
                }
                d3 = 0.0;
                if (d2 > 0.0) {
                    d2 = 1.0;
                } else if (d2 < 0.0) {
                    d2 = -1.0;
                }
            }
            mc.player.getRidingEntity().motionX = d2 * d * Math.cos(Math.toRadians(f + 90.0f)) + d3 * d * Math.sin(Math.toRadians(f + 90.0f));
            mc.player.getRidingEntity().motionZ = d2 * d * Math.sin(Math.toRadians(f + 90.0f)) - d3 * d * Math.cos(Math.toRadians(f + 90.0f));
        }
    }

    public static boolean isDead(Entity entity) {
        return !entity.isDead && (!(entity instanceof EntityLivingBase) || Float.isNaN(((EntityLivingBase)entity).getHealth()) || ((EntityLivingBase)entity).getHealth() > 0.0f);
    }

    public static int getDestroySpeed2(IBlockState iBlockState) {
        int n;
        int n2 = -1;
        float f = 1.0f;
        if (iBlockState.getMaterial() == Material.AIR) {
            return -1;
        }
        int n3 = n = 0;
        while (n3 < 36) {
            try {
                ItemStack itemStack = mc.player.inventory.getStackInSlot(n);
                if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getDestroySpeed(iBlockState) > f && mc.player.inventoryContainer.getSlot(n).getStack().getMaxDamage() - mc.player.inventoryContainer.getSlot(n).getStack().getItemDamage() > 5) {
                    f = itemStack.getDestroySpeed(iBlockState);
                    n2 = n;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            n3 = n = (int)((byte)(n + 1));
        }
        return n2;
    }

    public static boolean isKeysDown() {
        return mc.player.movementInput.forwardKeyDown || mc.player.movementInput.backKeyDown || mc.player.movementInput.leftKeyDown || mc.player.movementInput.rightKeyDown || mc.player.movementInput.jump || mc.player.movementInput.sneak;
    }

    public static boolean isMoving() {
        return (double)mc.player.moveForward != 0.0 || (double)mc.player.moveStrafing != 0.0;
    }

    public static double getJumpAmp() {
        double d = 0.0;
        if (mc.player.isPotionActive(MobEffects.JUMP_BOOST)) {
            int n = mc.player.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier();
            d += (double)(n + 1) * 0.1;
        }
        return d;
    }

    public static boolean isEntityMoving(Entity entity) {
        return entity.posX != entity.lastTickPosX || entity.posY != entity.lastTickPosY || entity.posZ != entity.lastTickPosZ || isKeysDown();
    }

    public static EnumHand isHoldingItem(Class<? extends Item> clazz) {
        int n;
        EnumHand[] enumHandArray = EnumHand.values();
        int n2 = enumHandArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            EnumHand enumHand = enumHandArray[n];
            if (clazz.isInstance(mc.player.getHeldItem(enumHand).getItem())) {
                return enumHand;
            }
            n3 = ++n;
        }
        return null;
    }

    public static ItemStack isPlayerHoldingItem(Class<? extends Item> clazz) {
        return Pg.f$E(mc.player, clazz);
    }

    public static boolean missingArmour(EntityPlayer entityPlayer) {
        ItemStack itemStack = entityPlayer.inventory.armorInventory.get(0);
        ItemStack itemStack2 = entityPlayer.inventory.armorInventory.get(1);
        ItemStack itemStack3 = entityPlayer.inventory.armorInventory.get(2);
        ItemStack itemStack4 = entityPlayer.inventory.armorInventory.get(3);
        return !(itemStack.getItem() instanceof ItemAir) || !(itemStack2.getItem() instanceof ItemAir) || !(itemStack3.getItem() instanceof ItemAir) || !(itemStack4.getItem() instanceof ItemAir);
    }

    public static EnumHand findItemInHand(Item item) {
        int n;
        EnumHand[] enumHandArray = EnumHand.values();
        int n2 = enumHandArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            EnumHand enumHand = enumHandArray[n];
            if (item.equals(mc.player.getHeldItem(enumHand).getItem())) {
                return enumHand;
            }
            n3 = ++n;
        }
        return null;
    }

    public static EnumFacing getFacing(float f, float f2, float f3) {
        return EnumFacing.getFacingFromVector((float)f, (float)f2, (float)f3);
    }

    public static boolean isHoldingTool() {
        if (mc.player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof ItemAir) {
            return false;
        }
        Item item = mc.player.getHeldItem(EnumHand.MAIN_HAND).getItem();
        return item instanceof ItemTool || item instanceof ItemSword;
    }

    public static String getPlayerFacing() {
        if (mc.getRenderViewEntity() == null) {
            return mc.player.getHorizontalFacing().name();
        }
        return mc.getRenderViewEntity().getHorizontalFacing().name();
    }

    public static Comparator<va> f$E() {
        return f$d;
    }

    public static boolean f$E(Entity entity, sG sG2) {//TODO work on this enum and Math Util
        return mc.world.rayTraceBlocks(new Vec3d(mc.player.posX, mc.player.posY + (double)mc.player.getEyeHeight(), mc.player.posZ), new Vec3d(entity.posX, entity.posY + (double)entity.getEyeHeight() - (double)TH.f$E(sG2), entity.posZ), false, true, false) == null;
    }

    public static void useShield2() {
        if (mc.player != null && mc.player.getHeldItemOffhand().getItem() instanceof ItemShield) {
            mc.player.connection.sendPacket(new CPacketPlayerDigging(CPacketPlayerDigging.Action.RELEASE_USE_ITEM, new BlockPos(mc.player), EnumFacing.getFacingFromVector((float)((int)mc.player.posX), (float)((int)mc.player.posY), (float)((int)mc.player.posZ))));
        }
    }

    public static void centerPlayer(double[] dArray, BlockPos blockPos, double d) {
        double d2 = dArray[0];
        double d3 = dArray[1];
        double d4 = dArray[2];
        double d5 = (double)blockPos.getX() + 0.5;
        double d6 = (double)blockPos.getY() + 1.0;
        double d7 = (double)blockPos.getZ() + 0.5;
        double d8 = Math.abs(d2 - d5) + Math.abs(d3 - d6) + Math.abs(d4 - d7);
        int blockPos3 = 0;
        double d9 = d8;
        while (d9 > d) {
            double d10;
            double d11;
            d8 = Math.abs(d2 - d5) + Math.abs(d3 - d6) + Math.abs(d4 - d7);
            if (blockPos3 > 120) {
                return;
            }
            double d12 = d2 - d5;
            double d13 = d3 - d6;
            double d14 = d4 - d7;
            double d15 = (blockPos3 & 1) == 0 ? 0.4 : 0.25;
            double d16 = Math.min(Math.abs(d12), d15);
            if (d12 < 0.0) {
                d2 += d16;
                d11 = d13;
            } else {
                if (d12 > 0.0) {
                    d2 -= d16;
                }
                d11 = d13;
            }
            d12 = Math.min(Math.abs(d11), 0.25);
            if (d13 < 0.0) {
                d3 += d12;
                d10 = d14;
            } else {
                if (d13 > 0.0) {
                    d3 -= d12;
                }
                d10 = d14;
            }
            d12 = Math.min(Math.abs(d10), d15);
            if (d14 < 0.0) {
                d4 += d12;
            } else if (d14 > 0.0) {
                d4 -= d12;
            }
            ++blockPos3;
            mc.player.connection.sendPacket(new CPacketPlayer.Position(d2, d3, d4, true));
            d9 = d8;
        }
    }

    public static boolean isOnSameTeam(EntityLivingBase entityLivingBase) {
        return mc.player.isOnSameTeam(entityLivingBase);
    }

    public static double[] f$E(double d) {
        return Pg.f$E(mc.player, d);
    }

    public static void damageSelf() {
        int n;
        int n2 = n = 0;
        while (n2 < 81) {
            mc.player.connection.sendPacket(new CPacketPlayer.Position(mc.player.posX, mc.player.posY + 0.05, mc.player.posZ, false));
            mc.player.connection.sendPacket(new CPacketPlayer.Position(mc.player.posX, mc.player.posY, mc.player.posZ, false));
            n2 = ++n;
        }
    }

    public static UUID getHorseUUID(Entity entity) {
        if (entity instanceof EntityTameable) {
            return ((EntityTameable)entity).getOwnerId();
        }
        if (entity instanceof AbstractHorse) {
            return ((AbstractHorse)entity).getOwnerUniqueId();
        }
        return null;
    }

    public static String getPlayersDirection() {
        switch (mc.getRenderViewEntity() == null ? mc.player.getHorizontalFacing() : mc.getRenderViewEntity().getHorizontalFacing()) {
            case NORTH:
                return "-Z";
            case SOUTH:
                return "+Z";
            case EAST:
                return "+X";
            case WEST:
                return "-X";
        }
        return "";
    }

    public static double[] f$E(EntityPlayerSP 0, double 0) {
        block7: {
            block6: {
                v0 = 0;
                v1 = v0.movementInput;
                var4_2 = v1.moveForward;
                var6_3 = v1.moveStrafe;
                var3_4 = v0.rotationYaw;
                if (var4_2 != 0.0 || var6_3 != 0.0) break block6;
                var8_5 = 0.0;
                var10_6 = 0.0;
                break block7;
            }
            if (var4_2 == 0.0) ** GOTO lbl23
            if (var6_3 > 0.0) {
                var3_4 += (float)(var4_2 > 0.0 ? -45 : 45);
            } else if (var6_3 < 0.0) {
                var3_4 += (float)(var4_2 > 0.0 ? 45 : -45);
            }
            var6_3 = 0.0;
            if (var4_2 > 0.0) {
                v2 = var4_2 = 1.0;
            } else {
                if (var4_2 < 0.0) {
                    var4_2 = -1.0;
                }
                lbl23:
                // 4 sources

                v2 = var4_2;
            }
            var8_5 = v2 * 0 * Math.cos(Math.toRadians(var3_4 + 90.0f)) + var6_3 * 0 * Math.sin(Math.toRadians(var3_4 + 90.0f));
            var10_6 = var4_2 * 0 * Math.sin(Math.toRadians(var3_4 + 90.0f)) - var6_3 * 0 * Math.cos(Math.toRadians(var3_4 + 90.0f));
        }
        return new double[]{var8_5, var10_6};
    }

    public static Comparator<Entity> f$a() {
        return f$g;
    }

    public static ItemStack f$E(EntityLivingBase entityLivingBase, Class<? extends Item> clazz) {
        int n;
        EnumHand[] enumHandArray = EnumHand.values();
        int n2 = enumHandArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            EnumHand enumHand = enumHandArray[n];
            Item item = (enumHand = entityLivingBase.getHeldItem(enumHand)).getItem();
            if (clazz.isInstance(item)) {
                return enumHand;
            }
            n3 = ++n;
        }
        return null;
    }

    public static void f$E(Ee 0, double 0) {
        var3_2 = mc.player.movementInput.moveForward;
        var5_3 = mc.player.movementInput.moveStrafe;
        var7_4 = mc.player.rotationYaw;
        if (var3_2 == 0.0 && var5_3 == 0.0) {
            v0 = 0;
            v0.f$e(0.0);
            v0.f$E(0.0);
            return;
        }
        if (var3_2 == 0.0) ** GOTO lbl22
        if (var5_3 > 0.0) {
            var7_4 += (float)(var3_2 > 0.0 ? -45 : 45);
        } else if (var5_3 < 0.0) {
            var7_4 += (float)(var3_2 > 0.0 ? 45 : -45);
        }
        var5_3 = 0.0;
        if (var3_2 > 0.0) {
            var3_2 = 1.0;
            v1 = 0;
        } else {
            if (var3_2 < 0.0) {
                var3_2 = -1.0;
            }
            lbl22:
            // 4 sources

            v1 = 0;
        }
        v1.f$e(var3_2 * 0 * Math.cos(Math.toRadians(var7_4 + 90.0f)) + var5_3 * 0 * Math.sin(Math.toRadians(var7_4 + 90.0f)));
        0.f$E(var3_2 * 0 * Math.sin(Math.toRadians(var7_4 + 90.0f)) - var5_3 * 0 * Math.cos(Math.toRadians(var7_4 + 90.0f)));
    }

    static {
        mc = Minecraft.getMinecraft();
        f$g = Comparator.comparing(entity -> Float.valueOf(entity.getDistance((Entity)mc.player))).reversed();
        f$d = Comparator.comparing(va2 -> mc.player.getDistance(va2.f$a(), va2.f$E(), va2.f$e())).reversed();
    }

    public static float f$E() {
        float f = mc.player.rotationYaw;
        float f2 = mc.player.moveForward;
        float f3 = mc.player.moveStrafing;
        f += (float)(f2 < 0.0f ? 180 : 0);
        if (f3 < 0.0f) {
            f += f2 < 0.0f ? -45.0f : (f2 == 0.0f ? 90.0f : 45.0f);
        }
        if (f3 > 0.0f) {
            f -= f2 < 0.0f ? -45.0f : (f2 == 0.0f ? 90.0f : 45.0f);
        }
        return f * ((float)Math.PI / 180);
    }

    public static double getSpeedAmp() {
        double d = 0.2873;
        if (mc.player.isPotionActive(MobEffects.SPEED)) {
            int n = mc.player.getActivePotionEffect(MobEffects.SPEED).getAmplifier();
            d *= 1.0 + 0.2 * (double)(n + 1);
        }
        return d;
    }

    public static boolean f$E(KeyBinding keyBinding) {
        return keyBinding.getKeyCode() != 0 && (keyBinding.getKeyCode() < 0 ? Mouse.isButtonDown((int)(keyBinding.getKeyCode() + 100)) : Keyboard.isKeyDown((int)keyBinding.getKeyCode()));
    }

    private static int f$E(Entity entity) {
        int n = 0xFFFFFF;
        Object object = (ScorePlayerTeam)entity.getTeam();
        if (object != null && ((String)(object = FontRenderer.getFormatFromString((String)object.getPrefix()))).length() >= 2) {
            n = mc.fontRenderer.getColorCode(((String)object).charAt(1));
        }
        return n;
    }

    public static Vec3d f$E() {
        return new Vec3d(mc.player.posX, mc.player.posY, mc.player.posZ);
    }

    public static List<EntityPlayer> f$E() {
        mF mF2 = (mF)kH.f$E().f$E().f$E(mF.class);//MF is AntiBots Module
        return mc.world.playerEntities.stream().filter(entityPlayer -> mF2 == null || !mF2.f$E() || !mF2.f$d.containsKey(entityPlayer.getEntityId())).sorted(Pg.f$a()).collect(Collectors.toList());
    }

    public static int f$E() {
        float f;
        ItemStack itemStack;
        int n;
        float f2 = -1.0f;
        int n2 = -1;
        Item item = null;
        int n3 = n = 0;
        while (n3 < 9) {
            itemStack = (ItemStack)mc.player.inventory.mainInventory.get(n);
            if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getItem() instanceof ItemSword) {
                float f3;
                f = itemStack.getMaxDamage();
                if (f3 > f2) {
                    n2 = n;
                    f2 = f;
                    item = itemStack.getItem();
                }
            }
            n3 = ++n;
        }
        if (item != null) {
            return n2;
        }
        int n4 = n = 0;
        while (n4 < 9) {
            itemStack = (ItemStack)mc.player.inventory.mainInventory.get(n);
            if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getItem() instanceof ItemAxe) {
                float f4;
                f = itemStack.getMaxDamage();
                if (f4 > f2) {
                    n2 = n;
                    f2 = f;
                }
            }
            n4 = ++n;
        }
        return n2;
    }

    public static double getEntitySpeed(Entity entity) {
        return Math.round(Math.floor(Math.sqrt(Math.pow(entity.posX - entity.lastTickPosX, 2.0) + Math.pow(entity.posZ - entity.lastTickPosZ, 2.0)) * 20.0 * 60.0 * 60.0) / 100.0) / 10L;
    }

    public static double[] f$E() {
        return new double[]{Pg.mc.player.posX, Pg.mc.player.posY, Pg.mc.player.posZ};
    }

    public static List<Entity> f$a() {//TODO work on this.
        mF mF2 = (mF)kH.f$E().f$E().f$E(mF.class);//MF is AntiBots Module
        return mc.world.loadedEntityList.stream().filter(entity -> !(entity instanceof EntityPlayer) || mF2 == null || !mF2.f$E() || !mF2.f$d.containsKey(entity.getEntityId())).sorted(Pg.f$a()).collect(Collectors.toList());
    }

    public static void useShield() {
        if (mc.player != null && mc.player.getHeldItemMainhand().getItem() instanceof ItemSword && mc.player.getHeldItemOffhand().getItem() instanceof ItemShield) {
            mc.playerController.processRightClick(mc.player, mc.world, EnumHand.OFF_HAND);
        }
    }
}
/*
public class Pg {
    public static Minecraft f$M;
    private static final Comparator<Entity> f$g;
    private static final Comparator<va> f$d;

    public static Entity f$E() {
        if (Pg.f$M.player.func_184187_bx() != null && !(Pg.f$M.player.func_184187_bx() instanceof EntityBoat)) {
            return Pg.f$M.player.func_184187_bx();
        }
        return Pg.f$M.player;
    }

    public static int f$a(IBlockState iBlockState) {
        int n;
        int n2 = -1;
        float f = 1.0f;
        if (iBlockState.func_185904_a() == Material.AIR) {
            return -1;
        }
        int n3 = n = 0;
        while (n3 < 36) {
            try {
                ItemStack itemStack = Pg.f$M.player.field_71071_by.getStackInSlot(n);
                if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getDestroySpeed(iBlockState) > f) {
                    f = itemStack.getDestroySpeed(iBlockState);
                    n2 = n;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            n3 = n = (int)((byte)(n + 1));
        }
        return n2;
    }

    public static boolean f$a(Entity entity) {
        return Pg.f$E(entity) == Pg.f$E((Entity)Pg.f$M.player);
    }

    public Pg() {
        Pg pg;
    }

    public static void f$E(double d) {
        if (Pg.f$M.player.func_184187_bx() != null) {
            MovementInput movementInput = Pg.f$M.player.movementInput;
            double d2 = movementInput.moveForward;
            double d3 = movementInput.moveStrafe;
            float f = Pg.f$M.player.field_70177_z;
            if (d2 == 0.0 && d3 == 0.0) {
                Pg.f$M.player.func_184187_bx().motionX = 0.0;
                Pg.f$M.player.func_184187_bx().motionZ = 0.0;
                return;
            }
            if (d2 != 0.0) {
                if (d3 > 0.0) {
                    f += (float)(d2 > 0.0 ? -45 : 45);
                } else if (d3 < 0.0) {
                    f += (float)(d2 > 0.0 ? 45 : -45);
                }
                d3 = 0.0;
                if (d2 > 0.0) {
                    d2 = 1.0;
                } else if (d2 < 0.0) {
                    d2 = -1.0;
                }
            }
            Pg.f$M.player.func_184187_bx().motionX = d2 * d * Math.cos(Math.toRadians(f + 90.0f)) + d3 * d * Math.sin(Math.toRadians(f + 90.0f));
            Pg.f$M.player.func_184187_bx().motionZ = d2 * d * Math.sin(Math.toRadians(f + 90.0f)) - d3 * d * Math.cos(Math.toRadians(f + 90.0f));
        }
    }

    public static boolean f$E(Entity entity) {
        return !entity.isDead && (!(entity instanceof EntityLivingBase) || Float.isNaN(((EntityLivingBase)entity).getHealth()) || ((EntityLivingBase)entity).getHealth() > 0.0f);
    }

    public static int f$E(IBlockState iBlockState) {
        int n;
        int n2 = -1;
        float f = 1.0f;
        if (iBlockState.func_185904_a() == Material.AIR) {
            return -1;
        }
        int n3 = n = 0;
        while (n3 < 36) {
            try {
                ItemStack itemStack = Pg.f$M.player.field_71071_by.getStackInSlot(n);
                if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getDestroySpeed(iBlockState) > f && Pg.f$M.player.field_71069_bz.getSlot(n).getStack().getMaxDamage() - Pg.f$M.player.field_71069_bz.getSlot(n).getStack().getItemDamage() > 5) {
                    f = itemStack.getDestroySpeed(iBlockState);
                    n2 = n;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            n3 = n = (int)((byte)(n + 1));
        }
        return n2;
    }

    public static boolean f$a() {
        return Pg.f$M.player.movementInput.forwardKeyDown || Pg.f$M.player.movementInput.backKeyDown || Pg.f$M.player.movementInput.leftKeyDown || Pg.f$M.player.movementInput.rightKeyDown || Pg.f$M.player.movementInput.jump || Pg.f$M.player.movementInput.sneak;
    }

    public static boolean f$e() {
        return (double)Pg.f$M.player.field_191988_bg != 0.0 || (double)Pg.f$M.player.field_70702_br != 0.0;
    }

    public static double f$E() {
        double d = 0.0;
        if (Pg.f$M.player.func_70644_a(MobEffects.JUMP_BOOST)) {
            int n = Pg.f$M.player.func_70660_b(MobEffects.JUMP_BOOST).getAmplifier();
            d += (double)(n + 1) * 0.1;
        }
        return d;
    }

    public static boolean f$e(Entity entity) {
        return entity.posX != entity.lastTickPosX || entity.posY != entity.lastTickPosY || entity.posZ != entity.lastTickPosZ || Pg.f$a();
    }

    public static EnumHand f$E(Class<? extends Item> clazz) {
        int n;
        EnumHand[] enumHandArray = EnumHand.values();
        int n2 = enumHandArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            EnumHand enumHand = enumHandArray[n];
            if (clazz.isInstance(Pg.f$M.player.func_184586_b(enumHand).getItem())) {
                return enumHand;
            }
            n3 = ++n;
        }
        return null;
    }

    public static ItemStack f$E(Class<? extends Item> clazz) {
        return Pg.f$E((EntityLivingBase)Pg.f$M.player, clazz);
    }

    public static boolean f$E(EntityPlayer entityPlayer) {
        ItemStack itemStack = (ItemStack)entityPlayer.inventory.armorInventory.get(0);
        ItemStack itemStack2 = (ItemStack)entityPlayer.inventory.armorInventory.get(1);
        ItemStack itemStack3 = (ItemStack)entityPlayer.inventory.armorInventory.get(2);
        ItemStack itemStack4 = (ItemStack)entityPlayer.inventory.armorInventory.get(3);
        return !(itemStack.getItem() instanceof ItemAir) || !(itemStack2.getItem() instanceof ItemAir) || !(itemStack3.getItem() instanceof ItemAir) || !(itemStack4.getItem() instanceof ItemAir);
    }

    public static EnumHand f$E(Item item) {
        int n;
        EnumHand[] enumHandArray = EnumHand.values();
        int n2 = enumHandArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            EnumHand enumHand = enumHandArray[n];
            if (item.equals(Pg.f$M.player.func_184586_b(enumHand).getItem())) {
                return enumHand;
            }
            n3 = ++n;
        }
        return null;
    }

    public static EnumFacing f$E(float f, float f2, float f3) {
        return EnumFacing.getFacingFromVector((float)f, (float)f2, (float)f3);
    }

    public static boolean f$E() {
        if (Pg.f$M.player.func_184586_b(EnumHand.MAIN_HAND).getItem() instanceof ItemAir) {
            return false;
        }
        Item item = Pg.f$M.player.func_184586_b(EnumHand.MAIN_HAND).getItem();
        return item instanceof ItemTool || item instanceof ItemSword;
    }

    public static String f$a() {
        if (f$M.getRenderViewEntity() == null) {
            return Pg.f$M.player.func_174811_aO().name();
        }
        return f$M.getRenderViewEntity().getHorizontalFacing().name();
    }

    public static Comparator<va> f$E() {
        return f$d;
    }

    public static boolean f$E(Entity entity, sG sG2) {
        return Pg.f$M.world.func_147447_a(new Vec3d(Pg.f$M.player.field_70165_t, Pg.f$M.player.field_70163_u + (double)Pg.f$M.player.func_70047_e(), Pg.f$M.player.field_70161_v), new Vec3d(entity.posX, entity.posY + (double)entity.getEyeHeight() - (double)TH.f$E(sG2), entity.posZ), false, true, false) == null;
    }

    public static void f$E() {
        if (Pg.f$M.player != null && Pg.f$M.player.func_184592_cb().getItem() instanceof ItemShield) {
            Pg.f$M.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.RELEASE_USE_ITEM, new BlockPos((Entity)Pg.f$M.player), EnumFacing.getFacingFromVector((float)((int)Pg.f$M.player.field_70165_t), (float)((int)Pg.f$M.player.field_70163_u), (float)((int)Pg.f$M.player.field_70161_v))));
        }
    }

    public static void f$E(double[] dArray, BlockPos blockPos3, double d) {
        double d2 = dArray[0];
        double d3 = dArray[1];
        double d4 = dArray[2];
        BlockPos blockPos2 = blockPos3;
        double d5 = (double)blockPos2.func_177958_n() + 0.5;
        double d6 = (double)blockPos2.func_177956_o() + 1.0;
        double d7 = (double)blockPos2.func_177952_p() + 0.5;
        double d8 = Math.abs(d2 - d5) + Math.abs(d3 - d6) + Math.abs(d4 - d7);
        int blockPos3 = 0;
        double d9 = d8;
        while (d9 > d) {
            double d10;
            double d11;
            d8 = Math.abs(d2 - d5) + Math.abs(d3 - d6) + Math.abs(d4 - d7);
            if (blockPos3 > 120) {
                return;
            }
            double d12 = d2 - d5;
            double d13 = d3 - d6;
            double d14 = d4 - d7;
            double d15 = (blockPos3 & 1) == 0 ? 0.4 : 0.25;
            double d16 = Math.min(Math.abs(d12), d15);
            if (d12 < 0.0) {
                d2 += d16;
                d11 = d13;
            } else {
                if (d12 > 0.0) {
                    d2 -= d16;
                }
                d11 = d13;
            }
            d12 = Math.min(Math.abs(d11), 0.25);
            if (d13 < 0.0) {
                d3 += d12;
                d10 = d14;
            } else {
                if (d13 > 0.0) {
                    d3 -= d12;
                }
                d10 = d14;
            }
            d12 = Math.min(Math.abs(d10), d15);
            if (d14 < 0.0) {
                d4 += d12;
            } else if (d14 > 0.0) {
                d4 -= d12;
            }
            ++blockPos3;
            Pg.f$M.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d2, d3, d4, true));
            d9 = d8;
        }
    }

    public static boolean f$E(EntityLivingBase entityLivingBase) {
        return Pg.f$M.player.func_184191_r((Entity)entityLivingBase);
    }

    public static double[] f$E(double d) {
        return Pg.f$E(Pg.f$M.player, d);
    }

    public static void f$e() {
        int n;
        int n2 = n = 0;
        while (n2 < 81) {
            Pg.f$M.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Pg.f$M.player.field_70165_t, Pg.f$M.player.field_70163_u + 0.05, Pg.f$M.player.field_70161_v, false));
            Pg.f$M.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Pg.f$M.player.field_70165_t, Pg.f$M.player.field_70163_u, Pg.f$M.player.field_70161_v, false));
            n2 = ++n;
        }
    }

    public static UUID f$E(Entity entity) {
        if (entity instanceof EntityTameable) {
            return ((EntityTameable)entity).getOwnerId();
        }
        if (entity instanceof AbstractHorse) {
            return ((AbstractHorse)entity).getOwnerUniqueId();
        }
        return null;
    }

    public static String f$E() {
        switch (f$M.getRenderViewEntity() == null ? Pg.f$M.player.func_174811_aO() : f$M.getRenderViewEntity().getHorizontalFacing()) {
            case NORTH: {
                while (false) {
                }
                return "-Z";
            }
            case SOUTH: {
                return "+Z";
            }
            case EAST: {
                return "+X";
            }
            case WEST: {
                return "-X";
            }
        }
        return "";
    }

public static double[] f$E(EntityPlayerSP 0, double 0) {
    block7: {
        block6: {
            v0 = 0;
            v1 = v0.movementInput;
            var4_2 = v1.moveForward;
            var6_3 = v1.moveStrafe;
            var3_4 = v0.field_70177_z;
            if (var4_2 != 0.0 || var6_3 != 0.0) break block6;
            var8_5 = 0.0;
            var10_6 = 0.0;
            break block7;
        }
        if (var4_2 == 0.0) ** GOTO lbl23
        if (var6_3 > 0.0) {
            var3_4 += (float)(var4_2 > 0.0 ? -45 : 45);
        } else if (var6_3 < 0.0) {
            var3_4 += (float)(var4_2 > 0.0 ? 45 : -45);
        }
        var6_3 = 0.0;
        if (var4_2 > 0.0) {
            v2 = var4_2 = 1.0;
        } else {
            if (var4_2 < 0.0) {
                var4_2 = -1.0;
            }
            lbl23:
            // 4 sources

            v2 = var4_2;
        }
        var8_5 = v2 * 0 * Math.cos(Math.toRadians(var3_4 + 90.0f)) + var6_3 * 0 * Math.sin(Math.toRadians(var3_4 + 90.0f));
        var10_6 = var4_2 * 0 * Math.sin(Math.toRadians(var3_4 + 90.0f)) - var6_3 * 0 * Math.cos(Math.toRadians(var3_4 + 90.0f));
    }
    return new double[]{var8_5, var10_6};
}

    public static Comparator<Entity> f$a() {
        return f$g;
    }

    public static ItemStack f$E(EntityLivingBase entityLivingBase, Class<? extends Item> clazz) {
        int n;
        EnumHand[] enumHandArray = EnumHand.values();
        int n2 = enumHandArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            EnumHand enumHand = enumHandArray[n];
            Item item = (enumHand = entityLivingBase.getHeldItem(enumHand)).getItem();
            if (clazz.isInstance(item)) {
                return enumHand;
            }
            n3 = ++n;
        }
        return null;
    }

    public static void f$E(Ee 0, double 0) {
        var3_2 = Pg.f$M.player.movementInput.moveForward;
        var5_3 = Pg.f$M.player.movementInput.moveStrafe;
        var7_4 = Pg.f$M.player.field_70177_z;
        if (var3_2 == 0.0 && var5_3 == 0.0) {
            v0 = 0;
            v0.f$e(0.0);
            v0.f$E(0.0);
            return;
        }
        if (var3_2 == 0.0) ** GOTO lbl22
        if (var5_3 > 0.0) {
            var7_4 += (float)(var3_2 > 0.0 ? -45 : 45);
        } else if (var5_3 < 0.0) {
            var7_4 += (float)(var3_2 > 0.0 ? 45 : -45);
        }
        var5_3 = 0.0;
        if (var3_2 > 0.0) {
            var3_2 = 1.0;
            v1 = 0;
        } else {
            if (var3_2 < 0.0) {
                var3_2 = -1.0;
            }
            lbl22:
            // 4 sources

            v1 = 0;
        }
        v1.f$e(var3_2 * 0 * Math.cos(Math.toRadians(var7_4 + 90.0f)) + var5_3 * 0 * Math.sin(Math.toRadians(var7_4 + 90.0f)));
        0.f$E(var3_2 * 0 * Math.sin(Math.toRadians(var7_4 + 90.0f)) - var5_3 * 0 * Math.cos(Math.toRadians(var7_4 + 90.0f)));
    }

static {
        f$M = Minecraft.getMinecraft();
        f$g = Comparator.comparing(entity -> Float.valueOf(entity.getDistance((Entity)Pg.f$M.player))).reversed();
        f$d = Comparator.comparing(va2 -> Pg.f$M.player.func_70011_f(va2.f$a(), va2.f$E(), va2.f$e())).reversed();
        }

public static float f$E() {
        float f = Pg.f$M.player.field_70177_z;
        float f2 = Pg.f$M.player.field_191988_bg;
        float f3 = Pg.f$M.player.field_70702_br;
        f += (float)(f2 < 0.0f ? 180 : 0);
        if (f3 < 0.0f) {
        f += f2 < 0.0f ? -45.0f : (f2 == 0.0f ? 90.0f : 45.0f);
        }
        if (f3 > 0.0f) {
        f -= f2 < 0.0f ? -45.0f : (f2 == 0.0f ? 90.0f : 45.0f);
        }
        return f * ((float)Math.PI / 180);
        }

public static double f$a() {
        double d = 0.2873;
        if (Pg.f$M.player.func_70644_a(MobEffects.SPEED)) {
        int n = Pg.f$M.player.func_70660_b(MobEffects.SPEED).getAmplifier();
        d *= 1.0 + 0.2 * (double)(n + 1);
        }
        return d;
        }

public static boolean f$E(KeyBinding keyBinding) {
        return keyBinding.getKeyCode() != 0 && (keyBinding.getKeyCode() < 0 ? Mouse.isButtonDown((int)(keyBinding.getKeyCode() + 100)) : Keyboard.isKeyDown((int)keyBinding.getKeyCode()));
        }

private static int f$E(Entity entity) {
        int n = 0xFFFFFF;
        Object object = (ScorePlayerTeam)entity.getTeam();
        if (object != null && ((String)(object = FontRenderer.getFormatFromString((String)object.getPrefix()))).length() >= 2) {
        n = Pg.f$M.fontRenderer.getColorCode(((String)object).charAt(1));
        }
        return n;
        }

public static Vec3d f$E() {
        return new Vec3d(Pg.f$M.player.field_70165_t, Pg.f$M.player.field_70163_u, Pg.f$M.player.field_70161_v);
        }

public static List<EntityPlayer> f$E() {
        mF mF2 = (mF)kH.f$E().f$E().f$E(mF.class);
        return Pg.f$M.world.field_73010_i.stream().filter(entityPlayer -> mF2 == null || !mF2.f$E() || !mF2.f$d.containsKey(entityPlayer.func_145782_y())).sorted(Pg.f$a()).collect(Collectors.toList());
        }

public static int f$E() {
        float f;
        ItemStack itemStack;
        int n;
        float f2 = -1.0f;
        int n2 = -1;
        Item item = null;
        int n3 = n = 0;
        while (n3 < 9) {
        itemStack = (ItemStack)Pg.f$M.player.field_71071_by.mainInventory.get(n);
        if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getItem() instanceof ItemSword) {
        float f3;
        f = itemStack.getMaxDamage();
        if (f3 > f2) {
        n2 = n;
        f2 = f;
        item = itemStack.getItem();
        }
        }
        n3 = ++n;
        }
        if (item != null) {
        return n2;
        }
        int n4 = n = 0;
        while (n4 < 9) {
        itemStack = (ItemStack)Pg.f$M.player.field_71071_by.mainInventory.get(n);
        if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getItem() instanceof ItemAxe) {
        float f4;
        f = itemStack.getMaxDamage();
        if (f4 > f2) {
        n2 = n;
        f2 = f;
        }
        }
        n4 = ++n;
        }
        return n2;
        }

public static double f$E(Entity entity) {
        return Math.round(Math.floor(Math.sqrt(Math.pow(entity.posX - entity.lastTickPosX, 2.0) + Math.pow(entity.posZ - entity.lastTickPosZ, 2.0)) * 20.0 * 60.0 * 60.0) / 100.0) / 10L;
        }

public static double[] f$E() {
        return new double[]{Pg.f$M.player.field_70165_t, Pg.f$M.player.field_70163_u, Pg.f$M.player.field_70161_v};
        }

public static List<Entity> f$a() {
        mF mF2 = (mF)kH.f$E().f$E().f$E(mF.class);
        return Pg.f$M.world.field_72996_f.stream().filter(entity -> !(entity instanceof EntityPlayer) || mF2 == null || !mF2.f$E() || !mF2.f$d.containsKey(entity.getEntityId())).sorted(Pg.f$a()).collect(Collectors.toList());
        }

public static void f$a() {
        if (Pg.f$M.player != null && Pg.f$M.player.func_184614_ca().getItem() instanceof ItemSword && Pg.f$M.player.func_184592_cb().getItem() instanceof ItemShield) {
        Pg.f$M.playerController.processRightClick((EntityPlayer)Pg.f$M.player, (World)Pg.f$M.world, EnumHand.OFF_HAND);
        }
        }
        }
 */