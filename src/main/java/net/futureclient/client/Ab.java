package net.futureclient.client;

import java.util.Collection;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.futureclient.client.Rb;
import net.futureclient.client.rA;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.FoodStats;
import net.minecraft.world.World;

public class ab
extends EntityPlayerSP {
    private boolean f$d;

    public boolean func_70644_a(@Nonnull Potion potion) {
        return rA.f$A().player.func_70644_a(potion);
    }

    @Nonnull
    public Map<Potion, PotionEffect> func_193076_bZ() {
        return rA.f$h().player.func_193076_bZ();
    }

    public float func_110139_bj() {
        return rA.f$B().player.func_110139_bj();
    }

    public ab(World world, Rb rb) {
        0(world);
    }

    public boolean func_70055_a(Material material) {
        if (0.f$d) {
            0.f$d = false;
            return false;
        }
        ab ab2 = 0;
        ab2.f$d = true;
        boolean bl = rA.f$E().player.func_70055_a(material);
        ab2.f$d = false;
        return bl;
    }

    @Nullable
    public PotionEffect func_70660_b(@Nonnull Potion potion) {
        return rA.f$K().player.func_70660_b(potion);
    }

    @Nonnull
    public Collection<PotionEffect> func_70651_bq() {
        return rA.f$H().player.func_70651_bq();
    }

    public int func_70658_aO() {
        return rA.f$a().player.func_70658_aO();
    }

    private ab(World world) {
        super(rA.f$I(), world, rA.f$j().player.connection, rA.f$M().player.getStatFileWriter(), rA.f$C().player.getRecipeBook());
    }

    @Nonnull
    public FoodStats func_71024_bL() {
        return rA.f$e().player.func_71024_bL();
    }
}
