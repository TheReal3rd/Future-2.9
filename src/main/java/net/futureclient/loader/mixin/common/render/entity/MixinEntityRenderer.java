package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.Cf;
import net.futureclient.client.Lg;
import net.futureclient.client.RD;
import net.futureclient.client.YE;
import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.event.events.EntityRendererOrientEvent;
import net.futureclient.client.deof.event.events.RenderHandEvent;
import net.futureclient.client.fg;
import net.futureclient.client.gF;
import net.futureclient.client.i;
import net.futureclient.client.kH;
import net.futureclient.client.lF;
import net.futureclient.client.rA;
import net.futureclient.client.sE;
import net.futureclient.client.xf;
import net.futureclient.client.zA;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Mixin(value={EntityRenderer.class})
public abstract class MixinEntityRenderer
implements i {
    @Shadow
    @Final
    private Minecraft field_78531_r;
    private boolean f$M;
    private float f$g;
    private float f$d;

    public MixinEntityRenderer() {
        MixinEntityRenderer mixinEntityRenderer;
    }

    @Shadow
    public abstract void func_78467_g(float var1);

    @Override
    public void f$E(float f) {
        0.func_78467_g(f);
    }

    @Override
    @Invoker
    public abstract void invokeSetupCameraTransform(float var1, int var2);

    @Inject(method={"hurtCameraEffect"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$K(CallbackInfo callbackInfo) {
        lF lF2 = new lF();
        kH.f$E().f$E().f$E(lF2);
        if (lF2.f$E() || !zA.f$b) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderWorldPass"}, at={@At(value="INVOKE", target="net/minecraft/client/renderer/GlStateManager.clear(I)V", ordinal=1, shift=At.Shift.AFTER)})
    private void f$E(int n, float f, long l, CallbackInfo callbackInfo) {
        if (Display.isActive() || Display.isVisible()) {
            kH.f$E().f$E().f$E(new sE(YE.f$M, f));
            kH.f$E().f$E().f$E(new sE(YE.f$g, f));
        }
    }

    @Inject(method={"renderHand"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$B(CallbackInfo callbackInfo) {
        RenderHandEvent dg = new RenderHandEvent();
        FutureClient.getINSTANCE().getEventManager().invoke(dg); //kH.f$E().f$E().f$E(dg);
        if (dg.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderWorld"}, at={@At(value="RETURN")})
    private void f$e(CallbackInfo callbackInfo) {
        int n = 0.field_78531_r.gameSettings.guiScale;
        0.field_78531_r.gameSettings.guiScale = 1;
        kH.f$E().f$E().f$E(new fg());
        0.field_78531_r.gameSettings.guiScale = n;
    }

    @Inject(method={"orientCamera"}, at={@At(value="HEAD")})
    private void f$E(float f, CallbackInfo callbackInfo) {
        EntityRendererOrientEvent wd = new EntityRendererOrientEvent(3.5f);
        FutureClient.getINSTANCE().getEventManager().invoke(wd);//kH.f$E().f$E().f$E(wd);
        f$M = wd.isCancelled();
        f$g = wd.getaFloat();
    }

    @Redirect(method={"orientCamera"}, at=@At(value="INVOKE", target="net/minecraft/client/multiplayer/WorldClient.rayTraceBlocks(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;"))
    private RayTraceResult f$E(WorldClient worldClient, Vec3d vec3d, Vec3d vec3d2) {
        return 0.f$M ? null : 0.field_78531_r.world.func_72933_a(vec3d, vec3d2);
    }

    @Redirect(method={"orientCamera"}, at=@At(value="INVOKE", ordinal=2, target="net/minecraft/client/renderer/GlStateManager.translate(FFF)V"))
    private void f$E(float f, float f2, float f3) {
        GlStateManager.translate((float)f, (float)f2, (float)(f3 - (0.f$M ? 0.f$g - 3.5f : 0.0f)));
    }

    @Redirect(method={"setupFog"}, at=@At(value="INVOKE", target="net/minecraft/client/renderer/ActiveRenderInfo.getBlockStateAtEntityViewpoint(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;F)Lnet/minecraft/block/state/IBlockState;"))
    private IBlockState f$E(World world, Entity entity, float f) {
        IBlockState iBlockState = ActiveRenderInfo.getBlockStateAtEntityViewpoint((World)0.field_78531_r.world, (Entity)entity, (float)f);
        gF 02 = (gF)kH.f$E().f$E().f$E(gF.class);
        if (02 != null && 02.f$J.f$E().booleanValue() && (iBlockState.func_185904_a() == Material.LAVA || iBlockState.func_185904_a() == Material.WATER)) {
            return Blocks.AIR.getDefaultState();
        }
        return iBlockState;
    }

    @Inject(method={"displayItemActivation"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$a(CallbackInfo callbackInfo) {
        RD rD = new RD();
        kH.f$E().f$E().f$E(rD);
        if (rD.f$E()) {
            callbackInfo.cancel();
        }
    }

    @Redirect(method={"getMouseOver"}, at=@At(value="INVOKE", target="net/minecraft/client/multiplayer/PlayerControllerMP.getBlockReachDistance()F"))
    private float f$E(PlayerControllerMP playerControllerMP) {
        xf xf2 = new xf();
        kH.f$E().f$E().f$E(xf2);
        0.f$d = xf2.f$a();
        return 0.field_78531_r.playerController.getBlockReachDistance() + 0.f$d;
    }

    @Redirect(method={"getMouseOver"}, at=@At(value="INVOKE", target="net/minecraft/util/math/Vec3d.distanceTo(Lnet/minecraft/util/math/Vec3d;)D"))
    private double f$E(Vec3d vec3d, Vec3d vec3d2) {
        return vec3d.distanceTo(vec3d2) - (double)0.f$d;
    }

    @Redirect(method={"renderWorldPass"}, at=@At(value="FIELD", target="net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;", ordinal=0))
    private EntityPlayerSP f$E(Minecraft minecraft) {
        rA rA2 = (rA)kH.f$E().f$E().f$E(rA.class);
        if (rA2 != null && rA2.f$E()) {
            return rA2.f$E();
        }
        return minecraft.player;
    }

    @Redirect(method={"getMouseOver"}, at=@At(value="INVOKE", target="net/minecraft/client/Minecraft.getRenderViewEntity()Lnet/minecraft/entity/Entity;", ordinal=0))
    private Entity f$E(Minecraft minecraft) {
        Cf cf = new Cf(minecraft.getRenderViewEntity());
        kH.f$E().f$E().f$E(cf);
        return cf.f$E();
    }

    @Inject(method={"getMouseOver"}, at={@At(value="RETURN")})
    private void f$E(CallbackInfo callbackInfo) {
        Lg lg = new Lg(0.field_78531_r.objectMouseOver);
        kH.f$E().f$E().f$E(lg);
        0.field_78531_r.objectMouseOver = lg.f$E();
    }

    @Redirect(method={"updateCameraAndRender"}, at=@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.turn(FF)V"))
    private void f$E(EntityPlayerSP entityPlayerSP, float f, float f2) {
        rA rA2 = (rA)kH.f$E().f$E().f$E(rA.class);
        if (rA2 != null && rA2.f$E()) {
            rA2.f$E().func_70082_c(f, f2);
            return;
        }
        entityPlayerSP.func_70082_c(f, f2);
    }
}
