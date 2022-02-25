package net.futureclient.client.deof.settings.listSetting;

import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public final class ItemList extends ListSetting<Item>{
    public ItemList(String... stringArray) {
        this((List<Item>) new ArrayList<Item>(), stringArray);
    }

    public ItemList(List<Item> list, String ... stringArray) {
        super(list, stringArray);
    }
}

/*
public final class n extends O<Item> {
    public n(String ... stringArray) {
        super(stringArray, (Ja)null);
    }

    public n(List<Item> list, String ... stringArray) {
        super(list, stringArray, (Ja)null);
    }
}
 */
