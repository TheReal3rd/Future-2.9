package net.futureclient.client.deof.modules.render.trajectories;

public class Trajectories {
}
/*
package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.gc;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemLingeringPotion;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemSplashPotion;
import net.minecraft.util.math.Vec3d;

public class Ac
extends Ba {
    private float f$g;
    private float f$d;
    private List<Class<? extends Item>> f$M;

    public static Minecraft f$q() {
        return f$d;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$r() {
        return f$d;
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$Z() {
        return f$d;
    }

    public static Minecraft f$T() {
        return f$d;
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$s() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$S() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static float f$a(Ac ac, float f) {
        ac.f$g = f;
        return ac.f$g;
    }

    public static List f$E(Ac ac) {
        return ac.f$M;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$z() {
        return f$d;
    }

    public static float f$E(Ac ac) {
        return ac.f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static float f$a(Ac ac) {
        return ac.f$g;
    }

    public static float f$E(Ac ac, float f) {
        ac.f$d = f;
        return ac.f$d;
    }

    public static Minecraft f$y() {
        return f$d;
    }

    public static Entity f$E(Ac ac, Vec3d vec3d, Vec3d vec3d2) {
        return ac.f$E(vec3d, vec3d2);
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    private ArrayList<EntityLivingBase> f$E() {
        ArrayList<EntityLivingBase> arrayList = new ArrayList<EntityLivingBase>();
        for (Entity entity : Ac.f$d.world.field_72996_f) {
            if (entity == Ac.f$d.player || !(entity instanceof EntityLivingBase)) continue;
            arrayList.add((EntityLivingBase)entity);
        }
        return arrayList;
    }

    public static Minecraft f$V() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public Ac() {
        Ac ac;
        String[] stringArray = new String[4];
        stringArray[0] = "Trajectories";
        stringArray[1] = "Tracelines";
        stringArray[2] = "Trajectorie";
        stringArray[3] = "Traject";
        super("Trajectories", stringArray, true, -10349857, JD.f$i);
        Ac ac2 = ac;
        Ac ac3 = ac;
        ac2.f$M = new ArrayList<Class<? extends Item>>();
        ac2.f$M.add(ItemBow.class);
        ac.f$M.add(ItemSplashPotion.class);
        ac.f$M.add(ItemLingeringPotion.class);
        ac.f$M.add(ItemExpBottle.class);
        ac.f$M.add(ItemEnderPearl.class);
        ac.f$M.add(ItemSnowball.class);
        ac.f$M.add(ItemEgg.class);
        ac2.f$E(new gc(ac));
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    private Entity f$E(Vec3d vec3d, Vec3d vec3d2) {
        for (EntityLivingBase entityLivingBase : 0.f$E()) {
            double d;
            if (entityLivingBase == Ac.f$d.player) continue;
            double d2 = d = (double)0.2f;
            if (entityLivingBase.func_174813_aQ().grow(d2, d2, d2).calculateIntercept(vec3d, vec3d2) == null) continue;
            return entityLivingBase;
        }
        return null;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$N() {
        return f$d;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$X() {
        return f$d;
    }
}
 */