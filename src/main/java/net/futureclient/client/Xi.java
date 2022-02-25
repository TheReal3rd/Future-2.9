package net.futureclient.client;

import java.util.ArrayList;
import java.util.Iterator;
import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.jf;
import net.futureclient.client.kH;
import net.futureclient.client.wh;
import net.minecraft.network.play.server.SPacketTabComplete;

public class Xi
extends Ha<jf> {
    public final wh f$d;

    public Xi(wh wh2) {
        0.f$d = wh2;
    }

    @Override
    public void f$E(jf jf2) {
        wh.f$E(0.f$d, new ArrayList());
        if (jf2.f$E() instanceof SPacketTabComplete) {
            int n;
            SPacketTabComplete sPacketTabComplete = (SPacketTabComplete)jf2.f$E();
            jf2.f$E(true);
            Object object = sPacketTabComplete.getMatches();
            int n2 = ((String[])object).length;
            int n3 = n = 0;
            while (n3 < n2) {
                String[] stringArray = object[n].split(":");
                if (stringArray.length > 1 && !wh.f$E(0.f$d).contains(stringArray[0].substring(1))) {
                    wh.f$E(0.f$d).add(stringArray[0].substring(1));
                }
                n3 = ++n;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(String.format("Found plugins (%s): ", wh.f$E(0.f$d).size()));
            Iterator iterator = wh.f$E(0.f$d).iterator();
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                String string = (String)iterator.next();
                iterator2 = iterator;
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(", ");
            }
            Object object2 = object;
            La.f$E().f$E(new StringBuilder().insert(0, ((StringBuilder)object2).substring(0, ((StringBuilder)object2).length() - 2)).append(".").toString());
            kH.f$E().f$E().f$E(0);
        }
    }
}
package net.futureclient.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import net.futureclient.client.Aj;
import net.futureclient.client.JG;
import net.futureclient.client.Ki;
import net.futureclient.client.La;
import net.futureclient.client.QE;
import net.futureclient.client.Y;
import net.futureclient.client.gG;
import net.futureclient.client.ki;
import net.futureclient.client.lH;
import net.futureclient.client.ph;
import net.futureclient.client.ug;
import net.futureclient.client.wg;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Session;
import net.minecraft.util.StringUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Level;

