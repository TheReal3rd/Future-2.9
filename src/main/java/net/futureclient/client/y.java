package net.futureclient.client;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public interface y {
    public NonNullList<ItemStack> invokeGetItems();
}
package net.futureclient.client;

import net.futureclient.client.He;
import net.minecraft.util.Session;
import net.minecraft.util.Timer;

public interface Y {
    public void setLeftClickCounter(int var1);

    public void setSession(Session var1);

    public int getRightClickDelayTimer();

    public void f$E(He var1);

    public void setRightClickDelayTimer(int var1);

    public Timer getTimer();
}
