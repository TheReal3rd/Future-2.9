package net.futureclient.client;

import baritone.api.Settings;
import net.futureclient.client.z;

public class fj<T>
extends z<T> {
    private final Settings.Setting<T> f$d;

    @Override
    public void f$E(T t) {
        0.f$d.value = t;
    }

    @Override
    public T f$E() {
        fj fj2;
        return (T)fj2.f$d.value;
    }

    public fj(Settings.Setting<T> setting, String ... stringArray) {
        super(null, stringArray);
        0.f$d = setting;
    }
}
