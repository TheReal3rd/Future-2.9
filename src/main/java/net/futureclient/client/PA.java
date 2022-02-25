package net.futureclient.client;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.Bj;
import net.futureclient.client.JD;
import net.futureclient.client.La;
import net.futureclient.client.S;
import net.futureclient.client.SC;
import net.futureclient.client.kH;
import net.futureclient.client.mA;
import net.futureclient.client.mi;
import net.futureclient.client.s;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextFormatting;

public class PA
extends Ba {
    private s f$i;
    private File f$j;
    private boolean f$g;
    private int f$d;
    private List<S> f$M;

    public static Minecraft f$e() {
        return f$d;
    }

    @Override
    public void f$K() {
        PA pA;
        PA pA2 = pA;
        pA2.f$g = false;
        pA2.f$M.clear();
        super.f$K();
    }

    public static List f$E(PA pA) {
        return pA.f$M;
    }

    public static s f$E(PA pA) {
        return pA.f$i;
    }

    public static int f$a(PA pA) {
        return pA.f$d++;
    }

    public static boolean f$E(PA pA, boolean bl) {
        pA.f$g = bl;
        return pA.f$g;
    }

    @Override
    public void f$B() {
        PA pA;
        pA.f$M.add(new mi(10));
        Object[] objectArray = new Object[1];
        objectArray[0] = new SimpleDateFormat("HH-mm-ss").format(new Date());
        String string = String.format("stolen-%s.notebot", objectArray);
        try {
            PA pA2 = pA;
            Bj.f$E(new File(pA.f$j, string), pA2.f$M.toArray(new S[pA2.f$M.size()]));
            super.f$B();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        La.f$E().f$E(String.format("Saved song %s\"%s\"%s.", TextFormatting.WHITE, string, TextFormatting.GRAY), false);
        super.f$B();
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static int f$E(PA pA, int n) {
        pA.f$d = n;
        return pA.f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public PA() {
        PA pA;
        String[] stringArray = new String[2];
        stringArray[0] = "SongStealer";
        stringArray[1] = "SongSteal";
        super("SongStealer", stringArray, true, -8069141, JD.f$b);
        PA pA2 = pA;
        pA2.f$j = new File(kH.f$E().f$E(), "songs");
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Range";
        stringArray2[1] = "Ragne";
        stringArray2[2] = "Rang";
        stringArray2[3] = "r";
        pA2.f$i = new s((Number)Float.valueOf(20.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(50.0f), 1, stringArray2);
        pA.f$M = new ArrayList<S>();
        pA.f$E(pA.f$i);
        pA.f$E(new SC(pA), new mA(pA));
    }

    public static int f$E(PA pA) {
        return pA.f$d;
    }

    public static boolean f$E(PA pA) {
        return pA.f$g;
    }
}
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.M;
import net.futureclient.client.Pf;
import net.futureclient.client.TH;
import net.futureclient.client.ia;
import net.futureclient.client.kF;
import net.futureclient.client.ta;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.state.IBlockState;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class Pa
extends Ha<Pf> {
    public final ta f$d;

    @Override
    public void f$E(Pf pf) {
        0.f$d.f$a(String.format("Nuker \u00a77[\u00a7F%s\u00a77]", ta.f$E(0.f$d).f$E()));
        block0 : switch ((ia)((Object)ta.f$E(0.f$d).f$E())) {
            case f$j: 
            case f$i: 
            case f$M: {
                while (false) {
                }
                switch (pf.f$E()) {
                    case f$M: {
                        while (false) {
                        }
                        ta.f$E(0.f$d, false);
                        int n = ta.f$E(0.f$d).f$E().intValue();
                        int n2 = n;
                        int n3 = n;
                        while (n3 >= -n2) {
                            int n4 = -n2;
                            while (n4 < n2) {
                                int n5;
                                int n6 = -n2;
                                while (n6 < n2) {
                                    Block block;
                                    IBlockState iBlockState;
                                    int n7;
                                    ta.f$E(0.f$d, new BlockPos((int)Math.floor(ta.f$D().player.field_70165_t) + n5, (int)Math.floor(ta.f$g().player.field_70163_u) + n, (int)Math.floor(ta.f$m().player.field_70161_v) + n7));
                                    if (!(ta.f$c().player.func_70092_e(ta.f$f().player.field_70165_t + (double)n5, ta.f$L().player.field_70163_u + (double)n, ta.f$i().player.field_70161_v + (double)n7) > 16.0) && ta.f$E(0.f$d, iBlockState = ta.f$I().world.func_180495_p(ta.f$E(0.f$d)), block = iBlockState.getBlock())) {
                                        Pa pa = 0;
                                        ta.f$E(pa.f$d, true);
                                        if (!((Boolean)ta.f$a(pa.f$d).f$E()).booleanValue()) {
                                            return;
                                        }
                                        float[] fArray = TH.f$E(ta.f$E(0.f$d), CG.f$E(ta.f$E(0.f$d)));
                                        Pf pf2 = pf;
                                        pf2.f$a(fArray[0]);
                                        pf2.f$E(fArray[1]);
                                        return;
                                    }
                                    n6 = ++n7;
                                }
                                n4 = ++n5;
                            }
                            n3 = --n;
                        }
                        break block0;
                    }
                    case f$g: {
                        if (!ta.f$E(0.f$d)) break block0;
                        ta.f$j().player.swingArm(EnumHand.MAIN_HAND);
                        ta.f$M().playerController.onPlayerDamageBlock(ta.f$E(0.f$d), CG.f$E(ta.f$E(0.f$d)));
                        if (!((double)((M)ta.f$C().playerController).getCurBlockDamageMP() >= 1.0)) break block0;
                        ta.f$a(0.f$d).f$a();
                    }
                }
                return;
            }
            case f$g: {
                int n;
                if (pf.f$E() != kF.f$g || !ta.f$H().player.func_184812_l_()) break;
                int n8 = n = -ta.f$E(0.f$d).f$E().intValue();
                while (n8 <= ta.f$E(0.f$d).f$E().intValue()) {
                    int n9 = ta.f$E(0.f$d).f$E().intValue();
                    while (n9 >= -ta.f$E(0.f$d).f$E().intValue()) {
                        int n10;
                        int n11 = -ta.f$E(0.f$d).f$E().intValue();
                        while (n11 <= ta.f$E(0.f$d).f$E().intValue()) {
                            int n12;
                            int n13 = (int)(ta.f$h().player.field_70165_t + (double)n);
                            int n14 = (int)(ta.f$A().player.field_70163_u + (double)n10);
                            int n15 = (int)(ta.f$K().player.field_70161_v + (double)n12);
                            BlockPos blockPos = new BlockPos(n13, n14, n15);
                            if (!(ta.f$B().world.func_180495_p(blockPos).getBlock() instanceof BlockAir)) {
                                ta.f$e().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
                                ta.f$a().player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
                            }
                            n11 = ++n12;
                        }
                        n9 = --n10;
                    }
                    n8 = ++n;
                }
                break;
            }
        }
    }

    public Pa(ta ta2) {
        0.f$d = ta2;
    }
}
package net.futureclient.client;

public enum pa {
    f$j,
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pa() {
        pa pa2;
    }
}
package net.futureclient.client;

public enum pA {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pA() {
        pA pA2;
    }
}
