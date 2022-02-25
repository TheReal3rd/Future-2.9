package net.futureclient.client;

import net.futureclient.client.BC;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.Jc;
import net.futureclient.client.Kc;
import net.futureclient.client.TC;
import net.futureclient.client.Tc;
import net.futureclient.client.kA;
import net.futureclient.client.ka;
import net.minecraft.client.Minecraft;

public class Hc
extends Ba {
    private ka<Tc> f$M;
    private boolean f$g;
    private Bh f$d;

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static boolean f$E(Hc hc) {
        return hc.f$g;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static boolean f$E(Hc hc, boolean bl) {
        hc.f$g = bl;
        return hc.f$g;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public Hc() {
        Hc hc;
        String[] stringArray = new String[4];
        stringArray[0] = "Jesus";
        stringArray[1] = "WaterWalk";
        stringArray[2] = "Dolphin";
        stringArray[3] = "Trampoline";
        super("Jesus", stringArray, true, -7807509, JD.f$j);
        Hc hc2 = hc;
        hc2.f$d = new Bh();
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Mode";
        stringArray2[1] = "m";
        hc2.f$M = new ka<Tc>(Tc.f$i, stringArray2);
        hc.f$E(hc.f$M);
        hc.f$E(new kA(hc), new Jc(hc), new TC(hc), new BC(hc), new Kc(hc));
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Bh f$E(Hc hc) {
        return hc.f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static ka f$E(Hc hc) {
        return hc.f$M;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
package net.futureclient.client;

public enum HC {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HC() {
        HC hC;
    }
}
package net.futureclient.client;

import net.futureclient.client.Bf;
import net.futureclient.client.Ha;
import net.futureclient.client.SB;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;

public class hc
extends Ha<Bf> {
    public final SB f$d;

    public hc(SB sB) {
        0.f$d = sB;
    }

    @Override
    public void f$E(Bf bf) {
        if (bf.f$E() instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)bf.f$E();
            if (bf.f$E() instanceof ModelBiped) {
                ModelBiped modelBiped = (ModelBiped)bf.f$E();
                SB.f$E(0.f$d).put(entityPlayer, new float[][]{{modelBiped.bipedHead.rotateAngleX, modelBiped.bipedHead.rotateAngleY, modelBiped.bipedHead.rotateAngleZ}, {modelBiped.bipedRightArm.rotateAngleX, modelBiped.bipedRightArm.rotateAngleY, modelBiped.bipedRightArm.rotateAngleZ}, {modelBiped.bipedLeftArm.rotateAngleX, modelBiped.bipedLeftArm.rotateAngleY, modelBiped.bipedLeftArm.rotateAngleZ}, {modelBiped.bipedRightLeg.rotateAngleX, modelBiped.bipedRightLeg.rotateAngleY, modelBiped.bipedRightLeg.rotateAngleZ}, {modelBiped.bipedLeftLeg.rotateAngleX, modelBiped.bipedLeftLeg.rotateAngleY, modelBiped.bipedLeftLeg.rotateAngleZ}});
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.CD;
import net.futureclient.client.Ha;
import net.futureclient.client.cC;

public class hC
extends Ha<CD> {
    public final cC f$d;

    @Override
    public void f$E(CD cD) {
        cD.f$E(0.f$d.f$b.f$E() != false && cC.f$e().stream().anyMatch(clazz -> clazz.isInstance(cC.f$w().currentScreen)));
    }

    public hC(cC cC2) {
        0.f$d = cC2;
    }
}
