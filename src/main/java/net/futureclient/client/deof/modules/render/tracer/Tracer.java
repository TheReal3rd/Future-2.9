package net.futureclient.client.deof.modules.render.tracer;

public class Tracer {
}
/*
package net.futureclient.client;

import net.futureclient.client.BI;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Jd;
import net.futureclient.client.Wc;
import net.futureclient.client.gA;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;

public class VB
extends Ba {
    private z<Boolean> f$b;
    private s f$d;
    private z<Boolean> f$e;
    private z<Boolean> f$K;
    private z<Boolean> f$a;
    private z<Boolean> f$j;
    private z<Boolean> f$I;
    private z<Boolean> f$i;
    private z<Boolean> f$B;
    private z<Boolean> f$C;
    private ka<Wc> f$g;
    private ka<Jd> f$M;

    public static Minecraft f$E() {
        return f$d;
    }

    public static s f$E(VB vB) {
        return vB.f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static ka f$a(VB vB) {
        return vB.f$M;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    private boolean f$E(Entity entity) {
        if (entity == null || entity == f$d.getRenderViewEntity() || f$d.getRenderViewEntity() != null && entity == f$d.getRenderViewEntity().getRidingEntity()) {
            return false;
        }
        if (0.f$B.f$E().booleanValue() && entity instanceof EntityPlayer && (0.f$C.f$E().booleanValue() || !entity.isInvisible()) && (0.f$a.f$E().booleanValue() || !kH.f$E().f$E().f$E(entity.getName()))) {
            return true;
        }
        if (0.f$e.f$E().booleanValue() && (BI.f$M(entity) || BI.f$C(entity))) {
            return true;
        }
        if (0.f$I.f$E().booleanValue() && (BI.f$j(entity) || BI.f$I(entity))) {
            return true;
        }
        if (0.f$K.f$E().booleanValue() && BI.f$H(entity)) {
            return true;
        }
        if (0.f$j.f$E().booleanValue() && BI.f$h(entity)) {
            return true;
        }
        return 0.f$b.f$E() != false && entity instanceof EntityItem;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public VB() {
        VB vB;
        String[] stringArray = new String[3];
        stringArray[0] = "Tracers";
        stringArray[1] = "trace";
        stringArray[2] = "tracer";
        super("Tracers", stringArray, false, -38037, JD.f$i);
        VB vB2 = vB;
        String[] stringArray2 = new String[5];
        stringArray2[0] = "Players";
        stringArray2[1] = "Player";
        stringArray2[2] = "Mans";
        stringArray2[3] = "Humans";
        stringArray2[4] = "p";
        vB2.f$B = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Friends";
        stringArray3[1] = "Friend";
        stringArray3[2] = "Teammates";
        stringArray3[3] = "Teammate";
        vB.f$a = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "Invisibles";
        stringArray4[1] = "invis";
        stringArray4[2] = "inv";
        stringArray4[3] = "i";
        vB.f$C = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Monsters";
        stringArray5[1] = "Mobs";
        stringArray5[2] = "Mob";
        vB.f$e = new z<Boolean>(false, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Animals";
        stringArray6[1] = "Anamals";
        stringArray6[2] = "Anims";
        vB.f$I = new z<Boolean>(false, stringArray6);
        String[] stringArray7 = new String[6];
        stringArray7[0] = "Vehicles";
        stringArray7[1] = "Boat";
        stringArray7[2] = "Boats";
        stringArray7[3] = "Minecarts";
        stringArray7[4] = "Minecart";
        stringArray7[5] = "V";
        vB.f$K = new z<Boolean>(false, stringArray7);
        String[] stringArray8 = new String[6];
        stringArray8[0] = "Items";
        stringArray8[1] = "Item";
        stringArray8[2] = "Gems";
        stringArray8[3] = "aitems";
        stringArray8[4] = "itms";
        stringArray8[5] = "tems";
        vB.f$b = new z<Boolean>(false, stringArray8);
        String[] stringArray9 = new String[6];
        stringArray9[0] = "Others";
        stringArray9[1] = "Other";
        stringArray9[2] = "Miscellaneous";
        stringArray9[3] = "Misc";
        stringArray9[4] = "Miscellaneus";
        stringArray9[5] = "M";
        vB.f$j = new z<Boolean>(false, stringArray9);
        String[] stringArray10 = new String[3];
        stringArray10[0] = "Lines";
        stringArray10[1] = "line";
        stringArray10[2] = "l";
        vB.f$i = new z<Boolean>(true, stringArray10);
        String[] stringArray11 = new String[3];
        stringArray11[0] = "Target";
        stringArray11[1] = "Type";
        stringArray11[2] = "t";
        vB.f$M = new ka<Jd>(Jd.f$g, stringArray11);
        String[] stringArray12 = new String[4];
        stringArray12[0] = "Design";
        stringArray12[1] = "Box";
        stringArray12[2] = "d";
        stringArray12[3] = "type";
        vB.f$g = new ka<Wc>(Wc.f$g, stringArray12);
        String[] stringArray13 = new String[3];
        stringArray13[0] = "Width";
        stringArray13[1] = "Radius";
        stringArray13[2] = "raidus";
        vB.f$d = new s((Number)Float.valueOf(1.6f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(10.0f), 0.1, stringArray13);
        vB.f$E(vB.f$B, vB.f$a, vB.f$C, vB.f$e, vB.f$I, vB.f$K, vB.f$b, vB.f$j, vB.f$M, vB.f$g, vB.f$i, vB.f$d);
        vB.f$E(new gA(vB));
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static ka f$E(VB vB) {
        return vB.f$g;
    }

    public static z f$E(VB vB) {
        return vB.f$i;
    }

    public static boolean f$E(VB vB, Entity entity) {
        return vB.f$E(entity);
    }
}
 */