package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.deof.commands.manager.CommandBase;

public class FindSignCMD extends CommandBase {
    private List<OI> f$d;

    public FindSignCMD() {
        super(new String[] {"FindSign"});
        yi yi3 = yi2;
        yi3.f$d = new ArrayList<OI>();
    }

    @Override
    public String getInfo() {
        return "&e[add|del] [text]";
    }

    private static void f$E(Gb gb, OI oI) {
        if (!gb.f$g.contains(oI)) {
            gb.f$g.add(oI);
        }
    }



    @Override
    public String execute(String[] object) {
        block11: {
            block13: {
                String string;
                block12: {
                    int n;
                    if (((String[])object).length < 2) break block11;
                    String string2 = object[0];
                    Object object2 = new StringBuilder();
                    int n2 = n = 1;
                    while (n2 < ((String[])object).length) {
                        ((StringBuilder)object2).append(object[n]);
                        ((StringBuilder)object2).append(" ");
                        n2 = ++n;
                    }
                    string = ((String[])object).length == 2 ? object[1] : ((StringBuilder)object2).toString().trim();
                    object = (Gb)kH.f$E().f$E().f$E(Gb.class);
                    if (object == null) {
                        return "Error.";
                    }
                    object2 = (List)((Gb)object).f$E().f$E();
                    if (!object2.contains(Blocks.STANDING_SIGN)) {
                        object2.add(Blocks.STANDING_SIGN);
                    }
                    if (!object2.contains(Blocks.WALL_SIGN)) {
                        object2.add(Blocks.WALL_SIGN);
                    }
                    0.f$d.world.field_147482_g.forEach(tileEntity -> {
                        if (tileEntity instanceof TileEntitySign) {
                            int n;
                            tileEntity = (TileEntitySign)tileEntity;
                            int n2 = n = 0;
                            while (n2 < 4) {
                                if (tileEntity.signText[n].getFormattedText().toLowerCase().contains(string)) {
                                    0.f$d.add(new OI(tileEntity.func_174877_v().func_177958_n(), tileEntity.func_174877_v().func_177956_o(), tileEntity.func_174877_v().func_177952_p()));
                                    return;
                                }
                                n2 = ++n;
                            }
                        }
                    });
                    if (0.f$d.isEmpty()) {
                        return "No signs found with that text.";
                    }
                    if (string2.equalsIgnoreCase("add")) {
                        0.f$d.forEach(arg_0 -> yi.f$E((Gb)object, arg_0));
                        yi yi2 = 0;
                        int n3 = yi2.f$d.size();
                        yi2.f$d.clear();
                        if (((Ba)object).f$E()) {
                            tI.f$E();
                        }
                        Object[] objectArray = new Object[5];
                        objectArray[0] = n3;
                        objectArray[1] = n3 > 1 ? "s" : "";
                        objectArray[2] = TextFormatting.WHITE;
                        objectArray[3] = string;
                        objectArray[4] = TextFormatting.GRAY;
                        return String.format("Added %s sign%s with the text %s\"%s\"%s to Search.", objectArray);
                    }
                    if (string2.equalsIgnoreCase("del")) break block12;
                    if (!string2.equalsIgnoreCase("remove")) break block13;
                }
                0.f$d.forEach(((Gb)object).f$g::remove);
                yi yi3 = 0;
                int n = yi3.f$d.size();
                yi3.f$d.clear();
                if (((Ba)object).f$E()) {
                    tI.f$E();
                }
                Object[] objectArray = new Object[5];
                objectArray[0] = n;
                objectArray[1] = n > 1 ? "s" : "";
                objectArray[2] = TextFormatting.WHITE;
                objectArray[3] = string;
                objectArray[4] = TextFormatting.GRAY;
                return String.format("Removed %s sign%s with the text %s\"%s\"%s to Search.", objectArray);
            }
            return "Invalid action.";
        }
        return null;
    }
}

