package net.futureclient.client;

import net.futureclient.client.GA;
import net.futureclient.client.va;
import net.futureclient.client.yB;

public class LC
extends GA {
    public final yB f$d;

    @Override
    public String f$E() {
        return "&e[name]";
    }

    public LC(yB yB2, String[] stringArray) {
        0.f$d = yB2;
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length == 1) {
            Object object = stringArray[0];
            if ((object = 0.f$d.f$a((String)object)) == null) {
                return "Invalid waypoint entered.";
            }
            if (yB.f$E(0.f$d, (va)object)) {
                0.f$d.f$i.remove(object);
            }
            return String.format("Removed waypoint &e%s&7.", ((va)object).f$E());
        }
        return null;
    }
}
package net.futureclient.client;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.MovementInputFromOptions;

public final class lC
extends MovementInputFromOptions {
    public lC(GameSettings gameSettings) {
        super(gameSettings);
    }
}
