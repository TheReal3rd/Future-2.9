package net.futureclient.loader.mixin.common.gui;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import net.futureclient.client.aH;
import net.futureclient.client.lG;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.BossInfoClient;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiBossOverlay;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.network.play.server.SPacketUpdateBossInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.BossInfo;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={GuiBossOverlay.class})
public abstract class MixinGuiBossOverlay
extends Gui {
    private final ArrayList<aH> f$g = new ArrayList();
    private ResourceLocation f$d = new ResourceLocation("textures/gui/bars.png");
    @Shadow
    @Final
    private Map<UUID, BossInfoClient> field_184060_g;
    @Shadow
    @Final
    private Minecraft field_184059_f;

    public MixinGuiBossOverlay() {
        MixinGuiBossOverlay mixinGuiBossOverlay;
    }

    @Shadow
    public abstract void func_184052_a(int var1, int var2, BossInfo var3);

    @Inject(method={"renderBossHealth"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        if (!0.field_184060_g.isEmpty() && !lG.f$E().f$E()) {
            ScaledResolution scaledResolution = new ScaledResolution(0.field_184059_f);
            int 02 = scaledResolution.getScaledWidth();
            int 03 = 12;
            for (aH aH2 : 0.f$g) {
                int n = 02 / 2 - 91;
                GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                0.field_184059_f.getTextureManager().bindTexture(0.f$d);
                0.func_184052_a(n, 03, (BossInfo)aH2.f$g);
                String 04 = aH2.f$g.func_186744_e().getFormattedText() + (aH2.f$d > 1 ? " (x" + aH2.f$d + ")" : "");
                0.field_184059_f.fontRenderer.drawStringWithShadow(04, (float)(02 / 2 - 0.field_184059_f.fontRenderer.getStringWidth(04) / 2), (float)(03 - 9), 0xFFFFFF);
                if ((03 += 10 + 0.field_184059_f.fontRenderer.FONT_HEIGHT) < scaledResolution.getScaledHeight() / 3) continue;
                break;
            }
            callbackInfo.cancel();
        }
    }

    @Inject(method={"read"}, at={@At(value="HEAD")})
    private void f$E(SPacketUpdateBossInfo sPacketUpdateBossInfo, CallbackInfo callbackInfo) {
        if (!lG.f$E().f$E()) {
            0.f$E();
        }
    }

    private void f$E() {
        MixinGuiBossOverlay mixinGuiBossOverlay;
        mixinGuiBossOverlay.f$g.clear();
        ArrayList<String> 02 = new ArrayList<String>();
        for (BossInfoClient bossInfoClient : mixinGuiBossOverlay.field_184060_g.values()) {
            if (02.contains(bossInfoClient.func_186744_e().getFormattedText())) continue;
            String string = bossInfoClient.func_186744_e().getFormattedText();
            aH 03 = new aH();
            03.f$g = bossInfoClient;
            for (BossInfoClient bossInfoClient2 : mixinGuiBossOverlay.field_184060_g.values()) {
                if (!bossInfoClient2.func_186744_e().getFormattedText().equals(string)) continue;
                ++03.f$d;
            }
            02.add(string);
            mixinGuiBossOverlay.f$g.add(03);
        }
    }
}
