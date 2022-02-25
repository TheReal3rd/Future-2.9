package net.futureclient.client;

import net.futureclient.client.nD;
import net.minecraft.util.math.Vec3d;

public final class Mf
extends nD {
    public Mf(String string, int n) {
        Mf mf;
    }

    @Override
    public Vec3d f$E(Vec3d vec3d, Vec3d vec3d2) {
        return vec3d2.addVector((double)0.f$E(), 0.0, (double)0.f$E());
    }
}
package net.futureclient.client;

public enum MF {
    f$I,
    f$K,
    f$b,
    f$j,
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MF() {
        MF mF;
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.futureclient.client.BF;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.QF;
import net.futureclient.client.cE;
import net.futureclient.client.wF;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;

public class mF
extends Ba {
    public z<Boolean> f$K;
    public Map<Integer, UUID> f$d;
    private boolean f$g;
    public z<Boolean> f$j;
    private boolean f$M;
    public z<Boolean> f$b;
    public z<Boolean> f$i;

    public static Minecraft f$B() {
        return f$d;
    }

    public static boolean f$E(mF mF2) {
        return mF2.f$g;
    }

    @Override
    public void f$B() {
        mF mF2;
        mF mF3 = mF2;
        super.f$B();
        mF3.f$d.clear();
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public mF() {
        mF mF2;
        String[] stringArray = new String[4];
        stringArray[0] = "AntiBots";
        stringArray[1] = "AntiBot";
        stringArray[2] = "AntiEntity";
        stringArray[3] = "Antiboat";
        super("AntiBots", stringArray, true, -8374971, JD.f$I);
        mF mF3 = mF2;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Ping";
        stringArray2[1] = "Pin";
        stringArray2[2] = "Pong";
        mF3.f$K = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Invisible";
        stringArray3[1] = "Invis";
        mF2.f$b = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[2];
        stringArray4[0] = "Name";
        stringArray4[1] = "Nam";
        mF2.f$j = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "UUID";
        stringArray5[1] = "UserID";
        stringArray5[2] = "UID";
        mF2.f$i = new z<Boolean>(true, stringArray5);
        mF2.f$d = new HashMap<Integer, UUID>();
        mF2.f$E(mF2.f$K, mF2.f$b, mF2.f$j, mF2.f$i);
        mF2.f$E(new cE(mF2), new wF(mF2), new QF(mF2), new BF(mF2));
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    private boolean f$B(EntityPlayer entityPlayer) {
        return 0.f$b.f$E() != false && entityPlayer.func_82150_aj() && !entityPlayer.func_70644_a(MobEffects.INVISIBILITY);
    }

    public static boolean f$B(mF mF2, EntityPlayer entityPlayer) {
        return mF2.f$B(entityPlayer);
    }

    public static Minecraft f$M() {
        return f$d;
    }

    @Override
    public void f$K() {
        mF mF2;
        super.f$K();
        if (!f$d.isSingleplayer() && f$d.getCurrentServerData() != null) {
            mF mF3 = mF2;
            mF3.f$M = mF.f$d.getCurrentServerData().serverIP.toLowerCase().contains("hypixel");
            mF3.f$g = mF.f$d.getCurrentServerData().serverIP.toLowerCase().contains("mineplex");
        }
    }

    private boolean f$a(EntityPlayer entityPlayer) {
        return 0.f$i.f$E() != false && f$d.getConnection() != null && f$d.getConnection().getPlayerInfo(entityPlayer.func_110124_au()) == null;
    }

    private boolean f$e(EntityPlayer entityPlayer) {
        if (0.f$j.f$E().booleanValue()) {
            if (entityPlayer.getDisplayName().getFormattedText().equalsIgnoreCase(new StringBuilder().insert(0, entityPlayer.getName()).append("\u00a7r").toString())) {
                if (!((Minecraft)mF.f$d).player.func_145748_c_().getFormattedText().equalsIgnoreCase(new StringBuilder().insert(0, ((Minecraft)mF.f$d).player.func_70005_c_()).append("\u00a7r").toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static boolean f$E(mF mF2, boolean bl) {
        mF2.f$g = bl;
        return mF2.f$g;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static boolean f$a(mF mF2, EntityPlayer entityPlayer) {
        return mF2.f$a(entityPlayer);
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    private List<EntityPlayer> f$e() {
        ArrayList<EntityPlayer> arrayList = new ArrayList<EntityPlayer>(mF.f$d.world.field_73010_i);
        arrayList.remove(((Minecraft)mF.f$d).player);
        return arrayList;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static boolean f$E(mF mF2, EntityPlayer entityPlayer) {
        return mF2.f$E(entityPlayer);
    }

    private boolean f$E(EntityPlayer entityPlayer) {
        return 0.f$M && (int)mF.f$d.player.field_70165_t == (int)entityPlayer.field_70165_t && (int)mF.f$d.player.field_70161_v == (int)entityPlayer.field_70161_v && (int)entityPlayer.field_70163_u - (int)mF.f$d.player.field_70163_u > 8;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static List f$E(mF mF2) {
        return mF2.f$e();
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static boolean f$e(mF mF2, EntityPlayer entityPlayer) {
        return mF2.f$e(entityPlayer);
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static boolean f$a(mF mF2, boolean bl) {
        mF2.f$M = bl;
        return mF2.f$M;
    }

    public static Minecraft f$j() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.De;
import net.futureclient.client.Ha;
import net.futureclient.client.Ie;

public class mf
extends Ha<De> {
    public final Ie f$d;

    @Override
    public void f$E(De de) {
        Ie.f$E(0.f$d);
    }

    public mf(Ie ie) {
        0.f$d = ie;
    }
}
