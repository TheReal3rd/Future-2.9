package net.futureclient.client;

public enum JD {
    f$I("Combat"),
    f$K("Exploits"),
    f$b("Miscellaneous"),
    f$j("Movement"),
    f$i("Render"),
    f$M("World");

    private String f$g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JD(String string) {
        JD jD;
        jD.f$g = 0;
    }

    public String f$E() {
        JD jD;
        return jD.f$g;
    }
}
package net.futureclient.client;

public enum Jd {
    f$i,
    f$M,
    f$g;


    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Jd() {
        Jd jd;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Qb;
import net.futureclient.client.Uh;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.wD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.input.Keyboard;

public class jd
extends Qb {
    private Minecraft f$d;
    private Ba f$g;

    private void f$E(Ba ba, int n) {
        kH.f$E().f$E().f$E(String.format("%sToggle", ba.f$E())).f$E(n);
    }

    /*
     * Unable to fully structure code
     */
    private void f$a() {
        block2: {
            if (!Keyboard.getEventKeyState() || !0.f$E()) break block2;
            var1_1 = Keyboard.getEventKey();
            if (var1_1 == 211) ** GOTO lbl-1000
            v0 = new Object[1];
            v0[0] = "ClickGui";
            if (var1_1 == kH.f$E().f$E().f$E(String.format("%sToggle", v0)).f$E()) lbl-1000:
            // 2 sources

            {
                v1 = 0;
                v2 = v1;
                v1.f$E(v1.f$g, 0);
            } else {
                v3 = 0;
                v2 = v3;
                v3.f$E(v3.f$g, var1_1);
            }
            v2.f$E(false);
        }
    }

    @Override
    public void f$a(int n, int n2, int n3) {
        super.f$B(n, n2, n3);
    }

    private int f$E(Ba ba) {
        return kH.f$E().f$E().f$E(String.format("%sToggle", ba.f$E())).f$E();
    }

    @Override
    public void f$E(int n, int n2, float f2) {
        jd jd2;
        String string;
        0.f$a();
        gF f2 = (gF)kH.f$E().f$E().f$E(gF.class);
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        jd jd3 = 0;
        jd jd4 = 0;
        jd jd5 = 0;
        Uh.f$E(jd3.f$b, jd3.f$j, jd4.f$b + (float)jd4.f$i + 7.0f, jd5.f$j + (float)jd5.f$M, 0.f$E() ? (!0.f$E(n, n2) ? wD2.f$a.getRGB() + -1728053248 : wD2.f$a.getRGB() + 0x70000000) : (!0.f$E(n, n2) ? 0x11555555 : -2007673515));
        if (f2.f$c.f$E().booleanValue()) {
            jd jd6;
            String string2;
            GlStateManager.enableBlend();
            if (0.f$E()) {
                string2 = "Press a Key...";
                jd6 = 0;
            } else {
                Object[] objectArray = new Object[1];
                jd jd7 = 0;
                objectArray[0] = Keyboard.getKeyName((int)jd7.f$E(jd7.f$g));
                string2 = String.format("Keybind \u00a77%s", objectArray);
                jd6 = 0;
            }
            f2.f$L.f$E(string2, (double)(jd6.f$b + 2.0f), (double)(0.f$j + 4.0f), 0xFFFFFF);
            GlStateManager.disableBlend();
            return;
        }
        if (0.f$E()) {
            string = "Press a Key...";
            jd2 = 0;
        } else {
            Object[] objectArray = new Object[1];
            jd jd8 = 0;
            objectArray[0] = Keyboard.getKeyName((int)jd8.f$E(jd8.f$g));
            string = String.format("Keybind \u00a77%s", objectArray);
            jd2 = 0;
        }
        0.f$d.fontRenderer.drawStringWithShadow(string, jd2.f$b + 2.0f, 0.f$j + 4.0f, 0xFFFFFF);
    }

    public jd(Ba ba) {
        jd jd2 = 0;
        super("");
        0.f$d = Minecraft.getMinecraft();
        jd2.f$g = ba;
        jd2.f$i = 15;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.fH;
import net.futureclient.client.kH;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.world.World;

public class jD
extends Ha<ME> {
    public final ItemStack f$g;
    public final fH f$d;

    @Override
    public void f$E(ME mE) {
        TileEntityShulkerBox tileEntityShulkerBox = new TileEntityShulkerBox();
        jD jD2 = 0;
        tileEntityShulkerBox.func_145834_a((World)fH.f$a((fH)0.f$d).world);
        tileEntityShulkerBox.readFromNBT(jD2.f$g.getTagCompound().getCompoundTag("BlockEntityTag"));
        fH.f$E((fH)jD2.f$d).player.displayGUIChest((IInventory)tileEntityShulkerBox);
        kH.f$E().f$E().f$E(0);
    }

    public jD(fH fH2, ItemStack itemStack) {
        0.f$d = fH2;
        0.f$g = itemStack;
    }
}
