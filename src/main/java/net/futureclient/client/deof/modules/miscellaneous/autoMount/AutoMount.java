package net.futureclient.client.deof.modules.miscellaneous.autoMount;

import net.futureclient.client.*;

public class AutoMount {
}
/*
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
    Ze ze = (Ze) kH.f$E().f$E().f$E(Ze.class);
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
 */