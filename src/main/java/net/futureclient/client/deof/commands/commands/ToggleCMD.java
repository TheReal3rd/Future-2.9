package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.Ba;
import net.futureclient.client.J;
import net.futureclient.client.deof.commands.manager.CommandBase;
import net.futureclient.client.kH;

public class ToggleCMD extends CommandBase {

    public ToggleCMD() {
        super(new String[] {"Toggle", "t"});
    }

    @Override
    public String execute(String[] args) { //TODO make it less fucked.
        block8: {
            block10: {
                block9: {
                    if (0.length < 1) break block8;
                    var2_2 = 0[0];
                    var3_3 = kH.f$E().f$E().f$E(var2_2);
                    if (var3_3 == null) {
                        var4_4 = new StringJoiner(", ");
                        var5_6 = kH.f$E().f$E().f$E().iterator();
                        while (var5_6.hasNext()) {
                            var6_7 = var5_6.next().f$E();
                            var7_8 = var6_7.length;
                            v0 = var8_9 = 0;
                            while (v0 < var7_8) {
                                var9_10 = var6_7[var8_9];
                                if (var9_10.contains(var2_2)) {
                                    var4_4.add(String.format("&e%s&7", new Object[]{var9_10}));
                                }
                                v0 = ++var8_9;
                            }
                        }
                        if (var4_4.length() < 1) {
                            return "That module does not exist.";
                        }
                        return String.format("Did you mean: %s?", new Object[]{var4_4.toString()});
                    }
                    if (!(var3_3 instanceof J)) {
                        return "That module is not toggleable.";
                    }
                    var4_5 = (Ba)var3_3;
                    if (0.length < 2) break block9;
                    if (0[1].toLowerCase().contains("activ")) ** GOTO lbl-1000
                    if (0[1].toLowerCase().contains("on")) ** GOTO lbl-1000
                    if (0[1].toLowerCase().contains("enable")) ** GOTO lbl-1000
                    if (0[1].toLowerCase().contains("true")) lbl-1000:
                    // 4 sources

                    {
                        v1 = true;
                    } else {
                        v1 = false;
                    }
                    var4_5.f$E(v1);
                    break block10;
                }
                var4_5.f$E();
            }
            v2 = new Object[2];
            v2[0] = var4_5.f$E()[0];
            v2[1] = var4_5.f$E() ? "&aon" : "&coff";
            return String.format("%s toggled %s&7.", v2);
        }
        return null;
    }

    @Override
    public String getInfo() {
        return "&e[module] [state]";
    }
}
/*
public class zI extends GA {
    public zI() {
        zI zI2;
        String[] stringArray = new String[2];
        stringArray[0] = "Toggle";
        stringArray[1] = "t";
        super(stringArray);
    }


     * Unable to fully structure code

@Override
public String f$E(String[] 0) {
    block8: {
        block10: {
            block9: {
                if (0.length < 1) break block8;
                var2_2 = 0[0];
                var3_3 = kH.f$E().f$E().f$E(var2_2);
                if (var3_3 == null) {
                    var4_4 = new StringJoiner(", ");
                    var5_6 = kH.f$E().f$E().f$E().iterator();
                    while (var5_6.hasNext()) {
                        var6_7 = var5_6.next().f$E();
                        var7_8 = var6_7.length;
                        v0 = var8_9 = 0;
                        while (v0 < var7_8) {
                            var9_10 = var6_7[var8_9];
                            if (var9_10.contains(var2_2)) {
                                var4_4.add(String.format("&e%s&7", new Object[]{var9_10}));
                            }
                            v0 = ++var8_9;
                        }
                    }
                    if (var4_4.length() < 1) {
                        return "That module does not exist.";
                    }
                    return String.format("Did you mean: %s?", new Object[]{var4_4.toString()});
                }
                if (!(var3_3 instanceof J)) {
                    return "That module is not toggleable.";
                }
                var4_5 = (Ba)var3_3;
                if (0.length < 2) break block9;
                if (0[1].toLowerCase().contains("activ")) ** GOTO lbl-1000
                if (0[1].toLowerCase().contains("on")) ** GOTO lbl-1000
                if (0[1].toLowerCase().contains("enable")) ** GOTO lbl-1000
                if (0[1].toLowerCase().contains("true")) lbl-1000:
                // 4 sources

                {
                    v1 = true;
                } else {
                    v1 = false;
                }
                var4_5.f$E(v1);
                break block10;
            }
            var4_5.f$E();
        }
        v2 = new Object[2];
        v2[0] = var4_5.f$E()[0];
        v2[1] = var4_5.f$E() ? "&aon" : "&coff";
        return String.format("%s toggled %s&7.", v2);
    }
    return null;
}

    @Override
    public String f$E() {
        return "&e[module] [state]";
    }
}
 */
