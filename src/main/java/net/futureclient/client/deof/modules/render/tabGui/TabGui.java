package net.futureclient.client.deof.modules.render.tabGui;

import net.futureclient.client.LA;
import net.futureclient.client.Nc;
import net.futureclient.client.deof.modules.ModuleStandard;
import net.futureclient.client.deof.settings.SettingsBase;
import net.futureclient.client.deof.utils.enums.CategoryEnum;
import net.futureclient.client.xa;
import net.minecraft.client.Minecraft;

public class TabGui extends ModuleStandard {
    private SettingsBase<Boolean> useEnter;
    public xa f$g;

    public TabGui() {
        super("TabGui", new String[] {"TabGui", "tabui", "tabs"}, false, -23445, CategoryEnum.RENDER);
        this.useEnter = new SettingsBase<>(true, "UseEnter", "Enter", "AllowEnter", "Usenter");

        this.addSettings(this.useEnter);

        this.addListeners(new LA(pd2));
        this.addListeners(new Nc(pd2));
    }

    public static SettingsBase<Boolean> getUseEnter(TabGui pd2) {
        return pd2.useEnter;
    }

    public static Minecraft f$E() {
        return mc;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.LA;
import net.futureclient.client.Nc;
import net.futureclient.client.xa;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class pd
extends Ba {
    private z<Boolean> f$d;
    public xa f$g;

    public pd() {
        pd pd2;
        String[] stringArray = new String[3];
        stringArray[0] = "TabGui";
        stringArray[1] = "tabui";
        stringArray[2] = "tabs";
        super("TabGui", stringArray, false, -23445, JD.f$i);
        pd pd3 = pd2;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "UseEnter";
        stringArray2[1] = "Enter";
        stringArray2[2] = "AllowEnter";
        stringArray2[3] = "Usenter";
        pd3.f$d = new z<Boolean>(true, stringArray2);
        pd2.f$E(pd2.f$d);
        pd2.f$E(new LA(pd2));
        pd2.f$E(new Nc(pd2));
    }

    public static z f$E(pd pd2) {
        return pd2.f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }
}
 */