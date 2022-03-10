package net.futureclient.client.deof.modules.combat.autoCrystal;

import net.futureclient.client.*;

public class AutoCrystal {
}
/*
package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.BI;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.KF;
import net.futureclient.client.NE;
import net.futureclient.client.Pg;
import net.futureclient.client.Se;
import net.futureclient.client.Ze;
import net.futureclient.client.iE;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.vD;
import net.futureclient.client.z;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemEndCrystal;
import net.minecraft.util.CombatRules;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class hF
extends Ba {
    private final z<Boolean> f$y;
    private final s f$a;
    private final z<Boolean> f$J;
    private final s f$A;
    private final z<Boolean> f$m;
    private final z<Boolean> f$D;
    private final z<Boolean> f$l;
    private final Bh f$I;
    private iE f$i;
    private final z<Boolean> f$E;
    private final ka<Se> f$L;
    private final s f$C;
    private final z<Boolean> f$H;
    private final s f$G;
    private double f$b;
    private final s f$h;
    private final s f$f;
    private float f$d;
    private final z<Boolean> f$F;
    private final Bh f$e;
    private final s f$k;
    private double f$K;
    private float f$g;
    private int f$M;
    private final s f$B;
    private EntityEnderCrystal f$j;
    private final s f$c;

    public static Minecraft f$c() {
        return f$d;
    }

    public static z f$a(hF hF2) {
        return hF2.f$y;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public hF() {
        hF hF2;
        String[] stringArray = new String[6];
        stringArray[0] = "AutoCrystal";
        stringArray[1] = "CrystalNuker";
        stringArray[2] = "CrystalNuke";
        stringArray[3] = "CrystalAura";
        stringArray[4] = "AutoCrystaler";
        stringArray[5] = "CA";
        super("AutoCrystal", stringArray, true, 16715563, JD.f$I);
        hF hF3 = hF2;
        String[] stringArray2 = new String[8];
        stringArray2[0] = "Rotate";
        stringArray2[1] = "Aiming";
        stringArray2[2] = "Aim";
        stringArray2[3] = "Rotation";
        stringArray2[4] = "Facing";
        stringArray2[5] = "Face";
        stringArray2[6] = "F";
        stringArray2[7] = "Look";
        hF3.f$y = new z<Boolean>(true, stringArray2);
        hF hF4 = hF2;
        String[] stringArray3 = new String[3];
        stringArray3[0] = "RandomSpeed";
        stringArray3[1] = "randomsped";
        stringArray3[2] = "rspeed";
        hF4.f$G = new s((Number)0.0, (Number)0.0, (Number)10.0, 0.1, stringArray3);
        hF hF5 = hF2;
        String[] stringArray4 = new String[4];
        stringArray4[0] = "AttackSpeed";
        stringArray4[1] = "CPS";
        stringArray4[2] = "clicks";
        stringArray4[3] = "click";
        hF5.f$h = new s((Number)12.0, (Number)0.1, (Number)20.0, 0.1, stringArray4);
        hF hF6 = hF2;
        String[] stringArray5 = new String[4];
        stringArray5[0] = "AttackRange";
        stringArray5[1] = "AttackDistnace";
        stringArray5[2] = "AttackRang";
        stringArray5[3] = "AttackLength";
        hF6.f$f = new s((Number)4.0, (Number)0.1, (Number)6.0, 0.1, stringArray5);
        hF hF7 = hF2;
        String[] stringArray6 = new String[4];
        stringArray6[0] = "AttackWallRange";
        stringArray6[1] = "WallAttackDistnace";
        stringArray6[2] = "WallAttackRang";
        stringArray6[3] = "WallAttackLength";
        hF7.f$k = new s((Number)4.0, (Number)0.1, (Number)6.0, 0.1, stringArray6);
        hF hF8 = hF2;
        String[] stringArray7 = new String[2];
        stringArray7[0] = "AntiWeakness";
        stringArray7[1] = "Weakness";
        hF8.f$F = new z<Boolean>(true, stringArray7);
        hF hF9 = hF2;
        String[] stringArray8 = new String[3];
        stringArray8[0] = "Players";
        stringArray8[1] = "player";
        stringArray8[2] = "p";
        hF9.f$J = new z<Boolean>(true, stringArray8);
        hF hF10 = hF2;
        String[] stringArray9 = new String[3];
        stringArray9[0] = "Monsters";
        stringArray9[1] = "monster";
        stringArray9[2] = "mon";
        hF10.f$E = new z<Boolean>(false, stringArray9);
        hF hF11 = hF2;
        String[] stringArray10 = new String[6];
        stringArray10[0] = "Neutrals";
        stringArray10[1] = "Passive";
        stringArray10[2] = "Passives";
        stringArray10[3] = "Neutral";
        stringArray10[4] = "neu";
        stringArray10[5] = "n";
        hF11.f$H = new z<Boolean>(false, stringArray10);
        hF hF12 = hF2;
        String[] stringArray11 = new String[3];
        stringArray11[0] = "Animals";
        stringArray11[1] = "ani";
        stringArray11[2] = "animal";
        hF12.f$m = new z<Boolean>(false, stringArray11);
        hF hF13 = hF2;
        String[] stringArray12 = new String[2];
        stringArray12[0] = "Place";
        stringArray12[1] = "AutoPlace";
        hF13.f$D = new z<Boolean>(true, stringArray12);
        hF hF14 = hF2;
        String[] stringArray13 = new String[3];
        stringArray13[0] = "Raytrace";
        stringArray13[1] = "raytrace";
        stringArray13[2] = "rt";
        hF14.f$l = new z<Boolean>(true, stringArray13);
        hF hF15 = hF2;
        String[] stringArray14 = new String[3];
        stringArray14[0] = "Swap";
        stringArray14[1] = "Switch";
        stringArray14[2] = "s";
        hF15.f$L = new ka<Se>(Se.f$M, stringArray14);
        hF hF16 = hF2;
        String[] stringArray15 = new String[3];
        stringArray15[0] = "PlaceSpeed";
        stringArray15[1] = "pps";
        stringArray15[2] = "pspeed";
        hF16.f$c = new s((Number)12.0, (Number)0.1, (Number)20.0, 0.1, stringArray15);
        hF hF17 = hF2;
        String[] stringArray16 = new String[4];
        stringArray16[0] = "PlaceRange";
        stringArray16[1] = "PlaceDistnace";
        stringArray16[2] = "PlaceRang";
        stringArray16[3] = "PlaceLength";
        hF17.f$A = new s((Number)4.0, (Number)1.0, (Number)6.0, 0.1, stringArray16);
        hF hF18 = hF2;
        String[] stringArray17 = new String[2];
        stringArray17[0] = "EnemyRange";
        stringArray17[1] = "MaxEnemyRange";
        hF18.f$B = new s((Number)13.0, (Number)0.0, (Number)13.0, 0.1, stringArray17);
        hF hF19 = hF2;
        String[] stringArray18 = new String[3];
        stringArray18[0] = "MinDamage";
        stringArray18[1] = "MinimumDamage";
        stringArray18[2] = "Damage";
        hF19.f$a = new s((Number)0.0, (Number)0.0, (Number)20.0, 0.1, stringArray18);
        hF hF20 = hF2;
        String[] stringArray19 = new String[3];
        stringArray19[0] = "LethalMultiplier";
        stringArray19[1] = "Multiplier";
        stringArray19[2] = "Lethal";
        hF20.f$C = new s((Number)0.0, (Number)0.0, (Number)4.0, 0.5, stringArray19);
        hF hF21 = hF2;
        hF hF22 = hF2;
        hF hF23 = hF2;
        hF23.f$e = new Bh();
        hF hF24 = hF2;
        hF23.f$I = new Bh();
        hF22.f$K = 69.0;
        hF22.f$b = 69.0;
        hF21.f$j = null;
        hF21.f$i = null;
        hF2.f$M = -1;
        z[] zArray = new z[18];
        zArray[0] = hF2.f$y;
        zArray[1] = hF2.f$G;
        zArray[2] = hF2.f$h;
        zArray[3] = hF2.f$f;
        zArray[4] = hF2.f$k;
        zArray[5] = hF2.f$F;
        zArray[6] = hF2.f$J;
        zArray[7] = hF2.f$E;
        zArray[8] = hF2.f$H;
        zArray[9] = hF2.f$m;
        zArray[10] = hF2.f$D;
        zArray[11] = hF2.f$l;
        zArray[12] = hF2.f$L;
        zArray[13] = hF2.f$c;
        zArray[14] = hF2.f$A;
        zArray[15] = hF2.f$B;
        zArray[16] = hF2.f$a;
        zArray[17] = hF2.f$C;
        hF2.f$E(zArray);
        Ha[] haArray = new Ha[3];
        haArray[0] = new NE(hF2);
        haArray[1] = new KF(hF2);
        haArray[2] = new vD(hF2);
        hF2.f$E(haArray);
    }

    public static double f$E(hF hF2) {
        return hF2.f$b;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static float f$E(hF hF2) {
        return hF2.f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static z f$e(hF hF2) {
        return hF2.f$D;
    }

    private float f$E(float f) {
        EnumDifficulty enumDifficulty = hF.f$d.world.func_175659_aa();
        if (enumDifficulty == EnumDifficulty.PEACEFUL) {
            f = 0.0f;
            return 0.0f;
        }
        if (enumDifficulty == EnumDifficulty.EASY) {
            f = Math.min(f / 2.0f + 1.0f, f);
            return f;
        }
        if (enumDifficulty == EnumDifficulty.HARD) {
            f = f * 3.0f / 2.0f;
        }
        return f;
    }

    public static float f$a(hF hF2, float f) {
        hF2.f$d = f;
        return hF2.f$d;
    }

    public static int f$E(hF hF2) {
        return hF2.f$M;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static iE f$E(hF hF2, iE iE2) {
        hF2.f$i = iE2;
        return hF2.f$i;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static EntityEnderCrystal f$E(hF hF2) {
        return hF2.f$j;
    }

    public static int f$E(hF hF2, int n) {
        hF2.f$M = n;
        return hF2.f$M;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static ka f$E(hF hF2) {
        return hF2.f$L;
    }

    public static Bh f$E(hF hF2) {
        return hF2.f$I;
    }

    public static iE f$E(hF hF2) {
        return hF2.f$i;
    }

    public static Bh f$a(hF hF2) {
        return hF2.f$e;
    }

    public static float f$a(hF hF2) {
        return hF2.f$g;
    }

    public iE f$E() {
        hF hF2;
        return hF2.f$i;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static double f$a(hF hF2) {
        return hF2.f$K;
    }

    private List<BlockPos> f$E(Entity entity, float f) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Entity entity2 = entity;
        int n = (int)entity2.posX;
        int n2 = (int)entity2.posY;
        int n3 = (int)entity2.posZ;
        int n4 = (int)(f + 2.0f);
        double d = entity2.posX - 0.5;
        double d2 = entity2.posY + (double)entity.getEyeHeight() - 1.0;
        double d3 = entity2.posZ - 0.5;
        int n5 = entity = n - n4;
        while (n5 <= n + n4) {
            int n6 = n3 - n4;
            while (n6 <= n3 + n4) {
                int n7;
                int n8 = n2 - n4;
                while (n8 < n2 + n4) {
                    int n9;
                    float f2 = f;
                    if (((double)entity - d) * ((double)entity - d) + ((double)n9 - d2) * ((double)n9 - d2) + ((double)n7 - d3) * ((double)n7 - d3) <= (double)(f2 * f2)) {
                        arrayList.add(new BlockPos(entity, n9, n7));
                    }
                    n8 = ++n9;
                }
                n6 = ++n7;
            }
            n5 = ++entity;
        }
        return arrayList;
    }

    public static z f$E(hF hF2) {
        return hF2.f$F;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static s f$E(hF hF2) {
        return hF2.f$k;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static s f$A(hF hF2) {
        return hF2.f$h;
    }

    public static Minecraft f$M() {
        return f$d;
    }


private iE f$a() {
    var1_1 = null;
    var2_2 = 0.5;
    var4_3 = Pg.f$a().iterator();
    block0: while (true) {
        v0 = var4_3;
        while (v0.hasNext()) {
            var5_4 = var4_3.next();
            if (!(var5_4 instanceof EntityLivingBase)) continue block0;
            if (!0.f$E((EntityLivingBase)(var5_4 = (EntityLivingBase)var5_4))) {
                v0 = var4_3;
                continue;
            }
            var6_5 = 0.f$E((Entity) hF.f$d.player, 0.f$A.f$E().floatValue()).iterator();
            block2: while (true) {
                v1 = var6_5;
                while (true) {
                    if (v1.hasNext()) ** break;
                    continue block0;
                    v2 = var7_6 = var6_5.next();
                    var8_7 = (double)v2.func_177958_n() + 0.5;
                    if (var5_4.func_70092_e(var8_7, var10_8 = (double)v2.func_177956_o() + 1.0, var12_9 = (double)v2.func_177952_p() + 0.5) >= 0.f$B.f$E().doubleValue() * 0.f$B.f$E().doubleValue()) continue block2;
                    if (!0.f$E(var7_6)) {
                        v1 = var6_5;
                        continue;
                    }
                    var14_10 = 0.f$E(var8_7, var10_8, var12_9, (EntityLivingBase)var5_4);
                    if (v3 < 0.f$a.f$E().doubleValue() && var14_10 * (1.0 + 0.f$C.f$E().doubleValue()) < (double)(var5_4.getHealth() + var5_4.getAbsorptionAmount())) {
                        v1 = var6_5;
                        continue;
                    }
                    if (!(var14_10 > var2_2)) continue block2;
                    var8_7 = 0.f$E(var8_7, var10_8, var12_9, (EntityLivingBase)hF.f$d.player);
                    if (v4 > var14_10 && var14_10 < (double)(var5_4.getHealth() + var5_4.getAbsorptionAmount())) continue block2;
                    if (!((double)(hF.f$d.player.func_110143_aJ() + hF.f$d.player.func_110139_bj()) - var8_7 <= 0.5)) break;
                    v1 = var6_5;
                }
                var2_2 = var14_10;
                var1_1 = var7_6;
            }
        }
        break;
    }
    if (var1_1 == null) {
        return null;
    }
    return new iE(var1_1, var2_2, null);
}

    public static Minecraft f$B() {
        return f$d;
    }

    public static int f$a(hF hF2) {
        return hF2.f$a();
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static float f$E(hF hF2, float f) {
        hF2.f$g = f;
        return hF2.f$g;
    }

    public static iE f$a(hF hF2) {
        return hF2.f$a();
    }

    public static s f$B(hF hF2) {
        return hF2.f$c;
    }

    private boolean f$E(BlockPos blockPos) {
        if (0.f$l.f$E().booleanValue() && !CG.f$e(blockPos)) {
            return false;
        }
        Block block = hF.f$d.world.func_180495_p(blockPos).getBlock();
        BlockPos blockPos2 = blockPos;
        blockPos = blockPos2.up(1);
        BlockPos blockPos3 = blockPos2.up(2);
        if ((block.equals(Blocks.OBSIDIAN) || block.equals(Blocks.BEDROCK)) && hF.f$d.world.func_180495_p(blockPos).getBlock().equals(Blocks.AIR) && hF.f$d.world.func_180495_p(blockPos3).getBlock().equals(Blocks.AIR)) {
            if (hF.f$d.world.func_72872_a(Entity.class, new AxisAlignedBB(blockPos, blockPos3.add(1, 1, 1))).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    private boolean f$E(EntityLivingBase entityLivingBase) {
        if (Pg.f$E((Entity)entityLivingBase)) {
            Ze ze = (Ze) kH.f$E().f$E().f$E(Ze.class);
            if (entityLivingBase instanceof EntityPlayer && 0.f$J.f$E().booleanValue() && entityLivingBase != hF.f$d.player && entityLivingBase.func_145782_y() != -1337 && ze != null && (!ze.f$h.f$E().booleanValue() || !kH.f$E().f$E().f$E(entityLivingBase.func_70005_c_()))) {
                return true;
            }
            if ((BI.f$M((Entity)entityLivingBase) || BI.f$C((Entity)entityLivingBase)) && 0.f$E.f$E().booleanValue()) {
                return true;
            }
            if (BI.f$j((Entity)entityLivingBase) && 0.f$H.f$E().booleanValue()) {
                return true;
            }
            if (BI.f$I((Entity)entityLivingBase) && 0.f$m.f$E().booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static EntityEnderCrystal f$E(hF hF2, EntityEnderCrystal entityEnderCrystal) {
        hF2.f$j = entityEnderCrystal;
        return hF2.f$j;
    }

    private int f$a() {
        int n;
        if (hF.f$d.player.field_71071_by.getCurrentItem().getItem() instanceof ItemEndCrystal) {
            return hF.f$d.player.field_71071_by.currentItem;
        }
        int n2 = n = 0;
        while (n2 < 9) {
            if (hF.f$d.player.field_71071_by.getStackInSlot(n).getItem() instanceof ItemEndCrystal) {
                return n;
            }
            n2 = ++n;
        }
        return -1;
    }

    @Override
    public void f$B() {
        hF hF2;
        hF hF3 = hF2;
        super.f$B();
        hF3.f$j = null;
        hF3.f$i = null;
    }

    public static s f$e(hF hF2) {
        return hF2.f$A;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static s f$K(hF hF2) {
        return hF2.f$G;
    }

    public static s f$a(hF hF2) {
        return hF2.f$f;
    }

    private float f$E(EntityEnderCrystal entityEnderCrystal, EntityLivingBase entityLivingBase) {
        return 0.f$E(entityEnderCrystal.field_70165_t, entityEnderCrystal.field_70163_u, entityEnderCrystal.field_70161_v, entityLivingBase);
    }

    public static double f$a(hF hF2, double d) {
        hF2.f$K = d;
        return hF2.f$K;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public float f$E(double d7, double d2, double d3, EntityLivingBase entityLivingBase) {
        double d4;
        float f = 12.0f;
        double d5 = entityLivingBase.func_70011_f(d7, d2, d3) / 12.0;
        if (d4 > 1.0) {
            return 0.0f;
        }
        double d6 = entityLivingBase.field_70170_p.getBlockDensity(new Vec3d(d7, d2, d3), entityLivingBase.func_174813_aQ());
        d5 = (1.0 - d5) * d6;
        f = (int)((d5 * d5 + d5) / 2.0 * 7.0 * 12.0 + 1.0);
        f = 0.f$E(f);
        DamageSource d7 = DamageSource.causeExplosionDamage((Explosion)new Explosion((World)hF.f$d.world, (Entity)hF.f$d.player, d7, d2, d3, 6.0f, false, true));
        f = CombatRules.getDamageAfterAbsorb((float)f, (float)entityLivingBase.getTotalArmorValue(), (float)((float)entityLivingBase.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue()));
        int n = EnchantmentHelper.getEnchantmentModifierDamage((Iterable)entityLivingBase.getArmorInventoryList(), (DamageSource)d7);
        if (n > 0) {
            f = CombatRules.getDamageAfterMagicAbsorb((float)f, (float)n);
        }
        if ((entityLivingBase = entityLivingBase.getActivePotionEffect(MobEffects.RESISTANCE)) != null) {
            f = f * (float)(25 - (entityLivingBase.getAmplifier() + 1) * 5) / 25.0f;
        }
        f = Math.max(f, 0.0f);
        return f;
    }

    public EntityEnderCrystal f$E() {
        hF hF2;
        return hF2.f$j;
    }

    public static double f$E(hF hF2, double d) {
        hF2.f$b = d;
        return hF2.f$b;
    }

    public static Minecraft f$L() {
        return f$d;
    }
}
 */