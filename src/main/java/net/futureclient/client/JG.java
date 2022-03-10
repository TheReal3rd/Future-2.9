package net.futureclient.client;

import net.futureclient.client.ki;

public final class JG {
    private static ki f$d;

    public static ki f$E() {
        return f$d;
    }

    public static void f$E(ki ki2) {
        f$d = ki2;
    }

    public JG() {
        JG jG;
    }

    static {
        f$d = ki.f$i;
    }
}
package net.futureclient.client;

public enum Jg {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Jg() {
        Jg jg;
    }
}
package net.futureclient.client;

import net.minecraft.util.text.TextFormatting;

public enum jG {
    f$K("Non-Premium", TextFormatting.YELLOW),
    f$b("Premium", TextFormatting.GREEN),
    f$j("Premium", TextFormatting.GREEN),
    f$i("Generated", TextFormatting.BLUE);

    private TextFormatting f$g;
    private String f$M;

    public String f$E() {
        jG jG2;
        return jG2.f$M;
    }

    public TextFormatting f$E() {
        jG jG2;
        return jG2.f$g;
    }

    /*
     * WARNING - void declaration
     */
    private jG(String string2, TextFormatting string2) {
        jG jG2;
        jG jG3 = jG2;
        jG3.f$M = 0;
        jG3.f$g = 0;
    }
}
