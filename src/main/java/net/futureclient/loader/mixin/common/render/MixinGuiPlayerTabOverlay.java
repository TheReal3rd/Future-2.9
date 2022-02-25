package net.futureclient.loader.mixin.common.render;

import java.util.List;
import net.futureclient.client.kH;
import net.futureclient.client.wd;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={GuiPlayerTabOverlay.class})
public abstract class MixinGuiPlayerTabOverlay {
    public MixinGuiPlayerTabOverlay() {
        MixinGuiPlayerTabOverlay mixinGuiPlayerTabOverlay;
    }

    @Redirect(method={"renderPlayerlist"}, at=@At(value="INVOKE", remap=false, target="java/util/List.subList(II)Ljava/util/List;"))
    private List<?> f$E(List<?> list, int n, int n2) {
        wd wd2 = new wd();
        kH.f$E().f$E().f$E(wd2);
        return wd2.f$a() ? list : list.subList(n, n2);
    }
}
