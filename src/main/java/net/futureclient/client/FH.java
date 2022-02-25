package net.futureclient.client;

public class FH {
    private final String f$d;
    private final String f$g;

    public FH(String string, String string2) {
        FH fH = 0;
        fH.f$g = string;
        fH.f$d = string2;
    }

    public String f$a() {
        FH fH;
        return fH.f$g;
    }

    public String f$E() {
        FH fH;
        return fH.f$d;
    }
}
package net.futureclient.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.futureclient.client.MI;
import net.futureclient.client.kH;
import net.futureclient.client.qI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class fh {
    private final Minecraft f$d;
    private int f$g;
    private Map<EntityPlayer, List<MI>> f$M;

    public static Map f$E(fh fh2) {
        return fh2.f$M;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 << 3 ^ 5;
        int n5 = 5;
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

    public static int f$E(fh fh2) {
        return fh2.f$g;
    }

    public static Minecraft f$E(fh fh2) {
        return fh2.f$d;
    }

    /*
     * WARNING - void declaration
     */
    private Entity f$E(EntityPlayer entityPlayer, int n) {
        Object object;
        if (this.f$M.containsKey(entityPlayer) && (object = this.f$M.get(entityPlayer)).size() > 1) {
            int n2;
            Object object2;
            Object object3 = object.get(0);
            LinkedList<Object> linkedList = new LinkedList<Object>();
            Object object4 = object = object.iterator();
            while (object4.hasNext()) {
                object2 = object.next();
                linkedList.add(object2);
                object3 = object2;
                object4 = object;
            }
            object2 = linkedList.iterator();
            Iterator iterator = object2;
            while (iterator.hasNext()) {
                object3 = object2.next();
                iterator = object2;
            }
            Object object5 = object;
            object = (double)linkedList.size();
            object2 = new EntityOtherPlayerMP((World)this.f$d.world, entityPlayer.getGameProfile());
            ((EntityPlayer)object2).field_70145_X = false;
            object2.func_70107_b(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v);
            int n3 = n2 = 0;
            while (n3 < n) {
                void var11_10;
                double d;
                void var7_8;
                object2.func_70091_d(MoverType.SELF, (double)var7_8, d, (double)var11_10);
                if (!entityPlayer.capabilities.isFlying) {
                    d = d * 0.8 - 0.02;
                }
                if (((EntityPlayer)object2).field_70122_E && d < 0.0) {
                    d = 0.0;
                }
                var7_8 *= 0.99;
                var11_10 *= 0.99;
                n3 = n2;
            }
            return object2;
        }
        return null;
    }

    public fh() {
        fh fh2;
        fh fh3 = fh2;
        fh fh4 = fh2;
        fh3.f$M = new HashMap<EntityPlayer, List<MI>>();
        fh3.f$g = 10;
        fh3.f$d = Minecraft.getMinecraft();
        kH.f$E().f$E().f$a(new qI(fh2));
    }

    public Entity f$E(Entity entity) {
        Entity entity2;
        int n = (int)Math.ceil((double)(0.f$d.player.connection.getPlayerInfo(0.f$d.player.func_110124_au()) != null ? 0.f$d.player.connection.getPlayerInfo(0.f$d.player.func_110124_au()).getResponseTime() : 0) / 50.0) + 1;
        if (entity instanceof EntityPlayer && (entity2 = 0.f$E((EntityPlayer)entity, n)) != null) {
            return entity2;
        }
        return entity;
    }
}
package net.futureclient.client;

import net.futureclient.client.GA;
import net.futureclient.client.Pg;
import net.futureclient.client.jD;
import net.futureclient.client.kH;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.item.ItemShulkerBox;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;

public class fH
extends GA {
    @Override
    public String f$E() {
        return null;
    }

    public fH() {
        fH fH2;
        String[] stringArray = new String[4];
        stringArray[0] = "Peek";
        stringArray[1] = "Peak";
        stringArray[2] = "Peeker";
        stringArray[3] = "ShulkerPeek";
        super(stringArray);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public String f$E(String[] 0) {
        block5: {
            block7: {
                block6: {
                    0 = Pg.f$E(ItemShulkerBox.class);
                    if (0 != null) ** GOTO lbl-1000
                    if (0.f$d.objectMouseOver.typeOfHit != RayTraceResult.Type.ENTITY) break block5;
                    var2_2 = 0.f$d.objectMouseOver.entityHit;
                    if (!(var2_2 instanceof EntityItem)) break block6;
                    var3_3 = (EntityItem)var2_2;
                    0 = var3_3.getItem();
                    ** GOTO lbl-1000
                }
                if (!(var2_2 instanceof EntityItemFrame)) break block7;
                var3_3 = (EntityItemFrame)var2_2;
                0 = var3_3.getDisplayedItem();
                ** GOTO lbl-1000
            }
            if (!(var2_2 instanceof EntityLivingBase)) ** GOTO lbl-1000
            var3_3 = (EntityLivingBase)var2_2;
            0 = Pg.f$E((EntityLivingBase)var3_3, ItemShulkerBox.class);
            ** GOTO lbl-1000
        }
        if (0.f$d.objectMouseOver.typeOfHit == RayTraceResult.Type.BLOCK) {
            v0 = 0;
            v1 = var2_2 = v0.f$d.objectMouseOver.getBlockPos();
            var3_3 = v0.f$d.world.func_72872_a(EntityItem.class, new AxisAlignedBB((BlockPos)v1, v1.add(1, 2, 1))).iterator();
            while (var3_3.hasNext()) {
                var4_4 = ((EntityItem)var3_3.next()).getItem();
                if (!(var4_4.getItem() instanceof ItemShulkerBox)) continue;
                v2 = 0 = var4_4;
                break;
            }
        } else lbl-1000:
        // 7 sources

        {
            v2 = var2_2 = 0;
        }
        if (var2_2 != null && var2_2.getItem() instanceof ItemShulkerBox) {
            if (var2_2.getTagCompound() != null) {
                kH.f$E().f$E().f$a(new jD(0, var2_2));
                return "Opened shulker box.";
            }
            return "Empty shulker box.";
        }
        return "No shulker box found in hand or crosshair.";
    }

    public static Minecraft f$E(fH fH2) {
        return fH2.f$d;
    }

    public static Minecraft f$a(fH fH2) {
        return fH2.f$d;
    }
}
