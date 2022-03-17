package net.futureclient.client.deof.utils.chat;

import net.minecraft.client.Minecraft;

public class ChatObject extends oF_Unknown {
    private final String message;//OG f$d

    public ChatObject(String string) {
        this.message = string;
    }

    @Override
    public void send() {
        Minecraft.getMinecraft().player.sendChatMessage(this.message);
    }

    public String getMessage() {
        return this.message;
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