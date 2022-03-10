package net.futureclient.client.deof.modules.combat.autoLog;

public class LD_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Pg;
import net.futureclient.client.Sf;
import net.futureclient.client.Ze;
import net.futureclient.client.kH;
import net.futureclient.client.yE;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

public class LD
extends Ha<ME> {
    public final Sf f$d;

    public LD(Sf sf) {
        0.f$d = sf;
    }

    @Override
    public void f$E(ME mE) {
        Ba ba;
        0.f$d.f$a(String.format("AutoLog \u00a77[\u00a7F%s\u00a77]", Sf.f$E(0.f$d).f$E()));
        if (!Sf.f$i().player.func_70089_S()) {
            return;
        }
        if (((Boolean)Sf.f$a(0.f$d).f$E()).booleanValue()) {
            ba = (Ze)kH.f$E().f$E().f$E(Ze.class);
            EntityPlayer entityPlayer = Sf.f$c().world.field_73010_i.stream().filter(arg_0 -> LD.f$E((Ze)ba, arg_0)).findFirst().orElse(null);
            if (entityPlayer != null) {
                Sf.f$E(0.f$d, new StringBuilder().insert(0, "[AutoLog] ").append(entityPlayer.getName()).append(" came into render distance.").toString());
                return;
            }
        }
        if ((ba = (yE)kH.f$E().f$E().f$E(yE.class)) != null && Sf.f$C().world.func_175668_a(new BlockPos(Sf.f$I().player.field_70142_S, Sf.f$j().player.field_70137_T, Sf.f$M().player.field_70136_U), false) && Sf.f$K().world.func_175668_a(new BlockPos(Sf.f$H().player.field_70165_t, Sf.f$h().player.field_70163_u, Sf.f$A().player.field_70161_v), false)) {
            int n = ((yE)ba).f$a();
            if (((Boolean)Sf.f$E(0.f$d).f$E()).booleanValue() && n <= 0) {
                Sf.f$E(0.f$d, new StringBuilder().insert(0, "[AutoLog] Logged out with ").append(n).append(" totems and ").append(Sf.f$B().player.func_110143_aJ()).append(" hearts remaining.").toString());
                return;
            }
            if (ba.f$E() && n > 0) {
                return;
            }
        }
        if (Sf.f$e().player.func_110143_aJ() <= Sf.f$E(0.f$d).f$E().floatValue()) {
            Sf.f$E(0.f$d, new StringBuilder().insert(0, "[AutoLog] Logged out with ").append(Sf.f$a().player.func_110143_aJ()).append(" hearts remaining.").toString());
        }
    }

    private static boolean f$E(Ze ze, EntityPlayer entityPlayer) {
        return !(entityPlayer instanceof EntityPlayerSP) && !entityPlayer.getName().equals(Sf.f$E().player.func_70005_c_()) && Pg.f$E((Entity)entityPlayer) && (ze.f$h.f$E() == false || !kH.f$E().f$E().f$E(entityPlayer.getName()));
    }
}
 */