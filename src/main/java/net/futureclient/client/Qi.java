package net.futureclient.client;

import java.util.StringJoiner;
import net.futureclient.client.GA;
import net.futureclient.client.kH;

public class Qi
extends GA {
    @Override
    public String f$E(String[] object) {
        object = new StringJoiner(", ");
        kH.f$E().f$E().f$E().forEach(arg_0 -> Qi.f$E((StringJoiner)object, arg_0));
        return String.format("Commands (%s): %s.", kH.f$E().f$E().f$E().size(), ((StringJoiner)object).toString());
    }

    private static void f$E(StringJoiner stringJoiner, GA gA) {
        stringJoiner.add(gA.f$E()[0]);
    }

    @Override
    public String f$E() {
        return null;
    }

    public Qi() {
        Qi qi;
        String[] stringArray = new String[3];
        stringArray[0] = "Help";
        stringArray[1] = "Halp";
        stringArray[2] = "autist";
        super(stringArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.fh;
import net.minecraft.entity.player.EntityPlayer;

public class qI
extends Ha<Ee> {
    public final fh f$d;

    public qI(fh fh2) {
        0.f$d = fh2;
    }

    @Override
    public void f$E(Ee ee) {
    }

    private boolean f$E(EntityPlayer entityPlayer) {
        return !fh.f$E((fh)0.f$d).world.field_73010_i.contains(entityPlayer);
    }
}
