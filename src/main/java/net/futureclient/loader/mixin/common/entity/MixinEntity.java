package net.futureclient.loader.mixin.common.entity;

import java.util.Random;
import net.futureclient.client.Ee;
import net.futureclient.client.b;
import net.futureclient.client.df;
import net.futureclient.client.kH;
import net.futureclient.client.ne;
import net.futureclient.client.sf;
import net.futureclient.client.xf;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Entity.class})
public abstract class MixinEntity
implements b {
    @Shadow
    public double field_70165_t;
    @Shadow
    public double field_70163_u;
    @Shadow
    public double field_70161_v;
    @Shadow
    public double field_70159_w;
    @Shadow
    public double field_70181_x;
    @Shadow
    public double field_70179_y;
    @Shadow
    public float field_70177_z;
    @Shadow
    public float field_70125_A;
    @Shadow
    public boolean field_70122_E;
    @Shadow
    public Random field_70146_Z;
    @Shadow
    public World field_70170_p;
    @Shadow
    public EntityDataManager field_70180_af;
    private Ee f$g;
    private Float f$d;

    public MixinEntity() {
        MixinEntity mixinEntity;
    }

    @Shadow
    public abstract AxisAlignedBB func_174813_aQ();

    @Shadow
    public abstract boolean func_70083_f(int var1);

    @Shadow
    public abstract boolean func_189652_ae();

    @Shadow public abstract AxisAlignedBB getEntityBoundingBox();

    @Shadow public double posZ;

    @Shadow public boolean onGround;

    @Shadow public double posX;

    @Shadow public float rotationPitch;

    @Shadow public float rotationYaw;

    @Override
    @Accessor
    public abstract boolean isIsInWeb();

    @Inject(method={"getCollisionBorderSize"}, at={@At(value="HEAD")}, cancellable=true)
    private void f$E(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        xf xf2 = new xf();
        kH.f$E().f$E().f$E(xf2);
        callbackInfoReturnable.setReturnValue((Object)Float.valueOf(xf2.f$E()));
    }

    @Inject(method={"move"}, at={@At(value="HEAD")})
    private void f$A(MoverType moverType, double d, double d2, double d3, CallbackInfo callbackInfo) {
        Entity entity = (Entity)0;
        if (entity instanceof EntityPlayerSP) {
            0.f$g = new Ee(moverType, d, d2, d3, entity.isSneaking());
            kH.f$E().f$E().f$E(0.f$g);
        }
    }

    @ModifyVariable(method={"move"}, at=@At(value="HEAD"), ordinal=0)
    private double f$e(double d) {
        if (0.f$g != null) {
            d = 0.f$g.f$e();
        }
        return d;
    }

    @ModifyVariable(method={"move"}, at=@At(value="HEAD"), ordinal=1)
    private double f$a(double d) {
        if (0.f$g != null) {
            d = 0.f$g.f$a();
        }
        return d;
    }

    @ModifyVariable(method={"move"}, at=@At(value="HEAD"), ordinal=2)
    private double f$E(double d) {
        if (0.f$g != null) {
            d = 0.f$g.f$E();
        }
        return d;
    }

    @Redirect(method={"move"}, at=@At(value="INVOKE", target="net/minecraft/entity/Entity.isSneaking()Z", ordinal=0))
    private boolean f$E(Entity entity) {
        return 0.f$g != null ? 0.f$g.f$a() : entity.isSneaking();
    }

    @Inject(method={"move"}, at={@At(value="FIELD", target="net/minecraft/entity/Entity.onGround:Z", ordinal=1)})
    private void f$K(MoverType moverType, double d, double d2, double d3, CallbackInfo callbackInfo) {
        Entity entity = (Entity)0;
        if (entity instanceof EntityPlayerSP) {
            df df2 = new df(0.func_174813_aQ(), entity.stepHeight);
            kH.f$E().f$E().f$E(df2);
            0.f$d = Float.valueOf(entity.stepHeight);
            entity.stepHeight = df2.f$E();
        }
    }

    @Inject(method={"move"}, at={@At(value="INVOKE", target="net/minecraft/entity/Entity.setEntityBoundingBox(Lnet/minecraft/util/math/AxisAlignedBB;)V", ordinal=7, shift=At.Shift.AFTER)})
    private void f$B(MoverType moverType, double d, double d2, double d3, CallbackInfo callbackInfo) {
        Entity entity = (Entity)0;
        if (entity instanceof EntityPlayerSP) {
            sf sf2 = new sf(0.func_174813_aQ(), 0.f$d != null ? 0.f$d.floatValue() : 0.0f);
            kH.f$E().f$E().f$E(sf2);
        }
    }

    @Inject(method={"move"}, at={@At(value="INVOKE", target="net/minecraft/entity/Entity.resetPositionToBB()V", ordinal=1)})
    private void f$e(MoverType moverType, double d, double d2, double d3, CallbackInfo callbackInfo) {
        Entity entity = (Entity)0;
        if (entity instanceof EntityPlayerSP && 0.f$d != null) {
            entity.stepHeight = 0.f$d.floatValue();
            0.f$d = null;
        }
    }

    @Inject(method={"move"}, at={@At(value="FIELD", target="net/minecraft/entity/Entity.onGround:Z", ordinal=2, shift=At.Shift.AFTER)})
    private void f$a(MoverType moverType, double d, double d2, double d3, CallbackInfo callbackInfo) {
        Entity entity = (Entity)0;
        if (entity instanceof EntityPlayerSP) {
            ne ne2 = new ne();
            kH.f$E().f$E().f$E(ne2);
            entity.onGround = entity.onGround || ne2.f$E();
        }
    }

    @Inject(method={"move"}, at={@At(value="RETURN")})
    private void f$E(MoverType moverType, double d, double d2, double d3, CallbackInfo callbackInfo) {
        0.f$g = null;
    }
}
