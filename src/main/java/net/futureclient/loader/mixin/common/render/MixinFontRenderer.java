package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={FontRenderer.class})
public abstract class MixinFontRenderer {
    public MixinFontRenderer() {
        MixinFontRenderer mixinFontRenderer;
    }

    @Shadow
    public abstract int func_180455_b(String var1, float var2, float var3, int var4, boolean var5);

    @Redirect(method={"drawString(Ljava/lang/String;FFIZ)I"}, at=@At(value="INVOKE", ordinal=0, target="net/minecraft/client/gui/FontRenderer.renderString(Ljava/lang/String;FFIZ)I"))
    private int f$E(FontRenderer fontRenderer, String string, float f, float f2, int n, boolean bl) {
        block1: {
            gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
            if (gF2 == null) break block1;
            Boolean bl2 = gF2.f$k.f$E();
            if (bl2 instanceof Boolean && !bl2.booleanValue()) {
                f -= 0.4f;
                f2 -= 0.4f;
            }
        }
        return this.func_180455_b(string, f, f2, n, bl);
    }
}
