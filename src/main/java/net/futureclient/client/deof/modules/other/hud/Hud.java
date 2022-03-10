package net.futureclient.client.deof.modules.other.hud;

import net.futureclient.client.*;
import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.event.events.ScaledResEvent;
import net.futureclient.client.deof.modules.ModuleBase;
import net.futureclient.client.deof.modules.ModuleStandard;
import net.futureclient.client.deof.modules.other.colours.Colours;
import net.futureclient.client.deof.settings.EnumSetting;
import net.futureclient.client.deof.settings.SettingsBase;
import net.futureclient.client.deof.utils.EntityUtils;
import net.futureclient.client.deof.utils.other.DelayTimer;
import net.futureclient.client.deof.utils.render.CFontDraw;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DimensionType;
import org.apache.commons.lang3.StringUtils;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Timer;
import java.util.HashMap;
import java.util.Map;

public class Hud extends ModuleBase {
    public SettingsBase<Boolean> fps;//OG f$r
    private Map<ModuleStandard, Integer> f$I;//OG f$I
    private int f$C;//OG f$C
    private int f$B;//OG f$B
    private List<ModuleStandard> f$e;//OG f$e
    private static final int f$M = 20;//OG f$M
    private int f$a;//OG f$a
    public SettingsBase<Boolean> capes;//OG f$F
    private float f$A;//OG f$A
    public SettingsBase<Boolean> armour;//OG f$p
    public SettingsBase<Boolean> coords;//OG f$v
    public SettingsBase<Boolean> watermark;//OG f$Q
    private final ArrayDeque<Double> f$g;//OG f$g
    public int f$j;//OG f$j
    public SettingsBase<Boolean> customFont;//OG f$c
    public SettingsBase<Boolean> potionEffects;//OG f$w
    private EnumSetting<TD> rendering;//OG f$H
    public SettingsBase<Boolean> direction;//OG f$V
    public SettingsBase<Boolean> durability;//OG f$O
    public boolean f$i;//OG f$i
    private DelayTimer f$K;//OG f$K
    public SettingsBase<Boolean> speed;//OG f$y
    private double f$d;//OG f$d
    public CFontDraw fontSetting;//OG f$L
    public SettingsBase<Boolean> arrayList;//OG f$T
    public SettingsBase<Boolean> ping;//OG f$G
    private EnumSetting<pF> ordering;//OG f$E
    public Timer f$b;//OG f$b
    private EnumSetting<BE> corner;//OG f$m
    public SettingsBase<Boolean> lagNotify;//OG f$f
    private EnumSetting<yD> modulesColor;//OG f$l
    public EnumSetting<Mg> effectHUD;//OG f$D
    public SettingsBase<Boolean> tps;//OG f$h
    public SettingsBase<Boolean> netherCoords;//OG f$u
    public SettingsBase<Boolean> serverBrand;//OG f$W
    public SettingsBase<Boolean> shadow;//OG f$k
    public SettingsBase<Boolean> liquidVision;//OG f$J

    public Hud() {
        super("HUD", "HUD", "huud");

        this.direction = new SettingsBase<>(true, "Direction", "dir");
        this.armour = new SettingsBase<>(true, "Armor", "armour");
        this.potionEffects = new SettingsBase<>(true, "PotionEffects", "Potion-Effects", "pe", "potion");
        this.serverBrand = new SettingsBase<>(false, "ServerBrand", "server", "sb");
        this.watermark = new SettingsBase<>(true, "Watermark", "wm");
        this.durability = new SettingsBase<>(true, "Durability", "dura", "d");
        this.coords = new SettingsBase<>(false, "Coords", "coord", "c");
        this.netherCoords = new SettingsBase<>(false, "NetherCoords", "NetherCoordinates", "Nether", "nc");
        this.arrayList = new SettingsBase<>(true, "ArrayList", "al", "array", "list");
        this.fps = new SettingsBase<>(true, "FPS", "fpps", "Frames", "fp");
        this.speed = new SettingsBase<>(true, "Speed", "spood", "sp");
        this.ping = new SettingsBase<>(true, "Ping", "pingerino", "Pengo", "Peng", "pin", "png");
        this.tps = new SettingsBase<>(true, "TPS", "ServerTPS", "TSP", "ytp");
        this.lagNotify = new SettingsBase<>(true, "Lag Notifier", "LagNotifier", "LagNotify", "LagNotif");
        this.shadow = new SettingsBase<>(true, "Shadow", "ss");
        this.capes = new SettingsBase<>(true, "Capes", "cape", "c");
        this.liquidVision = new SettingsBase<>(true, "Liquid Vision", "LiquidVision", "Liquids", "Seethrough", "waterinvis", "Seethroughwater", "seethroughlava", "lavavision", "watervision");
        this.ordering = new EnumSetting<>(pF.f$g, "Ordering", "order", "o");
        this.rendering = new EnumSetting<>(TD.f$g, "Rendering", "ArrayListRendering", "alr", "al");
        this.corner = new EnumSetting<>(BE.f$M, "Corner", "CordsCorner", "Corner", "CC");
        this.effectHUD = new EnumSetting<>(Mg.f$M, "EffectHUD", "MCPotionHUD", "MinecraftPotionHUD", "mcph", "mcphud");
        this.modulesColor = new EnumSetting<>(yD.f$i, "ModulesColor", "ArrayListColors", "ArrayColors", "ArrayColor", "ModColors", "ModColor", "Rainbow", "RGBModules");
        this.fontSetting = new CFontDraw(new Font("Verdana", 0, 18), true, true);
        this.customFont = new SettingsBase<>(true, "CustomFont", "usecustomfont", "font");

        this.f$A = 0.0f;
        this.f$B = -12;
        this.f$a = 9;
        this.f$C = 0;
        this.f$I = new HashMap<ModuleStandard, Integer>();
        this.f$K = new DelayTimer();
        this.f$b = new Timer();
        this.f$j = 0;
        this.f$i = false;
        this.f$g = new ArrayDeque(20);

        this.addSettings(this.customFont, this.watermark, this.direction, this.armour,
                this.potionEffects, this.effectHUD, this.liquidVision, this.capes,
                this.serverBrand, this.lagNotify, this.tps, this.fps,
                this.speed, this.ping, this.ordering, this.shadow,
                this.coords, this.netherCoords, this.corner, this.durability,
                this.arrayList, this.modulesColor, this.rendering);
        this.f$b.schedule(new AE_TimeTask(this), 0L, 16L);

        FutureClient.getINSTANCE().getEventManager().subscribe(new te_Listener(this));
        FutureClient.getINSTANCE().getEventManager().subscribe(new FF_Listener(this));
    }

