package net.futureclient.client.deof.modules.world.fastPlace;

public class Xa_Listener {
}
/*
package net.futureclient.client;

import java.util.Iterator;
import java.util.List;
import net.futureclient.client.CG;
import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.ME;
import net.futureclient.client.Na;
import net.futureclient.client.Pg;
import net.futureclient.client.Y;
import net.futureclient.client.qa;
import net.minecraft.item.Item;

public class Xa
extends Ha<ME> {
    public final Na f$d;

    @Override
    public void f$E(ME mE) {
        Xa xa;
        boolean bl;
        block11: {
            bl = false;
            Iterator iterator = ((List)Na.f$E(0.f$d).f$E()).iterator();
            while (iterator.hasNext()) {
                if (Pg.f$E((Item)iterator.next()) == null) continue;
                bl = true;
                xa = 0;
                break block11;
            }
            xa = 0;
        }
        if (((Boolean)Na.f$a(xa.f$d).f$E()).booleanValue()) {
            if (Na.f$E(0.f$d).isEmpty()) {
                int n2;
                int n3 = n2 = 0;
                while (n3 < 9) {
                    if (((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$i) || ((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$M) && ((List)Na.f$E(0.f$d).f$E()).contains(Na.f$M().player.field_71069_bz.getSlot(n2 + 36).getStack().getItem()) || ((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$g) && !((List)Na.f$E(0.f$d).f$E()).contains(Na.f$C().player.field_71069_bz.getSlot(n2 + 36).getStack().getItem())) {
                        Na.f$E(0.f$d).add(n2);
                    }
                    n3 = ++n2;
                }
                Xa xa2 = 0;
                Na.f$E(xa2.f$d, Na.f$E(xa2.f$d).iterator());
            }
            if (Na.f$E(0.f$d).hasNext()) {
                Na.f$H().player.field_71071_by.currentItem = (Integer)Na.f$E(0.f$d).next();
            } else {
                Na.f$E(0.f$d).clear();
            }
        }
        if (!Na.f$h().gameSettings.keyBindUseItem.isKeyDown() || ((Boolean)Na.f$E(0.f$d).f$E()).booleanValue()) {
            Na.f$E(0.f$d).f$a();
        }
        if (((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$i) || ((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$M) && bl || ((qa)((Object)Na.f$E(0.f$d).f$E())).equals((Object)qa.f$g) && !bl) {
            if (Na.f$E(0.f$d).f$a(Na.f$a(0.f$d).f$E().floatValue() * 1000.0f) && ((Y)Na.f$A()).getRightClickDelayTimer() > Na.f$E(0.f$d).f$E().intValue()) {
                ((Y)Na.f$K()).setRightClickDelayTimer(Na.f$E(0.f$d).f$E().intValue());
            }
            if (((Boolean)Na.f$E(0.f$d).f$E()).booleanValue() && Na.f$B().objectMouseOver != null && Na.f$e().objectMouseOver.getBlockPos() != null && CG.f$E(Na.f$a().objectMouseOver.getBlockPos())) {
                ((Y)Na.f$E()).f$E(He.f$M);
            }
        }
    }

    public Xa(Na na) {
        0.f$d = na;
    }
}
 */