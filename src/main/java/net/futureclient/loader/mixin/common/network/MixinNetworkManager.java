package net.futureclient.loader.mixin.common.network;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.futureclient.client.Ke;
import net.futureclient.client.ce;
import net.futureclient.client.jf;
import net.futureclient.client.kH;
import net.futureclient.client.ve;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={NetworkManager.class})
public abstract class MixinNetworkManager {
    public MixinNetworkManager() {
        MixinNetworkManager mixinNetworkManager;
    }

    @Inject(method={"channelRead0"}, at={@At(value="INVOKE", target="net/minecraft/network/Packet.processPacket(Lnet/minecraft/network/INetHandler;)V")}, cancellable=true)
    private void f$a(ChannelHandlerContext channelHandlerContext, Packet<?> packet, CallbackInfo callbackInfo) {
        jf jf2 = new jf(packet);
        kH.f$E().f$E().f$E(jf2);
        if (jf2.f$E() != false) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"channelRead0"}, at={@At(value="RETURN")})
    private void f$E(ChannelHandlerContext channelHandlerContext, Packet<?> packet, CallbackInfo callbackInfo) {
        if (channelHandlerContext.channel().isOpen()) {
            ce ce2 = new ce(packet);
            kH.f$E().f$E().f$E(ce2);
        }
    }

    @Inject(method={"dispatchPacket"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$a(Packet<?> packet, GenericFutureListener<? extends Future<? super Void>>[] genericFutureListenerArray, CallbackInfo callbackInfo) {
        ve ve2 = new ve(packet);
        kH.f$E().f$E().f$E(ve2);
        if (ve2.f$E() != false) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"dispatchPacket"}, at={@At(value="RETURN")})
    private void f$E(Packet<?> packet, GenericFutureListener<? extends Future<? super Void>>[] genericFutureListenerArray, CallbackInfo callbackInfo) {
        Ke ke = new Ke(packet);
        kH.f$E().f$E().f$E(ke);
    }
}
