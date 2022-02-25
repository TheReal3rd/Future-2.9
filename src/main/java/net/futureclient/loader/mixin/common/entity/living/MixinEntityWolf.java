package net.futureclient.loader.mixin.common.entity.living;

import net.futureclient.client.c;
import net.futureclient.loader.mixin.common.entity.MixinEntity;
import net.minecraft.entity.passive.EntityWolf;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={EntityWolf.class})
public abstract class MixinEntityWolf
extends MixinEntity
implements c {
    public MixinEntityWolf() {
        MixinEntityWolf mixinEntityWolf;
    }

    @Override
    @Accessor
    public abstract boolean isIsWet();

    @Override
    @Accessor
    public abstract void setIsWet(boolean var1);
}
