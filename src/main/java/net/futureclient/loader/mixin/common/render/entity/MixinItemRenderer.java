package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.Td;
import net.futureclient.client.kH;
import net.futureclient.client.pB;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ItemRenderer.class})
public abstract class MixinItemRenderer {
    public MixinItemRenderer() {
        MixinItemRenderer mixinItemRenderer;
    }

    @Redirect(method={"renderItemInFirstPerson(F)V"}, at=@At(value="INVOKE", ordinal=1, target="net/minecraft/client/renderer/ItemRenderer.renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V"))
    private void f$E(ItemRenderer itemRenderer, AbstractClientPlayer abstractClientPlayer, float f, float f2, EnumHand enumHand, float f3, ItemStack itemStack, float f4) {
        pB pB2 = (pB)kH.f$E().f$E().f$E(pB.class);
        if (pB2 != null && pB2.f$E()) {
            f4 += pB2.f$d.f$E().floatValue();
        }
        itemRenderer.renderItemInFirstPerson(abstractClientPlayer, f, f2, enumHand, f3, itemStack, f4);
    }

    @Inject(method={"renderFireInFirstPerson"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfo callbackInfo) {
        Td td = new Td();
        kH.f$E().f$E().f$E(td);
        if (td.f$E()) {
            callbackInfo.cancel();
        }
    }
}
