package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.Ib;
import net.futureclient.client.QE;

public class We extends QE<Ib> {
    public We() {
        We we;
        We we2 = we;
        we2.f$d = new ArrayList();
    }
}
package net.futureclient.client;

import java.awt.Color;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.cf;
import net.futureclient.client.gD;
import net.futureclient.client.pe;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class WE
extends Ba {
    private final z<Boolean> f$I;
    private double f$i;
    private int f$M;
    private float f$d;
    private float f$g;
    private double f$j;
    private boolean f$b;
    private cf f$K;

    public static Minecraft f$j() {
        return f$d;
    }

    private int f$a() {
        int n;
        ItemBlock itemBlock;
        Item item = WE.f$d.player.field_71071_by.getCurrentItem().getItem();
        if (item instanceof ItemBlock && (itemBlock = (ItemBlock)item).getBlock() == Blocks.OBSIDIAN) {
            return WE.f$d.player.field_71071_by.currentItem;
        }
        int n2 = n = 0;
        while (n2 < 9) {
            item = WE.f$d.player.field_71071_by.getStackInSlot(n).getItem();
            if (item instanceof ItemBlock && ((ItemBlock)item).getBlock() == Blocks.OBSIDIAN) {
                return n;
            }
            n2 = ++n;
        }
        return -1;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static int f$E(WE wE) {
        return wE.f$M;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    private cf f$E(boolean bl) {
        int n;
        BlockPos blockPos = new BlockPos(WE.f$d.player.field_70165_t, WE.f$d.player.field_70163_u, WE.f$d.player.field_70161_v);
        EnumFacing[] enumFacingArray = EnumFacing.Plane.HORIZONTAL.facings();
        int n2 = enumFacingArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            BlockPos blockPos2;
            EnumFacing enumFacing = enumFacingArray[n];
            BlockPos blockPos3 = blockPos.offset(enumFacing);
            BlockPos blockPos4 = blockPos3.down();
            if (!WE.f$d.world.func_190527_a(Blocks.OBSIDIAN, blockPos4, false, EnumFacing.DOWN, null)) {
                if (WE.f$d.world.func_190527_a(Blocks.OBSIDIAN, blockPos3, false, EnumFacing.DOWN, null)) {
                    return new cf(blockPos4, EnumFacing.UP, null);
                }
            } else if (bl && !WE.f$d.world.func_190527_a(Blocks.OBSIDIAN, blockPos2 = blockPos4.offset((EnumFacing)(blockPos3 = enumFacing.getOpposite())), false, (EnumFacing)blockPos3, null) && WE.f$d.world.func_190527_a(Blocks.OBSIDIAN, blockPos4, false, (EnumFacing)blockPos3, null)) {
                return new cf(blockPos2, enumFacing, null);
            }
            n3 = ++n;
        }
        return null;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static boolean f$E(WE wE) {
        return wE.f$b;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static cf f$E(WE wE, cf cf2) {
        wE.f$K = cf2;
        return wE.f$K;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static float f$E(WE wE, float f) {
        wE.f$g = f;
        return wE.f$g;
    }

    @Override
    public void f$B() {
        WE wE;
        WE wE2 = wE;
        super.f$B();
        wE2.f$K = null;
        wE2.f$b = false;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static double f$a(WE wE) {
        return wE.f$j;
    }

    public static cf f$E(WE wE) {
        return wE.f$K;
    }

    public static boolean f$E(WE wE, boolean bl) {
        wE.f$b = bl;
        return wE.f$b;
    }

    public static float f$a(WE wE) {
        return wE.f$g;
    }

    public WE() {
        WE wE;
        String[] stringArray = new String[1];
        stringArray[0] = "AutoObsidian";
        super("AutoObsidian", stringArray, true, new Color(100, 0, 150).getRGB(), JD.f$I);
        String[] stringArray2 = new String[6];
        stringArray2[0] = "Center";
        stringArray2[1] = "forcecenter";
        stringArray2[2] = "teleport";
        stringArray2[3] = "c";
        stringArray2[4] = "tp";
        stringArray2[5] = "fc";
        wE.f$I = new z<Boolean>(true, stringArray2);
        wE.f$K = null;
        wE.f$M = -1;
        wE.f$E(wE.f$I);
        wE.f$E(new pe(wE), new gD(wE));
    }

    public static Minecraft f$D() {
        return f$d;
    }

    @Override
    public void f$K() {
        WE wE;
        if (WE.f$d.player != null && wE.f$I.f$E().booleanValue() && wE.f$a() != -1) {
            WE wE2 = wE;
            wE2.f$b = true;
            BlockPos blockPos = new BlockPos(WE.f$d.player.field_70165_t, WE.f$d.player.field_70163_u, WE.f$d.player.field_70161_v);
            wE2.f$j = (double)blockPos.func_177958_n() + 0.5;
            wE2.f$i = (double)blockPos.func_177952_p() + 0.5;
        }
        super.f$K();
    }

    public static double f$E(WE wE) {
        return wE.f$i;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static float f$E(WE wE) {
        return wE.f$d;
    }

    public static int f$a(WE wE) {
        return wE.f$a();
    }

    public static int f$E(WE wE, int n) {
        wE.f$M = n;
        return wE.f$M;
    }

    public static cf f$E(WE wE, boolean bl) {
        return wE.f$E(bl);
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static float f$a(WE wE, float f) {
        wE.f$d = f;
        return wE.f$d;
    }
}
package net.futureclient.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Vf;
import net.futureclient.client.hE;
import net.futureclient.client.ka;
import net.futureclient.client.pf;
import net.futureclient.client.s;
import net.futureclient.client.sG;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;

public class wE
extends Ba {
    private int f$l;
    private int f$A;
    private z<Boolean> f$i;
    private z<Boolean> f$d;
    private ka<sG> f$K;
    private z<Boolean> f$g;
    private s f$C;
    private Map<EntityPlayer, List<Vec3d>> f$B;
    private s f$e;
    private ka<Vf> f$b;
    private s f$a;
    private EntityPlayer f$c;
    public z<Boolean> f$j;
    private z<Boolean> f$M;
    private int f$L;
    private s f$I;

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static z f$a(wE wE2) {
        return wE2.f$i;
    }

    public static int f$E(wE wE2) {
        return --wE2.f$l;
    }

    public static z f$B(wE wE2) {
        return wE2.f$M;
    }

    public static s f$E(wE wE2) {
        return wE2.f$a;
    }

    public static ka f$a(wE wE2) {
        return wE2.f$b;
    }

    private String f$E(Entity object) {
        object = Pattern.compile("\u00a7(.).*\u00a7r").matcher(object.getDisplayName().getFormattedText());
        if (((Matcher)object).find()) {
            return ((Matcher)object).group(1);
        }
        return "f";
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static int f$E(wE wE2, int n) {
        wE2.f$L = n;
        return wE2.f$L;
    }

    public static s f$e(wE wE2) {
        return wE2.f$I;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static EntityPlayer f$E(wE wE2, EntityPlayer entityPlayer) {
        wE2.f$c = entityPlayer;
        return wE2.f$c;
    }

    public static z f$E(wE wE2) {
        return wE2.f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static int f$a(wE wE2, int n) {
        wE2.f$l = n;
        return wE2.f$l;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static int f$A(wE wE2) {
        return ++wE2.f$l;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    private double f$E(EntityPlayer entityPlayer) {
        double d = -((Minecraft)wE.f$d).player.func_70032_d((Entity)entityPlayer);
        if (entityPlayer.field_70142_S == entityPlayer.field_70165_t && entityPlayer.field_70137_T == entityPlayer.field_70163_u && entityPlayer.field_70136_U == entityPlayer.field_70161_v) {
            d += 200.0;
        }
        return d -= (double)(entityPlayer.func_70032_d((Entity)((Minecraft)wE.f$d).player) / 5.0f);
    }

    public static Map f$E(wE wE2, Map map) {
        wE2.f$B = map;
        return wE2.f$B;
    }

    public wE() {
        wE wE2;
        String[] stringArray = new String[3];
        stringArray[0] = "CopsAndCrims";
        stringArray[1] = "CAC";
        stringArray[2] = "Aimware";
        super("CopsAndCrims", stringArray, true, -3128823, JD.f$I);
        wE2.f$A = 10;
        wE wE3 = wE2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Delay";
        stringArray2[1] = "Del";
        wE3.f$a = new s((Number)Float.valueOf(7.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(35.0f), 0.1, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "FOV";
        stringArray3[1] = "Fieldofview";
        wE2.f$C = new s((Number)Float.valueOf(180.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(180.0f), 1, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "HRecoil";
        stringArray4[1] = "rcsHorizontal";
        stringArray4[2] = "Horizontal";
        wE2.f$e = new s((Number)Float.valueOf(0.1f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(2.0f), 0.1, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "VRecoil";
        stringArray5[1] = "rcsVertical";
        stringArray5[2] = "Vertical";
        wE2.f$I = new s((Number)Float.valueOf(0.5f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(2.0f), 0.1, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Bone";
        stringArray6[1] = "Targeting";
        stringArray6[2] = "AimPos";
        wE2.f$K = new ka<sG>(sG.f$K, stringArray6);
        String[] stringArray7 = new String[3];
        stringArray7[0] = "ClickType";
        stringArray7[1] = "Type";
        stringArray7[2] = "Hand";
        wE2.f$b = new ka<Vf>(Vf.f$M, stringArray7);
        String[] stringArray8 = new String[4];
        stringArray8[0] = "TeamProtect";
        stringArray8[1] = "TeamKill";
        stringArray8[2] = "AttackTeam";
        stringArray8[3] = "teamdamage";
        wE2.f$j = new z<Boolean>(true, stringArray8);
        String[] stringArray9 = new String[1];
        stringArray9[0] = "NoSpread";
        wE2.f$i = new z<Boolean>(true, stringArray9);
        String[] stringArray10 = new String[5];
        stringArray10[0] = "RCS";
        stringArray10[1] = "RecoilControlSystem";
        stringArray10[2] = "Recoil";
        stringArray10[3] = "RecoilControl";
        stringArray10[4] = "RC";
        wE2.f$M = new z<Boolean>(false, stringArray10);
        String[] stringArray11 = new String[3];
        stringArray11[0] = "SilentAim";
        stringArray11[1] = "Silent";
        stringArray11[2] = "Sailent";
        wE2.f$g = new z<Boolean>(true, stringArray11);
        String[] stringArray12 = new String[4];
        stringArray12[0] = "AutoShoot";
        stringArray12[1] = "AS";
        stringArray12[2] = "Autofire";
        stringArray12[3] = "Autoshot";
        wE2.f$d = new z<Boolean>(true, stringArray12);
        wE2.f$B = new HashMap<EntityPlayer, List<Vec3d>>();
        wE2.f$E(wE2.f$i, wE2.f$M, wE2.f$d, wE2.f$g, wE2.f$b, wE2.f$a, wE2.f$C, wE2.f$K, wE2.f$e, wE2.f$I, wE2.f$j);
        wE2.f$E(new hE(wE2), new pf(wE2));
    }

    public static int f$a(wE wE2) {
        return wE2.f$L;
    }

    public boolean f$E(EntityPlayer entityPlayer, EntityPlayer entityPlayer2) {
        if (entityPlayer.getDisplayName().getFormattedText().contains(new StringBuilder().insert(0, "\u00a7").append(0.f$E((Entity)entityPlayer)).toString())) {
            if (entityPlayer2.getDisplayName().getFormattedText().contains(new StringBuilder().insert(0, "\u00a7").append(0.f$E((Entity)entityPlayer)).toString())) {
                return true;
            }
        }
        return false;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static double f$E(wE wE2, EntityPlayer entityPlayer) {
        return wE2.f$E(entityPlayer);
    }

    public static ka f$E(wE wE2) {
        return wE2.f$K;
    }

    public static z f$e(wE wE2) {
        return wE2.f$g;
    }

    public static Map f$E(wE wE2) {
        return wE2.f$B;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static s f$B(wE wE2) {
        return wE2.f$C;
    }

    public static int f$B(wE wE2) {
        return wE2.f$l;
    }

    public static int f$e(wE wE2) {
        return ++wE2.f$L;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static EntityPlayer f$E(wE wE2) {
        return wE2.f$c;
    }

    public static s f$a(wE wE2) {
        return wE2.f$e;
    }

    public static int f$K(wE wE2) {
        return wE2.f$A;
    }

    public static Minecraft f$j() {
        return f$d;
    }
}
package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.Uh;
import net.futureclient.client.Y;
import net.futureclient.client.YE;
import net.futureclient.client.ah;
import net.futureclient.client.kH;
import net.futureclient.client.sE;
import net.futureclient.client.vf;
import net.futureclient.client.wD;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

public class we
extends Ha<sE> {
    public final vf f$d;

    public we(vf vf2) {
        0.f$d = vf2;
    }

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        boolean bl = GL11.glIsEnabled((int)2896);
        boolean bl2 = GL11.glIsEnabled((int)3042);
        boolean bl3 = GL11.glIsEnabled((int)3553);
        boolean bl4 = GL11.glIsEnabled((int)2929);
        boolean bl5 = GL11.glIsEnabled((int)2848);
        GL11.glPushMatrix();
        GL11.glDepthMask((boolean)false);
        if (bl) {
            GL11.glDisable((int)2896);
        }
        GL11.glBlendFunc((int)770, (int)771);
        if (!bl2) {
            GL11.glEnable((int)3042);
        }
        GL11.glLineWidth((float)0.5f);
        if (bl3) {
            GL11.glDisable((int)3553);
        }
        if (bl4) {
            GL11.glDisable((int)2929);
        }
        if (!bl5) {
            GL11.glEnable((int)2848);
        }
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        GL11.glColor4d((double)((float)wD2.f$a.getRed() / 255.0f), (double)((float)wD2.f$a.getGreen() / 255.0f), (double)((float)wD2.f$a.getBlue() / 255.0f), (double)1.0);
        wD2 = new Frustum();
        Object object = vf.f$C().getRenderViewEntity() == null ? vf.f$H().player : vf.f$h().getRenderViewEntity();
        wD2.setPosition(((Entity)object).lastTickPosX + (((Entity)object).posX - ((Entity)object).lastTickPosX) * (double)((Y)vf.f$A()).getTimer().renderPartialTicks, ((Entity)object).lastTickPosY + (((Entity)object).posY - ((Entity)object).lastTickPosY) * (double)((Y)vf.f$K()).getTimer().renderPartialTicks, ((Entity)object).lastTickPosZ + (((Entity)object).posZ - ((Entity)object).lastTickPosZ) * (double)((Y)vf.f$B()).getTimer().renderPartialTicks);
        object = vf.f$E(0.f$d).iterator();
        Iterator iterator = object;
        while (iterator.hasNext()) {
            ah ah2 = (ah)object.next();
            double d = ah2.f$g * 16;
            double d2 = ah2.f$d * 16;
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(d, 0.0, d2, d + 16.0, 0.0, d2 + 16.0);
            if (!wD2.isBoundingBoxInFrustum(axisAlignedBB)) {
                iterator = object;
                continue;
            }
            Uh.f$E(axisAlignedBB.offset(-((K)vf.f$e().getRenderManager()).getRenderPosX(), -((K)vf.f$a().getRenderManager()).getRenderPosY(), -((K)vf.f$E().getRenderManager()).getRenderPosZ()));
            iterator = object;
        }
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        if (!bl5) {
            GL11.glDisable((int)2848);
        }
        if (bl4) {
            GL11.glEnable((int)2929);
        }
        if (bl3) {
            GL11.glEnable((int)3553);
        }
        if (!bl2) {
            GL11.glDisable((int)3042);
        }
        if (bl) {
            GL11.glEnable((int)2896);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glPopMatrix();
    }
}
