
package net.futureclient.client;

import java.io.File;
import net.futureclient.client.GA;
import net.futureclient.client.kb;

public class Rc
extends GA {
    public final kb f$d;

    public Rc(kb kb2, String[] stringArray) {
        0.f$d = kb2;
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length >= 1) {
            int n;
            StringBuilder stringBuilder = new StringBuilder();
            Object object = stringArray;
            int n2 = stringArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                String string = object[n];
                stringBuilder.append(string);
                stringBuilder.append(" ");
                n3 = ++n;
            }
            object = stringBuilder.toString().trim();
            File file = new File(kb.f$E(0.f$d), new StringBuilder().insert(0, (String)object).append(((String)object).endsWith(".txt") ? "" : ".txt").toString());
            if (file.exists()) {
                Rc rc = 0;
                rc.f$d.f$E(false);
                kb.f$E(rc.f$d, file.getPath());
                0.f$d.f$E(true);
                return new StringBuilder().insert(0, "The spammer file ").append((String)object).append(" was loaded successfully.").toString();
            }
            return new StringBuilder().insert(0, "File ").append((String)object).append(".txt does not exist.").toString();
        }
        return null;
    }

    @Override
    public String f$E() {
        return "&e[name]";
    }
}
