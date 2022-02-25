package net.futureclient.client;

import net.futureclient.client.G;
import net.futureclient.client.Ha;
import net.futureclient.client.e;
import net.futureclient.client.jf;
import net.futureclient.client.pA;
import net.futureclient.client.wC;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.network.play.server.SPacketEntityStatus;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketExplosion;
import net.minecraft.world.World;

public class Ic
extends Ha<jf> {
    public final wC f$d;

    @Override
    public void f$E(jf jf2) {
        if (!((pA)((Object)wC.f$E(0.f$d).f$E())).equals((Object)pA.f$M)) {
            return;
        }
        if (jf2.f$E() instanceof SPacketEntityVelocity) {
            SPacketEntityVelocity sPacketEntityVelocity = (SPacketEntityVelocity)jf2.f$E();
            if (wC.f$A().world.getEntityByID(sPacketEntityVelocity.getEntityID()) == wC.f$K().player) {
                if (0.f$d.f$g.f$E().doubleValue() > 0.0 || 0.f$d.f$d.f$E().doubleValue() > 0.0) {
                    ((G)sPacketEntityVelocity).setMotionX(sPacketEntityVelocity.getMotionX() * 0.f$d.f$g.f$E().intValue() / 100);
                    ((G)sPacketEntityVelocity).setMotionY(sPacketEntityVelocity.getMotionY() * 0.f$d.f$d.f$E().intValue() / 100);
                    ((G)sPacketEntityVelocity).setMotionZ(sPacketEntityVelocity.getMotionZ() * 0.f$d.f$g.f$E().intValue() / 100);
                    return;
                }
                jf2.f$E(true);
                return;
            }
        } else {
            jf jf3 = jf2;
            if (jf2.f$E() instanceof SPacketExplosion) {
                SPacketExplosion sPacketExplosion = (SPacketExplosion)jf3.f$E();
                ((e)sPacketExplosion).setMotionX(sPacketExplosion.getMotionX() * 0.f$d.f$g.f$E().floatValue() / 100.0f);
                ((e)sPacketExplosion).setMotionY(sPacketExplosion.getMotionY() * 0.f$d.f$d.f$E().floatValue() / 100.0f);
                ((e)sPacketExplosion).setMotionZ(sPacketExplosion.getMotionZ() * 0.f$d.f$g.f$E().floatValue() / 100.0f);
                return;
            }
            if (jf3.f$E() instanceof SPacketEntityStatus) {
                SPacketEntityStatus sPacketEntityStatus = (SPacketEntityStatus)jf2.f$E();
                if (0.f$d.f$j.f$E().booleanValue() && sPacketEntityStatus.getOpCode() == 31 && (sPacketEntityStatus = sPacketEntityStatus.getEntity((World)wC.f$B().world)) instanceof EntityFishHook && ((EntityFishHook)sPacketEntityStatus).caughtEntity == wC.f$e().player) {
                    jf2.f$E(true);
                }
            }
        }
    }

    public Ic(wC wC2) {
        0.f$d = wC2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.fA;
import net.futureclient.client.kH;
import net.futureclient.client.yB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DimensionType;

public class IC
extends Ha<ME> {
    public final fA f$d;

    public IC(fA fA2) {
        0.f$d = fA2;
    }

    @Override
    public void f$E(ME mE) {
        yB yB2 = (yB)kH.f$E().f$E().f$E(yB.class);
        if (yB2 != null && yB2.f$E() && yB2.f$E() != null) {
            yB yB3 = yB2;
            double d = yB3.f$E().f$a();
            double d2 = yB3.f$E().f$e();
            if (fA.f$h().world.field_73011_w.getDimensionType().equals((Object)DimensionType.NETHER) && yB2.f$E().f$a().equals(DimensionType.OVERWORLD.getName())) {
                d /= 8.0;
                d2 /= 8.0;
            } else if (fA.f$A().world.field_73011_w.getDimensionType().equals((Object)DimensionType.OVERWORLD) && yB2.f$E().f$a().equals(DimensionType.NETHER.getName())) {
                d *= 8.0;
                d2 *= 8.0;
            }
            fA.f$K().player.field_70177_z = (float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(fA.f$B().player.field_70161_v - d2, fA.f$e().player.field_70165_t - d)) + 90.0));
            return;
        }
        fA.f$a().player.field_70177_z = (float)Math.round((fA.f$E().player.field_70177_z + 1.0f) / 45.0f) * 45.0f;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.JD;
import net.futureclient.client.Y;
import net.futureclient.client.eb;
import net.futureclient.client.q;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class ic
extends Ba {
    private s f$d;
    private z<Boolean> f$g;

    public static Minecraft f$E() {
        return f$d;
    }

    public ic() {
        ic ic2;
        String[] stringArray = new String[5];
        stringArray[0] = "Timer";
        stringArray[1] = "Timr";
        stringArray[2] = "GameSpeed";
        stringArray[3] = "Speedup";
        stringArray[4] = "Taimer";
        super("Timer", stringArray, true, -31470, JD.f$b);
        ic ic3 = ic2;
        String[] stringArray2 = new String[4];
        stringArray2[0] = "TPSSync";
        stringArray2[1] = "Sync";
        stringArray2[2] = "TPSSynchronize";
        stringArray2[3] = "Synchronize";
        ic3.f$g = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Speed";
        stringArray3[1] = "TimerSpeed";
        stringArray3[2] = "Timer";
        stringArray3[3] = "GameSpeed";
        ic2.f$d = new s((Number)Float.valueOf(1.0f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(50.0f), stringArray3);
        ic2.f$E(ic2.f$g, ic2.f$d);
        ic2.f$E(new eb(ic2));
    }

    public static Minecraft f$a() {
        return f$d;
    }

    @Override
    public void f$B() {
        ic ic2;
        ((q)((Y)((Object)f$d)).getTimer()).f$E(1.0f);
        super.f$B();
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static s f$E(ic ic2) {
        return ic2.f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static z f$E(ic ic2) {
        return ic2.f$g;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.OC;
import net.futureclient.client.mB;
import net.futureclient.client.xC;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;

public class iC
extends Ha<ME> {
    public final OC f$d;

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(ME 0) {
        switch (mB.f$d[((xC)OC.f$E(0.f$d).f$E()).ordinal()]) {
            case 1: {
                while (false) {
                }
                if (!((Boolean)OC.f$E(0.f$d).f$E()).booleanValue()) ** GOTO lbl13
                if (!((float)OC.f$I().world.func_175699_k(new BlockPos(OC.f$L().player.field_70165_t, OC.f$i().player.field_70163_u, OC.f$c().player.field_70161_v)) < 12.0f) && OC.f$j().world.func_72935_r()) ** GOTO lbl12
                if (!OC.f$E(0.f$d).f$E(300L)) ** GOTO lbl13
                v0 = 0;
                v1 = v0;
                v0.f$d.f$E(true);
                ** GOTO lbl14
lbl12:
                // 1 sources

                0.f$d.f$E(false);
lbl13:
                // 3 sources

                v1 = 0;
lbl14:
                // 2 sources

                if (v1.f$d.f$E()) {
                    if (OC.f$M().gameSettings.gammaSetting < 11.0f) {
                        OC.f$C().gameSettings.gammaSetting += 0.5f;
                    }
                    if (OC.f$H().gameSettings.gammaSetting > 11.0f) {
                        OC.f$h().gameSettings.gammaSetting = 11.0f;
                    }
                } else if (OC.f$A().gameSettings.gammaSetting > 1.0f) {
                    OC.f$K().gameSettings.gammaSetting -= 0.5f;
                }
                if (OC.f$B().gameSettings.gammaSetting == 1.0f && !0.f$d.f$E() && !((Boolean)OC.f$E(0.f$d).f$E()).booleanValue()) {
                    OC.f$a(0.f$d);
                }
                OC.f$e().player.func_184589_d(MobEffects.NIGHT_VISION);
                return;
            }
            case 2: {
                if (0.f$d.f$E()) {
                    OC.f$a().gameSettings.gammaSetting = 1.0f;
                    OC.f$E().player.func_70690_d(new PotionEffect(MobEffects.NIGHT_VISION, 1215, 0));
                    return;
                }
                OC.f$E(0.f$d);
            }
        }
    }

    public iC(OC oC) {
        0.f$d = oC;
    }
}
