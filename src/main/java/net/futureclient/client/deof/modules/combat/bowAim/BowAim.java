package net.futureclient.client.deof.modules.combat.bowAim;

import net.futureclient.client.Pf;
import net.futureclient.client.TH;
import net.futureclient.client.vF;

public class BowAim {
}
/*
package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.BI;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.TH;
import net.futureclient.client.kH;
import net.futureclient.client.le;
import net.futureclient.client.mF;
import net.futureclient.client.se;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;

public class vF
extends Ba {
    public float f$g;
    public float f$d;
    public EntityLivingBase f$M;
    private z<Boolean> f$j;
    private z<Boolean> f$b;
    private z<Boolean> f$e;
    private z<Boolean> f$C;
    private z<Boolean> f$i;
    private z<Boolean> f$K;
    private z<Boolean> f$I;

    private float[] f$E(EntityLivingBase entityLivingBase4) {
        EntityLivingBase entityLivingBase2 = entityLivingBase4;
        double d = entityLivingBase2.field_70165_t - vF.f$d.player.field_70165_t;
        EntityLivingBase entityLivingBase3 = entityLivingBase4;
        double d2 = entityLivingBase2.field_70163_u - vF.f$d.player.field_70163_u + (double)(entityLivingBase3.func_70047_e() / 1.4f);
        double d3 = entityLivingBase3.field_70161_v - vF.f$d.player.field_70161_v;
        double d4 = d;
        double d5 = d3;
        double d6 = Math.sqrt(d4 * d4 + d5 * d5);
        float entityLivingBase4 = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
        float f = (float)(-(Math.atan2(d2, d6) * 180.0 / Math.PI));
        return new float[]{entityLivingBase4, f};
    }

    @Override
    public void f$K() {
        vF vF2;
        vF vF3 = vF2;
        super.f$K();
        vF3.f$g = 0.0f;
        vF3.f$d = 0.0f;
    }

    public static void f$E(vF vF2, Pf pf, double d, double d2) {
        vF2.f$E(pf, d, d2);
    }

    private boolean f$E(EntityLivingBase entityLivingBase) {
        if (entityLivingBase == null || !Pg.f$E((Entity)entityLivingBase) || !vF.f$d.player.func_70685_l((Entity)entityLivingBase)) {
            return false;
        }
        if (BI.f$M((Entity)entityLivingBase)) {
            return 0.f$e.f$E();
        }
        if (BI.f$j((Entity)entityLivingBase)) {
            return 0.f$I.f$E();
        }
        if (BI.f$I((Entity)entityLivingBase)) {
            return 0.f$K.f$E();
        }
        if (entityLivingBase instanceof EntityPlayer && 0.f$C.f$E().booleanValue()) {
            EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
            mF mF2 = (mF)kH.f$E().f$E().f$E(mF.class);
            if (mF2.f$E() && mF2.f$d.containsKey(entityLivingBase.func_145782_y())) {
                return false;
            }
            if (entityPlayer.func_145782_y() == -1337) {
                return false;
            }
            if (entityPlayer.equals((Object)vF.f$d.player) || entityPlayer.capabilities.isCreativeMode) {
                return false;
            }
            if (0.f$i.f$E().booleanValue() && Pg.f$a((Entity)entityPlayer)) {
                return false;
            }
            if (0.f$j.f$E().booleanValue() && !Pg.f$E(entityPlayer)) {
                return false;
            }
            if (entityPlayer.func_82150_aj()) {
                return 0.f$b.f$E();
            }
            return !kH.f$E().f$E().f$E(entityPlayer.getName());
        }
        return false;
    }

    @Override
    public void f$B() {
        vF vF2;
        super.f$B();
        vF2.f$M = null;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public vF() {
        vF vF2;
        String[] stringArray = new String[2];
        stringArray[0] = "BowAim";
        stringArray[1] = "Ba";
        super("BowAim", stringArray, true, -3358823, JD.f$I);
        vF vF3 = vF2;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Players";
        stringArray2[1] = "player";
        stringArray2[2] = "p";
        stringArray2[3] = "player";
        vF3.f$C = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[5];
        stringArray3[0] = "Monsters";
        stringArray3[1] = "monster";
        stringArray3[2] = "mon";
        stringArray3[3] = "m";
        stringArray3[4] = "monst";
        vF2.f$e = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[6];
        stringArray4[0] = "Neutrals";
        stringArray4[1] = "Passive";
        stringArray4[2] = "Passives";
        stringArray4[3] = "Neutral";
        stringArray4[4] = "neu";
        stringArray4[5] = "n";
        vF2.f$I = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Animals";
        stringArray5[1] = "ani";
        stringArray5[2] = "animal";
        vF2.f$K = new z<Boolean>(false, stringArray5);
        String[] stringArray6 = new String[4];
        stringArray6[0] = "Invisibles";
        stringArray6[1] = "invis";
        stringArray6[2] = "inv";
        stringArray6[3] = "invisible";
        vF2.f$b = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[3];
        stringArray7[0] = "ArmorCheck";
        stringArray7[1] = "Armored";
        stringArray7[2] = "Armor";
        vF2.f$j = new z<Boolean>(true, stringArray7);
        String[] stringArray8 = new String[3];
        stringArray8[0] = "Teams";
        stringArray8[1] = "Team";
        stringArray8[2] = "tems";
        vF2.f$i = new z<Boolean>(false, stringArray8);
        vF2.f$E(vF2.f$C, vF2.f$e, vF2.f$I, vF2.f$K, vF2.f$b, vF2.f$j, vF2.f$i);
        vF2.f$E(new le(vF2), new se(vF2));
    }

    private void f$E(Pf pf, double d, double d2) {
        switch (pf.f$E()) {
            case f$M: {
                float f;
                vF vF2 = 0;
                while (false) {
                }
                float f2 = (float)(-Math.toDegrees(vF2.f$E(vF2.f$M, d, d2)));
                if (Double.isNaN(f2)) {
                    return;
                }
                vF vF3 = 0;
                vF vF4 = 0;
                d = vF3.f$M.field_70165_t - vF4.f$M.field_70142_S;
                d2 = vF4.f$M.field_70161_v - 0.f$M.field_70136_U;
                double d3 = vF.f$d.player.func_70032_d((Entity)0.f$M);
                d3 -= d3 % 2.0;
                boolean bl = vF3.f$M.func_70051_ag();
                d = d3 / 2.0 * d * (bl ? 1.3 : 1.1);
                d2 = d3 / 2.0 * d2 * (bl ? 1.3 : 1.1);
                vF vF5 = 0;
                d = vF5.f$M.field_70165_t + d - vF.f$d.player.field_70165_t;
                0.f$d = f = (float)Math.toDegrees(Math.atan2(vF5.f$M.field_70161_v + d2 - vF.f$d.player.field_70161_v, d)) - 90.0f;
                pf.f$a(0.f$d);
                0.f$g = f2;
                pf.f$E(0.f$g);
            }
        }
    }

private EntityLivingBase f$E(Pf pf, float f) {
    switch (pf.f$E()) {
        case f$M: {
            Iterator iterator;
            float f2 = f;
            Entity entity = null;
            Iterator iterator2 = iterator = vF.f$d.world.field_72996_f.iterator();
            while (iterator2.hasNext()) {
                float f3;
                Entity entity2 = (Entity)iterator.next();
                if (!(entity2 instanceof EntityLivingBase)) {
                    iterator2 = iterator;
                    continue;
                }
                if (!0.f$E((EntityLivingBase)(entity2 = (EntityLivingBase)entity2))) {
                    iterator2 = iterator;
                    continue;
                }
                float[] fArray = 0.f$E((EntityLivingBase)entity2);
                Pf pf2 = pf;
                float f4 = TH.f$E(pf2.f$B(), fArray[0]);
                float f5 = TH.f$E(pf2.f$e(), fArray[1]);
                if (f4 > f) {
                    iterator2 = iterator;
                    continue;
                }
                if (f5 > f) {
                    iterator2 = iterator;
                    continue;
                }
                f5 = (f4 + f5) / 2.0f;
                if (f3 > f2) {
                    iterator2 = iterator;
                    continue;
                }
                f2 = f5;
                entity = entity2;
                iterator2 = iterator;
            }
            return entity;
        }
    }
    return null;
}

    private float f$E(double d, double d2, double d3, double d4) {
        double d5 = d;
        d4 = 2.0 * d4 * (d5 * d5);
        double d6 = d3;
        double d7 = d2 * (d6 * d6);
        d4 = d2 * (d7 + d4);
        double d8 = d;
        d4 = Math.sqrt(d8 * d8 * d * d - d4);
        double d9 = d;
        d7 = d9 * d9 + d4;
        double d10 = d;
        d = d10 * d10 - d4;
        d4 = Math.atan2(d7, d2 * d3);
        d = Math.atan2(d, d2 * d3);
        return (float)Math.min(d4, d);
    }

    public boolean f$e() {
        vF vF2;
        return vF2.f$M != null && vF.f$d.player.func_184607_cu().getItem() instanceof ItemBow;
    }

    public static EntityLivingBase f$E(vF vF2, Pf pf, float f) {
        return vF2.f$E(pf, f);
    }

    private float f$E(EntityLivingBase entityLivingBase, double d, double d2) {
        EntityLivingBase entityLivingBase2 = entityLivingBase;
        EntityLivingBase entityLivingBase3 = entityLivingBase;
        double d3 = entityLivingBase2.field_70163_u + (double)(entityLivingBase3.func_70047_e() / 2.0f) - (vF.f$d.player.field_70163_u + (double)vF.f$d.player.func_70047_e());
        double d4 = entityLivingBase3.field_70165_t - vF.f$d.player.field_70165_t;
        double d5 = entityLivingBase2.field_70161_v - vF.f$d.player.field_70161_v;
        double d6 = d4;
        double d7 = d5;
        d4 = Math.sqrt(d6 * d6 + d7 * d7);
        return 0.f$E(d, d2, d4, d3);
    }

    public static Minecraft f$E() {
        return f$d;
    }
}
 */