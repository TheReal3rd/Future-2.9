package net.futureclient.client;

public enum Mg {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Mg() {
        Mg mg;
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import net.futureclient.client.QD;
import net.futureclient.client.QE;
import net.futureclient.client.eg;
import net.minecraft.util.text.TextFormatting;

public class mg extends QE<eg> {
    @Override
    public boolean f$E(String string) {
        for (eg eg2 : 0.f$d) {
            if (!string.equalsIgnoreCase(eg2.f$E()) && !string.equalsIgnoreCase(eg2.f$a())) continue;
            return true;
        }
        return false;
    }

    @Override
    public eg f$E(String string) {
        for (eg eg2 : 0.f$E()) {
            if (!string.equalsIgnoreCase(eg2.f$E()) && !string.equalsIgnoreCase(eg2.f$a())) continue;
            return eg2;
        }
        return null;
    }

    public String f$a(String string) {
        TextFormatting textFormatting = TextFormatting.AQUA;
        for (eg eg2 : 0.f$d) {
            if (!string.contains(eg2.f$E())) continue;
            string = string.replace(eg2.f$E(), String.format("%s%s\u00a7r", textFormatting, eg2.f$a()));
        }
        return string;
    }

    public mg() {
        mg mg2;
        mg mg3 = mg2;
        mg3.f$d = new ArrayList();
        new QD(mg2, "friends.json");
    }
}
