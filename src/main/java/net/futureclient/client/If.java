package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.MF;
import net.futureclient.client.Pf;
import net.futureclient.client.Uf;
import net.futureclient.client.eF;
import net.futureclient.client.kF;

public class If
extends Ha<Pf> {
    public final Uf f$d;

    public If(Uf uf) {
        0.f$d = uf;
    }

    @Override
    public void f$E(Pf pf) {
        If if_;
        If if_2;
        if (!pf.f$E().equals((Object)kF.f$M)) {
            return;
        }
        Uf.f$e(0.f$d, 0.0f);
        Uf.f$a(0.f$d, Uf.f$K().player.field_70125_A);
        switch ((eF)((Object)Uf.f$a(0.f$d).f$E())) {
            case f$e: {
                If if_3 = 0;
                while (false) {
                }
                if_2 = if_3;
                Uf.f$a(if_3.f$d, 85.0f);
                break;
            }
            case f$I: {
                If if_4 = 0;
                if_2 = if_4;
                Uf.f$a(if_4.f$d, 90.0f);
                break;
            }
            case f$K: {
                If if_5 = 0;
                if_2 = if_5;
                Uf.f$a(if_5.f$d, 1.132245E7f);
                break;
            }
            case f$b: {
                If if_6 = 0;
                if_2 = if_6;
                Uf.f$a(if_6.f$d, -90.0f);
                break;
            }
            case f$j: {
                If if_7 = 0;
                if_2 = if_7;
                Uf.f$a(if_7.f$d, 1.132227E7f);
                break;
            }
            case f$i: {
                If if_8 = 0;
                if_2 = if_8;
                Uf.f$a(if_8.f$d, 0.0f);
                break;
            }
            case f$M: {
                If if_9 = 0;
                if_2 = if_9;
                Uf.f$a(if_9.f$d, 1.132236E7f);
                break;
            }
            case f$g: {
                If if_10 = 0;
                Uf.f$a(if_10.f$d, (float)Uf.f$E(if_10.f$d).nextInt(45) + Uf.f$E(0.f$d).nextFloat());
            }
            default: {
                if_2 = 0;
            }
        }
        Uf.f$E(if_2.f$d, (int)((float)Uf.f$E(0.f$d) + Uf.f$e(0.f$d).f$E().floatValue()));
        if (Uf.f$E(0.f$d) >= 360) {
            Uf.f$E(0.f$d, 0);
        }
        If if_11 = 0;
        Uf.f$E(if_11.f$d, Uf.f$e(if_11.f$d) + 15.0f);
        if (Uf.f$e(if_11.f$d) >= 100.0f) {
            Uf.f$E(0.f$d, 0.0f);
        }
        switch ((MF)((Object)Uf.f$E(0.f$d).f$E())) {
            case f$b: {
                If if_12 = 0;
                while (false) {
                }
                if_ = if_12;
                Uf.f$e(if_12.f$d, (float)Uf.f$E(if_12.f$d) - Uf.f$B().player.field_70177_z);
                break;
            }
            case f$j: {
                If if_13 = 0;
                If if_14 = 0;
                Uf.f$e(if_13.f$d, Uf.f$e(if_13.f$d) >= 50.0f ? Uf.f$E(if_14.f$d).nextInt(30) : -Uf.f$E(if_14.f$d).nextInt(30));
                if_ = 0;
                break;
            }
            case f$i: {
                If if_15 = 0;
                if_ = if_15;
                Uf.f$e(if_15.f$d, 2.14748365E9f);
                break;
            }
            case f$g: {
                Uf.f$e(0.f$d, -Uf.f$e().player.field_70177_z);
            }
            default: {
                if_ = 0;
            }
        }
        if (!((MF)((Object)Uf.f$E(if_.f$d).f$E())).equals((Object)MF.f$i)) {
            If if_16 = 0;
            Uf.f$e(if_16.f$d, Uf.f$a(if_16.f$d) + (Uf.f$a().player.field_70177_z + (((MF)((Object)Uf.f$E(0.f$d).f$E())).equals((Object)MF.f$I) ? 0.0f : 180.0f + Uf.f$a(0.f$d).f$E().floatValue())));
        }
        if (((MF)((Object)Uf.f$E(0.f$d).f$E())).equals((Object)MF.f$M)) {
            if (Uf.f$E().player.field_70173_aa % Uf.f$E(0.f$d).f$E().intValue() == 0) {
                If if_17 = 0;
                Uf.f$E(if_17.f$d, !Uf.f$a(if_17.f$d));
            }
            if (Uf.f$a(0.f$d)) {
                If if_18 = 0;
                Uf.f$e(if_18.f$d, Uf.f$a(if_18.f$d) + 180.0f);
            }
        }
        if (Uf.f$E(0.f$d)) {
            Pf pf2 = pf;
            pf2.f$a(Uf.f$a(0.f$d));
            pf2.f$E(Uf.f$E(0.f$d));
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.s;
import net.futureclient.client.vd;
import net.minecraft.client.Minecraft;

public class IF
extends Ba {
    private s f$g;
    private s f$d;

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static s f$a(IF iF) {
        return iF.f$g;
    }

    public static s f$E(IF iF) {
        return iF.f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public IF() {
        IF iF;
        String[] stringArray = new String[4];
        stringArray[0] = "Reach";
        stringArray[1] = "reac";
        stringArray[2] = "HitBox";
        stringArray[3] = "HitBoxes";
        super("Reach", stringArray, true, -16130117, JD.f$K);
        IF iF2 = iF;
        String[] stringArray2 = new String[6];
        stringArray2[0] = "ReachAdd";
        stringArray2[1] = "Reach";
        stringArray2[2] = "Range";
        stringArray2[3] = "Reac";
        stringArray2[4] = "ExtraReach";
        stringArray2[5] = "ReachDistance";
        iF2.f$g = new s((Number)Float.valueOf(0.5f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(3.0f), 0.1, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "HitboxAdd";
        stringArray3[1] = "HitBoxSize";
        stringArray3[2] = "HitBox";
        stringArray3[3] = "HitBoxes";
        iF.f$d = new s((Number)Float.valueOf(0.1f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(2.0f), 0.1, stringArray3);
        iF.f$E(iF.f$g, iF.f$d);
        iF.f$E(new vd(iF));
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class iF
extends RF {
    public iF() {
        iF iF2;
    }
}