public class xI
extends QE<ph> {
    private static final String f$a = "authserver.mojang.com";
    private static gG f$j;
    private static final URL f$e;
    private static Map<String, String> f$d;
    private String f$b;
    private Minecraft f$K;
    private static final Type f$M;
    private String f$i;
    public boolean f$I;
    private static final Gson f$g;
    private static final String f$C = "session.minecraft.net";

    static {
        URL uRL;
        f$j = new gG();
        f$M = new ug().getType();
        f$g = new GsonBuilder().registerTypeAdapter(f$M, (Object)new Aj(null)).create();
        URL uRL2 = null;
        try {
            uRL = uRL2 = new URL("http://status.mojang.com/check");
        }
        catch (MalformedURLException malformedURLException) {
            La.f$E().f$E(Level.INFO, "Malformed URL found trying while to format Mojang server status checker URL string.");
            uRL = uRL2;
        }
        f$e = uRL;
    }

    public void f$E(int n, String string, String string2) {
        0.f$E().set(n, string2.isEmpty() ? new ph(string) : new ph(string, string2));
    }

    public void f$E() {
        xI xI2;
        String string;
        String string2 = f$d == null ? "\u00a77Loading..." : (string = f$d.get(f$a).replace("green", "\u00a7aOnline").replace("yellow", "\u00a76Slow").replace("red", "\u00a74Offline").replace("black", "\u00a78DNS Failure"));
        String string3 = f$d == null ? "\u00a77Loading..." : f$d.get(f$C).replace("green", "\u00a7aOnline").replace("yellow", "\u00a76Slow").replace("red", "\u00a74Offline").replace("black", "\u00a78DNS Failure");
        xI2.f$K.fontRenderer.drawStringWithShadow(new StringBuilder().insert(0, "\u00a77Authentication Server: ").append(string).toString(), 2.0f, 2.0f, 0xFFFFFF);
        xI2.f$K.fontRenderer.drawStringWithShadow(new StringBuilder().insert(0, "\u00a77Multiplayer Session: ").append(string3).toString(), 2.0f, (float)(2 + xI2.f$K.fontRenderer.FONT_HEIGHT), 0xFFFFFF);
    }

    @Override
    public void f$E(String string) {
        0.f$i = string;
    }

    @Override
    public void f$a(int n) {
        0.f$E().remove(n);
    }

    public String f$a() {
        xI xI2;
        return xI2.f$b;
    }

    private Session f$E(String string, String string2) throws AuthenticationException {
        YggdrasilUserAuthentication yggdrasilUserAuthentication;
        if (string.isEmpty() || string2.isEmpty()) {
            return null;
        }
        YggdrasilUserAuthentication yggdrasilUserAuthentication2 = yggdrasilUserAuthentication = (YggdrasilUserAuthentication)new YggdrasilAuthenticationService(Proxy.NO_PROXY, "").createUserAuthentication(Agent.MINECRAFT);
        yggdrasilUserAuthentication.logOut();
        yggdrasilUserAuthentication2.setUsername(string);
        yggdrasilUserAuthentication.setPassword(string2);
        yggdrasilUserAuthentication2.logIn();
        if (yggdrasilUserAuthentication.getSelectedProfile() == null) {
            return null;
        }
        return new Session(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), "mojang");
    }

    public static String f$E(xI xI2) {
        return xI2.f$i;
    }

    public void f$E(String string, String string2, String string3) {
        0.f$E().add(new ph(string, string2, string3));
    }

    public void f$a(String string, String string2) {
        0.f$E().add(string2.isEmpty() ? new ph(string) : new ph(string, string2));
    }

    @Override
    private boolean f$E(Session session) {
        boolean bl = true;
        try {
            String string = new StringBuilder().insert(0, UUID.randomUUID().toString().replace("-", "")).append(UUID.randomUUID().toString().replace("-", "").substring(0, 7)).toString();
            0.f$K.getSessionService().joinServer(session.getProfile(), session.getToken(), string);
            return bl;
        }
        catch (AuthenticationException authenticationException) {
            bl = false;
            return false;
        }
    }

    public xI() {
        xI xI2;
        xI xI3 = xI2;
        xI xI4 = xI2;
        xI4.f$K = Minecraft.getMinecraft();
        xI3.f$b = xI4.f$K.getSession().getUsername();
        xI3.f$i = "";
        xI xI5 = xI2;
        xI3.f$d = new ArrayList();
        new lH(xI2, "accounts.txt");
        new wg(xI2, "altdispenserkey.txt");
    }

    public String f$E() {
        xI xI2;
        return xI2.f$i;
    }

    @Override
    public void f$a(String string) {
        0.f$b = string;
    }

    public void f$a() {
        if (f$j.f$E(30L, TimeUnit.SECONDS)) {
            try {
                String string = IOUtils.toString(f$e, "UTF-8");
                f$d = (Map)f$g.fromJson(string, f$M);
            }
            catch (Exception exception) {
                HashMap<String, String> hashMap = new HashMap<String, String>();
                String string = "black";
                hashMap.put(f$a, string);
                hashMap.put(f$C, string);
                f$d = hashMap;
                exception.printStackTrace();
            }
            f$j.f$E();
        }
    }

    private ThreadDownloadImageData f$E(ResourceLocation resourceLocation, String string) {
        TextureManager textureManager = Minecraft.getMinecraft().getTextureManager();
        ITextureObject iTextureObject = textureManager.getTexture(resourceLocation);
        if (iTextureObject == null) {
            iTextureObject = new ThreadDownloadImageData(null, String.format("https://skins.futureclient.net/MinecraftSkins/%s.png?bypass_secret=SHKzhL8TaNeE5cyJ", StringUtils.stripControlCodes((String)string)), DefaultPlayerSkin.getDefaultSkin((UUID)EntityPlayer.getOfflineUUID((String)string)), (IImageBuffer)new ImageBufferDownload());
            textureManager.loadTexture(resourceLocation, iTextureObject);
        }
        return (ThreadDownloadImageData)iTextureObject;
    }

    public static String f$E(xI xI2, String string) {
        xI2.f$i = string;
        return xI2.f$i;
    }

    public void f$E(String string, int n, int n2) {
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation resourceLocation = AbstractClientPlayer.getLocationSkin((String)string);
        0.f$E(resourceLocation, string);
        0.f$K.getTextureManager().bindTexture(resourceLocation);
        GlStateManager.enableBlend();
        Gui.drawModalRectWithCustomSizedTexture((int)n, (int)n2, (float)32.0f, (float)32.0f, (int)32, (int)32, (float)256.0f, (float)256.0f);
        Gui.drawModalRectWithCustomSizedTexture((int)n, (int)n2, (float)160.0f, (float)32.0f, (int)32, (int)32, (float)256.0f, (float)256.0f);
        GlStateManager.disableBlend();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(int 0) {
        0.f$I = true;
        switch (Ki.f$d[((ph)0.f$E().get(0)).f$E().ordinal()]) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                ((Y)0.f$K).setSession(new Session(((ph)0.f$E().get(0)).f$A(), ((ph)0.f$E().get(0)).f$A(), "0", "mojang"));
                JG.f$E(ki.f$i);
                v0 = 0;
                break;
            }
            case 2: 
            case 4: {
                if (((ph)0.f$E().get(0)).f$E().getToken().length() != 0) {
                    v1 = 0;
                    if (v1.f$E(((ph)v1.f$E().get(0)).f$E())) {
                        ((ph)0.f$E().get(0)).f$E("");
                        ((Y)0.f$K).setSession(new Session(((ph)0.f$E().get(0)).f$h(), ((ph)0.f$E().get(0)).f$E().getPlayerID(), ((ph)0.f$E().get(0)).f$E().getToken(), Session.Type.MOJANG.toString()));
                        JG.f$E(ki.f$i);
                        La.f$E().f$E(Level.INFO, "Logging in with session.");
                        v0 = 0;
                        break;
                    }
                }
                if (!((ph)0.f$E().get(0)).f$K().equals("") && ((ph)0.f$E().get(0)).f$K() != null) {
                    var2_2 = ((ph)0.f$E().get(0)).f$A();
                    var3_4 = ((ph)0.f$E().get(0)).f$K();
                    var4_5 = null;
                    ((ph)0.f$E().get(0)).f$E("");
                    try {
                        v2 = var4_5 = 0.f$E(var2_2, var3_4);
                    }
                    catch (AuthenticationException var2_3) {
                        ((ph)0.f$E().get(0)).f$E(var2_3.getMessage());
                        La.f$E().f$E(Level.ERROR, var2_3.getMessage());
                        v2 = var4_5;
                    }
                    if (v2 != null) {
                        ((Y)0.f$K).setSession(var4_5);
                        JG.f$E(ki.f$i);
                        ((ph)0.f$E().get(0)).f$E(var4_5);
                    }
                }
                ** GOTO lbl42
            }
            case 3: {
                ((ph)0.f$E().get(0)).f$E("");
            }
lbl42:
            // 3 sources

            default: {
                v0 = 0;
            }
        }
        v0.f$I = false;
    }

    public void f$E(String string4, String string2) {
        Session session;
        if (string2.isEmpty()) {
            String string3 = string4;
            ((Y)0.f$K).setSession(new Session(string3, string3, "0", "mojang"));
            JG.f$E(ki.f$i);
            return;
        }
        Session session2 = null;
        try {
            session = session2 = 0.f$E(string4, string2);
        }
        catch (AuthenticationException string4) {
            La.f$E().f$E(Level.INFO, string4.getMessage());
            session = session2;
        }
        if (session != null) {
            ((Y)0.f$K).setSession(session2);
            JG.f$E(ki.f$i);
        }
    }
}
