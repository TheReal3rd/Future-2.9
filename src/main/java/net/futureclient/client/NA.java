package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.bB;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class NA
extends Ba {
    private Bh f$d;
    public z<Boolean> f$i;
    private s f$M;
    private Bh f$g;

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public NA() {
        NA nA;
        String[] stringArray = new String[7];
        stringArray[0] = "EntitySpeed";
        stringArray[1] = "HorseSpeed";
        stringArray[2] = "HorseHax";
        stringArray[3] = "HroseSpeed";
        stringArray[4] = "HorsSped";
        stringArray[5] = "Horse";
        stringArray[6] = "Horseped";
        super("EntitySpeed", stringArray, true, -12279274, JD.f$j);
        NA nA2 = nA;
        String[] stringArray2 = new String[3];
        stringArray2[0] = "AntiStuck";
        stringArray2[1] = "NoStuck";
        stringArray2[2] = "AS";
        nA2.f$i = new z<Boolean>(false, stringArray2);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Speed";
        stringArray3[1] = "Sped";
        stringArray3[2] = "S";
        nA.f$M = new s((Number)Float.valueOf(3.8f), (Number)Float.valueOf(0.1f), (Number)Float.valueOf(3.8f), stringArray3);
        nA.f$g = new Bh();
        nA.f$d = new Bh();
        nA.f$E(nA.f$i, nA.f$M);
        nA.f$E(new bB(nA));
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Bh f$E(NA nA) {
        return nA.f$d;
    }

    public static s f$E(NA nA) {
        return nA.f$M;
    }

    public static Minecraft f$G() {
        return f$d;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$d() {
        return f$d;
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Bh f$a(NA nA) {
        return nA.f$g;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$l() {
        return f$d;
    }
}
package net.futureclient.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.futureclient.client.Ba;
import net.futureclient.client.Bh;
import net.futureclient.client.JD;
import net.futureclient.client.Xa;
import net.futureclient.client.ka;
import net.futureclient.client.n;
import net.futureclient.client.qa;
import net.futureclient.client.s;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;

public class Na
extends Ba {
    private final s f$C;
    private final n f$j;
    private final z<Boolean> f$I;
    private Bh f$d;
    private final ka<qa> f$b;
    private final List<Integer> f$M;
    private Iterator<Integer> f$g;
    private final z<Boolean> f$K;
    private final s f$e;
    private int f$i;

    public static Iterator f$E(Na na) {
        return na.f$g;
    }

    public static List f$E(Na na) {
        return na.f$M;
    }

    @Override
    public void f$K() {
        Na na;
        Na na2 = na;
        super.f$K();
        if (na2.f$K.f$E().booleanValue()) {
            na.f$i = Na.f$d.player.field_71071_by.currentItem;
        }
    }

    public static s f$E(Na na) {
        return na.f$C;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static n f$E(Na na) {
        return na.f$j;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Iterator f$E(Na na, Iterator iterator) {
        na.f$g = iterator;
        return na.f$g;
    }

    public static s f$a(Na na) {
        return na.f$e;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    @Override
    public void f$B() {
        Na na;
        Na na2 = na;
        super.f$B();
        if (na2.f$K.f$E().booleanValue()) {
            Na.f$d.player.field_71071_by.currentItem = na.f$i;
        }
    }

    public static z f$E(Na na) {
        return na.f$I;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static ka f$E(Na na) {
        return na.f$b;
    }

    public Na() {
        Na na;
        String[] stringArray = new String[3];
        stringArray[0] = "FastPlace";
        stringArray[1] = "place";
        stringArray[2] = "fp";
        super("FastPlace", stringArray, true, -2525659, JD.f$M);
        Na na2 = na;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Delay";
        stringArray2[1] = "d";
        na2.f$C = new s((Number)Float.valueOf(1.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(4.0f), 1, stringArray2);
        String[] stringArray3 = new String[2];
        stringArray3[0] = "StartDelay";
        stringArray3[1] = "SD";
        na.f$e = new s((Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), 0.01, stringArray3);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "AutoPlace";
        stringArray4[1] = "click";
        stringArray4[2] = "clicker";
        na.f$I = new z<Boolean>(false, stringArray4);
        String[] stringArray5 = new String[2];
        stringArray5[0] = "AutoSwitch";
        stringArray5[1] = "Switch";
        na.f$K = new z<Boolean>(false, stringArray5);
        String[] stringArray6 = new String[3];
        stringArray6[0] = "Selection";
        stringArray6[1] = "SelectionMode";
        stringArray6[2] = "s";
        na.f$b = new ka<qa>(qa.f$i, stringArray6);
        String[] stringArray7 = new String[7];
        stringArray7[0] = "Items";
        stringArray7[1] = "blocks";
        stringArray7[2] = "whitelist";
        stringArray7[3] = "blacklist";
        stringArray7[4] = "selectable";
        stringArray7[5] = "selectableitems";
        stringArray7[6] = "i";
        na.f$j = new n(stringArray7);
        na.f$M = new ArrayList<Integer>();
        na.f$g = null;
        na.f$d = new Bh();
        na.f$E(na.f$C, na.f$e, na.f$b, na.f$j, na.f$I, na.f$K);
        na.f$E(new Xa(na));
    }

    public static z f$a(Na na) {
        return na.f$K;
    }

    public static Bh f$E(Na na) {
        return na.f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }
}
package net.futureclient.client;

import java.util.Iterator;
import net.futureclient.client.Uh;
import net.futureclient.client.WB;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.qC;
import net.futureclient.client.s;
import net.futureclient.client.wD;
import net.futureclient.client.wa;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import org.lwjgl.input.Mouse;

public class na
extends wa {
    private Minecraft f$g;
    private s f$M;
    private boolean f$d;

    @Override
    public void f$E(int n, int n2, float f2) {
        na na2 = 0;
        na2.f$E(n, n2);
        int f2 = na2.f$M.f$E().doubleValue() > 0.f$M.f$B().doubleValue() ? 0.f$a() + 7 : (int)(0.f$M.f$E().doubleValue() / 0.f$M.f$B().doubleValue() * (double)(0.f$a() + 7));
        gF gF2 = (gF)kH.f$E().f$E().f$E(gF.class);
        wD wD2 = (wD)kH.f$E().f$E().f$E(wD.class);
        Uh.f$E(0.f$a() + (float)0.f$g, 0.f$E() + (float)0.f$d, 0.f$a() + (float)f2 + (float)0.f$g, 0.f$E() + (float)0.f$E() + 1.0f + (float)0.f$d, !0.f$E(n, n2) ? wD2.f$a.getRGB() + -1728053248 : wD2.f$a.getRGB() + 0x70000000);
        if (gF2.f$c.f$E().booleanValue()) {
            GlStateManager.enableBlend();
            gF2.f$L.f$E(String.format("%s\u00a77 %s", 0.f$E(), 0.f$M.f$E()), (double)(0.f$b + 2.0f), (double)(0.f$j + 4.0f), 0xFFFFFF);
            GlStateManager.disableBlend();
            return;
        }
        0.f$g.fontRenderer.drawStringWithShadow(String.format("%s\u00a77 %s", 0.f$E(), 0.f$M.f$E()), 0.f$b + 2.0f, 0.f$j + 4.0f, 0xFFFFFF);
    }

    private void f$E(int n, int n2) {
        if (!Mouse.isButtonDown((int)0)) {
            0.f$E(false);
        }
        if (0.f$E() && 0.f$E(n, n2)) {
            double d = (double)(((float)n - 0.f$a()) / (float)(0.f$a() + 7)) * 0.f$M.f$B().doubleValue();
            d = (double)Math.round(d * (1.0 / 0.f$M.f$g.doubleValue())) / (1.0 / 0.f$M.f$g.doubleValue());
            na na2 = 0;
            na2.f$M.f$E(d);
            if (na2.f$M.f$E().doubleValue() < 0.f$M.f$e().doubleValue()) {
                na na3 = 0;
                na3.f$M.f$E(na3.f$M.f$e());
                return;
            }
            if (0.f$M.f$E().doubleValue() > 0.f$M.f$B().doubleValue()) {
                na na4 = 0;
                na4.f$M.f$E(na4.f$M.f$B());
            }
        }
    }

    public na(s s2) {
        super(s2.f$E()[0]);
        0.f$g = Minecraft.getMinecraft();
        0.f$M = s2;
    }

    @Override
    public void f$a(int n, int n2, int n3) {
        na na2 = 0;
        super.f$a(n, n2, n3);
        if (na2.f$E(n, n2) && n3 == 0) {
            na na3 = 0;
            na3.f$g.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
            na3.f$E(true);
        }
    }

    @Override
    public int f$E() {
        return 14;
    }

    private boolean f$E(int n, int n2) {
        Iterator<qC> iterator = WB.f$E().f$E().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().f$M) continue;
            return false;
        }
        return (float)n >= 0.f$a() && (float)n <= 0.f$a() + (float)(0.f$a() + 7) && (float)n2 >= 0.f$E() && (float)n2 <= 0.f$E() + (float)0.f$M;
    }

    private void f$E(boolean bl) {
        0.f$d = bl;
    }

    private boolean f$E() {
        na na2;
        return na2.f$d;
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Lg;
import net.futureclient.client.rA;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;

public class nA
extends Ha<Lg> {
    public final rA f$d;

    @Override
    public void f$E(Lg lg) {
        RayTraceResult rayTraceResult = lg.f$E();
        if (rayTraceResult != null && rayTraceResult.typeOfHit == RayTraceResult.Type.ENTITY && rayTraceResult.entityHit == rA.f$c().player) {
            lg.f$E(new RayTraceResult(RayTraceResult.Type.MISS, rayTraceResult.hitVec, null, new BlockPos(rayTraceResult.hitVec)));
        }
    }

    public nA(rA rA2) {
        0.f$d = rA2;
    }
}
