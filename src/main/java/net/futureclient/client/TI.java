package net.futureclient.client;

import com.google.common.io.ByteArrayDataOutput;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import net.futureclient.client.WH;

public class TI
extends WH {
    private DataInputStream f$g;
    private int f$d;

    public TI(int n, DataInputStream dataInputStream) {
        TI tI = 0;
        tI.f$d = n;
        tI.f$g = dataInputStream;
    }

    @Override
    public void f$E(ByteArrayDataOutput byteArrayDataOutput) throws IOException {
    }

    @Override
    public int f$E() {
        TI tI;
        return tI.f$d;
    }

    @Override
    public void f$E(DataInputStream dataInputStream) throws IOException {
    }

    public <P extends WH> P f$E(Class<P> genericDeclaration) throws IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        GenericDeclaration genericDeclaration2 = genericDeclaration = ((Class)genericDeclaration).getConstructor(new Class[0]);
        ((AccessibleObject)((Object)genericDeclaration2)).setAccessible(true);
        WH wH = (WH)((Constructor)genericDeclaration2).newInstance(new Object[0]);
        wH.f$E(0.f$g);
        return (P)wH;
    }
}
package net.futureclient.client;

import net.futureclient.client.GA;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.ServerData;

public class ti
extends GA {
    @Override
    public String f$E() {
        return "&e[ip]";
    }

    @Override
    public String f$E(String[] serverData) {
        if (((String[])serverData).length == 1) {
            serverData = new ServerData("", serverData[0], false);
            ti ti2 = 0;
            ti2.f$d.world.sendQuittingDisconnectingPacket();
            ti2.f$d.loadWorld(null);
            ti2.f$d.displayGuiScreen((GuiScreen)new GuiConnecting((GuiScreen)new GuiMultiplayer((GuiScreen)new GuiMainMenu()), 0.f$d, serverData));
            return "Connecting...";
        }
        return null;
    }

    public ti() {
        ti ti2;
        String[] stringArray = new String[2];
        stringArray[0] = "Connect";
        stringArray[1] = "c";
        super(stringArray);
    }
}
package net.futureclient.client;

import net.futureclient.client.OI;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

public class tI {
    public static final OI f$d;
    private static final Minecraft f$g;

    public tI() {
        tI tI2;
    }

    public static BlockPos f$E() {
        return tI.f$g.world.func_175694_M();
    }

    static {
        f$g = Minecraft.getMinecraft();
        f$d = new OI(8.0, 64.0, 8.0);
    }

    public static void f$E() {
        if (tI.f$g.world != null && tI.f$g.player != null) {
            tI.f$g.renderGlobal.loadRenderers();
        }
    }

    public static void f$a() {
        if (tI.f$g.world != null && tI.f$g.player != null) {
            int n = (int)tI.f$g.player.field_70165_t;
            int n2 = (int)tI.f$g.player.field_70163_u;
            int n3 = (int)tI.f$g.player.field_70161_v;
            int n4 = tI.f$g.gameSettings.renderDistanceChunks * 16;
            tI.f$g.renderGlobal.markBlockRangeForRenderUpdate(n - n4, n2 - n4, n3 - n4, n + n4, n2 + n4, n3 + n4);
        }
    }
}
