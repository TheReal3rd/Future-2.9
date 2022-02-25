package net.futureclient.client;

public enum Oa {
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Oa() {
        Oa oa;
    }
}
package net.futureclient.client;

import java.util.List;
import net.futureclient.client.Gb;
import net.futureclient.client.Ha;
import net.futureclient.client.OI;
import net.futureclient.client.hg;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class OA
extends Ha<hg> {
    public final Gb f$d;

    @Override
    public void f$E(hg hg2) {
        OI oI;
        if (0.f$d.f$g.size() >= 100000) {
            0.f$d.f$g.clear();
        }
        Block block = hg2.f$E().getBlock();
        if (((List)Gb.f$E(0.f$d).f$E()).contains(block) && !0.f$d.f$g.contains(oI = new OI(hg2.f$E().func_177958_n(), hg2.f$E().func_177956_o(), hg2.f$E().func_177952_p())) && Gb.f$f().player.func_70011_f(oI.f$e(), oI.f$a(), oI.f$E()) <= 256.0 && block != Blocks.AIR) {
            0.f$d.f$g.add(oI);
        }
    }

    public OA(Gb gb) {
        0.f$d = gb;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.lB;
import net.minecraft.init.Blocks;

public class oA
extends Ha<ME> {
    public final lB f$d;

    @Override
    public void f$E(ME mE) {
        Blocks.ICE.slipperiness = 0.4f;
        Blocks.PACKED_ICE.slipperiness = 0.4f;
        Blocks.FROSTED_ICE.slipperiness = 0.4f;
    }

    public oA(lB lB2) {
        0.f$d = lB2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;

public class oa {
    private Ba f$d;

    public oa(Ba ba) {
        0.f$d = ba;
    }

    public static String f$E(String string) {
        int n;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[1];
        String string2 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n2 = string.length();
        int n3 = n2 - 1;
        char[] cArray = new char[n2];
        int n4 = 2 ^ 5;
        int n5 = 2 << 3 ^ 5;
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

    public Ba f$E() {
        oa oa2;
        return oa2.f$d;
    }
}
