package net.futureclient.client.deof.modules.miscellaneous.songStealer;

public class SongStealer {
}
/*
package net.futureclient.client;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.Bj;
import net.futureclient.client.JD;
import net.futureclient.client.La;
import net.futureclient.client.S;
import net.futureclient.client.SC;
import net.futureclient.client.kH;
import net.futureclient.client.mA;
import net.futureclient.client.mi;
import net.futureclient.client.s;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextFormatting;

public class PA
extends Ba {
    private s f$i;
    private File f$j;
    private boolean f$g;
    private int f$d;
    private List<S> f$M;

    public static Minecraft f$e() {
        return f$d;
    }

    @Override
    public void f$K() {
        PA pA;
        PA pA2 = pA;
        pA2.f$g = false;
        pA2.f$M.clear();
        super.f$K();
    }

    public static List f$E(PA pA) {
        return pA.f$M;
    }

    public static s f$E(PA pA) {
        return pA.f$i;
    }

    public static int f$a(PA pA) {
        return pA.f$d++;
    }

    public static boolean f$E(PA pA, boolean bl) {
        pA.f$g = bl;
        return pA.f$g;
    }

    @Override
    public void f$B() {
        PA pA;
        pA.f$M.add(new mi(10));
        Object[] objectArray = new Object[1];
        objectArray[0] = new SimpleDateFormat("HH-mm-ss").format(new Date());
        String string = String.format("stolen-%s.notebot", objectArray);
        try {
            PA pA2 = pA;
            Bj.f$E(new File(pA.f$j, string), pA2.f$M.toArray(new S[pA2.f$M.size()]));
            super.f$B();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        La.f$E().f$E(String.format("Saved song %s\"%s\"%s.", TextFormatting.WHITE, string, TextFormatting.GRAY), false);
        super.f$B();
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static int f$E(PA pA, int n) {
        pA.f$d = n;
        return pA.f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public PA() {
        PA pA;
        String[] stringArray = new String[2];
        stringArray[0] = "SongStealer";
        stringArray[1] = "SongSteal";
        super("SongStealer", stringArray, true, -8069141, JD.f$b);
        PA pA2 = pA;
        pA2.f$j = new File(kH.f$E().f$E(), "songs");
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Range";
        stringArray2[1] = "Ragne";
        stringArray2[2] = "Rang";
        stringArray2[3] = "r";
        pA2.f$i = new s((Number)Float.valueOf(20.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(50.0f), 1, stringArray2);
        pA.f$M = new ArrayList<S>();
        pA.f$E(pA.f$i);
        pA.f$E(new SC(pA), new mA(pA));
    }

    public static int f$E(PA pA) {
        return pA.f$d;
    }

    public static boolean f$E(PA pA) {
        return pA.f$g;
    }
}
 */