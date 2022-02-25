package net.futureclient.loader.injector;

/**
 * This is a Rewritten Enum class from called "Je"
 */
public enum MixinConfigEnum {
    COMMON("FUTURE_MIXIN_COMMON_CONFIG","mixins.future.common.json","net.futureclient.loader.mixin.common"),
    FORGE("FUTURE_MIXIN_FORGE_CONFIG","mixins.future.forge.json","net.futureclient.loader.mixin.forge"),
    VANILLA("FUTURE_MIXIN_VANILLA_CONFIG","mixins.future.vanilla.json","net.futureclient.loader.mixin.vanilla"),
    OPTIFINE("FUTURE_MIXIN_OPTIFINE_CONFIG","mixins.future.optifine.json","net.futureclient.loader.mixin.optifine"),
    BARITONE("FUTURE_MIXIN_BARITONE_CONFIG","mixins.future.baritone.json","net.futureclient.loader.mixin.baritone"),
    BARITONE2("BARITONE_MIXIN_CONFIG", "mixins.baritone.json", null),
    CAPI("CAPI_MIXIN_CONFIG", "mixins.capi.json", null),
    UNKNOWN("UNKNOWN_CONFIG", "unknown", null);

    private final String name;
    private final String json;
    private final String packageLocation;

    MixinConfigEnum(String name, String json, String packageLocation) {
        this.name = name;
        this.json = json;
        this.packageLocation = packageLocation;
    }

    public String getName() {
        return name;
    }

    public String getJson() {
        return json;
    }

    public String getPackageLocation() {
        return packageLocation;
    }
}

/*
public final class Je extends Enum<Je> {
    private static final Je[] f$d;

    public static final Je f$e;
    public static final Je f$i;
    public static final Je f$b;
    public static final Je f$C;
    public static final Je f$I;
    public static final Je f$K;
    public static final Je f$j;
    public static final Je f$a;

    private final String f$M;
    private final String f$g;

    public static Je valueOf(String string) {
        return Enum.valueOf(Je.class, string);
    }

    public static Je f$E(String string) {
        return Stream.of(Je.values()).filter(je -> {
            if (je.f$E() != null && je.f$E().equals(string)) {
                return true;
            }
            return false;
        }).findFirst().orElse(f$i);
    }

    public String f$a() {
        return this.f$M;
    }


     // WARNING - Possible parameter corruption
     //WARNING - void declaration

    private Je(String string) {
        super((String)var1_-1, (int)var2_-1, (String)0, null);
        void var2_-1;
        void var1_-1;
        Je je;
    }

    static {
        f$a = new Je("FUTURE_MIXIN_COMMON_CONFIG", 0, "mixins.future.common.json", "net.futureclient.loader.mixin.common");
        f$C = new Je("FUTURE_MIXIN_FORGE_CONFIG", 1, "mixins.future.forge.json", "net.futureclient.loader.mixin.forge");
        f$e = new Je("FUTURE_MIXIN_VANILLA_CONFIG", 2, "mixins.future.vanilla.json", "net.futureclient.loader.mixin.vanilla");
        f$I = new Je("FUTURE_MIXIN_OPTIFINE_CONFIG", 3, "mixins.future.optifine.json", "net.futureclient.loader.mixin.optifine");
        f$K = new Je("FUTURE_MIXIN_BARITONE_CONFIG", 4, "mixins.future.baritone.json", "net.futureclient.loader.mixin.baritone");
        f$b = new Je("BARITONE_MIXIN_CONFIG", 5, "mixins.baritone.json");
        f$j = new Je("CAPI_MIXIN_CONFIG", 6, "mixins.capi.json");
        f$i = new Je("UNKNOWN_CONFIG", 7, "unknown");
        Je[] jeArray = new Je[8];
        jeArray[0] = f$a;
        jeArray[1] = f$C;
        jeArray[2] = f$e;
        jeArray[3] = f$I;
        jeArray[4] = f$K;
        jeArray[5] = f$b;
        jeArray[6] = f$j;
        jeArray[7] = f$i;
        f$d = jeArray;
    }


     // WARNING - void declaration

    private Je(String string2, String string2) {
        void var2_-1;
        void var1_-1;
        Je je;
        Je je2 = je;
        je2.f$M = 0;
        je2.f$g = 0;
    }

    public String f$E() {
        Je je;
        return je.f$g;
    }

    public static Je[] values() {
        return (Je[])f$d.clone();
    }
}
*/
