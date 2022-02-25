package net.futureclient.loader.injector;

import java.lang.reflect.Field;
import java.util.Map;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;

public final class Injector {

    public Injector() {
        Injector injector;
    }

    public static String f$E(String string) {//TODO rename this method to when it does.
        int n = string.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 << 2 ^ 1);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(string.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(string.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public void load(ClassLoader classLoader) {
        Object object;
        boolean bl;
        MixinBootstrap.init();
        boolean forge = false;
        try {
            Class.forName("net.minecraftforge.common.ForgeVersion", false, classLoader);
            forge = true;
        }
        catch (Throwable throwable) {
            try {
                Class.forName("net.minecraftforge.versions.forge.ForgeVersion", false, classLoader);
                forge = true;
            }
            catch (Throwable ignored) {}
        }
        MixinEnvironment.getDefaultEnvironment().setObfuscationContext(forge ? "searge" : "notch");
        MixinEnvironment.getDefaultEnvironment().setSide(MixinEnvironment.Side.CLIENT);
        Mixins.addConfiguration(MixinConfigEnum.COMMON.getJson());//OG (String)Je.f$a.f$a()
        Mixins.addConfiguration(forge ? MixinConfigEnum.FORGE.getJson() : MixinConfigEnum.VANILLA.getJson());//OG (String)(forge ? Je.f$C.f$a() : Je.f$e.f$a())
        Mixins.addConfiguration(MixinConfigEnum.OPTIFINE.getJson());//OG (String)Je.f$I.f$a()

        boolean baritone = false;
        try {
            Class.forName("baritone.launch.BaritoneTweaker", false, classLoader);
            bl = baritone = true;
        }
        catch (Throwable throwable) {
            Throwable throwable3;
            Throwable throwable4 = throwable3 = throwable;
            while (throwable4 != null) {
                object = "io.github.impactdevelopment.simpletweaker.SimpleTweaker";
                String string = "io.github.impactdevelopment.simpletweaker.SimpleTweaker".replace(".", "/");
                String string2 = throwable3.getMessage();
                if (string2 != null && (string2.contains("io.github.impactdevelopment.simpletweaker.SimpleTweaker") || string2.contains(string))) {
                    bl = baritone = true;
                }
                throwable4 = throwable3.getCause();
            }
            bl = baritone;
        }
        if (bl) {
            if (Mixins.getConfigs().stream().noneMatch(config -> config.getName().equals(MixinConfigEnum.BARITONE2.getJson()))) {//OG Je.f$b.f$a()
                Mixins.addConfiguration(MixinConfigEnum.BARITONE2.getJson());//OG (String)Je.f$b.f$a()
            }
            Mixins.addConfiguration(MixinConfigEnum.BARITONE.getJson());//OG (String)Je.f$K.f$a()
        }
        if (Boolean.getBoolean("alreadyLoadedExceptionHack")) {
            try {
                Field field;
                Class<?> clazz = Class.forName("net.minecraft.launchwrapper.LaunchClassLoader", false, this.getClass().getClassLoader());
                Field field2 = field = clazz.getDeclaredField("cachedClasses");
                field2.setAccessible(true);
                object = (Map) field2.get(classLoader);
                field.set(classLoader, object);//OG new ConcurrentHashMap<>(object)
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        try {
            Mixins.getConfigs().stream().filter(config -> config.getName().equals(MixinConfigEnum.CAPI.getName())).forEach(config -> config.getEnvironment().setOption(MixinEnvironment.Option.DISABLE_REFMAP, true));//OG Je.f$j.f$a()
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }
}