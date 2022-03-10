package net.futureclient.client.deof.modules.combat.trigger;

import net.futureclient.client.*;

public class pE_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Af;
import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.Ig;
import net.futureclient.client.JF;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.kH;
import net.futureclient.client.vE;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.input.Mouse;

public class pE
extends Ha<Af> {
    public final Ig f$d;

@Override
public void f$E(Af af) {
    boolean bl;
    if (Ig.f$M().currentScreen != null) return;
    if (Ig.f$C().playerController == null) {
        return;
    }
    boolean bl2 = false;
    switch (vE.f$d[((JF)((Object)Ig.f$E(0.f$d).f$E())).ordinal()]) {
        case 1: {
            bl = bl2 = Mouse.isButtonDown((int)0);
            break;
        }
        case 2: {
            if (Ig.f$H().objectMouseOver == null) return;
            if (!(Ig.f$h().objectMouseOver.entityHit instanceof EntityLivingBase)) return;
            if (((Boolean)Ig.f$B(0.f$d).f$E()).booleanValue()) {
                if (Ig.f$K().player.func_184191_r(Ig.f$A().objectMouseOver.entityHit)) return;
                if (((Boolean)Ig.f$e(0.f$d).f$E()).booleanValue()) {
                    if (Ig.f$B().objectMouseOver.entityHit.isInvisible()) return;
                }
                if (((Boolean)Ig.f$a(0.f$d).f$E()).booleanValue()) {
                    if (kH.f$E().f$E().f$E(Ig.f$e().objectMouseOver.entityHit.getName())) return;
                }
            }
            boolean bl3 = true;
            bl = bl2 = bl3;
            break;
        }
        case 3: {
            bl2 = true;
        }
        default: {
            bl = bl2;
        }
    }
    if (!bl) return;
    if (((Boolean)Ig.f$E(0.f$d).f$E()).booleanValue()) {
        if (!Pg.f$E()) return;
    }
    if (!Ig.f$E(0.f$d).f$E(Ig.f$E(0.f$d))) return;
    ((Y)Ig.f$a()).setLeftClickCounter(0);
    ((Y)Ig.f$E()).f$E(He.f$i);
    double d = Math.random() * Ig.f$a(0.f$d).f$E().doubleValue() * 2.0 - Ig.f$a(0.f$d).f$E().doubleValue();
    pE pE2 = 0;
    Ig.f$E(pE2.f$d, Math.max(Ig.f$E(pE2.f$d).f$E().doubleValue() + d, 0.5));
    Ig.f$E(0.f$d).f$a();
}

    public pE(Ig ig) {
        0.f$d = ig;
    }
}

 */