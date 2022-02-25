package net.futureclient.client;

import com.google.gson.Gson;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.futureclient.client.sh;

public final class VH {
    private static final String f$i = "https://sessionserver.mojang.com/session/minecraft/profile/";
    private static final Map<UUID, String> f$M;
    private static final Gson f$g;
    private static final Map<UUID, String> f$d;

    public VH() {
        VH vH;
    }

    static {
        f$M = new ConcurrentHashMap<UUID, String>();
        f$g = new Gson();
        f$d = new ConcurrentHashMap<UUID, String>();
    }

    public static String f$e(UUID uUID2) {
        UUID uUID3 = uUID2;
        return f$M.getOrDefault(uUID3, f$d.computeIfAbsent(uUID3, uUID -> {
            sh.f$E(() -> {
                VH.f$M.computeIfAbsent(uUID, 0 -> {
                    /*
                     * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                     * 
                     * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 0[TRYBLOCK]
                     *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
                     *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
                     *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
                     *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:845)
                     *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                     *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                     *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                     *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                     *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1037)
                     *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:929)
                     *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
                     *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:75)
                     *     at me.coley.recaf.decompile.cfr.CfrDecompiler.decompile(CfrDecompiler.java:71)
                     *     at dev.fxe.recaf4forge.utils.Exporter.exportSrc(Exporter.java:80)
                     *     at dev.fxe.recaf4forge.utils.Exporter.lambda$exportMDK$0(Exporter.java:43)
                     *     at java.util.concurrent.CompletableFuture$AsyncRun.run(CompletableFuture.java:1640)
                     *     at java.util.concurrent.CompletableFuture$AsyncRun.exec(CompletableFuture.java:1632)
                     *     at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
                     *     at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1067)
                     *     at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1703)
                     *     at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:172)
                     */
                    throw new IllegalStateException("Decompilation failed");
                });
                f$d.remove(uUID);
            });
            return uUID.toString();
        }));
    }
}
package net.futureclient.client;

import java.awt.AWTException;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import net.futureclient.client.Ba;
import net.futureclient.client.DC;
import net.futureclient.client.La;
import net.futureclient.client.kH;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Level;

public class Vh {
    public TrayIcon f$g;
    public SystemTray f$d;

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getClassName()).insert(0, stackTraceElement.getMethodName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 3 << 3 ^ (2 ^ 5);
        int n5 = 2 << 3;
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

    public Vh() {
        BufferedImage bufferedImage;
        Vh vh;
        if (!SystemTray.isSupported()) {
            DC dC = (DC)kH.f$E().f$E().f$E(DC.class);
            dC.f$E(false);
            La.f$E().f$E(Level.WARN, "Your computer does not support system tray icons.");
            La.f$E().f$E("Your computer does not support system tray icons.");
            return;
        }
        ResourceLocation resourceLocation = new ResourceLocation("textures/future/icon.png");
        Object object = resourceLocation;
        object = resourceLocation.getResourceDomain();
        Object object2 = resourceLocation.getResourcePath();
        object = Vh.class.getResourceAsStream(new StringBuilder().insert(0, "/assets/").append((String)object).append("/").append((String)object2).toString());
        BufferedImage bufferedImage2 = null;
        try {
            bufferedImage = bufferedImage2 = ImageIO.read((InputStream)object);
        }
        catch (IOException iOException) {
            bufferedImage = bufferedImage2;
            iOException.printStackTrace();
        }
        if (bufferedImage == null) {
            object = (DC)kH.f$E().f$E().f$E(DC.class);
            ((Ba)object).f$E(false);
            La.f$E().f$E(Level.WARN, String.format("Failed to open %s", object2));
            La.f$E().f$E(String.format("Failed to open %s", object2));
            return;
        }
        vh.f$g = new TrayIcon(bufferedImage2, "Future");
        object = new PopupMenu();
        vh.f$d = SystemTray.getSystemTray();
        vh.f$g.setToolTip(new StringBuilder().insert(0, kH.f$m).append(" v").append(kH.f$D).append(" notifications").toString());
        Object object3 = object2 = new MenuItem("Disable Notifications");
        ((Menu)object).add((MenuItem)object3);
        ((MenuItem)object3).addActionListener(actionEvent -> {
            ((DC)kH.f$E().f$E().f$E(DC.class)).f$E(false);
            Vh vh = 0;
            vh.f$d.remove(vh.f$g);
        });
        vh.f$g.setPopupMenu((PopupMenu)object);
        try {
            Vh vh2 = vh;
            vh2.f$d.add(vh2.f$g);
            return;
        }
        catch (AWTException aWTException) {
            aWTException.printStackTrace();
            return;
        }
    }
}
package net.futureclient.client;

import java.awt.Color;

public class vH {
    private float f$d;
    private Color f$M;
    private float[] f$g;

    public vH(float[] fArray, float f) {
        vH vH2 = 0;
        0.f$g = fArray;
        vH2.f$d = f;
        vH2.f$M = vH.f$E(fArray[0], fArray[1], fArray[2], f);
    }

