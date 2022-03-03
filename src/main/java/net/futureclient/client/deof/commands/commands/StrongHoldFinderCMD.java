package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class StrongHoldFinderCMD extends CommandBase {//TODO work on this.
    private EntityEnderEye f$e;
    private boolean f$i;
    private Wi f$K;
    private EntityEnderEye f$j;
    private Wi f$g;
    private Wi f$d;
    private Wi f$M;
    private Wi f$b;
    private Bh f$C;
    private boolean f$I;

    public static Minecraft f$e(ih ih2) {
        return ih2.f$d;
    }

    public static Wi f$E(ih ih2, Wi wi, Wi wi2, Wi wi3, Wi wi4) {
        return ih2.f$E(wi, wi2, wi3, wi4);
    }

    public static Wi f$E(ih ih2) {
        return ih2.f$d;
    }

    private void f$E() {
        ih ih2;
        ih ih3 = ih2;
        ih ih4 = ih2;
        ih ih5 = ih2;
        ih2.f$e = null;
        ih5.f$I = false;
        ih5.f$K = null;
        ih4.f$b = null;
        ih4.f$j = null;
        ih3.f$i = false;
        ih3.f$M = null;
        ih2.f$g = null;
        ih2.f$d = null;
        ih2.f$C.f$a();
    }

    public static boolean f$a(ih ih2, boolean bl) {
        ih2.f$I = bl;
        return ih2.f$I;
    }

    public static Wi f$a(ih ih2) {
        return ih2.f$M;
    }

    public static Wi f$K(ih ih2) {
        return ih2.f$b;
    }

    public static EntityEnderEye f$a(ih ih2) {
        return ih2.f$e;
    }

    public static Minecraft f$E(ih ih2) {
        return ih2.f$d;
    }

    public ih() {
        ih ih2;
        String[] stringArray = new String[4];
        stringArray[0] = "FindStronghold";
        stringArray[1] = "Stronghold";
        stringArray[2] = "StrongholdFinder";
        stringArray[3] = "fs";
        super(stringArray);
        ih ih3 = ih2;
        ih ih4 = ih2;
        ih4.f$C = new Bh();
        ih3.f$I = false;
        ih3.f$i = false;
    }

    public static Wi f$e(ih ih2) {
        return ih2.f$g;
    }

    public static Minecraft f$a(ih ih2) {
        return ih2.f$d;
    }

    @Override
    public String f$E() {
        return null;
    }

    public static void f$E(ih ih2) {
        ih2.f$E();
    }

    public static EntityEnderEye f$E(ih ih2) {
        return ih2.f$j;
    }

    public static Wi f$B(ih ih2) {
        return ih2.f$K;
    }

    public static Wi f$K(ih ih2, Wi wi) {
        ih2.f$b = wi;
        return ih2.f$b;
    }

    public static EntityEnderEye f$a(ih ih2, EntityEnderEye entityEnderEye) {
        ih2.f$e = entityEnderEye;
        return ih2.f$e;
    }

    public static Wi f$a(ih ih2, Wi wi) {
        ih2.f$M = wi;
        return ih2.f$M;
    }

    public static boolean f$E(ih ih2) {
        return ih2.f$i;
    }

    private Wi f$E(Wi wi, Wi wi2, Wi wi3, Wi wi4) {
        double d;
        double d2;
        double d3 = (wi2.f$g - wi.f$g) / (wi2.f$M - wi.f$M);
        double d4 = (wi4.f$g - wi3.f$g) / (wi4.f$M - wi3.f$M);
        double d5 = wi.f$g + d3 * (0.0 - wi.f$M);
        double d6 = wi3.f$g + d4 * (0.0 - wi3.f$M);
        if (d3 == Double.POSITIVE_INFINITY || d3 == Double.NEGATIVE_INFINITY) {
            d2 = wi.f$M;
            d = d3;
        } else if (d4 == Double.POSITIVE_INFINITY || d4 == Double.NEGATIVE_INFINITY) {
            d2 = wi3.f$M;
            d = d3;
        } else {
            d2 = (d6 - d5) / (d3 - d4);
            d = d3;
        }
        d3 = d * d2 + d5;
        if (!Double.isFinite(d2) || !Double.isFinite(d3)) {
            return null;
        }
        return new Wi(0, d2, d3, null);
    }

    public static boolean f$a(ih ih2) {
        return ih2.f$I;
    }

    public static Wi f$B(ih ih2, Wi wi) {
        ih2.f$K = wi;
        return ih2.f$K;
    }

    public static EntityEnderEye f$E(ih ih2, EntityEnderEye entityEnderEye) {
        ih2.f$j = entityEnderEye;
        return ih2.f$j;
    }

    public static Bh f$E(ih ih2) {
        return ih2.f$C;
    }

    public static Wi f$e(ih ih2, Wi wi) {
        ih2.f$g = wi;
        return ih2.f$g;
    }

    public static boolean f$E(ih ih2, boolean bl) {
        ih2.f$i = bl;
        return ih2.f$i;
    }

    public static Wi f$E(ih ih2, Wi wi) {
        ih2.f$d = wi;
        return ih2.f$d;
    }

    @Override
    public String f$E(String[] stringArray) {
        0.f$E();
        kH.f$E().f$E().f$a(new gH(0));
        return "Throw an Eye of Ender to begin searching for a stronghold.";
    }
}
/*
public class ih
extends GA {
    private EntityEnderEye f$e;
    private boolean f$i;
    private Wi f$K;
    private EntityEnderEye f$j;
    private Wi f$g;
    private Wi f$d;
    private Wi f$M;
    private Wi f$b;
    private Bh f$C;
    private boolean f$I;

    public static Minecraft f$e(ih ih2) {
        return ih2.f$d;
    }

    public static Wi f$E(ih ih2, Wi wi, Wi wi2, Wi wi3, Wi wi4) {
        return ih2.f$E(wi, wi2, wi3, wi4);
    }

    public static Wi f$E(ih ih2) {
        return ih2.f$d;
    }

    private void f$E() {
        ih ih2;
        ih ih3 = ih2;
        ih ih4 = ih2;
        ih ih5 = ih2;
        ih2.f$e = null;
        ih5.f$I = false;
        ih5.f$K = null;
        ih4.f$b = null;
        ih4.f$j = null;
        ih3.f$i = false;
        ih3.f$M = null;
        ih2.f$g = null;
        ih2.f$d = null;
        ih2.f$C.f$a();
    }

    public static boolean f$a(ih ih2, boolean bl) {
        ih2.f$I = bl;
        return ih2.f$I;
    }

    public static Wi f$a(ih ih2) {
        return ih2.f$M;
    }

    public static Wi f$K(ih ih2) {
        return ih2.f$b;
    }

    public static EntityEnderEye f$a(ih ih2) {
        return ih2.f$e;
    }

    public static Minecraft f$E(ih ih2) {
        return ih2.f$d;
    }

    public ih() {
        ih ih2;
        String[] stringArray = new String[4];
        stringArray[0] = "FindStronghold";
        stringArray[1] = "Stronghold";
        stringArray[2] = "StrongholdFinder";
        stringArray[3] = "fs";
        super(stringArray);
        ih ih3 = ih2;
        ih ih4 = ih2;
        ih4.f$C = new Bh();
        ih3.f$I = false;
        ih3.f$i = false;
    }

    public static Wi f$e(ih ih2) {
        return ih2.f$g;
    }

    public static Minecraft f$a(ih ih2) {
        return ih2.f$d;
    }

    @Override
    public String f$E() {
        return null;
    }

    public static void f$E(ih ih2) {
        ih2.f$E();
    }

    public static EntityEnderEye f$E(ih ih2) {
        return ih2.f$j;
    }

    public static Wi f$B(ih ih2) {
        return ih2.f$K;
    }

    public static Wi f$K(ih ih2, Wi wi) {
        ih2.f$b = wi;
        return ih2.f$b;
    }

    public static EntityEnderEye f$a(ih ih2, EntityEnderEye entityEnderEye) {
        ih2.f$e = entityEnderEye;
        return ih2.f$e;
    }

    public static Wi f$a(ih ih2, Wi wi) {
        ih2.f$M = wi;
        return ih2.f$M;
    }

    public static boolean f$E(ih ih2) {
        return ih2.f$i;
    }

    private Wi f$E(Wi wi, Wi wi2, Wi wi3, Wi wi4) {
        double d;
        double d2;
        double d3 = (wi2.f$g - wi.f$g) / (wi2.f$M - wi.f$M);
        double d4 = (wi4.f$g - wi3.f$g) / (wi4.f$M - wi3.f$M);
        double d5 = wi.f$g + d3 * (0.0 - wi.f$M);
        double d6 = wi3.f$g + d4 * (0.0 - wi3.f$M);
        if (d3 == Double.POSITIVE_INFINITY || d3 == Double.NEGATIVE_INFINITY) {
            d2 = wi.f$M;
            d = d3;
        } else if (d4 == Double.POSITIVE_INFINITY || d4 == Double.NEGATIVE_INFINITY) {
            d2 = wi3.f$M;
            d = d3;
        } else {
            d2 = (d6 - d5) / (d3 - d4);
            d = d3;
        }
        d3 = d * d2 + d5;
        if (!Double.isFinite(d2) || !Double.isFinite(d3)) {
            return null;
        }
        return new Wi(0, d2, d3, null);
    }

    public static boolean f$a(ih ih2) {
        return ih2.f$I;
    }

    public static Wi f$B(ih ih2, Wi wi) {
        ih2.f$K = wi;
        return ih2.f$K;
    }

    public static EntityEnderEye f$E(ih ih2, EntityEnderEye entityEnderEye) {
        ih2.f$j = entityEnderEye;
        return ih2.f$j;
    }

    public static Bh f$E(ih ih2) {
        return ih2.f$C;
    }

    public static Wi f$e(ih ih2, Wi wi) {
        ih2.f$g = wi;
        return ih2.f$g;
    }

    public static boolean f$E(ih ih2, boolean bl) {
        ih2.f$i = bl;
        return ih2.f$i;
    }

    public static Wi f$E(ih ih2, Wi wi) {
        ih2.f$d = wi;
        return ih2.f$d;
    }

    @Override
    public String f$E(String[] stringArray) {
        0.f$E();
        kH.f$E().f$E().f$a(new gH(0));
        return "Throw an Eye of Ender to begin searching for a stronghold.";
    }
}
 */