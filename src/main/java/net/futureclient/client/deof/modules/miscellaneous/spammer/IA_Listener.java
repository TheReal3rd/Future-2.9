package net.futureclient.client.deof.modules.miscellaneous.spammer;

public class IA_Listener {
}
/*
package net.futureclient.client;

import java.io.File;
import java.util.ArrayList;
import java.util.stream.Collectors;
import net.futureclient.client.Ha;
import net.futureclient.client.La;
import net.futureclient.client.ME;
import net.futureclient.client.Nb;
import net.futureclient.client.kH;
import net.futureclient.client.kb;
import net.futureclient.client.s;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemBlock;

public class IA
extends Ha<ME> {
    public final kb f$d;

    public IA(kb kb2) {
        0.f$d = kb2;
    }

    @Override
    public void f$E(ME mE) {
        0.f$d.f$a(String.format("Spammer \u00a77[\u00a7F%s\u00a77]", kb.f$E(0.f$d).f$E()));
        if (kb.f$f().player == null) {
            return;
        }
        switch ((Nb)((Object)kb.f$E(0.f$d).f$E())) {
            case f$g: {
                if (kb.f$a(0.f$d) == null) {
                    kb.f$E(0.f$d, new ArrayList());
                    if (kb.f$L().getConnection() != null) {
                        kb.f$a(0.f$d).addAll(kb.f$i().getConnection().getPlayerInfoMap().stream().map(networkPlayerInfo -> networkPlayerInfo.getGameProfile().getName()).collect(Collectors.toList()));
                    }
                    kb.f$E(0.f$d, new int[]{0});
                }
                try {
                    if (((Boolean)kb.f$a(0.f$d).f$E()).booleanValue()) {
                        if (kb.f$E(0.f$d).f$E(((s)kb.f$E(0.f$d)).f$E().floatValue() * 1000.0f)) {
                            if (kb.f$a(0.f$d) != null && kb.f$a(0.f$d).size() > 1 && kb.f$a(0.f$d).get(kb.f$E(0.f$d)[0]) != null) {
                                String string = (String)kb.f$a(0.f$d).get(kb.f$E(0.f$d)[0]);
                                if (!string.equals(kb.f$c().player.func_70005_c_()) && !kH.f$E().f$E().f$E(string)) {
                                    kb.f$I().player.sendChatMessage(new StringBuilder().insert(0, "/p ").append(string).append(" You have been banned.").toString());
                                }
                                IA iA = 0;
                                int[] nArray = kb.f$E(iA.f$d);
                                nArray[0] = nArray[0] + 1;
                                kb.f$E(iA.f$d).f$E();
                            }
                            if (kb.f$E(0.f$d)[0] == kb.f$a(0.f$d).size()) {
                                La.f$E().f$E("Finished banning.");
                                0.f$d.f$E(false);
                            }
                        }
                        if (!(kb.f$j().currentScreen instanceof GuiChest)) return;
                        Slot slot = kb.f$M().player.field_71070_bA.getSlot(34);
                        if (!(slot.getStack().getItem() instanceof ItemBlock)) return;
                        if (((ItemBlock)slot.getStack().getItem()).getBlock() != Blocks.REDSTONE_BLOCK) return;
                        kb.f$H().playerController.windowClick(0, 34, 0, ClickType.PICKUP, (EntityPlayer)kb.f$C().player);
                        return;
                    }
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    indexOutOfBoundsException.printStackTrace();
                    return;
                }
                {
                    if (!kb.f$E(0.f$d).f$E(((s)kb.f$E(0.f$d)).f$E().floatValue() * 1000.0f)) return;
                    if (kb.f$a(0.f$d) != null && kb.f$a(0.f$d).size() > 1 && kb.f$a(0.f$d).get(kb.f$E(0.f$d)[0]) != null) {
                        String string = (String)kb.f$a(0.f$d).get(kb.f$E(0.f$d)[0]);
                        if (!string.equals(kb.f$h().player.func_70005_c_()) && !kH.f$E().f$E().f$E(string)) {
                            kb.f$A().player.sendChatMessage(new StringBuilder().insert(0, "/ban ").append(string).append(" banned").toString());
                        }
                        IA iA = 0;
                        int[] nArray = kb.f$E(iA.f$d);
                        nArray[0] = nArray[0] + 1;
                        kb.f$E(iA.f$d).f$E();
                    }
                    if (kb.f$E(0.f$d)[0] != kb.f$a(0.f$d).size()) return;
                    La.f$E().f$E("Finished banning.");
                    0.f$d.f$E(false);
                    return;
                }
            }
            case f$M: {
                File file;
                Slot slot;
                if (kb.f$E(0.f$d) == null) return;
                if (((Boolean)kb.f$a(0.f$d).f$E()).booleanValue() && kb.f$K().currentScreen instanceof GuiChest && (slot = kb.f$B().player.field_71070_bA.getSlot(34)).getStack().getItem() instanceof ItemBlock && ((ItemBlock)slot.getStack().getItem()).getBlock() == Blocks.REDSTONE_BLOCK) {
                    kb.f$a().playerController.windowClick(0, 34, 0, ClickType.PICKUP, (EntityPlayer)kb.f$e().player);
                }
                if (!(file = new File(kb.f$E(0.f$d))).exists() || kb.f$E(0.f$d).equals("")) {
                    0.f$d.f$E(false);
                    return;
                }
                if (kb.f$E(0.f$d) != null && (float)kb.f$E(0.f$d).f$e() < (float)kb.f$E(0.f$d).longValue() + ((s)kb.f$E(0.f$d)).f$E().floatValue() * 1000.0f) {
                    return;
                }
                try {
                    if (kb.f$E(0.f$d) == null) {
                        0.f$d.f$E(false);
                        return;
                    }
                    kb.f$E().player.sendChatMessage((String)kb.f$E(0.f$d).get(kb.f$E(0.f$d)));
                    IA iA = 0;
                    IA iA2 = 0;
                    kb.f$E(iA.f$d, kb.f$E(iA.f$d) + 1);
                    kb.f$E(0.f$d, kb.f$E(iA2.f$d).f$e());
                    if (kb.f$E(iA2.f$d) < kb.f$E(0.f$d).size()) return;
                    IA iA3 = 0;
                    if (((Boolean)kb.f$E(0.f$d).f$E()).booleanValue()) {
                        kb.f$E(iA3.f$d, 0);
                        return;
                    }
                    iA3.f$d.f$E(false);
                    return;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    indexOutOfBoundsException.printStackTrace();
                    return;
                }
            }
        }
    }
}
 */