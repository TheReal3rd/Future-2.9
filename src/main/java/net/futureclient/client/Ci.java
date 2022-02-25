package net.futureclient.client;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.Deflater;
import net.futureclient.client.LI;
import net.futureclient.client.WH;

public class Ci
extends DataOutputStream {
    private LI f$d;

    public Ci(OutputStream outputStream, String string) {
        super(outputStream);
        Ci ci = 0;
        ci.f$d = new LI(string);
    }

    public Ci(OutputStream outputStream) {
        super(outputStream);
    }

    public void f$E(WH object3, boolean bl) throws Exception {
        Object object2 = ByteStreams.newDataOutput();
        ByteArrayDataOutput byteArrayDataOutput = object2;
        byteArrayDataOutput.writeInt(((WH)object3).f$E());
        ((WH)object3).f$E(byteArrayDataOutput);
        Object object3 = ByteStreams.newDataOutput();
        object2 = byteArrayDataOutput.toByteArray();
        object2 = 0.f$E((byte[])object2);
        if (bl) {
            if (0.f$d == null) {
                throw new Exception("Crypto is null!");
            }
            Ci ci = 0;
            byte[] byArray = ci.f$d.f$a((byte[])object2);
            object2 = byArray;
            object2 = ci.f$E(byArray);
        }
        object3.writeInt(((Object)object2).length + 1);
        Object object4 = object3;
        object4.writeBoolean(bl);
        object4.write((byte[])object2);
        0.write(object4.toByteArray());
    }

    public void f$E(WH wH) throws Exception {
        0.f$E(wH, false);
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 3;
        int cfr_ignored_0 = 5 << 4 ^ (2 << 2 ^ 1);
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 1;
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

    public void f$a(WH wH) throws Exception {
        0.f$E(wH, true);
    }

    public byte[] f$E(byte[] object) throws IOException {
        Deflater deflater = new Deflater();
        deflater.setInput((byte[])object);
        object = new ByteArrayOutputStream(((byte[])object).length);
        Deflater deflater2 = deflater;
        Deflater deflater3 = deflater2;
        deflater2.finish();
        byte[] byArray = new byte[1024];
        while (!deflater3.finished()) {
            deflater3 = deflater;
            int n = deflater.deflate(byArray);
            ((ByteArrayOutputStream)object).write(byArray, 0, n);
        }
        Object object2 = object;
        ((ByteArrayOutputStream)object2).close();
        byte[] byArray2 = ((ByteArrayOutputStream)object2).toByteArray();
        return byArray2;
    }
}
package net.futureclient.client;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.process.IBaritoneProcess;
import net.futureclient.client.Bi;
import net.futureclient.client.La;
import net.futureclient.client.Mh;
import net.futureclient.client.ej;
import net.futureclient.client.kH;
import net.futureclient.client.uh;
import net.futureclient.client.zg;
import net.minecraft.util.text.ITextComponent;

public class CI
implements Runnable {
    public final Bi f$d;

    @Override
    public void run() {
        CI cI;
        BaritoneAPI.getProvider().getPrimaryBaritone().getPathingControlManager().registerProcess((IBaritoneProcess)uh.f$M);
        Settings settings = BaritoneAPI.getSettings();
        BaritoneAPI.getSettings().chatControl.value = false;
        BaritoneAPI.getSettings().logger.value = iTextComponent -> La.f$E().f$E((ITextComponent)iTextComponent, false);
        kH.f$E().f$E().f$a(new zg());
        kH.f$E().f$E().f$a(new ej());
        String[] stringArray = new String[1];
        stringArray[0] = "Baritone";
        kH.f$E().f$E().f$E(new Mh(cI, "Baritone", stringArray, settings));
    }

    public CI(Bi bi) {
        0.f$d = bi;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ah;
import net.futureclient.client.Ha;
import net.futureclient.client.Kg;

public class ci
extends Ha<Kg> {
    public final Ah f$d;

    @Override
    public void f$E(Kg kg) {
        if (Ah.f$E(0.f$d) || !Ah.f$E(0.f$d).f$E(1000L)) {
            if (Ah.f$E(0.f$d)) {
                Ah.f$E(0.f$d).f$a();
            }
            Kg kg2 = kg;
            ci ci2 = 0;
            Kg kg3 = kg;
            ci ci3 = 0;
            kg.f$a(Ah.f$A(0.f$d));
            kg.f$E(Ah.f$K(ci3.f$d));
            kg3.f$A(Ah.f$B(ci3.f$d));
            kg3.f$K(Ah.f$e(0.f$d));
            kg2.f$B(Ah.f$a(ci2.f$d));
            kg2.f$e(Ah.f$E(ci2.f$d));
        }
    }

    public ci(Ah ah) {
        0.f$d = ah;
    }
}
