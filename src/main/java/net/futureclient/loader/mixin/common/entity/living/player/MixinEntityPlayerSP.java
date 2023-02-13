package net.futureclient.loader.mixin.common.entity.living.player;

import net.futureclient.client.BB;
import net.futureclient.client.DA;
import net.futureclient.client.Fg;
import net.futureclient.client.KD;
import net.futureclient.client.Pf;
import net.futureclient.client.bg;
import net.futureclient.client.dF;
import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.event.events.UpdateWalkingEvent;
import net.futureclient.client.deof.utils.enums.PrePostEnum;
import net.futureclient.client.f;
import net.futureclient.client.iD;
import net.futureclient.client.kF;
import net.futureclient.client.kH;
import net.futureclient.client.lG;
import net.futureclient.client.mc;
import net.futureclient.client.rA;
import net.futureclient.client.ze;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.math.AxisAlignedBB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Mixin(value={EntityPlayerSP.class})
public abstract class MixinEntityPlayerSP extends MixinAbstractClientPlayer implements f {
    @Shadow
    public Minecraft field_71159_c;
    private KD f$g;
    private UpdateWalkingEvent updateWalkingEvent;

    public MixinEntityPlayerSP() {
        MixinEntityPlayerSP mixinEntityPlayerSP;
    }

    @Override
    @Accessor
    public abstract boolean isPrevOnGround();

    @Shadow
    public abstract void func_71053_j();

    @Shadow
    public abstract void func_175161_p();

    @Override
    @Accessor
    public abstract void setHorseJumpPower(float var1);

    @Inject(method={"onUpdate"}, at={@At(value="FIELD", target="net/minecraft/client/entity/EntityPlayerSP.connection:Lnet/minecraft/client/network/NetHandlerPlayClient;", ordinal=0, shift=At.Shift.BEFORE)})
    private void f$K(CallbackInfo callbackInfo) {
        0.f$g = new KD(Fg.f$M, 0.rotationYaw, 0.rotationPitch, 0.onGround);
        kH.f$E().f$E().f$E(0.f$g);
    }

    @Redirect(method={"onUpdate"}, at=@At(value="FIELD", target="net/minecraft/client/entity/EntityPlayerSP.rotationYaw:F"))
    private float f$B(EntityPlayerSP entityPlayerSP) {
        return 0.f$g.f$B();
    }

    @Redirect(method={"onUpdate"}, at=@At(value="FIELD", target="net/minecraft/client/entity/EntityPlayerSP.rotationPitch:F"))
    private float f$e(EntityPlayerSP entityPlayerSP) {
        return 0.f$g.f$e();
    }

    @Redirect(method={"onUpdate"}, at=@At(value="FIELD", target="net/minecraft/client/entity/EntityPlayerSP.onGround:Z"))
    private boolean f$e(EntityPlayerSP entityPlayerSP) {
        return 0.f$g.f$a();
    }

    @Inject(method={"onUpdate"}, at={@At(value="INVOKE", target="net/minecraft/client/network/NetHandlerPlayClient.sendPacket(Lnet/minecraft/network/Packet;)V", ordinal=0, shift=At.Shift.AFTER)})
    private void f$B(CallbackInfo callbackInfo) {
        kH.f$E().f$E().f$E(new KD(Fg.f$g, 0.f$g.f$B(), 0.f$g.f$e(), 0.f$g.f$a()));
    }

