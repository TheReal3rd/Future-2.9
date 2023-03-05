package net.futureclient.client.deof.modules.render.freecam;

import net.futureclient.client.deof.event.Listener;
import net.futureclient.client.deof.event.events.MoveEvent;
import net.futureclient.client.deof.utils.game.EntityUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.util.math.MathHelper;

public class Rb_Listener extends Listener<MoveEvent> {
    private final Minecraft mc;
    public final FreeCam f$d;

    public Rb_Listener(FreeCam rA2) {
        f$d = rA2;
        mc = Minecraft.getMinecraft();
    }

    @Override
    public void invoke(MoveEvent ee) {
        if (mc.currentScreen instanceof GuiGameOver) {
            f$d.setEnabled(false);
            return;
        }
        FreeCam.getMovementInput().updatePlayerMoveState();
        f$d.getCamera().setHealth(mc.player.getHealth());
        f$d.getCamera().setAbsorptionAmount(mc.player.getAbsorptionAmount());
        f$d.getCamera().setPrimaryHand(mc.player.getPrimaryHand());
        f$d.getCamera().prevPosX = f$d.getCamera().lastTickPosX = f$d.getCamera().posX;
        f$d.getCamera().prevPosY = f$d.getCamera().lastTickPosY = f$d.getCamera().posY;
        f$d.getCamera().prevPosZ = f$d.getCamera().lastTickPosZ = f$d.getCamera().posZ;
        double[] dArray = EntityUtils.getMotion(f$d.getCamera(), FreeCam.getSpeed(f$d).getValue().doubleValue());
        f$d.getCamera().motionX = dArray[0];
        f$d.getCamera().motionY = f$d.getCamera().movementInput.jump ? FreeCam.getSpeed(f$d).getValue().doubleValue() : (f$d.getCamera().movementInput.sneak ? -FreeCam.getSpeed(f$d).getValue().doubleValue() : 0.0);
        f$d.getCamera().motionZ = dArray[1];
        f$d.getCamera().setEntityBoundingBox(f$d.getCamera().getEntityBoundingBox().offset(f$d.getCamera().motionX, f$d.getCamera().motionY, f$d.getCamera().motionZ));
        f$d.getCamera().resetPositionToBB();
        f$d.getCamera().chunkCoordX = MathHelper.floor((f$d.getCamera().posX / 16.0));
        f$d.getCamera().chunkCoordZ = MathHelper.floor((f$d.getCamera().posZ / 16.0));
        f$d.getCamera().inventory = mc.player.inventory;
        f$d.getCamera().inventoryContainer = mc.player.inventoryContainer;
        f$d.getCamera().capabilities = mc.player.capabilities;
        f$d.getCamera().hurtTime = mc.player.hurtTime;
        f$d.getCamera().maxHurtTime = mc.player.maxHurtTime;
        f$d.getCamera().attackedAtYaw = mc.player.attackedAtYaw;
        if (mc.getRenderViewEntity() != f$d.getCamera()) {
            FreeCam.setEntity(f$d, mc.getRenderViewEntity());
            mc.setRenderViewEntity(f$d.getCamera());
        }
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ee;
import net.futureclient.client.Ha;
import net.futureclient.client.Pg;
import net.futureclient.client.rA;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Rb
extends Ha<Ee> {
    public final rA f$d;

    public Rb(rA rA2) {
        0.f$d = rA2;
    }

    @Override
    public void f$E(Ee ee) {
        if (rA.f$P().currentScreen instanceof GuiGameOver) {
            0.f$d.f$E(false);
            return;
        }
        Rb rb = 0;
        rA.f$E((rA)rb.f$d).movementInput.updatePlayerMoveState();
        rA.f$E(rb.f$d).func_70606_j(rA.f$Q().player.func_110143_aJ());
        rA.f$E(rb.f$d).func_110149_m(rA.f$U().player.func_110139_bj());
        rA.f$E(rb.f$d).func_184819_a(rA.f$J().player.func_184591_cq());
        rA.f$E((rA)rb.f$d).field_70169_q = rA.f$E((rA)0.f$d).field_70142_S = rA.f$E((rA)0.f$d).field_70165_t;
        rA.f$E((rA)0.f$d).field_70167_r = rA.f$E((rA)0.f$d).field_70137_T = rA.f$E((rA)0.f$d).field_70163_u;
        rA.f$E((rA)0.f$d).field_70166_s = rA.f$E((rA)0.f$d).field_70136_U = rA.f$E((rA)0.f$d).field_70161_v;
        Rb rb2 = 0;
        double[] dArray = Pg.f$E(rA.f$E(0.f$d), rA.f$E(rb2.f$d).f$E().doubleValue());
        rA.f$E((rA)0.f$d).field_70159_w = dArray[0];
        rA.f$E((rA)0.f$d).field_70181_x = rA.f$E((rA)0.f$d).movementInput.jump ? rA.f$E(0.f$d).f$E().doubleValue() : (rA.f$E((rA)0.f$d).movementInput.sneak ? -rA.f$E(0.f$d).f$E().doubleValue() : 0.0);
        rA.f$E((rA)0.f$d).field_70179_y = dArray[1];
        rA.f$E(rb2.f$d).func_174826_a(rA.f$E(0.f$d).func_174813_aQ().offset(rA.f$E((rA)0.f$d).field_70159_w, rA.f$E((rA)0.f$d).field_70181_x, rA.f$E((rA)0.f$d).field_70179_y));
        rA.f$E(0.f$d).func_174829_m();
        rA.f$E((rA)0.f$d).field_70176_ah = MathHelper.floor((double)(rA.f$E((rA)0.f$d).field_70165_t / 16.0));
        rA.f$E((rA)0.f$d).field_70164_aj = MathHelper.floor((double)(rA.f$E((rA)0.f$d).field_70161_v / 16.0));
        rA.f$E((rA)0.f$d).field_71071_by = rA.f$d().player.field_71071_by;
        rA.f$E((rA)0.f$d).field_71069_bz = rA.f$l().player.field_71069_bz;
        rA.f$E((rA)0.f$d).field_71075_bZ = rA.f$k().player.field_71075_bZ;
        rA.f$E((rA)0.f$d).field_70737_aN = rA.f$b().player.field_70737_aN;
        rA.f$E((rA)0.f$d).field_70738_aO = rA.f$F().player.field_70738_aO;
        rA.f$E((rA)0.f$d).field_70739_aP = rA.f$G().player.field_70739_aP;
        if (rA.f$D().getRenderViewEntity() != rA.f$E(0.f$d)) {
            rA.f$E(0.f$d, rA.f$g().getRenderViewEntity());
            rA.f$m().setRenderViewEntity((Entity)rA.f$E(0.f$d));
        }
    }
}
 */