package net.futureclient.client;

import io.netty.util.internal.ConcurrentSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.futureclient.client.Ba;
import net.futureclient.client.Be;
import net.futureclient.client.Cg;
import net.futureclient.client.FD;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.ZD;
import net.futureclient.client.aF;
import net.futureclient.client.cD;
import net.futureclient.client.eD;
import net.futureclient.client.eE;
import net.futureclient.client.ka;
import net.futureclient.client.mE;
import net.futureclient.client.mf;
import net.futureclient.client.s;
import net.futureclient.client.tE;
import net.futureclient.client.uf;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.Vec3d;

public class Ie
extends Ba {
    private final ka<tE> f$e;
    private final ka<Be> f$K;
    private int f$g;
    private final Set<CPacketPlayer> f$i;
    private int f$d;
    private final s f$I;
    private final z<Boolean> f$j;
    private final Map<Integer, FD> f$M;
    private final ka<cD> f$b;

    public static Minecraft f$M() {
        return f$d;
    }

    public static ka f$a(Ie ie) {
        return ie.f$e;
    }

    private void f$E(CPacketPlayer cPacketPlayer) {
        0.f$i.add(cPacketPlayer);
        Ie.f$d.player.connection.sendPacket((Packet)cPacketPlayer);
    }

    public static z f$E(Ie ie) {
        return ie.f$j;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    private void f$E(double d, double d2, double d3, boolean bl) {
        Vec3d vec3d = new Vec3d(d, d2, d3);
        Vec3d vec3d2 = Ie.f$d.player.func_174791_d().add(vec3d);
        Vec3d vec3d3 = ((cD)((Object)this.f$b.f$E())).f$E().f$E(vec3d, vec3d2);
        boolean bl2 = bl;
        Ie ie = this;
        ie.f$E((CPacketPlayer)new CPacketPlayer.Position(vec3d2.x, vec3d2.y, vec3d2.z, Ie.f$d.player.field_70122_E));
        Ie ie2 = this;
        ie.f$E((CPacketPlayer)new CPacketPlayer.Position(vec3d3.x, vec3d3.y, vec3d3.z, Ie.f$d.player.field_70122_E));
    }

    public Ie() {
        Ie ie;
        String[] stringArray = new String[2];
        stringArray[0] = "PacketFly";
        stringArray[1] = "PFly";
        super("PacketFly", stringArray, true, -1164517, JD.f$K);
        Ie ie2 = ie;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Mode";
        stringArray2[1] = "m";
        ie2.f$e = new ka<tE>(tE.f$M, stringArray2);
        Ie ie3 = ie;
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Factor";
        stringArray3[1] = "Ticks";
        stringArray3[2] = "TickCount";
        stringArray3[3] = "Tick";
        ie3.f$I = new s((Number)1.0, (Number)1.0, (Number)10.0, 1, stringArray3);
        Ie ie4 = ie;
        String[] stringArray4 = new String[5];
        stringArray4[0] = "Phase";
        stringArray4[1] = "Noclip";
        stringArray4[2] = "nc";
        stringArray4[3] = "ph";
        stringArray4[4] = "clip";
        ie4.f$K = new ka<Be>(Be.f$g, stringArray4);
        Ie ie5 = ie;
        String[] stringArray5 = new String[2];
        stringArray5[0] = "Type";
        stringArray5[1] = "t";
        ie5.f$b = new ka<cD>(cD.f$j, stringArray5);
        Ie ie6 = ie;
        String[] stringArray6 = new String[4];
        stringArray6[0] = "Anti Kick";
        stringArray6[1] = "Anti-Kick";
        stringArray6[2] = "ak";
        stringArray6[3] = "antikick";
        ie6.f$j = new z<Boolean>(true, stringArray6);
        Ie ie7 = ie;
        ie.f$i = new ConcurrentSet();
        Ie ie8 = ie;
        ie.f$M = new ConcurrentHashMap<Integer, FD>();
        z[] zArray = new z[5];
        zArray[0] = ie.f$e;
        zArray[1] = ie.f$I;
        zArray[2] = ie.f$K;
        zArray[3] = ie.f$b;
        zArray[4] = ie.f$j;
        ie.f$E(zArray);
        Ha[] haArray = new Ha[8];
        haArray[0] = new eE(ie);
        haArray[1] = new eD(ie);
        haArray[2] = new mE(ie);
        haArray[3] = new Cg(ie);
        haArray[4] = new aF(ie);
        haArray[5] = new mf(ie);
        haArray[6] = new uf(ie);
        haArray[7] = new ZD(ie);
        ie.f$E(haArray);
    }

    public static boolean f$E(Ie ie) {
        return ie.f$e();
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static int f$E(Ie ie) {
        return ie.f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Map f$E(Ie ie) {
        return ie.f$M;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Set f$E(Ie ie) {
        return ie.f$i;
    }

    @Override
    public void f$K() {
        Ie ie;
        Ie ie2 = ie;
        ie2.f$A();
        super.f$K();
    }

    private boolean f$E(int n) {
        if (++0.f$g >= n) {
            0.f$g = 0;
            return true;
        }
        return false;
    }

    private boolean f$e() {
        if (!Ie.f$d.world.func_184144_a((Entity)Ie.f$d.player, Ie.f$d.player.func_174813_aQ().expand(-0.0625, -0.0625, -0.0625)).isEmpty()) {
            return true;
        }
        return false;
    }

    public static int f$E(Ie ie, int n) {
        ie.f$d = n;
        return ie.f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static s f$E(Ie ie) {
        return ie.f$I;
    }

    public static boolean f$E(Ie ie, int n) {
        return ie.f$E(n);
    }

    private void f$A() {
        Ie ie;
        ie.f$g = 0;
        ie.f$d = 0;
        ie.f$i.clear();
        ie.f$M.clear();
    }

    public static void f$E(Ie ie) {
        ie.f$A();
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static ka f$E(Ie ie) {
        return ie.f$K;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static void f$E(Ie ie, double d, double d2, double d3, boolean bl) {
        ie.f$E(d, d2, d3, bl);
    }

    public static Minecraft f$f() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ye;
import net.minecraft.network.Packet;

public abstract class IE
extends Ye {
    public IE(Packet<?> packet) {
        super(packet);
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class ie
extends RF {
    private ItemStack f$d;
    private BlockPos f$g;
    private EntityLivingBase f$M;

    public EntityLivingBase f$E() {
        ie ie2;
        return ie2.f$M;
    }

    public BlockPos f$E() {
        ie ie2;
        return ie2.f$g;
    }

    public ItemStack f$E() {
        ie ie2;
        return ie2.f$d;
    }

    public ie(EntityLivingBase entityLivingBase, BlockPos blockPos, ItemStack itemStack) {
        ie ie2 = 0;
        0.f$M = entityLivingBase;
        ie2.f$g = blockPos;
        ie2.f$d = itemStack;
    }
}
