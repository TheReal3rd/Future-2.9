package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Zd;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.pd;
import net.futureclient.client.xa;
import net.minecraft.client.renderer.GlStateManager;

public class LA
extends Ha<Zd> {
    public final pd f$d;

    public LA(pd pd2) {
        0.f$d = pd2;
    }

    @Override
    public void f$E(Zd zd) {
        gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
        if (0.f$d.f$g == null) {
            0.f$d.f$g = new xa();
        }
        if (pd.f$E().gameSettings.showDebugInfo) {
            return;
        }
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        0.f$d.f$g.f$E(2 + (int)0.f$d.f$b, gF2.f$Q.f$E().booleanValue() ? (gF2.f$c.f$E().booleanValue() ? gF2.f$L.f$E() + 3 : 12) : 3);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
}
package net.futureclient.client;

import java.util.Random;
import net.futureclient.client.E;
import net.futureclient.client.kH;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class La implements E {
    private static final Logger f$d;
    private static final La f$g;
    public static final int f$M;
    public static final int f$i;

    @Override
    public void f$E(ITextComponent iTextComponent2, boolean bl) {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.ingameGUI != null) {
            ITextComponent iTextComponent2 = new TextComponentString("[Future] ").func_150255_a(new Style().setColor(TextFormatting.RED)).appendSibling(iTextComponent2);
            minecraft.ingameGUI.getChatGUI().printChatMessageWithOptionalDeletion(iTextComponent2, bl ? f$M : f$i);
        }
    }

    @Override
    public void f$E(Level level, String string) {
        f$d.log(level, string);
    }

    @Override
    public void f$E(String string) {
        0.f$E(string, true);
    }

    public La() {
        La la;
    }

    static {
        f$i = 1337 + new Random().nextInt(2147482311);
        f$M = -f$i;
        f$g = new La();
        f$d = LogManager.getLogger((String)kH.f$m);
    }

    @Override
    public void f$E(String string2, boolean bl) {
        String string2 = new TextComponentString(string2.replace("&", "\u00a7")).func_150255_a(new Style().setColor(TextFormatting.GRAY));
        0.f$E((ITextComponent)string2, bl);
    }

    public static La f$E() {
        return f$g;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.VE;
import net.futureclient.client.ba;
import net.minecraft.util.BlockRenderLayer;

public class la
extends Ha<VE> {
    public final ba f$d;

    public la(ba ba2) {
        0.f$d = ba2;
    }

    @Override
    public void f$E(VE vE) {
        if (!ba.f$E(0.f$d, vE.f$E())) {
            vE.f$E(BlockRenderLayer.TRANSLUCENT);
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.jb;
import net.futureclient.client.jf;
import net.minecraft.network.play.server.SPacketSoundEffect;

public class lA
extends Ha<jf> {
    public final jb f$d;

    @Override
    public void f$E(jf jf2) {
        if (jf2.f$E() instanceof SPacketSoundEffect) {
            SPacketSoundEffect sPacketSoundEffect = (SPacketSoundEffect)jf2.f$E();
            if (jb.f$E(0.f$d).contains(sPacketSoundEffect.getSound())) {
                jf2.f$E(true);
            }
        }
    }

    public lA(jb jb2) {
        0.f$d = jb2;
    }
}
