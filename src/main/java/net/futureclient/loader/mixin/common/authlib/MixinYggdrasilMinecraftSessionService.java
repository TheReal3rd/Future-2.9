package net.futureclient.loader.mixin.common.authlib;

import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import java.net.MalformedURLException;
import java.net.URL;
import net.futureclient.client.JG;
import net.futureclient.client.ki;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={YggdrasilMinecraftSessionService.class}, remap=false)
public abstract class MixinYggdrasilMinecraftSessionService {
    @Shadow
    @Final
    private static URL JOIN_URL;

    public MixinYggdrasilMinecraftSessionService() {
        MixinYggdrasilMinecraftSessionService mixinYggdrasilMinecraftSessionService;
    }

    @Redirect(method={"joinServer"}, at=@At(value="FIELD", target="com/mojang/authlib/yggdrasil/YggdrasilMinecraftSessionService.JOIN_URL:Ljava/net/URL;"))
    private URL f$E() throws MalformedURLException {
        return JG.f$E().equals((Object)ki.f$M) ? new URL("http://sessionserver.thealtening.com" + JOIN_URL.getFile()) : JOIN_URL;
    }
}
