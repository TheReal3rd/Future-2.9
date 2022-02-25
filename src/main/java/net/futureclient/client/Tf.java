package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.Gg;
import net.futureclient.client.ID;
import net.futureclient.client.JD;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class Tf
extends Ba {
    private Bh f$d;
    private z<Boolean> f$b;
    private double f$i;
    private double f$j;
    private boolean f$g;
    private double f$M;

    public static boolean f$E(Tf tf, boolean bl) {
        tf.f$g = bl;
        return tf.f$g;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static z f$E(Tf tf) {
        return tf.f$b;
    }

    public static boolean f$E(Tf tf) {
        return tf.f$g;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static double f$E(Tf tf) {
        return tf.f$M;
    }

    public Tf() {
        Tf tf;
        String[] stringArray = new String[4];
        stringArray[0] = "PortalGodMode";
        stringArray[1] = "PortalGod";
        stringArray[2] = "GodMode";
        stringArray[3] = "God";
        super("PortalGodMode", stringArray, true, -12069189, JD.f$K);
        Tf tf2 = tf;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "PositionAdjust";
        stringArray2[1] = "PosAdjust";
        stringArray2[2] = "PositionAdjustment";
        stringArray2[3] = "PosFix";
        tf2.f$b = new z<Boolean>(true, stringArray2);
        tf.f$g = false;
        tf.f$d = new Bh();
        tf.f$E(tf.f$b);
        tf.f$E(new ID(tf), new Gg(tf));
    }

    public static double f$e(Tf tf) {
        return tf.f$j;
    }

    @Override
    public void f$B() {
        Tf tf;
        Tf tf2 = tf;
        super.f$B();
        tf.f$j = 0.0;
        tf2.f$i = 0.0;
        tf2.f$M = 0.0;
    }

    public static double f$E(Tf tf, double d) {
        tf.f$M = d;
        return tf.f$M;
    }

    public static double f$a(Tf tf) {
        return tf.f$i;
    }

    public static Bh f$E(Tf tf) {
        return tf.f$d;
    }

    public static double f$e(Tf tf, double d) {
        tf.f$j = d;
        return tf.f$j;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    @Override
    public void f$K() {
        Tf tf;
        Tf tf2 = tf;
        super.f$K();
        tf.f$j = 0.0;
        tf2.f$i = 0.0;
        tf2.f$M = 0.0;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static double f$a(Tf tf, double d) {
        tf.f$i = d;
        return tf.f$i;
    }
}
package net.futureclient.client;

import java.awt.Color;
import net.futureclient.client.Ha;
import net.futureclient.client.K;
import net.futureclient.client.Uh;
import net.futureclient.client.YE;
import net.futureclient.client.aj;
import net.futureclient.client.kH;
import net.futureclient.client.oE;
import net.futureclient.client.sE;
import net.futureclient.client.wD;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

public class tf
extends Ha<sE> {
    public final oE f$d;

    public tf(oE oE2) {
        0.f$d = oE2;
    }

    @Override
    public void f$E(sE sE2) {
        if (!sE2.f$E().equals((Object)YE.f$M)) {
            return;
        }
        if (((Boolean)oE.f$E(0.f$d).f$E()).booleanValue()) {
            tf tf2;
            Object object = (wD)kH.f$E().f$E().f$E(wD.class);
            object = new Color((float)((wD)object).f$a.getRed() / 255.0f, (float)((wD)object).f$a.getGreen() / 255.0f, (float)((wD)object).f$a.getBlue() / 255.0f, 0.6f);
            if (oE.f$a(0.f$d).size() > 1000) {
                tf tf3 = 0;
                tf2 = tf3;
                oE.f$a(tf3.f$d).clear();
            } else {
                for (BlockPos blockPos : oE.f$a(0.f$d)) {
                    double d = (double)blockPos.func_177958_n() - ((K)oE.f$j().getRenderManager()).getRenderPosX();
                    double d2 = (double)blockPos.func_177956_o() - ((K)oE.f$M().getRenderManager()).getRenderPosY();
                    double d3 = (double)blockPos.func_177952_p() - ((K)oE.f$C().getRenderManager()).getRenderPosZ();
                    if (!(oE.f$H().player.func_70011_f((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p()) <= 128.0)) continue;
                    Uh.f$B();
                    aj.f$E(new AxisAlignedBB(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0), 1.0f, (Color)object);
                    Uh.f$e();
                }
                tf2 = 0;
            }
            if (oE.f$K(tf2.f$d) >= 0) {
                BlockPos blockPos = (BlockPos)oE.f$e(0.f$d).get(oE.f$K(0.f$d));
                double d = (double)blockPos.func_177958_n() - ((K)oE.f$h().getRenderManager()).getRenderPosX();
                double d4 = (double)blockPos.func_177956_o() - ((K)oE.f$A().getRenderManager()).getRenderPosY();
                double d5 = (double)blockPos.func_177952_p() - ((K)oE.f$K().getRenderManager()).getRenderPosZ();
                if (oE.f$B().player.func_70011_f((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p()) <= 128.0) {
                    Uh.f$B();
                    aj.f$E(new AxisAlignedBB(d, d4, d5, d + 1.0, d4 + 1.0, d5 + 1.0), 1.0f, (Color)object);
                    Uh.f$e();
                }
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.ND;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;

public class tF
extends Ba {
    private Bh f$b;
    private z<Boolean> f$M;
    public boolean f$d;
    private z<Boolean> f$i;
    private Bh f$j;
    private s f$g;

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static z f$E(tF tF2) {
        return tF2.f$i;
    }

    private void f$A() {
        tF tF2;
        if (tF2.f$b.f$E(125L) && tF.f$d.player.func_70089_S()) {
            int n;
            int n2 = tF.f$d.player.field_71071_by.currentItem;
            int n3 = n = 44;
            while (n3 >= 9) {
                ItemStack itemStack = tF.f$d.player.field_71069_bz.getSlot(n).getStack();
                if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getItem() instanceof ItemSoup) {
                    if (n >= 36 && n <= 44) {
                        tF.f$d.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n - 36));
                        if (tF2.f$M.f$E().booleanValue()) {
                            tF.f$d.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
                        } else {
                            tF.f$d.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.OFF_HAND));
                        }
                        tF.f$d.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
                        tF2.f$b.f$a();
                        return;
                    }
                    tF.f$d.playerController.windowClick(0, n, 0, ClickType.PICKUP, (EntityPlayer)tF.f$d.player);
                    tF.f$d.playerController.windowClick(0, 41, 0, ClickType.PICKUP, (EntityPlayer)tF.f$d.player);
                    tF2.f$b.f$a();
                    return;
                }
                n3 = --n;
            }
        }
    }

    public static s f$E(tF tF2) {
        return tF2.f$g;
    }

    public static void f$E(tF tF2) {
        tF2.f$A();
    }

    public tF() {
        tF tF2;
        String[] stringArray = new String[2];
        stringArray[0] = "AutoSoup";
        stringArray[1] = "autosp";
        super("AutoSoup", stringArray, true, -4598640, JD.f$I);
        tF tF3 = tF2;
        tF tF4 = tF2;
        tF3.f$b = new Bh();
        tF4.f$j = new Bh();
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Dropsoup";
        stringArray2[1] = "drop";
        stringArray2[2] = "throw";
        tF3.f$i = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "1.9Fix";
        stringArray3[1] = "handfix";
        stringArray3[2] = "1.10handfix";
        stringArray3[3] = "fix";
        tF2.f$M = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Health";
        stringArray4[1] = "h";
        stringArray4[2] = "hp";
        tF2.f$g = new s((Number)Float.valueOf(14.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(20.0f), 0.5, stringArray4);
        tF2.f$d = false;
        tF2.f$E(tF2.f$i, tF2.f$g, tF2.f$M);
        tF2.f$E(new ND(tF2));
    }

    @Override
    public void f$B() {
        tF tF2;
        tF2.f$d = false;
        super.f$B();
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Bh f$E(tF tF2) {
        return tF2.f$j;
    }

    public int f$a() {
        int n;
        int n2 = 0;
        ItemStack[] itemStackArray = (ItemStack[])tF.f$d.player.field_71071_by.mainInventory.toArray((Object[])new ItemStack[n2]);
        int n3 = itemStackArray.length;
        int n4 = n = 0;
        while (n4 < n3) {
            ItemStack itemStack = itemStackArray[n];
            if (itemStack != null && itemStack.getItem() instanceof ItemSoup) {
                ++n2;
            }
            n4 = ++n;
        }
        return n2;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