    @Inject(method={"onUpdate"}, at={@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.onUpdateWalkingPlayer()V", ordinal=0, shift=At.Shift.AFTER)})
    private void f$e(CallbackInfo callbackInfo) {
        ze ze2 = new ze();
        kH.f$E().f$E().f$E(ze2);
        for (int i = 0; i < ze2.f$E() - 1; ++i) {
            EntityPlayerSP entityPlayerSP = (EntityPlayerSP)0;
            int 02 = field_184617_aD;
            int 03 = field_184628_bn;
            int 04 = entityPlayerSP.field_70737_aN;
            float 05 = entityPlayerSP.field_70732_aI;
            float 06 = entityPlayerSP.field_70733_aJ;
            int 07 = entityPlayerSP.field_110158_av;
            boolean 08 = entityPlayerSP.field_82175_bq;
            float 09 = entityPlayerSP.rotationYaw;
            float 010 = entityPlayerSP.field_70126_B;
            float 011 = entityPlayerSP.field_70761_aq;
            float 012 = entityPlayerSP.field_70760_ar;
            float 013 = entityPlayerSP.field_70759_as;
            float 014 = entityPlayerSP.field_70758_at;
            float 015 = entityPlayerSP.field_71109_bG;
            float 016 = entityPlayerSP.field_71107_bF;
            float 017 = entityPlayerSP.renderArmYaw;
            float 018 = entityPlayerSP.prevRenderArmYaw;
            float 019 = entityPlayerSP.renderArmPitch;
            float 020 = entityPlayerSP.prevRenderArmPitch;
            float 021 = entityPlayerSP.field_70140_Q;
            float 022 = entityPlayerSP.field_70141_P;
            double 023 = entityPlayerSP.field_71094_bP;
            double 024 = entityPlayerSP.field_71091_bM;
            double 025 = entityPlayerSP.field_71095_bQ;
            double 026 = entityPlayerSP.field_71096_bN;
            double 027 = entityPlayerSP.field_71085_bR;
            double 028 = entityPlayerSP.field_71097_bO;
            float 029 = entityPlayerSP.field_70721_aZ;
            float 030 = entityPlayerSP.field_184618_aE;
            float 031 = entityPlayerSP.field_184619_aG;
            super.func_70071_h_();
            0.field_184617_aD = 02;
            0.field_184628_bn = 03;
            entityPlayerSP.field_70737_aN = 04;
            entityPlayerSP.field_70732_aI = 05;
            entityPlayerSP.field_70733_aJ = 06;
            entityPlayerSP.field_110158_av = 07;
            entityPlayerSP.field_82175_bq = 08;
            entityPlayerSP.rotationYaw = 09;
            entityPlayerSP.field_70126_B = 010;
            entityPlayerSP.field_70761_aq = 011;
            entityPlayerSP.field_70760_ar = 012;
            entityPlayerSP.field_70759_as = 013;
            entityPlayerSP.field_70758_at = 014;
            entityPlayerSP.field_71109_bG = 015;
            entityPlayerSP.field_71107_bF = 016;
            entityPlayerSP.renderArmYaw = 017;
            entityPlayerSP.prevRenderArmYaw = 018;
            entityPlayerSP.renderArmPitch = 019;
            entityPlayerSP.prevRenderArmPitch = 020;
            entityPlayerSP.field_70140_Q = 021;
            entityPlayerSP.field_70141_P = 022;
            entityPlayerSP.field_71094_bP = 023;
            entityPlayerSP.field_71091_bM = 024;
            entityPlayerSP.field_71095_bQ = 025;
            entityPlayerSP.field_71096_bN = 026;
            entityPlayerSP.field_71085_bR = 027;
            entityPlayerSP.field_71097_bO = 028;
            entityPlayerSP.field_70721_aZ = 029;
            entityPlayerSP.field_184618_aE = 030;
            entityPlayerSP.field_184619_aG = 031;
            func_175161_p();
        }
    }

    @Inject(method={"onUpdateWalkingPlayer"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$a(CallbackInfo callbackInfo) {
        updateWalkingEvent = new UpdateWalkingEvent(PrePostEnum.PRE, this.rotationYaw, this.rotationPitch, this.posX, this.getEntityBoundingBox().minY, this.posZ, this.onGround);
        FutureClient.getINSTANCE().getEventManager().invoke(updateWalkingEvent);
        if (updateWalkingEvent.isCancelled()) {
            callbackInfo.cancel();
        }
        /*
                f$d = new Pf(kF.f$M, this.rotationYaw, this.rotationPitch, this.posX, this.getEntityBoundingBox().minY, this.posZ, this.onGround);
        kH.f$E().f$E().f$E(0.f$d);
        if (f$d.f$E()) {
            callbackInfo.cancel();
        }
         */
    }

    @Inject(method={"onUpdateWalkingPlayer"}, at={@At(value="RETURN")})
    private void f$E(CallbackInfo callbackInfo) {
        FutureClient.getINSTANCE().getEventManager().invoke(new UpdateWalkingEvent(PrePostEnum.POST, updateWalkingEvent.getYaw1(), updateWalkingEvent.getPitch1(), updateWalkingEvent.getX1(), updateWalkingEvent.getY1(), updateWalkingEvent.getZ1(), updateWalkingEvent.isOnGround()));
        //FutureClient.getINSTANCE().getEventManager().invoke(new Pf(kF.f$g, f$d.f$B(), f$d.f$e(), f$d.f$K(), f$d.f$e(), f$d.f$E(), f$d.f$a()));
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="net/minecraft/client/entity/EntityPlayerSP.posX:D"))
    private double f$a(EntityPlayerSP entityPlayerSP) {
        return 0.f$d.f$K();
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="net/minecraft/util/math/AxisAlignedBB.minY:D"))
    private double f$E(AxisAlignedBB axisAlignedBB) {
        return 0.f$d.f$e();
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="net/minecraft/client/entity/EntityPlayerSP.posZ:D"))
    private double f$E(EntityPlayerSP entityPlayerSP) {
        return 0.f$d.f$E();
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="net/minecraft/client/entity/EntityPlayerSP.rotationYaw:F"))
    private float f$a(EntityPlayerSP entityPlayerSP) {
        return 0.f$d.f$B();
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="net/minecraft/client/entity/EntityPlayerSP.rotationPitch:F"))
    private float f$E(EntityPlayerSP entityPlayerSP) {
        return 0.f$d.f$e();
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="net/minecraft/client/entity/EntityPlayerSP.onGround:Z"))
    private boolean f$a(EntityPlayerSP entityPlayerSP) {
        return 0.f$d.f$a();
    }

    @ModifyVariable(method={"setSprinting"}, at=@At(value="HEAD"))
    private boolean f$E(boolean bl) {
        bg bg2 = new bg(bl);
        kH.f$E().f$E().f$E(bg2);
        return bg2.f$a();
    }

    @Inject(method={"sendChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(String string, CallbackInfo callbackInfo) {
        dF dF2 = new dF(string);
        kH.f$E().f$E().f$E(dF2);
        if (dF2.f$E()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"pushOutOfBlocks"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$a(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        iD iD2 = new iD();
        kH.f$E().f$E().f$E(iD2);
        if (iD2.f$E()) {
            callbackInfoReturnable.cancel();
        }
    }

    @Redirect(method={"onLivingUpdate"}, at=@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.closeScreen()V"))
    private void f$E(EntityPlayerSP entityPlayerSP) {
        if (lG.f$E().f$E()) {
            0.func_71053_j();
        }
    }

    @Redirect(method={"onLivingUpdate"}, at=@At(value="INVOKE", target="net/minecraft/client/Minecraft.displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V"))
    private void f$E(Minecraft minecraft, GuiScreen guiScreen) {
        if (lG.f$E().f$E()) {
            0.field_71159_c.displayGuiScreen(null);
        }
    }

    @Redirect(method={"onLivingUpdate"}, at=@At(value="INVOKE", target="net/minecraft/client/audio/SoundHandler.playSound(Lnet/minecraft/client/audio/ISound;)V"))
    private void f$E(SoundHandler soundHandler, ISound iSound) {
        DA dA = (DA)kH.f$E().f$E().f$E(DA.class);
        if (dA == null || !dA.f$E() || !dA.f$K.f$E().booleanValue()) {
            0.field_71159_c.getSoundHandler().playSound(iSound);
        }
    }

    @Redirect(method={"onLivingUpdate"}, at=@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.isElytraFlying()Z"))
    private boolean f$E(EntityPlayerSP entityPlayerSP) {
        BB bB = (BB)kH.f$E().f$E().f$E(BB.class);
        if (bB != null && bB.f$E() && bB.f$D.f$E() == mc.f$M) {
            return true;
        }
        return entityPlayerSP.func_184613_cA();
    }

    @Inject(method={"isCurrentViewEntity"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        EntityPlayerSP entityPlayerSP = (EntityPlayerSP)0;
        if (entityPlayerSP.equals((Object)0.field_71159_c.player) && (0 = (rA)kH.f$E().f$E().f$E(rA.class)) != null && 0.f$E()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }
}
