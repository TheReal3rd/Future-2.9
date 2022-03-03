package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;
import net.futureclient.client.kH;

public class RunTimeCMD extends CommandBase {
    public RunTimeCMD() {
        super(new String[] {"Runtime", "time"});
    }

    @Override
    public String execute(String[] object2) {//TODO finish this.
        int n;
        long l;
        long l2;
        long l3;
        block14: {
            if (((String[])object2).length != 1) {
                return null;
            }
            l3 = (System.nanoTime() / 1000000L - kH.f$E().f$l) / 1000L;
            l2 = l3 / 60L;
            l = l2 / 60L;
            String string = object2[0];
            int n2 = -1;
            switch (string.hashCode()) {
                case -906279820: {
                    if (!string.equals("second")) break;
                    n = n2 = 0;
                    break block14;
                }
                case 1970096767: {
                    if (!string.equals("seconds")) break;
                    n = n2 = 1;
                    break block14;
                }
                case -1074026988: {
                    if (!string.equals("minute")) break;
                    n = n2 = 2;
                    break block14;
                }
                case 1064901855: {
                    if (!string.equals("minutes")) break;
                    n = n2 = 3;
                    break block14;
                }
                case 3208676: {
                    if (!string.equals("hour")) break;
                    n = n2 = 4;
                    break block14;
                }
                case 99469071: {
                    if (!string.equals("hours")) break;
                    n2 = 5;
                }
            }
            n = n2;
        }
        switch (n) {
            case 0:
            case 1: {
                String object2 = String.format("%s seconds", l3);
                return String.format("You've been playing for &e%s&7.", object2);
            }
            case 2:
            case 3: {
                String object2 = String.format("%s minutes", l2);
                return String.format("You've been playing for &e%s&7.", object2);
            }
            case 4:
            case 5: {
                String object2 = String.format("%s hours", l);
                return String.format("You've been playing for &e%s&7.", object2);
            }
            default: {
                return "Invalid time format, use second, minute, hour.";
            }
        }
    }

    @Override
    public String getInfo() {
        return "&e[format]";
    }
}
/*
public class Hh
extends GA {
    public Hh() {
        Hh hh;
        String[] stringArray = new String[2];
        stringArray[0] = "Runtime";
        stringArray[1] = "time";
        super(stringArray);
    }


     * Enabled aggressive block sorting

@Override
public String f$E(String[] object2) {
    int n;
    long l;
    long l2;
    long l3;
    block14: {
        if (((String[])object2).length != 1) {
            return null;
        }
        l3 = (System.nanoTime() / 1000000L - kH.f$E().f$l) / 1000L;
        l2 = l3 / 60L;
        l = l2 / 60L;
        String string = object2[0];
        int n2 = -1;
        switch (string.hashCode()) {
            case -906279820: {
                if (!string.equals("second")) break;
                n = n2 = 0;
                break block14;
            }
            case 1970096767: {
                if (!string.equals("seconds")) break;
                n = n2 = 1;
                break block14;
            }
            case -1074026988: {
                if (!string.equals("minute")) break;
                n = n2 = 2;
                break block14;
            }
            case 1064901855: {
                if (!string.equals("minutes")) break;
                n = n2 = 3;
                break block14;
            }
            case 3208676: {
                if (!string.equals("hour")) break;
                n = n2 = 4;
                break block14;
            }
            case 99469071: {
                if (!string.equals("hours")) break;
                n2 = 5;
            }
        }
        n = n2;
    }
    switch (n) {
        case 0:
        case 1: {
            String object2 = String.format("%s seconds", l3);
            return String.format("You've been playing for &e%s&7.", object2);
        }
        case 2:
        case 3: {
            String object2 = String.format("%s minutes", l2);
            return String.format("You've been playing for &e%s&7.", object2);
        }
        case 4:
        case 5: {
            String object2 = String.format("%s hours", l);
            return String.format("You've been playing for &e%s&7.", object2);
        }
        default: {
            return "Invalid time format, use second, minute, hour.";
        }
    }
}

    @Override
    public String f$E() {
        return "&e[format]";
    }
}
 */