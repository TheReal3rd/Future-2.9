package net.futureclient.client.deof.modules.render.esp;

import net.futureclient.client.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;

public class ESP {
}
/*
package net.futureclient.client;

import java.awt.Color;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.futureclient.client.BI;
import net.futureclient.client.Ba;
import net.futureclient.client.Hd;
import net.futureclient.client.JD;
import net.futureclient.client.PC;
import net.futureclient.client.Pg;
import net.futureclient.client.Xc;
import net.futureclient.client.Y;
import net.futureclient.client.aj;
import net.futureclient.client.c;
import net.futureclient.client.cb;
import net.futureclient.client.gb;
import net.futureclient.client.jA;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.mb;
import net.futureclient.client.rc;
import net.futureclient.client.s;
import net.futureclient.client.tI;
import net.futureclient.client.uB;
import net.futureclient.client.vA;
import net.futureclient.client.vH;
import net.futureclient.client.wE;
import net.futureclient.client.z;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public class zA
extends Ba {
    private Xc f$E;
    private z<Boolean> f$D;
    private z<Boolean> f$m;
    private z<Boolean> f$A;
    private z<Boolean> f$L;
    private Framebuffer f$J;
    public static boolean f$M;
    private ka<mb> f$K;
    private z<Boolean> f$c;
    private z<Boolean> f$B;
    public static boolean f$j;
    private final double f$k;
    private final List<cb> f$H;
    public static boolean f$b;
    private z<Boolean> f$e;
    public static boolean f$i;
    private z<Boolean> f$C;
    private s f$I;
    private CopyOnWriteArrayList<BlockPos> f$d;
    private boolean f$g;
    private z<Boolean> f$l;
    private final int f$F;
    private z<Boolean> f$a;

    public zA() {
        zA zA2;
        String[] stringArray = new String[4];
        stringArray[0] = "ESP";
        stringArray[1] = "ES";
        stringArray[2] = "boxes";
        stringArray[3] = "playeresp";
        super("ESP", stringArray, true, -58469, JD.f$i);
        zA zA3 = zA2;
        zA3.f$k = 1.0;
        zA3.f$F = 3;
        zA zA4 = zA2;
        zA3.f$H = new CopyOnWriteArrayList<cb>();
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Players";
        stringArray2[1] = "player";
        stringArray2[2] = "human";
        stringArray2[3] = "P";
        zA4.f$m = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[5];
        stringArray3[0] = "Monsters";
        stringArray3[1] = "Hostiles";
        stringArray3[2] = "Mobs";
        stringArray3[3] = "monstas";
        stringArray3[4] = "H";
        zA2.f$D = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[5];
        stringArray4[0] = "Animals";
        stringArray4[1] = "Neutrals";
        stringArray4[2] = "ani";
        stringArray4[3] = "animal";
        stringArray4[4] = "N";
        zA2.f$l = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[6];
        stringArray5[0] = "Vehicles";
        stringArray5[1] = "Boat";
        stringArray5[2] = "Boats";
        stringArray5[3] = "Minecarts";
        stringArray5[4] = "Minecart";
        stringArray5[5] = "V";
        zA2.f$L = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[6];
        stringArray6[0] = "Others";
        stringArray6[1] = "Other";
        stringArray6[2] = "Miscellaneous";
        stringArray6[3] = "Misc";
        stringArray6[4] = "Miscellaneus";
        stringArray6[5] = "M";
        zA2.f$c = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "Items";
        stringArray7[1] = "Item";
        stringArray7[2] = "tiems";
        stringArray7[3] = "I";
        zA2.f$A = new z<Boolean>(true, stringArray7);
        String[] stringArray8 = new String[3];
        stringArray8[0] = "Sounds";
        stringArray8[1] = "Sound";
        stringArray8[2] = "Walk";
        zA2.f$B = new z<Boolean>(false, stringArray8);
        String[] stringArray9 = new String[5];
        stringArray9[0] = "Tamed";
        stringArray9[1] = "Taimed";
        stringArray9[2] = "MobOwner";
        stringArray9[3] = "Owner";
        stringArray9[4] = "t";
        zA2.f$a = new z<Boolean>(false, stringArray9);
        String[] stringArray10 = new String[2];
        stringArray10[0] = "Holes";
        stringArray10[1] = "Hole";
        zA2.f$C = new z<Boolean>(false, stringArray10);
        String[] stringArray11 = new String[13];
        stringArray11[0] = "Storages";
        stringArray11[1] = "chest";
        stringArray11[2] = "chests";
        stringArray11[3] = "echest";
        stringArray11[4] = "Storage";
        stringArray11[5] = "S";
        stringArray11[6] = "ShulkerBoxes";
        stringArray11[7] = "Shulkers";
        stringArray11[8] = "ShulkerChests";
        stringArray11[9] = "ShulkerChest";
        stringArray11[10] = "Shulk";
        stringArray11[11] = "Shulks";
        stringArray11[12] = "Shulkchest";
        zA2.f$e = new z<Boolean>(true, stringArray11);
        String[] stringArray12 = new String[2];
        stringArray12[0] = "Linewidth";
        stringArray12[1] = "width";
        zA2.f$I = new s((Number)Float.valueOf(3.0f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(10.0f), 1.273197475E-314, stringArray12);
        String[] stringArray13 = new String[3];
        stringArray13[0] = "Mode";
        stringArray13[1] = "m";
        stringArray13[2] = "type";
        zA2.f$K = new ka<mb>(mb.f$M, stringArray13);
        zA2.f$d = new CopyOnWriteArrayList();
        zA2.f$E(zA2.f$K, zA2.f$m, zA2.f$D, zA2.f$l, zA2.f$L, zA2.f$c, zA2.f$A, zA2.f$B, zA2.f$a, zA2.f$C, zA2.f$e, zA2.f$I);
        zA2.f$E(new Hd(zA2), new uB(zA2), new gb(zA2), new rc(zA2), new jA(zA2), new vA(zA2));
    }

    static {
        f$b = true;
        f$j = true;
        f$i = true;
        f$M = true;
    }

    private void f$j() {
        Framebuffer framebuffer = f$d.getFramebuffer();
        if (framebuffer.depthBuffer > -1) {
            zA zA2;
            zA2.f$E(framebuffer);
            framebuffer.depthBuffer = -1;
        }
    }

    public static Minecraft f$j() {
        return f$d;
    }

    private void f$C() {
        GL11.glStencilFunc((int)512, (int)0, (int)255);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6914);
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static z f$C(zA zA2) {
        return zA2.f$D;
    }

    public static void f$C(zA zA2) {
        zA2.f$j();
    }

    public static Minecraft f$b() {
        return f$d;
    }

private void f$I() {
    Object object;
    Frustum frustum;
    try {
        frustum = new Frustum();
        object = f$d.getRenderViewEntity() == null ? ((Minecraft)zA.f$d).player : f$d.getRenderViewEntity();
    }
    catch (Exception exception) {
        // empty catch block
        return;
    }
    {
        EntityPlayerSP entityPlayerSP = object;
        for (TileEntity tileEntity : zA.f$d.world.field_147482_g) {
            zA zA2;
            if ((!(tileEntity instanceof TileEntityChest) && !(tileEntity instanceof TileEntityEnderChest) || !zA2.f$e.f$E().booleanValue()) && (!(tileEntity instanceof TileEntityShulkerBox) || !zA2.f$e.f$E().booleanValue())) continue;
            double d = entityPlayerSP.lastTickPosX + (entityPlayerSP.posX - entityPlayerSP.lastTickPosX) * (double)((Y)zA.f$d).getTimer().renderPartialTicks;
            double d2 = entityPlayerSP.lastTickPosY + (entityPlayerSP.posY - entityPlayerSP.lastTickPosY) * (double)((Y)zA.f$d).getTimer().renderPartialTicks;
            double d3 = entityPlayerSP.lastTickPosZ + (entityPlayerSP.posZ - entityPlayerSP.lastTickPosZ) * (double)((Y)zA.f$d).getTimer().renderPartialTicks;
            Frustum frustum2 = frustum;
            frustum2.setPosition(d, d2, d3);
            if (!frustum2.isBoxInFrustum((double)tileEntity.getPos().func_177958_n(), (double)tileEntity.getPos().func_177956_o(), (double)tileEntity.getPos().func_177952_p(), (double)(tileEntity.getPos().func_177958_n() + 1), (double)(tileEntity.getPos().func_177956_o() + 1), (double)(tileEntity.getPos().func_177952_p() + 1))) continue;
            GL11.glPushMatrix();
            GL11.glPushAttrib((int)1048575);
            zA2.f$E(tileEntity);
            TileEntityRendererDispatcher.instance.render(tileEntity, ((Y)zA.f$d).getTimer().renderPartialTicks, -1);
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }
    }
}

    public static Minecraft f$I() {
        return f$d;
    }

    public static z f$K(zA zA2) {
        return zA2.f$B;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static void f$K(zA zA2) {
        zA2.f$H();
    }

    @Override
    public void f$K() {
        zA zA2;
        zA zA3 = zA2;
        super.f$K();
        if (zA3.f$J != null) {
            zA2.f$J.unbindFramebuffer();
        }
        zA2.f$J = null;
        if (zA2.f$E != null) {
            zA2.f$E.f$e();
        }
        zA2.f$E = null;
        if (zA2.f$C.f$E().booleanValue()) {
            tI.f$a();
        }
    }

    public static z f$e(zA zA2) {
        return zA2.f$C;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    private boolean f$e(Entity entity) {
        if (entity == null || entity == f$d.getRenderViewEntity() || f$d.getRenderViewEntity() != null && entity == f$d.getRenderViewEntity().getRidingEntity()) {
            return false;
        }
        if (0.f$m.f$E().booleanValue() && entity instanceof EntityPlayer) {
            return true;
        }
        if (0.f$D.f$E().booleanValue() && (BI.f$M(entity) || BI.f$C(entity))) {
            return true;
        }
        if (0.f$l.f$E().booleanValue() && (BI.f$j(entity) || BI.f$I(entity))) {
            return true;
        }
        if (0.f$c.f$E().booleanValue() && BI.f$h(entity)) {
            return true;
        }
        return 0.f$A.f$E() != false && entity instanceof EntityItem;
    }

    public static void f$e(zA zA2) {
        zA2.f$A();
    }

    public static boolean f$a(zA zA2, Entity entity) {
        return zA2.f$a(entity);
    }

    public static void f$a(zA zA2) {
        zA2.f$I();
    }

    public static z f$a(zA zA2) {
        return zA2.f$e;
    }

    private boolean f$a(Entity entity) {
        EntityPlayerSP entityPlayerSP;
        Object object = entityPlayerSP = f$d.getRenderViewEntity() == null ? ((Minecraft)zA.f$d).player : f$d.getRenderViewEntity();
        return entity != null && !entity.equals((Object)((Minecraft)zA.f$d).player.func_184187_bx()) && (BI.f$I(entity) || BI.f$j(entity)) && 0.f$l.f$E() != false || (BI.f$M(entity) || BI.f$C(entity)) && 0.f$D.f$E() != false || entity instanceof EntityEnderCrystal && 0.f$c.f$E() != false || entity instanceof EntityPlayer && entity != entityPlayerSP && 0.f$m.f$E() != false;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static boolean f$E(zA zA2, Entity entity) {
        return zA2.f$e(entity);
    }

    public static boolean f$E(zA zA2, boolean bl) {
        zA2.f$g = bl;
        return zA2.f$g;
    }

    public static List f$E(zA zA2) {
        return zA2.f$H;
    }

    public static Xc f$E(zA zA2) {
        return zA2.f$E;
    }

    public static boolean f$E(zA zA2) {
        return zA2.f$g;
    }

    public static z f$E(zA zA2) {
        return zA2.f$L;
    }

    public static Xc f$E(zA zA2, Xc xc) {
        zA2.f$E = xc;
        return zA2.f$E;
    }

    public static PC f$E(zA zA2, BlockPos blockPos) {
        return zA2.f$E(blockPos);
    }

    public static s f$E(zA zA2) {
        return zA2.f$I;
    }

    private void f$E(Entity entity, double d, double d2, double d3, int n) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d), (float)((float)d2 + entity.height + 0.5f), (float)((float)d3));
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-zA.f$d.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glScalef((float)-0.017f, (float)-0.017f, (float)0.017f);
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        OpenGlHelper.glBlendFunc((int)770, (int)771, (int)1, (int)0);
        d = 0;
        if (entity.isSneaking()) {
            d = 4;
        }
        GL11.glDisable((int)3553);
        GL11.glPushMatrix();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2848);
        GlStateManager.disableLighting();
        aj.f$E(0.0, (double)(d + 19), 0.0, (double)(d + 21), -16777216);
        aj.f$E(0.0, (double)(d + 21), 0.0, (double)(d + 46), -16777216);
        aj.f$E(0.0, (double)(d + 21), 0.0, (double)(d + 25), n);
        aj.f$E(0.0, (double)(d + 25), 0.0, (double)(d + 48), n);
        aj.f$E(0.0, (double)(d + 19), 0.0, (double)(d + 21), -16777216);
        aj.f$E(0.0, (double)(d + 21), 0.0, (double)(d + 46), -16777216);
        aj.f$E(0.0, (double)(d + 21), 0.0, (double)(d + 25), n);
        aj.f$E(0.0, (double)(d + 25), 0.0, (double)(d + 48), n);
        aj.f$E(0.0, (double)(d + 140), 0.0, (double)(d + 142), -16777216);
        aj.f$E(0.0, (double)(d + 115), 0.0, (double)(d + 140), -16777216);
        aj.f$E(0.0, (double)(d + 136), 0.0, (double)(d + 140), n);
        aj.f$E(0.0, (double)(d + 113), 0.0, (double)(d + 140), n);
        aj.f$E(0.0, (double)(d + 140), 0.0, (double)(d + 142), -16777216);
        aj.f$E(0.0, (double)(d + 115), 0.0, (double)(d + 140), -16777216);
        aj.f$E(0.0, (double)(d + 136), 0.0, (double)(d + 140), n);
        aj.f$E(0.0, (double)(d + 113), 0.0, (double)(d + 140), n);
        GlStateManager.enableLighting();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    private boolean f$E(Entity entity) {
        return (entity instanceof EntityMinecart || entity instanceof EntityBoat) && !entity.equals((Object)((Minecraft)zA.f$d).player.func_184187_bx()) && 0.f$L.f$E() != false;
    }

    public static Framebuffer f$E(zA zA2, Framebuffer framebuffer) {
        zA2.f$J = framebuffer;
        return zA2.f$J;
    }

    public static CopyOnWriteArrayList f$E(zA zA2) {
        return zA2.f$d;
    }

    public static ka f$E(zA zA2) {
        return zA2.f$K;
    }

    public static void f$E(zA zA2) {
        zA2.f$i();
    }

    private void f$E(TileEntity tileEntity) {
        if (tileEntity instanceof TileEntityChest) {
            aj.f$E(new Color(200, 200, 101));
            return;
        }
        if (tileEntity instanceof TileEntityEnderChest) {
            aj.f$E(new Color(155, 0, 200, 255));
            return;
        }
        if (tileEntity instanceof TileEntityShulkerBox) {
            aj.f$E(new Color(200, 0, 106, 255));
        }
    }

    public static Framebuffer f$E(zA zA2) {
        return zA2.f$J;
    }

    private PC f$E(BlockPos enumFacingArray) {
        PC pC;
        PC pC2 = null;
        Block block = ((Minecraft)zA.f$d).world.func_180495_p((BlockPos)enumFacingArray).getBlock();
        if (block == Blocks.OBSIDIAN) {
            pC = pC2 = PC.f$i;
        } else {
            if (block == Blocks.BEDROCK) {
                pC2 = PC.f$M;
            }
            pC = pC2;
        }
        if (pC != null) {
            block = enumFacingArray.up(1);
            if (((Minecraft)zA.f$d).world.func_180495_p((BlockPos)block).getBlock() == Blocks.AIR) {
                if (((Minecraft)zA.f$d).world.func_180495_p((BlockPos)(enumFacingArray = enumFacingArray.up(2))).getBlock() == Blocks.AIR) {
                    int n;
                    enumFacingArray = EnumFacing.Plane.HORIZONTAL.facings();
                    int n2 = enumFacingArray.length;
                    int n3 = n = 0;
                    while (n3 < n2) {
                        EnumFacing enumFacing = enumFacingArray[n];
                        if ((enumFacing = ((Minecraft)zA.f$d).world.func_180495_p(block.offset(enumFacing)).getBlock()) == Blocks.OBSIDIAN) {
                            if (pC2 != PC.f$i) {
                                pC2 = PC.f$g;
                            }
                        } else {
                            if (enumFacing != Blocks.BEDROCK) {
                                pC2 = null;
                                break;
                            }
                            if (pC2 != PC.f$M) {
                                pC2 = PC.f$g;
                            }
                        }
                        n3 = ++n;
                    }
                } else {
                    pC2 = null;
                }
            } else {
                pC2 = null;
            }
        }
        return pC2;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static void f$E(zA zA2, Entity entity, double d, double d2, double d3, int n) {
        zA2.f$E(entity, d, d2, d3, n);
    }

    private void f$E(Entity entity2) {
        if (BI.f$H(entity2) && 0.f$L.f$E().booleanValue()) {
            aj.f$E(new Color(200, 100, 0, 255));
        }
        if ((BI.f$I(entity2) || BI.f$j(entity2)) && 0.f$l.f$E().booleanValue()) {
            aj.f$E(new Color(0, 200, 0, 255));
        }
        if ((BI.f$M(entity2) || BI.f$C(entity2)) && 0.f$D.f$E().booleanValue()) {
            aj.f$E(new Color(200, 60, 60, 255));
        }
        if (entity2 instanceof EntityEnderCrystal && 0.f$c.f$E().booleanValue()) {
            aj.f$E(new Color(200, 100, 200, 255));
        }
        if (entity2 instanceof EntityPlayer && 0.f$m.f$E().booleanValue()) {
            float f;
            if ((entity2 = (EntityPlayer)entity2).func_82150_aj()) {
                aj.f$E(new Color(133, 200, 178, 255));
            }
            wE wE2 = (wE)kH.f$E().f$E().f$E(wE.class);
            if (kH.f$E().f$E().f$E(entity2.getName()) || wE2 != null && wE2.f$E() && wE2.f$E((EntityPlayer)entity2, (EntityPlayer)((Minecraft)zA.f$d).player)) {
                aj.f$E(new Color(85, 200, 200, 255));
                return;
            }
            wE2 = f$d.getRenderViewEntity() == null ? ((Minecraft)zA.f$d).player : f$d.getRenderViewEntity();
            float entity2 = wE2.getDistance(entity2);
            if (entity2 >= 60.0f) {
                f = 120.0f;
            } else {
                float f2 = entity2;
                f = f2 + f2;
            }
            aj.f$E(new vH(f, 100.0f, 50.0f, 0.55f).f$E());
        }
    }

    private void f$E(Framebuffer framebuffer2) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)framebuffer2.depthBuffer);
        int framebuffer2 = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)framebuffer2);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)((Minecraft)zA.f$d).displayWidth, (int)((Minecraft)zA.f$d).displayHeight);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)framebuffer2);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)framebuffer2);
    }

    private void f$i() {
        Object object;
        Frustum frustum;
        try {
            frustum = new Frustum();
            object = f$d.getRenderViewEntity() == null ? ((Minecraft)zA.f$d).player : f$d.getRenderViewEntity();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        {
            EntityPlayerSP entityPlayerSP = object;
            for (Entity entity : ((Minecraft)zA.f$d).world.func_72910_y()) {
                zA zA2;
                if (!zA2.f$E(entity)) continue;
                double d = entityPlayerSP.lastTickPosX + (entityPlayerSP.posX - entityPlayerSP.lastTickPosX) * (double)((Y)zA.f$d).getTimer().renderPartialTicks;
                double d2 = entityPlayerSP.lastTickPosY + (entityPlayerSP.posY - entityPlayerSP.lastTickPosY) * (double)((Y)zA.f$d).getTimer().renderPartialTicks;
                double d3 = entityPlayerSP.lastTickPosZ + (entityPlayerSP.posZ - entityPlayerSP.lastTickPosZ) * (double)((Y)zA.f$d).getTimer().renderPartialTicks;
                Frustum frustum2 = frustum;
                frustum2.setPosition(d, d2, d3);
                if (!frustum2.isBoundingBoxInFrustum(entity.getEntityBoundingBox())) continue;
                GL11.glPushMatrix();
                GL11.glPushAttrib((int)1048575);
                zA2.f$E(entity);
                f$d.getRenderManager().renderEntityStatic(entity, ((Y)zA.f$d).getTimer().renderPartialTicks, true);
                GL11.glPopAttrib();
                GL11.glPopMatrix();
            }
        }
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    private void f$M() {
        zA zA2;
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)1048575);
        ((Minecraft)zA.f$d).entityRenderer.disableLightmap();
        GL11.glDisable((int)3008);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glEnable((int)2960);
        GL11.glClear((int)1024);
        GL11.glClearStencil((int)15);
        GL11.glStencilFunc((int)512, (int)1, (int)255);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glLineWidth((float)zA2.f$I.f$E().floatValue());
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static void f$B(zA zA2) {
        zA2.f$h();
    }

    public static Minecraft f$B() {
        return f$d;
    }

    @Override
    public void f$B() {
        zA zA2;
        zA zA3 = zA2;
        super.f$B();
        zA3.f$H.clear();
        zA3.f$d.clear();
    }

    public static z f$B(zA zA2) {
        return zA2.f$a;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$s() {
        return f$d;
    }

    public static Minecraft f$ba() {
        return f$d;
    }

    public static Minecraft f$fa() {
        return f$d;
    }

    public static Minecraft f$ka() {
        return f$d;
    }

    public static Minecraft f$za() {
        return f$d;
    }

    public static Minecraft f$la() {
        return f$d;
    }

    public static Minecraft f$na() {
        return f$d;
    }

    public static Minecraft f$R() {
        return f$d;
    }

    public static Minecraft f$sa() {
        return f$d;
    }

    public static Minecraft f$Ia() {
        return f$d;
    }

    public static Minecraft f$z() {
        return f$d;
    }

    public static Minecraft f$Oa() {
        return f$d;
    }

    public static Minecraft f$wa() {
        return f$d;
    }

    public static Minecraft f$ia() {
        return f$d;
    }

    public static Minecraft f$Wa() {
        return f$d;
    }

    public static Minecraft f$ca() {
        return f$d;
    }

    public static Minecraft f$Ba() {
        return f$d;
    }

    public static Minecraft f$Xa() {
        return f$d;
    }

    public static Minecraft f$aa() {
        return f$d;
    }

    public static Minecraft f$Ea() {
        return f$d;
    }

    public static Minecraft f$ya() {
        return f$d;
    }

    public static Minecraft f$Z() {
        return f$d;
    }

    public static Minecraft f$Ca() {
        return f$d;
    }

    public static Minecraft f$xa() {
        return f$d;
    }

    public static Minecraft f$Na() {
        return f$d;
    }

    public static Minecraft f$Ha() {
        return f$d;
    }

    public static Minecraft f$Da() {
        return f$d;
    }

    public static Minecraft f$ea() {
        return f$d;
    }

    public static Minecraft f$ra() {
        return f$d;
    }

    public static Minecraft f$Ka() {
        return f$d;
    }

    public static Minecraft f$Pa() {
        return f$d;
    }

    public static Minecraft f$Ra() {
        return f$d;
    }

    public static Minecraft f$Ma() {
        return f$d;
    }

    public static Minecraft f$ja() {
        return f$d;
    }

    public static Minecraft f$Va() {
        return f$d;
    }

    public static Minecraft f$da() {
        return f$d;
    }

    public static Minecraft f$qa() {
        return f$d;
    }

    public static Minecraft f$Ga() {
        return f$d;
    }

    public static Minecraft f$Ja() {
        return f$d;
    }

    public static Minecraft f$oa() {
        return f$d;
    }

    public static Minecraft f$ma() {
        return f$d;
    }

    public static Minecraft f$Sa() {
        return f$d;
    }

    public static Minecraft f$va() {
        return f$d;
    }

    public static Minecraft f$ua() {
        return f$d;
    }

    public static Minecraft f$ga() {
        return f$d;
    }

    public static Minecraft f$Qa() {
        return f$d;
    }

    public static Minecraft f$La() {
        return f$d;
    }

    public static Minecraft f$Ta() {
        return f$d;
    }

    public static Minecraft f$pa() {
        return f$d;
    }

    public static Minecraft f$ha() {
        return f$d;
    }

    public static Minecraft f$Ua() {
        return f$d;
    }

    public static Minecraft f$Aa() {
        return f$d;
    }

    public static Minecraft f$ta() {
        return f$d;
    }

    public static Minecraft f$Fa() {
        return f$d;
    }

    public static void f$A(zA zA2) {
        zA2.f$C();
    }

    private void f$A() {
        GL11.glPolygonOffset((float)1.0f, (float)2000000.0f);
        GL11.glDisable((int)10754);
        GL11.glDisable((int)2960);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)3008);
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static z f$A(zA zA2) {
        return zA2.f$A;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    private void f$c() {
        Object object;
        Frustum frustum;
        try {
            frustum = new Frustum();
            object = f$d.getRenderViewEntity() == null ? ((Minecraft)zA.f$d).player : f$d.getRenderViewEntity();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        {
            EntityPlayerSP entityPlayerSP = object;
            for (Entity entity : Pg.f$a()) {
                zA zA2;
                if (!zA2.f$a(entity)) continue;
                double d = entityPlayerSP.lastTickPosX + (entityPlayerSP.posX - entityPlayerSP.lastTickPosX) * (double)((Y)zA.f$d).getTimer().renderPartialTicks;
                double d2 = entityPlayerSP.lastTickPosY + (entityPlayerSP.posY - entityPlayerSP.lastTickPosY) * (double)((Y)zA.f$d).getTimer().renderPartialTicks;
                double d3 = entityPlayerSP.lastTickPosZ + (entityPlayerSP.posZ - entityPlayerSP.lastTickPosZ) * (double)((Y)zA.f$d).getTimer().renderPartialTicks;
                Frustum frustum2 = frustum;
                frustum2.setPosition(d, d2, d3);
                if (!frustum2.isBoundingBoxInFrustum(entity.getEntityBoundingBox())) continue;
                GL11.glPushMatrix();
                GL11.glPushAttrib((int)1048575);
                Entity entity2 = entity;
                zA2.f$E(entity2);
                boolean bl = false;
                if (entity2 instanceof EntityWolf) {
                    bl = ((c)entity).isIsWet();
                    ((c)entity).setIsWet(false);
                }
                f$d.getRenderManager().renderEntityStatic(entity, ((Y)zA.f$d).getTimer().renderPartialTicks, true);
                if (entity instanceof EntityWolf) {
                    ((c)entity).setIsWet(bl);
                }
                GL11.glPopAttrib();
                GL11.glPopMatrix();
            }
        }
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$r() {
        return f$d;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public static Minecraft f$O() {
        return f$d;
    }

    public static Minecraft f$V() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    private void f$H() {
        GL11.glStencilFunc((int)514, (int)1, (int)15);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public static z f$H(zA zA2) {
        return zA2.f$l;
    }

    public static void f$H(zA zA2) {
        zA2.f$M();
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$T() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static Minecraft f$y() {
        return f$d;
    }

    public static z f$h(zA zA2) {
        return zA2.f$c;
    }

    public static void f$h(zA zA2) {
        zA2.f$c();
    }

    private void f$h() {
        GL11.glEnable((int)10754);
        GL11.glPolygonOffset((float)1.0f, (float)-2000000.0f);
        OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)240.0f, (float)240.0f);
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static Minecraft f$q() {
        return f$d;
    }

    public static Minecraft f$X() {
        return f$d;
    }

    public static Minecraft f$S() {
        return f$d;
    }

    public static Minecraft f$N() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }
}
 */