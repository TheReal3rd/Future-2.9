package net.futureclient.client.deof.modules.combat.antiBot;

import net.futureclient.client.deof.modules.ModuleStandard;
import net.futureclient.client.deof.settings.SettingsBase;
import net.futureclient.client.deof.utils.enums.CategoryEnum;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;

import java.util.*;

public class AntiBot extends ModuleStandard {
    public static AntiBot INSTANCE;
    public SettingsBase<Boolean> ping; // f$K;
    public Map<Integer, UUID> botMap; // f$d;
    private boolean hypixel; //  f$g;
    public SettingsBase<Boolean> name; // f$j;
    private boolean mineplex; // f$M;
    public SettingsBase<Boolean> invisible; // f$b;
    public SettingsBase<Boolean> uuid; // f$i;

    //Removed params
    public static boolean isHypixel() { // f$E
        return AntiBot.INSTANCE.hypixel;
    }

    @Override
    public void unSubListeners() {
        super.unSubListeners();
        botMap.clear();
    }
    public AntiBot() {
        super("AntiBots", new String[]{"AntiBots", "AntiBot", "AntiEntity", "Antiboat"}, true, -8374971, CategoryEnum.COMBAT);
        INSTANCE = this;
        this.ping = new SettingsBase<>(true, "Ping", "Pin", "Pong");
        this.invisible = new SettingsBase<Boolean>(true, "Invisible", "Invis");
        this.name = new SettingsBase<Boolean>(true, "Name", "Nam");
        this.uuid = new SettingsBase<Boolean>(true, "UUID", "UserID", "UID");
        this.botMap = new HashMap<Integer, UUID>();
        this.addSettings(ping, invisible, name, uuid);
        this.addListeners(new AB_Tick_Listener(this), new AB_Packet_Listener(this), new AB_GUIScreen_Listener(this), new AB_WorldClient_Listener(this));
    }

    private boolean invisibilityCheck(EntityPlayer entityPlayer) { // f&B
        return this.invisible.value && entityPlayer.isInvisible() && !entityPlayer.isPotionActive(MobEffects.INVISIBILITY);
    }

    //Removed param mF mF2,
    public static boolean invisibility(EntityPlayer entityPlayer) {
        return AntiBot.INSTANCE.invisibilityCheck(entityPlayer);
    }

    @Override
    public void subListeners() {
        this.subListeners();
        if (!mc.isSingleplayer() && mc.getCurrentServerData() != null) {
            hypixel = mc.getCurrentServerData().serverIP.toLowerCase().contains("hypixel");
            mineplex = mc.getCurrentServerData().serverIP.toLowerCase().contains("mineplex");
        }
    }

    private boolean uuidCheck(EntityPlayer entityPlayer) { // f$a
        return uuid.value != false && mc.getConnection() != null && mc.getConnection().getPlayerInfo(entityPlayer.getUniqueID()) == null;
    }

