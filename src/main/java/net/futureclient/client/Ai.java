package net.futureclient.client;

import java.lang.invoke.LambdaMetafactory;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;
import net.futureclient.client.AG;
import net.futureclient.client.GA;
import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.O;
import net.futureclient.client.U;
import net.futureclient.client.dF;
import net.futureclient.client.ha;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.ma;
import net.futureclient.client.n;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;

public class Ai extends Ha<dF> {
    public final AG f$d;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f$E(dF 0) {
        var2_2 = 0.f$E();
        if (!var2_2.startsWith(AG.f$E(0.f$d))) ** GOTO lbl56
        0.f$E(true);
        if (var2_2.startsWith(AG.f$E(0.f$d) + "say ") && !0.f$E().substring(5).isEmpty()) {
            Minecraft.getMinecraft().getConnection().sendPacket((Packet)new CPacketChatMessage(0.f$E().substring(5)));
            return;
        }
        var3_4 = false;
        v0 = var2_2;
        var4_5 = v0.trim().substring(AG.f$E(0.f$d).length()).trim();
        var5_6 = v0.trim().contains(" ");
        v1 = var5_6 ? var4_5.split(" ")[0] : (var6_8 = var4_5.trim());
        var5_7 = var5_6 ? var4_5.substring(var6_8.length()).trim().split(" ") : new String[]{};
        v2 = var2_2;
        var4_5 = v2.split(" ");
        if (v2.length() < 1) {
            La.f$E().f$E("No command was entered.");
            return;
        }
        var6_8 = var2_2.contains(" ") != false ? var4_5[0] : var2_2;
        var7_9 = 0.f$d.f$E().iterator();
        block69: while (true) {
            if (!var7_9.hasNext()) {
                var7_9 = var2_2.split(" ");
                var8_10 = kH.f$E().f$E().f$E().iterator();
                break;
            }
            var8_10 = (GA)var7_9.next();
            var9_11 = var8_10.f$E();
            var10_14 = var9_11.length;
            v3 = var11_16 = 0;
            while (true) {
                if (v3 >= var10_14) continue block69;
                var12_17 = var9_11[var11_16];
                if (var6_8.replace(0.f$d.f$E(), "").equalsIgnoreCase(var12_17.replaceAll(" ", ""))) {
                    var3_4 = true;
                    try {
                        var13_19 = var8_10.f$E((String[])var5_7);
                        if (!var13_19.equals("")) {
                            La.f$E().f$E(var13_19);
                        }
                    }
                    catch (Exception var13_20) {
                        La.f$E().f$E(String.format("%s%s %s", new Object[]{AG.f$E(0.f$d), var12_17.toLowerCase(), var8_10.f$E()}));
                    }
                }
                v3 = ++var11_16;
            }
            break;
        }
        block71: while (true) {
            block114: {
                if (var8_10.hasNext()) break block114;
                if (!var3_4) {
                    La.f$E().f$E("Invalid command.");
                }
lbl56:
                // 4 sources

                return;
            }
            var9_13 = (ma)var8_10.next();
            var10_15 = var9_13.f$E();
            var11_16 = var10_15.length;
            v4 = var12_18 = 0;
            while (true) {
                block113: {
                    if (v4 >= var11_16) continue block71;
                    var13_19 = var10_15[var12_18];
                    try {
                        block117: {
                            block115: {
                                block122: {
                                    block121: {
                                        block118: {
                                            block120: {
                                                block119: {
                                                    block116: {
                                                        if (!var7_9[0].equalsIgnoreCase(new StringBuilder().insert(0, 0.f$d.f$E()).append(var13_19.replace(" ", "")).toString())) break block113;
                                                        var3_4 = true;
                                                        if (var7_9.length <= 1) break block115;
                                                        var2_2 = var7_9[1];
                                                        var5_7 = var9_13.f$E(var2_2);
                                                        if (var5_7 == null) {
                                                            if (var2_2.equalsIgnoreCase("list")) {
                                                                if (var9_13.f$a().size() > 0) {
                                                                    var6_8 = new StringJoiner(", ");
                                                                    v5 = var14_21 = var9_13.f$a().iterator();
                                                                    while (true) {
                                                                        if (!v5.hasNext()) {
                                                                            La.f$E().f$E(String.format("Properties (%s) %s.", new Object[]{var9_13.f$a().size(), var6_8.toString()}));
                                                                            return;
                                                                        }
                                                                        var15_22 = var14_21.next();
                                                                        var16_27 = var15_22.f$E();
                                                                        if (var15_22 instanceof O) {
                                                                            var16_27 = ((List)var16_27).size();
                                                                        }
                                                                        var6_8.add(String.format("%s &a(%s)&7", new Object[]{var15_22.f$E()[0], var16_27}));
                                                                        v5 = var14_21;
                                                                    }
                                                                }
                                                                La.f$E().f$E(String.format("&e%s&7 has no properties.", new Object[]{var9_13.f$E()[0]}));
                                                            }
                                                            return;
                                                        }
                                                        if (var5_7.f$E() instanceof Number) {
                                                            if (var5_7.f$E() instanceof Double) {
                                                                var5_7.f$E(Double.parseDouble(var7_9[2]));
                                                            }
                                                            if (var5_7.f$E() instanceof Integer) {
                                                                var5_7.f$E(Integer.parseInt(var7_9[2]));
                                                            }
                                                            if (var5_7.f$E() instanceof Float) {
                                                                var5_7.f$E(Float.valueOf(Float.parseFloat(var7_9[2])));
                                                            }
                                                            if (var5_7.f$E() instanceof Long) {
                                                                var5_7.f$E(Long.parseLong(var7_9[2]));
                                                            }
                                                            La.f$E().f$E(String.format("%s has been set to %s for %s.", new Object[]{var5_7.f$E()[0], var5_7.f$E(), var9_13.f$E()[0]}));
                                                            break block113;
                                                        }
                                                        if (!(var5_7.f$E() instanceof Enum)) break block116;
                                                        var6_8 = (ka)var5_7;
                                                        if (!var7_9[2].equalsIgnoreCase("list")) {
                                                            var6_8.f$E(var7_9[2]);
                                                            La.f$E().f$E(String.format("%s has been set to %s for %s.", new Object[]{var5_7.f$E()[0], var5_7.f$E(), var9_13.f$E()[0]}));
                                                            break block113;
                                                        }
                                                        var14_21 = new StringJoiner(", ");
                                                        var15_23 = var6_8.f$E();
                                                        var16_27 = var15_23;
                                                        var17_28 = ((T)var16_27).length;
                                                        v6 = var18_32 = 0;
                                                        break block117;
                                                    }
                                                    v7 = var5_7;
                                                    if (var5_7.f$E() instanceof String) {
                                                        v7.f$E(var7_9[2]);
                                                        La.f$E().f$E(String.format("%s has been set to \"%s\" for %s.", new Object[]{var5_7.f$E()[0], var5_7.f$E(), var9_13.f$E()[0]}));
                                                        break block113;
                                                    }
                                                    if (!(v7.f$E() instanceof Boolean)) break block118;
                                                    if (var4_5.length < 3) break block119;
                                                    if (var4_5[2].toLowerCase().contains("activ")) ** GOTO lbl-1000
                                                    if (var4_5[2].toLowerCase().contains("on")) ** GOTO lbl-1000
                                                    if (var4_5[2].toLowerCase().contains("enable")) ** GOTO lbl-1000
                                                    if (var4_5[2].toLowerCase().contains("true")) lbl-1000:
                                                    // 4 sources

                                                    {
                                                        v8 = true;
                                                    } else {
                                                        v8 = false;
                                                    }
                                                    var5_7.f$E(v8);
                                                    break block120;
                                                }
                                                v9 = var5_7;
                                                v9.f$E((Boolean)v9.f$E() == false);
                                            }
                                            v10 = new Object[3];
                                            v10[0] = var5_7.f$E()[0];
                                            v10[1] = ((Boolean)var5_7.f$E()).booleanValue() ? "&aon" : "&coff";
                                            v10[2] = var9_13.f$E()[0];
                                            La.f$E().f$E(String.format("%s toggled %s&7 for %s.", v10));
                                            break block113;
                                        }
                                        if (!(var5_7 instanceof n)) break block121;
                                        var6_8 = (n)var5_7;
                                        var14_21 = (List)var6_8.f$E();
                                        var15_24 = 2;
                                        switch (var4_5.length - 2) {
                                            case 1: {
                                                var16_27 = var4_5[2].toLowerCase();
                                                var17_28 = -1;
                                                switch (var16_27.hashCode()) {
                                                    case 3322014: {
                                                        if (!var16_27.equals("list")) break;
                                                        v11 = var17_28 = 0;
                                                        ** GOTO lbl176
                                                    }
                                                    case 94746189: {
                                                        if (!var16_27.equals("clear")) break;
                                                        var17_28 = 1;
                                                    }
                                                }
                                                v11 = var17_28;
lbl176:
                                                // 2 sources

                                                switch (v11) {
                                                    case 0: {
                                                        var18_33 = new StringJoiner(", ");
                                                        var14_21.forEach((Consumer<Item>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, f$E(java.util.StringJoiner net.minecraft.item.Item ), (Lnet/minecraft/item/Item;)V)((StringJoiner)var18_33));
                                                        La.f$E().f$E(String.format("Items [%s%s%s]: %s.", new Object[]{TextFormatting.WHITE, var14_21.size(), TextFormatting.GRAY, var18_33.toString()}));
                                                        return;
                                                    }
                                                    case 1: {
                                                        var14_21.clear();
                                                        La.f$E().f$E("Cleared list.");
                                                        return;
                                                    }
                                                }
                                                La.f$E().f$E("Invalid action.");
                                                return;
                                            }
                                            case 2: {
                                                var16_27 = var4_5[3].toLowerCase();
                                                if (!var16_27.contains(":")) {
                                                    var16_27 = new StringBuilder().insert(0, "minecraft:").append((String)var16_27).toString();
                                                }
                                                if ((var17_29 = Item.getByNameOrId((String)var16_27)) == null) {
                                                    La.f$E().f$E("Item does not exist.");
                                                    return;
                                                }
                                            }
                                            var18_34 = new StringBuilder().insert(0, "Item{").append(Item.REGISTRY.getNameForObject((Object)var17_29)).append("}").toString();
                                            var19_39 = var4_5[2].toLowerCase();
                                            var20_42 = -1;
                                            switch (var19_39.hashCode()) {
                                                case 96417: {
                                                    if (!var19_39.equals("add")) break;
                                                    v12 = var20_42 = 0;
                                                    ** GOTO lbl223
                                                }
                                                case 99339: {
                                                    if (!var19_39.equals("del")) break;
                                                    v12 = var20_42 = 1;
                                                    ** GOTO lbl223
                                                }
                                                case -934610812: {
                                                    if (!var19_39.equals("remove")) break;
                                                    var20_42 = 2;
                                                }
                                            }
                                            v12 = var20_42;
lbl223:
                                            // 3 sources

                                            switch (v12) {
                                                case 0: {
                                                    if (var14_21.contains(var17_29)) {
                                                        La.f$E().f$E(String.format("%s%s%s is in the list.", new Object[]{TextFormatting.WHITE, var18_34, TextFormatting.GRAY}));
                                                        return;
                                                    }
                                                    var14_21.add(var17_29);
                                                    La.f$E().f$E(String.format("Added %s%s%s to the list.", new Object[]{TextFormatting.WHITE, var18_34, TextFormatting.GRAY}));
                                                    return;
                                                }
                                                case 1: 
                                                case 2: {
                                                    if (!var14_21.contains(var17_29)) {
                                                        La.f$E().f$E(String.format("%s%s%s is not in the list.", new Object[]{TextFormatting.WHITE, var18_34, TextFormatting.GRAY}));
                                                        return;
                                                    }
                                                    var14_21.remove(var17_29);
                                                    La.f$E().f$E(String.format("Removed %s%s%s from the list.", new Object[]{TextFormatting.WHITE, var18_34, TextFormatting.GRAY}));
                                                    return;
                                                }
                                            }
                                            La.f$E().f$E("Invalid action.");
                                            return;
                                        }
                                        La.f$E().f$E("&e[list|clear] &7| &e[add|del] [itemName]");
                                        return;
                                    }
                                    if (!(var5_7 instanceof U)) break block122;
                                    var6_8 = (U)var5_7;
                                    var14_21 = (List)var6_8.f$E();
                                    var15_25 = 2;
                                    switch (var4_5.length - 2) {
                                        case 1: {
                                            System.out.println(var4_5[2].toLowerCase());
                                            var16_27 = var4_5[2].toLowerCase();
                                            var17_28 = -1;
                                            switch (var16_27.hashCode()) {
                                                case 3322014: {
                                                    if (!var16_27.equals("list")) break;
                                                    v13 = var17_28 = 0;
                                                    ** GOTO lbl274
                                                }
                                                case 94746189: {
                                                    if (!var16_27.equals("clear")) break;
                                                    var17_28 = 1;
                                                }
                                            }
                                            v13 = var17_28;
lbl274:
                                            // 2 sources

                                            switch (v13) {
                                                case 0: {
                                                    var18_35 = new StringJoiner(", ");
                                                    var14_21.forEach((Consumer<Block>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, f$E(java.util.StringJoiner net.minecraft.block.Block ), (Lnet/minecraft/block/Block;)V)((StringJoiner)var18_35));
                                                    La.f$E().f$E(String.format("Blocks [%s%s%s]: %s.", new Object[]{TextFormatting.WHITE, var14_21.size(), TextFormatting.GRAY, var18_35.toString()}));
                                                    return;
                                                }
                                                case 1: {
                                                    var14_21.clear();
                                                    La.f$E().f$E("Cleared list.");
                                                    return;
                                                }
                                            }
                                            La.f$E().f$E("Invalid action.");
                                            return;
                                        }
                                        case 2: {
                                            var16_27 = var4_5[3].toLowerCase();
                                            if (!var16_27.contains(":")) {
                                                var16_27 = new StringBuilder().insert(0, "minecraft:").append((String)var16_27).toString();
                                            }
                                            if ((var17_30 = Block.getBlockFromName((String)var16_27)) == null) {
                                                La.f$E().f$E("Block does not exist.");
                                                return;
                                            }
                                            var18_36 = var4_5[2].toLowerCase();
                                            var19_40 = -1;
                                            switch (var18_36.hashCode()) {
                                                case 96417: {
                                                    if (!var18_36.equals("add")) break;
                                                    v14 = var19_40 = 0;
                                                    ** GOTO lbl320
                                                }
                                                case 99339: {
                                                    if (!var18_36.equals("del")) break;
                                                    v14 = var19_40 = 1;
                                                    ** GOTO lbl320
                                                }
                                                case -934610812: {
                                                    if (!var18_36.equals("remove")) break;
                                                    var19_40 = 2;
                                                }
                                            }
                                            v14 = var19_40;
lbl320:
                                            // 3 sources

                                            switch (v14) {
                                                case 0: {
                                                    if (var14_21.contains(var17_30)) {
                                                        La.f$E().f$E(String.format("%s%s%s is in the list.", new Object[]{TextFormatting.WHITE, var17_30, TextFormatting.GRAY}));
                                                        return;
                                                    }
                                                    var14_21.add(var17_30);
                                                    La.f$E().f$E(String.format("Added %s%s%s to the list.", new Object[]{TextFormatting.WHITE, var17_30, TextFormatting.GRAY}));
                                                    return;
                                                }
                                                case 1: 
                                                case 2: {
                                                    if (!var14_21.contains(var17_30)) {
                                                        La.f$E().f$E(String.format("%s%s%s is not in the list.", new Object[]{TextFormatting.WHITE, var17_30, TextFormatting.GRAY}));
                                                        return;
                                                    }
                                                    var14_21.remove(var17_30);
                                                    La.f$E().f$E(String.format("Removed %s%s%s from the list.", new Object[]{TextFormatting.WHITE, var17_30, TextFormatting.GRAY}));
                                                    return;
                                                }
                                            }
                                            La.f$E().f$E("Invalid action.");
                                            return;
                                        }
                                    }
                                    La.f$E().f$E("&e[list|clear] &7| &e[add|del] [blockName]");
                                    return;
                                }
                                if (!(var5_7 instanceof ha)) break block113;
                                var6_8 = (ha)var5_7;
                                var14_21 = (List)var6_8.f$E();
                                var15_26 = 2;
                                switch (var4_5.length - 2) {
                                    case 1: {
                                        var16_27 = var4_5[2].toLowerCase();
                                        var17_28 = -1;
                                        switch (var16_27.hashCode()) {
                                            case 3322014: {
                                                if (!var16_27.equals("list")) break;
                                                v15 = var17_28 = 0;
                                                ** GOTO lbl370
                                            }
                                            case 94746189: {
                                                if (!var16_27.equals("clear")) break;
                                                var17_28 = 1;
                                            }
                                        }
                                        v15 = var17_28;
lbl370:
                                        // 2 sources

                                        switch (v15) {
                                            case 0: {
                                                var18_37 = new StringJoiner(", ");
                                                var14_21.forEach((Consumer<IBlockState>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, f$E(java.util.StringJoiner net.minecraft.block.state.IBlockState ), (Lnet/minecraft/block/state/IBlockState;)V)((StringJoiner)var18_37));
                                                La.f$E().f$E(String.format("Blocks [%s%s%s]: %s.", new Object[]{TextFormatting.WHITE, var14_21.size(), TextFormatting.GRAY, var18_37.toString()}));
                                                return;
                                            }
                                            case 1: {
                                                var14_21.clear();
                                                La.f$E().f$E("Cleared list.");
                                                return;
                                            }
                                        }
                                        La.f$E().f$E("Invalid action.");
                                        return;
                                    }
                                    case 2: {
                                        var16_27 = var4_5[3].toLowerCase();
                                        if (!var16_27.contains(":")) {
                                            var16_27 = new StringBuilder().insert(0, "minecraft:").append((String)var16_27).toString();
                                        }
                                        if ((var17_31 = Block.getBlockFromName((String)var16_27)) == null) {
                                            La.f$E().f$E("Block does not exist.");
                                            return;
                                        }
                                        var18_38 = var17_31.getDefaultState();
                                        var19_39 = var14_21.iterator();
                                        while (var19_39.hasNext()) {
                                            var20_41 = (IBlockState)var19_39.next();
                                            if (!var20_41.getBlock().equals(var17_31)) continue;
                                            var18_38 = var20_41;
                                            v16 = var4_5;
                                            ** GOTO lbl406
                                        }
                                        v16 = var4_5;
lbl406:
                                        // 2 sources

                                        var19_39 = v16[2].toLowerCase();
                                        var20_43 = -1;
                                        switch (var19_39.hashCode()) {
                                            case 96417: {
                                                if (!var19_39.equals("add")) break;
                                                v17 = var20_43 = 0;
                                                ** GOTO lbl425
                                            }
                                            case 99339: {
                                                if (!var19_39.equals("del")) break;
                                                v17 = var20_43 = 1;
                                                ** GOTO lbl425
                                            }
                                            case -934610812: {
                                                if (!var19_39.equals("remove")) break;
                                                var20_43 = 2;
                                            }
                                        }
                                        v17 = var20_43;
lbl425:
                                        // 3 sources

                                        switch (v17) {
                                            case 0: {
                                                if (var14_21.contains(var18_38)) {
                                                    La.f$E().f$E(String.format("%s%s%s is in the list.", new Object[]{TextFormatting.WHITE, var17_31, TextFormatting.GRAY}));
                                                    return;
                                                }
                                                var14_21.add(var18_38);
                                                La.f$E().f$E(String.format("Added %s%s%s to the list.", new Object[]{TextFormatting.WHITE, var17_31, TextFormatting.GRAY}));
                                                return;
                                            }
                                            case 1: 
                                            case 2: {
                                                if (!var14_21.contains(var18_38)) {
                                                    La.f$E().f$E(String.format("%s%s%s is not in the list.", new Object[]{TextFormatting.WHITE, var17_31, TextFormatting.GRAY}));
                                                    return;
                                                }
                                                var14_21.remove(var18_38);
                                                La.f$E().f$E(String.format("Removed %s%s%s from the list.", new Object[]{TextFormatting.WHITE, var17_31, TextFormatting.GRAY}));
                                                return;
                                            }
                                        }
                                        La.f$E().f$E("Invalid action.");
                                        return;
                                    }
                                }
                                La.f$E().f$E("&e[list|clear] &7| &e[add|del] [blockName]");
                                return;
                            }
                            La.f$E().f$E(String.format("%s &e[list|valuename]", new Object[]{var7_9[0]}));
                        }
                        while (v6 < var17_28) {
                            var19_39 = var16_27[var18_32];
                            v18 = new Object[2];
                            v18[0] = var19_39.name().equalsIgnoreCase(var5_7.f$E().toString()) ? "&a" : "&c";
                            v18[1] = var19_39.name();
                            var14_21.add(String.format("%s%s&7", v18));
                            v6 = ++var18_32;
                        }
                        La.f$E().f$E(String.format("%ss (%s) %s.", new Object[]{var5_7.f$E()[0], ((T)var15_23).length, var14_21.toString()}));
                    }
                    catch (Exception var2_3) {
                        v19 = new Object[1];
                        v19[0] = var2_3.getMessage().replaceFirst("F", "f");
                        La.f$E().f$E(String.format("Invalid argument %s.", v19));
                    }
                }
                v4 = ++var12_18;
            }
            break;
        }
    }

