package net.futureclient.client.deof.utils.enums;

import net.minecraft.util.text.TextFormatting;

public enum AltTypeEnum {
    NONPREMIUM("Non-Premium",TextFormatting.YELLOW),//OG f$K
    PREMIUM("Premium", TextFormatting.GREEN),//OG f$b
    PREMIUM2("Premium", TextFormatting.GREEN),//OG f$j
    GENERATED("Generated", TextFormatting.BLUE);//OG f$i

    private final TextFormatting format;
    private final String name;

    AltTypeEnum(String string, TextFormatting formatting) {
        this.name = string;
        this.format = formatting;
    }

    public String getName() {
        return this.name;
    }

    public TextFormatting getFormat() {
        return this.format;
    }
}
/*
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

private jG(String string2, TextFormatting string2) {
    jG jG2;
    jG jG3 = jG2;
    jG3.f$M = 0;
    jG3.f$g = 0;
}
}
 */