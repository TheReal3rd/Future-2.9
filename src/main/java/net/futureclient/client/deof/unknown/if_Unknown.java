package net.futureclient.client.deof.unknown;

import net.futureclient.client.deof.modules.ModuleStandard;
import net.futureclient.client.deof.utils.chat.oF_Unknown;

public class if_Unknown extends oF_Unknown {
    private ModuleStandard moduleS;//OG f$d

    public if_Unknown(ModuleStandard ba) {
        this.moduleS = ba;
    }

    public ModuleStandard f$E() {
        return this.moduleS;
    }

    @Override
    public void f$E() {
        this.moduleS.f$E();//TODO figure out this is executing.
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.oF;

public class if
extends oF {
    private Ba f$d;

    public if(Ba ba) {
        0.f$d = ba;
    }

    public Ba f$E() {
        if if_;
        return if_.f$d;
    }

    @Override
    public void f$E() {
        if if_;
        if_.f$d.f$E();
    }
}
 */