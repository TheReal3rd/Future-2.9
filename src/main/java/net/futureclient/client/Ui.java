package net.futureclient.client;

import net.futureclient.client.GA;
import net.futureclient.client.kH;

public class Ui
extends GA {
    @Override
    public String f$E(String[] object) {
        if (((String[])object).length >= 1) {
            int n;
            StringBuilder stringBuilder = new StringBuilder();
            int n2 = ((String[])object).length;
            int n3 = n = 0;
            while (n3 < n2) {
                String string = object[n];
                stringBuilder.append(string);
                stringBuilder.append(" ");
                n3 = ++n;
            }
            object = stringBuilder.toString().trim();
            kH.f$E().f$E((String)object);
            return String.format("Watermark has been set to %s.", object);
        }
        return null;
    }

    public Ui() {
        Ui ui;
        String[] stringArray = new String[5];
        stringArray[0] = "Watermark";
        stringArray[1] = "setwatermark";
        stringArray[2] = "clientname";
        stringArray[3] = "setname";
        stringArray[4] = "setclientname";
        super(stringArray);
    }

    @Override
    public String f$E() {
        return "&e[name]";
    }
}
