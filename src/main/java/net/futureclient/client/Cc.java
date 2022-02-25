package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Pg;
import net.futureclient.client.dd;
import net.futureclient.client.uA;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

public class Cc
extends Ha<ME> {
    public final uA f$d;

    public Cc(uA uA2) {
        0.f$d = uA2;
    }

    @Override
    public void f$E(ME mE) {
        if (0.f$d.f$K.f$E() == dd.f$K && uA.f$Jd().player.field_70123_F && uA.f$UC().player.field_70181_x < -0.19 + Pg.f$E()) {
            if (uA.f$oC().player.field_70122_E) {
                uA.f$yA().player.connection.sendPacket((Packet)new CPacketPlayer(false));
                uA.f$e(0.f$d, true);
                return;
            }
            uA.f$Sd().player.field_70181_x = 0.42 + Pg.f$E();
            uA.f$e(0.f$d, true);
            uA.f$Ed().player.connection.sendPacket((Packet)new CPacketPlayer(true));
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.PB;

public class CC
extends Ba {
    public CC() {
        CC cC;
        String[] stringArray = new String[2];
        stringArray[0] = "AntiLevitation";
        stringArray[1] = "NoLevitation";
        super("AntiLevitation", stringArray, true, 0xCEFFFF, JD.f$j);
        Ha[] haArray = new Ha[1];
        haArray[0] = new PB(cC);
        cC.f$E(haArray);
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.EA;
import net.futureclient.client.Fb;
import net.futureclient.client.JD;
import net.futureclient.client.Kd;
import net.futureclient.client.Pg;
import net.futureclient.client.WB;
import net.futureclient.client.Yc;
import net.futureclient.client.dA;
import net.futureclient.client.hC;
import net.futureclient.client.ib;
import net.futureclient.client.kc;
import net.futureclient.client.nC;
import net.futureclient.client.s;
import net.futureclient.client.xb;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenOptionsSounds;
import net.minecraft.client.gui.GuiVideoSettings;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.settings.KeyBinding;

public class cC
extends Ba {
    public z<Boolean> f$i;
    public z<Boolean> f$M;
    public z<Boolean> f$K;
    private s f$g;
    private static List<Class<? extends GuiScreen>> f$I;
    private Bh f$d;
    public z<Boolean> f$j;
    public z<Boolean> f$b;

    public cC() {
        cC cC2;
        String[] stringArray = new String[3];
        stringArray[0] = "NoSlow";
        stringArray[1] = "noslowdown";
        stringArray[2] = "ns";
        super("NoSlow", stringArray, false, -14254, JD.f$j);
        cC cC3 = cC2;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "SoulSand";
        stringArray2[1] = "ss";
        stringArray2[2] = "soul-sand";
        stringArray2[3] = "sand";
        cC3.f$K = new z<Boolean>(true, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "InventoryMove";
        stringArray3[1] = "Inventory-Move";
        stringArray3[2] = "invmove";
        stringArray3[3] = "inventory";
        cC2.f$b = new z<Boolean>(true, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Webs";
        stringArray4[1] = "web";
        stringArray4[2] = "w";
        cC2.f$j = new z<Boolean>(true, stringArray4);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Items";
        stringArray5[1] = "item";
        stringArray5[2] = "i";
        cC2.f$i = new z<Boolean>(true, stringArray5);
        String[] stringArray6 = new String[5];
        stringArray6[0] = "NCP Strict";
        stringArray6[1] = "NCPStrict";
        stringArray6[2] = "ncp";
        stringArray6[3] = "strict";
        stringArray6[4] = "ncps";
        cC2.f$M = new z<Boolean>(false, stringArray6);
        String[] stringArray7 = new String[4];
        stringArray7[0] = "WebSpeed";
        stringArray7[1] = "wspeed";
        stringArray7[2] = "web-speed";
        stringArray7[3] = "webs";
        cC2.f$g = new s((Number)3.5, (Number)1.1, (Number)10.0, 0.1, stringArray7);
        cC2.f$d = new Bh();
        cC2.f$E(cC2.f$b, cC2.f$K, cC2.f$g, cC2.f$j, cC2.f$i, cC2.f$M);
        cC2.f$E(new dA(cC2), new hC(cC2), new Kd(cC2), new Yc(cC2), new nC(cC2), new EA(cC2), new ib(cC2), new xb(cC2), new kc(cC2), new Fb(cC2));
    }

    public static Minecraft f$o() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$Y() {
        return f$d;
    }

    public static Minecraft f$w() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }

    private void f$A() {
        block3: {
            int n;
            KeyBinding[] keyBindingArray;
            block4: {
                int n2;
                cC cC2;
                if (!cC2.f$b.f$E().booleanValue()) break block3;
                keyBindingArray = new KeyBinding[]{cC.f$d.gameSettings.keyBindForward, cC.f$d.gameSettings.keyBindBack, cC.f$d.gameSettings.keyBindLeft, cC.f$d.gameSettings.keyBindRight, cC.f$d.gameSettings.keyBindJump, cC.f$d.gameSettings.keyBindSprint};
                if (!f$I.stream().anyMatch(clazz -> clazz.isInstance(((Minecraft)cC.f$d).currentScreen))) break block4;
                KeyBinding[] keyBindingArray2 = keyBindingArray;
                int n3 = keyBindingArray.length;
                int n4 = n2 = 0;
                while (n4 < n3) {
                    KeyBinding keyBinding = keyBindingArray2[n2];
                    KeyBinding.setKeyBindState((int)keyBinding.getKeyCode(), (boolean)Pg.f$E(keyBinding));
                    n4 = ++n2;
                }
                break block3;
            }
            if (((Minecraft)cC.f$d).currentScreen != null) break block3;
            KeyBinding[] keyBindingArray3 = keyBindingArray;
            int n5 = keyBindingArray.length;
            int n6 = n = 0;
            while (n6 < n5) {
                KeyBinding keyBinding = keyBindingArray3[n];
                if (!Pg.f$E(keyBinding)) {
                    KeyBinding.setKeyBindState((int)keyBinding.getKeyCode(), (boolean)false);
                }
                n6 = ++n;
            }
        }
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$t() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$W() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$v() {
        return f$d;
    }

    public static List f$e() {
        return f$I;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Bh f$E(cC cC2) {
        return cC2.f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$p() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    static {
        f$I = new ArrayList<Class<? extends GuiScreen>>();
        f$I.add(WB.class);
        f$I.add(GuiOptions.class);
        f$I.add(GuiVideoSettings.class);
        f$I.add(GuiScreenOptionsSounds.class);
        f$I.add(GuiContainer.class);
        f$I.add(GuiIngameMenu.class);
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static void f$E(cC cC2) {
        cC2.f$A();
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static s f$E(cC cC2) {
        return cC2.f$g;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$n() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }
}
package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.DA;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.aC;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.MobEffects;

public class cc
extends Ha<ME> {
    public final DA f$d;

    public cc(DA dA) {
        0.f$d = dA;
    }

    @Override
    public void f$E(ME mE) {
        if (0.f$d.f$K.f$E().booleanValue()) {
            DA.f$K().player.removeActivePotionEffect(MobEffects.NAUSEA);
            if (DA.f$B().player.func_70644_a(MobEffects.BLINDNESS)) {
                DA.f$e().player.func_184589_d(MobEffects.BLINDNESS);
            }
        }
        if (((aC)((Object)DA.f$E(0.f$d).f$E())).equals((Object)aC.f$g)) {
            Iterator iterator;
            Iterator iterator2 = iterator = DA.f$a().world.field_72996_f.iterator();
            while (iterator2.hasNext()) {
                Entity entity = (Entity)iterator.next();
                if (!(entity instanceof EntityItem)) {
                    iterator2 = iterator;
                    continue;
                }
                DA.f$E().world.removeEntity(entity);
                iterator2 = iterator;
            }
        }
    }
}
