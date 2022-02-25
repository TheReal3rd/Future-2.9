package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.kH;
import net.futureclient.client.xF;
import net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer;
import net.minecraft.tileentity.TileEntityMobSpawner;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={TileEntityMobSpawnerRenderer.class})
public abstract class MixinTileEntityMobSpawnerRenderer {
    public MixinTileEntityMobSpawnerRenderer() {
        MixinTileEntityMobSpawnerRenderer mixinTileEntityMobSpawnerRenderer;
    }

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(TileEntityMobSpawner tileEntityMobSpawner, double d, double d2, double d3, float f, int n, float f2, CallbackInfo callbackInfo) {
        xF xF2 = new xF();
        kH.f$E().f$E().f$E(xF2);
        if (xF2.f$E()) {
            callbackInfo.cancel();
        }
    }
}
