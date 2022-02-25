package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.vC;
import net.minecraft.client.Minecraft;

public class JC
extends Ba {
    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public JC() {
        JC jC;
        String[] stringArray = new String[2];
        stringArray[0] = "AutoRespawn";
        stringArray[1] = "NoDeathScreen";
        super("AutoRespawn", stringArray, true, -15641191, JD.f$b);
        Ha[] haArray = new Ha[1];
        haArray[0] = new vC(jC);
        jC.f$E(haArray);
    }
}
package net.futureclient.client;

import java.util.Objects;
import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.Hc;
import net.futureclient.client.Pg;
import net.futureclient.client.Tc;
import net.futureclient.client.zf;
import net.minecraft.block.BlockLiquid;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Jc
extends Ha<zf> {
    public final Hc f$d;

    @Override
    public void f$E(zf zf2) {
        zf zf3 = zf2;
        BlockPos blockPos = zf3.f$E();
        if (zf3.f$E() instanceof BlockLiquid && !Hc.f$h().player.isSneaking() && Pg.f$E().fallDistance < 3.0f && !CG.f$E() && CG.f$E(false) && CG.f$a(zf2.f$E()) && zf2.f$E() != null && (zf2.f$E().equals((Object)Hc.f$A().player) && !((Tc)((Object)Hc.f$E(0.f$d).f$E())).equals((Object)Tc.f$g) || zf2.f$E().getControllingPassenger() != null && Objects.equals(zf2.f$E().getControllingPassenger(), Hc.f$K().player))) {
            zf2.f$E(new AxisAlignedBB((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p(), (double)(blockPos.func_177958_n() + 1), (double)blockPos.func_177956_o() + 0.99, (double)(blockPos.func_177952_p() + 1)));
        }
    }

    public Jc(Hc hc) {
        0.f$d = hc;
    }
}
package net.futureclient.client;

import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.futureclient.client.Ba;
import net.futureclient.client.EC;
import net.futureclient.client.JD;
import net.futureclient.client.LB;
import net.futureclient.client.OI;
import net.futureclient.client.RC;
import net.futureclient.client.ZH;
import net.futureclient.client.fC;
import net.futureclient.client.fc;
import net.futureclient.client.ka;
import net.futureclient.client.oB;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.world.World;

public class jc
extends Ba {
    private z<Boolean> f$I;
    private ka<fC> f$C;
    private List<Packet> f$K;
    private OI f$j;
    private EntityOtherPlayerMP f$M;
    private OI f$i;
    private double f$d;
    private ZH f$b;
    private s f$e;
    private boolean f$g;
    private ka<LB> f$a;

    public static Minecraft f$M() {
        return f$d;
    }

    public static boolean f$E(jc jc2, boolean bl) {
        jc2.f$g = bl;
        return jc2.f$g;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static ZH f$E(jc jc2) {
        return jc2.f$b;
    }

    public static ZH f$E(jc jc2, ZH zH) {
        jc2.f$b = zH;
        return jc2.f$b;
    }

    public static boolean f$E(jc jc2) {
        return jc2.f$g;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static OI f$E(jc jc2, OI oI) {
        jc2.f$i = oI;
        return jc2.f$i;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static double f$E(jc jc2, double d) {
        jc2.f$d = d;
        return jc2.f$d;
    }

    public static OI f$E(jc jc2) {
        return jc2.f$i;
    }

    public jc() {
        jc jc2;
        String[] stringArray = new String[3];
        stringArray[0] = "FakeLag";
        stringArray[1] = "Blink";
        stringArray[2] = "fl";
        super("FakeLag", stringArray, true, -7292787, JD.f$j);
        jc jc3 = jc2;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Mode";
        stringArray2[1] = "Mod";
        stringArray2[2] = "Type";
        jc3.f$a = new ka<LB>(LB.f$M, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Pulse";
        stringArray3[1] = "Puls";
        stringArray3[2] = "Pulss";
        stringArray3[3] = "Pul";
        jc2.f$C = new ka<fC>(fC.f$i, stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "Factor";
        stringArray4[1] = "Ticks";
        stringArray4[2] = "TickCount";
        stringArray4[3] = "Tick";
        jc2.f$e = new s((Number)6.0, (Number)1.0, (Number)20.0, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Render";
        stringArray5[1] = "Draw";
        stringArray5[2] = "r";
        jc2.f$I = new z<Boolean>(true, stringArray5);
        jc2.f$K = new CopyOnWriteArrayList<Packet>();
        jc2.f$E(jc2.f$a, jc2.f$C, jc2.f$e, jc2.f$I);
        jc2.f$E(new fc(jc2), new RC(jc2), new oB(jc2), new EC(jc2));
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static s f$E(jc jc2) {
        return jc2.f$e;
    }

    public static OI f$a(jc jc2, OI oI) {
        jc2.f$j = oI;
        return jc2.f$j;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static OI f$a(jc jc2) {
        return jc2.f$j;
    }

    public static z f$E(jc jc2) {
        return jc2.f$I;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static ka f$a(jc jc2) {
        return jc2.f$a;
    }

    public static EntityOtherPlayerMP f$E(jc jc2) {
        return jc2.f$M;
    }

    public static ka f$E(jc jc2) {
        return jc2.f$C;
    }

    @Override
    public void f$K() {
        jc jc2;
        super.f$K();
        if (jc.f$d.world != null && jc.f$d.player != null) {
            jc2.f$M = new EntityOtherPlayerMP((World)jc.f$d.world, new GameProfile(jc.f$d.player.func_110124_au(), jc.f$d.player.func_174793_f().getName()));
            if (jc2.f$I.f$E().booleanValue()) {
                jc.f$d.world.addEntityToWorld(-1337, (Entity)jc2.f$M);
            }
            jc jc3 = jc2;
            jc3.f$M.func_70080_a(jc.f$d.player.field_70165_t, jc.f$d.player.func_174813_aQ().minY, jc.f$d.player.field_70161_v, jc.f$d.player.field_70177_z, jc.f$d.player.field_70125_A);
            jc3.f$M.field_71071_by = jc.f$d.player.field_71071_by;
            jc3.f$M.field_71069_bz = jc.f$d.player.field_71069_bz;
            jc3.f$M.field_70759_as = jc.f$d.player.field_70759_as;
            jc3.f$M.func_70095_a(jc.f$d.player.isSneaking());
            jc3.f$M.onLivingUpdate();
            return;
        }
        jc2.f$E(false);
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    @Override
    public void f$B() {
        jc jc2;
        super.f$B();
        if (jc.f$d.world != null && jc.f$d.player != null) {
            jc2.f$K.forEach(packet -> jc.f$d.player.connection.sendPacket(packet));
            jc.f$d.world.removeEntityFromWorld(-1337);
        }
        jc2.f$K.clear();
        jc2.f$b = null;
    }

    public static List f$E(jc jc2) {
        return jc2.f$K;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.J;
import net.futureclient.client.WB;
import net.futureclient.client.kH;
import net.futureclient.client.lb;
import net.futureclient.client.ma;
import net.futureclient.client.qC;

public class jC
extends qC {
    public final WB f$d;

    public jC(WB wB, String string, int n, int n2, boolean bl) {
        0.f$d = wB;
        super(string, n, n2, bl);
    }

    @Override
    public void f$E() {
        jC jC2;
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            if (!(ma2 instanceof J)) {
                0.f$E(new lb((ma)ma2));
            }
        });
    }
}
