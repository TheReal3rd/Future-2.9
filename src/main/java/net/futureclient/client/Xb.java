package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.S;
import net.futureclient.client.TH;
import net.futureclient.client.fB;
import net.futureclient.client.mi;
import net.futureclient.client.nG;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.math.BlockPos;

public class Xb
extends Ha<Pf> {
    public final fB f$d;

    public Xb(fB fB2) {
        0.f$d = fB2;
    }

    @Override
    public void f$E(Pf pf) {
        switch (pf.f$E()) {
            case f$M: {
                Xb xb = 0;
                while (false) {
                }
                fB.f$E(xb.f$d).clear();
                if (fB.f$E(xb.f$d) == null) {
                    return;
                }
                Xb xb2 = 0;
                while (fB.f$e(xb2.f$d) < fB.f$E(0.f$d).length) {
                    BlockPos blockPos;
                    S s;
                    S s2 = fB.f$E(0.f$d)[fB.f$e(0.f$d)];
                    if (s2 instanceof mi) {
                        s = (mi)s2;
                        if (fB.f$a(0.f$d) >= ((mi)s).f$E()) {
                            fB.f$E(0.f$d);
                            fB.f$E(0.f$d, 0);
                        }
                        if (fB.f$E(0.f$d).size() > 0) {
                            blockPos = (BlockPos)fB.f$E(0.f$d).get(0);
                            float[] fArray = TH.f$E(blockPos, CG.f$E(blockPos));
                            Pf pf2 = pf;
                            pf2.f$a(fArray[0]);
                            pf2.f$E(fArray[1]);
                        }
                        return;
                    }
                    if (!(s2 instanceof nG)) {
                        xb2 = 0;
                        continue;
                    }
                    s = (nG)s2;
                    blockPos = fB.f$E(0.f$d, (nG)s);
                    if (blockPos != null) {
                        fB.f$E(0.f$d).add(blockPos);
                    }
                    Xb xb3 = 0;
                    xb2 = xb3;
                    fB.f$E(xb3.f$d);
                }
                fB.f$a(0.f$d, 0);
                return;
            }
            case f$g: {
                int n;
                int n2 = n = 0;
                while (n2 < fB.f$E(0.f$d).size()) {
                    BlockPos blockPos = (BlockPos)fB.f$E(0.f$d).get(n);
                    if (n != 0) {
                        BlockPos blockPos2 = blockPos;
                        float[] fArray = TH.f$E(blockPos2, CG.f$E(blockPos2));
                        fB.f$e().player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0], fArray[1], fB.f$B().player.field_70122_E));
                    }
                    BlockPos blockPos3 = blockPos;
                    fB.f$a().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos3, CG.f$E(blockPos3)));
                    BlockPos blockPos4 = blockPos;
                    fB.f$E().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, blockPos4, CG.f$E(blockPos4)));
                    n2 = ++n;
                }
                break;
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.bd;
import net.futureclient.client.iA;
import net.minecraft.client.Minecraft;

public class XB
extends Ba {
    private Float f$g;
    private Float f$d;

    public static Float f$E(XB xB, Float f) {
        xB.f$d = f;
        return xB.f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Float f$a(XB xB, Float f) {
        xB.f$g = f;
        return xB.f$g;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Float f$a(XB xB) {
        return xB.f$g;
    }

    public XB() {
        XB xB;
        String[] stringArray = new String[3];
        stringArray[0] = "NoRotate";
        stringArray[1] = "Rotations";
        stringArray[2] = "Rotate";
        super("NoRotate", stringArray, false, -12234273, JD.f$i);
        Ha[] haArray = new Ha[2];
        haArray[0] = new iA(xB);
        haArray[1] = new bd(xB);
        xB.f$E(haArray);
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Float f$E(XB xB) {
        return xB.f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Lc;
import net.futureclient.client.Me;

public class xB
extends Ha<Me> {
    public final Lc f$d;

    @Override
    public void f$E(Me me) {
        me.f$E(true);
    }

    public xB(Lc lc) {
        0.f$d = lc;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.cC;
import net.futureclient.client.ve;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketClickWindow;
import net.minecraft.network.play.client.CPacketEntityAction;

public class xb
extends Ha<ve> {
    public final cC f$d;

    @Override
    public void f$E(ve ve2) {
        if (0.f$d.f$b.f$E().booleanValue() && 0.f$d.f$M.f$E().booleanValue() && ve2.f$E() instanceof CPacketClickWindow) {
            if (cC.f$g().player.func_184585_cz()) {
                cC.f$f().playerController.onStoppedUsingItem((EntityPlayer)cC.f$m().player);
            }
            if (cC.f$L().player.isSneaking()) {
                cC.f$c().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)cC.f$i().player, CPacketEntityAction.Action.STOP_SNEAKING));
            }
            if (cC.f$I().player.func_70051_ag()) {
                cC.f$M().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)cC.f$j().player, CPacketEntityAction.Action.STOP_SPRINTING));
            }
        }
    }

    public xb(cC cC2) {
        0.f$d = cC2;
    }
}
