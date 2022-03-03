package net.futureclient.client;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public final class sh {
    private static final ThreadPoolExecutor f$d;

    public sh() {
        sh sh2;
    }

    static {
        f$d = (ThreadPoolExecutor)Executors.newFixedThreadPool(1);
    }

    public static void f$E(Runnable runnable) {
        f$d.execute(runnable);
    }
}