/*
public class yi
extends GA {
    private List<OI> f$d;

    @Override
    public String f$E() {
        return "&e[add|del] [text]";
    }

    private static void f$E(Gb gb, OI oI) {
        if (!gb.f$g.contains(oI)) {
            gb.f$g.add(oI);
        }
    }

    public yi() {
        yi yi2;
        String[] stringArray = new String[1];
        stringArray[0] = "FindSign";
        super(stringArray);
        yi yi3 = yi2;
        yi3.f$d = new ArrayList<OI>();
    }

    @Override
    public String f$E(String[] object) {
        block11: {
            block13: {
                String string;
                block12: {
                    int n;
                    if (((String[])object).length < 2) break block11;
                    String string2 = object[0];
                    Object object2 = new StringBuilder();
                    int n2 = n = 1;
                    while (n2 < ((String[])object).length) {
                        ((StringBuilder)object2).append(object[n]);
                        ((StringBuilder)object2).append(" ");
                        n2 = ++n;
                    }
                    string = ((String[])object).length == 2 ? object[1] : ((StringBuilder)object2).toString().trim();
                    object = (Gb)kH.f$E().f$E().f$E(Gb.class);
                    if (object == null) {
                        return "Error.";
                    }
                    object2 = (List)((Gb)object).f$E().f$E();
                    if (!object2.contains(Blocks.STANDING_SIGN)) {
                        object2.add(Blocks.STANDING_SIGN);
                    }
                    if (!object2.contains(Blocks.WALL_SIGN)) {
                        object2.add(Blocks.WALL_SIGN);
                    }
                    0.f$d.world.field_147482_g.forEach(tileEntity -> {
                        if (tileEntity instanceof TileEntitySign) {
                            int n;
                            tileEntity = (TileEntitySign)tileEntity;
                            int n2 = n = 0;
                            while (n2 < 4) {
                                if (tileEntity.signText[n].getFormattedText().toLowerCase().contains(string)) {
                                    0.f$d.add(new OI(tileEntity.func_174877_v().func_177958_n(), tileEntity.func_174877_v().func_177956_o(), tileEntity.func_174877_v().func_177952_p()));
                                    return;
                                }
                                n2 = ++n;
                            }
                        }
                    });
                    if (0.f$d.isEmpty()) {
                        return "No signs found with that text.";
                    }
                    if (string2.equalsIgnoreCase("add")) {
                        0.f$d.forEach(arg_0 -> yi.f$E((Gb)object, arg_0));
                        yi yi2 = 0;
                        int n3 = yi2.f$d.size();
                        yi2.f$d.clear();
                        if (((Ba)object).f$E()) {
                            tI.f$E();
                        }
                        Object[] objectArray = new Object[5];
                        objectArray[0] = n3;
                        objectArray[1] = n3 > 1 ? "s" : "";
                        objectArray[2] = TextFormatting.WHITE;
                        objectArray[3] = string;
                        objectArray[4] = TextFormatting.GRAY;
                        return String.format("Added %s sign%s with the text %s\"%s\"%s to Search.", objectArray);
                    }
                    if (string2.equalsIgnoreCase("del")) break block12;
                    if (!string2.equalsIgnoreCase("remove")) break block13;
                }
                0.f$d.forEach(((Gb)object).f$g::remove);
                yi yi3 = 0;
                int n = yi3.f$d.size();
                yi3.f$d.clear();
                if (((Ba)object).f$E()) {
                    tI.f$E();
                }
                Object[] objectArray = new Object[5];
                objectArray[0] = n;
                objectArray[1] = n > 1 ? "s" : "";
                objectArray[2] = TextFormatting.WHITE;
                objectArray[3] = string;
                objectArray[4] = TextFormatting.GRAY;
                return String.format("Removed %s sign%s with the text %s\"%s\"%s to Search.", objectArray);
            }
            return "Invalid action.";
        }
        return null;
    }
}
 */
