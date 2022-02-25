package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.df;
import net.futureclient.client.lc;

public class Ab
extends Ha<df> {
    public final lc f$d;

    /*
     * WARNING - void declaration
     */
    public Ab(lc lc2) {
        void 0;
        0.f$d = 0;
    }

    @Override
    public void f$E(df df2) {
        if (lc.f$C().player.func_184187_bx() != null) {
            lc.f$H().player.func_184187_bx().stepHeight = 0.f$d.f$K.f$E() != false ? 256.0f : 1.0f;
        }
        Ab ab = 0;
        lc.f$E(ab.f$d, df2.f$E().minY);
        if (lc.f$E(ab.f$d, lc.f$a(0.f$d))) {
            df2.f$E(lc.f$E(0.f$d).f$E().floatValue());
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.A;
import net.futureclient.client.HC;
import net.futureclient.client.Ha;
import net.futureclient.client.ME;
import net.futureclient.client.Zc;
import net.futureclient.client.rb;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemStack;

public class AB
extends Ha<ME> {
    public final Zc f$d;

    public AB(Zc zc) {
        0.f$d = zc;
    }

    @Override
    public void f$E(ME mE) {
        if (!(Zc.f$j().currentScreen instanceof GuiChest)) {
            return;
        }
        GuiChest guiChest = (GuiChest)Zc.f$M().currentScreen;
        if (Zc.f$e().contains(((A)guiChest).getLowerChestInventory().func_145748_c_().getUnformattedText())) {
            return;
        }
        if (((HC)((Object)Zc.f$E(0.f$d).f$E())).equals((Object)HC.f$M)) {
            int n;
            int n2 = n = ((A)guiChest).getLowerChestInventory().getSizeInventory();
            while (n2 <= ((A)guiChest).getLowerChestInventory().getSizeInventory() + 35) {
                ItemStack itemStack = Zc.f$C().player.field_71069_bz.getSlot(n - ((A)guiChest).getLowerChestInventory().getSizeInventory() + 9).getStack();
                if (!itemStack.isEmpty() && Zc.f$E(0.f$d).f$a(Zc.f$E(0.f$d).f$E().floatValue() * 1000.0f)) {
                    Zc.f$h().playerController.windowClick(guiChest.field_147002_h.windowId, n, 0, ClickType.QUICK_MOVE, (EntityPlayer)Zc.f$H().player);
                    Zc.f$E(0.f$d).f$a();
                    return;
                }
                n2 = ++n;
            }
        } else {
            int n;
            int n3 = n = 0;
            while (n3 < ((A)guiChest).getLowerChestInventory().getSizeInventory()) {
                ItemStack itemStack = ((A)guiChest).getLowerChestInventory().getStackInSlot(n);
                if (!itemStack.isEmpty() && Zc.f$E(0.f$d).f$a(Zc.f$E(0.f$d).f$E().floatValue() * 1000.0f)) {
                    AB aB;
                    switch (rb.f$d[((HC)((Object)Zc.f$E(0.f$d).f$E())).ordinal()]) {
                        case 1: {
                            Minecraft minecraft = Zc.f$K();
                            while (false) {
                            }
                            minecraft.playerController.windowClick(guiChest.field_147002_h.windowId, n, 0, ClickType.QUICK_MOVE, (EntityPlayer)Zc.f$A().player);
                            aB = 0;
                            break;
                        }
                        case 2: {
                            Zc.f$e().playerController.windowClick(guiChest.field_147002_h.windowId, n, 0, ClickType.PICKUP, (EntityPlayer)Zc.f$B().player);
                            Zc.f$E().playerController.windowClick(guiChest.field_147002_h.windowId, -999, 0, ClickType.PICKUP, (EntityPlayer)Zc.f$a().player);
                        }
                        default: {
                            aB = 0;
                        }
                    }
                    Zc.f$E(aB.f$d).f$a();
                }
                n3 = ++n;
            }
        }
    }
}
package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.He;
import net.futureclient.client.TA;
import net.futureclient.client.eg;
import net.futureclient.client.kE;
import net.futureclient.client.kH;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.RayTraceResult;

public class aB
extends Ha<kE> {
    public final TA f$d;

    @Override
    public void f$E(kE kE2) {
        if (kE2.f$E().equals((Object)He.f$g) && TA.f$B().objectMouseOver != null && TA.f$e().objectMouseOver.typeOfHit.equals((Object)RayTraceResult.Type.ENTITY) && TA.f$a().objectMouseOver.entityHit instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)TA.f$E().objectMouseOver.entityHit;
            if (kH.f$E().f$E().f$E(entityPlayer.getName())) {
                kH.f$E().f$E().f$E(kH.f$E().f$E().f$E(entityPlayer.getName()));
                return;
            }
            kH.f$E().f$E().f$a(new eg(entityPlayer.getName(), entityPlayer.getName()));
        }
    }

    public aB(TA tA) {
        0.f$d = tA;
    }
}
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
