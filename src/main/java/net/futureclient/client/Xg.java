package net.futureclient.client;

import net.futureclient.client.GA;
import net.futureclient.client.eg;
import net.futureclient.client.kH;

public final class Xg
extends GA {
    public Xg() {
        Xg xg;
        String[] stringArray = new String[2];
        stringArray[0] = "Remove";
        stringArray[1] = "rem";
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 1) {
            Object object = stringArray[0];
            if (!kH.f$E().f$E().f$E((String)object)) {
                return "That user is not a friend.";
            }
            object = kH.f$E().f$E().f$E((String)object);
            String string = ((eg)object).f$a();
            kH.f$E().f$E().f$E(object);
            return String.format("Removed friend with alias %s.", string);
        }
        return null;
    }

    @Override
    public String f$E() {
        return "&e[username|alias]";
    }
}
package net.futureclient.client;

import net.futureclient.client.GA;
import net.futureclient.client.kH;

public class XG
extends GA {
    @Override
    public String f$E() {
        return null;
    }

    @Override
    public String f$E(String[] stringArray) {
        kH.f$E().f$E().f$E().forEach(ib -> ib.f$a(new Object[0]));
        return "Saved config.";
    }

    public XG() {
        XG xG;
        String[] stringArray = new String[4];
        stringArray[0] = "Save";
        stringArray[1] = "Saveall";
        stringArray[2] = "SaveConfigs";
        stringArray[3] = "Asve";
        super(stringArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;

public class xG
extends Ba {
    public xG() {
        xG xG2;
        String[] stringArray = new String[3];
        stringArray[0] = "NoSlow";
        stringArray[1] = "NoSlowDown";
        stringArray[2] = "Slowdown";
        super("NoSlow", stringArray, true, 19655218, JD.f$j);
    }

    public static void f$A() {
    }
}
