package net.futureclient.client.deof.utils.logger;

import net.minecraft.util.text.ITextComponent;

import org.apache.logging.log4j.Level;

public interface ILogger {
    public void log(String var1, boolean var2);

    public void log(Level var1, String var2);

    public void log(ITextComponent var1, boolean var2);

    public void log(String var1);
}
/*
public interface E {
    public void f$E(String var1, boolean var2);

    public void f$E(Level var1, String var2);

    public void f$E(ITextComponent var1, boolean var2);

    public void f$E(String var1);
}
 */