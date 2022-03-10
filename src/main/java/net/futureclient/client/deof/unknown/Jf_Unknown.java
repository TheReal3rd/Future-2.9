package net.futureclient.client.deof.unknown;

import net.minecraft.client.Minecraft;

public class Jf_Unknown extends oF_Unknown {
    private String f$d;

    public Jf_Unknown(String string) {
        this.f$d = string;
    }

    @Override
    public void f$E() {
        Minecraft.getMinecraft().player.sendChatMessage(this.f$d);
    }

    public String f$E() {
        return this.f$d;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.oF;
import net.minecraft.client.Minecraft;

public class Jf extends oF {
    private String f$d;

    @Override
    public void f$E() {
        Jf jf;
        Minecraft.getMinecraft().player.sendChatMessage(jf.f$d);
    }

    public String f$E() {
        Jf jf;
        return jf.f$d;
    }

    public Jf(String string) {
        0.f$d = string;
    }
}
 */