package net.futureclient.client.deof.commands.commands;

import net.futureclient.client.*;
import net.futureclient.client.deof.commands.manager.CommandBase;

public class GrabCMD extends CommandBase {//TODO really needs some work.
    private final DecimalFormat f$d;
    private double f$M;
    private double f$i;
    private double f$g;

    public fi() {
        fi fi2;
        String[] stringArray = new String[3];
        stringArray[0] = "Grab";
        stringArray[1] = "grabip";
        stringArray[2] = "grabcoords";
        super(stringArray);
        fi fi3 = fi2;
        fi3.f$d = new DecimalFormat("0.#");
        kH.f$E().f$E().f$a(new cj(fi2));
    }

    public static Minecraft f$B(fi fi2) {
        return fi2.f$d;
    }

    public static double f$a(fi fi2, double d) {
        fi2.f$M = d;
        return fi2.f$M;
    }

    public static Minecraft f$E(fi fi2) {
        fi fi3;
        return fi3.f$d;
    }


     * Enabled aggressive block sorting

    @Override
    public String f$E(String[] object) {
        int n;
        block38: {
            if (((Object)object).length != 1) return null;
            object = ((String)object[0]).toLowerCase();
            int n2 = -1;
            switch (((String)object).hashCode()) {
                case 3373707: {
                    if (!((String)object).equals("name")) break;
                    n = n2 = 0;
                    break block38;
                }
                case 3381091: {
                    if (!((String)object).equals("nick")) break;
                    n = n2 = 1;
                    break block38;
                }
                case -265713450: {
                    if (!((String)object).equals("username")) break;
                    n = n2 = 2;
                    break block38;
                }
                case 70690926: {
                    if (!((String)object).equals("nickname")) break;
                    n = n2 = 3;
                    break block38;
                }
                case 3367: {
                    if (!((String)object).equals("ip")) break;
                    n = n2 = 4;
                    break block38;
                }
                case 105: {
                    if (!((String)object).equals("i")) break;
                    n = n2 = 5;
                    break block38;
                }
                case -905826493: {
                    if (!((String)object).equals("server")) break;
                    n = n2 = 6;
                    break block38;
                }
                case 1379104682: {
                    if (!((String)object).equals("serverip")) break;
                    n = n2 = 7;
                    break block38;
                }
                case -1354750946: {
                    if (!((String)object).equals("coords")) break;
                    n = n2 = 8;
                    break block38;
                }
                case 94845685: {
                    if (!((String)object).equals("coord")) break;
                    n = n2 = 9;
                    break block38;
                }
                case 1871919611: {
                    if (!((String)object).equals("coordinates")) break;
                    n = n2 = 10;
                    break block38;
                }
                case 198931832: {
                    if (!((String)object).equals("coordinate")) break;
                    n = n2 = 11;
                    break block38;
                }
                case 99: {
                    if (!((String)object).equals("c")) break;
                    n = n2 = 12;
                    break block38;
                }
                case -150073454: {
                    if (!((String)object).equals("deathcoords")) break;
                    n = n2 = 13;
                    break block38;
                }
                case -927836409: {
                    if (!((String)object).equals("deathcoordinates")) break;
                    n = n2 = 14;
                    break block38;
                }
                case 3199: {
                    if (!((String)object).equals("dc")) break;
                    n = n2 = 15;
                    break block38;
                }
                case 95457908: {
                    if (!((String)object).equals("death")) break;
                    n = n2 = 16;
                    break block38;
                }
                case -1112526474: {
                    if (!((String)object).equals("deathspot")) break;
                    n = n2 = 17;
                    break block38;
                }
                case -1386164858: {
                    if (!((String)object).equals("blocks")) break;
                    n = n2 = 18;
                    break block38;
                }
                case 93832333: {
                    if (!((String)object).equals("block")) break;
                    n = n2 = 19;
                    break block38;
                }
                case 106164915: {
                    if (!((String)object).equals("owner")) break;
                    n = n2 = 20;
                    break block38;
                }
                case -666719309: {
                    if (!((String)object).equals("mobowner")) break;
                    n = n2 = 21;
                    break block38;
                }
                case -1003854816: {
                    if (!((String)object).equals("owners")) break;
                    n = n2 = 22;
                    break block38;
                }
                case 806538016: {
                    if (!((String)object).equals("mobowners")) break;
                    n2 = 23;
                }
            }
            n = n2;
        }
        switch (n) {
            case 0:
            case 1:
            case 2:
            case 3: {
                object = ((Minecraft)0.f$d).player.func_70005_c_();
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection((String)object), null);
                return "Copied the selected type.";
            }
            case 4:
            case 5:
            case 6:
            case 7: {
                if (0.f$d.isSingleplayer()) {
                    return "You are in single player!";
                }
                if (0.f$d.getCurrentServerData() == null) return "Copied the selected type.";
                String string = 0.f$d.getCurrentServerData().serverIP;
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(string), null);
                return "Copied the selected type.";
            }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12: {
                String string = String.format("X: %s, Y: %s, Z: %s", (int)0.f$d.player.field_70165_t, (int)0.f$d.player.field_70163_u, (int)0.f$d.player.field_70161_v);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(string), null);
                return "Copied the selected type.";
            }
            case 13:
            case 14:
            case 15:
            case 16:
            case 17: {
                fi fi2 = 0;
                fi fi3 = 0;
                double d = Double.parseDouble(fi2.f$d.format(fi3.f$i).replaceAll(",", "."));
                double d2 = Double.parseDouble(fi3.f$d.format(0.f$M).replaceAll(",", "."));
                double d3 = Double.parseDouble(fi2.f$d.format(0.f$g).replaceAll(",", "."));
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(String.format("X: %s, Y: %s, Z: %s", d, d2, d3)), null);
                return "Copied the selected type.";
            }
            case 18:
            case 19: {
                StringJoiner stringJoiner = new StringJoiner("\n");
                Block.REGISTRY.func_148742_b().forEach(resourceLocation -> stringJoiner.add(resourceLocation.toString()));
                String string = String.format("Blocks (%s)\n%s", Block.REGISTRY.func_148742_b().size(), stringJoiner.toString());
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(string), null);
                return "Copied the selected type.";
            }
            case 20:
            case 21: {
                if (0.f$d.objectMouseOver.typeOfHit != RayTraceResult.Type.ENTITY) {
                    return "No entity found in crosshair.";
                }
                Entity entity = 0.f$d.objectMouseOver.entityHit;
                UUID uUID = Pg.f$E(entity);
                if (uUID == null) {
                    return "This entity has no owner.";
                }
                sh.f$E(() -> {
                    String string = VH.f$B(uUID);
                    0.f$d.addScheduledTask(() -> {
                        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(String.format("%s (%s)", string, uUID)), null);
                        La.f$E().f$E("Copied the selected type.");
                    });
                });
                return "Checking...";
            }
            case 22:
            case 23: {
                sh.f$E(() -> {
                    fi fi2;
                    StringJoiner stringJoiner = new StringJoiner("\n");
                    fi2.f$d.world.field_72996_f.stream().sorted(Pg.f$a()).forEach(entity -> {
                        UUID uUID = Pg.f$E(entity);
                        if (uUID == null) {
                            return;
                        }
                        String string = VH.f$B(uUID);
                        stringJoiner.add(String.format("[%sm] %s: %s (%s)", (double)Math.round(entity.getDistance((Entity)((Minecraft)0.f$d).player)) * 100.0 / 100.0, entity.getDisplayName().getUnformattedText(), string, uUID));
                    });
                    if (stringJoiner.length() <= 0) {
                        fi2.f$d.addScheduledTask(() -> La.f$E().f$E("No entities with owners in render distance."));
                        return;
                    }
                    fi2.f$d.addScheduledTask(() -> {
                        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(stringJoiner.toString()), null);
                        La.f$E().f$E("Copied the selected type.");
                    });
                });
                return "Checking...";
            }
        }
        return "Incorrect type.";
    }

    public static double f$e(fi fi2, double d) {
        fi2.f$i = d;
        return fi2.f$i;
    }

    public static double f$E(fi fi2, double d) {
        fi2.f$g = d;
        return fi2.f$g;
    }

    public static Minecraft f$a(fi fi2) {
        return fi2.f$d;
    }

    @Override
    public String f$E() {
        return "&e[ip|coords|deathcoords|name|blocks|mobowner(s)]";
    }

    public static Minecraft f$e(fi fi2) {
        return fi2.f$d;
    }
}
/*
public class fi
extends GA {
    private final DecimalFormat f$d;
    private double f$M;
    private double f$i;
    private double f$g;

    public fi() {
        fi fi2;
        String[] stringArray = new String[3];
        stringArray[0] = "Grab";
        stringArray[1] = "grabip";
        stringArray[2] = "grabcoords";
        super(stringArray);
        fi fi3 = fi2;
        fi3.f$d = new DecimalFormat("0.#");
        kH.f$E().f$E().f$a(new cj(fi2));
    }

    public static Minecraft f$B(fi fi2) {
        return fi2.f$d;
    }

    public static double f$a(fi fi2, double d) {
        fi2.f$M = d;
        return fi2.f$M;
    }

    public static Minecraft f$E(fi fi2) {
        fi fi3;
        return fi3.f$d;
    }


     * Enabled aggressive block sorting

@Override
public String f$E(String[] object) {
    int n;
    block38: {
        if (((Object)object).length != 1) return null;
        object = ((String)object[0]).toLowerCase();
        int n2 = -1;
        switch (((String)object).hashCode()) {
            case 3373707: {
                if (!((String)object).equals("name")) break;
                n = n2 = 0;
                break block38;
            }
            case 3381091: {
                if (!((String)object).equals("nick")) break;
                n = n2 = 1;
                break block38;
            }
            case -265713450: {
                if (!((String)object).equals("username")) break;
                n = n2 = 2;
                break block38;
            }
            case 70690926: {
                if (!((String)object).equals("nickname")) break;
                n = n2 = 3;
                break block38;
            }
            case 3367: {
                if (!((String)object).equals("ip")) break;
                n = n2 = 4;
                break block38;
            }
            case 105: {
                if (!((String)object).equals("i")) break;
                n = n2 = 5;
                break block38;
            }
            case -905826493: {
                if (!((String)object).equals("server")) break;
                n = n2 = 6;
                break block38;
            }
            case 1379104682: {
                if (!((String)object).equals("serverip")) break;
                n = n2 = 7;
                break block38;
            }
            case -1354750946: {
                if (!((String)object).equals("coords")) break;
                n = n2 = 8;
                break block38;
            }
            case 94845685: {
                if (!((String)object).equals("coord")) break;
                n = n2 = 9;
                break block38;
            }
            case 1871919611: {
                if (!((String)object).equals("coordinates")) break;
                n = n2 = 10;
                break block38;
            }
            case 198931832: {
                if (!((String)object).equals("coordinate")) break;
                n = n2 = 11;
                break block38;
            }
            case 99: {
                if (!((String)object).equals("c")) break;
                n = n2 = 12;
                break block38;
            }
            case -150073454: {
                if (!((String)object).equals("deathcoords")) break;
                n = n2 = 13;
                break block38;
            }
            case -927836409: {
                if (!((String)object).equals("deathcoordinates")) break;
                n = n2 = 14;
                break block38;
            }
            case 3199: {
                if (!((String)object).equals("dc")) break;
                n = n2 = 15;
                break block38;
            }
            case 95457908: {
                if (!((String)object).equals("death")) break;
                n = n2 = 16;
                break block38;
            }
            case -1112526474: {
                if (!((String)object).equals("deathspot")) break;
                n = n2 = 17;
                break block38;
            }
            case -1386164858: {
                if (!((String)object).equals("blocks")) break;
                n = n2 = 18;
                break block38;
            }
            case 93832333: {
                if (!((String)object).equals("block")) break;
                n = n2 = 19;
                break block38;
            }
            case 106164915: {
                if (!((String)object).equals("owner")) break;
                n = n2 = 20;
                break block38;
            }
            case -666719309: {
                if (!((String)object).equals("mobowner")) break;
                n = n2 = 21;
                break block38;
            }
            case -1003854816: {
                if (!((String)object).equals("owners")) break;
                n = n2 = 22;
                break block38;
            }
            case 806538016: {
                if (!((String)object).equals("mobowners")) break;
                n2 = 23;
            }
        }
        n = n2;
    }
    switch (n) {
        case 0:
        case 1:
        case 2:
        case 3: {
            object = ((Minecraft)0.f$d).player.func_70005_c_();
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection((String)object), null);
            return "Copied the selected type.";
        }
        case 4:
        case 5:
        case 6:
        case 7: {
            if (0.f$d.isSingleplayer()) {
                return "You are in single player!";
            }
            if (0.f$d.getCurrentServerData() == null) return "Copied the selected type.";
            String string = 0.f$d.getCurrentServerData().serverIP;
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(string), null);
            return "Copied the selected type.";
        }
        case 8:
        case 9:
        case 10:
        case 11:
        case 12: {
            String string = String.format("X: %s, Y: %s, Z: %s", (int)0.f$d.player.field_70165_t, (int)0.f$d.player.field_70163_u, (int)0.f$d.player.field_70161_v);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(string), null);
            return "Copied the selected type.";
        }
        case 13:
        case 14:
        case 15:
        case 16:
        case 17: {
            fi fi2 = 0;
            fi fi3 = 0;
            double d = Double.parseDouble(fi2.f$d.format(fi3.f$i).replaceAll(",", "."));
            double d2 = Double.parseDouble(fi3.f$d.format(0.f$M).replaceAll(",", "."));
            double d3 = Double.parseDouble(fi2.f$d.format(0.f$g).replaceAll(",", "."));
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(String.format("X: %s, Y: %s, Z: %s", d, d2, d3)), null);
            return "Copied the selected type.";
        }
        case 18:
        case 19: {
            StringJoiner stringJoiner = new StringJoiner("\n");
            Block.REGISTRY.func_148742_b().forEach(resourceLocation -> stringJoiner.add(resourceLocation.toString()));
            String string = String.format("Blocks (%s)\n%s", Block.REGISTRY.func_148742_b().size(), stringJoiner.toString());
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(string), null);
            return "Copied the selected type.";
        }
        case 20:
        case 21: {
            if (0.f$d.objectMouseOver.typeOfHit != RayTraceResult.Type.ENTITY) {
                return "No entity found in crosshair.";
            }
            Entity entity = 0.f$d.objectMouseOver.entityHit;
            UUID uUID = Pg.f$E(entity);
            if (uUID == null) {
                return "This entity has no owner.";
            }
            sh.f$E(() -> {
                String string = VH.f$B(uUID);
                0.f$d.addScheduledTask(() -> {
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(String.format("%s (%s)", string, uUID)), null);
                    La.f$E().f$E("Copied the selected type.");
                });
            });
            return "Checking...";
        }
        case 22:
        case 23: {
            sh.f$E(() -> {
                fi fi2;
                StringJoiner stringJoiner = new StringJoiner("\n");
                fi2.f$d.world.field_72996_f.stream().sorted(Pg.f$a()).forEach(entity -> {
                    UUID uUID = Pg.f$E(entity);
                    if (uUID == null) {
                        return;
                    }
                    String string = VH.f$B(uUID);
                    stringJoiner.add(String.format("[%sm] %s: %s (%s)", (double)Math.round(entity.getDistance((Entity)((Minecraft)0.f$d).player)) * 100.0 / 100.0, entity.getDisplayName().getUnformattedText(), string, uUID));
                });
                if (stringJoiner.length() <= 0) {
                    fi2.f$d.addScheduledTask(() -> La.f$E().f$E("No entities with owners in render distance."));
                    return;
                }
                fi2.f$d.addScheduledTask(() -> {
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(stringJoiner.toString()), null);
                    La.f$E().f$E("Copied the selected type.");
                });
            });
            return "Checking...";
        }
    }
    return "Incorrect type.";
}

    public static double f$e(fi fi2, double d) {
        fi2.f$i = d;
        return fi2.f$i;
    }

    public static double f$E(fi fi2, double d) {
        fi2.f$g = d;
        return fi2.f$g;
    }

    public static Minecraft f$a(fi fi2) {
        return fi2.f$d;
    }

    @Override
    public String f$E() {
        return "&e[ip|coords|deathcoords|name|blocks|mobowner(s)]";
    }

    public static Minecraft f$e(fi fi2) {
        return fi2.f$d;
    }
}
 */