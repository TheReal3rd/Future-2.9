package net.futureclient.client.deof.utils.other;

import net.futureclient.client.deof.FutureClient;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class FutureLogger implements ILogger {
    private static final Logger logger = LogManager.getLogger((String) FutureClient.clientName);// OG f$d
    private static final FutureLogger INSTANCE = new FutureLogger();;// OG f$g
    public static final int id1 = 1337 + new Random().nextInt(2147482311);// OG f$i
    public static final int id2 = -id1;// OG f$M

    @Override
    public void log(ITextComponent iTextComponent1, boolean bl) {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.ingameGUI != null) {
            ITextComponent iTextComponent2 = new TextComponentString("[Future] ").setStyle(new Style().setColor(TextFormatting.RED)).appendSibling(iTextComponent1);
            minecraft.ingameGUI.getChatGUI().printChatMessageWithOptionalDeletion(iTextComponent2, bl ? id2 : id1);
        }
    }

    @Override
    public void log(Level level, String string) {
        logger.log(level, string);
    }

    @Override
    public void log(String string) {
        this.log(string, true);
    }

    @Override
    public void log(String string1, boolean bl) {
        ITextComponent string2 = new TextComponentString(string1.replace("&", "\u00a7")).setStyle(new Style().setColor(TextFormatting.GRAY));
        this.log((ITextComponent)string2, bl);
    }

    public static FutureLogger getInstance() {
        return INSTANCE;
    }
}
/*
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
 */
