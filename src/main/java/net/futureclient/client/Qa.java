package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Sa;
import net.futureclient.client.zf;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Qa
extends Ha<zf> {
    public final Sa f$d;

    public Qa(Sa sa) {
        0.f$d = sa;
    }

    @Override
    public void f$E(zf zf2) {
        BlockPos blockPos = zf2.f$E();
        Material material = Sa.f$a().world.func_180495_p(blockPos).func_185904_a();
        if ((Boolean)Sa.f$e(0.f$d).f$E() != false && material.equals(Material.FIRE) || (Boolean)Sa.f$a(0.f$d).f$E() != false && material.equals(Material.CACTUS) || ((Boolean)Sa.f$E(0.f$d).f$E()).booleanValue() && !Sa.f$E().world.func_175668_a(blockPos, false)) {
            zf2.f$E(new AxisAlignedBB((double)blockPos.func_177958_n(), (double)blockPos.func_177956_o(), (double)blockPos.func_177952_p(), (double)(blockPos.func_177958_n() + 1), (double)(blockPos.func_177956_o() + 1), (double)(blockPos.func_177952_p() + 1)));
        }
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.GC;
import net.futureclient.client.JD;
import net.futureclient.client.cA;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Slot;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketCloseWindow;
import net.minecraft.util.math.BlockPos;

public class QA
extends Ba {
    private s f$I;
    private int f$b;
    private z<Boolean> f$K;
    private s f$M;
    private BlockPos f$j;
    private boolean f$d;
    private int f$g;
    private List<BlockPos> f$i;

    public static void f$E(QA qA) {
        qA.f$A();
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public QA() {
        QA qA;
        String[] stringArray = new String[2];
        stringArray[0] = "ChestAura";
        stringArray[1] = "CA";
        super("ChestAura", stringArray, true, -357009, JD.f$b);
        QA qA2 = qA;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Range";
        stringArray2[1] = "Reach";
        stringArray2[2] = "Rang";
        qA2.f$I = new s((Number)Float.valueOf(4.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(6.0f), 0.1, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Onground";
        stringArray3[1] = "OnGroundOnly";
        stringArray3[2] = "NeedsOnGround";
        qA.f$K = new z<Boolean>(true, stringArray3);
        QA qA3 = qA;
        qA3.f$i = new ArrayList<BlockPos>();
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Cooldown";
        stringArray4[1] = "CD";
        stringArray4[2] = "Delay";
        qA3.f$M = new s((Number)Float.valueOf(1.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), 1, stringArray4);
        qA.f$d = false;
        qA.f$E(qA.f$I, qA.f$K, qA.f$M);
        qA.f$E(new GC(qA), new cA(qA));
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    @Override
    public void f$K() {
        QA qA;
        QA qA2 = qA;
        qA2.f$i.clear();
        super.f$K();
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static boolean f$E(QA qA, boolean bl) {
        qA.f$d = bl;
        return qA.f$d;
    }

    public static BlockPos f$E(QA qA) {
        return qA.f$j;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static z f$E(QA qA) {
        return qA.f$K;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static int f$a(QA qA) {
        return qA.f$b;
    }

    public static BlockPos f$E(QA qA, BlockPos blockPos) {
        qA.f$j = blockPos;
        return qA.f$j;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static s f$E(QA qA) {
        return qA.f$I;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static boolean f$E(QA qA) {
        return qA.f$d;
    }

    private void f$A() {
        QA qA;
        if (qA.f$g > 0) {
            --qA.f$g;
            return;
        }
        if (QA.f$d.currentScreen instanceof GuiChest) {
            boolean bl;
            int n;
            boolean bl2;
            block11: {
                bl2 = false;
                int n2 = n = QA.f$d.player.field_71070_bA.inventorySlots.size() - 36;
                while (n2 < QA.f$d.player.field_71070_bA.inventorySlots.size()) {
                    Slot slot = QA.f$d.player.field_71070_bA.getSlot(n);
                    if (!slot.getHasStack()) {
                        bl = bl2 = true;
                        break block11;
                    }
                    n2 = ++n;
                }
                bl = bl2;
            }
            if (!bl) {
                return;
            }
            while (qA.f$g == 0) {
                boolean bl3;
                block13: {
                    int n3;
                    Slot slot;
                    int n4;
                    block12: {
                        n = 0;
                        int n5 = n4 = 0;
                        while (n5 < QA.f$d.player.field_71070_bA.inventorySlots.size() - 36) {
                            slot = QA.f$d.player.field_71070_bA.getSlot(n4);
                            if (slot.getHasStack()) {
                                QA.f$d.playerController.windowClick(QA.f$d.player.field_71070_bA.windowId, n4, 0, ClickType.QUICK_MOVE, (EntityPlayer)QA.f$d.player);
                                qA.f$g = qA.f$M.f$E().intValue();
                                n = 1;
                                n3 = n;
                                break block12;
                            }
                            n5 = ++n4;
                        }
                        n3 = n;
                    }
                    if (n3 == 0) {
                        f$d.displayGuiScreen(null);
                        QA.f$d.player.connection.sendPacket((Packet)new CPacketCloseWindow(QA.f$d.player.field_71070_bA.windowId));
                        qA.f$d = true;
                        return;
                    }
                    bl2 = false;
                    int n6 = n4 = QA.f$d.player.field_71070_bA.inventorySlots.size() - 36;
                    while (n6 < QA.f$d.player.field_71070_bA.inventorySlots.size()) {
                        slot = QA.f$d.player.field_71070_bA.getSlot(n4);
                        if (!slot.getHasStack()) {
                            bl3 = bl2 = true;
                            break block13;
                        }
                        n6 = ++n4;
                    }
                    bl3 = bl2;
                }
                if (bl3) continue;
                return;
            }
        }
    }

    public static List f$E(QA qA) {
        return qA.f$i;
    }

    public static int f$E(QA qA) {
        return --qA.f$b;
    }

    public static int f$E(QA qA, int n) {
        qA.f$b = n;
        return qA.f$b;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.nE;
import net.futureclient.client.rA;

public class qA
extends Ha<nE> {
    public final rA f$d;

    public qA(rA rA2) {
        0.f$d = rA2;
    }

    @Override
    public void f$E(nE nE2) {
        nE2.f$E(true);
    }
}
package net.futureclient.client;

public enum qa {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qa() {
        qa qa2;
    }
}
