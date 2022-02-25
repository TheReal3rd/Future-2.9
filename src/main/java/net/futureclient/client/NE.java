package net.futureclient.client;

import java.util.Comparator;
import net.futureclient.client.B;
import net.futureclient.client.Ha;
import net.futureclient.client.Pf;
import net.futureclient.client.Pg;
import net.futureclient.client.Se;
import net.futureclient.client.TH;
import net.futureclient.client.hF;
import net.futureclient.client.iE;
import net.futureclient.client.oI;
import net.futureclient.client.s;
import net.futureclient.client.sG;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class NE
extends Ha<Pf> {
    public final hF f$d;

    public NE(hF hF2) {
        0.f$d = hF2;
    }

    @Override
    public void f$E(Pf pf) {
        if (((B)hF.f$U().player).getActiveItemStack().getItem() instanceof ItemFood) {
            return;
        }
        switch (pf.f$E()) {
            case f$M: {
                String string;
                while (false) {
                }
                hF.f$E(this.f$d, hF.f$J().world.field_72996_f.stream().filter(EntityEnderCrystal.class::isInstance).filter(entity -> {
                    float[] fArray = TH.f$E(entity, sG.f$K);
                    float f = fArray[0];
                    float f2 = f = oI.f$E((float)fArray[1], (float)f, (float)Math.max((float)hF.f$a((hF)0.f$d).f$E().floatValue(), (float)hF.f$E((hF)0.f$d).f$E().floatValue())).typeOfHit.equals((Object)RayTraceResult.Type.MISS) ? ((s)hF.f$a(0.f$d)).f$E().floatValue() : ((s)hF.f$E(0.f$d)).f$E().floatValue();
                    return entity.getDistance((Entity)hF.f$H().player) < f;
                }).max(Comparator.comparingDouble(entity -> entity.getDistance((Entity)hF.f$C().player))).orElse(null));
                NE nE = this;
                hF.f$E(nE.f$d, hF.f$a(nE.f$d));
                NE nE2 = this;
                hF.f$E(nE2.f$d, (iE)(hF.f$E(nE2.f$d) == -1 && (!((Se)((Object)hF.f$E(this.f$d).f$E())).equals((Object)Se.f$i) || hF.f$d().player.field_71071_by.currentItem == hF.f$E(this.f$d)) || (Boolean)hF.f$e(this.f$d).f$E() == false ? null : this.f$d));
                Object[] objectArray = new Object[1];
                if (hF.f$E(this.f$d) != null || hF.f$E(this.f$d) != null) {
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = hF.f$E(this.f$d) != null ? "Attack" : "Place";
                    string = String.format(" \u00a77[\u00a7F%s\u00a77]", objectArray2);
                } else {
                    string = "";
                }
                objectArray[0] = string;
                this.f$d.f$a(String.format("AutoCrystal%s", objectArray));
                if (!((Boolean)hF.f$a(this.f$d).f$E()).booleanValue()) {
                    return;
                }
                NE nE3 = this;
                if (hF.f$E(this.f$d) != null) {
                    float[] fArray = TH.f$E((Entity)hF.f$E(nE3.f$d), sG.f$K);
                    Pf pf2 = pf;
                    pf2.f$a(hF.f$a(this.f$d, fArray[0]));
                    pf2.f$E(hF.f$E(this.f$d, fArray[1]));
                    return;
                }
                if (hF.f$E(nE3.f$d) == null) break;
                float[] fArray = TH.f$E((double)iE.f$E((iE)hF.f$E(this.f$d)).func_177958_n() + 0.5, (double)iE.f$E((iE)hF.f$E(this.f$d)).func_177956_o() + 1.0, (double)iE.f$E((iE)hF.f$E(this.f$d)).func_177952_p() + 0.5);
                Pf pf3 = pf;
                pf3.f$a(hF.f$a(this.f$d, fArray[0]));
                pf3.f$E(hF.f$E(this.f$d, fArray[1]));
                return;
            }
            case f$g: {
                RayTraceResult rayTraceResult;
                if (hF.f$E(this.f$d) != null) {
                    int n;
                    if (!hF.f$a(this.f$d).f$E(hF.f$a(this.f$d)) && hF.f$A(this.f$d).f$E().doubleValue() != 20.0) break;
                    if (((Boolean)hF.f$E(this.f$d).f$E()).booleanValue() && hF.f$l().player.func_70644_a(MobEffects.WEAKNESS) && (n = Pg.f$E()) != -1 && hF.f$k().player.field_71071_by.currentItem != n) {
                        hF.f$b().player.field_71071_by.currentItem = n;
                        hF.f$F().player.connection.sendPacket((Packet)new CPacketHeldItemChange(hF.f$b().player.field_71071_by.currentItem));
                    }
                    hF.f$G().player.swingArm(EnumHand.MAIN_HAND);
                    hF.f$g().playerController.attackEntity((EntityPlayer)hF.f$D().player, (Entity)hF.f$E(this.f$d));
                    NE nE = this;
                    hF.f$a(nE.f$d, Math.max(hF.f$A(nE.f$d).f$E().doubleValue() + (Math.random() * hF.f$K(this.f$d).f$E().doubleValue() * 2.0 - hF.f$K(this.f$d).f$E().doubleValue()), 0.5));
                    NE nE4 = this;
                    hF.f$a(nE4.f$d).f$a();
                    hF.f$E(nE4.f$d, null);
                    return;
                }
                if (hF.f$E(this.f$d) == null || !hF.f$E(this.f$d).f$E(hF.f$E(this.f$d)) && hF.f$B(this.f$d).f$E().doubleValue() != 20.0) break;
                RayTraceResult rayTraceResult2 = rayTraceResult = (Boolean)hF.f$a(this.f$d).f$E() != false ? oI.f$E(hF.f$a(this.f$d), hF.f$E(this.f$d), ((s)hF.f$e(this.f$d)).f$E().floatValue()) : new RayTraceResult(new Vec3d(0.5, 1.0, 0.5), EnumFacing.UP);
                boolean bl = hF.f$m().player.field_71071_by.currentItem != hF.f$E(this.f$d);
                int n = hF.f$f().player.field_71071_by.currentItem;
                if (bl) {
                    hF.f$L().player.field_71071_by.currentItem = hF.f$E(this.f$d);
                    hF.f$i().player.connection.sendPacket((Packet)new CPacketHeldItemChange(hF.f$L().player.field_71071_by.currentItem));
                }
                hF.f$c().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(iE.f$E((iE)hF.f$E(this.f$d)), rayTraceResult.sideHit, EnumHand.MAIN_HAND, (float)rayTraceResult.hitVec.x, (float)rayTraceResult.hitVec.y, (float)rayTraceResult.hitVec.z));
                hF.f$I().player.connection.sendPacket((Packet)new CPacketAnimation(EnumHand.MAIN_HAND));
                if (bl && ((Se)((Object)hF.f$E(this.f$d).f$E())).equals((Object)Se.f$g)) {
                    hF.f$j().player.field_71071_by.currentItem = n;
                    hF.f$M().player.connection.sendPacket((Packet)new CPacketHeldItemChange(hF.f$j().player.field_71071_by.currentItem));
                }
                NE nE = this;
                hF.f$E(nE.f$d, Math.max(hF.f$B(nE.f$d).f$E().doubleValue() + (Math.random() * hF.f$K(this.f$d).f$E().doubleValue() * 2.0 - hF.f$K(this.f$d).f$E().doubleValue()), 0.5));
                hF.f$E(this.f$d).f$a();
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public abstract class Ne
extends RF {
    public Ne() {
        Ne ne;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class ne
extends RF {
    public ne() {
        ne ne2;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public final class nE
extends RF {
    public nE() {
        nE nE2;
    }
}