    public Minecraft getMinecraft() {
        return mc;
    }


    public static Minecraft getMinecraft1() {
        return mc;
    }

    public static int f$C(Hud gF2) {
        return gF2.f$a;
    }

    public static void drawServerResonse(Hud gF2, ScaledResEvent zd) {
        gF2.drawServerResonse(zd);
    }

    private void drawServerResonse(ScaledResEvent zd) {
        if (this.f$B > -10 && !mc.isSingleplayer()) {
            String string = new StringBuilder().insert(0, "Server is not responding ").append(new DecimalFormat("0.0").format((float)kH.f$E().f$E().f$E().f$E() / 1000.0f)).append("s").toString();//TODO add the responding error.
            if (this.customFont.getValue()) {
                GlStateManager.enableBlend();
                this.fontSetting.drawStringSized(string, (double)(zd.getScaledResolution().getScaledWidth() / 2 - this.fontSetting.calcWidth(string) / 2), (double)this.f$B, -5592406);//Prob wrong.
                GlStateManager.disableBlend();
                return;
            }
            mc.fontRenderer.drawStringWithShadow(string, (float)zd.getScaledResolution().getScaledWidth() / 2.0f - (float) mc.fontRenderer.getStringWidth(string) / 2.0f, (float)this.f$B, -5592406);
        }
    }

    public static int f$K(Hud gF2) {
        return gF2.f$B++;
    }

    public static int f$e(Hud gF2) {
        return gF2.f$C;
    }


    public static void drawArrayList(Hud gF2, ScaledResEvent zd) {
        gF2.drawArrayList(zd);
    }

    private void drawArrayList(ScaledResEvent var1) {//This draws Arraylist broken lol.
        /*
     * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
     *
     * java.lang.NullPointerException
                *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op2rewriters.GetClassTestLambda.test(GetClassTestLambda.java:32)
     *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op2rewriters.Op02GetClassRewriter.tryRemove(Op02GetClassRewriter.java:45)
     *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op2rewriters.Op02GetClassRewriter.removeInvokeGetClass(Op02GetClassRewriter.java:89)
     *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:404)
     *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
     *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
     *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
     *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
     *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1037)
     *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:929)
     *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
     *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:75)
     *     at me.coley.recaf.decompile.cfr.CfrDecompiler.decompile(CfrDecompiler.java:71)
     *     at dev.fxe.recaf4forge.utils.Exporter.exportSrc(Exporter.java:80)
     *     at dev.fxe.recaf4forge.utils.Exporter.lambda$exportMDK$0(Exporter.java:43)
     *     at java.util.concurrent.CompletableFuture$AsyncRun.run(CompletableFuture.java:1640)
     *     at java.util.concurrent.CompletableFuture$AsyncRun.exec(CompletableFuture.java:1632)
     *     at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
     *     at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1067)
     *     at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1703)
     *     at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:172)
*/
        throw new IllegalStateException("Decompilation failed");
    }

    public static void drawCoords(Hud gF2, ScaledResEvent zd) {
        gF2.drawCoords(zd);
    }

