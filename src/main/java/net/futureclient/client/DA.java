package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Gd;
import net.futureclient.client.HA;
import net.futureclient.client.JD;
import net.futureclient.client.Od;
import net.futureclient.client.Sb;
import net.futureclient.client.Wb;
import net.futureclient.client.aC;
import net.futureclient.client.cc;
import net.futureclient.client.eA;
import net.futureclient.client.gB;
import net.futureclient.client.gd;
import net.futureclient.client.ka;
import net.futureclient.client.tA;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class DA
extends Ba {
    public z<Boolean> f$C;
    public z<Boolean> f$b;
    public z<Boolean> f$g;
    public z<Boolean> f$K;
    public z<Boolean> f$I;
    private ka<aC> f$d;
    public z<Boolean> f$j;
    public z<Boolean> f$e;
    public z<Boolean> f$i;
    public z<Boolean> f$M;

    public static ka f$E(DA dA) {
        return dA.f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public DA() {
        DA dA;
        String[] stringArray = new String[4];
        stringArray[0] = "NoRender";
        stringArray[1] = "NoRend";
        stringArray[2] = "Render";
        stringArray[3] = "NoItems";
        super("NoRender", stringArray, false, -15257121, JD.f$i);
        DA dA2 = dA;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Fire";
        stringArray2[1] = "NoFire";
        stringArray2[2] = "nf";
        dA2.f$C = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "HurtCamera";
        stringArray3[1] = "NoHurtcam";
        stringArray3[2] = "nh";
        dA.f$e = new z<Boolean>(false, stringArray3);
        String[] stringArray4 = new String[2];
        stringArray4[0] = "PumpkinOverlay";
        stringArray4[1] = "Pumpkin";
        dA.f$I = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[6];
        stringArray5[0] = "Blindness";
        stringArray5[1] = "NoBlindness";
        stringArray5[2] = "Blind";
        stringArray5[3] = "nb";
        stringArray5[4] = "Nausea";
        stringArray5[5] = "NoNausea";
        dA.f$K = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[10];
        stringArray6[0] = "TotemAnimation";
        stringArray6[1] = "NoTotemAnimation";
        stringArray6[2] = "NoTotem";
        stringArray6[3] = "NoTotim";
        stringArray6[4] = "NoTotimAnimation";
        stringArray6[5] = "NoTotemAnime";
        stringArray6[6] = "NoTotimAnime";
        stringArray6[7] = "NoTot";
        stringArray6[8] = "nta";
        stringArray6[9] = "nt";
        dA.f$b = new z<Boolean>(false, stringArray6);
        String[] stringArray7 = new String[5];
        stringArray7[0] = "Skylight";
        stringArray7[1] = "Sky";
        stringArray7[2] = "Light";
        stringArray7[3] = "SkylightUpdates";
        stringArray7[4] = "NoSkylight";
        dA.f$j = new z<Boolean>(false, stringArray7);
        String[] stringArray8 = new String[3];
        stringArray8[0] = "Spawners";
        stringArray8[1] = "Spawner";
        stringArray8[2] = "Spawn";
        dA.f$i = new z<Boolean>(false, stringArray8);
        String[] stringArray9 = new String[4];
        stringArray9[0] = "SignText";
        stringArray9[1] = "Signs";
        stringArray9[2] = "SignsText";
        stringArray9[3] = "st";
        dA.f$M = new z<Boolean>(false, stringArray9);
        String[] stringArray10 = new String[3];
        stringArray10[0] = "Barriers";
        stringArray10[1] = "Barrier";
        stringArray10[2] = "Bar";
        dA.f$g = new z<Boolean>(false, stringArray10);
        String[] stringArray11 = new String[4];
        stringArray11[0] = "NoItems";
        stringArray11[1] = "items";
        stringArray11[2] = "item";
        stringArray11[3] = "ni";
        dA.f$d = new ka<aC>(aC.f$i, stringArray11);
        dA.f$E(dA.f$d, dA.f$C, dA.f$e, dA.f$I, dA.f$K, dA.f$b, dA.f$j, dA.f$i, dA.f$M, dA.f$g);
        dA.f$E(new gB(dA), new gd(dA), new tA(dA), new Od(dA), new HA(dA), new cc(dA), new Wb(dA), new Gd(dA), new eA(dA), new Sb(dA));
    }

    public static Minecraft f$a() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.EE;
import net.futureclient.client.Ha;
import net.futureclient.client.M;
import net.futureclient.client.Pg;
import net.futureclient.client.ea;
import net.futureclient.client.s;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.world.World;

public class Da
extends Ha<EE> {
    public final ea f$d;

    public Da(ea ea2) {
        0.f$d = ea2;
    }

    @Override
    public void f$E(EE eE) {
        if (!ea.f$a(0.f$d).f$E(100L)) {
            return;
        }
        if (CG.f$E(1.0).getBlock().equals(eE.f$E()) && ((Boolean)ea.f$a(0.f$d).f$E()).booleanValue() && ea.f$j().player.field_70122_E) {
            ea.f$M().player.field_70181_x -= 1.0;
        }
        IBlockState iBlockState = ea.f$C().world.func_180495_p(eE.f$E());
        if (((s)ea.f$a(0.f$d)).f$E().floatValue() > 0.0f && iBlockState.func_185904_a() != Material.AIR) {
            EE eE2 = eE;
            eE2.f$E(eE2.f$E() + iBlockState.func_185903_a((EntityPlayer)ea.f$H().player, (World)ea.f$h().world, eE.f$E()) * ((s)ea.f$a(0.f$d)).f$E().floatValue());
            if (ea.f$E(0.f$d).f$a(((s)ea.f$E(0.f$d)).f$E().floatValue() * 1000.0f)) {
                eE.f$E(0);
            }
        }
        if (((Boolean)ea.f$E(0.f$d).f$E()).booleanValue()) {
            int n = Pg.f$a(iBlockState);
            if (n == -1) {
                return;
            }
            if (n < 9) {
                ea.f$A().player.field_71071_by.currentItem = n;
                ((M)ea.f$K().playerController).invokeSyncCurrentPlayItem();
                return;
            }
            ea.f$a().playerController.windowClick(0, n, ea.f$B().player.field_71071_by.currentItem, ClickType.SWAP, (EntityPlayer)ea.f$e().player);
        }
    }
}
package net.futureclient.client;

public enum da {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private da() {
        da da2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.PD;
import net.futureclient.client.cC;
import net.minecraft.util.MovementInput;

public class dA
extends Ha<PD> {
    public final cC f$d;

    public dA(cC cC2) {
        0.f$d = cC2;
    }

    @Override
    public void f$E(PD pD) {
        MovementInput movementInput;
        if (0.f$d.f$i.f$E().booleanValue() && (movementInput = pD.f$E()) == cC.f$p().player.movementInput && cC.f$n().player.isHandActive() && !cC.f$o().player.func_184218_aH()) {
            MovementInput movementInput2 = movementInput;
            movementInput2.moveStrafe /= 0.2f;
            movementInput2.moveForward /= 0.2f;
        }
    }
}
