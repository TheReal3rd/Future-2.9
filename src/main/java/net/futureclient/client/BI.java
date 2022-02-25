package net.futureclient.client;

import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.passive.EntityZombieHorse;
import net.minecraft.entity.projectile.EntityEvokerFangs;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityShulkerBullet;

public class BI {
    public static boolean f$j(Entity entity) {
        return entity instanceof EntityWolf && BI.f$A(entity) || entity instanceof EntityPolarBear && BI.f$E(entity) || entity instanceof EntityIronGolem && BI.f$B(entity) || entity instanceof EntityEnderman && BI.f$e(entity) || entity instanceof EntityPigZombie && BI.f$K(entity);
    }

    public static boolean f$H(Entity entity) {
        return entity instanceof EntityBoat || entity instanceof EntityMinecart;
    }

    public static boolean f$I(Entity entity) {
        return entity instanceof EntityPig || entity instanceof EntityParrot || entity instanceof EntityCow || entity instanceof EntitySheep || entity instanceof EntityChicken || entity instanceof EntitySquid || entity instanceof EntityBat || entity instanceof EntityVillager || entity instanceof EntityOcelot || entity instanceof EntityHorse || entity instanceof EntityLlama || entity instanceof EntityMule || entity instanceof EntityDonkey || entity instanceof EntitySkeletonHorse || entity instanceof EntityZombieHorse || entity instanceof EntitySnowman || entity instanceof EntityRabbit && BI.f$a(entity);
    }

    public static boolean f$h(Entity entity) {
        return entity instanceof EntityEnderCrystal || entity instanceof EntityEvokerFangs || entity instanceof EntityShulkerBullet || entity instanceof EntityFallingBlock || entity instanceof EntityFireball || entity instanceof EntityEnderEye || entity instanceof EntityEnderPearl;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = (3 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = 5 << 4 ^ (2 ^ 5);
        int n5 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }

    public static boolean f$B(Entity entity) {
        return entity instanceof EntityIronGolem && ((EntityIronGolem)entity).field_70125_A == 0.0f;
    }

    public static boolean f$C(Entity entity) {
        return entity instanceof EntityDragon || entity instanceof EntityWither || entity instanceof EntityGiantZombie;
    }

    private BI() {
        BI bI;
    }

    public static boolean f$K(Entity entity) {
        return entity instanceof EntityPigZombie && ((EntityPigZombie)entity).field_70125_A == 0.0f && ((EntityPigZombie)entity).func_142015_aE() <= 0;
    }

    public static boolean f$a(Entity entity) {
        return entity instanceof EntityRabbit && ((EntityRabbit)entity).getRabbitType() != 99;
    }

    public static boolean f$E(Entity entity) {
        return entity instanceof EntityPolarBear && ((EntityPolarBear)entity).field_70125_A == 0.0f && ((EntityPolarBear)entity).func_142015_aE() <= 0;
    }

    public static boolean f$M(Entity entity) {
        return entity instanceof EntityCreeper || entity instanceof EntityIllusionIllager || entity instanceof EntitySkeleton || entity instanceof EntityZombie && !(entity instanceof EntityPigZombie) || entity instanceof EntityBlaze || entity instanceof EntitySpider || entity instanceof EntityWitch || entity instanceof EntitySlime || entity instanceof EntitySilverfish || entity instanceof EntityGuardian || entity instanceof EntityEndermite || entity instanceof EntityGhast || entity instanceof EntityEvoker || entity instanceof EntityShulker || entity instanceof EntityWitherSkeleton || entity instanceof EntityStray || entity instanceof EntityVex || entity instanceof EntityVindicator || entity instanceof EntityPolarBear && !BI.f$E(entity) || entity instanceof EntityWolf && !BI.f$A(entity) || entity instanceof EntityPigZombie && !BI.f$K(entity) || entity instanceof EntityEnderman && !BI.f$e(entity) || entity instanceof EntityRabbit && !BI.f$a(entity) || entity instanceof EntityIronGolem && !BI.f$B(entity);
    }

    public static boolean f$A(Entity entity) {
        return entity instanceof EntityWolf && !((EntityWolf)entity).isAngry();
    }

    public static boolean f$e(Entity entity) {
        return entity instanceof EntityEnderman && !((EntityEnderman)entity).isScreaming();
    }
}
package net.futureclient.client;

import net.futureclient.client.CI;
import net.futureclient.client.kH;
import net.futureclient.client.oG;
import net.futureclient.client.yI;

public enum Bi {
    f$M;

