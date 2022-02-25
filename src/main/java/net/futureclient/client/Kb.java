package net.futureclient.client;

import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.Pg;
import net.futureclient.client.Qd;
import net.futureclient.client.TB;
import net.minecraft.client.Minecraft;

public class Kb
extends Ha<Ee> {
    public final TB f$d;

    public Kb(TB tB) {
        0.f$d = tB;
    }

    @Override
    public void f$E(Ee ee) {
        0.f$d.f$a(String.format("FastSwim \u00a77[\u00a7F%s\u00a77]", TB.f$E(0.f$d).f$E()));
        switch ((Qd)((Object)TB.f$E(0.f$d).f$E())) {
            case f$M: {
                Minecraft minecraft = TB.f$a();
                while (false) {
                }
                if (!minecraft.player.func_70090_H() || !Pg.f$e()) break;
                Kb kb = 0;
                TB.f$E(0.f$d, TB.f$E(kb.f$d) + 1);
                if (TB.f$E(kb.f$d) == 4) {
                    Pg.f$E(ee, (double)0.4f);
                }
                if (TB.f$E(0.f$d) < 5) break;
                Pg.f$E(ee, (double)0.3f);
                TB.f$E(0.f$d, 0);
                return;
            }
            case f$g: {
                if (TB.f$E().player.func_70090_H()) {
                    if (!TB.f$E(0.f$d)) break;
                    Pg.f$E(ee, 0.215);
                    return;
                }
                TB.f$E(0.f$d, true);
            }
        }
    }
}
package net.futureclient.client;

public enum KB {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private KB() {
        KB kB;
    }
}
package net.futureclient.client;

import net.futureclient.client.F;

public abstract class kB implements F {
    private String f$d;

    public void f$E(String string) {
        0.f$d = string;
    }

    @Override
    public String f$E() {
        kB kB2;
        return kB2.f$d;
    }

    public abstract void f$E();

    public kB(String string) {
        0.f$d = string;
    }
}
package net.futureclient.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.IA;
import net.futureclient.client.JD;
import net.futureclient.client.La;
import net.futureclient.client.NB;
import net.futureclient.client.Nb;
import net.futureclient.client.Rc;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;

