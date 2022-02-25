package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.LB;
import net.futureclient.client.jc;
import net.futureclient.client.ve;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;

public class RC
extends Ha<ve> {
    public final jc f$d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f$E(ve ve2) {
        switch ((LB)((Object)jc.f$a(0.f$d).f$E())) {
            case f$M: {
                if (!(ve2.f$E() instanceof CPacketPlayer) && !(ve2.f$E() instanceof CPacketPlayerTryUseItemOnBlock) && !(ve2.f$E() instanceof CPacketPlayerDigging) && !(ve2.f$E() instanceof CPacketUseEntity) && !(ve2.f$E() instanceof CPacketAnimation)) return;
                jc.f$E(0.f$d).add(ve2.f$E());
                ve2.f$E(true);
                return;
            }
            case f$g: {
                if (jc.f$E(0.f$d) || !(ve2.f$E() instanceof CPacketPlayer) || jc.f$E(0.f$d).contains(ve2.f$E())) return;
                jc.f$E(0.f$d).add(ve2.f$E());
                ve2.f$E(true);
                return;
            }
        }
    }

    public RC(jc jc2) {
        0.f$d = jc2;
    }
}
package net.futureclient.client;

import java.io.File;
import net.futureclient.client.GA;
import net.futureclient.client.kb;

public class Rc
extends GA {
    public final kb f$d;

    public Rc(kb kb2, String[] stringArray) {
        0.f$d = kb2;
        super(stringArray);
    }

    @Override
    public String f$E(String[] stringArray) {
        if (stringArray.length >= 1) {
            int n;
            StringBuilder stringBuilder = new StringBuilder();
            Object object = stringArray;
            int n2 = stringArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                String string = object[n];
                stringBuilder.append(string);
                stringBuilder.append(" ");
                n3 = ++n;
            }
            object = stringBuilder.toString().trim();
            File file = new File(kb.f$E(0.f$d), new StringBuilder().insert(0, (String)object).append(((String)object).endsWith(".txt") ? "" : ".txt").toString());
            if (file.exists()) {
                Rc rc = 0;
                rc.f$d.f$E(false);
                kb.f$E(rc.f$d, file.getPath());
                0.f$d.f$E(true);
                return new StringBuilder().insert(0, "The spammer file ").append((String)object).append(" was loaded successfully.").toString();
            }
            return new StringBuilder().insert(0, "File ").append((String)object).append(".txt does not exist.").toString();
        }
        return null;
    }

    @Override
    public String f$E() {
        return "&e[name]";
    }
}
package net.futureclient.client;

import java.util.stream.Collectors;
import net.futureclient.client.Ha;
import net.futureclient.client.cb;
import net.futureclient.client.jf;
import net.futureclient.client.zA;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.math.Vec3d;

public class rc
extends Ha<jf> {
    public final zA f$d;

    private static boolean f$E(cb cb2, cb cb3) {
        return cb3.f$E().equals((Object)cb2.f$E());
    }

    public rc(zA zA2) {
        0.f$d = zA2;
    }

    @Override
    public void f$E(jf jf2) {
        if (!((Boolean)zA.f$K(0.f$d).f$E()).booleanValue()) {
            return;
        }
        if (jf2.f$E() instanceof SPacketSoundEffect) {
            Object object = (SPacketSoundEffect)jf2.f$E();
            Object object2 = object.getSound().getSoundName();
            object2 = zA.f$E().getSoundHandler().getAccessor(object2);
            if (object2 != null && object2.getSubtitle() != null) {
                object = new cb((String)(object2 = object2.getSubtitle().getUnformattedText()), new Vec3d(object.getX(), object.getY(), object.getZ()), System.currentTimeMillis());
                zA.f$E(0.f$d).removeAll(zA.f$E(0.f$d).stream().filter(arg_0 -> rc.f$E((cb)object, arg_0)).collect(Collectors.toList()));
                zA.f$E(0.f$d).add(object);
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.kH;
import net.futureclient.client.s;
import net.futureclient.client.wA;
import net.minecraft.client.Minecraft;

public class rC
extends Ba {
    public s f$d;

    public static Minecraft f$E() {
        return f$d;
    }

    public rC() {
        rC rC2;
        String[] stringArray = new String[3];
        stringArray[0] = "ClickGui";
        stringArray[1] = "ClickUI";
        stringArray[2] = "GUI";
        super("ClickGui", stringArray, false, 0xFFFFFF, JD.f$i);
        rC rC3 = rC2;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Scale";
        stringArray2[1] = "Scaling";
        stringArray2[2] = "Scal";
        rC3.f$d = new s((Number)1.0, (Number)0.3, (Number)2.0, 0.1, stringArray2);
        rC2.f$E(rC2.f$d);
    }

    @Override
    public void f$K() {
        rC rC2;
        rC rC3 = rC2;
        super.f$K();
        kH.f$E().f$E().f$a(new wA(rC2));
        rC3.f$E(false);
    }
}
