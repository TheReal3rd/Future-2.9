package net.futureclient.client;

import net.futureclient.client.BG;
import net.futureclient.client.GA;
import net.futureclient.client.RA;

public class Vc
extends GA {
    public final RA f$d;

    @Override
    public String f$E() {
        return "&e[key]";
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 1) {
            String string = stringArray[0];
            if (!string.startsWith("trnsl") || string.length() < 27) {
                return "Invalid Yandex Translate API key. Generate one at https://translate.yandex.com/developers/keys";
            }
            BG.f$a(string);
            return String.format("Yandex Translate API key has been set to &e%s&7.", string);
        }
        return null;
    }

    public Vc(RA rA, String[] stringArray) {
        0.f$d = rA;
        super(stringArray);
    }
}
