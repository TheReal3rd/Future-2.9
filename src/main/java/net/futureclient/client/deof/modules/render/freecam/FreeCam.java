package net.futureclient.client.deof.modules.render.freecam;

import net.futureclient.client.deof.modules.ModuleStandard;
import net.futureclient.client.deof.modules.render.freecam.utils.FreecamEntity;
import net.futureclient.client.deof.settings.EnumSetting;
import net.futureclient.client.deof.settings.NumberSetting;
import net.futureclient.client.deof.utils.enums.CategoryEnum;
import net.futureclient.client.deof.modules.render.freecam.utils.InteractEnum;
import net.minecraft.entity.Entity;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;

public class FreeCam extends ModuleStandard {
    private Entity playerEntity;// OG f$d
    private final NumberSetting f$i;// OG f$i
    private static MovementInput movementInput; // OG f$j
    private final EnumSetting<InteractEnum> f$M;// OG f$M
    private FreecamEntity camera;// OG f$g

    static {
        movementInput = new MovementInput();
    }

    public FreecamEntity getCamera() {
        return camera;
    }

    public static Entity setEntity(FreeCam rA2, Entity entity) {
        rA2.playerEntity = entity;
        return rA2.playerEntity;
    }

    public static MovementInput getMovementInput() {
        return movementInput;
    }

    public static NumberSetting getSpeed(FreeCam rA2) {
        return rA2.f$i;
    }

    @Override
    public void toggle() {
        if (mc.world == null || mc.player == null) {
            this.setEnabled(false);
            return;
        }
        FreecamEntity freeCamEntity = new FreecamEntity(mc.world);
        freeCamEntity.setHealth(mc.player.getHealth());
        freeCamEntity.setAbsorptionAmount(mc.player.getAbsorptionAmount());
        freeCamEntity.setPrimaryHand(mc.player.getPrimaryHand());
        freeCamEntity.setEntityBoundingBox(mc.player.getEntityBoundingBox());
        freeCamEntity.posX = mc.player.posX;
        freeCamEntity.posY = mc.player.posY;
        freeCamEntity.posZ = mc.player.posZ;
        freeCamEntity.prevPosX = mc.player.prevPosX;
        freeCamEntity.prevPosY = mc.player.prevPosY;
        freeCamEntity.prevPosZ = mc.player.prevPosZ;
        freeCamEntity.lastTickPosX = mc.player.lastTickPosX;
        freeCamEntity.lastTickPosY = mc.player.lastTickPosY;
        freeCamEntity.lastTickPosZ = mc.player.lastTickPosZ;
        freeCamEntity.prevRotationYaw = freeCamEntity.rotationYaw = mc.player.rotationYaw;
        freeCamEntity.prevRotationPitch = freeCamEntity.rotationPitch = mc.player.rotationPitch;
        freeCamEntity.prevRotationYawHead = freeCamEntity.rotationYawHead = mc.player.rotationYawHead;
        freeCamEntity.inventory = mc.player.inventory;
        freeCamEntity.inventoryContainer = mc.player.inventoryContainer;
        freeCamEntity.capabilities = mc.player.capabilities;
        freeCamEntity.hurtTime = mc.player.hurtTime;
        freeCamEntity.maxHurtTime = mc.player.maxHurtTime;
        freeCamEntity.attackedAtYaw = mc.player.attackedAtYaw;
        MovementInputFromOptions movementInputFromOptions = new MovementInputFromOptions(mc.gameSettings);
        movementInputFromOptions.updatePlayerMoveState();
        movementInput = movementInputFromOptions;
        playerEntity = mc.getRenderViewEntity();
        camera = freeCamEntity;
        mc.setRenderViewEntity(camera);
        super.toggle();
    }

    public FreeCam() {
        super("Freecam", new String[]{"Freecam", "Reecam", "camera"}, false, -3217280, CategoryEnum.RENDER);
        f$i = new NumberSetting(1.0, 0.0, 2.0, 0.1, "Speed", "camspeed");
        f$M = new EnumSetting<>(InteractEnum.f$M, "Interact", "interact", "trace", "raytrace", "rt", "t", "i");
        addSettings(f$i, f$M);
        addListeners(
                new Rb_Listener(this),
                new bc_Listener(this),
                new ub_Listener(this),
                new nA_Listener(this),
                new Ob_Listener(this),
                new Pb_Listener(this),
                new qA_Listener(this),
                new MC_Listener(this)
        );
        this.setEnabled(false);
    }