    private boolean nameCheck(EntityPlayer entityPlayer) {//f$e
        if (name.value) {
            if (entityPlayer.getDisplayName().getFormattedText().equalsIgnoreCase(new StringBuilder().insert(0, entityPlayer.getName()).append("\u00a7r").toString())) {
                if (!mc.player.getDisplayName().getFormattedText().equalsIgnoreCase(new StringBuilder().insert(0, mc.player.getName()).append("\u00a7r").toString())) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean setHypixel(boolean bl) {
        AntiBot.INSTANCE.hypixel = bl;
        return AntiBot.INSTANCE.hypixel;
    }



    //Removed param mF mF2,
    public static boolean uuid(EntityPlayer entityPlayer) { // f$a
        return AntiBot.INSTANCE.uuidCheck(entityPlayer);
    }

    private List<EntityPlayer> getPlayerList() { // f$e
        ArrayList<EntityPlayer> arrayList = new ArrayList<EntityPlayer>(mc.world.playerEntities);
        arrayList.remove(mc.player);
        return arrayList;
    }

    //Removed param mF mF2,
    public static boolean minePlex(EntityPlayer entityPlayer) { // f$E
        return AntiBot.INSTANCE.minePlexCheck(entityPlayer);
    }

    private boolean minePlexCheck(EntityPlayer entityPlayer) { // f$E
        return mineplex && (int)mc.player.posX == (int)entityPlayer.posX && (int)mc.player.posZ == (int)entityPlayer.posZ && (int)entityPlayer.posY - (int)mc.player.posY > 8;
    }

    public static List<EntityPlayer> getList() { // f$E
        return AntiBot.INSTANCE.getPlayerList();
    }

    public static boolean name(EntityPlayer entityPlayer) {
        return AntiBot.INSTANCE.nameCheck(entityPlayer);
    }

    //Removed param mF mF2,
    public static boolean setMineplex(boolean bl) { // f$a
        AntiBot.INSTANCE.mineplex = bl;
        return AntiBot.INSTANCE.mineplex;
    }
}
/*
package net.futureclient.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.futureclient.client.BF;
import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.QF;
import net.futureclient.client.cE;
import net.futureclient.client.wF;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;

public class mF
extends Ba {
    public z<Boolean> f$K;
    public Map<Integer, UUID> f$d;
    private boolean f$g;
    public z<Boolean> f$j;
    private boolean f$M;
    public z<Boolean> f$b;
    public z<Boolean> f$i;

    public static Minecraft f$B() {
        return f$d;
    }

    public static boolean f$E(mF mF2) {
        return mF2.f$g;
    }

    @Override
    public void f$B() {
        mF mF2;
        mF mF3 = mF2;
        super.f$B();
        mF3.f$d.clear();
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public mF() {
        mF mF2;
        String[] stringArray = new String[4];
        stringArray[0] = "AntiBots";
        stringArray[1] = "AntiBot";
        stringArray[2] = "AntiEntity";
        stringArray[3] = "Antiboat";
        super("AntiBots", stringArray, true, -8374971, JD.f$I);
        mF mF3 = mF2;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Ping";
        stringArray2[1] = "Pin";
        stringArray2[2] = "Pong";
        mF3.f$K = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "Invisible";
        stringArray3[1] = "Invis";
        mF2.f$b = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[2];
        stringArray4[0] = "Name";
        stringArray4[1] = "Nam";
        mF2.f$j = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "UUID";
        stringArray5[1] = "UserID";
        stringArray5[2] = "UID";
        mF2.f$i = new z<Boolean>(true, stringArray5);
        mF2.f$d = new HashMap<Integer, UUID>();
        mF2.f$E(mF2.f$K, mF2.f$b, mF2.f$j, mF2.f$i);
        mF2.f$E(new cE(mF2), new wF(mF2), new QF(mF2), new BF(mF2));
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    private boolean f$B(EntityPlayer entityPlayer) {
        return 0.f$b.f$E() != false && entityPlayer.func_82150_aj() && !entityPlayer.func_70644_a(MobEffects.INVISIBILITY);
    }

    public static boolean f$B(mF mF2, EntityPlayer entityPlayer) {
        return mF2.f$B(entityPlayer);
    }

    public static Minecraft f$M() {
        return f$d;
    }

    @Override
    public void f$K() {
        mF mF2;
        super.f$K();
        if (!f$d.isSingleplayer() && f$d.getCurrentServerData() != null) {
            mF mF3 = mF2;
            mF3.f$M = mF.f$d.getCurrentServerData().serverIP.toLowerCase().contains("hypixel");
            mF3.f$g = mF.f$d.getCurrentServerData().serverIP.toLowerCase().contains("mineplex");
        }
    }

    private boolean f$a(EntityPlayer entityPlayer) {
        return 0.f$i.f$E() != false && f$d.getConnection() != null && f$d.getConnection().getPlayerInfo(entityPlayer.func_110124_au()) == null;
    }

    private boolean f$e(EntityPlayer entityPlayer) {
        if (0.f$j.f$E().booleanValue()) {
            if (entityPlayer.getDisplayName().getFormattedText().equalsIgnoreCase(new StringBuilder().insert(0, entityPlayer.getName()).append("\u00a7r").toString())) {
                if (!((Minecraft)mF.f$d).player.func_145748_c_().getFormattedText().equalsIgnoreCase(new StringBuilder().insert(0, ((Minecraft)mF.f$d).player.func_70005_c_()).append("\u00a7r").toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static boolean f$E(mF mF2, boolean bl) {
        mF2.f$g = bl;
        return mF2.f$g;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static boolean f$a(mF mF2, EntityPlayer entityPlayer) {
        return mF2.f$a(entityPlayer);
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    private List<EntityPlayer> f$e() {
        ArrayList<EntityPlayer> arrayList = new ArrayList<EntityPlayer>(mF.f$d.world.field_73010_i);
        arrayList.remove(((Minecraft)mF.f$d).player);
        return arrayList;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static boolean f$E(mF mF2, EntityPlayer entityPlayer) {
        return mF2.f$E(entityPlayer);
    }

    private boolean f$E(EntityPlayer entityPlayer) {
        return 0.f$M && (int)mF.f$d.player.field_70165_t == (int)entityPlayer.field_70165_t && (int)mF.f$d.player.field_70161_v == (int)entityPlayer.field_70161_v && (int)entityPlayer.field_70163_u - (int)mF.f$d.player.field_70163_u > 8;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static List f$E(mF mF2) {
        return mF2.f$e();
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static boolean f$e(mF mF2, EntityPlayer entityPlayer) {
        return mF2.f$e(entityPlayer);
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static boolean f$a(mF mF2, boolean bl) {
        mF2.f$M = bl;
        return mF2.f$M;
    }

    public static Minecraft f$j() {
        return f$d;
    }
}

 */