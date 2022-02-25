package net.futureclient.client;

import net.futureclient.client.R;
import net.futureclient.client.ai;

public class Ih
extends ai
implements R {
    public final double f$g = 0.1;
    private double f$d;

    public Ih() {
        Ih ih;
        Ih ih2 = ih;
        ih2.f$g = 0.1;
        ih2.f$d = 0.1;
    }

    public Ih(double d) {
        0.f$g = 0.1;
        if (d > 0.25) {
            d = 0.25;
        }
        0.f$d = d;
    }

    @Override
    public double f$E(String string3, String string2) {
        Ih ih = 0;
        double d = super.f$E(string3, string2);
        int string3 = ih.f$E(string3, string2);
        return d + 0.f$d * (double)string3 * (1.0 - d);
    }

    private int f$E(String string3, String string2) {
        int n;
        int string3;
        block5: {
            String string4;
            String string5;
            if (string3.length() > string2.length()) {
                string5 = string3.toLowerCase();
                string4 = string2.toLowerCase();
            } else {
                string5 = string2.toLowerCase();
                string4 = string3.toLowerCase();
            }
            string3 = 0;
            int n2 = string2 = 0;
            while (n2 < string4.length()) {
                if (string4.charAt(string2) != string5.charAt(string2)) {
                    n = string3;
                    break block5;
                }
                ++string3;
                n2 = ++string2;
            }
            n = string3;
        }
        if (n > 4) {
            return 4;
        }
        return string3;
    }
}
package net.futureclient.client;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import net.futureclient.client.De;
import net.futureclient.client.Ha;
import net.futureclient.client.OF;
import net.futureclient.client.RF;
import net.futureclient.client.Vd;
import net.futureclient.client.W;
import net.minecraft.client.Minecraft;

public final class IH  implements W {
    private final Minecraft f$d;
    private final Map<Class<?>, List<Ha<RF>>> f$g;

    @Override
    public void f$E(RF rF) {
        IH iH;
        List<Ha<RF>> list = iH.f$g.get(rF.getClass());
        if (list != null) {
            for (Ha ha : list) {
                if (ha.f$E() != rF.getClass() || !(rF instanceof OF) && !(rF instanceof Vd) && !(rF instanceof De) && (iH.f$d.player == null || iH.f$d.world == null)) continue;
                ha.f$E(rF);
            }
        }
    }

    @Override
    public void f$E(Ha ha) {
        Class clazz = ha.f$E();
        List<Ha<RF>> list = 0.f$g.get(clazz);
        if (list != null) {
            list.removeIf(ha2 -> ha2.equals(ha));
            if (list.isEmpty()) {
                0.f$g.remove(clazz);
            }
        }
    }

    @Override
    public void f$a(Ha ha) {
        if (ha != null) {
            Class clazz = ha.f$E();
            List<Ha<RF>> list = 0.f$g.get(clazz);
            if (list == null) {
                list = new CopyOnWriteArrayList<Ha<RF>>();
                0.f$g.put(clazz, list);
            }
            if (!list.contains(ha)) {
                list.add(ha);
            }
        }
    }

    public IH() {
        IH iH;
        IH iH2 = iH;
        iH.f$g = new ConcurrentHashMap();
        iH2.f$d = Minecraft.getMinecraft();
    }

    @Override
    public void f$E() {
        IH iH;
        iH.f$g.clear();
    }
}
package net.futureclient.client;

import net.futureclient.client.Bh;
import net.futureclient.client.GA;
import net.futureclient.client.Wi;
import net.futureclient.client.gH;
import net.futureclient.client.kH;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityEnderEye;

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
