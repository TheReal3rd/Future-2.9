package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.kH;
import net.futureclient.client.rA;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={RenderPlayer.class})
public abstract class MixinRenderPlayer {
    public MixinRenderPlayer() {
        MixinRenderPlayer mixinRenderPlayer;
    }

    @Redirect(method={"doRender"}, at=@At(value="INVOKE", target="net/minecraft/client/entity/AbstractClientPlayer.isUser()Z"))
    private boolean f$E(AbstractClientPlayer abstractClientPlayer) {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (abstractClientPlayer.equals((Object)minecraft.player) && (0 = (rA)kH.f$E().f$E().f$E(rA.class)) != null && 0.f$E()) {
            return false;
        }
        return abstractClientPlayer.func_175144_cb();
    }
}
