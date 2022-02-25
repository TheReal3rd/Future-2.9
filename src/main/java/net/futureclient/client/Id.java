package net.futureclient.client;

import net.futureclient.client.Qb;
import net.futureclient.client.Uh;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.ka;
import net.futureclient.client.wD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;

public class Id
extends Qb {
    private ka f$g;
    private Minecraft f$d;

    @Override
    public void f$a(int n, int n2, int n3) {
        Id id = 0;
        super.f$B(n, n2, n3);
        if (id.f$E(n, n2)) {
            if (n3 == 0) {
                0.f$g.f$a();
                return;
            }
            if (n3 == 1) {
                Id id2 = 0;
                id2.f$g.f$E();
                id2.f$d.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
            }
        }
    }

    @Override
    public boolean f$E() {
        return true;
    }

    @Override
    public void f$E(int n, int n2, float f2) {
        gF f2 = (gF)kH.f$E().f$E().f$E(gF.class);
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        Id id = 0;
        Id id2 = 0;
        Id id3 = 0;
        Uh.f$E(id.f$b, id.f$j, id2.f$b + (float)id2.f$i + 7.0f, id3.f$j + (float)id3.f$M, 0.f$E() ? (!0.f$E(n, n2) ? wD2.f$a.getRGB() + -1728053248 : wD2.f$a.getRGB() + 0x70000000) : (!0.f$E(n, n2) ? 0x11555555 : -2007673515));
        if (f2.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            f2.f$L.f$E(String.format("%s\u00a77 %s", 0.f$E(), 0.f$g.f$E()), (double)(0.f$b + 2.0f), (double)(0.f$j + 4.0f), 0xFFFFFF);
            GlStateManager.disableBlend();
            return;
        }
        0.f$d.fontRenderer.drawStringWithShadow(String.format("%s\u00a77 %s", 0.f$E(), 0.f$g.f$E()), 0.f$b + 2.0f, 0.f$j + 4.0f, 0xFFFFFF);
    }

    @Override
    public int f$E() {
        return 14;
    }

    public Id(ka ka2) {
        super(ka2.f$E()[0]);
        0.f$d = Minecraft.getMinecraft();
        0.f$g = ka2;
    }

    @Override
    public void f$E() {
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Tf;
import net.futureclient.client.jf;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.network.play.server.SPacketPlayerPosLook;

public class ID
extends Ha<jf> {
    public final Tf f$d;

    public ID(Tf tf) {
        0.f$d = tf;
    }

    @Override
    public void f$E(jf jf2) {
        if (Tf.f$K().currentScreen instanceof GuiDownloadTerrain) {
            Tf.f$E(0.f$d, true);
            Tf.f$E(0.f$d).f$a();
            Tf.f$B().currentScreen = null;
        }
        if (jf2.f$E() instanceof SPacketPlayerPosLook) {
            if (((Boolean)Tf.f$E(0.f$d).f$E()).booleanValue() && !Tf.f$e().player.func_184218_aH()) {
                SPacketPlayerPosLook sPacketPlayerPosLook = (SPacketPlayerPosLook)jf2.f$E();
                Tf.f$e(0.f$d, sPacketPlayerPosLook.getX());
                Tf.f$a(0.f$d, sPacketPlayerPosLook.getY());
                Tf.f$E(0.f$d, sPacketPlayerPosLook.getZ());
                Tf.f$a().player.func_70107_b(sPacketPlayerPosLook.getX(), sPacketPlayerPosLook.getY(), sPacketPlayerPosLook.getZ());
            }
            jf2.f$E(true);
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Dc;
import net.futureclient.client.JD;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class id
extends Ba {
    private s f$d;
    private z<Boolean> f$g;

    public static z f$E(id id2) {
        return id2.f$g;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public id() {
        id id2;
        String[] stringArray = new String[3];
        stringArray[0] = "HighJump";
        stringArray[1] = "AACHighJump";
        stringArray[2] = "AACJump";
        super("HighJump", stringArray, true, -11127454, JD.f$j);
        id id3 = id2;
        String[] stringArray2 = new String[6];
        stringArray2[0] = "InAir";
        stringArray2[1] = "Air";
        stringArray2[2] = "OnGroundOnly";
        stringArray2[3] = "OnGround";
        stringArray2[4] = "GroundOnly";
        stringArray2[5] = "Ground";
        id3.f$g = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[7];
        stringArray3[0] = "Height";
        stringArray3[1] = "Heigh";
        stringArray3[2] = "Hight";
        stringArray3[3] = "High";
        stringArray3[4] = "Size";
        stringArray3[5] = "Scaling";
        stringArray3[6] = "Scale";
        id2.f$d = new s((Number)0.42, (Number)0.0, (Number)1.0, stringArray3);
        id2.f$E(id2.f$g, id2.f$d);
        id2.f$E(new Dc(id2));
    }

    public static s f$E(id id2) {
        return id2.f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public class iD
extends RF {
    public iD() {
        iD iD2;
    }
}
