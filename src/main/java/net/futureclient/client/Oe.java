package net.futureclient.client;

import net.futureclient.client.HE;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.kH;
import net.futureclient.client.uA;
import net.futureclient.client.yE;
import net.futureclient.client.zF;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;

public class Oe
extends Ha<Pf> {
    public final HE f$d;

    public Oe(HE hE) {
        0.f$d = hE;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(Pf 0) {
        0.f$d.f$a(String.format("AutoPot \u00a77[\u00a7F%s\u00a77]", new Object[]{0.f$d.f$e()}));
        var2_2 = (uA)kH.f$E().f$E().f$E(uA.class);
        if (((yE)kH.f$E().f$E().f$E(yE.class)).f$M) {
            return;
        }
        switch (zF.f$d[0.f$E().ordinal()]) {
            case 1: {
                while (false) {
                }
                if (0.f$d.f$a() == -1 || !(HE.f$S().player.func_110143_aJ() <= HE.f$e(0.f$d).f$E().floatValue()) || !0.f$d.f$d.f$a(HE.f$a(0.f$d).f$E().floatValue() * 1000.0f)) ** GOTO lbl42
                if (HE.f$N().player.field_70124_G && var2_2 != null && !var2_2.f$E() && !((Boolean)HE.f$E(0.f$d).f$E()).booleanValue()) {
                    v0 = 0;
                    v0.f$d.f$d.f$a();
                    HE.f$x().player.connection.sendPacket((Packet)new CPacketPlayer.PositionRotation(HE.f$X().player.field_70165_t, HE.f$u().player.field_70163_u, HE.f$V().player.field_70161_v, HE.f$q().player.field_70177_z, -90.0f, true));
                    v1 = 0;
                    v0.f$d.f$E(0.f$d.f$a(), HE.f$E(v1.f$d).f$E().intValue() - 1);
                    HE.f$p().player.connection.sendPacket((Packet)new CPacketHeldItemChange(HE.f$E(0.f$d).f$E().intValue() - 1));
                    if (v1.f$d.f$I.f$E().booleanValue()) {
                        HE.f$n().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                    } else {
                        HE.f$o().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND));
                    }
                    HE.f$v().player.connection.sendPacket((Packet)new CPacketHeldItemChange(HE.f$w().player.field_71071_by.currentItem));
                    HE.f$P().player.connection.sendPacket((Packet)new CPacketPlayer.Position(HE.f$W().player.field_70165_t, HE.f$Y().player.field_70163_u + 0.42, HE.f$t().player.field_70161_v, true));
                    HE.f$d().player.connection.sendPacket((Packet)new CPacketPlayer.Position(HE.f$Q().player.field_70165_t, HE.f$U().player.field_70163_u + 0.75, HE.f$J().player.field_70161_v, true));
                    HE.f$F().player.connection.sendPacket((Packet)new CPacketPlayer.Position(HE.f$l().player.field_70165_t, HE.f$k().player.field_70163_u + 1.0, HE.f$b().player.field_70161_v, true));
                    HE.f$m().player.connection.sendPacket((Packet)new CPacketPlayer.Position(HE.f$G().player.field_70165_t, HE.f$D().player.field_70163_u + 1.16, HE.f$g().player.field_70161_v, true));
                    HE.f$c().player.connection.sendPacket((Packet)new CPacketPlayer.Position(HE.f$f().player.field_70165_t, HE.f$L().player.field_70163_u + 1.24, HE.f$i().player.field_70161_v, true));
                    v2 = 0;
                    HE.f$e(0.f$d, HE.f$I().player.field_70165_t);
                    v3 = v2;
                    HE.f$a(v2.f$d, HE.f$j().player.field_70163_u + 1.24);
                    HE.f$E(0.f$d, HE.f$M().player.field_70161_v);
                    HE.f$E(0.f$d, 5);
                } else {
                    0.f$E(90.0f);
                    0.f$d.f$j = true;
                    0.f$d.f$d.f$a();
lbl42:
                    // 2 sources

                    v3 = 0;
                }
                if (HE.f$a(v3.f$d) >= 0) {
                    0.f$E(true);
                }
                if (HE.f$a(0.f$d) == 0) {
                    var3_3 = 0.0;
                    HE.f$C().player.field_70179_y = 0.0;
                    HE.f$H().player.field_70159_w = 0.0;
                    HE.f$h().player.func_70634_a(HE.f$e(0.f$d), HE.f$a(0.f$d), HE.f$E(0.f$d));
                    HE.f$A().player.field_70181_x = -0.08;
                }
                HE.f$E(0.f$d);
                return;
            }
            case 2: {
                if (!0.f$d.f$j) break;
                v4 = 0;
                v5 = 0;
                v4.f$d.f$E(v4.f$d.f$a(), HE.f$E(v5.f$d).f$E().intValue() - 1);
                HE.f$K().player.connection.sendPacket((Packet)new CPacketHeldItemChange(HE.f$E(0.f$d).f$E().intValue() - 1));
                if (v5.f$d.f$I.f$E().booleanValue()) {
                    HE.f$B().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                } else {
                    HE.f$e().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND));
                }
                HE.f$E().player.connection.sendPacket((Packet)new CPacketHeldItemChange(HE.f$a().player.field_71071_by.currentItem));
                0.f$d.f$d.f$a();
                0.f$d.f$j = false;
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.kg;
import net.futureclient.client.xf;
import net.minecraft.util.math.RayTraceResult;

public class OE
extends Ha<xf> {
    public final kg f$d;

    public OE(kg kg2) {
        0.f$d = kg2;
    }

    @Override
    public void f$E(xf xf2) {
        if (kg.f$K().getRenderViewEntity() != null && kg.f$B().objectMouseOver != null && kg.f$e().objectMouseOver.typeOfHit != RayTraceResult.Type.ENTITY && kg.f$a().world != null && kg.f$E().playerController != null) {
            xf2.f$a(kg.f$E(0.f$d).f$E().floatValue());
        }
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.Ud;
import net.futureclient.client.VD;
import net.futureclient.client.dE;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.tf;
import net.futureclient.client.z;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

public class oE
extends Ba {
    private Bh f$j;
    private List<Block> f$i;
    private s f$c;
    private s f$B;
    private z<Boolean> f$C;
    private int f$K;
    private int f$d;
    private List<BlockPos> f$g;
    private s f$L;
    private s f$A;
    private int f$I;
    private int f$e;
    private ka<VD> f$a;
    private boolean f$b;
    private List<BlockPos> f$M;

    @Override
    public void f$B() {
        oE oE2;
        oE oE3 = oE2;
        super.f$B();
        oE3.f$M.clear();
        oE3.f$g.clear();
        oE3.f$d = -2;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static List f$E(oE oE2) {
        return oE2.f$i;
    }

    public static List f$e(oE oE2) {
        return oE2.f$g;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static s f$a(oE oE2) {
        return oE2.f$A;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static int f$a(oE oE2) {
        return oE2.f$I;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static s f$e(oE oE2) {
        return oE2.f$L;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static boolean f$E(oE oE2, boolean bl) {
        oE2.f$b = bl;
        return oE2.f$b;
    }

    public static int f$e(oE oE2, int n) {
        oE2.f$I = n;
        return oE2.f$I;
    }

    public static ka f$E(oE oE2) {
        return oE2.f$a;
    }

    public static int f$B(oE oE2) {
        return oE2.f$d--;
    }

    public static int f$E(oE oE2, int n) {
        oE2.f$d = n;
        return oE2.f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static int f$e(oE oE2) {
        return oE2.f$e;
    }

    public static Bh f$E(oE oE2) {
        return oE2.f$j;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static int f$B(oE oE2, int n) {
        oE2.f$e = n;
        return oE2.f$e;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static List f$a(oE oE2) {
        return oE2.f$M;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static int f$K(oE oE2) {
        return oE2.f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    @Override
    public void f$K() {
        oE oE2;
        super.f$K();
        if (oE.f$d.world == null) {
            oE2.f$E(false);
            return;
        }
        if (((VD)((Object)oE2.f$a.f$E())).equals((Object)VD.f$M)) {
            new Ud(oE2, null).f$E();
        }
    }

    public static int f$E(oE oE2) {
        return oE2.f$K;
    }

    public static int f$a(oE oE2, int n) {
        oE2.f$K = n;
        return oE2.f$K;
    }

    public oE() {
        oE oE2;
        String[] stringArray = new String[3];
        stringArray[0] = "Orebfuscator";
        stringArray[1] = "OreDeobfuscator";
        stringArray[2] = "Orebf";
        super("Orebfuscator", stringArray, true, -6772144, JD.f$K);
        oE oE3 = oE2;
        String[] stringArray2 = new String[6];
        stringArray2[0] = "Range";
        stringArray2[1] = "Radius";
        stringArray2[2] = "Distnace";
        stringArray2[3] = "Rang";
        stringArray2[4] = "Rad";
        stringArray2[5] = "r";
        oE3.f$L = new s((Number)Float.valueOf(10.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(100.0f), 1, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Delay";
        stringArray3[1] = "Del";
        stringArray3[2] = "d";
        oE2.f$c = new s((Number)Float.valueOf(35.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), 1, stringArray3);
        String[] stringArray4 = new String[7];
        stringArray4[0] = "StartHeight";
        stringArray4[1] = "StartH";
        stringArray4[2] = "Start";
        stringArray4[3] = "Minimum";
        stringArray4[4] = "MinHeight";
        stringArray4[5] = "sh";
        stringArray4[6] = "s";
        oE2.f$A = new s((Number)Float.valueOf(4.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(16.0f), 1, stringArray4);
        String[] stringArray5 = new String[4];
        stringArray5[0] = "AddHeight";
        stringArray5[1] = "Addition";
        stringArray5[2] = "Add";
        stringArray5[3] = "a";
        oE2.f$B = new s((Number)Float.valueOf(10.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(64.0f), 1, stringArray5);
        String[] stringArray6 = new String[5];
        stringArray6[0] = "Mode";
        stringArray6[1] = "Mod";
        stringArray6[2] = "Type";
        stringArray6[3] = "Method";
        stringArray6[4] = "m";
        oE2.f$a = new ka<VD>(VD.f$M, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "Visualize";
        stringArray7[1] = "Draw";
        stringArray7[2] = "Vis";
        stringArray7[3] = "v";
        oE2.f$C = new z<Boolean>(false, stringArray7);
        oE oE4 = oE2;
        oE4.f$j = new Bh();
        oE4.f$i = Arrays.asList(Blocks.AIR, Blocks.WATER, Blocks.FIRE, Blocks.FLOWING_WATER, Blocks.LAVA, Blocks.FLOWING_LAVA, Blocks.PORTAL, Blocks.END_PORTAL, Blocks.END_PORTAL_FRAME, Blocks.BEDROCK);
        oE oE5 = oE2;
        oE5.f$M = new ArrayList<BlockPos>();
        oE5.f$g = new ArrayList<BlockPos>();
        oE2.f$d = -2;
        oE2.f$E(oE2.f$a, oE2.f$C, oE2.f$L, oE2.f$c, oE2.f$A, oE2.f$B);
        oE2.f$E(new dE(oE2), new tf(oE2));
    }

    public static boolean f$E(oE oE2) {
        return oE2.f$b;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static s f$E(oE oE2) {
        return oE2.f$B;
    }

    public static s f$B(oE oE2) {
        return oE2.f$c;
    }

    public static z f$E(oE oE2) {
        return oE2.f$C;
    }
}
package net.futureclient.client;

import net.futureclient.client.Eg;
import net.futureclient.client.Ha;
import net.futureclient.client.Wf;
import net.futureclient.client.Ze;
import net.minecraft.client.gui.GuiDownloadTerrain;

public class oe
extends Ha<Wf> {
    public final Ze f$d;

    @Override
    public void f$E(Wf wf) {
        if (!((Eg)((Object)Ze.f$E(0.f$d).f$E())).equals((Object)Eg.f$i) && wf.f$E() instanceof GuiDownloadTerrain) {
            0.f$d.f$E(false);
        }
    }

    public oe(Ze ze) {
        0.f$d = ze;
    }
}
