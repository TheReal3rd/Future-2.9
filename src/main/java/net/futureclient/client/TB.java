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
