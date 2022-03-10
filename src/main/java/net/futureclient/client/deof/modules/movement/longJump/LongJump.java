package net.futureclient.client.deof.modules.movement.longJump;

public class LongJump {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.HB;
import net.futureclient.client.JD;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.bb;
import net.futureclient.client.hA;
import net.futureclient.client.ka;
import net.futureclient.client.q;
import net.futureclient.client.rd;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.AxisAlignedBB;

public class fd
extends Ba {
    private int f$j;
    private int f$e;
    private int f$M;
    private int f$i;
    private double f$K;
    private boolean f$d;
    private z<Boolean> f$c;
    private double f$b;
    private ka<hA> f$B;
    private boolean f$g;
    private double f$I;
    private int f$C;
    private Bh f$a;
    private s f$A;

    public static int f$a(fd fd2) {
        return fd2.f$j;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$lc() {
        return f$d;
    }

    public static Minecraft f$aa() {
        return f$d;
    }

    public static Minecraft f$Pa() {
        return f$d;
    }

    public static Minecraft f$s() {
        return f$d;
    }

    public static Minecraft f$V() {
        return f$d;
    }

    public static Minecraft f$KC() {
        return f$d;
    }

    public fd() {
        fd fd2;
        String[] stringArray = new String[2];
        stringArray[0] = "LongJump";
        stringArray[1] = "LJ";
        super("LongJump", stringArray, true, -15421042, JD.f$j);
        fd fd3 = fd2;
        String[] stringArray2 = new String[5];
        stringArray2[0] = "MiniJumps";
        stringArray2[1] = "MiniJump";
        stringArray2[2] = "SmallJumps";
        stringArray2[3] = "HypixelJumps";
        stringArray2[4] = "HypixelJump";
        fd3.f$c = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Boost";
        stringArray3[1] = "Distance";
        stringArray3[2] = "Length";
        fd2.f$A = new s((Number)4.5, (Number)0.5, (Number)20.0, 0.1, stringArray3);
        String[] stringArray4 = new String[5];
        stringArray4[0] = "Mode";
        stringArray4[1] = "Type";
        stringArray4[2] = "Method";
        stringArray4[3] = "m";
        stringArray4[4] = "mod";
        fd2.f$B = new ka<hA>(hA.f$i, stringArray4);
        fd2.f$a = new Bh();
        fd2.f$I = 0.2873;
        fd2.f$E(fd2.f$B, fd2.f$c, fd2.f$A);
        fd2.f$E(new rd(fd2), new HB(fd2), new bb(fd2));
    }

    public static double f$E(fd fd2) {
        return fd2.f$b;
    }

    public static Minecraft f$Ja() {
        return f$d;
    }

    public static Minecraft f$hA() {
        return f$d;
    }

    public static int f$B(fd fd2, int n) {
        fd2.f$C = n;
        return fd2.f$C;
    }

    public static Minecraft f$Sb() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static int f$E(fd fd2, int n) {
        fd2.f$i = n;
        return fd2.f$i;
    }

    public static void f$E(fd fd2, double d, double d2, double d3) {
        fd2.f$E(d, d2, d3);
    }

    public static Minecraft f$pd() {
        return f$d;
    }

    public static Minecraft f$sa() {
        return f$d;
    }

    public static Minecraft f$ZB() {
        return f$d;
    }

    public static double f$a(fd fd2) {
        return fd2.f$K;
    }

    public static Minecraft f$ac() {
        return f$d;
    }

    public static Minecraft f$bC() {
        return f$d;
    }

    public static Minecraft f$qa() {
        return f$d;
    }

    public static Minecraft f$Ma() {
        return f$d;
    }

    public static Minecraft f$Qa() {
        return f$d;
    }

    public static Minecraft f$O() {
        return f$d;
    }

    public static Minecraft f$Qd() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static boolean f$E(fd fd2) {
        return fd2.f$g;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static int f$E(fd fd2) {
        return fd2.f$i;
    }

    public static Minecraft f$cB() {
        return f$d;
    }

    public static double f$e(fd fd2) {
        return fd2.f$I;
    }

    public static Minecraft f$Ea() {
        return f$d;
    }

    public static Minecraft f$cb() {
        return f$d;
    }

    public static s f$E(fd fd2) {
        return fd2.f$A;
    }

    public static Minecraft f$UC() {
        return f$d;
    }

    public static Minecraft f$wB() {
        return f$d;
    }

    public static Minecraft f$ya() {
        return f$d;
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$Ha() {
        return f$d;
    }

    public static Minecraft f$r() {
        return f$d;
    }

    public static int f$e(fd fd2, int n) {
        fd2.f$e = n;
        return fd2.f$e;
    }

    public static Minecraft f$R() {
        return f$d;
    }

    public static Minecraft f$ja() {
        return f$d;
    }

    public static int f$e(fd fd2) {
        return --fd2.f$M;
    }

    public static Minecraft f$qb() {
        return f$d;
    }

    public static Minecraft f$jB() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$yA() {
        return f$d;
    }

    public static double f$e(fd fd2, double d) {
        fd2.f$I = d;
        return fd2.f$I;
    }

    public static int f$B(fd fd2) {
        return fd2.f$M;
    }

    public static Minecraft f$Za() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$Jb() {
        return f$d;
    }

    public static Minecraft f$wA() {
        return f$d;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static Minecraft f$ka() {
        return f$d;
    }

    public static Minecraft f$FA() {
        return f$d;
    }

    public static Minecraft f$xa() {
        return f$d;
    }

    public static double f$E(fd fd2, double d) {
        fd2.f$K = d;
        return fd2.f$K;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    @Override
    public void f$K() {
        fd fd2;
        if (fd.f$d.player != null && fd.f$d.world != null) {
            fd2.f$I = Pg.f$a();
            fd.f$d.player.field_70122_E = true;
            if (fd2.f$B.f$E() == hA.f$M) {
                ((q)((Y)f$d).getTimer()).f$E(1.0f);
            }
        }
        fd fd3 = fd2;
        fd fd4 = fd2;
        fd4.f$g = false;
        fd4.f$d = true;
        fd3.f$K = 0.0;
        fd3.f$C = 1;
        super.f$K();
    }

    public static Minecraft f$S() {
        return f$d;
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static boolean f$E(fd fd2, boolean bl) {
        fd2.f$d = bl;
        return fd2.f$d;
    }

    public static Minecraft f$TB() {
        return f$d;
    }

    public static Minecraft f$pa() {
        return f$d;
    }

    public static int f$K(fd fd2) {
        return ++fd2.f$M;
    }

    public static Minecraft f$qd() {
        return f$d;
    }

    public static Minecraft f$Fa() {
        return f$d;
    }

    public static Minecraft f$FC() {
        return f$d;
    }

    public static Minecraft f$ca() {
        return f$d;
    }

    public static Minecraft f$Hc() {
        return f$d;
    }

    public static Minecraft f$La() {
        return f$d;
    }

    public static Minecraft f$hc() {
        return f$d;
    }

    public static Minecraft f$X() {
        return f$d;
    }

    public static Minecraft f$Mc() {
        return f$d;
    }

    public static Minecraft f$Ia() {
        return f$d;
    }

    public static Minecraft f$u() {
        return f$d;
    }

    public static Minecraft f$OB() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$ia() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$qA() {
        return f$d;
    }

    public static Minecraft f$eB() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$gc() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$za() {
        return f$d;
    }

    public static double f$a(fd fd2, double d) {
        fd2.f$b = d;
        return fd2.f$b;
    }

    public static Minecraft f$Id() {
        return f$d;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    public static boolean f$a(fd fd2, boolean bl) {
        fd2.f$g = bl;
        return fd2.f$g;
    }

    public static Minecraft f$ba() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$x() {
        return f$d;
    }

    public static Minecraft f$Va() {
        return f$d;
    }

    public static Minecraft f$Na() {
        return f$d;
    }

    public static Minecraft f$ec() {
        return f$d;
    }

    public static Minecraft f$na() {
        return f$d;
    }

    public static Minecraft f$wa() {
        return f$d;
    }

    public static ka f$E(fd fd2) {
        return fd2.f$B;
    }

    public static Minecraft f$ra() {
        return f$d;
    }

    public static Minecraft f$oa() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$Jd() {
        return f$d;
    }

    public static int f$A(fd fd2) {
        return fd2.f$e;
    }

    public static Minecraft f$Ac() {
        return f$d;
    }

    public static Minecraft f$ma() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$Da() {
        return f$d;
    }

    public static Minecraft f$ea() {
        return f$d;
    }

    public static Minecraft f$Oa() {
        return f$d;
    }

    public static Minecraft f$Ra() {
        return f$d;
    }

    public static Minecraft f$N() {
        return f$d;
    }

    public static Minecraft f$LC() {
        return f$d;
    }

    public static Minecraft f$Hb() {
        return f$d;
    }

    public static Minecraft f$Wa() {
        return f$d;
    }

    private double f$E(EntityPlayer entityPlayer, double d) {
        EntityPlayer entityPlayer2 = entityPlayer;
        Object object = entityPlayer.field_70170_p.getCollisionBoxes((Entity)entityPlayer2, entityPlayer2.func_174813_aQ().grow(0.0, -d, 0.0));
        if (object.isEmpty()) {
            return 0.0;
        }
        d = 0.0;
        object = object.iterator();
        while (object.hasNext()) {
            AxisAlignedBB axisAlignedBB;
            AxisAlignedBB axisAlignedBB2 = (AxisAlignedBB)object.next();
            if (!(axisAlignedBB.maxY > d)) continue;
            d = axisAlignedBB2.maxY;
        }
        return entityPlayer.field_70163_u - d;
    }

    public static Minecraft f$fa() {
        return f$d;
    }

    public static Minecraft f$md() {
        return f$d;
    }

    public static Minecraft f$aC() {
        return f$d;
    }

    public static Minecraft f$da() {
        return f$d;
    }

    public static Minecraft f$gb() {
        return f$d;
    }

    public static Minecraft f$Ya() {
        return f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    private void f$E(double d, double d2, double d3) {
        fd.f$d.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, fd.f$d.player.field_70122_E));
    }

    public static boolean f$a(fd fd2) {
        return fd2.f$d;
    }

    public static Minecraft f$Xb() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    @Override
    public void f$B() {
        fd fd2;
        if (fd2.f$B.f$E() == hA.f$M) {
            ((q)((Y)f$d).getTimer()).f$E(1.0f);
            fd.f$d.player.field_70122_E = false;
            fd.f$d.player.field_71075_bZ.isFlying = false;
        }
        if (fd2.f$B.f$E() == hA.f$g) {
            fd fd3 = fd2;
            fd3.f$e = 4;
            fd3.f$K = 0.0;
        }
        super.f$B();
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$XC() {
        return f$d;
    }

    public static Minecraft f$ob() {
        return f$d;
    }

    public static Minecraft f$wb() {
        return f$d;
    }

    public static Minecraft f$Ed() {
        return f$d;
    }

    public static Minecraft f$PC() {
        return f$d;
    }

    public static Minecraft f$ha() {
        return f$d;
    }

    public static Minecraft f$Z() {
        return f$d;
    }

    public static Minecraft f$T() {
        return f$d;
    }

    public static Minecraft f$ld() {
        return f$d;
    }

    public static double f$E(fd fd2, EntityPlayer entityPlayer, double d) {
        return fd2.f$E(entityPlayer, d);
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$jc() {
        return f$d;
    }

    public static Minecraft f$pB() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$ta() {
        return f$d;
    }

    public static Minecraft f$Ca() {
        return f$d;
    }

    public static Minecraft f$ua() {
        return f$d;
    }

    public static Minecraft f$Ga() {
        return f$d;
    }

    public static Minecraft f$q() {
        return f$d;
    }

    public static Minecraft f$bc() {
        return f$d;
    }

    public static Minecraft f$Sd() {
        return f$d;
    }

    public static int f$a(fd fd2, int n) {
        fd2.f$j = n;
        return fd2.f$j;
    }

    public static Minecraft f$Tc() {
        return f$d;
    }

    public static Minecraft f$oC() {
        return f$d;
    }

    public static Minecraft f$la() {
        return f$d;
    }

    public static Minecraft f$hb() {
        return f$d;
    }

    public static Minecraft f$y() {
        return f$d;
    }

    public static Minecraft f$z() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$Xa() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$Ta() {
        return f$d;
    }

    public static Minecraft f$Ua() {
        return f$d;
    }

    public static Minecraft f$Dc() {
        return f$d;
    }

    public static Minecraft f$Ba() {
        return f$d;
    }

    public static Minecraft f$ga() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$fB() {
        return f$d;
    }

    public static Minecraft f$Ka() {
        return f$d;
    }

    public static Minecraft f$Qc() {
        return f$d;
    }

    public static Bh f$E(fd fd2) {
        return fd2.f$a;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$Sa() {
        return f$d;
    }

    public static Minecraft f$va() {
        return f$d;
    }

    public static z f$E(fd fd2) {
        return fd2.f$c;
    }

    public static Minecraft f$Nc() {
        return f$d;
    }

    public static Minecraft f$vC() {
        return f$d;
    }

    public static Minecraft f$Aa() {
        return f$d;
    }

    public static int f$h(fd fd2) {
        return fd2.f$C;
    }

    public static Minecraft f$Ib() {
        return f$d;
    }
}
 */