public class kb
extends Ba {
    private z<Boolean> f$j;
    private File f$b;
    private String f$d;
    private int[] f$I;
    private Long f$a;
    private ArrayList<String> f$K;
    private z<Boolean> f$i;
    private Bh f$B;
    private s f$M;
    private ArrayList<String> f$e;
    private int f$C;
    private ka<Nb> f$g;

    public static z f$E(kb kb2) {
        return kb2.f$i;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    @Override
    public void f$B() {
        kb kb2;
        super.f$B();
    }

    public static String f$E(kb kb2) {
        return kb2.f$d;
    }

    public static ArrayList f$E(kb kb2, ArrayList arrayList) {
        kb2.f$e = arrayList;
        return kb2.f$e;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    private static String f$E(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.getGameProfile().getName();
    }

    public static ka f$E(kb kb2) {
        return kb2.f$g;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Long f$E(kb kb2, Long l) {
        kb2.f$a = l;
        return kb2.f$a;
    }

    public static int[] f$E(kb kb2, int[] nArray) {
        kb2.f$I = nArray;
        return nArray;
    }

    public static String f$E(kb kb2, String string) {
        kb2.f$d = string;
        return kb2.f$d;
    }

    public static int f$E(kb kb2, int n) {
        kb2.f$C = n;
        return kb2.f$C;
    }

    public static ArrayList f$E(kb kb2) {
        return kb2.f$K;
    }

    public static Long f$E(kb kb2) {
        return kb2.f$a;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static z f$a(kb kb2) {
        return kb2.f$j;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static int[] f$E(kb kb2) {
        return kb2.f$I;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static File f$E(kb kb2) {
        return kb2.f$b;
    }

    public kb() {
        kb kb2;
        String[] stringArray = new String[4];
        stringArray[0] = "Spammer";
        stringArray[1] = "Spam";
        stringArray[2] = "ChatSpam";
        stringArray[3] = "ChatSpammer";
        super("Spammer", stringArray, true, 9197478, JD.f$b);
        kb kb3 = kb2;
        kb kb4 = kb2;
        kb kb5 = kb2;
        kb4.f$B = new Bh();
        kb3.f$C = 0;
        kb4.f$K = new ArrayList();
        kb3.f$b = new File(kH.f$E().f$E() + File.separator + "spammer" + File.separator);
        String[] stringArray2 = new String[5];
        stringArray2[0] = "MinePlex";
        stringArray2[1] = "MemePlex";
        stringArray2[2] = "moonplex";
        stringArray2[3] = "plexle";
        stringArray2[4] = "mp";
        kb3.f$j = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Loop";
        stringArray3[1] = "Looping";
        stringArray3[2] = "LoopHole";
        stringArray3[3] = "Lop";
        kb2.f$i = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "Delay";
        stringArray4[1] = "Speed";
        stringArray4[2] = "Sped";
        stringArray4[3] = "Deley";
        kb2.f$M = new s((Number)Float.valueOf(1.5f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(10.0f), stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Mode";
        stringArray5[1] = "Type";
        stringArray5[2] = "Mod";
        kb2.f$g = new ka<Nb>(Nb.f$M, stringArray5);
        kb2.f$d = null;
        kb2.f$E(kb2.f$g, kb2.f$M, kb2.f$i, kb2.f$j);
        String[] stringArray6 = new String[9];
        stringArray6[0] = "SpammerFile";
        stringArray6[1] = "LoadFile";
        stringArray6[2] = "LoadSpam";
        stringArray6[3] = "File";
        stringArray6[4] = "SpammersFile";
        stringArray6[5] = "SF";
        stringArray6[6] = "Script";
        stringArray6[7] = "LoadScript";
        stringArray6[8] = "ScriptFile";
        kH.f$E().f$E().f$a(new Rc(kb2, stringArray6));
        kb2.f$E(new IA(kb2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void f$K() {
        if (kb.f$d.player == null) {
            return;
        }
        super.f$K();
        switch (NB.f$d[((Nb)0.f$g.f$E()).ordinal()]) {
            case 2: {
                if (0.f$d == null) ** GOTO lbl64
                var1_1 = new File(0.f$d);
                if (0.f$d == null || !var1_1.exists()) break;
                0.f$K.clear();
                0.f$C = 0;
                var2_5 = null;
                var2_5 = new BufferedReader(new FileReader((File)var1_1));
                while ((var1_1 = var2_5.readLine()) != null) {
                    0.f$K.add((String)var1_1);
                }
                if (var2_5 == null) ** GOTO lbl24
                try {
                    var2_5.close();
                    return;
                }
                catch (IOException var3_6) {
                    var3_6.printStackTrace();
                }
lbl24:
                // 2 sources

                return;
                catch (Exception var1_2) {
                    if (var2_5 != null) ** GOTO lbl46
                    if (var2_5 == null) ** GOTO lbl44
                    {
                        catch (Throwable var4_10) {
                            if (var2_5 == null) ** GOTO lbl37
                            try {
                                var2_5.close();
                                v0 = var4_10;
                                ** GOTO lbl38
                            }
                            catch (IOException var1_4) {
                                var1_4.printStackTrace();
                            }
lbl37:
                            // 2 sources

                            v0 = var4_10;
lbl38:
                            // 2 sources

                            throw v0;
                        }
                    }
                    try {
                        var2_5.close();
                        return;
                    }
                    catch (IOException var3_7) {
                        var3_7.printStackTrace();
                    }
lbl44:
                    // 2 sources

                    return;
lbl46:
                    // 2 sources

                    var2_5.close();
                    if (var2_5 == null) ** GOTO lbl53
                    try {
                        var2_5.close();
                        return;
                    }
                    catch (IOException var3_8) {
                        var3_8.printStackTrace();
                    }
lbl53:
                    // 2 sources

                    return;
                    catch (IOException var3_9) {
                        var3_9.printStackTrace();
                        if (var2_5 == null) ** GOTO lbl63
                        try {
                            var2_5.close();
                            return;
                        }
                        catch (IOException var1_3) {
                            var1_3.printStackTrace();
                        }
lbl63:
                        // 2 sources

                        return;
                    }
                }
lbl64:
                // 1 sources

                La.f$E().f$E("Please specify a file path to spam from.");
                return;
            }
lbl66:
            // 2 sources

            case 1: {
                if (false) ** GOTO lbl66
                0.f$e = new ArrayList<E>();
                if (kb.f$d.getConnection() != null) {
                    0.f$e.addAll((Collection<String>)kb.f$d.getConnection().getPlayerInfoMap().stream().map((Function<NetworkPlayerInfo, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, f$E(net.minecraft.client.network.NetworkPlayerInfo ), (Lnet/minecraft/client/network/NetworkPlayerInfo;)Ljava/lang/String;)()).collect(Collectors.toList()));
                }
                0.f$I = new int[]{0};
            }
        }
    }

    public static int f$E(kb kb2) {
        return kb2.f$C;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Bh f$E(kb kb2) {
        return kb2.f$B;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static ArrayList f$a(kb kb2) {
        return kb2.f$e;
    }

    public static s f$E(kb kb2) {
        return kb2.f$M;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }
}
