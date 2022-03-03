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