    public static float[] f$E(Color color) {
        float f;
        float[] fArray = color.getRGBColorComponents(null);
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        float f5 = Math.min(f2, Math.min(f3, f4));
        float f6 = Math.max(f2, Math.max(f3, f4));
        float f7 = 0.0f;
        if (f6 == f5) {
            f7 = 0.0f;
            f = f6;
        } else if (f6 == f2) {
            f7 = (60.0f * (f3 - f4) / (f6 - f5) + 360.0f) % 360.0f;
            f = f6;
        } else if (f6 == f3) {
            f7 = 60.0f * (f4 - f2) / (f6 - f5) + 120.0f;
            f = f6;
        } else {
            if (f6 == f4) {
                f7 = 60.0f * (f2 - f3) / (f6 - f5) + 240.0f;
            }
            f = f6;
        }
        f2 = (f + f5) / 2.0f;
        f3 = 0.0f;
        if (f6 == f5) {
            f3 = 0.0f;
        } else {
            float f8 = f6;
            f3 = f2 <= 0.5f ? (f8 - f5) / (f6 + f5) : (f8 - f5) / (2.0f - f6 - f5);
        }
        return new float[]{f7, f3 * 100.0f, f2 * 100.0f};
    }

    public Color f$B(float f) {
        return vH.f$E(0.f$g[0], 0.f$g[1], f, 0.f$d);
    }

    public float[] f$E() {
        vH vH2;
        return vH2.f$g;
    }

    public static String f$E(String string) {
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 4 << 3 ^ 5;
        int n4 = n2;
        int n5 = 4 << 3;
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

    public String toString() {
        vH vH2;
        return new StringBuilder().insert(0, "HSLColor[h=").append(vH2.f$g[0]).append(",s=").append(vH2.f$g[1]).append(",l=").append(vH2.f$g[2]).append(",alpha=").append(vH2.f$d).append("]").toString();
    }

    public static Color f$E(float[] fArray) {
        return vH.f$E(fArray[0], fArray[1], fArray[2], 1.0f);
    }

    public Color f$e(float f) {
        return vH.f$E(0.f$g[0], f, 0.f$g[2], 0.f$d);
    }

    public float f$e() {
        vH vH2;
        return vH2.f$g[0];
    }

    public Color f$a() {
        vH vH2;
        return vH.f$E((vH2.f$g[0] + 180.0f) % 360.0f, vH2.f$g[1], vH2.f$g[2], 1.0f);
    }

    public vH(float f, float f2, float f3, float f4) {
        vH vH2 = 0;
        0.f$g = new float[]{f, f2, f3};
        vH2.f$d = f4;
        vH2.f$M = vH.f$E(0.f$g[0], 0.f$g[1], 0.f$g[2], f4);
    }

    public vH(Color color) {
        vH vH2 = 0;
        0.f$M = color;
        vH2.f$g = vH.f$E(0.f$M);
        vH2.f$d = (float)color.getAlpha() / 255.0f;
    }

    public float f$E() {
        vH vH2;
        return vH2.f$g[1];
    }

    public Color f$K(float f) {
        return vH.f$E(f, 0.f$g[1], 0.f$g[2], 0.f$d);
    }

    private static float f$E(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        if (6.0f * f3 < 1.0f) {
            float f4 = f;
            return f4 + (f2 - f4) * 6.0f * f3;
        }
        if (2.0f * f3 < 1.0f) {
            return f2;
        }
        if (3.0f * f3 < 2.0f) {
            float f5 = f;
            return f5 + (f2 - f5) * 6.0f * (0.6666667f - f3);
        }
        return f;
    }

    public float f$a() {
        vH vH2;
        return vH2.f$g[2];
    }

    public vH(float[] fArray) {
        0(fArray, 1.0f);
    }

    public vH(float f, float f2, float f3) {
        0(f, f2, f3, 1.0f);
    }

    public static Color f$E(float f, float f2, float f3, float f4) {
        if (f2 < 0.0f || f2 > 100.0f) {
            String string = "Color parameter outside of expected range - Saturation";
            throw new IllegalArgumentException(string);
        }
        if (f3 < 0.0f || f3 > 100.0f) {
            String string = "Color parameter outside of expected range - Lightness";
            throw new IllegalArgumentException(string);
        }
        if (f4 < 0.0f || f4 > 1.0f) {
            String string = "Color parameter outside of expected range - Alpha";
            throw new IllegalArgumentException(string);
        }
        f %= 360.0f;
        float f5 = 0.0f;
        f5 = (double)f3 < 0.5 ? f3 * (1.0f + f2) : (f3 /= 100.0f) + (f2 /= 100.0f) - f2 * f3;
        f2 = 2.0f * f3 - f5;
        f3 = Math.max(0.0f, vH.f$E(f2, f5, (f /= 360.0f) + 0.33333334f));
        float f6 = Math.max(0.0f, vH.f$E(f2, f5, f));
        f2 = Math.max(0.0f, vH.f$E(f2, f5, f - 0.33333334f));
        f3 = Math.min(f3, 1.0f);
        f6 = Math.min(f6, 1.0f);
        f2 = Math.min(f2, 1.0f);
        return new Color(f3, f6, f2, f4);
    }

    public Color f$a(float f) {
        f = (100.0f - f) / 100.0f;
        f = Math.max(0.0f, 0.f$g[2] * f);
        return vH.f$E(0.f$g[0], 0.f$g[1], f, 0.f$d);
    }

    public Color f$E(float f) {
        f = (100.0f + f) / 100.0f;
        f = Math.min(100.0f, 0.f$g[2] * f);
        return vH.f$E(0.f$g[0], 0.f$g[1], f, 0.f$d);
    }

    public float f$B() {
        vH vH2;
        return vH2.f$d;
    }

    public Color f$E() {
        vH vH2;
        return vH2.f$M;
    }
}
