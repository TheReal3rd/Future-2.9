package net.futureclient.client;

public class OI {
    public double f$M;
    public double f$g;
    public double f$d;

    public double f$a() {
        OI oI;
        return oI.f$g;
    }

    public OI(double d, double d2, double d3) {
        OI oI = 0;
        0.f$M = d;
        oI.f$g = d2;
        oI.f$d = d3;
    }

    public double f$E() {
        OI oI;
        return oI.f$d;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public double f$e() {
        OI oI;
        return oI.f$M;
    }

    public boolean equals(Object object) {
        if (object instanceof OI) {
            OI oI = (OI)object;
            return Double.compare(oI.f$M, 0.f$M) == 0 && Double.compare(oI.f$g, 0.f$g) == 0 && Double.compare(oI.f$d, 0.f$d) == 0;
        }
        return super.equals(object);
    }

    public double f$E(OI oI) {
        OI oI2 = 0;
        double d = oI2.f$M - oI.f$M;
        double d2 = oI2.f$g - oI.f$g;
        double d3 = oI2.f$d - oI.f$d;
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        return Math.sqrt(d4 * d4 + d5 * d5 + d6 * d6);
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import net.futureclient.client.OI;
import net.futureclient.client.TH;
import net.futureclient.client.sG;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class oI {
    private static final Minecraft f$M;
    private final ArrayList<OI> f$g;
    private final Entity f$d;

    private static Vec3d f$E(float f, float f2) {
        float f3 = MathHelper.cos((float)(-f2 * ((float)Math.PI / 180) - (float)Math.PI));
        f2 = MathHelper.sin((float)(-f2 * ((float)Math.PI / 180) - (float)Math.PI));
        float f4 = -MathHelper.cos((float)(-f * ((float)Math.PI / 180)));
        float f5 = MathHelper.sin((float)(-f * ((float)Math.PI / 180)));
        return new Vec3d((double)(f2 * f4), (double)f5, (double)(f3 * f4));
    }

    private boolean f$E(OI oI22, Entity entity) {
        boolean bl;
        entity = entity.getEntityBoundingBox();
        double d = oI.f$M.player.field_70165_t + oI22.f$M;
        double d2 = oI.f$M.player.field_70163_u + oI22.f$g;
        double d3 = oI.f$M.player.field_70161_v + oI22.f$d;
        boolean oI22 = d >= entity.minX - 0.25 && d <= entity.maxX + 0.25;
        boolean bl2 = d2 >= entity.minY && d2 <= entity.maxY;
        boolean bl3 = bl = d3 >= entity.minZ - 0.25 && d3 <= entity.maxZ + 0.25;
        return oI22 && bl && bl2;
    }

    static {
        f$M = Minecraft.getMinecraft();
    }

    public Entity f$E() {
        oI oI2;
        Entity entity = oI2.f$d;
        double d = oI.f$M.player.func_70032_d(entity);
        block0: for (Entity entity2 : oI.f$M.world.field_72996_f) {
            if (!(entity2 instanceof EntityLivingBase) || !((double)oI.f$M.player.func_70032_d(entity2 = (EntityLivingBase)entity2) < d) || oI.f$M.player == entity2) continue;
            Iterator<OI> iterator = oI2.f$g.iterator();
            block1: while (true) {
                Iterator<OI> iterator2 = iterator;
                while (iterator2.hasNext()) {
                    OI oI3 = iterator.next();
                    if (oI.f$M.player.func_184187_bx() != null && entity2.equals((Object)oI.f$M.player.func_184187_bx())) {
                        iterator2 = iterator;
                        continue;
                    }
                    if (!oI2.f$E(oI3, entity2) || !(oI.f$M.player.func_70032_d(entity2) < oI.f$M.player.func_70032_d(entity))) continue block1;
                    entity = entity2;
                    continue block1;
                }
                continue block0;
                break;
            }
        }
        return entity;
    }

    public static RayTraceResult f$E(float f, float f2) {
        return oI.f$E(f, f2, oI.f$M.playerController.getBlockReachDistance());
    }

    public static RayTraceResult f$E(float f, float f22, float f3) {
        Vec3d vec3d = oI.f$M.player.func_174824_e(1.0f);
        Vec3d f22 = oI.f$E(f, f22);
        f22 = vec3d.addVector(f22.x * (double)f3, f22.y * (double)f3, f22.z * (double)f3);
        return Optional.ofNullable(oI.f$M.world.func_147447_a(vec3d, f22, false, false, false)).orElseGet(() -> new RayTraceResult(RayTraceResult.Type.MISS, new Vec3d(0.5, 1.0, 0.5), EnumFacing.UP, BlockPos.ORIGIN));
    }

    public oI(Entity entity2, sG object) {
        oI oI2 = 0;
        0.f$g = new ArrayList();
        OI oI3 = new OI(oI.f$M.player.field_70165_t, oI.f$M.player.field_70163_u + (double)oI.f$M.player.func_70047_e(), oI.f$M.player.field_70161_v);
        object = new OI(entity2.posX, entity2.posY + (double)entity2.height - (double)TH.f$E(object), entity2.posZ);
        oI2.f$d = entity2;
        Object object2 = object;
        double d = ((OI)object2).f$M - oI3.f$M;
        double d2 = ((OI)object2).f$g - oI3.f$g;
        double d3 = ((OI)object2).f$d - oI3.f$d;
        double d4 = 0.0;
        double d5 = 1.0;
        double d6 = 0.0;
        int entity2 = (int)Math.max(Math.abs(d) / (double)0.1f, Math.max(Math.abs(d2) / (double)0.1f, Math.abs(d3) / (double)0.1f));
        int n = object = 0;
        while (n <= entity2) {
            0.f$g.add(new OI(d4, d5, d6));
            d4 += d / (double)entity2;
            d5 += d2 / (double)entity2;
            d6 += d3 / (double)entity2;
            n = ++object;
        }
    }
}