    private void drawCoords(ScaledResEvent zd) {
        EntityPlayerSP entityPlayerSP = mc.getRenderViewEntity() == null ? mc.player : (EntityPlayerSP) mc.getRenderViewEntity();
        String string = String.format("X \u00a7F%.1f", entityPlayerSP.posX);
        String string2 = String.format("Y \u00a7F%.1f", entityPlayerSP.posY);
        String string3 = String.format("Z \u00a7F%.1f", entityPlayerSP.posZ);
        if (mc.world.provider.getDimensionType() == DimensionType.NETHER && this.netherCoords.getValue()) {
            string = new StringBuilder().insert(0, string).append(String.format(" \u00a77[\u00a7F%.1f\u00a77]", entityPlayerSP.posX * 0.0)).toString();
            string3 = new StringBuilder().insert(0, string3).append(String.format(" \u00a77[\u00a7F%.1f\u00a77]", entityPlayerSP.posZ * 0.0)).toString();
        } else if (mc.world.provider.getDimensionType() == DimensionType.OVERWORLD && this.netherCoords.getValue()) {
            string = new StringBuilder().insert(0, string).append(String.format(" \u00a77[\u00a7F%.1f\u00a77]", entityPlayerSP.posX / 0.0)).toString();
            string3 = new StringBuilder().insert(0, string3).append(String.format(" \u00a77[\u00a7F%.1f\u00a77]", entityPlayerSP.posZ / 0.0)).toString();
        }
        String string4 = String.format("\u00a77XYZ \u00a7F%.1f\u00a77, \u00a7F%.1f\u00a77, \u00a7F%.1f", entityPlayerSP.posX, entityPlayerSP.posY, entityPlayerSP.posZ);
        if (mc.world.provider.getDimensionType() == DimensionType.NETHER && this.netherCoords.getValue()) {
            string4 = new StringBuilder().insert(0, string4).append(String.format(" \u00a77[\u00a7F%.1f\u00a77, \u00a7F%.1f\u00a77]", entityPlayerSP.posX * 0.0, entityPlayerSP.posZ * 0.0)).toString();
        } else if (mc.world.provider.getDimensionType() == DimensionType.OVERWORLD && this.netherCoords.getValue()) {
            string4 = new StringBuilder().insert(0, string4).append(String.format(" \u00a77[\u00a7F%.1f\u00a77, \u00a7F%.1f\u00a77]", entityPlayerSP.posX / 0.0, entityPlayerSP.posZ / 0.0)).toString();
        }
        switch ((BE)((Object)this.corner.getValue())) {
            case f$M: {
                if (this.customFont.getValue()) {
                    GlStateManager.enableBlend();
                    this.fontSetting.drawStringSized(string4, 0.0, (double)(zd.getScaledResolution().getScaledHeight() - this.f$a - 1), -1);
                    GlStateManager.disableBlend();
                    return;
                }
                mc.fontRenderer.drawStringWithShadow(string4, 2.0f, (float)(zd.getScaledResolution().getScaledHeight() - this.f$a - 1), -1);
                return;
            }
            case f$g: {
                switch ((TD)((Object)this.rendering.getValue())) {
                    case f$M: {
                        if (this.customFont.getValue()) {
                            GlStateManager.enableBlend();
                            this.fontSetting.drawStringSized(string3, (double)(zd.getScaledResolution().getScaledWidth() - this.fontSetting.calcWidth(string3) - 2), (double)(zd.getScaledResolution().getScaledHeight() - this.f$a + (zd.f$d -= this.fontSetting.f$E())), -5592406);
                            this.fontSetting.drawStringSized(string2, (double)(zd.getScaledResolution().getScaledWidth() - this.fontSetting.calcWidth(string2) - 2), (double)(zd.getScaledResolution().getScaledHeight() - this.f$a + (zd.f$d -= this.fontSetting.f$E())), -5592406);
                            this.fontSetting.drawStringSized(string, (double)(zd.getScaledResolution().getScaledWidth() - this.fontSetting.calcWidth(string) - 2), (double)(zd.getScaledResolution().getScaledHeight() - this.f$a + (zd.f$d -= this.fontSetting.f$E())), -5592406);
                            GlStateManager.disableBlend();
                            return;
                        }
                        mc.fontRenderer.drawStringWithShadow(string3, (float)(zd.getScaledResolution().getScaledWidth() - mc.fontRenderer.getStringWidth(string3) - 2), (float)(zd.getScaledResolution().getScaledHeight() - this.f$a + (zd.f$d -= mc.fontRenderer.FONT_HEIGHT)), -5592406);
                        mc.fontRenderer.drawStringWithShadow(string2, (float)(zd.getScaledResolution().getScaledWidth() - mc.fontRenderer.getStringWidth(string2) - 2), (float)(zd.getScaledResolution().getScaledHeight() - this.f$a + (zd.f$d -= mc.fontRenderer.FONT_HEIGHT)), -5592406);
                        mc.fontRenderer.drawStringWithShadow(string, (float)(zd.getScaledResolution().getScaledWidth() - mc.fontRenderer.getStringWidth(string) - 2), (float)(zd.getScaledResolution().getScaledHeight() - this.f$a + (zd.f$d -= mc.fontRenderer.FONT_HEIGHT)), -5592406);
                        return;
                    }
                    case f$g: {
                        if (this.customFont.getValue()) {
                            GlStateManager.enableBlend();
                            this.fontSetting.drawStringSized(string, (double)(zd.getScaledResolution().getScaledWidth() - this.fontSetting.calcWidth(string) - 2), (double)(zd.f$g += this.fontSetting.f$E()), -5592406);
                            this.fontSetting.drawStringSized(string2, (double)(zd.getScaledResolution().getScaledWidth() - this.fontSetting.calcWidth(string2) - 2), (double)(zd.f$g += this.fontSetting.f$E()), -5592406);
                            this.fontSetting.drawStringSized(string3, (double)(zd.getScaledResolution().getScaledWidth() - this.fontSetting.calcWidth(string3) - 2), (double)(zd.f$g += this.fontSetting.f$E()), -5592406);
                            GlStateManager.disableBlend();
                            return;
                        }
                        mc.fontRenderer.drawStringWithShadow(string, (float)(zd.getScaledResolution().getScaledWidth() - mc.fontRenderer.getStringWidth(string) - 2), (float)(zd.f$g += mc.fontRenderer.FONT_HEIGHT), -5592406);
                        mc.fontRenderer.drawStringWithShadow(string2, (float)(zd.getScaledResolution().getScaledWidth() - mc.fontRenderer.getStringWidth(string2) - 2), (float)(zd.f$g += mc.fontRenderer.FONT_HEIGHT), -5592406);
                        mc.fontRenderer.drawStringWithShadow(string3, (float)(zd.getScaledResolution().getScaledWidth() - mc.fontRenderer.getStringWidth(string3) - 2), (float)(zd.f$g += mc.fontRenderer.FONT_HEIGHT), -5592406);
                    }
                }
            }
        }
    }

    public static EnumSetting<yD> f$a(Hud gF2) {
        return gF2.modulesColor;
    }

    public static int f$a(Hud gF2) {
        return gF2.f$C++;
    }

    private static int f$a(ModuleStandard ba, ModuleStandard ba2) {
        return mc.fontRenderer.getStringWidth(ba2.getName1()) - mc.fontRenderer.getStringWidth(ba.getName1());
    }

    public static void drawText(Hud gF2, ScaledResEvent zd, String string, int n) {
        gF2.drawText(zd, string, n);
    }

    private void drawText(ScaledResEvent zd, String string, int n) {
        int n2 = mc.fontRenderer.getStringWidth(string);
        int n3 = this.fontSetting.calcWidth(string);
        int n4 = zd.getScaledResolution().getScaledWidth() - n2 - 2;
        int n5 = zd.getScaledResolution().getScaledWidth() - n3 - 2;
        switch ((TD)((Object)this.rendering.getValue())) {
            case f$M: {
                if (this.customFont.getValue()) {
                    GlStateManager.enableBlend();
                    this.fontSetting.drawStringSized(string, (double)(zd.getScaledResolution().getScaledWidth() - n3 - 2), (double)(zd.getScaledResolution().getScaledHeight() - this.f$a + (zd.f$d -= this.fontSetting.f$E())), n);
                    GlStateManager.disableBlend();
                    return;
                }
                mc.fontRenderer.drawStringWithShadow(string, (float)(zd.getScaledResolution().getScaledWidth() - n2 - 2), (float)(zd.getScaledResolution().getScaledHeight() - this.f$a + (zd.f$d -= mc.fontRenderer.FONT_HEIGHT)), n);
                return;
            }
            case f$g: {
                if (this.customFont.getValue()) {
                    GlStateManager.enableBlend();
                    this.fontSetting.drawStringSized(string, (double)n5, (double)(zd.f$g += this.fontSetting.f$E()), n);
                    GlStateManager.disableBlend();
                    return;
                }
                mc.fontRenderer.drawStringWithShadow(string, (float)n4, (float)(zd.f$g += mc.fontRenderer.FONT_HEIGHT), n);
                return;
            }
        }
    }

