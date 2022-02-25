package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.kH;
import net.futureclient.client.s;
import net.futureclient.client.tF;
import net.futureclient.client.yE;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;

public class ND
extends Ha<Pf> {
    public final tF f$d;

    @Override
    public void f$E(Pf pf) {
        int n;
        0.f$d.f$a(String.format("AutoSoup \u00a77[\u00a7F%s\u00a77]", 0.f$d.f$a()));
        int n2 = n = 44;
        while (n2 >= 9) {
            ItemStack itemStack = tF.f$B().player.field_71069_bz.getSlot(n).getStack();
            if (!(itemStack.getItem() instanceof ItemAir) && itemStack.getItem() == Items.BOWL && ((Boolean)tF.f$E(0.f$d).f$E()).booleanValue() && tF.f$E(0.f$d).f$E(100L)) {
                tF.f$a().playerController.windowClick(0, n, 0, ClickType.THROW, (EntityPlayer)tF.f$e().player);
                tF.f$E(0.f$d).f$a();
            }
            n2 = --n;
        }
        if (tF.f$E().player.func_110143_aJ() < ((s)tF.f$E(0.f$d)).f$E().floatValue()) {
            yE yE2 = (yE)kH.f$E().f$E().f$E(yE.class);
            if (!yE2.f$M) {
                tF.f$E(0.f$d);
            }
        }
    }

    public ND(tF tF2) {
        0.f$d = tF2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.fb;
import net.minecraft.client.Minecraft;

public class Nd
extends Ba {
    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public Nd() {
        Nd nd;
        String[] stringArray = new String[5];
        stringArray[0] = "Parkour";
        stringArray[1] = "EdgeJump";
        stringArray[2] = "Parkourmaster";
        stringArray[3] = "Parkuur";
        stringArray[4] = "Park";
        super("Parkour", stringArray, true, -12275058, JD.f$j);
        Ha[] haArray = new Ha[1];
        haArray[0] = new fb(nd);
        nd.f$E(haArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.D;
import net.futureclient.client.Ha;
import net.futureclient.client.ve;
import net.futureclient.client.xc;
import net.futureclient.client.zB;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer;

public class nd
extends Ha<ve> {
    public final xc f$d;

    @Override
    public void f$E(ve ve2) {
        if (ve2.f$E() instanceof CPacketPlayer) {
            CPacketPlayer cPacketPlayer = (CPacketPlayer)ve2.f$E();
            switch ((zB)((Object)xc.f$E(0.f$d).f$E())) {
                case f$j: {
                    Minecraft minecraft = xc.f$b();
                    while (false) {
                    }
                    if (!(minecraft.player.field_70143_R > 3.0f)) break;
                    ((D)cPacketPlayer).setOnGround(true);
                    return;
                }
                case f$i: {
                    if (!(xc.f$F().player.field_70143_R > 3.0f)) break;
                    ((D)cPacketPlayer).setY(xc.f$G().player.field_70163_u + (double)0.1f);
                    return;
                }
                case f$M: {
                    if (!(xc.f$D().player.field_70143_R > 3.0f)) break;
                    xc.f$g().player.field_70122_E = true;
                    xc.f$m().player.field_71075_bZ.isFlying = true;
                    xc.f$f().player.field_71075_bZ.allowFlying = true;
                    ((D)cPacketPlayer).setOnGround(false);
                    xc.f$L().player.field_70133_I = true;
                    xc.f$i().player.field_71075_bZ.isFlying = false;
                    xc.f$c().player.func_70664_aZ();
                }
            }
        }
    }

    public nd(xc xc2) {
        0.f$d = xc2;
    }
}
package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.Mf;
import net.futureclient.client.Ue;
import net.futureclient.client.eE;
import net.futureclient.client.lD;
import net.minecraft.util.math.Vec3d;

public abstract class nD
extends Enum<nD> {
    private static final Random f$g;
    private static final nD[] f$d;
    private static final int f$M = 29000000;
    public static final nD f$j;
    public static final nD f$i;
    public static final nD f$b;

    public nD(String string, int n, eE eE2) {
        0(string, n);
    }

    public static nD valueOf(String string) {
        return Enum.valueOf(nD.class, string);
    }

    static {
        f$b = new lD("Down", 0);
        f$j = new Ue("Up", 1);
        f$i = new Mf("Preserve", 2);
        nD[] nDArray = new nD[3];
        nDArray[0] = f$b;
        nDArray[1] = f$j;
        nDArray[2] = f$i;
        f$d = nDArray;
        f$g = new Random();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nD() {
        void var2_-1;
        void var1_-1;
        nD nD2;
    }

    public final int f$E() {
        int n = f$g.nextInt(29000000);
        if (f$g.nextBoolean()) {
            return n;
        }
        return -n;
    }

    public static nD[] values() {
        return (nD[])f$d.clone();
    }

    public abstract Vec3d f$E(Vec3d var1, Vec3d var2);
}
