package net.futureclient.client;

import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public final class wG {
    public static float f$E(float f, float f2, float f3) {
        if (f > f2) {
            f = f2;
        }
        if (f < f3) {
            f = f3;
        }
        return f;
    }

    public static double f$E(BlockPos blockPos) {
        return wG.f$e(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p());
    }

    public static double f$E(double d) {
        double d2;
        d %= 360.0;
        if (d2 >= 180.0) {
            d -= 360.0;
        }
        if (d < -180.0) {
            d += 360.0;
        }
        return d;
    }

    private wG() {
        wG wG2;
    }

    public static double f$E(Vec3d vec3d, Vec3d vec3d2) {
        Vec3d vec3d3 = vec3d;
        double d = vec3d3.x - vec3d2.x;
        double d2 = vec3d3.y - vec3d2.y;
        double d3 = vec3d3.z - vec3d2.z;
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        return wG.f$E(d4 * d4 + d5 * d5 + d6 * d6);
    }

    public static float f$E(float f) {
        return (float)Math.sqrt(f);
    }

    public static int f$E(double d) {
        int n = (int)d;
        if (d < (double)n) {
            return n - 1;
        }
        return n;
    }

    public static double f$a(double d, double d2, double d3) {
        double d4 = d;
        return d4 + (d2 - d4) * d3;
    }

    public static float f$E(double d) {
        return (float)Math.sqrt(d);
    }

    public static double f$E(double d, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static double f$e(double d, double d2, double d3) {
        double d4 = Minecraft.getMinecraft().getRenderManager().viewerPosX - d;
        d2 = Minecraft.getMinecraft().getRenderManager().viewerPosY - d2;
        d3 = Minecraft.getMinecraft().getRenderManager().viewerPosZ - d3;
        double d5 = d4;
        double d6 = d2;
        double d7 = d3;
        return wG.f$E(d5 * d5 + d6 * d6 + d7 * d7);
    }

    public static double f$E(EntityPlayer entityPlayer, double d) {
        return wG.f$e(wG.f$a(entityPlayer.field_70169_q, entityPlayer.field_70165_t, d), wG.f$a(entityPlayer.field_70167_r, entityPlayer.field_70163_u, d), wG.f$a(entityPlayer.field_70166_s, entityPlayer.field_70161_v, d));
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 5 << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 4 << 4 ^ 3 << 1;
        int n5 = 3 << 3 ^ (3 ^ 5);
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

    private double f$E(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float f$E(float f, float f2) {
        float f3 = f2;
        return wG.f$E(f, f3, -f3);
    }

    public static float f$a(float f) {
        float f2;
        f %= 360.0f;
        if (f2 >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }
}
package net.futureclient.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import net.futureclient.client.Ib;
import net.futureclient.client.xI;

public class wg
extends Ib {
    public final xI f$d;

    public wg(xI xI2, String string) {
        0.f$d = xI2;
        super(string);
    }

    @Override
    public void f$E(Object ... objectArray) {
        block4: {
            if (0.f$E().exists()) break block4;
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(0.f$E()));
            String string = bufferedReader.readLine();
            if (string != null) {
                xI.f$E(0.f$d, string);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void f$a(Object ... objectArray) {
        block4: {
            try {
                if (!xI.f$E(0.f$d).isEmpty()) break block4;
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return;
            }
        }
        if (!0.f$E().exists()) {
            0.f$E().createNewFile();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(0.f$E()));
        bufferedWriter.write(xI.f$E(0.f$d));
        bufferedWriter.close();
    }
}
