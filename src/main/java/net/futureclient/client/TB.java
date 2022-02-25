package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Db;
import net.futureclient.client.JD;
import net.futureclient.client.Kb;
import net.futureclient.client.Qd;
import net.futureclient.client.ka;
import net.minecraft.client.Minecraft;

public class TB
extends Ba {
    private int f$g;
    private ka<Qd> f$M;
    private boolean f$d;

    public static boolean f$E(TB tB, boolean bl) {
        tB.f$d = bl;
        return tB.f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static ka f$E(TB tB) {
        return tB.f$M;
    }

    public TB() {
        TB tB;
        String[] stringArray = new String[3];
        stringArray[0] = "FastSwim";
        stringArray[1] = "fastswim";
        stringArray[2] = "swim";
        super("FastSwim", stringArray, true, 52479, JD.f$j);
        TB tB2 = tB;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Mode";
        stringArray2[1] = "m";
        tB2.f$M = new ka<Qd>(Qd.f$M, stringArray2);
        tB.f$E(tB.f$M);
        tB.f$E(new Kb(tB), new Db(tB));
    }

    public static int f$E(TB tB, int n) {
        tB.f$g = n;
        return tB.f$g;
    }

    public static boolean f$E(TB tB) {
        return tB.f$d;
    }

    public static int f$E(TB tB) {
        return tB.f$g;
    }

    public static Minecraft f$E() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.VC;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class Tb
extends Ba {
    private z<Boolean> f$d;
    public s f$M;
    public s f$g;

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public Tb() {
        Tb tb;
        String[] stringArray = new String[2];
        stringArray[0] = "BoatFly";
        stringArray[1] = "HorseFly";
        super("BoatFly", stringArray, true, -4545351, JD.f$j);
        Tb tb2 = tb;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "UpSpeed";
        stringArray2[1] = "FlyUpSpeed";
        stringArray2[2] = "UpSped";
        stringArray2[3] = "Up";
        tb2.f$M = new s((Number)Float.valueOf(2.0f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(10.0f), stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "DownSpeed";
        stringArray3[1] = "DownSped";
        stringArray3[2] = "Down";
        tb.f$g = new s((Number)Float.valueOf(0.001f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "FixYaw";
        stringArray4[1] = "FixAngles";
        stringArray4[2] = "YawFix";
        stringArray4[3] = "AngleFix";
        tb.f$d = new z<Boolean>(true, stringArray4);
        tb.f$E(tb.f$d, tb.f$M, tb.f$g);
        tb.f$E(new VC(tb));
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static z f$E(Tb tb) {
        return tb.f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.J;
import net.futureclient.client.JD;
import net.futureclient.client.WB;
import net.futureclient.client.kH;
import net.futureclient.client.lb;
import net.futureclient.client.ma;
import net.futureclient.client.qC;
import net.futureclient.client.rC;

public class tb
extends qC {
    public final JD f$g;
    public final WB f$d;

    public tb(WB wB, String string, int n, int n2, boolean bl, JD jD) {
        0.f$d = wB;
        0.f$g = jD;
        super(string, n, n2, bl);
    }

    @Override
    public void f$E() {
        tb tb2;
        tb tb3 = tb2;
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            if (ma2 instanceof J && !ma2.getClass().equals(rC.class) && ((Ba)(ma2 = (Ba)ma2)).f$E().equals((Object)tb3.f$g)) {
                0.f$E(new lb((ma)ma2));
            }
        });
    }
}
package net.futureclient.client;

import java.io.File;
import net.futureclient.client.Bj;
import net.futureclient.client.GA;
import net.futureclient.client.fB;
import net.minecraft.util.text.TextFormatting;
import org.apache.commons.io.FilenameUtils;

public class tB
extends GA {
    public final fB f$d;

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length >= 1) {
            int n;
            File[] fileArray;
            int n2;
            StringBuilder stringBuilder = new StringBuilder();
            Object object = stringArray;
            int n3 = stringArray.length;
            int n4 = n2 = 0;
            while (n4 < n3) {
                fileArray = object[n2];
                stringBuilder.append((String)fileArray);
                stringBuilder.append(" ");
                n4 = ++n2;
            }
            object = stringBuilder.toString().trim();
            String string = object.replaceAll("[ _\\-']", "").toLowerCase();
            File[] fileArray2 = fB.f$E(0.f$d).listFiles();
            if (fileArray2 == null) {
                fB.f$E(0.f$d);
                return "No songs found!";
            }
            fileArray = fileArray2;
            int n5 = fileArray2.length;
            int n6 = n = 0;
            while (n6 < n5) {
                File file = fileArray[n];
                try {
                    String string2 = FilenameUtils.getBaseName(file.getAbsolutePath());
                    if (string2.replaceAll("[ _\\-']", "").toLowerCase().contains(string)) {
                        fB.f$a(0.f$d, 0);
                        fB.f$E(0.f$d, string2);
                        fB.f$E(0.f$d, Bj.f$E(file));
                        return String.format("Set song to %s\"%s\"%s.", TextFormatting.WHITE, string2, TextFormatting.GRAY);
                    }
                }
                catch (Exception exception) {
                    return exception.toString();
                }
                n6 = ++n;
            }
            return String.format("Song \"%s\" not found!", object);
        }
        return null;
    }

    @Override
    public String f$E() {
        return "&e[name]";
    }

    public tB(fB fB2, String[] stringArray) {
        0.f$d = fB2;
        super(stringArray);
    }
}
