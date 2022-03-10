package net.futureclient.client.deof.modules.render.chams;

public class Chams {
}
/*
package net.futureclient.client;

import net.futureclient.client.BI;
import net.futureclient.client.Ba;
import net.futureclient.client.Ff;
import net.futureclient.client.JD;
import net.futureclient.client.dC;
import net.futureclient.client.kH;
import net.futureclient.client.mF;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class Dd
extends Ba {
    private z<Boolean> f$g;
    private z<Boolean> f$j;
    private z<Boolean> f$d;
    private z<Boolean> f$M;
    private z<Boolean> f$b;
    private z<Boolean> f$i;

    public static z f$E(Dd dd) {
        return dd.f$d;
    }

    public Dd() {
        Dd dd;
        String[] stringArray = new String[3];
        stringArray[0] = "Chams";
        stringArray[1] = "Cham";
        stringArray[2] = "Chammies";
        super("Chams", stringArray, true, -14510046, JD.f$i);
        Dd dd2 = dd;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Self";
        stringArray2[1] = "self";
        stringArray2[2] = "localplayer";
        stringArray2[3] = "theplayer";
        dd2.f$b = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Players";
        stringArray3[1] = "player";
        stringArray3[2] = "human";
        stringArray3[3] = "P";
        dd.f$j = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[5];
        stringArray4[0] = "Monsters";
        stringArray4[1] = "Hostiles";
        stringArray4[2] = "Mobs";
        stringArray4[3] = "monstas";
        stringArray4[4] = "H";
        dd.f$i = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[5];
        stringArray5[0] = "Animals";
        stringArray5[1] = "Neutrals";
        stringArray5[2] = "ani";
        stringArray5[3] = "animal";
        stringArray5[4] = "N";
        dd.f$M = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Texture";
        stringArray6[1] = "texture";
        stringArray6[2] = "skin";
        dd.f$g = new z<Boolean>(false, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "XQZ";
        stringArray7[1] = "xqz";
        stringArray7[2] = "throughwalls";
        stringArray7[3] = "walls";
        dd.f$d = new z<Boolean>(false, stringArray7);
        dd.f$E(dd.f$b, dd.f$j, dd.f$i, dd.f$M, dd.f$g, dd.f$d);
        dd.f$E(new dC(dd));
    }

    public static z f$a(Dd dd) {
        return dd.f$g;
    }

    public static boolean f$E(Dd dd, Entity entity) {
        return dd.f$E(entity);
    }

    private boolean f$E(Entity entity) {
        EntityPlayerSP entityPlayerSP;
        mF mF2 = (mF)kH.f$E().f$E().f$E(mF.class);
        Object object = entityPlayerSP = f$d.getRenderViewEntity() == null ? ((Minecraft)Dd.f$d).player : f$d.getRenderViewEntity();
        if (entity == null) {
            return false;
        }
        if (!0.f$b.f$E().booleanValue() && entity.equals((Object)entityPlayerSP)) {
            return false;
        }
        if (0.f$j.f$E().booleanValue() && entity instanceof EntityPlayer && (!mF2.f$E() || !mF2.f$d.containsKey(entity.getEntityId()))) {
            return true;
        }
        if (0.f$i.f$E().booleanValue() && (BI.f$M(entity) || BI.f$C(entity))) {
            return true;
        }
        return 0.f$M.f$E() != false && (BI.f$j(entity) || BI.f$I(entity));
    }

    private void f$E(Ff ff) {
        ff.f$E().render((Entity)ff.f$E(), ff.f$A(), ff.f$K(), ff.f$B(), ff.f$e(), ff.f$a(), ff.f$E());
    }

    public static void f$E(Dd dd, Ff ff) {
        dd.f$E(ff);
    }
}
 */