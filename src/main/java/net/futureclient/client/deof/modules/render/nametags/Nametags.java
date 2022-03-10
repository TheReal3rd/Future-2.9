package net.futureclient.client.deof.modules.render.nametags;

public class Nametags {
}
/*
package net.futureclient.client;

import java.awt.Color;
import java.util.Iterator;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Uh;
import net.futureclient.client.gF;
import net.futureclient.client.jB;
import net.futureclient.client.kH;
import net.futureclient.client.nc;
import net.futureclient.client.s;
import net.futureclient.client.vH;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class OB
extends Ba {
    private z<Boolean> f$g;
    private z<Boolean> f$e;
    private z<Boolean> f$I;
    private z<Boolean> f$j;
    private z<Boolean> f$K;
    private z<Boolean> f$b;
    public s f$d;
    private z<Boolean> f$M;
    private z<Boolean> f$i;

    public static Minecraft f$e() {
        return f$d;
    }

    private String f$E(EntityPlayer object) {
        StringBuilder stringBuilder;
        double d;
        boolean bl;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(kH.f$E().f$E().f$E(object.getName()) ? kH.f$E().f$E().f$E(object.getName()).f$a() : object.getDisplayName().getFormattedText().trim());
        boolean bl2 = bl = stringBuilder2.toString().replaceAll("\u00a7.", "").length() > 0;
        if (0.f$i.f$E().booleanValue()) {
            Object[] objectArray = new Object[2];
            objectArray[0] = bl ? " " : "";
            objectArray[1] = object.func_145782_y();
            stringBuilder2.append(String.format("%sID: %s", objectArray));
            bl = true;
        }
        if (0.f$M.f$E().booleanValue()) {
            Object[] objectArray = new Object[2];
            Object object2 = bl ? " " : (objectArray[0] = "");
            objectArray[1] = object.isCreative() ? "C" : (object.isSpectator() ? "I" : "S");
            stringBuilder2.append(String.format("%s[%s]", objectArray));
            bl = true;
        }
        if (0.f$g.f$E().booleanValue() && f$d.getConnection() != null && f$d.getConnection().getPlayerInfo(object.func_110124_au()) != null) {
            Object[] objectArray = new Object[2];
            objectArray[0] = bl ? " " : "";
            objectArray[1] = f$d.getConnection().getPlayerInfo(object.func_110124_au()).getResponseTime();
            stringBuilder2.append(String.format("%s%sms", objectArray));
            bl = true;
        }
        if (!0.f$b.f$E().booleanValue()) {
            return stringBuilder2.toString();
        }
        double d2 = Math.ceil(object.func_110143_aJ() + object.getAbsorptionAmount());
        if (d > 18.0) {
            object = "\u00a7a";
            stringBuilder = stringBuilder2;
        } else if (d2 > 16.0) {
            object = "\u00a72";
            stringBuilder = stringBuilder2;
        } else if (d2 > 12.0) {
            object = "\u00a7e";
            stringBuilder = stringBuilder2;
        } else if (d2 > 8.0) {
            object = "\u00a76";
            stringBuilder = stringBuilder2;
        } else if (d2 > 5.0) {
            object = "\u00a7c";
            stringBuilder = stringBuilder2;
        } else {
            object = "\u00a74";
            stringBuilder = stringBuilder2;
        }
        Object[] objectArray = new Object[3];
        objectArray[0] = bl ? " " : "";
        objectArray[1] = object;
        objectArray[2] = d2 > 0.0 ? Integer.valueOf((int)d2) : "0";
        stringBuilder.append(String.format("%s%s%s", objectArray));
        return stringBuilder2.toString();
    }

    private void f$E(ItemStack object2, int 022, int n) {
        GlStateManager.scale((float)0.5f, (float)0.5f, (float)0.5f);
        GlStateManager.disableDepth();
        Object object2 = object2.getDisplayName();
        gF 022 = (gF)kH.f$E().f$E().f$E(gF.class);
        if (022 != null && 022.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            gF gF2 = 022;
            Object object3 = object2;
            gF2.f$L.f$E((String)object3, (double)(-gF2.f$L.f$E((String)object3) / 2), (double)n, -1);
            GlStateManager.disableBlend();
        } else {
            Object object4 = object2;
            ((Minecraft)OB.f$d).fontRenderer.drawStringWithShadow((String)object4, (float)(-((Minecraft)OB.f$d).fontRenderer.getStringWidth((String)object4) / 2), (float)n, -1);
        }
        GlStateManager.enableDepth();
        GlStateManager.scale((float)2.0f, (float)2.0f, (float)2.0f);
    }

    private void f$E(ItemStack itemStack, int n, int n2, int n3) {
        GlStateManager.pushMatrix();
        GlStateManager.depthMask((boolean)true);
        GlStateManager.clear((int)256);
        RenderHelper.enableStandardItemLighting();
        OB.f$d.getRenderItem().zLevel = -150.0f;
        GlStateManager.disableAlpha();
        GlStateManager.enableDepth();
        GlStateManager.disableCull();
        int n4 = n3 > 4 ? (n3 - 4) * 8 / 2 : 0;
        f$d.getRenderItem().renderItemAndEffectIntoGUI(itemStack, n, n2 + n4);
        f$d.getRenderItem().renderItemOverlays(((Minecraft)OB.f$d).fontRenderer, itemStack, n, n2 + n4);
        OB.f$d.getRenderItem().zLevel = 0.0f;
        RenderHelper.disableStandardItemLighting();
        GlStateManager.enableCull();
        GlStateManager.enableAlpha();
        GlStateManager.scale((float)0.5f, (float)0.5f, (float)0.5f);
        GlStateManager.disableDepth();
        0.f$e(itemStack, n, n2 - 24);
        GlStateManager.enableDepth();
        GlStateManager.scale((float)2.0f, (float)2.0f, (float)2.0f);
        GlStateManager.popMatrix();
    }

    public static z f$E(OB oB) {
        return oB.f$j;
    }

    public OB() {
        OB oB;
        String[] stringArray = new String[5];
        stringArray[0] = "Nametags";
        stringArray[1] = "anematags";
        stringArray[2] = "tags";
        stringArray[3] = "tag";
        stringArray[4] = "nt";
        super("Nametags", stringArray, true, -10333473, JD.f$i);
        OB oB2 = oB;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Armor";
        stringArray2[1] = "a";
        oB2.f$e = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Durability";
        stringArray3[1] = "Dura";
        stringArray3[2] = "Durabil";
        stringArray3[3] = "Dur";
        oB.f$I = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[8];
        stringArray4[0] = "ItemName";
        stringArray4[1] = "ItemNames";
        stringArray4[2] = "Items";
        stringArray4[3] = "Itemname";
        stringArray4[4] = "ItemID";
        stringArray4[5] = "ItemIDs";
        stringArray4[6] = "Ietm";
        stringArray4[7] = "Names";
        oB.f$K = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[2];
        stringArray5[0] = "Health";
        stringArray5[1] = "h";
        oB.f$b = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[4];
        stringArray6[0] = "Invisibles";
        stringArray6[1] = "Invis";
        stringArray6[2] = "invisible";
        stringArray6[3] = "Inv";
        oB.f$j = new z<Boolean>(false, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "EntityID";
        stringArray7[1] = "EntityID";
        stringArray7[2] = "EID";
        stringArray7[3] = "ID";
        oB.f$i = new z<Boolean>(false, stringArray7);
        String[] stringArray8 = new String[7];
        stringArray8[0] = "GameMode";
        stringArray8[1] = "Game";
        stringArray8[2] = "Mode";
        stringArray8[3] = "GM";
        stringArray8[4] = "Creative";
        stringArray8[5] = "Survival";
        stringArray8[6] = "Spectator";
        oB.f$M = new z<Boolean>(false, stringArray8);
        String[] stringArray9 = new String[4];
        stringArray9[0] = "Ping";
        stringArray9[1] = "Response";
        stringArray9[2] = "ResponseTime";
        stringArray9[3] = "Peng";
        oB.f$g = new z<Boolean>(false, stringArray9);
        String[] stringArray10 = new String[3];
        stringArray10[0] = "Scaling";
        stringArray10[1] = "scale";
        stringArray10[2] = "s";
        oB.f$d = new s((Number)Float.valueOf(0.003f), (Number)Float.valueOf(0.001f), (Number)Float.valueOf(0.01f), 0.001, stringArray10);
        oB.f$E(oB.f$e, oB.f$I, oB.f$K, oB.f$b, oB.f$d, oB.f$j, oB.f$i, oB.f$M, oB.f$g);
        oB.f$E(new jB(oB), new nc(oB));
    }

    private int f$E(EntityPlayer entityPlayer) {
        int n = -1;
        if (kH.f$E().f$E().f$E(entityPlayer.getName())) {
            return -10027009;
        }
        if (entityPlayer.func_82150_aj()) {
            n = -56064;
            return -56064;
        }
        if (f$d.getConnection() != null && f$d.getConnection().getPlayerInfo(entityPlayer.func_110124_au()) == null) {
            n = -1113785;
            return -1113785;
        }
        if (entityPlayer.func_70093_af()) {
            n = 0xFF9900;
        }
        return n;
    }

    private void f$e(ItemStack itemStack, int n, int n2) {
        Iterator iterator;
        int n3 = -1;
        gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
        Iterator iterator2 = iterator = EnchantmentHelper.getEnchantments((ItemStack)itemStack).keySet().iterator();
        while (iterator2.hasNext()) {
            Enchantment enchantment = (Enchantment)iterator.next();
            if (enchantment == null) {
                iterator2 = iterator;
                continue;
            }
            if (gF2.f$c.f$E().booleanValue()) {
                GlStateManager.enableBlend();
                Enchantment enchantment2 = enchantment;
                gF2.f$L.f$E(0.f$E(enchantment2, EnchantmentHelper.getEnchantmentLevel((Enchantment)enchantment2, (ItemStack)itemStack)), (double)(n * 2), (double)n2, n3);
                GlStateManager.disableBlend();
            } else {
                Enchantment enchantment3 = enchantment;
                ((Minecraft)OB.f$d).fontRenderer.drawStringWithShadow(0.f$E(enchantment3, EnchantmentHelper.getEnchantmentLevel((Enchantment)enchantment3, (ItemStack)itemStack)), (float)(n * 2), (float)n2, n3);
            }
            n2 += 8;
            iterator2 = iterator;
        }
        if (itemStack.getItem().equals(Items.GOLDEN_APPLE) && itemStack.hasEffect()) {
            if (gF2.f$c.f$E().booleanValue()) {
                GlStateManager.enableBlend();
                gF2.f$L.f$E("God", (double)(n * 2), (double)n2, -3977919);
                GlStateManager.disableBlend();
                return;
            }
            ((Minecraft)OB.f$d).fontRenderer.drawStringWithShadow("God", (float)(n * 2), (float)n2, -3977919);
        }
    }

    public static Minecraft f$a() {
        return f$d;
    }

    private String f$E(Enchantment enchantment, int n) {
        ResourceLocation resourceLocation = (ResourceLocation)Enchantment.REGISTRY.getNameForObject((Object)enchantment);
        String string = resourceLocation == null ? enchantment.getName() : resourceLocation.toString();
        int n2 = enchantment = n > 1 ? 12 : 13;
        if (string.length() > enchantment) {
            string = string.substring(10, enchantment);
        }
        string = new StringBuilder().insert(0, string.substring(0, 1).toUpperCase()).append(string.substring(1)).toString();
        if (n > 1) {
            string = new StringBuilder().insert(0, string).append(n).toString();
        }
        return string;
    }

    private int f$E(int n) {
        int n2;
        int n3 = n2 = 0.f$e.f$E() != false ? -26 : -27;
        if (n > 4) {
            n2 -= (n - 4) * 8;
        }
        return n2;
    }

    private void f$E(EntityPlayer entityPlayer, double d9, double d2, double d3) {
        ItemStack itemStack;
        EntityPlayer entityPlayer2;
        EntityPlayerSP entityPlayerSP;
        double d4 = d2;
        d4 += entityPlayer.func_70093_af() ? 0.5 : 0.7;
        EntityPlayerSP entityPlayerSP2 = entityPlayerSP = f$d.getRenderViewEntity() == null ? ((Minecraft)OB.f$d).player : f$d.getRenderViewEntity();
        double d5 = entityPlayerSP2.posX;
        double d6 = entityPlayerSP2.posY;
        double d7 = entityPlayerSP2.posZ;
        Object object = Uh.f$E((Entity)entityPlayerSP2);
        entityPlayerSP2.posX = object.x;
        entityPlayerSP2.posY = object.y;
        entityPlayerSP2.posZ = object.z;
        object = (gF)kH.f$E().f$E().f$E(gF.class);
        d2 = entityPlayerSP.getDistance(d9, d2, d3);
        int n = ((Minecraft)OB.f$d).fontRenderer.getStringWidth(0.f$E(entityPlayer)) / 2;
        int n2 = object.f$L.f$E(0.f$E(entityPlayer)) / 2;
        double d8 = 0.0018 + (double)0.f$d.f$E().floatValue() * d2;
        if (d2 <= 8.0) {
            d8 = 0.0245;
        }
        GlStateManager.pushMatrix();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)-1500000.0f);
        GlStateManager.disableLighting();
        GlStateManager.translate((float)((float)d9), (float)((float)d4 + 1.4f), (float)((float)d3));
        GlStateManager.rotate((float)(-OB.f$d.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)OB.f$d.getRenderManager().playerViewX, (float)(OB.f$d.gameSettings.thirdPersonView == 2 ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((double)(-d8), (double)(-d8), (double)d8);
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        if (object.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            Uh.f$E((float)(-n2 - 1), (float)(-object.f$L.f$E()), (float)(n2 + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            EntityPlayer entityPlayer3 = entityPlayer;
            entityPlayer2 = entityPlayer3;
            object.f$L.f$E(0.f$E(entityPlayer3), (double)(-n2), (double)(-(object.f$L.f$E() - 1)), 0.f$E(entityPlayer));
        } else {
            GlStateManager.enableBlend();
            Uh.f$E((float)(-n - 1), (float)(-OB.f$d.fontRenderer.FONT_HEIGHT), (float)(n + 2), 1.0f, 1.8f, 0x55000400, 0x33000000);
            GlStateManager.disableBlend();
            ((Minecraft)OB.f$d).fontRenderer.drawStringWithShadow(0.f$E(entityPlayer), (float)(-n), (float)(-(OB.f$d.fontRenderer.FONT_HEIGHT - 1)), 0.f$E(entityPlayer));
            entityPlayer2 = entityPlayer;
        }
        ItemStack itemStack2 = entityPlayer2.func_184614_ca();
        ItemStack itemStack3 = entityPlayer.func_184592_cb();
        int d9 = 0;
        int n3 = 0;
        d2 = 0;
        boolean bl = false;
        GlStateManager.pushMatrix();
        int n4 = d3 = 3;
        while (n4 >= 0) {
            itemStack = (ItemStack)entityPlayer.inventory.armorInventory.get(d3);
            if (!itemStack.isEmpty()) {
                int n5;
                d9 -= 8;
                if (0.f$I.f$E().booleanValue()) {
                    bl = true;
                }
                if (0.f$e.f$E().booleanValue() && (n5 = EnchantmentHelper.getEnchantments((ItemStack)itemStack).size()) > d2) {
                    d2 = n5;
                }
            }
            n4 = --d3;
        }
        if (!itemStack3.isEmpty() && (0.f$e.f$E().booleanValue() || 0.f$I.f$E().booleanValue() && itemStack3.isItemStackDamageable())) {
            d9 -= 8;
            if (0.f$I.f$E().booleanValue() && itemStack3.isItemStackDamageable()) {
                bl = true;
            }
            if (0.f$e.f$E().booleanValue() && (d3 = EnchantmentHelper.getEnchantments((ItemStack)itemStack3).size()) > d2) {
                d2 = d3;
            }
        }
        if (!itemStack2.isEmpty()) {
            OB oB;
            if (0.f$e.f$E().booleanValue() && (d3 = EnchantmentHelper.getEnchantments((ItemStack)itemStack2).size()) > d2) {
                d2 = d3;
            }
            OB oB2 = 0;
            n3 = oB2.f$E(d2);
            if (oB2.f$e.f$E().booleanValue() || 0.f$I.f$E().booleanValue() && itemStack2.isItemStackDamageable()) {
                d9 -= 8;
            }
            if (0.f$e.f$E().booleanValue()) {
                int n6 = n3;
                n3 -= 32;
                0.f$E(itemStack2, d9, n6, d2);
            }
            if (0.f$I.f$E().booleanValue() && itemStack2.isItemStackDamageable()) {
                0.f$a(itemStack2, d9, n3);
                n3 -= object.f$c.f$E() != false ? object.f$L.f$E() : OB.f$d.fontRenderer.FONT_HEIGHT;
                oB = 0;
            } else {
                if (bl) {
                    n3 -= object.f$c.f$E() != false ? object.f$L.f$E() : OB.f$d.fontRenderer.FONT_HEIGHT;
                }
                oB = 0;
            }
            if (oB.f$K.f$E().booleanValue()) {
                0.f$E(itemStack2, d9, n3);
            }
            if (0.f$e.f$E().booleanValue() || 0.f$I.f$E().booleanValue() && itemStack2.isItemStackDamageable()) {
                d9 += 16;
            }
        }
        int n7 = d3 = 3;
        while (n7 >= 0) {
            itemStack = (ItemStack)entityPlayer.inventory.armorInventory.get(d3);
            if (!itemStack.isEmpty()) {
                OB oB = 0;
                n3 = oB.f$E(d2);
                if (oB.f$e.f$E().booleanValue()) {
                    int n8 = n3;
                    n3 -= 32;
                    0.f$E(itemStack, d9, n8, d2);
                }
                if (0.f$I.f$E().booleanValue() && itemStack.isItemStackDamageable()) {
                    0.f$a(itemStack, d9, n3);
                }
                d9 += 16;
            }
            n7 = --d3;
        }
        if (!itemStack3.isEmpty()) {
            OB oB = 0;
            n3 = oB.f$E(d2);
            if (oB.f$e.f$E().booleanValue()) {
                int n9 = n3;
                n3 -= 32;
                0.f$E(itemStack3, d9, n9, d2);
            }
            if (0.f$I.f$E().booleanValue() && itemStack3.isItemStackDamageable()) {
                0.f$a(itemStack3, d9, n3);
            }
            d9 += 16;
        }
        GlStateManager.popMatrix();
        EntityPlayerSP entityPlayerSP3 = entityPlayerSP;
        entityPlayerSP.posX = d5;
        entityPlayerSP3.posY = d6;
        entityPlayerSP3.posZ = d7;
        GlStateManager.enableDepth();
        GlStateManager.disableBlend();
        GlStateManager.disablePolygonOffset();
        GlStateManager.doPolygonOffset((float)1.0f, (float)1500000.0f);
        GlStateManager.popMatrix();
    }

    private void f$a(ItemStack itemStack3, int n, int n2) {
        gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
        ItemStack itemStack2 = itemStack3;
        itemStack3 = itemStack2.getMaxDamage();
        int n3 = itemStack2.getItemDamage();
        float itemStack3 = (float)(itemStack3 - n3) / (float)itemStack3;
        Color color = new vH(itemStack3 * 120.0f, 100.0f, 50.0f, 1.0f).f$E();
        GlStateManager.scale((float)0.5f, (float)0.5f, (float)0.5f);
        GlStateManager.disableDepth();
        if (gF2.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            gF2.f$L.f$E(new StringBuilder().insert(0, String.valueOf((int)(itemStack3 * 100.0f))).append('%').toString(), (double)(n * 2), (double)n2, color.getRGB());
            GlStateManager.disableBlend();
        } else {
            ((Minecraft)OB.f$d).fontRenderer.drawStringWithShadow(new StringBuilder().insert(0, String.valueOf((int)(itemStack3 * 100.0f))).append('%').toString(), (float)(n * 2), (float)n2, color.getRGB());
        }
        GlStateManager.enableDepth();
        GlStateManager.scale((float)2.0f, (float)2.0f, (float)2.0f);
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static void f$E(OB oB, EntityPlayer entityPlayer, double d, double d2, double d3) {
        oB.f$E(entityPlayer, d, d2, d3);
    }
}
 */