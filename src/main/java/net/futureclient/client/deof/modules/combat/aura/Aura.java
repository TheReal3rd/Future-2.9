package net.futureclient.client.deof.modules.combat.aura;

import net.futureclient.client.*;
import net.minecraft.entity.player.EntityPlayer;

public class Aura {
}
/*
package net.futureclient.client;

import java.util.ArrayList;
import java.util.Objects;
import net.futureclient.client.BI;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.Eg;
import net.futureclient.client.FE;
import net.futureclient.client.JD;
import net.futureclient.client.Jg;
import net.futureclient.client.Pg;
import net.futureclient.client.RF;
import net.futureclient.client.TH;
import net.futureclient.client.bf;
import net.futureclient.client.cg;
import net.futureclient.client.fe;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.mF;
import net.futureclient.client.oI;
import net.futureclient.client.oe;
import net.futureclient.client.of;
import net.futureclient.client.rF;
import net.futureclient.client.s;
import net.futureclient.client.sG;
import net.futureclient.client.vB;
import net.futureclient.client.xE;
import net.futureclient.client.xe;
import net.futureclient.client.yF;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;

public class Ze
extends Ba {
    public z<Boolean> f$Q;
    public z<Boolean> f$O;
    public s f$L;
    private ka<Jg> f$e;
    public z<Boolean> f$G;
    public z<Boolean> f$r;
    private ArrayList<Entity> f$i;
    public s f$c;
    private int f$d;
    private ka<sG> f$I;
    public z<Boolean> f$H;
    public z<Boolean> f$F;
    public z<Boolean> f$E;
    public z<Boolean> f$D;
    public ArrayList<Entity> f$b;
    private Entity f$M;
    private transient double f$K;
    public z<Boolean> f$u;
    public s f$A;
    public z<Boolean> f$J;
    public ka<cg> f$a;
    public s f$l;
    public z<Boolean> f$k;
    private Bh f$g;
    private Entity f$j;
    private ka<Eg> f$C;
    public s f$B;
    public z<Boolean> f$y;
    public z<Boolean> f$T;
    public z<Boolean> f$m;
    public z<Boolean> f$f;
    public z<Boolean> f$v;
    public z<Boolean> f$h;

    public Ze() {
        Ze ze;
        String[] stringArray = new String[3];
        stringArray[0] = "Aura";
        stringArray[1] = "ka";
        stringArray[2] = "ff";
        super("Aura", stringArray, true, -56064, JD.f$I);
        Ze ze2 = ze;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "ArmorCheck";
        stringArray2[1] = "Armor";
        stringArray2[2] = "armored";
        ze2.f$Q = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Hit Delay";
        stringArray3[1] = "HitDelay";
        stringArray3[2] = "Hit-Delay";
        ze.f$O = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "AutoBlock";
        stringArray4[1] = "block";
        stringArray4[2] = "ab";
        ze.f$v = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[2];
        stringArray5[0] = "AutoWeapon";
        stringArray5[1] = "AutoSword";
        ze.f$u = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Through Walls";
        stringArray6[1] = "walls";
        stringArray6[2] = "throughwalls";
        ze.f$T = new z<Boolean>(true, stringArray6);
        String[] stringArray7 = new String[3];
        stringArray7[0] = "While Eating";
        stringArray7[1] = "eating";
        stringArray7[2] = "whileeating";
        ze.f$r = new z<Boolean>(false, stringArray7);
        String[] stringArray8 = new String[2];
        stringArray8[0] = "StopSprinting";
        stringArray8[1] = "StopSprint";
        ze.f$y = new z<Boolean>(true, stringArray8);
        String[] stringArray9 = new String[1];
        stringArray9[0] = "Teams";
        ze.f$G = new z<Boolean>(false, stringArray9);
        String[] stringArray10 = new String[6];
        stringArray10[0] = "FriendProtect";
        stringArray10[1] = "protect";
        stringArray10[2] = "friend-protect";
        stringArray10[3] = "friend";
        stringArray10[4] = "friends";
        stringArray10[5] = "fp";
        ze.f$h = new z<Boolean>(true, stringArray10);
        String[] stringArray11 = new String[3];
        stringArray11[0] = "Invisibles";
        stringArray11[1] = "Invisible";
        stringArray11[2] = "Invis";
        ze.f$f = new z<Boolean>(true, stringArray11);
        String[] stringArray12 = new String[3];
        stringArray12[0] = "Players";
        stringArray12[1] = "player";
        stringArray12[2] = "p";
        ze.f$k = new z<Boolean>(true, stringArray12);
        String[] stringArray13 = new String[3];
        stringArray13[0] = "Monsters";
        stringArray13[1] = "monster";
        stringArray13[2] = "mon";
        ze.f$F = new z<Boolean>(false, stringArray13);
        String[] stringArray14 = new String[6];
        stringArray14[0] = "Neutrals";
        stringArray14[1] = "Passive";
        stringArray14[2] = "Passives";
        stringArray14[3] = "Neutral";
        stringArray14[4] = "neu";
        stringArray14[5] = "n";
        ze.f$J = new z<Boolean>(false, stringArray14);
        String[] stringArray15 = new String[3];
        stringArray15[0] = "Animals";
        stringArray15[1] = "ani";
        stringArray15[2] = "animal";
        ze.f$E = new z<Boolean>(false, stringArray15);
        String[] stringArray16 = new String[3];
        stringArray16[0] = "Boats";
        stringArray16[1] = "Boat";
        stringArray16[2] = "b";
        ze.f$H = new z<Boolean>(false, stringArray16);
        String[] stringArray17 = new String[4];
        stringArray17[0] = "Rotate";
        stringArray17[1] = "Angles";
        stringArray17[2] = "Rotat";
        stringArray17[3] = "Rotanty";
        ze.f$m = new z<Boolean>(true, stringArray17);
        String[] stringArray18 = new String[3];
        stringArray18[0] = "Raytrace";
        stringArray18[1] = "raytrace";
        stringArray18[2] = "rt";
        ze.f$D = new z<Boolean>(false, stringArray18);
        String[] stringArray19 = new String[4];
        stringArray19[0] = "TicksExisted";
        stringArray19[1] = "TicksExisted";
        stringArray19[2] = "te";
        stringArray19[3] = "ticks";
        ze.f$l = new s((Number)Float.valueOf(50.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(200.0f), 1, stringArray19);
        String[] stringArray20 = new String[5];
        stringArray20[0] = "Range";
        stringArray20[1] = "reach";
        stringArray20[2] = "r";
        stringArray20[3] = "distance";
        stringArray20[4] = "dist";
        ze.f$L = new s((Number)Float.valueOf(4.2f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(6.0f), 1.273197475E-314, stringArray20);
        String[] stringArray21 = new String[9];
        stringArray21[0] = "FOV";
        stringArray21[1] = "FieldOfView";
        stringArray21[2] = "Field";
        stringArray21[3] = "Feldofview";
        stringArray21[4] = "feldofvew";
        stringArray21[5] = "viewrange";
        stringArray21[6] = "ofview";
        stringArray21[7] = "fieldov";
        stringArray21[8] = "fieldoview";
        ze.f$c = new s((Number)Float.valueOf(180.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(180.0f), 1.0, stringArray21);
        String[] stringArray22 = new String[3];
        stringArray22[0] = "RandomSpeed";
        stringArray22[1] = "randomsped";
        stringArray22[2] = "rspeed";
        ze.f$A = new s((Number)0.0, (Number)0.0, (Number)0.0, 1.273197475E-314, stringArray22);
        String[] stringArray23 = new String[4];
        stringArray23[0] = "AttackSpeed";
        stringArray23[1] = "CPS";
        stringArray23[2] = "clicks";
        stringArray23[3] = "click";
        ze.f$B = new s((Number)0.0, (Number)1.273197475E-314, (Number)0.0, 1.273197475E-314, stringArray23);
        String[] stringArray24 = new String[5];
        stringArray24[0] = "Mode";
        stringArray24[1] = "Targeting";
        stringArray24[2] = "target";
        stringArray24[3] = "mode";
        stringArray24[4] = "tar";
        ze.f$a = new ka<cg>(cg.f$M, stringArray24);
        String[] stringArray25 = new String[4];
        stringArray25[0] = "Server";
        stringArray25[1] = "ServerMode";
        stringArray25[2] = "ServerType";
        stringArray25[3] = "S";
        ze.f$C = new ka<Eg>(Eg.f$i, stringArray25);
        String[] stringArray26 = new String[4];
        stringArray26[0] = "Priority";
        stringArray26[1] = "Prioritization";
        stringArray26[2] = "priority";
        stringArray26[3] = "pri";
        ze.f$e = new ka<Jg>(Jg.f$g, stringArray26);
        String[] stringArray27 = new String[4];
        stringArray27[0] = "Bone";
        stringArray27[1] = "Bon";
        stringArray27[2] = "Spot";
        stringArray27[3] = "b";
        ze.f$I = new ka<sG>(sG.f$j, stringArray27);
        Ze ze3 = ze;
        ze3.f$K = 0.0;
        ze3.f$j = null;
        ze.f$M = null;
        ze.f$g = new Bh();
        ze.f$E(ze.f$a, ze.f$e, ze.f$C, ze.f$I, ze.f$O, ze.f$T, ze.f$r, ze.f$y, ze.f$m, ze.f$D, ze.f$G, ze.f$h, ze.f$f, ze.f$k, ze.f$F, ze.f$J, ze.f$E, ze.f$H, ze.f$Q, ze.f$v, ze.f$u, ze.f$c, ze.f$B, ze.f$A, ze.f$l, ze.f$L);
        ze.f$b = new ArrayList();
        ze.f$i = new ArrayList();
        ze.f$E(new yF(ze), new of(ze), new xe(ze), new FE(ze), new rF(ze), new oe(ze), new bf(ze));
    }

    public static Minecraft f$K() {
        return f$d;
    }

    @Override
    public void f$K() {
        Ze ze;
        super.f$K();
    }

    private boolean f$e(Entity entity) {
        try {
            entity.getName();
        }
        catch (ClassCastException classCastException) {
            return true;
        }
        if (entity.posY - Ze.f$d.player.field_70163_u > 0.0) {
            return true;
        }
        if (entity == null || entity.ticksExisted < 0.f$l.f$E().intValue() || entity.getName() == null) {
            return true;
        }
        return Ze.f$d.player.connection.getPlayerInfo(entity.getName()) == null;
    }

    private static int f$e(Entity entity, Entity entity2) {
        double d = entity.getDistance((Entity)Ze.f$d.player);
        return Double.compare(entity2.getDistance((Entity)Ze.f$d.player), d);
    }

    private void f$e(Entity entity) {
        boolean bl;
        Entity entity2;
        fe fe2;
        Entity entity3;
        int n;
        boolean bl2 = Ze.f$d.player.isSneaking();
        boolean bl3 = 0.f$y.f$E() != false && Ze.f$d.player.func_70051_ag();
        boolean bl4 = Ze.f$d.player.func_184585_cz();
        if (0.f$u.f$E().booleanValue() && (n = Pg.f$E()) != -1 && Ze.f$d.player.field_71071_by.currentItem != n) {
            Ze.f$d.player.field_71071_by.currentItem = n;
            Ze.f$d.player.connection.sendPacket((Packet)new CPacketHeldItemChange(Ze.f$d.player.field_71071_by.currentItem));
        }
        if (bl2) {
            Ze.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ze.f$d.player, CPacketEntityAction.Action.STOP_SNEAKING));
        }
        if (bl3) {
            Ze.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ze.f$d.player, CPacketEntityAction.Action.STOP_SPRINTING));
        }
        if (bl4) {
            Pg.f$E();
        }
        if (0.f$D.f$E().booleanValue() && (entity3 = new oI(entity, (sG)((Object)0.f$I.f$E())).f$E()) != 0.f$j) {
            entity = entity3;
        }
        if ((fe2 = (fe)kH.f$E().f$E().f$E(fe.class)) != null && fe2.f$E() && ((xE)((Object)fe2.f$M.f$E())).equals((Object)xE.f$g)) {
            fe2.f$A();
        }
        if (0.f$O.f$E().booleanValue()) {
            Ze.f$d.playerController.attackEntity((EntityPlayer)Ze.f$d.player, entity);
            Ze.f$d.player.swingArm(EnumHand.MAIN_HAND);
            entity2 = entity;
        } else {
            Ze.f$d.player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
            Ze.f$d.player.swingArm(EnumHand.MAIN_HAND);
            entity2 = entity;
        }
        float f = entity2 instanceof EntityLivingBase ? EnchantmentHelper.getModifierForCreature((ItemStack)Ze.f$d.player.func_184586_b(EnumHand.MAIN_HAND), (EnumCreatureAttribute)((EntityLivingBase)entity).getCreatureAttribute()) : 0.0f;
        boolean bl5 = bl = Ze.f$d.player.field_70143_R > 0.0f && !Ze.f$d.player.field_70122_E && !Ze.f$d.player.func_70617_f_() && !Ze.f$d.player.func_70090_H() && !Ze.f$d.player.func_70644_a(MobEffects.BLINDNESS) && Ze.f$d.player.func_184187_bx() == null;
        if (fe2 != null && fe2.f$E() || bl) {
            Ze.f$d.player.onCriticalHit(entity);
        }
        if (f > 0.0f) {
            Ze.f$d.player.onEnchantmentCritical(entity);
        }
        if (bl2) {
            Ze.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ze.f$d.player, CPacketEntityAction.Action.START_SNEAKING));
        }
        if (bl3) {
            Ze.f$d.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Ze.f$d.player, CPacketEntityAction.Action.START_SPRINTING));
        }
        if (bl4) {
            Pg.f$a();
        }
    }

    public static Minecraft f$e() {
        return f$d;
    }

    private void f$a(Entity entity) {
        0.f$j = entity;
    }

    private static int f$a(Entity entity, Entity entity2) {
        double d = entity instanceof EntityLivingBase ? (double)((EntityLivingBase)entity).getHealth() : 0.0;
        double d2 = entity2 instanceof EntityLivingBase ? (double)((EntityLivingBase)entity2).getHealth() : 0.0;
        return Double.compare(d2, d);
    }

    private boolean f$a(Entity entity) {
        return !0.f$E(entity, true);
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Entity f$a(Ze ze, Entity entity) {
        ze.f$j = entity;
        return ze.f$j;
    }

    public static Entity f$E(Ze ze, Entity entity) {
        ze.f$M = entity;
        return ze.f$M;
    }

    public Entity f$E() {
        Ze ze;
        return ze.f$j;
    }

    private boolean f$E(Entity entity) {
        return !0.f$E(entity, false);
    }

    private void f$E(Entity entity) {
        0.f$M = entity;
    }

    private static int f$E(Entity entity, Entity entity2) {
        double d = TH.f$E(entity);
        return Double.compare(TH.f$E(entity2), d);
    }

    public static ka f$E(Ze ze) {
        return ze.f$C;
    }

    public static void f$E(Ze ze) {
        ze.f$h();
    }


private void f$E(RF var1) {

     * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
     *
     * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl77 : ALOAD_0 - null : trying to set 2 previously set to 1
     *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:207)
     *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1565)
     *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:433)
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

    private boolean f$E(Entity entity2, boolean bl2) {
        Entity entity2;
        if (entity2 == null) {
            return false;
        }
        if (entity2.equals((Object) Ze.f$d.player)) {
            return false;
        }
        if (entity2.equals((Object)Ze.f$d.player.func_184187_bx())) {
            return false;
        }
        if (!Pg.f$E(entity2)) {
            return false;
        }
        if (entity2.ticksExisted < 0.f$l.f$E().intValue()) {
            return false;
        }
        double d = Ze.f$d.player.func_70032_d(entity2);
        double d2 = 0.f$L.f$E().floatValue();
        double d3 = bl2 ? 0.0 : 1.0;
        if (d > d2 * d3) {
            return false;
        }
        if (!TH.f$E(entity2, 0.f$c.f$E().floatValue(), entity2 instanceof EntityLivingBase ? (sG)((Object)0.f$I.f$E()) : sG.f$M)) {
            return false;
        }
        Entity entity3 = entity2;
        if (!Pg.f$E(entity3, entity3 instanceof EntityLivingBase ? (sG)((Object)0.f$I.f$E()) : sG.f$M) && !0.f$T.f$E().booleanValue()) {
            return false;
        }
        if (0.f$C.f$E() == Eg.f$M && !0.f$B(entity2)) {
            return false;
        }
        if (((vB)kH.f$E().f$E().f$E(vB.class)).f$E() && entity2 instanceof EntityAnimal && ((EntityAnimal)entity2).func_110138_aP() == 20.0f) {
            return true;
        }
        if (0.f$H.f$E().booleanValue() && entity2 instanceof EntityBoat) {
            if (entity2.getPassengers().contains(Ze.f$d.player)) {
                return false;
            }
            if (Objects.equals(entity2.getControllingPassenger(), Ze.f$d.player)) {
                return false;
            }
            if (entity2.getPassengers().isEmpty()) {
                return true;
            }
            if (!(entity2.getControllingPassenger() == null || 0.f$h.f$E().booleanValue() && kH.f$E().f$E().f$E(entity2.getControllingPassenger().getName()))) {
                return true;
            }
        }
        if (entity2 instanceof EntityPlayer && 0.f$k.f$E().booleanValue()) {
            EntityPlayer bl2 = (EntityPlayer)entity2;
            mF mF2 = (mF)kH.f$E().f$E().f$E(mF.class);
            if (mF2.f$E() && mF2.f$d.containsKey(bl2.func_145782_y())) {
                return false;
            }
            if (0.f$C.f$E() == Eg.f$g) {
                if (bl2.getName().contains("Dead")) {
                    return false;
                }
            }
            if (bl2.func_145782_y() == -1337) {
                return false;
            }
            if ((0.f$C.f$E() == Eg.f$M || 0.f$C.f$E() == Eg.f$g) && 0.f$e((Entity)bl2)) {
                return false;
            }
            if (entity2.equals((Object)Ze.f$d.player)) {
                return false;
            }
            if (0.f$G.f$E().booleanValue() && Pg.f$a(entity2)) {
                return false;
            }
            if (0.f$Q.f$E().booleanValue() && !Pg.f$E(bl2)) {
                return false;
            }
            if (0.f$h.f$E().booleanValue() && kH.f$E().f$E().f$E(bl2.getName())) {
                return false;
            }
            if (bl2.capabilities.isCreativeMode) {
                return false;
            }
            return !bl2.func_82150_aj() || 0.f$f.f$E() != false;
        }
        if ((BI.f$M(entity2) || BI.f$C(entity2)) && 0.f$F.f$E().booleanValue()) {
            return true;
        }
        if (BI.f$j(entity2) && 0.f$J.f$E().booleanValue()) {
            return true;
        }
        return BI.f$I(entity2) && 0.f$E.f$E() != false;
    }

    public static void f$E(Ze ze, RF rF2) {
        ze.f$E(rF2);
    }

    public static Minecraft f$E() {
        return f$d;
    }

    @Override
    public void f$B() {
        Ze ze;
        Pg.f$E();
        Ze ze2 = ze;
        super.f$B();
        ze.f$j = null;
        ze2.f$M = null;
        ze.f$g.f$a();
        ze2.f$b.clear();
        ze2.f$i.clear();
    }

    public static Minecraft f$B() {
        return f$d;
    }

    private boolean f$B(Entity entity) {
        return entity.getEntityId() != Ze.f$d.player.func_145782_y() && entity.getEntityId() <= 1000000000 && entity.getEntityId() > -1;
    }

    private void f$A() {
        for (Entity entity : Pg.f$a()) {
            Ze ze;
            if (ze.f$E(entity, false)) {
                ze.f$b.add(entity);
            }
            if (!(entity instanceof EntityLivingBase) || !ze.f$E(entity = (EntityLivingBase)entity, true)) continue;
            ze.f$i.add(entity);
        }
    }

    public static Minecraft f$A() {
        return f$d;
    }

    private void f$h() {
        Ze ze;
        Ze ze2;
        block10: {
            block9: {
                block8: {
                    Ze ze3 = ze2;
                    if (!ze3.f$E(ze3.f$j, false)) break block8;
                    if (((cg)((Object)ze2.f$a.f$E())).equals((Object)cg.f$M)) {
                        Ze ze4 = ze2;
                        ++ze4.f$d;
                        if (ze4.f$d >= ze2.f$b.size()) {
                            ze2.f$d = 0;
                        }
                    }
                    if (ze2.f$O.f$E().booleanValue()) {
                        float f = -(20.0f - kH.f$E().f$E().f$E());
                        if (Ze.f$d.player.func_184825_o(0.5f + f) >= 1.0f) {
                            Ze ze5 = ze2;
                            ze5.f$e(ze5.f$j);
                        }
                    } else {
                        Ze ze6 = ze2;
                        if (ze6.f$g.f$E(ze6.f$K)) {
                            Ze ze7 = ze2;
                            ze7.f$e(ze7.f$j);
                            Ze ze8 = ze2;
                            double d = Math.random() * ze8.f$A.f$E().doubleValue() * 0.0 - ze2.f$A.f$E().doubleValue();
                            ze7.f$K = Math.max(ze8.f$B.f$E().doubleValue() + d, 0.0);
                            ze7.f$g.f$a();
                        }
                    }
                    if (!((cg)((Object)ze2.f$a.f$E())).equals((Object)cg.f$M) || ze2.f$d < 2 || ze2.f$b.size() <= 1) break block9;
                    Ze ze9 = ze2;
                    ze9.f$b.remove(ze9.f$j);
                    ze = ze2;
                    ze2.f$j = null;
                    break block10;
                }
                Ze ze10 = ze2;
                ze10.f$b.remove(ze10.f$j);
                ze2.f$j = null;
            }
            ze = ze2;
        }
        if (ze.f$v.f$E().booleanValue()) {
            Ze ze11 = ze2;
            if (ze11.f$E(ze11.f$M, true)) {
                Pg.f$a();
            }
        }
    }
}
 */