    private static void f$E(StringJoiner stringJoiner, Item item) {
        ResourceLocation resourceLocation = (ResourceLocation)Item.REGISTRY.getNameForObject((Object)item);
        Object[] objectArray = new Object[4];
        objectArray[0] = I18n.translateToLocal((String)item.getUnlocalizedName());
        objectArray[1] = TextFormatting.WHITE;
        objectArray[2] = resourceLocation != null ? resourceLocation.toString() : "unknown";
        objectArray[3] = TextFormatting.GRAY;
        stringJoiner.add(String.format("%s [%s%s%s]", objectArray));
    }

    private static void f$E(StringJoiner stringJoiner, IBlockState iBlockState) {
        Block block = iBlockState.getBlock();
        stringJoiner.add(String.format("%s [%s%s%s]", block.getLocalizedName(), TextFormatting.WHITE, ((ResourceLocation)Block.REGISTRY.getNameForObject((Object)block)).toString(), TextFormatting.GRAY));
    }

    private static void f$E(StringJoiner stringJoiner, Block block) {
        stringJoiner.add(String.format("%s [%s%s%s]", block.getLocalizedName(), TextFormatting.WHITE, ((ResourceLocation)Block.REGISTRY.getNameForObject((Object)block)).toString(), TextFormatting.GRAY));
    }

