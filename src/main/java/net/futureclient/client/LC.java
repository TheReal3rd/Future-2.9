package net.futureclient.client;

import net.futureclient.client.GA;
import net.futureclient.client.va;
import net.futureclient.client.yB;

public class LC
extends GA {
    public final yB f$d;

    @Override
    public String f$E() {
        return "&e[name]";
    }

    public LC(yB yB2, String[] stringArray) {
        0.f$d = yB2;
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 1) {
            Object object = stringArray[0];
            if ((object = 0.f$d.f$a((String)object)) == null) {
                return "Invalid waypoint entered.";
            }
            if (yB.f$E(0.f$d, (va)object)) {
                0.f$d.f$i.remove(object);
            }
            return String.format("Removed waypoint &e%s&7.", ((va)object).f$E());
        }
        return null;
    }
}
package net.futureclient.client;

import java.util.Objects;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.Pg;
import net.futureclient.client.TH;
import net.futureclient.client.Ub;
import net.futureclient.client.Ze;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.oI;
import net.futureclient.client.qb;
import net.futureclient.client.s;
import net.futureclient.client.sG;
import net.futureclient.client.xB;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.util.EnumHand;

public class Lc
extends Ba {
    private z<Boolean> f$M;
    private z<Boolean> f$i;
    private ka<qb> f$I;
    private z<Boolean> f$d;
    private Bh f$C;
    private z<Boolean> f$j;
    private Entity f$e;
    private z<Boolean> f$g;
    private s f$K;
    private z<Boolean> f$b;

    public static z f$e(Lc lc) {
        return lc.f$M;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static boolean f$E(Lc lc, Entity entity) {
        return lc.f$E(entity);
    }

    public static Entity f$E(Lc lc, Entity entity) {
        lc.f$e = entity;
        return lc.f$e;
    }

    public static z f$B(Lc lc) {
        return lc.f$i;
    }

    private void f$E(Entity entity) {
        Entity entity2;
        boolean bl = ((Minecraft)Lc.f$d).player.func_184585_cz();
        boolean bl2 = ((Minecraft)Lc.f$d).player.isSneaking();
        boolean bl3 = ((Minecraft)Lc.f$d).player.func_70051_ag();
        if (bl) {
            Pg.f$E();
        }
        if (bl2) {
            Lc.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)((Minecraft)Lc.f$d).player, CPacketEntityAction.Action.STOP_SNEAKING));
        }
        if (bl3) {
            Lc.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)((Minecraft)Lc.f$d).player, CPacketEntityAction.Action.STOP_SPRINTING));
        }
        if ((entity2 = new oI(entity, sG.f$M).f$E()) != 0.f$e) {
            entity = entity2;
        }
        ((Minecraft)Lc.f$d).playerController.interactWithEntity((EntityPlayer)((Minecraft)Lc.f$d).player, entity, EnumHand.MAIN_HAND);
        if (bl) {
            Pg.f$a();
        }
        if (bl2) {
            Lc.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)((Minecraft)Lc.f$d).player, CPacketEntityAction.Action.START_SNEAKING));
        }
        if (bl3) {
            Lc.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)((Minecraft)Lc.f$d).player, CPacketEntityAction.Action.START_SPRINTING));
        }
    }

    public static z f$E(Lc lc) {
        return lc.f$d;
    }

    public Lc() {
        Lc lc;
        String[] stringArray = new String[5];
        stringArray[0] = "AutoMount";
        stringArray[1] = "RideableAura";
        stringArray[2] = "RidableAura";
        stringArray[3] = "BoatAura";
        stringArray[4] = "B0atAura";
        super("AutoMount", stringArray, true, -39424, JD.f$b);
        Lc lc2 = lc;
        Lc lc3 = lc;
        lc2.f$C = new Bh();
        lc2.f$e = null;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Require";
        stringArray2[1] = "Requirement";
        lc2.f$I = new ka<qb>(qb.f$i, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Delay";
        stringArray3[1] = "D";
        lc.f$K = new s((Number)Float.valueOf(0.5f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(10.0f), stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "Boat";
        stringArray4[1] = "Boats";
        stringArray4[2] = "Boaty";
        stringArray4[3] = "b";
        lc.f$b = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[5];
        stringArray5[0] = "Horse";
        stringArray5[1] = "Horses";
        stringArray5[2] = "Horseys";
        stringArray5[3] = "Hors";
        stringArray5[4] = "h";
        lc.f$j = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[4];
        stringArray6[0] = "SkeletonHorse";
        stringArray6[1] = "SkeletonHorses";
        stringArray6[2] = "Skellies";
        stringArray6[3] = "s";
        lc.f$i = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[7];
        stringArray7[0] = "Donkey";
        stringArray7[1] = "Donkeys";
        stringArray7[2] = "Donker";
        stringArray7[3] = "Donkers";
        stringArray7[4] = "Donk";
        stringArray7[5] = "Donkeh";
        stringArray7[6] = "d";
        lc.f$M = new z<Boolean>(true, stringArray7);
        String[] stringArray8 = new String[7];
        stringArray8[0] = "Llama";
        stringArray8[1] = "Llamas";
        stringArray8[2] = "Lamas";
        stringArray8[3] = "Lama";
        stringArray8[4] = "Laama";
        stringArray8[5] = "Laamas";
        stringArray8[6] = "l";
        lc.f$g = new z<Boolean>(true, stringArray8);
        String[] stringArray9 = new String[4];
        stringArray9[0] = "Pig";
        stringArray9[1] = "Pigs";
        stringArray9[2] = "Piggo";
        stringArray9[3] = "p";
        lc.f$d = new z<Boolean>(true, stringArray9);
        lc.f$E(lc.f$I, lc.f$b, lc.f$j, lc.f$i, lc.f$M, lc.f$d, lc.f$g, lc.f$K);
        lc.f$E(new Ub(lc), new xB(lc));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean f$E(Entity entity) {
        if (entity == null) {
            return false;
        }
        if (!entity.isEntityAlive()) {
            return false;
        }
        if (entity instanceof EntityAgeable && ((EntityAgeable)entity).isChild()) {
            return false;
        }
        Ze ze = (Ze)kH.f$E().f$E().f$E(Ze.class);
        if (((Minecraft)Lc.f$d).player.func_70032_d(entity) > ze.f$L.f$E().floatValue()) {
            return false;
        }
        if (!((Minecraft)Lc.f$d).player.func_70685_l(entity) && !ze.f$T.f$E().booleanValue()) {
            return false;
        }
        if (!TH.f$E(entity, ze.f$c.f$E().floatValue(), sG.f$M)) {
            return false;
        }
        if (entity.getPassengers().contains(((Minecraft)Lc.f$d).player)) {
            return false;
        }
        if (Objects.equals(entity.getControllingPassenger(), ((Minecraft)Lc.f$d).player)) {
            return false;
        }
        if (!(entity instanceof EntityBoat)) {
            return true;
        }
        switch ((qb)((Object)0.f$I.f$E())) {
            case f$i: {
                return true;
            }
            case f$M: {
                return entity.getPassengers().size() == 1 && entity.getControllingPassenger() != null;
            }
            case f$g: {
                if (entity.getPassengers().size() != 1 || entity.getControllingPassenger() == null) break;
                return ze.f$h.f$E() == false || kH.f$E().f$E().f$E(entity.getControllingPassenger().getName());
            }
        }
        return false;
    }

    public static Entity f$E(Lc lc) {
        return lc.f$e;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static s f$E(Lc lc) {
        return lc.f$K;
    }

    public static z f$A(Lc lc) {
        return lc.f$b;
    }

    public static void f$E(Lc lc, Entity entity) {
        lc.f$E(entity);
    }

    public static z f$K(Lc lc) {
        return lc.f$j;
    }

    @Override
    public void f$B() {
        Lc lc;
        Lc lc2 = lc;
        super.f$B();
        lc2.f$e = null;
        lc2.f$C.f$a();
    }

    public static Bh f$E(Lc lc) {
        return lc.f$C;
    }

    public static z f$a(Lc lc) {
        return lc.f$g;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ab;
import net.futureclient.client.Ba;
import net.futureclient.client.Bd;
import net.futureclient.client.Bh;
import net.futureclient.client.JA;
import net.futureclient.client.JD;
import net.futureclient.client.Sd;
import net.futureclient.client.Y;
import net.futureclient.client.YB;
import net.futureclient.client.dd;
import net.futureclient.client.ic;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.q;
import net.futureclient.client.s;
import net.futureclient.client.uA;
import net.futureclient.client.z;
import net.futureclient.client.zb;
import net.minecraft.client.Minecraft;

public class lc
extends Ba {
    private int f$g;
    private float f$M;
    public z<Boolean> f$e;
    public z<Boolean> f$K;
    public ka<Bd> f$b;
    private boolean f$d;
    private s f$C;
    private double f$i;
    private Bh f$j;
    public z<Boolean> f$I;

    public static boolean f$E(lc lc2) {
        return lc2.f$d;
    }

    private boolean f$e() {
        uA uA2 = (uA)kH.f$E().f$E().f$E(uA.class);
        if (!(uA2 == null || !uA2.f$E() || ((dd)((Object)uA2.f$K.f$E())).equals((Object)dd.f$j) || ((dd)((Object)uA2.f$K.f$E())).equals((Object)dd.f$C) || ((dd)((Object)uA2.f$K.f$E())).equals((Object)dd.f$a) || ((dd)((Object)uA2.f$K.f$E())).equals((Object)dd.f$M) || ((dd)((Object)uA2.f$K.f$E())).equals((Object)dd.f$g))) {
            return false;
        }
        return !lc.f$d.player.func_70090_H() && lc.f$d.player.field_70122_E && !lc.f$d.player.func_70617_f_() && !lc.f$d.player.movementInput.jump && lc.f$d.player.field_70124_G && (double)lc.f$d.player.field_70143_R < 0.1;
    }

    public static float f$E(lc lc2, float f) {
        lc2.f$M = f;
        return lc2.f$M;
    }

    public static int f$a(lc lc2) {
        return lc2.f$g++;
    }

    public static int f$E(lc lc2, int n) {
        lc2.f$g = n;
        return lc2.f$g;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static float f$E(lc lc2) {
        return lc2.f$M;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static boolean f$a(lc lc2) {
        return lc2.f$e();
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static double f$E(lc lc2, double d) {
        lc2.f$i = d;
        return lc2.f$i;
    }

    public lc() {
        lc lc2;
        String[] stringArray = new String[3];
        stringArray[0] = "Step";
        stringArray[1] = "autojump";
        stringArray[2] = "SlideStep";
        super("Step", stringArray, false, -7285557, JD.f$j);
        lc lc3 = lc2;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Height";
        stringArray2[1] = "Stepheight";
        stringArray2[2] = "Step-Height";
        stringArray2[3] = "sh";
        lc3.f$C = new s((Number)Float.valueOf(2.0f), (Number)Float.valueOf(0.8f), (Number)Float.valueOf(10.0f), 0.1, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Reverse";
        stringArray3[1] = "rev";
        lc2.f$e = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "UseTimer";
        stringArray4[1] = "Timer";
        stringArray4[2] = "Time";
        stringArray4[3] = "Timr";
        lc2.f$I = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[5];
        stringArray5[0] = "EntityStep";
        stringArray5[1] = "HorseStep";
        stringArray5[2] = "PigStep";
        stringArray5[3] = "PiggyStep";
        stringArray5[4] = "hstep";
        lc2.f$K = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Mode";
        stringArray6[1] = "Type";
        stringArray6[2] = "Mod";
        lc2.f$b = new ka<Bd>(Bd.f$i, stringArray6);
        lc lc4 = lc2;
        lc4.f$j = new Bh();
        lc4.f$M = 1.0f;
        lc2.f$g = 0;
        lc2.f$E(lc2.f$b, lc2.f$e, lc2.f$I, lc2.f$K, lc2.f$C);
        lc2.f$E(new YB(lc2), new Ab(lc2), new zb(lc2), new JA(lc2), new Sd(lc2));
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Bh f$E(lc lc2) {
        return lc2.f$j;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static double f$E(lc lc2) {
        return lc2.f$i;
    }

    @Override
    public void f$B() {
        lc lc2;
        ic ic2 = (ic)kH.f$E().f$E().f$E(ic.class);
        if (lc.f$d.player != null) {
            if (ic2 != null && !ic2.f$E()) {
                ((q)((Y)f$d).getTimer()).f$E(1.0f);
            }
            if (lc.f$d.player.func_184187_bx() != null) {
                lc.f$d.player.func_184187_bx().stepHeight = 1.0f;
            }
        }
        super.f$B();
    }

    public static s f$E(lc lc2) {
        return lc2.f$C;
    }

    public static int f$E(lc lc2) {
        return lc2.f$g;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static boolean f$E(lc lc2, boolean bl) {
        lc2.f$d = bl;
        return lc2.f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }
}
package net.futureclient.client;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.MovementInputFromOptions;

public final class lC
extends MovementInputFromOptions {
    public lC(GameSettings gameSettings) {
        super(gameSettings);
    }
}
