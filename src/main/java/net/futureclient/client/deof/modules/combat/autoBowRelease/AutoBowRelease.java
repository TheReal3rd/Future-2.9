package net.futureclient.client.deof.modules.combat.autoBowRelease;

import net.futureclient.client.deof.modules.ModuleStandard;
import net.futureclient.client.deof.settings.NumberSetting;
import net.futureclient.client.deof.settings.SettingsBase;
import net.futureclient.client.deof.utils.enums.CategoryEnum;
import net.minecraft.client.Minecraft;

public class AutoBowRelease extends ModuleStandard {
    public static AutoBowRelease INSTANCE;
    private final SettingsBase<Boolean> tpsSync; //f$d
    private final NumberSetting delay; // f$g

    public AutoBowRelease() {
        super("AutoBowRelease", new String[] {"AutoBowRelease", "BowRelease", "BowSpammer"}, true, -4632381, CategoryEnum.COMBAT);
        INSTANCE = this;
        delay = new NumberSetting((Number)Float.valueOf(21.0f), (Number)Float.valueOf(3.0f), (Number)Float.valueOf(21.0f), 1, "Ticks", "Delay");
        tpsSync = new SettingsBase<Boolean>(true, "TPSSync", "Sync", "TPSSynchronize", "Synchronize");

        addSettings(delay, tpsSync);
        INSTANCE.addListeners(new RE_Listener(this));
    }

    public static NumberSetting getDelay() { // f$E
        return AutoBowRelease.INSTANCE.delay;
    }
    public static SettingsBase<Boolean> getTPSSync() { // f$E
        return AutoBowRelease.INSTANCE.tpsSync;
    }
    public Minecraft getMC() {
        return mc;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.RE;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class Le
extends Ba {
    private final z<Boolean> f$d;
    private final s f$g;

    public static Minecraft f$a() {
        return f$d;
    }

    public Le() {
        Le le;
        String[] stringArray = new String[3];
        stringArray[0] = "AutoBowRelease";
        stringArray[1] = "BowRelease";
        stringArray[2] = "BowSpammer";
        super("AutoBowRelease", stringArray, true, -4632381, JD.f$I);
        Le le2 = le;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Ticks";
        stringArray2[1] = "Delay";
        le2.f$g = new s((Number)Float.valueOf(21.0f), (Number)Float.valueOf(3.0f), (Number)Float.valueOf(21.0f), 1, stringArray2);
        Le le3 = le;
        String[] stringArray3 = new String[4];
        stringArray3[0] = "TPSSync";
        stringArray3[1] = "Sync";
        stringArray3[2] = "TPSSynchronize";
        stringArray3[3] = "Synchronize";
        le3.f$d = new z<Boolean>(true, stringArray3);
        z[] zArray = new z[2];
        zArray[0] = le.f$g;
        zArray[1] = le.f$d;
        le.f$E(zArray);
        le.f$E(new RE(le));
    }

    public static s f$E(Le le) {
        return le.f$g;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static z f$E(Le le) {
        return le.f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
 */