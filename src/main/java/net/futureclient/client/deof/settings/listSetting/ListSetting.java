package net.futureclient.client.deof.settings.listSetting;

import net.futureclient.client.deof.settings.SettingsBase;

import java.util.ArrayList;
import java.util.List;

public abstract class ListSetting<T> extends SettingsBase<List<T>> {

    public ListSetting(String ... stringArray) {
        super((List<T>)new ArrayList(), stringArray);
    }

    public ListSetting(List<T> list, String ... stringArray) {
        super(list, stringArray);
    }
}

/*
package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;
import net.futureclient.client.Ja;
import net.futureclient.client.z;

public abstract class O<T> extends z<List<T>> {
    public O(String[] stringArray, Ja ja) {
        0(stringArray);
    }

    private O(String ... stringArray) {
        0((List<T>)new ArrayList(), stringArray);
    }

    public O(List list, String[] stringArray, Ja ja) {
        0(list, stringArray);
    }

    private O(List<T> list, String ... stringArray) {
        super(list, stringArray);
    }
}
 */
