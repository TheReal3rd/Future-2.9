package net.futureclient.client;

import net.futureclient.client.BI;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Jd;
import net.futureclient.client.Wc;
import net.futureclient.client.gA;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;

public class VB
extends Ba {
    private z<Boolean> f$b;
    private s f$d;
    private z<Boolean> f$e;
    private z<Boolean> f$K;
    private z<Boolean> f$a;
    private z<Boolean> f$j;
    private z<Boolean> f$I;
    private z<Boolean> f$i;
    private z<Boolean> f$B;
    private z<Boolean> f$C;
    private ka<Wc> f$g;
    private ka<Jd> f$M;

    public static Minecraft f$E() {
        return f$d;
    }

    public static s f$E(VB vB) {
        return vB.f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static ka f$a(VB vB) {
        return vB.f$M;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    private boolean f$E(Entity entity) {
        if (entity == null || entity == f$d.getRenderViewEntity() || f$d.getRenderViewEntity() != null && entity == f$d.getRenderViewEntity().getRidingEntity()) {
            return false;
        }
        if (0.f$B.f$E().booleanValue() && entity instanceof EntityPlayer && (0.f$C.f$E().booleanValue() || !entity.isInvisible()) && (0.f$a.f$E().booleanValue() || !kH.f$E().f$E().f$E(entity.getName()))) {
            return true;
        }
        if (0.f$e.f$E().booleanValue() && (BI.f$M(entity) || BI.f$C(entity))) {
            return true;
        }
        if (0.f$I.f$E().booleanValue() && (BI.f$j(entity) || BI.f$I(entity))) {
            return true;
        }
        if (0.f$K.f$E().booleanValue() && BI.f$H(entity)) {
            return true;
        }
        if (0.f$j.f$E().booleanValue() && BI.f$h(entity)) {
            return true;
        }
        return 0.f$b.f$E() != false && entity instanceof EntityItem;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public VB() {
        VB vB;
        String[] stringArray = new String[3];
        stringArray[0] = "Tracers";
        stringArray[1] = "trace";
        stringArray[2] = "tracer";
        super("Tracers", stringArray, false, -38037, JD.f$i);
        VB vB2 = vB;
        String[] stringArray2 = new String[5];
        stringArray2[0] = "Players";
        stringArray2[1] = "Player";
        stringArray2[2] = "Mans";
        stringArray2[3] = "Humans";
        stringArray2[4] = "p";
        vB2.f$B = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Friends";
        stringArray3[1] = "Friend";
        stringArray3[2] = "Teammates";
        stringArray3[3] = "Teammate";
        vB.f$a = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "Invisibles";
        stringArray4[1] = "invis";
        stringArray4[2] = "inv";
        stringArray4[3] = "i";
        vB.f$C = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Monsters";
        stringArray5[1] = "Mobs";
        stringArray5[2] = "Mob";
        vB.f$e = new z<Boolean>(false, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Animals";
        stringArray6[1] = "Anamals";
        stringArray6[2] = "Anims";
        vB.f$I = new z<Boolean>(false, stringArray6);
        String[] stringArray7 = new String[6];
        stringArray7[0] = "Vehicles";
        stringArray7[1] = "Boat";
        stringArray7[2] = "Boats";
        stringArray7[3] = "Minecarts";
        stringArray7[4] = "Minecart";
        stringArray7[5] = "V";
        vB.f$K = new z<Boolean>(false, stringArray7);
        String[] stringArray8 = new String[6];
        stringArray8[0] = "Items";
        stringArray8[1] = "Item";
        stringArray8[2] = "Gems";
        stringArray8[3] = "aitems";
        stringArray8[4] = "itms";
        stringArray8[5] = "tems";
        vB.f$b = new z<Boolean>(false, stringArray8);
        String[] stringArray9 = new String[6];
        stringArray9[0] = "Others";
        stringArray9[1] = "Other";
        stringArray9[2] = "Miscellaneous";
        stringArray9[3] = "Misc";
        stringArray9[4] = "Miscellaneus";
        stringArray9[5] = "M";
        vB.f$j = new z<Boolean>(false, stringArray9);
        String[] stringArray10 = new String[3];
        stringArray10[0] = "Lines";
        stringArray10[1] = "line";
        stringArray10[2] = "l";
        vB.f$i = new z<Boolean>(true, stringArray10);
        String[] stringArray11 = new String[3];
        stringArray11[0] = "Target";
        stringArray11[1] = "Type";
        stringArray11[2] = "t";
        vB.f$M = new ka<Jd>(Jd.f$g, stringArray11);
        String[] stringArray12 = new String[4];
        stringArray12[0] = "Design";
        stringArray12[1] = "Box";
        stringArray12[2] = "d";
        stringArray12[3] = "type";
        vB.f$g = new ka<Wc>(Wc.f$g, stringArray12);
        String[] stringArray13 = new String[3];
        stringArray13[0] = "Width";
        stringArray13[1] = "Radius";
        stringArray13[2] = "raidus";
        vB.f$d = new s((Number)Float.valueOf(1.6f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(10.0f), 0.1, stringArray13);
        vB.f$E(vB.f$B, vB.f$a, vB.f$C, vB.f$e, vB.f$I, vB.f$K, vB.f$b, vB.f$j, vB.f$M, vB.f$g, vB.f$i, vB.f$d);
        vB.f$E(new gA(vB));
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static ka f$E(VB vB) {
        return vB.f$g;
    }

    public static z f$E(VB vB) {
        return vB.f$i;
    }

    public static boolean f$E(VB vB, Entity entity) {
        return vB.f$E(entity);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Yd;
import net.futureclient.client.ZB;

public class Vb
extends Ha<Yd> {
    public final ZB f$d;

    @Override
    public void f$E(Yd yd) {
        if (((Boolean)ZB.f$E(0.f$d).f$E()).booleanValue()) {
            yd.f$E(true);
        }
    }

    public Vb(ZB zB) {
        0.f$d = zB;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.He;
import net.futureclient.client.JD;
import net.futureclient.client.Y;
import net.futureclient.client.qd;
import net.futureclient.client.s;
import net.futureclient.client.vc;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.item.ItemFishingRod;

public class vb
extends Ba {
    private int f$M;
    private int f$g;
    private int f$i;
    private boolean f$d;
    private s f$j;
    private z<Boolean> f$K;
    private s f$b;

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static boolean f$E(vb vb2) {
        return vb2.f$d;
    }

    public static int f$B(vb vb2) {
        return vb2.f$M;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    private void f$A() {
        if (!vb.f$d.player.field_71071_by.getCurrentItem().isEmpty() || vb.f$d.player.field_71071_by.getCurrentItem().getItem() instanceof ItemFishingRod) {
            vb vb2;
            if (!vb2.f$K.f$E().booleanValue()) {
                if (vb.f$d.currentScreen instanceof GuiChat || vb.f$d.currentScreen == null) {
                    ((Y)f$d).f$E(He.f$M);
                    vb2.f$i = vb2.f$b.f$E().intValue();
                    vb2.f$M = 0;
                    return;
                }
            } else {
                ((Y)f$d).f$E(He.f$M);
                vb2.f$i = vb2.f$b.f$E().intValue();
                vb2.f$M = 0;
            }
        }
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static int f$K(vb vb2) {
        return vb2.f$M++;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static int f$h(vb vb2) {
        return vb2.f$i;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static void f$E(vb vb2) {
        vb2.f$A();
    }

    public static int f$e(vb vb2) {
        return vb2.f$g++;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static s f$E(vb vb2) {
        return vb2.f$j;
    }

    public static boolean f$E(vb vb2, boolean bl) {
        vb2.f$d = bl;
        return vb2.f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    @Override
    public void f$B() {
        vb vb2;
        vb vb3 = vb2;
        super.f$B();
        vb3.f$i = 0;
        vb3.f$M = 0;
    }

    public static int f$a(vb vb2) {
        return vb2.f$g;
    }

    public static int f$A(vb vb2) {
        return vb2.f$i--;
    }

    public vb() {
        vb vb2;
        String[] stringArray = new String[3];
        stringArray[0] = "AutoFish";
        stringArray[1] = "Fish";
        stringArray[2] = "Fishing";
        super("AutoFish", stringArray, true, -6732630, JD.f$b);
        vb vb3 = vb2;
        String[] stringArray2 = new String[6];
        stringArray2[0] = "Open Inventory";
        stringArray2[1] = "OpenInventory";
        stringArray2[2] = "Open";
        stringArray2[3] = "Inv";
        stringArray2[4] = "Inventory";
        stringArray2[5] = "OpenInv";
        vb3.f$K = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "CastingDelay";
        stringArray3[1] = "CastDelay";
        stringArray3[2] = "CastDel";
        stringArray3[3] = "cd";
        vb2.f$b = new s((Number)Float.valueOf(15.0f), (Number)Float.valueOf(10.0f), (Number)Float.valueOf(25.0f), 1, stringArray3);
        String[] stringArray4 = new String[6];
        stringArray4[0] = "MaxSoundDist";
        stringArray4[1] = "MaxSoundDistance";
        stringArray4[2] = "MaxSoundist";
        stringArray4[3] = "MaxDist";
        stringArray4[4] = "msd";
        stringArray4[5] = "md";
        vb2.f$j = new s((Number)2.0, (Number)0.0, (Number)5.0, 0.1, stringArray4);
        vb2.f$E(vb2.f$K, vb2.f$b, vb2.f$j);
        vb2.f$E(new vc(vb2), new qd(vb2));
    }

    public static int f$E(vb vb2) {
        return vb2.f$g--;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.OB;
import net.futureclient.client.Pg;
import net.futureclient.client.Sc;
import net.futureclient.client.Uh;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;

public class vB
extends Ba {
    private s f$d;
    private z<Boolean> f$M;
    private z<Boolean> f$i;
    private z<Boolean> f$g;

    private String f$E(EntityAnimal object) {
        double d;
        double d2 = Math.ceil(object.func_110143_aJ());
        object = d > 18.0 ? "\u00a7a" : (d2 > 16.0 ? "\u00a72" : (d2 > 12.0 ? "\u00a7e" : (d2 > 8.0 ? "\u00a76" : (d2 > 5.0 ? "\u00a7c" : "\u00a74"))));
        return new StringBuilder().insert(0, (String)object).append(d2 > 0.0 ? Integer.valueOf((int)d2) : "dead").toString();
    }

    private boolean f$E(EntityAnimal entityAnimal) {
        return entityAnimal != null && Pg.f$E((Entity)entityAnimal) && entityAnimal.func_110138_aP() == 20.0f;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static String f$E(vB vB2, EntityAnimal entityAnimal) {
        return vB2.f$E(entityAnimal);
    }

    private void f$a(Entity entity, String string, double d, double 022, double d2, float f2) {
        Entity entity2;
        double d3 = 022;
        d3 += entity.isSneaking() ? 0.5 : 0.7;
        Entity entity3 = entity = f$d.getRenderViewEntity() == null ? ((Minecraft)vB.f$d).player : f$d.getRenderViewEntity();
        double d4 = entity3.posX;
        double d5 = entity3.posY;
        double d6 = entity3.posZ;
        Object f2 = Uh.f$E(entity3);
        entity3.posX = f2.x;
        entity3.posY = f2.y;
        entity3.posZ = f2.z;
        f2 = (gF)kH.f$E().f$E().f$E(gF.class);
        double 022 = entity.getDistance(d + vB.f$d.getRenderManager().viewerPosX, 022 + vB.f$d.getRenderManager().viewerPosY, d2 + vB.f$d.getRenderManager().viewerPosZ);
        int n = ((Minecraft)vB.f$d).fontRenderer.getStringWidth(string) / 2;
        int n2 = f2.f$L.f$E(string) / 2;
        OB oB = (OB)kH.f$E().f$E().f$E(OB.class);
        double d7 = 0.0018 + (double)(oB == null ? 0.003f : oB.f$d.f$E().floatValue()) * 022;
        if (022 <= 8.0) {
            d7 = 0.0245;
        }
        GlStateManager.pushMatrix();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)-1500000.0f);
        GlStateManager.disableLighting();
        GlStateManager.translate((float)((float)d), (float)((float)d3 + 1.4f), (float)((float)d2));
        GlStateManager.rotate((float)(-vB.f$d.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)vB.f$d.getRenderManager().playerViewX, (float)(vB.f$d.gameSettings.thirdPersonView == 2 ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((double)(-d7), (double)(-d7), (double)d7);
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        if (f2.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            Uh.f$E((float)(-n2 - 1), (float)(-f2.f$L.f$E()), (float)(n2 + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            entity2 = entity;
            f2.f$L.f$E(string, (double)(-n2), (double)(-(f2.f$L.f$E() - 1)), -1);
        } else {
            GlStateManager.enableBlend();
            Uh.f$E((float)(-n - 1), (float)(-vB.f$d.fontRenderer.FONT_HEIGHT), (float)(n + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            ((Minecraft)vB.f$d).fontRenderer.drawStringWithShadow(string, (float)(-n), (float)(-(vB.f$d.fontRenderer.FONT_HEIGHT - 1)), -1);
            entity2 = entity;
        }
        entity2.posX = d4;
        Entity entity4 = entity;
        entity4.posY = d5;
        entity4.posZ = d6;
        GlStateManager.enableDepth();
        GlStateManager.enableLighting();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.disablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)1500000.0f);
        GlStateManager.popMatrix();
    }

    public static s f$E(vB vB2) {
        return vB2.f$d;
    }

    public static void f$E(vB vB2, Entity entity, String string, double d, double d2, double d3, float f) {
        vB2.f$E(entity, string, d, d2, d3, f);
    }

    public vB() {
        vB vB2;
        String[] stringArray = new String[3];
        stringArray[0] = "Seeker";
        stringArray[1] = "seek";
        stringArray[2] = "hide";
        super("Seeker", stringArray, true, -7285564, JD.f$i);
        vB vB3 = vB2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "BoundingBox";
        stringArray2[1] = "Bound";
        vB3.f$i = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Tracers";
        stringArray3[1] = "Tracer";
        vB2.f$M = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Fill";
        stringArray4[1] = "filling";
        stringArray4[2] = "fillings";
        vB2.f$g = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[4];
        stringArray5[0] = "Width";
        stringArray5[1] = "With";
        stringArray5[2] = "Radius";
        stringArray5[3] = "raidus";
        vB2.f$d = new s((Number)Float.valueOf(0.6f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(10.0f), 0.1, stringArray5);
        vB2.f$E(vB2.f$i, vB2.f$g, vB2.f$M, vB2.f$d);
        vB2.f$E(new Sc(vB2));
    }

    public static z f$e(vB vB2) {
        return vB2.f$i;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static z f$a(vB vB2) {
        return vB2.f$g;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static boolean f$E(vB vB2, EntityAnimal entityAnimal) {
        return vB2.f$E(entityAnimal);
    }

    public static void f$a(vB vB2, Entity entity, String string, double d, double d2, double d3, float f) {
        vB2.f$a(entity, string, d, d2, d3, f);
    }

    public static Minecraft f$E() {
        return f$d;
    }

    private void f$E(Entity entity, String string2, double 032, double 022, double d, float f2) {
        Entity entity2;
        double d2 = 022;
        d2 += entity.isSneaking() ? 0.5 : 0.7;
        Entity entity3 = entity = f$d.getRenderViewEntity() == null ? ((Minecraft)vB.f$d).player : f$d.getRenderViewEntity();
        double d3 = entity3.posX;
        double d4 = entity3.posY;
        double d5 = entity3.posZ;
        Object f2 = Uh.f$E(entity3);
        entity3.posX = f2.x;
        entity3.posY = f2.y;
        entity3.posZ = f2.z;
        double 022 = entity3.getDistance(032 + vB.f$d.getRenderManager().viewerPosX, 022 + vB.f$d.getRenderManager().viewerPosY, d + vB.f$d.getRenderManager().viewerPosZ);
        f2 = (OB)kH.f$E().f$E().f$E(OB.class);
        double d6 = 0.0018 + (double)(f2 == null ? 0.003f : f2.f$d.f$E().floatValue()) * 022;
        if (022 <= 8.0) {
            d6 = 0.0245;
        }
        GlStateManager.pushMatrix();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)-1500000.0f);
        GlStateManager.disableLighting();
        GlStateManager.translate((float)((float)032), (float)((float)d2 + 1.4f), (float)((float)d));
        GlStateManager.rotate((float)(-vB.f$d.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)vB.f$d.getRenderManager().playerViewX, (float)(vB.f$d.gameSettings.thirdPersonView == 2 ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((double)(-d6), (double)(-d6), (double)d6);
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        f2 = (gF)kH.f$E().f$E().f$E(gF.class);
        if (f2 != null && f2.f$c.f$E().booleanValue()) {
            entity2 = entity;
            int 032 = f2.f$L.f$E(string2) / 2;
            GlStateManager.enableBlend();
            Object object = f2;
            Uh.f$E((float)(-032 - 1), (float)(-object.f$L.f$E()), (float)(032 + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            object.f$L.f$E(string2, (double)(-032), (double)(-(f2.f$L.f$E() - 1)), -1);
        } else {
            String string2;
            int 032 = ((Minecraft)vB.f$d).fontRenderer.getStringWidth(string2) / 2;
            GlStateManager.enableBlend();
            Uh.f$E((float)(-032 - 1), (float)(-vB.f$d.fontRenderer.FONT_HEIGHT), (float)(032 + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            ((Minecraft)vB.f$d).fontRenderer.drawStringWithShadow(string2, (float)(-032), (float)(-(vB.f$d.fontRenderer.FONT_HEIGHT - 1)), -1);
            entity2 = entity;
        }
        entity2.posX = d3;
        Entity entity4 = entity;
        entity4.posY = d4;
        entity4.posZ = d5;
        GlStateManager.enableDepth();
        GlStateManager.enableLighting();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.disablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)1500000.0f);
        GlStateManager.popMatrix();
    }

    public static z f$E(vB vB2) {
        return vB2.f$M;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
