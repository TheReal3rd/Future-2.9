package net.futureclient.client;

import net.futureclient.client.VF;
import net.futureclient.client.kF;

public class NF {
    public static final int[] f$g;
    public static final int[] f$d;

    static {
        f$d = new int[kF.values().length];
        try {
            NF.f$d[kF.f$M.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        f$g = new int[VF.values().length];
        try {
            NF.f$g[VF.f$g.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NF.f$g[VF.f$j.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NF.f$g[VF.f$i.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NF.f$g[VF.f$M.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}
package net.futureclient.client;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.MovementInputFromOptions;

public final class Nf
extends MovementInputFromOptions {
    public Nf(GameSettings gameSettings) {
        super(gameSettings);
    }
}
package net.futureclient.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import net.futureclient.client.Ib;
import net.futureclient.client.lf;
import net.futureclient.client.lg;
import org.lwjgl.input.Keyboard;

public class nf
extends Ib {
    public final lf f$d;

    /*
     * Unable to fully structure code
     */
    @Override
    public void f$E(Object ... 0) {
        0.f$d.f$d.clear();
        try {
            if (!0.f$E().exists()) {
                0.f$E().createNewFile();
            }
        }
        catch (IOException var2_2) {
            var2_2.printStackTrace();
        }
        if (!0.f$E().exists()) {
            return;
        }
        try {
            var2_3 = new BufferedReader(new FileReader(0.f$E()));
            while ((var3_5 = var2_3.readLine()) != null) {
                var3_5 = var3_5.split(":");
                try {
                    var4_6 = Integer.parseInt(var3_5[0]);
                    v0 = 0;
                    ** GOTO lbl24
                }
                catch (NumberFormatException var5_8) {
                    var4_6 = Keyboard.getKeyIndex((String)var3_5[0]);
                    try {
                        v0 = 0;
lbl24:
                        // 2 sources

                        v0.f$d.f$d.add(new lg(var4_6, var3_5[1]));
                    }
                    catch (Exception var5_9) {
                        var5_9.printStackTrace();
                    }
                }
            }
            var2_3.close();
            return;
        }
        catch (Exception var2_4) {
            var2_4.printStackTrace();
            return;
        }
    }

    @Override
    public void f$a(Object ... objectArray) {
        BufferedWriter bufferedWriter;
        try {
            if (!0.f$E().exists()) {
                0.f$E().createNewFile();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            Iterator iterator;
            bufferedWriter = new BufferedWriter(new FileWriter(0.f$E()));
            Iterator iterator2 = iterator = 0.f$d.f$d.iterator();
            while (iterator2.hasNext()) {
                lg lg2 = (lg)iterator.next();
                iterator2 = iterator;
                BufferedWriter bufferedWriter2 = bufferedWriter;
                bufferedWriter2.write(Keyboard.getKeyName((int)lg2.f$E()) + ":" + lg2.f$E());
                bufferedWriter2.newLine();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        bufferedWriter.close();
    }

    public nf(lf lf2, String string) {
        0.f$d = lf2;
        super(string);
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class nF
extends RF {
    private World f$d;
    private ItemStack f$g;
    private EntityLivingBase f$M;

    public World f$E() {
        nF nF2;
        return nF2.f$d;
    }

    public ItemStack f$E() {
        nF nF2;
        return nF2.f$g;
    }

    public nF(ItemStack itemStack, World world, EntityLivingBase entityLivingBase) {
        nF nF2 = 0;
        0.f$g = itemStack;
        nF2.f$d = world;
        nF2.f$M = entityLivingBase;
    }

    public EntityLivingBase f$E() {
        nF nF2;
        return nF2.f$M;
    }
}