    public Ai(AG aG) {
        0.f$d = aG;
    }
}
package net.futureclient.client;

import net.futureclient.client.FG;
import net.futureclient.client.ka;

public class AI {
    public ka<FG> f$g;
    private static AI f$M;
    public int f$d;

    public AI() {
        AI aI;
        AI aI2 = aI;
        aI2.f$g = new ka<FG>(FG.f$g, new String[0]);
    }

    public static AI f$E() {
        return f$M;
    }

    static {
        f$M = new AI();
    }

    public String f$E() {
        return "pwned by the ccc. hi from crystallinqq, mastercooker and tigermouthbear!";
    }
}
package net.futureclient.client;

import net.futureclient.client.R;

public class ai
implements R {
    private int f$E(String string, String string2) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < string.length()) {
            if (string.charAt(n) != string2.charAt(n)) {
                ++n2;
            }
            n3 = ++n;
        }
        return n2 /= 2;
    }

    private String f$E(String string, String string2, int n) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder(string2);
        int n3 = n2 = 0;
        while (n3 < string.length()) {
            char c = string.charAt(n2);
            boolean bl = false;
            boolean bl2 = bl;
            for (int i = Math.max(0, n2 - n); !bl2 && i < Math.min(n2 + n, string2.length()); ++i) {
                if (stringBuilder2.charAt(i) == c) {
                    bl = true;
                    stringBuilder.append(c);
                    stringBuilder2.setCharAt(i, '*');
                }
                bl2 = bl;
            }
            n3 = ++n2;
        }
        return stringBuilder.toString();
    }

    @Override
    public double f$E(String 0322, String 022) {
        ai ai2;
        String string;
        String string2;
        String string3;
        if (0322.length() > 022.length()) {
            string3 = 0322.toLowerCase();
            string = string2 = 022.toLowerCase();
        } else {
            string3 = 022.toLowerCase();
            string = string2 = 0322.toLowerCase();
        }
        int 0322 = string.length() / 2 + 1;
        ai ai3 = ai2;
        String 022 = ai3.f$E(string2, string3, 0322);
        String 0322 = ai3.f$E(string3, string2, 0322);
        if (022.length() == 0 || 0322.length() == 0) {
            return 0.0;
        }
        if (022.length() != 0322.length()) {
            return 0.0;
        }
        int n = ai2.f$E(022, 0322);
        return ((double)022.length() / (double)string2.length() + (double)0322.length() / (double)string3.length() + (double)(022.length() - n) / (double)022.length()) / 3.0;
    }

    public ai() {
        ai ai2;
    }
}
