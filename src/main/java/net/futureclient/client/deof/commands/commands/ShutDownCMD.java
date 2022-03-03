package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class ShutDownCMD extends CommandBase {
    public ShutDownCMD() {
        super(new String[] {"ShutDown", "unload", "SelfDestruct", "Unhook"});
    }

    @Override
    public String execute(String[] guiNewChat2) {
        uH uH2;
        if (0.f$d.currentScreen instanceof GuiChat || 0.f$d.currentScreen instanceof WB) {
            0.f$d.displayGuiScreen(null);
        }
        kH.f$E().f$E().f$E().forEach(ib -> ib.f$a(new Object[0]));
        guiNewChat2 = (gF)kH.f$E().f$E().f$E(gF.class);
        if (guiNewChat2 != null) {
            guiNewChat2.f$b.cancel();
        }
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            Ba ba;
            if (ma2 instanceof J && (ba = (Ba)ma2).f$E()) {
                ba.f$E();
            }
        });
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E();
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            if (ma2 instanceof J) {
                ma2.f$a().forEach(z2 -> {
                    if (z2 != null) {
                        z2.f$E(null);
                    }
                });
                ma2.f$E().forEach(kB2 -> {
                    if (kB2 != null) {
                        kB2.f$E("");
                    }
                });
                ma ma3 = ma2;
                ma2.f$E("");
                ma3.f$a("");
                ma3.f$E(new String[]{""});
                ma ma4 = ma2;
                ma4.f$a(new ArrayList<z>());
                ma4.f$E(new ArrayList<kB>());
            }
        });
        kH.f$E().f$E().f$E().clear();
        lG.f$E().f$E(ZG.f$g);
        try {
            Thread.sleep(300L);
            Thread.sleep(300L);
            System.gc();
            System.runFinalization();
            System.gc();
            Thread.sleep(150L);
            System.gc();
            System.runFinalization();
            System.gc();
            Thread.sleep(300L);
            System.gc();
            System.runFinalization();
            uH2 = 0;
        }
        catch (Exception guiNewChat2) {
            uH2 = 0;
        }
        GuiNewChat guiNewChat2 = uH2.f$d.ingameGUI.getChatGUI();
        guiNewChat2.deleteChatLine(1337);
        guiNewChat2.getSentMessages().removeIf(string -> string.startsWith(kH.f$E().f$E().f$E()));
        return "";
    }

    @Override
    public String getInfo() {
        return null;
    }
}
/*
public class uH
extends GA {
    public uH() {
        uH uH2;
        String[] stringArray = new String[4];
        stringArray[0] = "ShutDown";
        stringArray[1] = "unload";
        stringArray[2] = "SelfDestruct";
        stringArray[3] = "Unhook";
        super(stringArray);
    }

    @Override
    public String f$E(String[] guiNewChat2) {
        uH uH2;
        if (0.f$d.currentScreen instanceof GuiChat || 0.f$d.currentScreen instanceof WB) {
            0.f$d.displayGuiScreen(null);
        }
        kH.f$E().f$E().f$E().forEach(ib -> ib.f$a(new Object[0]));
        guiNewChat2 = (gF)kH.f$E().f$E().f$E(gF.class);
        if (guiNewChat2 != null) {
            guiNewChat2.f$b.cancel();
        }
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            Ba ba;
            if (ma2 instanceof J && (ba = (Ba)ma2).f$E()) {
                ba.f$E();
            }
        });
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E().clear();
        kH.f$E().f$E().f$E();
        kH.f$E().f$E().f$E().forEach(ma2 -> {
            if (ma2 instanceof J) {
                ma2.f$a().forEach(z2 -> {
                    if (z2 != null) {
                        z2.f$E(null);
                    }
                });
                ma2.f$E().forEach(kB2 -> {
                    if (kB2 != null) {
                        kB2.f$E("");
                    }
                });
                ma ma3 = ma2;
                ma2.f$E("");
                ma3.f$a("");
                ma3.f$E(new String[]{""});
                ma ma4 = ma2;
                ma4.f$a(new ArrayList<z>());
                ma4.f$E(new ArrayList<kB>());
            }
        });
        kH.f$E().f$E().f$E().clear();
        lG.f$E().f$E(ZG.f$g);
        try {
            Thread.sleep(300L);
            Thread.sleep(300L);
            System.gc();
            System.runFinalization();
            System.gc();
            Thread.sleep(150L);
            System.gc();
            System.runFinalization();
            System.gc();
            Thread.sleep(300L);
            System.gc();
            System.runFinalization();
            uH2 = 0;
        }
        catch (Exception guiNewChat2) {
            uH2 = 0;
        }
        GuiNewChat guiNewChat2 = uH2.f$d.ingameGUI.getChatGUI();
        guiNewChat2.deleteChatLine(1337);
        guiNewChat2.getSentMessages().removeIf(string -> string.startsWith(kH.f$E().f$E().f$E()));
        return "";
    }

    @Override
    public String f$E() {
        return null;
    }
}
 */