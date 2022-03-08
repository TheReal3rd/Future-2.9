package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.JF;
import net.futureclient.client.ka;
import net.futureclient.client.pE;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class Ig
extends Ba {
    private z<Boolean> f$j;
    private z<Boolean> f$I;
    private s f$M;
    private ka<JF> f$e;
    private transient double f$g;
    private s f$i;
    private z<Boolean> f$b;
    private Bh f$d;
    private z<Boolean> f$K;

    public static Minecraft f$C() {
        return f$d;
    }

    public static s f$E(Ig ig) {
        return ig.f$i;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static z f$B(Ig ig) {
        return ig.f$K;
    }

    public static z f$E(Ig ig) {
        return ig.f$j;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static double f$E(Ig ig) {
        return ig.f$g;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public Ig() {
        Ig ig;
        String[] stringArray = new String[4];
        stringArray[0] = "Trigger";
        stringArray[1] = "ac";
        stringArray[2] = "clicker";
        stringArray[3] = "AutoClicker";
        super("Trigger", stringArray, true, -4115980, JD.f$I);
        Ig ig2 = ig;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Check";
        stringArray2[1] = "AttackCheck";
        stringArray2[2] = "Attack";
        stringArray2[3] = "ac";
        ig2.f$e = new ka<JF>(JF.f$i, stringArray2);
        String[] stringArray3 = new String[5];
        stringArray3[0] = "InvisibleCheck";
        stringArray3[1] = "Invisibles";
        stringArray3[2] = "Invis";
        stringArray3[3] = "ic";
        stringArray3[4] = "i";
        ig.f$I = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[5];
        stringArray4[0] = "TeamCheck";
        stringArray4[1] = "Team";
        stringArray4[2] = "AttackTeammates";
        stringArray4[3] = "t";
        stringArray4[4] = "tc";
        ig.f$K = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[5];
        stringArray5[0] = "FriendCheck";
        stringArray5[1] = "Friends";
        stringArray5[2] = "AttackFriends";
        stringArray5[3] = "Betray";
        stringArray5[4] = "f";
        ig.f$b = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "WeaponCheck";
        stringArray6[1] = "Weapon";
        stringArray6[2] = "w";
        ig.f$j = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "AttackSpeed";
        stringArray7[1] = "CPS";
        stringArray7[2] = "clicks";
        stringArray7[3] = "click";
        ig.f$i = new s((Number)Float.valueOf(8.0f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(20.0f), 0.1, stringArray7);
        String[] stringArray8 = new String[3];
        stringArray8[0] = "RandomSpeed";
        stringArray8[1] = "randomsped";
        stringArray8[2] = "rspeed";
        ig.f$M = new s((Number)Float.valueOf(2.0f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(10.0f), 0.1, stringArray8);
        ig.f$g = 69.0;
        ig.f$d = new Bh();
        ig.f$E(ig.f$e, ig.f$I, ig.f$K, ig.f$b, ig.f$j, ig.f$i, ig.f$M);
        ig.f$E(new pE(ig));
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static double f$E(Ig ig, double d) {
        ig.f$g = d;
        return ig.f$g;
    }

    public static z f$e(Ig ig) {
        return ig.f$I;
    }

    public static Bh f$E(Ig ig) {
        return ig.f$d;
    }

    public static s f$a(Ig ig) {
        return ig.f$M;
    }

    public static ka f$E(Ig ig) {
        return ig.f$e;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static z f$a(Ig ig) {
        Ig ig2;
        return ig2.f$b;
    }
}
package net.futureclient.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class iG {
    public iG() {
        iG iG2;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).insert(0, stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 << 3 ^ 2;
        int cfr_ignored_0 = 3 << 3 ^ 1;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
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

    public static void f$E(File file, File file2) {
        Object object;
        ZipEntry zipEntry;
        ZipInputStream zipInputStream;
        byte[] byArray = new byte[1024];
        try {
            ZipEntry zipEntry2;
            if (!file2.exists()) {
                file2.mkdir();
            }
            zipInputStream = new ZipInputStream(new FileInputStream(file));
            zipEntry = zipEntry2 = zipInputStream.getNextEntry();
            while (zipEntry != null) {
                int n;
                object = zipEntry2.getName();
                object = new File(file2, (String)object);
                new File(((File)object).getParent()).mkdirs();
                object = new FileOutputStream((File)object);
                ZipInputStream zipInputStream2 = zipInputStream;
                while ((n = zipInputStream2.read(byArray)) > 0) {
                    zipInputStream2 = zipInputStream;
                    ((FileOutputStream)object).write(byArray, 0, n);
                }
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        {
            ((FileOutputStream)object).close();
            zipEntry = zipInputStream.getNextEntry();
            continue;
        }
        ZipInputStream zipInputStream3 = zipInputStream;
        zipInputStream3.closeEntry();
        zipInputStream3.close();
    }
}
