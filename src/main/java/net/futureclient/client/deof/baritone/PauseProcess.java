package net.futureclient.client.deof.baritone;

import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import net.futureclient.client.SE;
import net.futureclient.client.kH;

public enum PauseProcess implements IBaritoneProcess {
    Baritone;

    private static final PathingCommand f$g = new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);;

    public double priority() {
        return 1.0;
    }

    public String displayName0() {
        return new StringBuilder().insert(0, kH.f$m).append(" Pause").toString();
    }

    public boolean isTemporary() {
        return true;
    }

    public void onLostControl() {
    }

    public PathingCommand onTick(boolean bl3, boolean bl2) {
        SE bl3 = new SE(bl3, bl2);
        kH.f$E().f$E().f$E(bl3);
        return f$g;
    }

    public boolean isActive() {
        bF bF2 = new bF();
        kH.f$E().f$E().f$E(bF2);
        return bF2.f$E();
    }
}

/*
package net.futureclient.client;

import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import net.futureclient.client.SE;
import net.futureclient.client.bF;
import net.futureclient.client.kH;

public enum uh implements IBaritoneProcess
{
    f$M;

    private static final PathingCommand f$g;


     * WARNING - Possible parameter corruption
     * WARNING - void declaration

private uh() {
    uh uh2;
}

    public double priority() {
        return 1.0;
    }

    public String displayName0() {
        return new StringBuilder().insert(0, kH.f$m).append(" Pause").toString();
    }

    public boolean isTemporary() {
        return true;
    }

    public void onLostControl() {
    }

    public PathingCommand onTick(boolean bl3, boolean bl2) {
        SE bl3 = new SE(bl3, bl2);
        kH.f$E().f$E().f$E(bl3);
        return f$g;
    }

static {
        f$g = new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
        }

public boolean isActive() {
        bF bF2 = new bF();
        kH.f$E().f$E().f$E(bF2);
        return bF2.f$E();
        }
        }
 */
