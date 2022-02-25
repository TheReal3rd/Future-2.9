package net.futureclient.client;

public enum Ka {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Ka() {
        Ka ka;
    }
}
package net.futureclient.client;

import net.futureclient.client.kF;

public class KA {
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            KA.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.Hc;
import net.futureclient.client.Pf;
import net.futureclient.client.Tc;
import net.futureclient.client.dc;
import net.futureclient.client.kF;
import net.minecraft.block.BlockLiquid;
import net.minecraft.util.math.BlockPos;

public class kA
extends Ha<Pf> {
    public final Hc f$d;

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(Pf 0) {
        0.f$d.f$a(String.format("Jesus \u00a77[\u00a7F%s\u00a77]", new Object[]{Hc.f$E(0.f$d).f$E()}));
        if (Hc.f$v().player.field_70128_L || Hc.f$W().player.isSneaking() || !Hc.f$E(0.f$d).f$E(800L)) {
            return;
        }
        switch (dc.f$d[((Tc)Hc.f$E(0.f$d).f$E()).ordinal()]) {
            case 1: {
                v0 = CG.f$E();
                while (false) {
                }
                if (!v0 || !(Hc.f$Y().player.field_70143_R < 3.0f) || Hc.f$t().player.isSneaking()) break;
                Hc.f$P().player.field_70181_x = 0.1;
                return;
            }
            case 2: {
                if (0.f$E() != kF.f$M) ** GOTO lbl33
                if (CG.f$E(false) && !Hc.f$Q().player.isSneaking()) {
                    Hc.f$U().player.field_70122_E = false;
                }
                var2_2 = Hc.f$k().world.func_180495_p(new BlockPos((int)Math.floor(Hc.f$J().player.field_70165_t), (int)Math.floor(Hc.f$d().player.field_70163_u), (int)Math.floor(Hc.f$l().player.field_70161_v))).getBlock();
                if (Hc.f$E(0.f$d) && !Hc.f$b().player.field_71075_bZ.isFlying && !Hc.f$F().player.func_70090_H()) {
                    if (Hc.f$G().player.field_70181_x < -0.3 || Hc.f$D().player.field_70122_E || Hc.f$g().player.func_70617_f_()) {
                        Hc.f$E(0.f$d, false);
                        return;
                    }
                    Hc.f$m().player.field_70181_x = Hc.f$f().player.field_70181_x / 0.9800000190734863 + 0.08;
                    Hc.f$L().player.field_70181_x -= 0.03120000000005;
                }
                if (!Hc.f$i().player.func_70090_H() && !Hc.f$c().player.func_180799_ab()) ** GOTO lbl29
                Hc.f$I().player.field_70181_x = 0.1;
                v1 = 0;
                ** GOTO lbl35
lbl29:
                // 1 sources

                if (!Hc.f$j().player.func_180799_ab() && var2_2 instanceof BlockLiquid && Hc.f$M().player.field_70181_x < 0.2) {
                    Hc.f$C().player.field_70181_x = 0.5;
                    Hc.f$E(0.f$d, true);
                }
            }
lbl33:
            // 5 sources

            case 3: {
                v1 = 0;
lbl35:
                // 2 sources

                if (v1.f$E() != kF.f$M || CG.f$E() || !CG.f$E(true) || CG.f$a() || Hc.f$H().player.field_70173_aa % 2 != 0) break;
                v2 = 0;
                v2.f$E(v2.f$e() + 0.02);
            }
        }
    }

    public kA(Hc hc) {
        0.f$d = hc;
    }
}
package net.futureclient.client;

import net.futureclient.client.z;

public class ka<T extends Enum<?>> extends z<T> {
    public ka(T t, String ... stringArray) {
        super(t, stringArray);
    }

    public void f$a() {
        ka ka2;
        ka ka3 = ka2;
        Object t = ka3.f$E();
        int n = ((Enum)ka3.f$E()).ordinal();
        if (++n > ((T)t).length - 1) {
            n = 0;
        }
        ka2.f$E(t[n]);
    }

    @Override
    public T[] f$E() {
        ka ka2;
        return (Enum[])((Enum)ka2.f$E()).getClass().getEnumConstants();
    }

    @Override
    public void f$E() {
        ka ka2;
        ka ka3 = ka2;
        Object t = ka3.f$E();
        int n = ((Enum)ka3.f$E()).ordinal();
        if (--n < 0) {
            n = ((T)t).length - 1;
        }
        ka2.f$E(t[n]);
    }

    @Override
    public void f$E(String string) {
        int n;
        Object t = 0.f$E();
        int n2 = ((T)t).length;
        int n3 = n = 0;
        while (n3 < n2) {
            Object t2 = t[n];
            if (((Enum)t2).name().equalsIgnoreCase(string)) {
                0.f$E(t2);
                return;
            }
            n3 = ++n;
        }
    }

    @Override
    public String f$E() {
        ka ka2;
        return ((Enum)ka2.f$d).name().charAt(0) + ((Enum)ka2.f$d).name().toLowerCase().replaceFirst(Character.toString(((Enum)ka2.f$d).name().charAt(0)).toLowerCase(), "");
    }
}
