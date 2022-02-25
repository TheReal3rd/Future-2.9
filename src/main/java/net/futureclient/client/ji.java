package net.futureclient.client;

public enum ji {
    f$Ya(""),
    f$Na("af"),
    f$ya("am"),
    f$za("ar"),
    f$ua("az"),
    f$wa("ba"),
    f$Va("be"),
    f$Qa("bg"),
    f$Za("bn"),
    f$Ra("bs"),
    f$sa("ca"),
    f$Ua("ceb"),
    f$ta("cs"),
    f$qa("cy"),
    f$pa("da"),
    f$xa("de"),
    f$Oa("el"),
    f$Pa("en"),
    f$Ma("eo"),
    f$Ca("es"),
    f$fa("et"),
    f$Ea("eu"),
    f$ga("fa"),
    f$Ga("fi"),
    f$Da("fr"),
    f$Ha("ga"),
    f$ja("gd"),
    f$Ka("gl"),
    f$aa("gu"),
    f$Aa("he"),
    f$ha("hi"),
    f$Ia("hr"),
    f$da("ht"),
    f$ca("hu"),
    f$ea("hy"),
    f$ba("id"),
    f$Fa("is"),
    f$ka("it"),
    f$ia("ja"),
    f$Ba("jv"),
    f$ma("ka"),
    f$La("kk"),
    f$la("km"),
    f$Ja("kn"),
    f$U("ko"),
    f$X("ky"),
    f$o("la"),
    f$t("lb"),
    f$n("lo"),
    f$N("lt"),
    f$R("lv"),
    f$x("mg"),
    f$Y("mhr"),
    f$P("mi"),
    f$s("mk"),
    f$S("ml"),
    f$z("mn"),
    f$Z("mr"),
    f$q("mrj"),
    f$V("ms"),
    f$p("mt"),
    f$w("my"),
    f$W("ne"),
    f$Q("nl"),
    f$O("no"),
    f$v("pa"),
    f$u("pap"),
    f$T("pl"),
    f$r("pt"),
    f$y("ro"),
    f$G("ru"),
    f$h("si"),
    f$f("sk"),
    f$k("sl"),
    f$F("sq"),
    f$J("sr"),
    f$E("su"),
    f$H("sv"),
    f$m("sw"),
    f$D("ta"),
    f$l("te"),
    f$L("tg"),
    f$c("th"),
    f$A("tl"),
    f$B("tr"),
    f$a("tt"),
    f$C("udm"),
    f$e("uk"),
    f$I("ur"),
    f$K("uz"),
    f$b("vi"),
    f$j("xh"),
    f$i("yi"),
    f$M("zh");

    private final String f$g;

    public static ji f$E(String string) {
        int n;
        ji[] jiArray = ji.values();
        int n2 = jiArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            ji ji2 = jiArray[n];
            if (ji2.toString().equals(string)) {
                return ji2;
            }
            n3 = ++n;
        }
        return null;
    }

    public String toString() {
        ji ji2;
        return ji2.f$g;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ji(String string) {
        ji ji2;
        ji2.f$g = 0;
    }
}
package net.futureclient.client;

import java.util.Comparator;
import net.futureclient.client.tg;

public class jI
implements Comparator<tg> {
    public jI() {
        jI jI2;
    }

    public int f$E(tg tg2, tg tg3) {
        double d;
        double d2 = tg2.f$E();
        if (d2 == (d = tg3.f$E())) {
            return 0;
        }
        if (d2 < d) {
            return 1;
        }
        return -1;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 4 << 4 ^ 5;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 5;
        int n5 = 1 << 3;
        int n6 = n = string2.length() - 1;
        int n7 = n3;
        String string3 = string2;
        while (n7 >= 0) {
            int n8 = n3--;
            cArray[n8] = (char)(n5 ^ (string.charAt(n8) ^ string3.charAt(n)));
            if (n3 < 0) break;
            int n9 = n3--;
            char c = cArray[n9] = (char)(n4 ^ (string.charAt(n9) ^ string3.charAt(n)));
            if (--n < 0) {
                n = n6;
            }
            n7 = n3;
        }
        return new String(cArray);
    }
}
