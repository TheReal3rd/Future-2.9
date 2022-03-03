package net.futureclient.client.deof.modules.combat.smoothAim;

public class zE_SmoothAim_Listener {
}
/*
package net.futureclient.client;

import java.util.stream.Collectors;
import net.futureclient.client.Af;
import net.futureclient.client.Ha;
import net.futureclient.client.Pg;
import net.futureclient.client.TH;
import net.futureclient.client.be;
import net.futureclient.client.kH;
import net.futureclient.client.s;
import net.futureclient.client.tD;
import net.futureclient.client.yd;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.input.Mouse;

public class zE
extends Ha<Af> {
    public final be f$d;

    @Override
    public void f$E(Af af) {
        boolean bl = false;
        switch ((yd)((Object)be.f$a(0.f$d).f$E())) {
            case f$i: {
                Minecraft minecraft = be.f$C();
                while (false) {
                }
                bl = minecraft.player.field_82175_bq;
                break;
            }
            case f$M: {
                bl = Mouse.isButtonDown((int)0);
                break;
            }
            case f$g: {
                bl = true;
            }
        }
        if (be.f$H().currentScreen == null && (!((Boolean)be.f$A(0.f$d).f$E()).booleanValue() || Pg.f$E()) && bl) {
            float f;
            Object object;
            EntityPlayer entityPlayer2 = null;
            float f2 = Float.MAX_VALUE;
            Object object2 = object = Pg.f$E().stream().filter(entityPlayer -> !(entityPlayer instanceof EntityPlayerSP || !((double)be.f$e().player.func_70032_d((Entity)entityPlayer) <= be.f$E(0.f$d).f$E().doubleValue()) || (Boolean)be.f$B(0.f$d).f$E() != false && be.f$a().player.func_184191_r((Entity)entityPlayer) || (Boolean)be.f$e(0.f$d).f$E() != false && entityPlayer.func_82150_aj() || (Boolean)be.f$a(0.f$d).f$E() != false && !be.f$E().player.func_70685_l((Entity)entityPlayer) || (Boolean)be.f$E(0.f$d).f$E() != false && kH.f$E().f$E().f$E(entityPlayer.getName()))).collect(Collectors.toList()).iterator();
            while (object2.hasNext()) {
                float f3;
                EntityPlayer entityPlayer3 = (EntityPlayer)object.next();
                f = TH.f$a(TH.f$a(be.f$h().player.field_70177_z), TH.f$a(TH.f$a((Entity)entityPlayer3)[0]));
                if (f3 < f2) {
                    entityPlayer2 = entityPlayer3;
                }
                f2 = Math.min(f, f2);
                object2 = object;
            }
            if (entityPlayer2 != null && (double)f2 <= ((s)be.f$B(0.f$d)).f$E().doubleValue() && (double)f2 >= be.f$e(0.f$d).f$E().doubleValue()) {
                zE zE2;
                float f4;
                object = TH.f$a((Entity)entityPlayer2);
                zE zE3 = 0;
                float f5 = (float)Math.min(be.f$a(0.f$d).f$E().doubleValue() * (double)be.f$E(zE3.f$d).f$E() / 10.0, be.f$a(0.f$d).f$E().doubleValue() / 2.0);
                if (((Boolean)be.f$K(zE3.f$d).f$E()).booleanValue()) {
                    f5 = (float)((double)f5 * ((double)f2 / ((s)be.f$B(0.f$d)).f$E().doubleValue()));
                }
                f = TH.f$a(TH.f$E(TH.f$a(be.f$A().player.field_70177_z), (float)object[0], f5));
                float f6 = TH.f$a(TH.f$E(TH.f$a(be.f$K().player.field_70125_A), (float)object[1], f5));
                if (be.f$E(0.f$d).f$E() != tD.f$i && be.f$E(0.f$d).f$E() != tD.f$g) {
                    f4 = 0.0f;
                    zE2 = 0;
                } else {
                    f4 = f;
                    zE2 = 0;
                }
                be.f$B().player.func_70082_c(f4, be.f$E(zE2.f$d).f$E() != tD.f$M && be.f$E(0.f$d).f$E() != tD.f$g ? 0.0f : -f6 * 0.75f);
            }
        }
        be.f$E(0.f$d).f$a();
    }

    public zE(be be2) {
        0.f$d = be2;
    }
}

 */