    public static double f$E(Hud gF2) {
        return gF2.f$d;
    }

    public static EnumSetting<TD> getRenderingSetting(Hud gF2) {
        return gF2.rendering;
    }

    private int moduleNameWidth(ModuleStandard ba, ModuleStandard ba2) {//IDK what this used for.
        return this.fontSetting.calcWidth(ba2.getName()) - this.fontSetting.calcWidth(ba.getName());
    }

    public static ArrayDeque<Double> f$E(Hud gF2) {
        return gF2.f$g;
    }

    public static double f$E(Hud gF2, double d) {
        gF2.f$d = d;
        return gF2.f$d;
    }

    public static void drawPlayerDirection(Hud gF2, ScaledResEvent zd) {
        gF2.drawPlayerDirection(zd);
    }

    private void drawPlayerDirection(ScaledResEvent zd) {//Looks like this draws players speed. Correct maybe direction.
        String string = String.format("%s \u00a77[\u00a7F%s\u00a77]", StringUtils.capitalize(EntityUtils.getPlayerFacing().toLowerCase()), EntityUtils.getPlayersDirection());
        switch ((BE)((Object)this.corner.getValue())) {
            case f$M:
                if (this.customFont.getValue()) {
                    GlStateManager.enableBlend();
                    this.fontSetting.drawStringSized(string, 0.0, (zd.getScaledResolution().getScaledHeight() - (this.coords.getValue() ? this.fontSetting.f$E() : 0) - this.f$a - 1), -1);
                    GlStateManager.disableBlend();
                    return;
                }
                mc.fontRenderer.drawStringWithShadow(string, 2.0f, (float)(zd.getScaledResolution().getScaledHeight() - (this.coords.getValue() ? mc.fontRenderer.FONT_HEIGHT : 0) - this.f$a - 1), -1);
                return;
            case f$g:
                this.drawText(zd, string, -1);
        }
    }

    public static float f$E(Hud gF2) {
        return gF2.f$A;
    }

    public static int f$E(Hud gF2) {
        return gF2.f$C--;
    }

    public static float f$E(Hud gF2, float f) {
        gF2.f$A = f;
        return gF2.f$A;
    }

    public static int f$B(Hud gF2) {
        return gF2.f$B--;
    }

    public static void drawArmourHud(Hud gF2, ScaledResEvent zd) {
        gF2.drawArmourHud(zd);
    }

    private void drawArmourHud(ScaledResEvent zd) {
        int n;
        if (mc.currentScreen instanceof GuiChat) return;

        int n2 = 15;
        GlStateManager.pushMatrix();
        RenderHelper.enableGUIStandardItemLighting();
        int n3 = n = 3;
        while (n3 >= 0) {
            ItemStack itemStack = (ItemStack)mc.player.inventory.armorInventory.get(n);
            if (!(itemStack.getItem() instanceof ItemAir)) {
                int n4;
                if (mc.player.isInsideOfMaterial(Material.WATER) && mc.player.getAir() > 0 && !mc.player.capabilities.isCreativeMode) {
                    n4 = 65;
                } else if (mc.player.getRidingEntity() != null && !mc.player.capabilities.isCreativeMode) {
                    if (mc.player.getRidingEntity() instanceof EntityLivingBase) {
                        EntityLivingBase entityLivingBase = (EntityLivingBase)mc.player.getRidingEntity();
                        n4 = 45 + (int)Math.ceil((entityLivingBase.getMaxHealth() - 1.0f) / 20.0f) * 10;
                    } else {
                        n4 = 45;
                    }
                } else {
                    n4 = mc.player.capabilities.isCreativeMode ? (mc.player.isRidingHorse() ? 45 : 38) : 55;
                }
                mc.getRenderItem().renderItemIntoGUI(itemStack, zd.getScaledResolution().getScaledWidth() / 2 + n2, zd.getScaledResolution().getScaledHeight() - n4);
                int n5 = zd.getScaledResolution().getScaledWidth() / 2 + n2;
                n2 += 18;
                mc.getRenderItem().renderItemOverlays(mc.fontRenderer, itemStack, n5, zd.getScaledResolution().getScaledHeight() - n4);
            }
            n3 = --n;
        }
        RenderHelper.disableStandardItemLighting();
        GlStateManager.popMatrix();
    }

    public static int f$A(Hud gF2) {
        return gF2.f$B;
    }

    public static void drawWatermark(Hud gF2, ScaledResEvent zd) {
        gF2.drawWatermark(zd);
    }

    private void drawWatermark(ScaledResEvent zd) {
        Colours wD2 = (Colours)kH.f$E().f$E().f$E(Colours.class);
        if (this.customFont.getValue()) {
            GlStateManager.enableBlend();
            GlStateManager.enableAlpha();
            this.fontSetting.drawStringSized(String.format("%s v%s", FutureClient.clientName, FutureClient.version), 0.0, zd.f$i, wD2.f$a.getRGB());
            GlStateManager.disableBlend();
            GlStateManager.disableAlpha();
            return;
        }
        mc.fontRenderer.drawStringWithShadow(String.format("%s v%s", kH.f$m, kH.f$D), 2.0f, (float)zd.f$i, wD2.f$a.getRGB());
    }

    public static int f$H(Hud gF2) {
        return gF2.f$a++;
    }

