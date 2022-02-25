package net.futureclient.loader.mixin.common.network;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.futureclient.client.AD;
import net.futureclient.client.OD;
import net.futureclient.client.VH;
import net.futureclient.client.kH;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.text.ITextComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={NetHandlerPlayClient.class})
public abstract class MixinNetHandlerPlayClient {
    public MixinNetHandlerPlayClient() {
        MixinNetHandlerPlayClient mixinNetHandlerPlayClient;
    }

    @Redirect(method={"handleSpawnPlayer"}, at=@At(value="INVOKE", target="net/minecraft/client/network/NetHandlerPlayClient.getPlayerInfo(Ljava/util/UUID;)Lnet/minecraft/client/network/NetworkPlayerInfo;"))
    private NetworkPlayerInfo f$E(NetHandlerPlayClient netHandlerPlayClient, UUID uUID) {
        NetworkPlayerInfo networkPlayerInfo = netHandlerPlayClient.getPlayerInfo(uUID);
        AD 02 = (AD)kH.f$E().f$E().f$E(AD.class);
        if (02 != null && 02.f$E() && networkPlayerInfo == null) {
            networkPlayerInfo = new NetworkPlayerInfo(new GameProfile(uUID, VH.f$B(uUID)));
        }
        return networkPlayerInfo;
    }

    @Inject(method={"onDisconnect"}, at={@At(value="HEAD")})
    private void f$E(ITextComponent iTextComponent, CallbackInfo callbackInfo) {
        kH.f$E().f$E().f$E(new OD(iTextComponent.getUnformattedText()));
    }
}
