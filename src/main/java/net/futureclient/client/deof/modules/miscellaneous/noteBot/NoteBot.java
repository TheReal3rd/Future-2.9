package net.futureclient.client.deof.modules.miscellaneous.noteBot;

public class NoteBot {
}
/*
package net.futureclient.client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.futureclient.client.Ba;
import net.futureclient.client.HG;
import net.futureclient.client.HH;
import net.futureclient.client.JD;
import net.futureclient.client.La;
import net.futureclient.client.S;
import net.futureclient.client.Xb;
import net.futureclient.client.iG;
import net.futureclient.client.kH;
import net.futureclient.client.nG;
import net.futureclient.client.tB;
import net.futureclient.client.tC;
import net.futureclient.client.xh;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;

public class fB
extends Ba {
    private S[] f$M;
    private int f$j;
    private int f$b;
    private List<BlockPos> f$g;
    private File f$d;
    private String f$i;
    private Map<HG, Byte> f$I;
    private List<HH> f$K;

    public static void f$E(fB fB2) {
        fB2.f$h();
    }

    public static String f$E(fB fB2, String string) {
        fB2.f$i = string;
        return fB2.f$i;
    }

    public static S[] f$E(fB fB2, S[] sArray) {
        fB2.f$M = sArray;
        return sArray;
    }

    public fB() {
        fB fB2;
        String[] stringArray = new String[4];
        stringArray[0] = "NoteBot";
        stringArray[1] = "MusicPlayer";
        stringArray[2] = "MP3";
        stringArray[3] = "MP4";
        super("NoteBot", stringArray, true, -11149333, JD.f$b);
        fB fB3 = fB2;
        fB fB4 = fB2;
        fB3.f$I = new HashMap<HG, Byte>();
        fB4.f$K = new ArrayList<HH>();
        fB3.f$g = new ArrayList<BlockPos>();
        fB3.f$d = new File(kH.f$E().f$E(), "songs");
        String[] stringArray2 = new String[5];
        stringArray2[0] = "LoadSong";
        stringArray2[1] = "lodasong";
        stringArray2[2] = "NoteFile";
        stringArray2[3] = "Notes";
        stringArray2[4] = "setsong";
        kH.f$E().f$E().f$a(new tB(fB2, stringArray2));
        String[] stringArray3 = new String[3];
        stringArray3[0] = "DownloadSongs";
        stringArray3[1] = "DownloadSong";
        stringArray3[2] = "Downloadsonk";
        kH.f$E().f$E().f$a(new tC(fB2, stringArray3));
        fB2.f$E(new Xb(fB2));
    }

    public static File f$E(fB fB2) {
        return fB2.f$d;
    }

    public static int f$E(fB fB2) {
        return fB2.f$b++;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    private static boolean f$E(nG nG2, HH hH) {
        return hH.f$E().equals(nG2);
    }

    public static List f$E(fB fB2) {
        return fB2.f$g;
    }

    @Override
    public void f$K() {
        int n;
        fB fB2;
        super.f$K();
        if (((Minecraft)fB.f$d).world == null || ((Minecraft)fB.f$d).player == null) {
            fB2.f$E(false);
            return;
        }
        if (fB2.f$d.listFiles() == null) {
            fB2.f$h();
            return;
        }
        fB fB3 = fB2;
        fB3.f$b = 0;
        fB3.f$I.clear();
        fB3.f$K.clear();
        HG[] hGArray = HG.values();
        int n2 = hGArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            HG hG = hGArray[n];
            fB2.f$I.put(hG, (byte)0);
            n3 = ++n;
        }
        int n4 = 6;
        int n5 = n2 = -6;
        while (n5 < n4) {
            int n6 = -n4;
            while (n6 < n4) {
                int n7;
                int n8 = n7 = -1;
                while (n8 < 5) {
                    byte by;
                    BlockPos blockPos = ((Minecraft)fB.f$d).player.getPosition().add(n2, n7, n);
                    Object object = ((Minecraft)fB.f$d).world.func_180495_p(blockPos).getBlock();
                    if (blockPos.func_177957_d(fB.f$d.player.field_70165_t, fB.f$d.player.field_70163_u + (double)((Minecraft)fB.f$d).player.func_70047_e(), fB.f$d.player.field_70161_v) < 27.040000000000003 && object == Blocks.NOTEBLOCK && (by = fB2.f$I.get(object = xh.f$E(((Minecraft)fB.f$d).world.func_180495_p(blockPos.down()))).byteValue()) <= 25) {
                        fB2.f$K.add(new HH(blockPos, new nG((HG)((Object)object), by)));
                        fB2.f$I.replace((HG)((Object)object), (byte)(by + 1));
                    }
                    n8 = ++n7;
                }
                n6 = ++n;
            }
            n5 = ++n2;
        }
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static int f$a(fB fB2, int n) {
        fB2.f$b = n;
        return fB2.f$b;
    }

    public static int f$a(fB fB2) {
        return ++fB2.f$j;
    }

    public static String f$E(fB fB2) {
        return fB2.f$i;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    private void f$h() {
        fB fB2;
        new Thread(() -> {
            try {
                fB fB2;
                File file = new File(fB2.f$d, "songs.zip");
                FileChannel fileChannel = new FileOutputStream(file).getChannel();
                ReadableByteChannel readableByteChannel = Channels.newChannel(new URL("https://www.futureclient.net/future/songs.zip").openStream());
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
                File file2 = file;
                iG.f$E(file2, fB2.f$d);
                file2.deleteOnExit();
                La.f$E().f$E(String.format("Successfully downloaded songs! You now have %d songs.", fB2.f$d.listFiles().length), false);
                La.f$E().f$E(String.format("You can always type %s.downloadsongs%s to get all of the songs and %s.openfolder%s to see the songs in the Songs folder.", TextFormatting.GREEN.toString(), TextFormatting.GRAY.toString(), TextFormatting.GREEN.toString(), TextFormatting.GRAY.toString()), false);
                return;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return;
            }
        }).start();
    }

    public static S[] f$E(fB fB2) {
        return fB2.f$M;
    }

    public static int f$e(fB fB2) {
        return fB2.f$b;
    }

    public static int f$E(fB fB2, int n) {
        fB2.f$j = n;
        return fB2.f$j;
    }

    private BlockPos f$E(nG object) {
        object = 0.f$K.stream().filter(arg_0 -> fB.f$E((nG)object, arg_0)).findFirst().orElse(null);
        if (object == null) {
            return null;
        }
        return ((HH)object).f$E();
    }

    public static BlockPos f$E(fB fB2, nG nG2) {
        return fB2.f$E(nG2);
    }
}
 */