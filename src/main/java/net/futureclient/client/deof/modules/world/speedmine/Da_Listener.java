package net.futureclient.client.deof.modules.world.speedmine;

public class Da_Listener {
}
/*
package net.futureclient.client;

import net.futureclient.client.CG;
import net.futureclient.client.EE;
import net.futureclient.client.Ha;
import net.futureclient.client.M;
import net.futureclient.client.Pg;
import net.futureclient.client.ea;
import net.futureclient.client.s;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.world.World;

public class Da
extends Ha<EE> {
    public final ea f$d;

    public Da(ea ea2) {
        0.f$d = ea2;
    }

    @Override
    public void f$E(EE eE) {
        if (!ea.f$a(0.f$d).f$E(100L)) {
            return;
        }
        if (CG.f$E(1.0).getBlock().equals(eE.f$E()) && ((Boolean)ea.f$a(0.f$d).f$E()).booleanValue() && ea.f$j().player.field_70122_E) {
            ea.f$M().player.field_70181_x -= 1.0;
        }
        IBlockState iBlockState = ea.f$C().world.func_180495_p(eE.f$E());
        if (((s)ea.f$a(0.f$d)).f$E().floatValue() > 0.0f && iBlockState.func_185904_a() != Material.AIR) {
            EE eE2 = eE;
            eE2.f$E(eE2.f$E() + iBlockState.func_185903_a((EntityPlayer)ea.f$H().player, (World)ea.f$h().world, eE.f$E()) * ((s)ea.f$a(0.f$d)).f$E().floatValue());
            if (ea.f$E(0.f$d).f$a(((s)ea.f$E(0.f$d)).f$E().floatValue() * 1000.0f)) {
                eE.f$E(0);
            }
        }
        if (((Boolean)ea.f$E(0.f$d).f$E()).booleanValue()) {
            int n = Pg.f$a(iBlockState);
            if (n == -1) {
                return;
            }
            if (n < 9) {
                ea.f$A().player.field_71071_by.currentItem = n;
                ((M)ea.f$K().playerController).invokeSyncCurrentPlayItem();
                return;
            }
            ea.f$a().playerController.windowClick(0, n, ea.f$B().player.field_71071_by.currentItem, ClickType.SWAP, (EntityPlayer)ea.f$e().player);
        }
    }
}
 */