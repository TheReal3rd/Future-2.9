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