    @Override
    public void unSubListeners() {
        super.unSubListeners();
        if (mc.player != null) {
            if (mc.player.movementInput.getClass() == movementInput.getClass()) {
                MovementInputFromOptions movementInputFromOptions = new MovementInputFromOptions(mc.gameSettings);
                movementInputFromOptions.updatePlayerMoveState();
                mc.player.movementInput = movementInputFromOptions;
            }
            mc.setRenderViewEntity(playerEntity);
        }
        camera = null;
    }

    public static FreecamEntity getCamera(FreeCam rA2) {
        return rA2.camera;
    }

    public static EnumSetting getInteract(FreeCam rA2) {
        return rA2.f$M;
    }
}
/*
package net.futureclient.client;

import net.futureclient.client.Ba;
import net.futureclient.client.Ha;
import net.futureclient.client.JD;
import net.futureclient.client.MC;
import net.futureclient.client.Ob;
import net.futureclient.client.Pb;
import net.futureclient.client.Rb;
import net.futureclient.client.ab;
import net.futureclient.client.bc;
import net.futureclient.client.ka;
import net.futureclient.client.nA;
import net.futureclient.client.pb;
import net.futureclient.client.qA;
import net.futureclient.client.s;
import net.futureclient.client.ub;
import net.futureclient.client.z;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import net.minecraft.world.World;

public class rA
extends Ba {
    private Entity f$d;
    private final s f$i;
    private static final MovementInput f$j;
    private final ka<pb> f$M;
    private ab f$g;

    public static Minecraft f$d() {
        return f$d;
    }

    static {
        f$j = new MovementInput();
    }

    public static Minecraft f$l() {
        return f$d;
    }

    public static Minecraft f$Q() {
        return f$d;
    }

    public ab f$E() {
        rA rA2;
        return rA2.f$g;
    }

public static Entity f$E(rA rA2, Entity entity) {
    void 0;
    0.f$d = 0;
    return 0.f$d;
}

    public static MovementInput f$E() {
        return f$j;
    }

    public static Minecraft f$i() {
        return f$d;
    }

    public static Minecraft f$m() {
        return f$d;
    }

    public static Minecraft f$C() {
        return f$d;
    }

    public static Minecraft f$B() {
        return f$d;
    }

    public static s f$E(rA rA2) {
        return rA2.f$i;
    }

    @Override
    public void f$K() {
        rA rA2;
        if (rA.f$d.world == null || rA.f$d.player == null) {
            rA2.f$E(false);
            return;
        }
        ab ab2 = new ab((World)rA.f$d.world, null);
        ab2.func_70606_j(rA.f$d.player.func_110143_aJ());
        ab2.func_110149_m(rA.f$d.player.func_110139_bj());
        ab2.func_184819_a(rA.f$d.player.func_184591_cq());
        ab2.func_174826_a(rA.f$d.player.func_174813_aQ());
        ab2.field_70165_t = rA.f$d.player.field_70165_t;
        ab2.field_70163_u = rA.f$d.player.field_70163_u;
        ab2.field_70161_v = rA.f$d.player.field_70161_v;
        ab2.field_70169_q = rA.f$d.player.field_70169_q;
        ab2.field_70167_r = rA.f$d.player.field_70167_r;
        ab2.field_70166_s = rA.f$d.player.field_70166_s;
        ab2.field_70142_S = rA.f$d.player.field_70142_S;
        ab2.field_70137_T = rA.f$d.player.field_70137_T;
        ab2.field_70136_U = rA.f$d.player.field_70136_U;
        ab2.field_70126_B = ab2.field_70177_z = rA.f$d.player.field_70177_z;
        ab ab3 = ab2;
        ab3.field_70127_C = ab3.field_70125_A = rA.f$d.player.field_70125_A;
        ab ab4 = ab2;
        ab4.field_70758_at = ab4.field_70759_as = rA.f$d.player.field_70759_as;
        ab ab5 = ab2;
        ab5.field_71071_by = rA.f$d.player.field_71071_by;
        ab5.field_71069_bz = rA.f$d.player.field_71069_bz;
        ab5.field_71075_bZ = rA.f$d.player.field_71075_bZ;
        ab5.field_70737_aN = rA.f$d.player.field_70737_aN;
        ab5.field_70738_aO = rA.f$d.player.field_70738_aO;
        ab5.field_70739_aP = rA.f$d.player.field_70739_aP;
        MovementInputFromOptions movementInputFromOptions = new MovementInputFromOptions(rA.f$d.gameSettings);
        movementInputFromOptions.updatePlayerMoveState();
        ab5.movementInput = movementInputFromOptions;
        rA2.f$d = f$d.getRenderViewEntity();
        rA2.f$g = ab2;
        f$d.setRenderViewEntity((Entity)rA2.f$g);
        super.f$K();
    }

    public static Minecraft f$g() {
        return f$d;
    }

    public static Minecraft f$c() {
        return f$d;
    }

    public static Minecraft f$e() {
        return f$d;
    }

    public static Minecraft f$a() {
        return f$d;
    }

    public static Minecraft f$L() {
        return f$d;
    }

    public static Minecraft f$K() {
        return f$d;
    }

    public rA() {
        rA rA2;
        String[] stringArray = new String[3];
        stringArray[0] = "Freecam";
        stringArray[1] = "Reecam";
        stringArray[2] = "camera";
        super("Freecam", stringArray, false, -3217280, JD.f$i);
        rA rA3 = rA2;
        String[] stringArray2 = new String[2];
        stringArray2[0] = "Speed";
        stringArray2[1] = "camspeed";
        rA3.f$i = new s((Number)1.0, (Number)0.0, (Number)2.0, 0.1, stringArray2);
        rA rA4 = rA2;
        String[] stringArray3 = new String[7];
        stringArray3[0] = "Interact";
        stringArray3[1] = "interact";
        stringArray3[2] = "trace";
        stringArray3[3] = "raytrace";
        stringArray3[4] = "rt";
        stringArray3[5] = "t";
        stringArray3[6] = "i";
        rA4.f$M = new ka<pb>(pb.f$M, stringArray3);
        z[] zArray = new z[2];
        zArray[0] = rA2.f$i;
        zArray[1] = rA2.f$M;
        rA2.f$E(zArray);
        Ha[] haArray = new Ha[8];
        haArray[0] = new Rb(rA2);
        haArray[1] = new bc(rA2);
        haArray[2] = new ub(rA2);
        haArray[3] = new nA(rA2);
        haArray[4] = new Ob(rA2);
        haArray[5] = new Pb(rA2);
        haArray[6] = new qA(rA2);
        haArray[7] = new MC(rA2);
        rA2.f$E(haArray);
        rA2.f$E(false);
    }

    @Override
    public void f$B() {
        rA rA2;
        super.f$B();
        if (rA.f$d.player != null) {
            if (rA.f$d.player.movementInput.getClass() == f$j.getClass()) {
                MovementInputFromOptions movementInputFromOptions = new MovementInputFromOptions(rA.f$d.gameSettings);
                movementInputFromOptions.updatePlayerMoveState();
                rA.f$d.player.movementInput = movementInputFromOptions;
            }
            f$d.setRenderViewEntity(rA2.f$d);
        }
        rA2.f$g = null;
    }

    public static Minecraft f$U() {
        return f$d;
    }

    public static Minecraft f$H() {
        return f$d;
    }

    public static Minecraft f$P() {
        return f$d;
    }

    public static ab f$E(rA rA2) {
        return rA2.f$g;
    }

    public static Minecraft f$D() {
        return f$d;
    }

    public static Minecraft f$A() {
        return f$d;
    }

    public static Minecraft f$k() {
        return f$d;
    }

    public static Minecraft f$E() {
        return f$d;
    }

    public static Minecraft f$M() {
        return f$d;
    }

    public static Minecraft f$j() {
        return f$d;
    }

    public static Minecraft f$f() {
        return f$d;
    }

    public static Minecraft f$J() {
        return f$d;
    }

    public static Minecraft f$I() {
        return f$d;
    }

    public static Minecraft f$b() {
        return f$d;
    }

    public static ka f$E(rA rA2) {
        return rA2.f$M;
    }

    public static Minecraft f$F() {
        return f$d;
    }

    public static Minecraft f$h() {
        return f$d;
    }

    public static Minecraft f$G() {
        return f$d;
    }
}
 */