    private oG f$g;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f$E() {
        Bi bi;
        Bi bi2;
        block10: {
            block9: {
                try {
                    Class<?> clazz = Class.forName("baritone.api.BaritoneAPI", false, ((Object)((Object)bi2)).getClass().getClassLoader());
                    String[] stringArray = clazz.getPackage().getImplementationVersion();
                    if (stringArray != null) {
                        stringArray = stringArray.split("\\.");
                        int n = stringArray.length >= 1 ? Integer.parseInt(stringArray[0]) : 0;
                        if (n >= 1) {
                            int n2 = stringArray.length >= 2 ? Integer.parseInt(stringArray[1]) : 0;
                            if (n != 1 || n2 != 2) break block9;
                            int n3 = n = stringArray.length >= 3 ? Integer.parseInt(stringArray[2]) : 0;
                            if (n < 10) {
                                bi2.f$g = oG.f$i;
                            }
                            break block9;
                        }
                        bi2.f$g = oG.f$i;
                        break block9;
                    }
                    bi2.f$g = oG.f$j;
                }
                catch (ClassNotFoundException | NoClassDefFoundError throwable) {
                    bi = bi2;
                    bi2.f$g = oG.f$M;
                    break block10;
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
            bi = bi2;
        }
        if (bi.f$g != null) {
            kH.f$E().f$E().f$a(new yI(bi2));
            return;
        }
        new CI(bi2).run();
    }

    public static oG f$E(Bi bi) {
        return bi.f$g;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Bi() {
        Bi bi;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.YG;
import net.futureclient.client.YI;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.CPacketPlayer;

public final class bi
extends Ha<ve> {
    public final YG f$d;

    public bi(YG yG, YI yI) {
        0(yG);
    }

    @Override
    public void f$E(ve ve2) {
        if ((ve2.f$E() instanceof CPacketPlayer.Position || ve2.f$E() instanceof CPacketPlayer.PositionRotation) && YG.f$E(0.f$d) != null) {
            ve2.f$E(true);
        }
    }

    private bi(YG yG) {
        bi bi2;
        bi2.f$d = yG;
    }
}
package net.futureclient.client;

import com.google.common.io.ByteArrayDataOutput;
import java.io.DataInputStream;
import java.io.IOException;
import net.futureclient.client.WH;

public class bI
extends WH {
    private String f$g;
    private String f$M;
    private String f$j;
    public boolean f$d;
    private String f$i;

    @Override
    public void f$E(ByteArrayDataOutput byteArrayDataOutput) throws IOException {
        ByteArrayDataOutput byteArrayDataOutput2 = byteArrayDataOutput;
        bI bI2 = 0;
        byteArrayDataOutput.writeUTF(bI2.f$j);
        byteArrayDataOutput2.writeUTF(bI2.f$i);
        byteArrayDataOutput2.writeUTF(0.f$M);
    }

    @Override
    public int f$E() {
        return 3;
    }

    public String f$E() {
        bI bI2;
        return bI2.f$g;
    }

    public bI() {
        bI bI2;
        bI bI3 = bI2;
        bI3.f$g = "";
        bI3.f$d = false;
    }

    @Override
    public void f$E(DataInputStream dataInputStream) throws IOException {
        bI bI2 = 0;
        bI2.f$d = dataInputStream.readBoolean();
        bI2.f$g = dataInputStream.readUTF();
    }

    public bI(String string, String string2, String string3) {
        bI bI2 = 0;
        bI bI3 = 0;
        0.f$g = "";
        bI3.f$d = false;
        bI3.f$j = string;
        bI2.f$i = string2;
        bI2.f$M = string3;
    }
}
