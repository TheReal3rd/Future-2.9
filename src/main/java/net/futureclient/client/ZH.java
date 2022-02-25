package net.futureclient.client;

import java.util.List;
import net.futureclient.client.OI;
import net.minecraft.world.DimensionType;

public class ZH {
    private String f$i;
    private int f$j;
    private OI f$M;
    private List<OI> f$g;
    private DimensionType f$d;

    public int f$E() {
        ZH zH;
        return zH.f$j;
    }

    public DimensionType f$E() {
        ZH zH;
        return zH.f$d;
    }

    public List<OI> f$E() {
        ZH zH;
        return zH.f$g;
    }

    public void f$E(List<OI> list) {
        0.f$g = list;
    }

    public void f$E(String string) {
        0.f$i = string;
    }

    public void f$E(OI oI) {
        0.f$M = oI;
    }

    public String f$E() {
        ZH zH;
        return zH.f$i;
    }

    public void f$E(int n) {
        0.f$j = n;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 2;
        int cfr_ignored_0 = 4 << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 4 << 3 ^ 2;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public OI f$E() {
        ZH zH;
        return zH.f$M;
    }

    public ZH(int n, String string, DimensionType dimensionType, OI oI, List<OI> list) {
        ZH zH = 0;
        ZH zH2 = 0;
        0.f$j = n;
        zH2.f$i = string;
        zH2.f$d = dimensionType;
        zH.f$M = oI;
        zH.f$g = list;
    }

    public void f$E(DimensionType dimensionType) {
        0.f$d = dimensionType;
    }
}
