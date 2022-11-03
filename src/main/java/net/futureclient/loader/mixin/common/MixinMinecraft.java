package net.futureclient.loader.mixin.common;

import net.futureclient.client.AI;
import net.futureclient.client.Af;
import net.futureclient.client.FG;
import net.futureclient.client.He;
import net.futureclient.client.ME;
import net.futureclient.client.OF;
import net.futureclient.client.Vd;
import net.futureclient.client.Wf;
import net.futureclient.client.Y;
import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.event.events.GUIScreenEvent;
import net.futureclient.client.deof.event.events.InputEvent;
import net.futureclient.client.deof.event.events.TickEvent;
import net.futureclient.client.deof.utils.enums.InputEnum;
import net.futureclient.client.kE;
import net.futureclient.client.kH;
import net.futureclient.client.oH;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.util.RecipeBookClient;
import net.minecraft.stats.RecipeBook;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.util.Session;
import net.minecraft.util.Timer;
import net.minecraft.world.World;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.PixelFormat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Minecraft.class})
public abstract class MixinMinecraft implements Y {
    @Shadow
    public WorldClient field_71441_e;

    public MixinMinecraft() {
        MixinMinecraft mixinMinecraft;
    }

    @Override
    @Accessor
    public abstract Timer getTimer();

    @Override
    @Accessor
    public abstract void setSession(Session var1);

    @Override
    @Accessor
    public abstract int getRightClickDelayTimer();

    @Override
    @Accessor
    public abstract void setRightClickDelayTimer(int var1);

    @Override
    @Accessor
    public abstract void setLeftClickCounter(int var1);

    @Shadow
    public abstract void func_147116_af();

    @Shadow
    public abstract void func_147121_ag();

    @Shadow
    public abstract void func_147112_ai();

    @Shadow
    public abstract void func_71405_e();

    @Override
    public void f$E(He he) {
        if (he == He.f$i) {
            0.func_147116_af();
        } else if (he == He.f$M) {
            0.func_147121_ag();
        } else if (he == He.f$g) {
            0.func_147112_ai();
        }
    }

    @Inject(method={"init"}, at={@At(value="INVOKE", target="net/minecraft/client/renderer/RenderGlobal.makeEntityOutlineShader()V")})
    private void f$H(CallbackInfo callbackInfo) {
        new kH();
        kH.f$E().f$E().f$E(new OF());
    }

    @Inject(method={"displayGuiScreen"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(GuiScreen guiScreen, CallbackInfo callbackInfo) {
        if (FutureClient.getINSTANCE() != null) {//TODO: This is something needs checking over when completed.
            final GUIScreenEvent wf = new GUIScreenEvent(guiScreen);
            FutureClient.getINSTANCE().getEventManager().invoke(wf);
            if (wf.isCancelled()) {
                callbackInfo.cancel();
            }
        }
        /*
                if (kH.f$E() != null) {
            Wf wf = new Wf(guiScreen);
            kH.f$E().f$E().f$E(wf);
            if (wf.f$E()) {
                callbackInfo.cancel();
            }
        }
         */
    }

    @Inject(method={"runGameLoop"}, at={@At(value="HEAD")})
    private void f$h(CallbackInfo callbackInfo) {
        kH.f$E().f$E().f$E(new Af());
    }

    @Inject(method={"shutdownMinecraftApplet"}, at={@At(value="HEAD")})
    private void f$A(CallbackInfo callbackInfo) {
        kH.f$E().f$E().f$E(new Vd());
    }

    @Inject(method={"clickMouse"}, at={@At(value="HEAD")})
    private void f$K(CallbackInfo callbackInfo) {
        FutureClient.getINSTANCE().getEventManager().invoke(new InputEvent(InputEnum.LEFTCLICK));
    }

    @Inject(method={"rightClickMouse"}, at={@At(value="HEAD")})
    private void f$B(CallbackInfo callbackInfo) {
        FutureClient.getINSTANCE().getEventManager().invoke(new InputEvent(InputEnum.RIGHTCLICK));
    }

    @Inject(method={"runTick"}, at={@At(value="HEAD")})
    private void f$e(CallbackInfo callbackInfo) {
        /*
        kH.f$E().f$E().f$E(new ME());
         */
        FutureClient.getINSTANCE().getEventManager().invoke(new TickEvent());
    }

    @Inject(method={"runTickKeyboard"}, at={@At(value="INVOKE_ASSIGN", target="org/lwjgl/input/Keyboard.getEventKeyState()Z", remap=false)})
    private void f$a(CallbackInfo callbackInfo) {
        boolean bl = Keyboard.getEventKeyState();
        if (bl) {
            FutureClient.getINSTANCE().getEventManager().invoke(new InputEvent(InputEnum.KEYDOWN));
        } else {
            FutureClient.getINSTANCE().getEventManager().invoke(new InputEvent(InputEnum.KEYRELEASE));
        }
    }

    @Inject(method={"middleClickMouse"}, at={@At(value="HEAD")})
    private void f$E(CallbackInfo callbackInfo) {
        FutureClient.getINSTANCE().getEventManager().invoke(new InputEvent(InputEnum.MIDDLECLICK));
    }

    @Redirect(method={"createDisplay"}, at=@At(value="INVOKE", remap=false, target="org/lwjgl/opengl/Display.create(Lorg/lwjgl/opengl/PixelFormat;)V"))
    private void f$E(PixelFormat pixelFormat) throws LWJGLException {
        oH.f$A();
    }

    @Redirect(method={"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"}, at=@At(value="INVOKE", target="net/minecraft/client/multiplayer/PlayerControllerMP.createPlayer(Lnet/minecraft/world/World;Lnet/minecraft/stats/StatisticsManager;Lnet/minecraft/stats/RecipeBook;)Lnet/minecraft/client/entity/EntityPlayerSP;"))
    private EntityPlayerSP f$E(PlayerControllerMP playerControllerMP, World world, StatisticsManager statisticsManager, RecipeBook recipeBook) {
        if (((FG)((Object)AI.f$E().f$g.f$E())).equals((Object)FG.f$M)) {
            // empty if block
        }
        return playerControllerMP.createPlayer(world, new StatisticsManager(), (RecipeBook)new RecipeBookClient());
    }
}
