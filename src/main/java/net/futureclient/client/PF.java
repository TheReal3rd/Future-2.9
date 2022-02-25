package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.entity.Entity;

public class PF
extends RF {
    private Entity f$g;
    private int f$d;

    public PF(Entity entity) {
        PF pF = 0;
        pF.f$d = -1;
        pF.f$g = entity;
    }

    public Entity f$E() {
        PF pF;
        return pF.f$g;
    }

    public int f$E() {
        PF pF;
        return pF.f$d;
    }

    public void f$E(int n) {
        0.f$d = n;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.futureclient.client.kF;

public class Pf
extends RF {
    private double f$g;
    private float f$I;
    private float f$C;
    private double f$i;
    private float f$a;
    private double f$M;
    private float f$e;
    private boolean f$d;
    private kF f$B;
    private double f$j;
    private double f$K;
    private double f$b;

    public void f$a(boolean bl) {
        0.f$d = bl;
    }

    public double f$A() {
        Pf pf;
        return pf.f$b;
    }

    public float f$B() {
        Pf pf;
        return pf.f$a;
    }

    public double f$E() {
        Pf pf;
        return pf.f$M;
    }

    public double f$a() {
        Pf pf;
        return pf.f$g;
    }

    public void f$a(float f) {
        0.f$a = f;
    }

    public void f$E(double d) {
        0.f$j = d;
    }

    public boolean f$a() {
        Pf pf;
        return pf.f$d;
    }

    public Pf(kF kF2, float f, float f2, double d, double d2, double d3, boolean bl) {
        Pf pf = 0;
        pf.f$B = kF2;
        pf.f$a = pf.f$e = f;
        Pf pf2 = 0;
        pf2.f$C = pf2.f$I = f2;
        Pf pf3 = 0;
        pf3.f$K = pf3.f$b = d;
        Pf pf4 = 0;
        pf4.f$j = pf4.f$i = d2;
        Pf pf5 = 0;
        pf5.f$M = pf5.f$g = d3;
        0.f$d = bl;
    }

    public double f$B() {
        Pf pf;
        return pf.f$i;
    }

    public float f$e() {
        Pf pf;
        return pf.f$C;
    }

    public float f$a() {
        Pf pf;
        return pf.f$e;
    }

    public float f$E() {
        Pf pf;
        return pf.f$I;
    }

    public kF f$E() {
        Pf pf;
        return pf.f$B;
    }

    public double f$K() {
        Pf pf;
        return pf.f$K;
    }

    public void f$E(float f) {
        0.f$C = f;
    }

    public double f$e() {
        Pf pf;
        return pf.f$j;
    }
}
package net.futureclient.client;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.futureclient.client.Ef;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.TH;
import net.futureclient.client.Vf;
import net.futureclient.client.kH;
import net.futureclient.client.sG;
import net.futureclient.client.wE;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class pf
extends Ha<Pf> {
    public final wE f$d;

    private static boolean f$E(EntityPlayer entityPlayer) {
        return !Pg.f$E().contains(entityPlayer);
    }

    @Override
    private void f$E(EntityPlayer entityPlayer) {
        List cfr_ignored_0 = (List)wE.f$E(0.f$d).remove(entityPlayer);
    }

    public pf(wE wE2) {
        0.f$d = wE2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void f$E(Pf 0) {
        if (wE.f$D().currentScreen instanceof GuiChest) {
            return;
        }
        if (wE.f$g().player.field_71071_by.getCurrentItem().isEmpty()) {
            return;
        }
        wE.f$E(0.f$d, new HashMap<K, V>());
        switch (Ef.f$d[0.f$E().ordinal()]) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                var2_2 = -Infinity;
                wE.f$E(0.f$d, null);
                var4_4 = Pg.f$E().iterator();
                block8: while (true) {
                    v0 = var4_4;
                    while (v0.hasNext()) {
                        var5_5 /* !! */  = var4_4.next();
                        if (var5_5 /* !! */ .equals((Object)wE.f$m().player) || kH.f$E().f$E().f$E(var5_5 /* !! */ .getName()) || var5_5 /* !! */ .field_70173_aa < 40 || !Pg.f$E((Entity)var5_5 /* !! */ , (sG)wE.f$E(0.f$d).f$E()) || var5_5 /* !! */ .func_145782_y() == -1337 || 0.f$d.f$j.f$E().booleanValue() && 0.f$d.f$E(var5_5 /* !! */ , (EntityPlayer)wE.f$f().player) || !TH.f$E((Entity)var5_5 /* !! */ , wE.f$B(0.f$d).f$E().floatValue(), (sG)wE.f$E(0.f$d).f$E())) continue block8;
                        v1 = 0;
                        if (wE.f$E(0.f$d) == null) {
                            wE.f$E(v1.f$d, var5_5 /* !! */ );
                            var2_2 = wE.f$E(0.f$d, var5_5 /* !! */ );
                            continue block8;
                        }
                        if (wE.f$E(v1.f$d, var5_5 /* !! */ ) <= var2_2) {
                            v0 = var4_4;
                            continue;
                        }
                        wE.f$E(0.f$d, var5_5 /* !! */ );
                        var2_2 = wE.f$E(0.f$d, var5_5 /* !! */ );
                        continue block8;
                    }
                    break;
                }
                wE.f$E(0.f$d).keySet().stream().filter((Predicate<EntityPlayer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, f$E(net.minecraft.entity.player.EntityPlayer ), (Lnet/minecraft/entity/player/EntityPlayer;)Z)()).forEach((Consumer<EntityPlayer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, f$E(net.minecraft.entity.player.EntityPlayer ), (Lnet/minecraft/entity/player/EntityPlayer;)V)((pf)0));
                for (EntityPlayer var5_5 : Pg.f$E()) {
                    v2 = 0;
                    wE.f$E(v2.f$d).putIfAbsent(var5_5 /* !! */ , new ArrayList<E>());
                    var2_3 = (List)wE.f$E(v2.f$d).get(var5_5 /* !! */ );
                    var2_3.add(new Vec3d(var5_5 /* !! */ .field_70165_t, var5_5 /* !! */ .field_70163_u, var5_5 /* !! */ .field_70161_v));
                    if (var2_3.size() <= wE.f$K(0.f$d)) continue;
                    var3_6 = 0;
                    v3 = new ArrayList<E>(var2_3).iterator();
                    while (v3.hasNext()) {
                        var7_8 = (Vec3d)var6_7.next();
                        if (var3_6 < var2_3.size() - wE.f$K(0.f$d)) {
                            v4 = var2_3;
                            v4.remove(v4.get(var3_6));
                        }
                        ++var3_6;
                        v3 = var6_7;
                    }
                }
                if (wE.f$E(0.f$d) == null) ** GOTO lbl134
                if (((Boolean)wE.f$B(0.f$d).f$E()).booleanValue() && wE.f$B(0.f$d) >= 30) {
                    wE.f$a(0.f$d, 0);
                }
                wE.f$e(0.f$d);
                var4_4 = kH.f$E().f$E().f$E((Entity)wE.f$E(0.f$d));
                var5_5 /* !! */  = (EntityPlayer)TH.f$E(var4_4, (sG)wE.f$E(0.f$d).f$E());
                if (!((Boolean)wE.f$B(0.f$d).f$E()).booleanValue()) ** GOTO lbl97
                if (((Boolean)wE.f$e(0.f$d).f$E()).booleanValue()) {
                    v5 = var5_5 /* !! */ [0];
                } else {
                    v6 = var5_5 /* !! */ [0];
                    v5 = v6;
                    wE.f$L().player.field_70177_z = (float)v6;
                }
                0.f$a((float)v5);
                if (((Boolean)wE.f$e(0.f$d).f$E()).booleanValue()) {
                    v7 = var5_5 /* !! */ [1] + wE.f$e(0.f$d).f$E().floatValue() * (float)wE.f$B(0.f$d);
                } else {
                    v8 = var5_5 /* !! */ [1] + wE.f$e(0.f$d).f$E().floatValue() * (float)wE.f$B(0.f$d);
                    v7 = v8;
                    wE.f$i().player.field_70125_A = (float)v8;
                }
                0.f$E((float)v7);
                if (wE.f$B(0.f$d) >= 10) {
                    if (((Boolean)wE.f$e(0.f$d).f$E()).booleanValue()) {
                        v9 = var5_5 /* !! */ [0] - wE.f$a(0.f$d).f$E().floatValue() * (float)wE.f$B(0.f$d);
                    } else {
                        v10 = var5_5 /* !! */ [0] - wE.f$a(0.f$d).f$E().floatValue() * (float)wE.f$B(0.f$d);
                        v9 = v10;
                        wE.f$c().player.field_70177_z = (float)v10;
                    }
                    0.f$a((float)v9);
                }
                if (wE.f$B(0.f$d) < 20) ** GOTO lbl111
                if (((Boolean)wE.f$e(0.f$d).f$E()).booleanValue()) {
                    v11 = var5_5 /* !! */ [0] + wE.f$a(0.f$d).f$E().floatValue() * (float)wE.f$B(0.f$d);
                } else {
                    v12 = var5_5 /* !! */ [0] + wE.f$a(0.f$d).f$E().floatValue() * (float)wE.f$B(0.f$d);
                    v11 = v12;
                    wE.f$I().player.field_70177_z = (float)v12;
                }
                0.f$a((float)v11);
                v13 = 0;
                ** GOTO lbl112
lbl97:
                // 1 sources

                if (((Boolean)wE.f$e(0.f$d).f$E()).booleanValue()) {
                    v14 = var5_5 /* !! */ [0];
                } else {
                    v15 = var5_5 /* !! */ [0];
                    v14 = v15;
                    wE.f$j().player.field_70177_z = (float)v15;
                }
                0.f$a((float)v14);
                if (((Boolean)wE.f$e(0.f$d).f$E()).booleanValue()) {
                    v16 = var5_5 /* !! */ [1];
                } else {
                    v17 = var5_5 /* !! */ [1];
                    v16 = v17;
                    wE.f$M().player.field_70125_A = (float)v17;
                }
                0.f$E((float)v16);
lbl111:
                // 2 sources

                v13 = 0;
lbl112:
                // 2 sources

                if (!((float)wE.f$a(v13.f$d) >= wE.f$E(0.f$d).f$E().floatValue())) break;
                if (((Boolean)wE.f$a(0.f$d).f$E()).booleanValue()) {
                    wE.f$H().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)wE.f$C().player, CPacketEntityAction.Action.START_SNEAKING));
                }
                if (!((Boolean)wE.f$E(0.f$d).f$E()).booleanValue() || wE.f$h().playerController == null) ** GOTO lbl-1000
                switch (Ef.f$g[((Vf)wE.f$a(0.f$d).f$E()).ordinal()]) {
                    case 1: {
                        v18 = wE.f$B();
                        while (false) {
                        }
                        v18.playerController.processRightClick((EntityPlayer)wE.f$A().player, (World)wE.f$K().world, EnumHand.MAIN_HAND);
                        v19 = 0;
                        break;
                    }
                    case 2: {
                        wE.f$e().player.swingArm(EnumHand.MAIN_HAND);
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        v19 = 0;
                    }
                }
                if (((Boolean)wE.f$a(v19.f$d).f$E()).booleanValue()) {
                    wE.f$E().player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)wE.f$a().player, CPacketEntityAction.Action.STOP_SNEAKING));
                }
                wE.f$E(0.f$d, 0);
                return;
lbl134:
                // 1 sources

                v20 = 0;
                wE.f$E(v20.f$d);
                if (wE.f$B(v20.f$d) > 0) break;
                wE.f$a(0.f$d, 0);
            }
        }
    }
}
package net.futureclient.client;

public enum pF {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pF() {
        pF pF2;
    }
}
