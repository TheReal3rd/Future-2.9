package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.kH;
import net.futureclient.client.oD;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={TileEntitySignRenderer.class})
public abstract class MixinTileEntitySignRenderer {
    public MixinTileEntitySignRenderer() {
        MixinTileEntitySignRenderer mixinTileEntitySignRenderer;
    }

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="net/minecraft/client/gui/FontRenderer.drawString(Ljava/lang/String;III)I"))
    private int f$E(FontRenderer fontRenderer, String string, int n, int n2, int n3) {
        oD oD2 = new oD();
        kH.f$E().f$E().f$E(oD2);
        if (oD2.f$E()) {
            return 0;
        }
        return fontRenderer.drawString(string, n, n2, n3);
    }
}