    public static int f$h(Hud gF2) {
        return gF2.f$a--;
    }

}
/*
public class gF extends ma {
    public z<Boolean> f$r;
    private Map<Ba, Integer> f$I;
    private int f$C;
    private int f$B;
    private List<Ba> f$e;
    private static final int f$M = 20;
    private int f$a;
    public z<Boolean> f$F;
    private float f$A;
    public z<Boolean> f$p;
    public z<Boolean> f$v;
    public z<Boolean> f$Q;
    private final ArrayDeque<Double> f$g;
    public int f$j;
    public z<Boolean> f$c;
    public z<Boolean> f$w;
    private ka<TD> f$H;
    public z<Boolean> f$V;
    public z<Boolean> f$O;
    public boolean f$i;
    private gG f$K;
    public z<Boolean> f$y;
    private double f$d;
    public fG f$L;
    public z<Boolean> f$T;
    public z<Boolean> f$G;
    private ka<pF> f$E;
    public Timer f$b;
    private ka<BE> f$m;
    public z<Boolean> f$f;
    private ka<yD> f$l;
    public ka<Mg> f$D;
    public z<Boolean> f$h;
    public z<Boolean> f$u;
    public z<Boolean> f$W;
    public z<Boolean> f$k;
    public z<Boolean> f$J;

    public gF() {
        gF gF2;
        String[] stringArray = new String[2];
        stringArray[0] = "HUD";
        stringArray[1] = "huud";
        super("HUD", stringArray);
        gF gF3 = gF2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Direction";
        stringArray2[1] = "dir";
        gF3.f$V = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Armor";
        stringArray3[1] = "armour";
        gF2.f$p = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[4];
        stringArray4[0] = "PotionEffects";
        stringArray4[1] = "Potion-Effects";
        stringArray4[2] = "pe";
        stringArray4[3] = "potion";
        gF2.f$w = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "ServerBrand";
        stringArray5[1] = "server";
        stringArray5[2] = "sb";
        gF2.f$W = new z<Boolean>(false, stringArray5);
        String[] stringArray6 = new String[2];
        stringArray6[0] = "Watermark";
        stringArray6[1] = "wm";
        gF2.f$Q = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[3];
        stringArray7[0] = "Durability";
        stringArray7[1] = "dura";
        stringArray7[2] = "d";
        gF2.f$O = new z<Boolean>(true, stringArray7);
        String[] stringArray8 = new String[3];
        stringArray8[0] = "Coords";
        stringArray8[1] = "coord";
        stringArray8[2] = "c";
        gF2.f$v = new z<Boolean>(false, stringArray8);
        String[] stringArray9 = new String[4];
        stringArray9[0] = "NetherCoords";
        stringArray9[1] = "NetherCoordinates";
        stringArray9[2] = "Nether";
        stringArray9[3] = "nc";
        gF2.f$u = new z<Boolean>(false, stringArray9);
        String[] stringArray10 = new String[4];
        stringArray10[0] = "ArrayList";
        stringArray10[1] = "al";
        stringArray10[2] = "array";
        stringArray10[3] = "list";
        gF2.f$T = new z<Boolean>(true, stringArray10);
        String[] stringArray11 = new String[4];
        stringArray11[0] = "FPS";
        stringArray11[1] = "fpps";
        stringArray11[2] = "Frames";
        stringArray11[3] = "fp";
        gF2.f$r = new z<Boolean>(true, stringArray11);
        String[] stringArray12 = new String[3];
        stringArray12[0] = "Speed";
        stringArray12[1] = "spood";
        stringArray12[2] = "sp";
        gF2.f$y = new z<Boolean>(true, stringArray12);
        String[] stringArray13 = new String[6];
        stringArray13[0] = "Ping";
        stringArray13[1] = "pingerino";
        stringArray13[2] = "Pengo";
        stringArray13[3] = "Peng";
        stringArray13[4] = "pin";
        stringArray13[5] = "png";
        gF2.f$G = new z<Boolean>(true, stringArray13);
        String[] stringArray14 = new String[4];
        stringArray14[0] = "TPS";
        stringArray14[1] = "ServerTPS";
        stringArray14[2] = "TSP";
        stringArray14[3] = "ytp";
        gF2.f$h = new z<Boolean>(true, stringArray14);
        String[] stringArray15 = new String[4];
        stringArray15[0] = "Lag Notifier";
        stringArray15[1] = "LagNotifier";
        stringArray15[2] = "LagNotify";
        stringArray15[3] = "LagNotif";
        gF2.f$f = new z<Boolean>(true, stringArray15);
        String[] stringArray16 = new String[2];
        stringArray16[0] = "Shadow";
        stringArray16[1] = "ss";
        gF2.f$k = new z<Boolean>(true, stringArray16);
        String[] stringArray17 = new String[3];
        stringArray17[0] = "Capes";
        stringArray17[1] = "cape";
        stringArray17[2] = "c";
        gF2.f$F = new z<Boolean>(true, stringArray17);
        String[] stringArray18 = new String[9];
        stringArray18[0] = "Liquid Vision";
        stringArray18[1] = "LiquidVision";
        stringArray18[2] = "Liquids";
        stringArray18[3] = "Seethrough";
        stringArray18[4] = "waterinvis";
        stringArray18[5] = "Seethroughwater";
        stringArray18[6] = "seethroughlava";
        stringArray18[7] = "lavavision";
        stringArray18[8] = "watervision";
        gF2.f$J = new z<Boolean>(true, stringArray18);
        String[] stringArray19 = new String[3];
        stringArray19[0] = "Ordering";
        stringArray19[1] = "order";
        stringArray19[2] = "o";
        gF2.f$E = new ka<pF>(pF.f$g, stringArray19);
        String[] stringArray20 = new String[4];
        stringArray20[0] = "Rendering";
        stringArray20[1] = "ArrayListRendering";
        stringArray20[2] = "alr";
        stringArray20[3] = "al";
        gF2.f$H = new ka<TD>(TD.f$g, stringArray20);
        String[] stringArray21 = new String[4];
        stringArray21[0] = "Corner";
        stringArray21[1] = "CordsCorner";
        stringArray21[2] = "Corner";
        stringArray21[3] = "CC";
        gF2.f$m = new ka<BE>(BE.f$M, stringArray21);
        String[] stringArray22 = new String[5];
        stringArray22[0] = "EffectHUD";
        stringArray22[1] = "MCPotionHUD";
        stringArray22[2] = "MinecraftPotionHUD";
        stringArray22[3] = "mcph";
        stringArray22[4] = "mcphud";
        gF2.f$D = new ka<Mg>(Mg.f$M, stringArray22);
        String[] stringArray23 = new String[8];
        stringArray23[0] = "ModulesColor";
        stringArray23[1] = "ArrayListColors";
        stringArray23[2] = "ArrayColors";
        stringArray23[3] = "ArrayColor";
        stringArray23[4] = "ModColors";
        stringArray23[5] = "ModColor";
        stringArray23[6] = "Rainbow";
        stringArray23[7] = "RGBModules";
        gF2.f$l = new ka<yD>(yD.f$i, stringArray23);
        gF gF4 = gF2;
        gF4.f$L = new fG(new Font("Verdana", 0, 18), true, true);
        String[] stringArray24 = new String[3];
        stringArray24[0] = "CustomFont";
        stringArray24[1] = "usecustomfont";
        stringArray24[2] = "font";
        gF4.f$c = new z<Boolean>(true, stringArray24);
        gF gF5 = gF2;
        gF gF6 = gF2;
        gF gF7 = gF2;
        gF7.f$A = 0.0f;
        gF7.f$B = -12;
        gF6.f$a = 9;
        gF6.f$C = 0;
        gF6.f$I = new HashMap<Ba, Integer>();
        gF5.f$K = new gG();
        gF5.f$b = new Timer();
        gF5.f$j = 0;
        gF2.f$i = 0;
        gF2.f$g = new ArrayDeque(20);
        gF2.f$E(gF2.f$c, gF2.f$Q, gF2.f$V, gF2.f$p, gF2.f$w, gF2.f$D, gF2.f$J, gF2.f$F, gF2.f$W, gF2.f$f, gF2.f$h, gF2.f$r, gF2.f$y, gF2.f$G, gF2.f$E, gF2.f$k, gF2.f$v, gF2.f$u, gF2.f$m, gF2.f$O, gF2.f$T, gF2.f$l, gF2.f$H);
        gF2.f$b.schedule((TimerTask)new AE(gF2), 0L, 16L);
        kH.f$E().f$E().f$a(new te(gF2));
        kH.f$E().f$E().f$a(new FF(gF2));
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static int f$C(gF gF2) {
        return gF2.f$a;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    private void f$K(Zd zd) {
        if (0.f$B > -10 && !f$d.isSingleplayer()) {
            String string = new StringBuilder().insert(0, "Server is not responding ").append(new DecimalFormat("0.0").format((float)kH.f$E().f$E().f$E().f$E() / 1000.0f)).append("s").toString();
            if (0.f$c.f$E().booleanValue()) {
                GlStateManager.enableBlend();
                String string2 = string;
                0.f$L.f$E(string2, (double)(zd.f$E().getScaledWidth() / 2 - 0.f$L.f$E(string2) / 2), (double)0.f$B, -5592406);
                GlStateManager.disableBlend();
                return;
            }
            String string3 = string;
            gF.f$d.fontRenderer.drawStringWithShadow(string3, (float)zd.f$E().getScaledWidth() / 2.0f - (float)gF.f$d.fontRenderer.getStringWidth(string3) / 2.0f, (float)0.f$B, -5592406);
        }
    }

    public static void f$K(gF gF2, Zd zd) {
        gF2.f$e(zd);
    }

    public static int f$K(gF gF2) {
        return gF2.f$B++;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static void f$e(gF gF2, Zd zd) {
        gF2.f$B(zd);
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static int f$e(gF gF2) {
        return gF2.f$C;
    }


private void f$e(Zd var1) {

     * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
     *
     * java.lang.NullPointerException
     *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op2rewriters.GetClassTestLambda.test(GetClassTestLambda.java:32)
     *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op2rewriters.Op02GetClassRewriter.tryRemove(Op02GetClassRewriter.java:45)
     *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op2rewriters.Op02GetClassRewriter.removeInvokeGetClass(Op02GetClassRewriter.java:89)
     *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:404)
     *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
     *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
     *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
     *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
     *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1037)
     *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:929)
     *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
     *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:75)
     *     at me.coley.recaf.decompile.cfr.CfrDecompiler.decompile(CfrDecompiler.java:71)
     *     at dev.fxe.recaf4forge.utils.Exporter.exportSrc(Exporter.java:80)
     *     at dev.fxe.recaf4forge.utils.Exporter.lambda$exportMDK$0(Exporter.java:43)
     *     at java.util.concurrent.CompletableFuture$AsyncRun.run(CompletableFuture.java:1640)
     *     at java.util.concurrent.CompletableFuture$AsyncRun.exec(CompletableFuture.java:1632)
     *     at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
     *     at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1067)
     *     at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1703)
     *     at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:172)

    throw new IllegalStateException("Decompilation failed");
}

    private void f$a(Zd zd) {
        EntityPlayerSP entityPlayerSP = f$d.getRenderViewEntity() == null ? gF.f$d.player : f$d.getRenderViewEntity();
        String string = String.format("X \u00a7F%.1f", entityPlayerSP.posX);
        String string2 = String.format("Y \u00a7F%.1f", entityPlayerSP.posY);
        String string3 = String.format("Z \u00a7F%.1f", entityPlayerSP.posZ);
        if (gF.f$d.world.field_73011_w.getDimensionType() == DimensionType.NETHER && 0.f$u.f$E().booleanValue()) {
            string = new StringBuilder().insert(0, string).append(String.format(" \u00a77[\u00a7F%.1f\u00a77]", entityPlayerSP.posX * 0.0)).toString();
            string3 = new StringBuilder().insert(0, string3).append(String.format(" \u00a77[\u00a7F%.1f\u00a77]", entityPlayerSP.posZ * 0.0)).toString();
        } else if (gF.f$d.world.field_73011_w.getDimensionType() == DimensionType.OVERWORLD && 0.f$u.f$E().booleanValue()) {
            string = new StringBuilder().insert(0, string).append(String.format(" \u00a77[\u00a7F%.1f\u00a77]", entityPlayerSP.posX / 0.0)).toString();
            string3 = new StringBuilder().insert(0, string3).append(String.format(" \u00a77[\u00a7F%.1f\u00a77]", entityPlayerSP.posZ / 0.0)).toString();
        }
        String string4 = String.format("\u00a77XYZ \u00a7F%.1f\u00a77, \u00a7F%.1f\u00a77, \u00a7F%.1f", entityPlayerSP.posX, entityPlayerSP.posY, entityPlayerSP.posZ);
        if (gF.f$d.world.field_73011_w.getDimensionType() == DimensionType.NETHER && 0.f$u.f$E().booleanValue()) {
            string4 = new StringBuilder().insert(0, string4).append(String.format(" \u00a77[\u00a7F%.1f\u00a77, \u00a7F%.1f\u00a77]", entityPlayerSP.posX * 0.0, entityPlayerSP.posZ * 0.0)).toString();
        } else if (gF.f$d.world.field_73011_w.getDimensionType() == DimensionType.OVERWORLD && 0.f$u.f$E().booleanValue()) {
            string4 = new StringBuilder().insert(0, string4).append(String.format(" \u00a77[\u00a7F%.1f\u00a77, \u00a7F%.1f\u00a77]", entityPlayerSP.posX / 0.0, entityPlayerSP.posZ / 0.0)).toString();
        }
        switch ((BE)((Object)0.f$m.f$E())) {
            case f$M: {
                while (false) {
                }
                if (0.f$c.f$E().booleanValue()) {
                    GlStateManager.enableBlend();
                    0.f$L.f$E(string4, 0.0, (double)(zd.f$E().getScaledHeight() - 0.f$a - 1), -1);
                    GlStateManager.disableBlend();
                    return;
                }
                gF.f$d.fontRenderer.drawStringWithShadow(string4, 2.0f, (float)(zd.f$E().getScaledHeight() - 0.f$a - 1), -1);
                return;
            }
            case f$g: {
                switch ((TD)((Object)0.f$H.f$E())) {
                    case f$M: {
                        while (false) {
                        }
                        if (0.f$c.f$E().booleanValue()) {
                            GlStateManager.enableBlend();
                            String string5 = string3;
                            0.f$L.f$E(string5, (double)(zd.f$E().getScaledWidth() - 0.f$L.f$E(string5) - 2), (double)(zd.f$E().getScaledHeight() - 0.f$a + (zd.f$d -= 0.f$L.f$E())), -5592406);
                            String string6 = string2;
                            0.f$L.f$E(string6, (double)(zd.f$E().getScaledWidth() - 0.f$L.f$E(string6) - 2), (double)(zd.f$E().getScaledHeight() - 0.f$a + (zd.f$d -= 0.f$L.f$E())), -5592406);
                            String string7 = string;
                            0.f$L.f$E(string7, (double)(zd.f$E().getScaledWidth() - 0.f$L.f$E(string7) - 2), (double)(zd.f$E().getScaledHeight() - 0.f$a + (zd.f$d -= 0.f$L.f$E())), -5592406);
                            GlStateManager.disableBlend();
                            return;
                        }
                        String string8 = string3;
                        gF.f$d.fontRenderer.drawStringWithShadow(string8, (float)(zd.f$E().getScaledWidth() - gF.f$d.fontRenderer.getStringWidth(string8) - 2), (float)(zd.f$E().getScaledHeight() - 0.f$a + (zd.f$d -= gF.f$d.fontRenderer.FONT_HEIGHT)), -5592406);
                        String string9 = string2;
                        gF.f$d.fontRenderer.drawStringWithShadow(string9, (float)(zd.f$E().getScaledWidth() - gF.f$d.fontRenderer.getStringWidth(string9) - 2), (float)(zd.f$E().getScaledHeight() - 0.f$a + (zd.f$d -= gF.f$d.fontRenderer.FONT_HEIGHT)), -5592406);
                        String string10 = string;
                        gF.f$d.fontRenderer.drawStringWithShadow(string10, (float)(zd.f$E().getScaledWidth() - gF.f$d.fontRenderer.getStringWidth(string10) - 2), (float)(zd.f$E().getScaledHeight() - 0.f$a + (zd.f$d -= gF.f$d.fontRenderer.FONT_HEIGHT)), -5592406);
                        return;
                    }
                    case f$g: {
                        if (0.f$c.f$E().booleanValue()) {
                            GlStateManager.enableBlend();
                            String string11 = string;
                            0.f$L.f$E(string11, (double)(zd.f$E().getScaledWidth() - 0.f$L.f$E(string11) - 2), (double)(zd.f$g += 0.f$L.f$E()), -5592406);
                            String string12 = string2;
                            0.f$L.f$E(string12, (double)(zd.f$E().getScaledWidth() - 0.f$L.f$E(string12) - 2), (double)(zd.f$g += 0.f$L.f$E()), -5592406);
                            String string13 = string3;
                            0.f$L.f$E(string13, (double)(zd.f$E().getScaledWidth() - 0.f$L.f$E(string13) - 2), (double)(zd.f$g += 0.f$L.f$E()), -5592406);
                            GlStateManager.disableBlend();
                            return;
                        }
                        String string14 = string;
                        gF.f$d.fontRenderer.drawStringWithShadow(string14, (float)(zd.f$E().getScaledWidth() - gF.f$d.fontRenderer.getStringWidth(string14) - 2), (float)(zd.f$g += gF.f$d.fontRenderer.FONT_HEIGHT), -5592406);
                        String string15 = string2;
                        gF.f$d.fontRenderer.drawStringWithShadow(string15, (float)(zd.f$E().getScaledWidth() - gF.f$d.fontRenderer.getStringWidth(string15) - 2), (float)(zd.f$g += gF.f$d.fontRenderer.FONT_HEIGHT), -5592406);
                        String string16 = string3;
                        gF.f$d.fontRenderer.drawStringWithShadow(string16, (float)(zd.f$E().getScaledWidth() - gF.f$d.fontRenderer.getStringWidth(string16) - 2), (float)(zd.f$g += gF.f$d.fontRenderer.FONT_HEIGHT), -5592406);
                    }
                }
            }
        }
    }

    public static ka f$a(gF gF2) {
        return gF2.f$l;
    }

    public static int f$a(gF gF2) {
        return gF2.f$C++;
    }

    private static int f$a(Ba ba, Ba ba2) {
        return gF.f$d.fontRenderer.getStringWidth(ba2.f$a()) - gF.f$d.fontRenderer.getStringWidth(ba.f$a());
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static void f$a(gF gF2, Zd zd) {
        gF2.f$E(zd);
    }

    private void f$E(Zd zd, String string, int n) {
        int n2 = gF.f$d.fontRenderer.getStringWidth(string);
        int n3 = 0.f$L.f$E(string);
        int n4 = zd.f$E().getScaledWidth() - n2 - 2;
        int n5 = zd.f$E().getScaledWidth() - n3 - 2;
        switch ((TD)((Object)0.f$H.f$E())) {
            case f$M: {
                if (0.f$c.f$E().booleanValue()) {
                    GlStateManager.enableBlend();
                    0.f$L.f$E(string, (double)(zd.f$E().getScaledWidth() - n3 - 2), (double)(zd.f$E().getScaledHeight() - 0.f$a + (zd.f$d -= 0.f$L.f$E())), n);
                    GlStateManager.disableBlend();
                    return;
                }
                gF.f$d.fontRenderer.drawStringWithShadow(string, (float)(zd.f$E().getScaledWidth() - n2 - 2), (float)(zd.f$E().getScaledHeight() - 0.f$a + (zd.f$d -= gF.f$d.fontRenderer.FONT_HEIGHT)), n);
                return;
            }
            case f$g: {
                if (0.f$c.f$E().booleanValue()) {
                    GlStateManager.enableBlend();
                    0.f$L.f$E(string, (double)n5, (double)(zd.f$g += 0.f$L.f$E()), n);
                    GlStateManager.disableBlend();
                    return;
                }
                gF.f$d.fontRenderer.drawStringWithShadow(string, (float)n4, (float)(zd.f$g += gF.f$d.fontRenderer.FONT_HEIGHT), n);
                return;
            }
        }
    }

    public static double f$E(gF gF2) {
        return gF2.f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static void f$E(gF gF2, Zd zd, String string, int n) {
        gF2.f$E(zd, string, n);
    }

    public static ka f$E(gF gF2) {
        return gF2.f$H;
    }

    private int f$E(Ba ba, Ba ba2) {
        return 0.f$L.f$E(ba2.f$a()) - 0.f$L.f$E(ba.f$a());
    }

    public static ArrayDeque f$E(gF gF2) {
        return gF2.f$g;
    }

    public static double f$E(gF gF2, double d) {
        gF2.f$d = d;
        return gF2.f$d;
    }

    private void f$E(Zd zd) {
        String string = String.format("%s \u00a77[\u00a7F%s\u00a77]", StringUtils.capitalize(Pg.f$a().toLowerCase()), Pg.f$E());
        switch ((BE)((Object)0.f$m.f$E())) {
            case f$M: {
                while (false) {
                }
                if (0.f$c.f$E().booleanValue()) {
                    GlStateManager.enableBlend();
                    0.f$L.f$E(string, 0.0, (double)(zd.f$E().getScaledHeight() - (0.f$v.f$E() != false ? 0.f$L.f$E() : 0) - 0.f$a - 1), -1);
                    GlStateManager.disableBlend();
                    return;
                }
                gF.f$d.fontRenderer.drawStringWithShadow(string, 2.0f, (float)(zd.f$E().getScaledHeight() - (0.f$v.f$E() != false ? gF.f$d.fontRenderer.FONT_HEIGHT : 0) - 0.f$a - 1), -1);
                return;
            }
            case f$g: {
                0.f$E(zd, string, -1);
            }
        }
    }

    public static float f$E(gF gF2) {
        return gF2.f$A;
    }

    public static void f$E(gF gF2, Zd zd) {
        gF2.f$K(zd);
    }

    public static int f$E(gF gF2) {
        return gF2.f$C--;
    }

    public static float f$E(gF gF2, float f) {
        gF2.f$A = f;
        return gF2.f$A;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static int f$B(gF gF2) {
        return gF2.f$B--;
    }

    private void f$B(Zd zd) {
        int n;
        if (gF.f$d.currentScreen instanceof GuiChat) {
            return;
        }
        int n2 = 15;
        GlStateManager.pushMatrix();
        RenderHelper.enableGUIStandardItemLighting();
        int n3 = n = 3;
        while (n3 >= 0) {
            ItemStack itemStack = (ItemStack)gF.f$d.player.field_71071_by.armorInventory.get(n);
            if (!(itemStack.getItem() instanceof ItemAir)) {
                int n4;
                if (gF.f$d.player.func_70055_a(Material.WATER) && gF.f$d.player.func_70086_ai() > 0 && !gF.f$d.player.field_71075_bZ.isCreativeMode) {
                    n4 = 65;
                } else if (gF.f$d.player.func_184187_bx() != null && !gF.f$d.player.field_71075_bZ.isCreativeMode) {
                    if (gF.f$d.player.func_184187_bx() instanceof EntityLivingBase) {
                        EntityLivingBase entityLivingBase = (EntityLivingBase)gF.f$d.player.func_184187_bx();
                        n4 = 45 + (int)Math.ceil((entityLivingBase.getMaxHealth() - 1.0f) / 20.0f) * 10;
                    } else {
                        n4 = 45;
                    }
                } else {
                    n4 = gF.f$d.player.field_71075_bZ.isCreativeMode ? (gF.f$d.player.isRidingHorse() ? 45 : 38) : 55;
                }
                f$d.getRenderItem().renderItemIntoGUI(itemStack, zd.f$E().getScaledWidth() / 2 + n2, zd.f$E().getScaledHeight() - n4);
                int n5 = zd.f$E().getScaledWidth() / 2 + n2;
                n2 += 18;
                f$d.getRenderItem().renderItemOverlays(gF.f$d.fontRenderer, itemStack, n5, zd.f$E().getScaledHeight() - n4);
            }
            n3 = --n;
        }
        RenderHelper.disableStandardItemLighting();
        GlStateManager.popMatrix();
    }

    public static void f$B(gF gF2, Zd zd) {
        gF2.f$a(zd);
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static int f$A(gF gF2) {
        return gF2.f$B;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static void f$A(gF gF2, Zd zd) {
        gF2.f$A(zd);
    }

    private void f$A(Zd zd) {
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        if (0.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            GlStateManager.enableAlpha();
            0.f$L.f$E(String.format("%s v%s", kH.f$m, kH.f$D), 0.0, (double)zd.f$i, wD2.f$a.getRGB());
            GlStateManager.disableBlend();
            GlStateManager.disableAlpha();
            return;
        }
        gF.f$d.fontRenderer.drawStringWithShadow(String.format("%s v%s", kH.f$m, kH.f$D), 2.0f, (float)zd.f$i, wD2.f$a.getRGB());
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static int f$H(gF gF2) {
        return gF2.f$a++;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static int f$h(gF gF2) {
        return gF2.f$a--;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }
}
 */