package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.Bf;
import net.futureclient.client.Ff;
import net.futureclient.client.Kg;
import net.futureclient.client.SF;
import net.futureclient.client.kH;
import net.futureclient.client.zA;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderLivingBase.class})
public abstract class MixinRenderLivingBase {
    private final Minecraft f$g = Minecraft.getMinecraft();
    private Kg f$d;

    public MixinRenderLivingBase() {
        MixinRenderLivingBase mixinRenderLivingBase;
    }

    @Inject(method={"doRender"}, at={@At(value="HEAD")})
    private void f$a(EntityLivingBase entityLivingBase, double d, double d2, double d3, float f, float f2, CallbackInfo callbackInfo) {
        if (entityLivingBase.equals((Object)0.f$g.player)) {
            0.f$d = new Kg(entityLivingBase.prevRenderYawOffset, entityLivingBase.renderYawOffset, entityLivingBase.prevRotationYawHead, entityLivingBase.rotationYawHead, entityLivingBase.field_70127_C, entityLivingBase.field_70125_A);
            kH.f$E().f$E().f$E(0.f$d);
            entityLivingBase.prevRenderYawOffset = 0.f$d.f$I();
            entityLivingBase.renderYawOffset = 0.f$d.f$j();
            entityLivingBase.prevRotationYawHead = 0.f$d.f$M();
            entityLivingBase.rotationYawHead = 0.f$d.f$C();
            entityLivingBase.field_70127_C = 0.f$d.f$H();
            entityLivingBase.field_70125_A = 0.f$d.f$h();
        }
    }

    @Inject(method={"doRender"}, at={@At(value="RETURN")})
    private void f$E(EntityLivingBase entityLivingBase, double d, double d2, double d3, float f, float f2, CallbackInfo callbackInfo) {
        if (0.f$d != null) {
            entityLivingBase.prevRenderYawOffset = 0.f$d.f$A();
            entityLivingBase.renderYawOffset = 0.f$d.f$K();
            entityLivingBase.prevRotationYawHead = 0.f$d.f$B();
            entityLivingBase.rotationYawHead = 0.f$d.f$e();
            entityLivingBase.field_70127_C = 0.f$d.f$a();
            entityLivingBase.field_70125_A = 0.f$d.f$E();
            0.f$d = null;
        }
    }

    @Inject(method={"renderLayers"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        if (!zA.f$b) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderName"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(EntityLivingBase entityLivingBase, double d, double d2, double d3, CallbackInfo callbackInfo2) {
        if (entityLivingBase instanceof EntityPlayer) {
            SF sF = new SF();
            kH.f$E().f$E().f$E(sF);
            if (sF.f$E()) {
                callbackInfo2.cancel();
            }
        }
        if (!zA.f$b) {
            CallbackInfo callbackInfo2;
            callbackInfo2.cancel();
        }
    }

    @Redirect(method={"renderModel"}, at=@At(value="INVOKE", target="net/minecraft/client/model/ModelBase.render(Lnet/minecraft/entity/Entity;FFFFFF)V"))
    private void f$E(ModelBase modelBase, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        RenderLivingBase renderLivingBase = (RenderLivingBase)0;
        EntityLivingBase 02 = (EntityLivingBase)entity;
        Ff 03 = new Ff(renderLivingBase, 02, modelBase, f, f2, f3, f4, f5, f6);
        kH.f$E().f$E().f$E(03);
        if (!03.f$E()) {
            modelBase.render(entity, f, f2, f3, f4, f5, f6);
        }
        kH.f$E().f$E().f$E(new Bf(renderLivingBase, 02, modelBase));
    }
}
